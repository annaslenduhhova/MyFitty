package slenduhhova.myfitty.views.mainviews;

import java.awt.AWTKeyStroke;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.HashSet;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import slenduhhova.myfitty.views.dialogviews.NewUser;
import slenduhhova.myfitty.views.dialogviews.HelpDialog;
import slenduhhova.myfitty.views.dialogviews.Login;

/**
 *
 * @author annas
 */
public class Main extends javax.swing.JFrame {

    private MainAfterLogin mainAfterLogin;
    private MainBeforeLogin mainBeforeLogin;
    private Login login;
    private int idLoggedInstructor;
    private HelpDialog helpMenu;
    private NewUser newUser;

    public Main() {
        initComponents();
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
        getContentPane().setBackground(new Color(240, 240, 240));
        this.setIconImage(new ImageIcon(getClass().getResource("/images/icono.png")).getImage());
        login = new Login(this);
        mainBeforeLogin = new MainBeforeLogin(this);
        mainAfterLogin = new MainAfterLogin(this);
        helpMenu = new HelpDialog(this);
        newUser = new NewUser(this);

        getContentPane().add(mainBeforeLogin);
        getContentPane().add(mainAfterLogin);
        mainBeforeLogin.setVisible(true);       
        mainAfterLogin.setVisible(false);

        setMenu();
        
        Set<AWTKeyStroke> forwardKeys = new HashSet<>(KeyboardFocusManager.getCurrentKeyboardFocusManager()
                .getDefaultFocusTraversalKeys(KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS));
        forwardKeys.add(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0));
        KeyboardFocusManager.getCurrentKeyboardFocusManager().setDefaultFocusTraversalKeys(
                KeyboardFocusManager.FORWARD_TRAVERSAL_KEYS, forwardKeys);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void switchBeforeLoginToAfterLogin(String name) {
        mainBeforeLogin.setVisible(false);
        mainAfterLogin.getjLabelWelcomeNameOfInstructor().setText(name);
        mainAfterLogin.setVisible(true);
        mainAfterLogin.showListOfUsers();
    }

    public Login getLogin() {
        return login;
    }

    public void setId(int id) {
        idLoggedInstructor = id;
    }

    public int getId() {
        return idLoggedInstructor;
    }

    private void showAboutMenu() {
        helpMenu.setVisible(true);
    }

    public void setLogOut() {
        mainAfterLogin.setVisible(false);
        mainBeforeLogin.setVisible(true);
    }

    public NewUser getNewUser() {
        return newUser;
    }

    private void setMenu() {
        JMenuBar menuBar = new JMenuBar();

        JMenu fileMenu = new JMenu("File");
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        fileMenu.add(exitMenuItem);
        menuBar.add(fileMenu);

        JMenu helpMenu = new JMenu("Help");
        JMenuItem aboutMenuItem = new JMenuItem("About");
        aboutMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showAboutMenu();
            }
        });
        helpMenu.add(aboutMenuItem);
        menuBar.add(helpMenu);
        setJMenuBar(menuBar);
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
