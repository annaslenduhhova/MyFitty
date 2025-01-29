package slenduhhova.myfitty.views.mainafterloginviews;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import net.miginfocom.swing.MigLayout;
import slenduhhova.myfitty.dataaccess.DataAccess;
import slenduhhova.myfitty.dto.Exercici;
import slenduhhova.myfitty.views.mainviews.MainAfterLogin;

/**
 *
 * @author annas
 */
public class CreateExercise extends javax.swing.JPanel {

    private MainAfterLogin mainAfterLogin;
    private JLabel jLabelPreviewPhoto; // Para mostrar una vista previa de la imagen seleccionada
    private File selectedFile; // Guardar la imagen seleccionada

    public CreateExercise(MainAfterLogin mainAfterLogin) {
        this.mainAfterLogin = mainAfterLogin;
        initComponents();
        setSize(300, 440);
        setBackground(new Color(240, 240, 240));
        jLabelPreviewPhoto = new JLabel();
        jLabelPreviewPhoto.setHorizontalAlignment(SwingConstants.CENTER);

        setupLayout();

        ImageIcon defaultIcon = new ImageIcon(getClass().getResource("/images/icono.png"));
        Image scaledDefaultImage = defaultIcon.getImage().getScaledInstance(55, 55, Image.SCALE_SMOOTH);
        jLabelPreviewPhoto.setIcon(new ImageIcon(scaledDefaultImage));

        jButtonFoto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                choosePhoto();
            }
        });
        jButtonFoto.addFocusListener(new FocusAdapter() {
            @Override
            public void focusGained(FocusEvent e) {
                SwingUtilities.getRootPane(jButtonCreate).setDefaultButton(jButtonCreate);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelName = new javax.swing.JLabel();
        jLabelFoto = new javax.swing.JLabel();
        jLabelDescription = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jTextFieldDescription = new javax.swing.JTextField();
        jButtonCreate = new javax.swing.JButton();
        jLabelNewExercise = new javax.swing.JLabel();
        jButtonFoto = new javax.swing.JButton();

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelName.setText("Name:");
        jLabelName.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabelFoto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelFoto.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelFoto.setText("Photo:");
        jLabelFoto.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabelDescription.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelDescription.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelDescription.setText("Description:");
        jLabelDescription.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jTextFieldName.setAlignmentX(0.0F);
        jTextFieldName.setAlignmentY(0.0F);
        jTextFieldName.setMinimumSize(new java.awt.Dimension(15, 22));

        jTextFieldDescription.setAlignmentX(0.0F);
        jTextFieldDescription.setAlignmentY(0.0F);
        jTextFieldDescription.setMinimumSize(new java.awt.Dimension(15, 22));

        jButtonCreate.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButtonCreate.setText("Create");
        jButtonCreate.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCreate.setMaximumSize(new java.awt.Dimension(180, 40));
        jButtonCreate.setMinimumSize(new java.awt.Dimension(100, 30));
        jButtonCreate.setName(""); // NOI18N
        jButtonCreate.setPreferredSize(new java.awt.Dimension(120, 35));
        jButtonCreate.setRequestFocusEnabled(false);
        jButtonCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateActionPerformed(evt);
            }
        });

        jLabelNewExercise.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelNewExercise.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNewExercise.setText("Enter new exercise details");

        jButtonFoto.setText("Choose photo");
        jButtonFoto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNewExercise, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jTextFieldDescription, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                                .addComponent(jTextFieldName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jButtonFoto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jButtonCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jLabelNewExercise, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFoto))
                .addGap(28, 28, 28)
                .addComponent(jButtonCreate, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
                .addGap(280, 280, 280))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateActionPerformed
        addNewExercise();
    }//GEN-LAST:event_jButtonCreateActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreate;
    private javax.swing.JButton jButtonFoto;
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNewExercise;
    private javax.swing.JTextField jTextFieldDescription;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables

    private void addNewExercise() {

        if (selectedFile == null) {
            JOptionPane.showMessageDialog(this, "Please select a photo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Exercici exercici = new Exercici();

        exercici.setNomExercici(jTextFieldName.getText());
        exercici.setDescripcio(jTextFieldDescription.getText());
        exercici.setDemoFoto(selectedFile.getAbsolutePath());

        try {
            int idNewExercise = DataAccess.addNewExercise(exercici);
            exercici.setId(idNewExercise);
            JOptionPane.showMessageDialog(null, "New exercise has been created successfully.", "Exercise", JOptionPane.PLAIN_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error creating new exercise.", "Exercise", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void setupLayout() {

        setLayout(new MigLayout("wrap 2", "[align right][grow,fill]", "[]20[]15[]15[]20[]20[]"));

        add(jLabelNewExercise, "span 2, center, gaptop 25");
        add(jLabelName);
        add(jTextFieldName, "growx, growy, hmin 25, wmin 100, wmax 900");
        add(jLabelDescription);
        add(jTextFieldDescription, "growx, growy, hmin 25, wmin 100, wmax 900");
        add(jLabelFoto);
        add(jButtonFoto, "growx, wmin 100, wmax 900");
        add(jLabelPreviewPhoto, "span 2, center, gaptop 20, growx, growy, hmin 35, wmin 25, hmax 55, wmax 55");
        add(jButtonCreate, "span 2, center, gaptop 25");

    }

    private void choosePhoto() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(
                "Image Files", "jpg", "png", "jpeg", "gif"));

        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile();
            updatePhotoPreview(selectedFile);

        }
    }

    private void updatePhotoPreview(File file) {
        if (file != null) {
            try {
                ImageIcon originalIcon = new ImageIcon(file.getAbsolutePath());
                Image scaledImage = originalIcon.getImage().getScaledInstance(jLabelPreviewPhoto.getWidth(), jLabelPreviewPhoto.getHeight(), Image.SCALE_SMOOTH);
                jLabelPreviewPhoto.setIcon(new ImageIcon(scaledImage));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error loading image.", "Error", JOptionPane.ERROR_MESSAGE);
                jLabelPreviewPhoto.setIcon(null);
            }
        }
    }

}
