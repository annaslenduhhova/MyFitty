package slenduhhova.myfitty;

import java.awt.Color;
import java.util.List;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.ListSelectionModel;
import javax.swing.SpinnerDateModel;
import slenduhhova.myfitty.dataaccess.DataAccess;
import slenduhhova.myfitty.dto.Exercici;
import slenduhhova.myfitty.dto.Usuari;
import slenduhhova.myfitty.dto.Workout;

/**
 *
 * @author annas
 */

    class CreateWorkouts extends javax.swing.JPanel {
     
    private MainAfterLogin mainAfterLogin;
    private JList<Integer> jListExercises;
    private ArrayList<Exercici> exercicis;
    private JComboBox<Usuari> jComboBoxShowAllUsers;
   
    public CreateWorkouts(MainAfterLogin mainAfterLogin) {
        this.mainAfterLogin = mainAfterLogin;
        initComponents();        
        setSize(300, 440);
        setBackground(new Color(240, 240, 240));
        
        jListExercises = new JList<>();
        jListExercises.setLayoutOrientation(JList.VERTICAL_WRAP);
        jListExercises.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);       
        jScrollPaneExcercises.setViewportView(jListExercises);
        
        jComboBoxShowAllUsers = new JComboBox<>();
        jScrollPaneUserName.setViewportView(jComboBoxShowAllUsers);
        
        setSpinnerDate();            
        fillListExcercises();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelUser = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jLabelExcercises = new javax.swing.JLabel();
        jScrollPaneExcercises = new javax.swing.JScrollPane();
        jScrollPaneComments = new javax.swing.JScrollPane();
        jTextAreaComments = new javax.swing.JTextArea();
        jButtonCreateWorkout = new javax.swing.JButton();
        jScrollPaneUserName = new javax.swing.JScrollPane();
        jSpinnerDate = new javax.swing.JSpinner();

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelUser.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelUser.setText("User ID:");
        jLabelUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabelName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelName.setText("Comments:");
        jLabelName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabelDate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelDate.setText("Date:");
        jLabelDate.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabelExcercises.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelExcercises.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelExcercises.setText("Exercises:");
        jLabelExcercises.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jScrollPaneExcercises.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextAreaComments.setColumns(20);
        jTextAreaComments.setRows(5);
        jScrollPaneComments.setViewportView(jTextAreaComments);

        jButtonCreateWorkout.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButtonCreateWorkout.setText("Create");
        jButtonCreateWorkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateWorkoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelExcercises, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPaneExcercises, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPaneComments, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPaneUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSpinnerDate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jButtonCreateWorkout, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelDate, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jSpinnerDate))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelUser, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jScrollPaneUserName))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPaneComments, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabelExcercises, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPaneExcercises, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jButtonCreateWorkout)
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCreateWorkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateWorkoutActionPerformed
        try{
            insertWorkout();       
            JOptionPane.showMessageDialog(null, "New workout is added successfully!", "Workout", JOptionPane.PLAIN_MESSAGE);
            mainAfterLogin.createWorkout();
        }catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null, "The date format is incorrect.", "Date Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An unexpected error occurred. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }//GEN-LAST:event_jButtonCreateWorkoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreateWorkout;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelExcercises;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JScrollPane jScrollPaneComments;
    private javax.swing.JScrollPane jScrollPaneExcercises;
    private javax.swing.JScrollPane jScrollPaneUserName;
    private javax.swing.JSpinner jSpinnerDate;
    private javax.swing.JTextArea jTextAreaComments;
    // End of variables declaration//GEN-END:variables


    private Workout createWorkout(){

        String date = formatDate();
        Usuari selectedUser = (Usuari) jComboBoxShowAllUsers.getSelectedItem();
        int idUser = selectedUser.getId();
        String comments = jTextAreaComments.getText();
        
        Workout workout = new Workout();
        workout.setForDate(date);
        workout.setUserId(idUser);
        workout.setComments(comments);
        
        return workout;
    }

    private String formatDate(){

        Date selectedDate = (Date) jSpinnerDate.getValue();
        LocalDateTime localDateTime = selectedDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        DateTimeFormatter sqlFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSSS");
        String formattedDateForSQL = localDateTime.format(sqlFormatter);

        return formattedDateForSQL;
    } 
    
    public void fillComboBoxUsers(int id){
        
        ArrayList<Usuari> usuaris = DataAccess.getAllUsersByInstructor(id);       
        for (Usuari usuari : usuaris) {
            jComboBoxShowAllUsers.addItem(usuari);
        }                
    }
    
    private void fillListExcercises(){
        
        exercicis = DataAccess.getAllExercicis();        
        DefaultListModel<Integer> model = new DefaultListModel<>();
        for (Exercici exercici : exercicis) {
            model.addElement(exercici.getId());
        }
        
        jListExercises.setModel(model);         
    }
    
    private void setSpinnerDate(){
        
        jSpinnerDate.setModel(new SpinnerDateModel());
        JSpinner.DateEditor dateEditor = new JSpinner.DateEditor(jSpinnerDate, "dd/MM/yyyy");
        jSpinnerDate.setEditor(dateEditor); 
    }
    
    private void insertWorkout(){    
              
        ArrayList<Exercici> selectedExercises = new ArrayList<>();   
        List<Integer> selectedIds = jListExercises.getSelectedValuesList();
    
        for (Exercici exercici : exercicis) {
            if (selectedIds.contains(exercici.getId())) {
                selectedExercises.add(exercici);
            }
        }    
        DataAccess.insertWorkout(createWorkout(), selectedExercises);      
    }
}