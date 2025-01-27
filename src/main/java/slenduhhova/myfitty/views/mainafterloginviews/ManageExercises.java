
package slenduhhova.myfitty;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import slenduhhova.myfitty.dataaccess.DataAccess;
import slenduhhova.myfitty.dto.Exercici;

/**
 *
 * @author annas
 */

    class ManageExercises extends javax.swing.JPanel {

    private MainAfterLogin mainAfterLogin;
    private JComboBox <Exercici> jComboBoxShowAllExercises;
    
    public ManageExercises(MainAfterLogin mainAfterLogin) {
        this.mainAfterLogin = mainAfterLogin;
        initComponents();        
        setSize(300, 440);
        setBackground(new Color(240, 240, 240));
               
        jComboBoxShowAllExercises = new JComboBox <>();
        jScrollPaneShowAllExercises.setViewportView(jComboBoxShowAllExercises);       
        showAllExercises();              
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPaneShowAllExercises = new javax.swing.JScrollPane();
        jButtonModifyName = new javax.swing.JButton();
        jButtonModifyDescription = new javax.swing.JButton();
        jButtonModifyFoto = new javax.swing.JButton();
        jLabelTextAfterModifying = new javax.swing.JLabel();
        jLabelApply = new javax.swing.JLabel();
        jLabelNewValue = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldDescription = new javax.swing.JTextField();
        jTextFieldFoto = new javax.swing.JTextField();
        jButtonCreateNewExercise = new javax.swing.JButton();
        jButtonDeleteExercise = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButtonModifyName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonModifyName.setText("Name");
        jButtonModifyName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifyNameActionPerformed(evt);
            }
        });

        jButtonModifyDescription.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonModifyDescription.setText("Description");
        jButtonModifyDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifyDescriptionActionPerformed(evt);
            }
        });

        jButtonModifyFoto.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonModifyFoto.setText("Foto");
        jButtonModifyFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModifyFotoActionPerformed(evt);
            }
        });

        jLabelTextAfterModifying.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelTextAfterModifying.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTextAfterModifying.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabelApply.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelApply.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelApply.setText("Apply to modify:");

        jLabelNewValue.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelNewValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNewValue.setText("New value:");

        jButtonCreateNewExercise.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonCreateNewExercise.setText("Create new exercise");
        jButtonCreateNewExercise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateNewExerciseActionPerformed(evt);
            }
        });

        jButtonDeleteExercise.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonDeleteExercise.setText("Delete exercise");
        jButtonDeleteExercise.setActionCommand("Delete exercise");
        jButtonDeleteExercise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteExerciseActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Choose exercise:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabelNewValue, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addComponent(jLabelApply, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldName)
                                    .addComponent(jTextFieldDescription)
                                    .addComponent(jTextFieldFoto))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonModifyFoto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonModifyName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonModifyDescription, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(jLabelTextAfterModifying, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonCreateNewExercise)
                            .addComponent(jButtonDeleteExercise, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPaneShowAllExercises, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(92, 92, 92)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneShowAllExercises, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApply)
                    .addComponent(jLabelNewValue))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonModifyName)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonModifyDescription)
                    .addComponent(jTextFieldDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonModifyFoto))
                .addGap(18, 18, 18)
                .addComponent(jLabelTextAfterModifying, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jButtonDeleteExercise)
                .addGap(18, 18, 18)
                .addComponent(jButtonCreateNewExercise)
                .addContainerGap(78, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonModifyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifyNameActionPerformed
        modifyName();       
    }//GEN-LAST:event_jButtonModifyNameActionPerformed

    private void jButtonModifyDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifyDescriptionActionPerformed
        modifyDescription();
    }//GEN-LAST:event_jButtonModifyDescriptionActionPerformed

    private void jButtonModifyFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifyFotoActionPerformed
        modifyFoto();
    }//GEN-LAST:event_jButtonModifyFotoActionPerformed

    private void jButtonDeleteExerciseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteExerciseActionPerformed
        deleteExercise();
    }//GEN-LAST:event_jButtonDeleteExerciseActionPerformed

    private void jButtonCreateNewExerciseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateNewExerciseActionPerformed
        mainAfterLogin.createExercise();
    }//GEN-LAST:event_jButtonCreateNewExerciseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreateNewExercise;
    private javax.swing.JButton jButtonDeleteExercise;
    private javax.swing.JButton jButtonModifyDescription;
    private javax.swing.JButton jButtonModifyFoto;
    private javax.swing.JButton jButtonModifyName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelApply;
    private javax.swing.JLabel jLabelNewValue;
    private javax.swing.JLabel jLabelTextAfterModifying;
    private javax.swing.JScrollPane jScrollPaneShowAllExercises;
    private javax.swing.JTextField jTextFieldDescription;
    private javax.swing.JTextField jTextFieldFoto;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables

    private void showAllExercises(){
        
        ArrayList<Exercici> exercicis = DataAccess.getAllExercicis();       
        for (Exercici exercici : exercicis) {
            jComboBoxShowAllExercises.addItem(exercici);
        }                
    }
    
    private void modifyName(){
        
        Exercici exercise = (Exercici) jComboBoxShowAllExercises.getSelectedItem();
        int id = exercise.getId();
 
        String newName = jTextFieldName.getText();
        exercise.setNomExercici(newName);
        boolean actualizado = DataAccess.updateExerciciNom(id, newName);
        if(actualizado){
            jLabelTextAfterModifying.setText("Updated exercise: " + exercise);
        }else{
            JOptionPane.showMessageDialog(null, "Error updating the exercise name.", "Error", JOptionPane.ERROR_MESSAGE);     
        }    
    }
    
    private void modifyDescription(){
        
        Exercici exercise = (Exercici) jComboBoxShowAllExercises.getSelectedItem();
        int id = exercise.getId();
 
        String newDescription = jTextFieldDescription.getText();
        exercise.setDescripcio(newDescription);
        boolean actualizado = DataAccess.updateExerciciDescripcio(id, newDescription);
        if(actualizado){
            jLabelTextAfterModifying.setText("Updated exercise: " + exercise);
        }else{
            JOptionPane.showMessageDialog(null, "Error updating the exercise description.", "Error", JOptionPane.ERROR_MESSAGE);     
        }    
    }
    
    private void modifyFoto(){
        
        Exercici exercise = (Exercici) jComboBoxShowAllExercises.getSelectedItem();
        int id = exercise.getId();
 
        String newFoto = jTextFieldFoto.getText();
        exercise.setDemoFoto(newFoto);
        boolean actualizado = DataAccess.updateExerciciFoto(id, newFoto);
        if(actualizado){
            jLabelTextAfterModifying.setText("Updated exercise: " + exercise);
        }else{
            JOptionPane.showMessageDialog(null, "Error updating the exercise photo.", "Error", JOptionPane.ERROR_MESSAGE);     
        }    
    }
    
    private void deleteExercise(){
        
        Exercici exercise = (Exercici) jComboBoxShowAllExercises.getSelectedItem();
        int id = exercise.getId();
    
        boolean eliminado = DataAccess.deleteExercici(id);
        if (eliminado) {
            JOptionPane.showMessageDialog(null, "Exercise has been deleted correctly.", "Exercise", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Exercise cannot be deleted because it is assigned to the workout.", "Exercise", JOptionPane.ERROR_MESSAGE);
        }
    }
}
