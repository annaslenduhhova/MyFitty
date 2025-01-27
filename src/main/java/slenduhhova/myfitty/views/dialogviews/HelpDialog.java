
package slenduhhova.myfitty.views.dialogviews;

import java.awt.Color;
import javax.swing.ImageIcon;
import slenduhhova.myfitty.views.mainviews.Main;

/**
 *
 * @author annas
 */

    public class HelpDialog extends javax.swing.JDialog {
    
    private Main main;

    public HelpDialog(Main main) {
        super(main, true);
        this.main = main;
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/images/icono.png")).getImage());
        setSize(600,400);
        setLocationRelativeTo(main);
        getContentPane().setBackground(new Color(240, 240, 240));
        setTextResources();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelResources = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelResources, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(95, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabelResources, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabelResources;
    // End of variables declaration//GEN-END:variables
    private void setTextResources(){
    
    jLabelResources.setText("<html>Developed by: Slenduhhova Anna<br><br>" +
                        "Course: DAM_DI<br><br>" +
                        "Resources used:<br><br>" +
                        "1. Etoilefab. (Year is not specified). Fitness Logo Icon [Image]. PNGitem. " +
                        "<a href='https://www.pngitem.com/middle/iRoiTix_fitness-logo-png-icon-fitness-logo-icon-png/'>https://www.pngitem.com</a>. License: 'Personal use only'<br><br>" +
                        "2. Clker-Free-Vector-Images. (Year is not specified). Runners Icon [Vector Image]. Creazilla. " +
                        "<a href='https://creazilla.com/media/icon/3431931/'>https://creazilla.com</a>. License: CC0 1.0" +
                        "</html>");
    }
}
