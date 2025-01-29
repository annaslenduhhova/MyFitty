package slenduhhova.myfitty.views.dialogviews;

import at.favre.lib.crypto.bcrypt.BCrypt;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;
import slenduhhova.myfitty.dataaccess.DataAccess;
import slenduhhova.myfitty.dto.Usuari;
import slenduhhova.myfitty.views.mainviews.Main;

/**
 *
 * @author annas
 */
public class Login extends javax.swing.JDialog {

    private Main main;

    public Login(Main main) {
        super(main, true);
        this.main = main;
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/images/icono.png")).getImage());
        setSize(310, 340);
        setLocationRelativeTo(main);
        getContentPane().setBackground(new Color(240, 240, 240));
        jLabelHelp.setText("<html>Forgot Your password or need any help?<br>Contact us: <font color='#00008B'>help@myfitty.com</font></html>");
        jProgressBarEnter.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelEmail = new javax.swing.JLabel();
        jLabelPassword = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jButtonEnter = new javax.swing.JButton();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jLabelHelp = new javax.swing.JLabel();
        jProgressBarEnter = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setModal(true);

        jLabelEmail.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelEmail.setText("Email:");

        jLabelPassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelPassword.setText("Password:");

        jTextFieldEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldEmail.setText("a@b.c");

        jButtonEnter.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButtonEnter.setText("ENTER");
        jButtonEnter.setActionCommand("Enter");
        jButtonEnter.setFocusPainted(false);
        jButtonEnter.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnterActionPerformed(evt);
            }
        });

        jPasswordFieldPassword.setText("string");

        jLabelHelp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelHelp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jProgressBarEnter.setMaximumSize(new java.awt.Dimension(100, 4));
        jProgressBarEnter.setName(""); // NOI18N
        jProgressBarEnter.setPreferredSize(new java.awt.Dimension(145, 4));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelHelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                        .addComponent(jTextFieldEmail))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jProgressBarEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelPassword)
                    .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(jButtonEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelHelp, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jProgressBarEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnterActionPerformed
        jButtonEnter();
    }//GEN-LAST:event_jButtonEnterActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEnter;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelHelp;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JProgressBar jProgressBarEnter;
    private javax.swing.JTextField jTextFieldEmail;
    // End of variables declaration//GEN-END:variables

    public void jButtonEnter() {
        jProgressBarEnter.setVisible(true);
        jProgressBarEnter.setIndeterminate(true);
        jButtonEnter.setEnabled(false);

        SwingWorker<Boolean, Void> worker = new SwingWorker<>() {
            private Usuari usuari;
            private boolean loginSuccess = false;

            @Override
            protected Boolean doInBackground() throws Exception {
                usuari = DataAccess.getUser(jTextFieldEmail.getText());
                if (usuari != null) {
                    char[] passwordToVerify = jPasswordFieldPassword.getPassword();
                    String userPasswordHashInDatabase = usuari.getPasswordHash();
                    if (userPasswordHashInDatabase != null) {
                        var result = BCrypt.verifyer().verify(passwordToVerify, userPasswordHashInDatabase);
                        if (result.verified) {
                            loginSuccess = true;
                            return true;
                        }
                    }
                }
                return false;
            }

            @Override
            protected void done() {
                // Apagar barra de progreso y reactivar botón
                jProgressBarEnter.setIndeterminate(false);
                jButtonEnter.setEnabled(true);

                try {
                    if (get()) { // Si get() devuelve true, login correcto
                        setVisible(false);
                        main.setId(usuari.getId());
                        main.switchBeforeLoginToAfterLogin("Welcome, " + usuari.getNom() + "!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Email or password incorrect.", "Login", JOptionPane.PLAIN_MESSAGE);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        };

        worker.execute(); // Iniciar el proceso en segundo plano
    }
}
