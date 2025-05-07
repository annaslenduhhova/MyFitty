package slenduhhova.myfitty.views.mainviews;

import com.jtattoo.plaf.graphite.GraphiteLookAndFeel;
import java.awt.AWTKeyStroke;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.KeyboardFocusManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import slenduhhova.myfitty.views.dialogviews.NewUser;
import slenduhhova.myfitty.views.dialogviews.HelpDialog;
import slenduhhova.myfitty.views.dialogviews.Login;

/**
 * La clase `Main` representa la ventana principal de la aplicación. Es una
 * ventana que contiene los elementos necesarios para manejar la vista tanto
 * antes como después de iniciar sesión. Esta clase también se encarga de la
 * configuración del menú, la gestión de la interfaz de usuario y de la
 * navegación entre diferentes vistas (como la pantalla de inicio de sesión y la
 * pantalla principal después del inicio de sesión).
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

    /**
     * Constructor de la clase `Main`. Inicializa la interfaz de usuario,
     * configura el aspecto visual de la ventana y establece las vistas
     * correspondientes para antes y después del inicio de sesión.
     */
    public Main() {

        // Código generado con la ayuda de ChatGPT el 29 de enero de 2025.
        // Fuente: ChatGPT, OpenAI.
        try {
            UIManager.setLookAndFeel(new GraphiteLookAndFeel());
            SwingUtilities.updateComponentTreeUI(new JFrame());
        } catch (Exception e) {
            e.printStackTrace();
        }
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

        // Código generado con la ayuda de ChatGPT el 27 de enero de 2025.
        // Fuente: ChatGPT, OpenAI.
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

    /**
     * Cambia la vista de la interfaz de usuario de la pantalla de inicio de
     * sesión a la pantalla principal después de iniciar sesión.
     *
     * @param name Nombre del instructor que se ha autenticado, se muestra en la
     * pantalla de inicio.
     */
    public void switchBeforeLoginToAfterLogin(String name) {
        mainBeforeLogin.setVisible(false);
        mainAfterLogin.getjLabelWelcomeNameOfInstructor().setText(name);
        mainAfterLogin.setVisible(true);
        mainAfterLogin.showListOfUsers();
    }

    /**
     * Devuelve la instancia de la clase `Login` asociada a esta clase `Main`.
     *
     * @return La instancia de la clase `Login`.
     */
    public Login getLogin() {
        return login;
    }

    /**
     * Establece el ID del instructor que ha iniciado sesión.
     *
     * @param id ID del instructor.
     */
    public void setId(int id) {
        idLoggedInstructor = id;
    }

    /**
     * Devuelve el ID del instructor que ha iniciado sesión.
     *
     * @return El ID del instructor.
     */
    public int getId() {
        return idLoggedInstructor;
    }

    /**
     * Muestra el menú de ayuda en la interfaz de usuario. Se trata de una
     * ventana emergente que contiene información sobre la aplicación.
     */
    private void showAboutMenu() {
        helpMenu.setVisible(true);
    }

    /**
     * Configura la pantalla para cerrar sesión, ocultando la pantalla de la
     * interfaz principal después del inicio de sesión y mostrando la pantalla
     * anterior al inicio de sesión.
     */
    public void setLogOut() {
        mainAfterLogin.setVisible(false);
        mainBeforeLogin.setVisible(true);
    }

    /**
     * Devuelve la instancia de la clase `NewUser` asociada a esta clase `Main`.
     *
     * @return La instancia de la clase `NewUser`.
     */
    public NewUser getNewUser() {
        return newUser;
    }

    /**
     * Configura el menú de la aplicación, incluyendo las opciones de "Archivo"
     * (con la opción de salir) y "Ayuda" (con la opción de "Acerca de"). Se
     * añaden escuchadores de eventos para manejar las interacciones con estos
     * elementos del menú.
     */
    private void setMenu() {
        JMenuBar menuBar = new JMenuBar();

        JMenu jMenuFile = new JMenu("File");
        jMenuFile.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                jMenuFile.setOpaque(true);
                jMenuFile.setBackground(new Color(220, 220, 220));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jMenuFile.setOpaque(false);
                jMenuFile.setBackground(null);
            }
        });
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        exitMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        jMenuFile.add(exitMenuItem);
        menuBar.add(jMenuFile);

        JMenu jMenuHelp = new JMenu("Help");
        jMenuHelp.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                jMenuHelp.setOpaque(true);
                jMenuHelp.setBackground(new Color(220, 220, 220));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jMenuHelp.setOpaque(false);
                jMenuHelp.setBackground(null);
            }
        });
        JMenuItem aboutMenuItem = new JMenuItem("About");
        aboutMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showAboutMenu();
            }
        });
        
        JMenuItem apiDocMenuItem = new JMenuItem("API Docs");
        apiDocMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HelpOpener.openApiDocs();
            }
        });
        
        JMenuItem userManualMenuItem = new JMenuItem("User Manual");
        userManualMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                HelpOpener.openUserManual();
            }
        });
        
        jMenuHelp.add(aboutMenuItem);
        jMenuHelp.add(apiDocMenuItem);
        jMenuHelp.add(userManualMenuItem);
        menuBar.add(jMenuHelp);
        setJMenuBar(menuBar);
    }
    
    public class HelpOpener {

    private static final String APP_NAME = "MyFitty"; 

    public static void openApiDocs() {
        String path = System.getProperty("user.home") + "\\AppData\\Local\\" + APP_NAME + "\\docs\\apidocs\\index.html";
        openFile(path);
    }

    public static void openUserManual() {
        String path = System.getProperty("user.home") + "\\AppData\\Local\\" + APP_NAME + "\\docs\\user_manual.pdf";
        openFile(path);
    }

    private static void openFile(String filePath) {
        try {
            File file = new File(filePath);
            if (file.exists() && Desktop.isDesktopSupported()) {
                Desktop.getDesktop().open(file);
            } else {
                System.out.println("No se encontró el archivo: " + filePath);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

    /**
     * Método principal que inicia la aplicación.
     *
     * @param args Argumentos de la línea de comandos.
     */
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
