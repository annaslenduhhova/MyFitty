
package slenduhhova.myfitty;

import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

/**
 *
 * @author annas
 */

public class MainBeforeLogin extends javax.swing.JPanel {
    
    Main main;
    
    public MainBeforeLogin(Main main) {
        this.main=main;
        initComponents();
        setSize(800, 600); 
        setBackground(new Color(240, 240, 240));
        int iconWidth = 158;
        int iconHeight = 160;
        int iconX = (getWidth() - iconWidth) / 2;  
        int iconY = 100;  
        jLabelIcon.setBounds(iconX, iconY, iconWidth, iconHeight);
        
        int linkWidth = 110;
        int linkHeight = 22;
        int linkX = (getWidth() - linkWidth) / 2; 
        int linkY = iconY + iconHeight + 40;  
        jLabelHyperlink.setBounds(linkX, linkY, linkWidth, linkHeight);
        
        int buttonWidth = 117;
        int buttonHeight = 47;
        int buttonX = (getWidth() - buttonWidth) / 2; 
        int buttonY = linkY + linkHeight + 50;  
        jButtonGoToLoginDialog.setBounds(buttonX, buttonY, buttonWidth, buttonHeight);
    }

    @SuppressWarnings("unchecked")        
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelIcon = new javax.swing.JLabel();
        jLabelHyperlink = new javax.swing.JLabel();
        jButtonGoToLoginDialog = new javax.swing.JButton();

        setAlignmentX(0.0F);
        setPreferredSize(new java.awt.Dimension(320, 350));
        setLayout(null);

        jLabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icono.png"))); // NOI18N
        add(jLabelIcon);
        jLabelIcon.setBounds(119, 51, 158, 160);

        jLabelHyperlink.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
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
        jLabelHyperlink.setBounds(151, 217, 110, 22);

        jButtonGoToLoginDialog.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButtonGoToLoginDialog.setText("LOGIN");
        jButtonGoToLoginDialog.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonGoToLoginDialog.setFocusPainted(false);
        jButtonGoToLoginDialog.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonGoToLoginDialog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGoToLoginDialogActionPerformed(evt);
            }
        });
        add(jButtonGoToLoginDialog);
        jButtonGoToLoginDialog.setBounds(134, 270, 117, 47);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGoToLoginDialogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGoToLoginDialogActionPerformed
        main.getLogin().setVisible(true);
       
    }//GEN-LAST:event_jButtonGoToLoginDialogActionPerformed

    private void jLabelHyperlinkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHyperlinkMouseClicked
        try {
        Desktop.getDesktop().browse(new URL("https://paucasesnovescifp.cat/").toURI());
        }
        catch (IOException | URISyntaxException e) {}
    }//GEN-LAST:event_jLabelHyperlinkMouseClicked

    private void jLabelHyperlinkMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHyperlinkMouseEntered
        jLabelHyperlink.setText("<html><a href='' style=\"color:#FF4500;\">" + jLabelHyperlink.getText() + "</a></html>");
    }//GEN-LAST:event_jLabelHyperlinkMouseEntered

    private void jLabelHyperlinkMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHyperlinkMouseExited
        jLabelHyperlink.setText("www.fitty.com");
    }//GEN-LAST:event_jLabelHyperlinkMouseExited
                                        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGoToLoginDialog;
    private javax.swing.JLabel jLabelHyperlink;
    private javax.swing.JLabel jLabelIcon;
    // End of variables declaration//GEN-END:variables


}
