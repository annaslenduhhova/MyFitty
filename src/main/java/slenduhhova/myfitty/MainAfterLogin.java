
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

public class MainAfterLogin extends javax.swing.JPanel {

    private Main main;
    private javax.swing.JList<Usuari> jListShowUsers;
    private javax.swing.JList<Workout> jListShowWorkouts;
    private CreateWorkouts createWorkouts;
    
    public MainAfterLogin(Main main) {
        this.main=main;
        initComponents(); 
        setSize(800, 600);
        setBackground(new Color(240, 240, 240));
        createWorkouts = new CreateWorkouts();        
        add(createWorkouts);
        createWorkouts.setVisible(false);

        int welcomeX = (getWidth() - 306) / 2;   
        jLabelWelcomeNameOfInstructor.setBounds(welcomeX, 30, 306, 37);
         
        jButtonShowListOfUsers.setBounds(80, 90, 145, 27);
        jScrollPaneListUsers.setBounds(60, 133 ,130, 70);
        jScrollPaneListWorkouts.setBounds(210, 135, 55, 70);
        jScrollPaneWorkouts.setBounds(30, 235, 260, 170);
        jButtonCreateWorkout.setBounds(305, 115, 127, 27);
        createWorkouts.setBounds(450, 90, 300, 450);
        jLabelIcon.setBounds(450,95,300,330);
        
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
        jScrollPaneWorkouts = new javax.swing.JScrollPane();
        jTextAreaWorkoutDetails = new javax.swing.JTextArea();
        jButtonCreateWorkout = new javax.swing.JButton();
        jLabelIcon = new javax.swing.JLabel();

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

        jTextAreaWorkoutDetails.setColumns(20);
        jTextAreaWorkoutDetails.setRows(5);
        jScrollPaneWorkouts.setViewportView(jTextAreaWorkoutDetails);

        add(jScrollPaneWorkouts);
        jScrollPaneWorkouts.setBounds(45, 209, 295, 96);

        jButtonCreateWorkout.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCreateWorkout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCreateWorkout.setLabel("New workout");
        jButtonCreateWorkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateWorkoutActionPerformed(evt);
            }
        });
        add(jButtonCreateWorkout);
        jButtonCreateWorkout.setBounds(380, 130, 140, 21);

        jLabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/runners-304972_640.png"))); // NOI18N
        add(jLabelIcon);
        jLabelIcon.setBounds(480, 50, 330, 360);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonShowListOfUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonShowListOfUsersActionPerformed
        jButtonShowListOfUsers();
    }//GEN-LAST:event_jButtonShowListOfUsersActionPerformed

    private void jButtonCreateWorkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateWorkoutActionPerformed
        jLabelIcon.setVisible(false);
        createWorkouts.setVisible(true);
    }//GEN-LAST:event_jButtonCreateWorkoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreateWorkout;
    private javax.swing.JButton jButtonShowListOfUsers;
    private javax.swing.JLabel jLabelIcon;
    private javax.swing.JLabel jLabelWelcomeNameOfInstructor;
    private javax.swing.JScrollPane jScrollPaneListUsers;
    private javax.swing.JScrollPane jScrollPaneListWorkouts;
    private javax.swing.JScrollPane jScrollPaneWorkouts;
    private javax.swing.JTextArea jTextAreaWorkoutDetails;
    // End of variables declaration//GEN-END:variables

    private void jListShowUsersValueChanged(javax.swing.event.ListSelectionEvent evt){
        Usuari selectedUsuari = jListShowUsers.getSelectedValue();
        DataAccess da = new DataAccess();
        ArrayList <Workout> workouts = da.getWorkoutsPerUser(selectedUsuari);        
        DefaultListModel <Workout> model = new DefaultListModel<>();
        for (Workout workout : workouts) {
            model.addElement(workout);
        }       
        jListShowWorkouts.setModel(model);              
    }
    
    private void jListShowWorkoutsValueChanged(javax.swing.event.ListSelectionEvent evt){
        Workout selectedWorkout = jListShowWorkouts.getSelectedValue();
        DataAccess da = new DataAccess();
        ArrayList <Exercici> exercicis = da.getExercicisPerWorkout(selectedWorkout); 
        
        StringBuilder exercicisText = new StringBuilder();
        for (Exercici exercici : exercicis) {
            exercicisText.append(exercici.toString()).append("\n");
        }
        LocalDateTime localDateTime = LocalDateTime.parse(selectedWorkout.getForDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSSS"));
        DateTimeFormatter displayFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String formattedDate = localDateTime.format(displayFormatter);
        jTextAreaWorkoutDetails.setText(exercicisText + "Fecha de workout: " + formattedDate + "\n" + "Comentarios de workout: " + selectedWorkout.getComments());
                   
        }

    private void jButtonShowListOfUsers (){
        DataAccess da = new DataAccess();
        ArrayList<Usuari> usuaris = da.getAllUsersByInstructor(main.getLogin().idLoggedInstructor);        
        DefaultListModel <Usuari> model = new DefaultListModel<>();
        for (Usuari usuari : usuaris) {
            model.addElement(usuari);
        }
        jListShowUsers.setModel(model);                 
    }   
    
    public javax.swing.JLabel getjLabelWelcomeNameOfInstructor() {
        return jLabelWelcomeNameOfInstructor;
    }

    public void setjLabelWelcomeNameOfInstructor(javax.swing.JLabel jLabelWelcomeNameOfInstructor) {
        this.jLabelWelcomeNameOfInstructor = jLabelWelcomeNameOfInstructor;
    }
}
