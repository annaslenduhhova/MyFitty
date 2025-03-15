
package slenduhhova.myfitty.dataaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import slenduhhova.myfitty.dto.Exercici;
import slenduhhova.myfitty.dto.Usuari;
import slenduhhova.myfitty.dto.Workout;

/**
 *
 * @author anna
 */

    public class DataAccess {

    private static Connection getConnection() {
        Connection connection = null;
        Properties properties = new Properties();
        try {
            properties.load(DataAccess.class.getClassLoader().getResourceAsStream("properties/application.properties"));
            String connectionUrl = properties.getProperty("connectionUrl");
            System.out.println("Connecting to: " + connectionUrl);

            connection = DriverManager.getConnection(connectionUrl);
        }catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static Usuari getUser(String email) {
        Usuari user = null;
        String sql = "SELECT * FROM Usuaris WHERE Email = ?";
        try (Connection connection = getConnection(); 
            PreparedStatement selectStatement = connection.prepareStatement(sql);) {
            selectStatement.setString(1, email);
            ResultSet resultSet = selectStatement.executeQuery();
            user = new Usuari();
            while (resultSet.next()) {
                user.setId(resultSet.getInt("Id"));
                user.setNom(resultSet.getString("Nom"));
                user.setEmail(resultSet.getString("Email"));
                user.setPasswordHash(resultSet.getString("PasswordHash"));
                user.setInstructor(resultSet.getBoolean("Instructor"));              
            }
            selectStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public static ArrayList<Usuari> getAllUsers() {
        ArrayList<Usuari> usuaris = new ArrayList<>();
        String sql = "SELECT * FROM Usuaris WHERE Instructor=0";
        try (
            Connection connection = getConnection(); 
            PreparedStatement selectStatement = connection.prepareStatement(sql);) {

            ResultSet resultSet = selectStatement.executeQuery();

            while (resultSet.next()) {
                Usuari user = new Usuari();
                user.setId(resultSet.getInt("Id"));
                user.setNom(resultSet.getString("Nom"));
                user.setEmail(resultSet.getString("Email"));
                user.setPasswordHash(resultSet.getString("PasswordHash"));
                user.setFoto(resultSet.getBytes("Foto"));
                user.setFotoFilename(resultSet.getString("FotoFilename"));
                user.setInstructor(resultSet.getBoolean("Instructor"));
                user.setAssignedInstructor(resultSet.getInt("AssignedInstructor"));
                usuaris.add(user);
            }
            selectStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuaris;
    }

    public static ArrayList<Usuari> getAllUsersByInstructor(int idInstructor) {
        ArrayList<Usuari> usuaris = new ArrayList<>();
        String sql = "SELECT * FROM Usuaris WHERE AssignedInstructor=?";
        try (Connection connection = getConnection(); 
            PreparedStatement selectStatement = connection.prepareStatement(sql);) {
            selectStatement.setInt(1, idInstructor);
            ResultSet resultSet = selectStatement.executeQuery();

            while (resultSet.next()) {
                Usuari user = new Usuari();
                user.setId(resultSet.getInt("Id"));
                user.setNom(resultSet.getString("Nom"));
                user.setEmail(resultSet.getString("Email"));
                user.setPasswordHash(resultSet.getString("PasswordHash"));
                user.setInstructor(resultSet.getBoolean("Instructor"));
                user.setAssignedInstructor(resultSet.getInt("AssignedInstructor"));
                usuaris.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return usuaris;
    }

    public static ArrayList<Workout> getWorkoutsPerUser(Usuari user) {
        ArrayList<Workout> workouts = new ArrayList<>();
        String sql = "SELECT Workouts.Id, Workouts.ForDate, Workouts.UserId, Workouts.Comments"
                + " FROM Workouts"
                + " WHERE Workouts.UserId=?"
                + " ORDER BY Workouts.ForDate";
        try (Connection connection = getConnection(); 
            PreparedStatement selectStatement = connection.prepareStatement(sql);) {
            selectStatement.setInt(1, user.getId());
            ResultSet resultSet = selectStatement.executeQuery();

            while (resultSet.next()) {
                Workout workout = new Workout();
                workout.setId(resultSet.getInt("Id"));
                workout.setForDate(resultSet.getString("ForDate"));
                workout.setUserId(resultSet.getInt("UserId"));
                workout.setComments(resultSet.getString("Comments"));             

                workouts.add(workout);
            }
            selectStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }        
        return workouts;

    }

    public static ArrayList<Exercici> getExercicisPerWorkout(Workout workout) {
        ArrayList<Exercici> exercicis = new ArrayList<>();
        String sql = "SELECT ExercicisWorkouts.IdExercici,"
                + " Exercicis.NomExercici, Exercicis.Descripcio, Exercicis.DemoFoto"
                + " FROM ExercicisWorkouts INNER JOIN Exercicis ON ExercicisWorkouts.IdExercici=Exercicis.Id"
                + " WHERE ExercicisWorkouts.IdWorkout=?";
        try (Connection connection = getConnection(); 
            PreparedStatement selectStatement = connection.prepareStatement(sql);) {
            selectStatement.setInt(1, workout.getId());
            ResultSet resultSet = selectStatement.executeQuery();

            while (resultSet.next()) {
                Exercici exercici = new Exercici();
                exercici.setId(resultSet.getInt("IdExercici"));
                exercici.setNomExercici(resultSet.getString("NomExercici"));
                exercici.setDescripcio(resultSet.getString("Descripcio"));
                exercici.setDemoFoto(resultSet.getString("DemoFoto"));

                exercicis.add(exercici);
            }
            selectStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return exercicis;
    }

    public static ArrayList<Exercici> getAllExercicis() {
        ArrayList<Exercici> exercicis = new ArrayList<>();
        String sql = "SELECT Exercicis.Id, Exercicis.NomExercici, Exercicis.Descripcio, Exercicis.DemoFoto"
                + " FROM Exercicis";
        try (Connection connection = getConnection(); 
            PreparedStatement selectStatement = connection.prepareStatement(sql);) {

            ResultSet resultSet = selectStatement.executeQuery();

            while (resultSet.next()) {
                Exercici exercici = new Exercici();
                exercici.setId(resultSet.getInt("Id"));
                exercici.setNomExercici(resultSet.getString("NomExercici"));
                exercici.setDescripcio(resultSet.getString("Descripcio"));
                exercici.setDemoFoto(resultSet.getString("DemoFoto"));

                exercicis.add(exercici);
            }
            selectStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return exercicis;
    }

    public static int registerUser(Usuari u) {
        String sql = "INSERT INTO dbo.Usuaris (Nom, Email, PasswordHash, Instructor)"
                + " VALUES (?,?,?,?)"
                + " SELECT CAST(SCOPE_IDENTITY() as int)";
        try (Connection conn = getConnection(); 
            PreparedStatement insertStatement = conn.prepareStatement(sql)) {
            
            insertStatement.setString(1, u.getNom());
            insertStatement.setString(2, u.getEmail());
            insertStatement.setString(3, u.getPasswordHash());
            insertStatement.setBoolean(4, u.isInstructor());

           ResultSet rs = insertStatement.executeQuery();

            if (rs.next()) {
                int newUserId = rs.getInt(1);  
                return newUserId;
            }
            
            insertStatement.close();
            conn.close();                    
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static void insertWorkout(Workout w, ArrayList<Exercici> exercicis) {
        // The following should be done in a SQL transaction
        int newWorkoutId = insertToWorkoutTable(w);
        insertExercisesPerWorkout(newWorkoutId, exercicis);
    }

    private static int insertToWorkoutTable(Workout w) {
        String sql = "INSERT INTO dbo.Workouts (ForDate, UserId, Comments)"
                + " VALUES (?,?,?)";
        try (Connection conn = getConnection();
                PreparedStatement insertStatement = conn.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
                ) {
            insertStatement.setString(1, w.getForDate());
            insertStatement.setInt(2, w.getUserId());
            insertStatement.setString(3, w.getComments());

            int affectedRows = insertStatement.executeUpdate();
            
            if (affectedRows > 0) {
                // Retrieve the generated keys (identity value)
                ResultSet resultSet = insertStatement.getGeneratedKeys();

                // Check if a key was generated
                if (resultSet.next()) {
                    // Get the last inserted identity value
                    int lastInsertedId = resultSet.getInt(1);
                    return lastInsertedId;
                }
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

    private static int insertExercisesPerWorkout(int wId, ArrayList<Exercici> exercicis) {
        for(Exercici e: exercicis) {
            int rowsAffected = insertExerciciPerWorkout(wId, e);
            if (rowsAffected != 1) {
                return 0;
            }
        }
        return exercicis.size();
    }

    private static int insertExerciciPerWorkout(int wId, Exercici e) {
        String sql = "INSERT INTO dbo.ExercicisWorkouts (IdWorkout, IdExercici)"
                + " VALUES (?,?)";
        try (Connection conn = getConnection(); PreparedStatement insertStatement = conn.prepareStatement(sql)) {
            insertStatement.setInt(1, wId);
            insertStatement.setInt(2, e.getId());
            int rowsAffected = insertStatement.executeUpdate();
            return rowsAffected;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return 0;
    }
    
    public static boolean updateExerciciNom(int id, String nuevoNombre) {
        String sql = "UPDATE Exercicis SET NomExercici = ? WHERE Id = ?";
        try (Connection connection = getConnection(); 
             PreparedStatement updateStatement = connection.prepareStatement(sql)) {

            updateStatement.setString(1, nuevoNombre);
            updateStatement.setInt(2, id);

            int rowsUpdated = updateStatement.executeUpdate();
            return rowsUpdated > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    } 
    
    public static boolean updateExerciciDescripcio(int id, String nuevaDescripcion) {
        String sql = "UPDATE Exercicis SET Descripcio = ? WHERE Id = ?";
        try (Connection connection = getConnection(); 
             PreparedStatement updateStatement = connection.prepareStatement(sql)) {

            updateStatement.setString(1, nuevaDescripcion);
            updateStatement.setInt(2, id);

            int rowsUpdated = updateStatement.executeUpdate();
            return rowsUpdated > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static boolean updateExerciciFoto(int id, String nuevaFoto) {
        String sql = "UPDATE Exercicis SET DemoFoto = ? WHERE Id = ?";
        try (Connection connection = getConnection(); 
             PreparedStatement updateStatement = connection.prepareStatement(sql)) {

            updateStatement.setString(1, nuevaFoto);
            updateStatement.setInt(2, id);

            int rowsUpdated = updateStatement.executeUpdate();
            return rowsUpdated > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public static boolean deleteExercici(int exerciciId) {
        if (isExerciciAssignedToWorkout(exerciciId)) { 
            return false;  
        }       
    
        boolean relacionesEliminadas = deleteExerciciFromWorkouts(exerciciId);

        if (relacionesEliminadas) {
            boolean ejercicioEliminado = deleteFromExercici(exerciciId);
            return ejercicioEliminado;
        }
        return false;
    }
    
    private static boolean deleteExerciciFromWorkouts(int exerciciId) {
        String sqlCheck = "SELECT COUNT(*) FROM dbo.ExercicisWorkouts WHERE IdExercici = ?";
        String sqlDelete = "DELETE FROM dbo.ExercicisWorkouts WHERE IdExercici = ?";

        try (Connection conn = getConnection(); 
            PreparedStatement checkStatement = conn.prepareStatement(sqlCheck);
            PreparedStatement deleteStatement = conn.prepareStatement(sqlDelete)) {

            checkStatement.setInt(1, exerciciId);
            ResultSet resultSet = checkStatement.executeQuery();
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                if (count == 0) {
                    return true; 
                }
            }

        deleteStatement.setInt(1, exerciciId);
        int rowsAffected = deleteStatement.executeUpdate();
        return rowsAffected > 0; 
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false; 
    }
    
    private static boolean deleteFromExercici(int exerciciId) {
        String sql = "DELETE FROM dbo.Exercicis WHERE Id = ?";
        try (Connection conn = getConnection(); PreparedStatement deleteStatement = conn.prepareStatement(sql)) {
            deleteStatement.setInt(1, exerciciId);
            int rowsAffected = deleteStatement.executeUpdate();
            return rowsAffected > 0;  
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false; 
    }
    
    private static boolean isExerciciAssignedToWorkout(int exerciciId) {
        String sql = "SELECT COUNT(*) FROM dbo.ExercicisWorkouts WHERE IdExercici = ?";
        try (Connection conn = getConnection(); PreparedStatement checkStatement = conn.prepareStatement(sql)) {
            checkStatement.setInt(1, exerciciId);
            ResultSet resultSet = checkStatement.executeQuery();
            if (resultSet.next()) {
                int count = resultSet.getInt(1);
                return count > 0;  
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;  
    }
    
    public static int addNewExercise(Exercici e){      
        String sql = "INSERT INTO dbo.Exercicis (NomExercici, Descripcio, DemoFoto)"
                + " VALUES (?,?,?)"
                + " SELECT CAST(SCOPE_IDENTITY() as int)";
        try (Connection conn = getConnection(); 
            PreparedStatement insertStatement = conn.prepareStatement(sql)) {
            insertStatement.setString(1, e.getNomExercici());
            insertStatement.setString(2, e.getDescripcio());
            insertStatement.setString(3, e.getDemoFoto());

            ResultSet rs = insertStatement.executeQuery();

            if (rs.next()) {
                int newExerciciId = rs.getInt(1);  
                return newExerciciId;
            }
            
        } catch (SQLException s) {
            s.printStackTrace();
        }
        return 0;
    }   
}