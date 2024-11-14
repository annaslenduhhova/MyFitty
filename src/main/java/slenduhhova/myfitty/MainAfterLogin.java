
package slenduhhova.myfitty;

import java.awt.Color;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import slenduhhova.myfitty.dataaccess.DataAccess;
import slenduhhova.myfitty.dto.Exercici;
import slenduhhova.myfitty.dto.Usuari;
import slenduhhova.myfitty.dto.Workout;

/**
 *
 * @author annas
 */

    class MainAfterLogin extends javax.swing.JPanel {

    private Main main;
    private javax.swing.JList<Usuari> jListShowUsers;
    private javax.swing.JList<Workout> jListShowWorkouts;
    private CreateWorkouts createWorkouts; 
    private ManageExercises manageExercises;
    private CreateExercise createExercise;

    public MainAfterLogin(Main main) {
        this.main=main;
        initComponents(); 
        setSize(800, 600);
        setBackground(new Color(240, 240, 240));
        
        createWorkouts = new CreateWorkouts(this);         
        add(createWorkouts);
        createWorkouts.setVisible(false); 
        
        manageExercises = new ManageExercises(this);
        add(manageExercises);
        manageExercises.setVisible(false);
        
        createExercise = new CreateExercise(this);
        add(createExercise);
        createExercise.setVisible(false);

        int welcomeX = (getWidth() - 306) / 2;   
        jLabelWelcomeNameOfInstructor.setBounds(welcomeX, 30, 306, 37);
         
        jButtonShowListOfUsers.setBounds(80, 90, 145, 27);
        jScrollPaneListUsers.setBounds(60, 140 ,130, 70);
        jScrollPaneListWorkouts.setBounds(210, 140, 55, 70);
        jScrollPaneWorkoutDetails.setBounds(30, 235, 260, 130);
        jButtonCreateWorkout.setBounds(305, 110, 135, 27);
        jButtonManageExercises.setBounds(305, 155, 135, 27);
        createWorkouts.setBounds(455, 85, 295, 440);
        manageExercises.setBounds(455, 85, 295, 440);
        createExercise.setBounds(455, 85, 295, 440);
        jLabelIcon.setBounds(450,95,300,330);  
        jButtonSignOut.setBounds(690, 15, 80, 25);
        
        jListShowUsers = new javax.swing.JList<>();
        jListShowUsers.setLayoutOrientation(javax.swing.JList.VERTICAL_WRAP);
        jScrollPaneListUsers.setViewportView(jListShowUsers);
        jListShowUsers.addListSelectionListener(new javax.swing.event.ListSelectionListener(){
            public void valueChanged(javax.swing.event.ListSelectionEvent evt){
                jListShowUsersValueChanged(evt);
                }  
        });
        
        jListShowWorkouts = new javax.swing.JList <> ();
        jListShowWorkouts.setLayoutOrientation(javax.swing.JList.VERTICAL_WRAP);
        jScrollPaneListWorkouts.setViewportView(jListShowWorkouts);
        jListShowWorkouts.addListSelectionListener(new javax.swing.event.ListSelectionListener(){
            public void valueChanged(javax.swing.event.ListSelectionEvent evt){
                jListShowWorkoutsValueChanged(evt);
                }  
        });       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelWelcomeNameOfInstructor = new javax.swing.JLabel();
        jButtonShowListOfUsers = new javax.swing.JButton();
        jScrollPaneListUsers = new javax.swing.JScrollPane();
        jScrollPaneListWorkouts = new javax.swing.JScrollPane();
        jButtonManageExercises = new javax.swing.JButton();
        jLabelIcon = new javax.swing.JLabel();
        jButtonCreateWorkout = new javax.swing.JButton();
        jButtonSignOut = new javax.swing.JButton();
        jScrollPaneWorkoutDetails = new javax.swing.JScrollPane();
        jTextAreaWorkoutDetails = new javax.swing.JTextArea();

        setOpaque(false);
        setLayout(null);

        jLabelWelcomeNameOfInstructor.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabelWelcomeNameOfInstructor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelWelcomeNameOfInstructor.setToolTipText("");
        jLabelWelcomeNameOfInstructor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabelWelcomeNameOfInstructor);
        jLabelWelcomeNameOfInstructor.setBounds(45, 26, 306, 37);

        jButtonShowListOfUsers.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonShowListOfUsers.setText("Show all users");
        jButtonShowListOfUsers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonShowListOfUsers.setFocusPainted(false);
        jButtonShowListOfUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonShowListOfUsersActionPerformed(evt);
            }
        });
        add(jButtonShowListOfUsers);
        jButtonShowListOfUsers.setBounds(136, 81, 106, 21);
        add(jScrollPaneListUsers);
        jScrollPaneListUsers.setBounds(104, 126, 126, 65);
        add(jScrollPaneListWorkouts);
        jScrollPaneListWorkouts.setBounds(248, 126, 49, 65);

        jButtonManageExercises.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonManageExercises.setText("Manage exercises");
        jButtonManageExercises.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonManageExercises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonManageExercisesActionPerformed(evt);
            }
        });
        add(jButtonManageExercises);
        jButtonManageExercises.setBounds(380, 170, 140, 30);

        jLabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/runners.png"))); // NOI18N
        add(jLabelIcon);
        jLabelIcon.setBounds(480, 50, 330, 360);

        jButtonCreateWorkout.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCreateWorkout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCreateWorkout.setLabel("New workout");
        jButtonCreateWorkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateWorkoutActionPerformed(evt);
            }
        });
        add(jButtonCreateWorkout);
        jButtonCreateWorkout.setBounds(380, 130, 140, 30);

        jButtonSignOut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonSignOut.setText("Sign out");
        jButtonSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSignOutActionPerformed(evt);
            }
        });
        add(jButtonSignOut);
        jButtonSignOut.setBounds(685, 10, 100, 23);

        jTextAreaWorkoutDetails.setColumns(20);
        jTextAreaWorkoutDetails.setRows(5);
        jScrollPaneWorkoutDetails.setViewportView(jTextAreaWorkoutDetails);

        add(jScrollPaneWorkoutDetails);
        jScrollPaneWorkoutDetails.setBounds(70, 260, 240, 110);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonShowListOfUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowListOfUsersActionPerformed
        jButtonShowListOfUsers();
    }//GEN-LAST:event_jButtonShowListOfUsersActionPerformed

    private void jButtonManageExercisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonManageExercisesActionPerformed
        jLabelIcon.setVisible(false);
        createWorkouts.setVisible(false);
        createExercise.setVisible(false);
        manageExercises.setVisible(true);
    }//GEN-LAST:event_jButtonManageExercisesActionPerformed

    private void jButtonCreateWorkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateWorkoutActionPerformed
        jLabelIcon.setVisible(false);
        manageExercises.setVisible(false);
        createExercise.setVisible(false);
        createWorkouts.setVisible(true);
        createWorkouts.fillComboBoxUsers(main.getId());
    }//GEN-LAST:event_jButtonCreateWorkoutActionPerformed

    private void jButtonSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSignOutActionPerformed
        main.setLogOut();
    }//GEN-LAST:event_jButtonSignOutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreateWorkout;
    private javax.swing.JButton jButtonManageExercises;
    private javax.swing.JButton jButtonShowListOfUsers;
    private javax.swing.JButton jButtonSignOut;
    private javax.swing.JLabel jLabelIcon;
    private javax.swing.JLabel jLabelWelcomeNameOfInstructor;
    private javax.swing.JScrollPane jScrollPaneListUsers;
    private javax.swing.JScrollPane jScrollPaneListWorkouts;
    private javax.swing.JScrollPane jScrollPaneWorkoutDetails;
    private javax.swing.JTextArea jTextAreaWorkoutDetails;
    // End of variables declaration//GEN-END:variables

    private void jListShowUsersValueChanged(javax.swing.event.ListSelectionEvent evt){
        
        Usuari selectedUsuari = jListShowUsers.getSelectedValue();
        ArrayList <Workout> workouts = DataAccess.getWorkoutsPerUser(selectedUsuari);        
        DefaultListModel <Workout> model = new DefaultListModel<>();
        for (Workout workout : workouts) {
            model.addElement(workout);
        }       
        jListShowWorkouts.setModel(model);              
    }
    
    private void jListShowWorkoutsValueChanged(javax.swing.event.ListSelectionEvent evt){
        
        Workout selectedWorkout = jListShowWorkouts.getSelectedValue();
        ArrayList <Exercici> exercicis = DataAccess.getExercicisPerWorkout(selectedWorkout); 
        
        StringBuilder exercicisText = new StringBuilder();
        for (Exercici exercici : exercicis) {
            exercicisText.append(exercici.toString()).append("\n");
        }
        LocalDateTime localDateTime = LocalDateTime.parse(selectedWorkout.getForDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSSS"));
        DateTimeFormatter displayFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = localDateTime.format(displayFormatter);
        jTextAreaWorkoutDetails.setText("Fecha de workout: " + formattedDate + "\n" + "Comentarios de workout: " + selectedWorkout.getComments() + "\n" + exercicisText);
                   
        }

    private void jButtonShowListOfUsers (){
        
        ArrayList<Usuari> usuaris = DataAccess.getAllUsersByInstructor(main.getId());
        DefaultListModel <Usuari> model = new DefaultListModel<>();
        for (Usuari usuari : usuaris) {
            model.addElement(usuari);
        }
        jListShowUsers.setModel(model);                 
    }   
    
    public void goBackToManageExercises(){
        createExercise.setVisible(false);
        manageExercises.setVisible(true);
    }
    
    public void createWorkout(){
        createWorkouts.setVisible(false);
        jLabelIcon.setVisible(true);
    }
    
    public void createExercise(){
        manageExercises.setVisible(false);
        createExercise.setVisible(true);   
    }
    
    public javax.swing.JLabel getjLabelWelcomeNameOfInstructor() {
        return jLabelWelcomeNameOfInstructor;
    }

    public void setjLabelWelcomeNameOfInstructor(javax.swing.JLabel jLabelWelcomeNameOfInstructor) {
        this.jLabelWelcomeNameOfInstructor = jLabelWelcomeNameOfInstructor;
    }
 
}
