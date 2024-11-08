
package slenduhhova.myfitty;

import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author annas
 */

public class Main extends javax.swing.JFrame {
    
    private MainAfterLogin mainAfterLogin;
    private MainBeforeLogin mainBeforeLogin;
    Login login;

    /**
     * Creates new form Main
     */
    
    public Main() {
        initComponents();
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(240, 240, 240));
        this.setIconImage(new ImageIcon(getClass().getResource("/images/icono.png")).getImage());
        mainBeforeLogin = new MainBeforeLogin(this);
        mainAfterLogin = new MainAfterLogin(this);
        login = new Login(this);

        getContentPane().add(mainBeforeLogin);
        getContentPane().add(mainAfterLogin);
        mainBeforeLogin.setVisible(true);
        mainAfterLogin.setVisible(false);
          
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(null);

        pack();
    }// </editor-fold>//GEN-END:initComponents

         
    public void switchBeforeLoginToAfterLogin(String name) {
        mainBeforeLogin.setVisible(false);              
        mainAfterLogin.getjLabelWelcomeNameOfInstructor().setText(name);
        mainAfterLogin.setVisible(true);
        
        revalidate();
        repaint(); 
    }
    public Login getLogin() {
        return login;
    }   
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
