package slenduhhova.myfitty.views.mainviews;

import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import slenduhhova.myfitty.views.dialogviews.DarkPattern;

/**
 * Clase que representa el panel que se muestra antes de que el usuario inicie
 * sesión. Esta clase maneja la interfaz gráfica de la pantalla de inicio de
 * sesión, donde el usuario puede acceder a la página de login o registrarse
 * como nuevo usuario.
 *
 * La interfaz contiene elementos como un icono, un enlace a una página web, y
 * botones para el login y el registro de usuario.
 *
 * @author annas
 */
public class MainBeforeLogin extends javax.swing.JPanel {

    private Main main;
    private DarkPattern darkPattern;

    /**
     * Constructor que inicializa la clase {@link MainBeforeLogin}.
     *
     * @param main la instancia principal de la aplicación.
     */
    public MainBeforeLogin(Main main) {
        this.main = main;
        darkPattern = new DarkPattern(main);
        initComponents();
        setSize(800, 500);
        setBackground(new Color(240, 240, 240));
        int iconX = (getWidth() - 158) / 2;
        jLabelIcon.setBounds(iconX, 100, 158, 160);

        int linkX = (getWidth() - 110) / 2;
        jLabelHyperlink.setBounds(linkX, 300, 110, 22);

        int buttonX = (getWidth() - 117) / 2;
        jButtonLogin.setBounds(buttonX, 368, 117, 47);
        jButtonRegisterUser.setBounds(333, 460, 130, 35);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelIcon = new javax.swing.JLabel();
        jLabelHyperlink = new javax.swing.JLabel();
        jButtonLogin = new javax.swing.JButton();
        jButtonRegisterUser = new javax.swing.JButton();

        setAlignmentX(0.0F);
        setPreferredSize(new java.awt.Dimension(320, 350));
        setLayout(null);

        jLabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono.png"))); // NOI18N
        add(jLabelIcon);
        jLabelIcon.setBounds(119, 51, 158, 160);

        jLabelHyperlink.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabelHyperlink.setText("www.fitty.com");
        jLabelHyperlink.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelHyperlink.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHyperlinkMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelHyperlinkMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelHyperlinkMouseExited(evt);
            }
        });
        add(jLabelHyperlink);
        jLabelHyperlink.setBounds(151, 217, 110, 19);

        jButtonLogin.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonLogin.setText("LOGIN");
        jButtonLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonLogin.setFocusPainted(false);
        jButtonLogin.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        add(jButtonLogin);
        jButtonLogin.setBounds(134, 270, 117, 47);

        jButtonRegisterUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonRegisterUser.setText("Register user");
        jButtonRegisterUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegisterUserActionPerformed(evt);
            }
        });
        add(jButtonRegisterUser);
        jButtonRegisterUser.setBounds(120, 350, 140, 30);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que se ejecuta cuando el botón de "LOGIN" es presionado. Muestra
     * el patrón oscuro y el panel de inicio de sesión.
     *
     * @param evt el evento del clic en el botón de login.
     */
    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        darkPattern.setVisible(true);
        main.getLogin().setVisible(true);
    }//GEN-LAST:event_jButtonLoginActionPerformed

    /**
     * Método que se ejecuta cuando el enlace "www.fitty.com" es clicado. Abre
     * la URL especificada en el navegador predeterminado.
     *
     * @param evt el evento del clic en el enlace.
     */
    private void jLabelHyperlinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHyperlinkMouseClicked
        try {
            Desktop.getDesktop().browse(new URL("https://paucasesnovescifp.cat/").toURI());
        } catch (IOException | URISyntaxException e) {
        }
    }//GEN-LAST:event_jLabelHyperlinkMouseClicked

    /**
     * Método que cambia el estilo del texto del enlace cuando el cursor entra
     * en la zona del enlace.
     *
     * @param evt el evento de mouseEntered sobre el enlace.
     */
    private void jLabelHyperlinkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHyperlinkMouseEntered
        jLabelHyperlink.setText("<html><a href='' style=\"color:#ef6c00;\">" + jLabelHyperlink.getText() + "</a></html>");
    }//GEN-LAST:event_jLabelHyperlinkMouseEntered

    /**
     * Método que restaura el texto original del enlace cuando el cursor sale de
     * la zona del enlace.
     *
     * @param evt el evento de mouseExited sobre el enlace.
     */
    private void jLabelHyperlinkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHyperlinkMouseExited
        jLabelHyperlink.setText("www.fitty.com");
    }//GEN-LAST:event_jLabelHyperlinkMouseExited

    /**
     * Método que se ejecuta cuando el botón de "Register user" es presionado.
     * Muestra la interfaz para registrar un nuevo usuario.
     *
     * @param evt el evento del clic en el botón de registrar usuario.
     */
    private void jButtonRegisterUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegisterUserActionPerformed
        main.getNewUser().setVisible(true);
    }//GEN-LAST:event_jButtonRegisterUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonRegisterUser;
    private javax.swing.JLabel jLabelHyperlink;
    private javax.swing.JLabel jLabelIcon;
    // End of variables declaration//GEN-END:variables

}
