package slenduhhova.myfitty.views.mainafterloginviews;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import slenduhhova.myfitty.dataaccess.DataAccess;
import slenduhhova.myfitty.dto.Exercici;
import slenduhhova.myfitty.views.mainviews.MainAfterLogin;

/**
 * JPanel que permite la gestión de ejercicios. Este panel permite al usuario
 * seleccionar un ejercicio de una lista y modificar su nombre, descripción o
 * foto. Además, permite eliminar ejercicios de la base de datos.
 *
 * El panel incluye una lista de ejercicios, un combo box para seleccionar un
 * ejercicio, botones para modificar los atributos del ejercicio seleccionado
 * (nombre, descripción, foto) y un botón para eliminar el ejercicio.
 *
 * @author annas
 */
public class ManageExercises extends javax.swing.JPanel {

    private MainAfterLogin mainAfterLogin;
    private JComboBox<Exercici> jComboBoxShowAllExercises;

    /**
     * Constructor que inicializa el panel y configura los componentes de la
     * interfaz. Este constructor también rellena el combo box con todos los
     * ejercicios disponibles.
     *
     * @param mainAfterLogin El marco principal después del inicio de sesión,
     * pasado para gestionar las acciones posteriores al inicio de sesión.
     */
    public ManageExercises(MainAfterLogin mainAfterLogin) {
        this.mainAfterLogin = mainAfterLogin;
        initComponents();
        setSize(300, 440);
        setBackground(new Color(240, 240, 240));

        jComboBoxShowAllExercises = new JComboBox<>();
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
        jLabelApply = new javax.swing.JLabel();
        jLabelNewValue = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldDescription = new javax.swing.JTextField();
        jTextFieldFoto = new javax.swing.JTextField();
        jButtonDeleteExercise = new javax.swing.JButton();
        jLabelChooseExercise = new javax.swing.JLabel();
        jLabelModifyExercise = new javax.swing.JLabel();

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
        jButtonModifyDescription.setMaximumSize(new java.awt.Dimension(72, 23));
        jButtonModifyDescription.setMinimumSize(new java.awt.Dimension(72, 23));
        jButtonModifyDescription.setPreferredSize(new java.awt.Dimension(72, 23));
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

        jLabelApply.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelApply.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelApply.setText("Press to modify:");

        jLabelNewValue.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelNewValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNewValue.setText("New value:");

        jButtonDeleteExercise.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonDeleteExercise.setText("Delete chosen exercise");
        jButtonDeleteExercise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeleteExerciseActionPerformed(evt);
            }
        });

        jLabelChooseExercise.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelChooseExercise.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelChooseExercise.setText("Choose exercise:");

        jLabelModifyExercise.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelModifyExercise.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelModifyExercise.setText("Modify chosen exercise");
        jLabelModifyExercise.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(34, 34, 34)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPaneShowAllExercises, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                .addComponent(jButtonDeleteExercise, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap(26, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextFieldDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextFieldName, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                            .addComponent(jTextFieldFoto)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jButtonModifyName, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                                            .addComponent(jButtonModifyFoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addComponent(jButtonModifyDescription, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabelNewValue, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(31, 31, 31)
                                    .addComponent(jLabelApply, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabelChooseExercise, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabelModifyExercise)))
                .addContainerGap(293, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabelChooseExercise)
                .addGap(18, 18, 18)
                .addComponent(jScrollPaneShowAllExercises, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButtonDeleteExercise, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jLabelModifyExercise)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelApply)
                    .addComponent(jLabelNewValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldName)
                    .addComponent(jButtonModifyName, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonModifyDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonModifyFoto, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jTextFieldFoto))
                .addGap(37, 37, 37))
        );
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Acción que se ejecuta cuando se hace clic en el botón "Modificar nombre".
     * Llama al método `modifyName()`.
     *
     * @param evt El evento de acción generado por el clic del usuario.
     */
    private void jButtonModifyNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifyNameActionPerformed
        modifyName();
    }//GEN-LAST:event_jButtonModifyNameActionPerformed

    /**
     * Acción que se ejecuta cuando se hace clic en el botón "Modificar
     * descripción". Llama al método `modifyDescription()`.
     *
     * @param evt El evento de acción generado por el clic del usuario.
     */
    private void jButtonModifyDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifyDescriptionActionPerformed
        modifyDescription();
    }//GEN-LAST:event_jButtonModifyDescriptionActionPerformed

    /**
     * Acción que se ejecuta cuando se hace clic en el botón "Modificar foto".
     * Llama al método `modifyFoto()`.
     *
     * @param evt El evento de acción generado por el clic del usuario.
     */
    private void jButtonModifyFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModifyFotoActionPerformed
        modifyFoto();
    }//GEN-LAST:event_jButtonModifyFotoActionPerformed

    /**
     * Acción que se ejecuta cuando se hace clic en el botón "Eliminar
     * ejercicio". Llama al método `deleteExercise()`.
     *
     * @param evt El evento de acción generado por el clic del usuario.
     */
    private void jButtonDeleteExerciseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeleteExerciseActionPerformed
        deleteExercise();
    }//GEN-LAST:event_jButtonDeleteExerciseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonDeleteExercise;
    private javax.swing.JButton jButtonModifyDescription;
    private javax.swing.JButton jButtonModifyFoto;
    private javax.swing.JButton jButtonModifyName;
    private javax.swing.JLabel jLabelApply;
    private javax.swing.JLabel jLabelChooseExercise;
    private javax.swing.JLabel jLabelModifyExercise;
    private javax.swing.JLabel jLabelNewValue;
    private javax.swing.JScrollPane jScrollPaneShowAllExercises;
    private javax.swing.JTextField jTextFieldDescription;
    private javax.swing.JTextField jTextFieldFoto;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables

    /**
     * Rellena el combo box con todos los ejercicios disponibles en la base de
     * datos.
     */
    private void showAllExercises() {

        ArrayList<Exercici> exercicis = DataAccess.getAllExercicis();
        for (Exercici exercici : exercicis) {
            jComboBoxShowAllExercises.addItem(exercici);
        }
    }

    /**
     * Modifica el nombre del ejercicio seleccionado. Toma el nuevo nombre del
     * campo de texto y lo actualiza en la base de datos. Si la actualización es
     * exitosa, muestra un mensaje de éxito; si ocurre un error, muestra un
     * mensaje de error.
     */
    private void modifyName() {

        Exercici exercise = (Exercici) jComboBoxShowAllExercises.getSelectedItem();
        int id = exercise.getId();

        String newName = jTextFieldName.getText();
        exercise.setNomExercici(newName);
        boolean actualizado = DataAccess.updateExerciciNom(id, newName);
        if (actualizado) {
            JOptionPane.showMessageDialog(null, "Updated exercise: \n" + exercise, "Modified exercise", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error updating the exercise name.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Modifica la descripción del ejercicio seleccionado. Toma la nueva
     * descripción del campo de texto y la actualiza en la base de datos. Si la
     * actualización es exitosa, muestra un mensaje de éxito; si ocurre un
     * error, muestra un mensaje de error.
     */
    private void modifyDescription() {

        Exercici exercise = (Exercici) jComboBoxShowAllExercises.getSelectedItem();
        int id = exercise.getId();

        String newDescription = jTextFieldDescription.getText();
        exercise.setDescripcio(newDescription);
        boolean actualizado = DataAccess.updateExerciciDescripcio(id, newDescription);
        if (actualizado) {
            JOptionPane.showMessageDialog(null, "Updated exercise: \n" + exercise, "Modified exercise", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error updating the exercise description.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Modifica la foto del ejercicio seleccionado. Toma la nueva URL o ruta de
     * la foto del campo de texto y la actualiza en la base de datos. Si la
     * actualización es exitosa, muestra un mensaje de éxito; si ocurre un
     * error, muestra un mensaje de error.
     */
    private void modifyFoto() {

        Exercici exercise = (Exercici) jComboBoxShowAllExercises.getSelectedItem();
        int id = exercise.getId();

        String newFoto = jTextFieldFoto.getText();
        exercise.setDemoFoto(newFoto);
        boolean actualizado = DataAccess.updateExerciciFoto(id, newFoto);
        if (actualizado) {
            JOptionPane.showMessageDialog(null, "Updated exercise: \n" + exercise, "Modified exercise", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error updating the exercise photo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Elimina el ejercicio seleccionado de la base de datos. Si la eliminación
     * es exitosa, muestra un mensaje de éxito; si no se puede eliminar el
     * ejercicio porque está asignado a un entrenamiento, muestra un mensaje de
     * error.
     */
    private void deleteExercise() {

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
