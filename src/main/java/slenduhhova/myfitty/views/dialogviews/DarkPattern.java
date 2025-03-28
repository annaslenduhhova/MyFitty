package slenduhhova.myfitty.views.dialogviews;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import slenduhhova.myfitty.views.mainviews.Main;

/**
 * Clase que representa un cuadro de diálogo de suscripción con una interfaz
 * personalizada. Este diálogo solicita al usuario que ingrese su correo
 * electrónico para suscribirse a ofertas exclusivas.
 *
 * @author annas
 */
public class DarkPattern extends javax.swing.JDialog {

    /**
     * Referencia a la ventana principal de la aplicación.
     */
    private Main main;

    /**
     * Crea una nueva instancia del diálogo de suscripción con un diseño
     * personalizado.
     *
     * @param main La ventana principal de la aplicación.
     */
    public DarkPattern(Main main) {
        super(main, true);
        this.main = main;

        // Guardar el LookAndFeel actual
        String previousLookAndFeel = UIManager.getLookAndFeel().getClass().getName();

        // Código generado con la ayuda de ChatGPT el 29 de enero de 2025.
        // Fuente: ChatGPT, OpenAI.
        // Usar el lookAndFeel del sistema para quitar la barra de título con el botón de cerrar
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            SwingUtilities.updateComponentTreeUI(this);
        } catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }

        this.setUndecorated(true);
        getRootPane().setBorder(BorderFactory.createLineBorder(Color.GRAY, 1));
        initComponents();
        setSize(400, 300);
        getContentPane().setBackground(new Color(255, 255, 240));
        setLocationRelativeTo(main);

        // Acción del botón "Subscribe"
        jButtonAccept.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String email = jTextFieldEmail.getText();
                if (!email.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Thank You for Your subscription!");
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(null, "Please, enter Your email.");
                }
            }
        });

        // Restaurar el LookAndFeel anterior
        try {
            UIManager.setLookAndFeel(previousLookAndFeel);
            SwingUtilities.updateComponentTreeUI(main);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelSubsribe = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jButtonAccept = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();

        setForeground(new java.awt.Color(255, 255, 204));

        jLabelSubsribe.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelSubsribe.setForeground(new java.awt.Color(204, 51, 0));
        jLabelSubsribe.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSubsribe.setText("SUBSCRIBE TO OUR EXCLUSIVE OFFERS!!");
        jLabelSubsribe.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jTextFieldEmail.setBackground(new java.awt.Color(255, 255, 240));
        jTextFieldEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextFieldEmail.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextFieldEmail.setToolTipText("");
        jTextFieldEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ENTER YOUR EMAIL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12), new java.awt.Color(0, 0, 102))); // NOI18N
        jTextFieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmailActionPerformed(evt);
            }
        });

        jButtonAccept.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButtonAccept.setForeground(new java.awt.Color(204, 0, 0));
        jButtonAccept.setText("SUBSCRIBE");
        jButtonAccept.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButtonExit.setBackground(new java.awt.Color(255, 255, 240));
        jButtonExit.setText("X");
        jButtonExit.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jButtonExit.setFocusPainted(false);
        jButtonExit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(17, Short.MAX_VALUE)
                        .addComponent(jLabelSubsribe, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(149, 149, 149)
                                .addComponent(jButtonAccept))
                            .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabelSubsribe)
                .addGap(37, 37, 37)
                .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jButtonAccept)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Maneja la acción cuando el usuario presiona Enter en el campo de email.
     *
     * @param evt Evento de acción.
     */
    private void jTextFieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmailActionPerformed

    /**
     * Maneja la acción cuando el usuario presiona el botón de cerrar (X).
     *
     * @param evt Evento de acción.
     */
    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonExitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAccept;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JLabel jLabelSubsribe;
    private javax.swing.JTextField jTextFieldEmail;
    // End of variables declaration//GEN-END:variables
}
