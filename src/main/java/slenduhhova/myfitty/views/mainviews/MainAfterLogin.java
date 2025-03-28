package slenduhhova.myfitty.views.mainviews;

import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.event.ListSelectionListener;
import slenduhhova.myfitty.dataaccess.DataAccess;
import slenduhhova.myfitty.views.mainafterloginviews.CreateWorkouts;
import slenduhhova.myfitty.views.mainafterloginviews.CreateExercise;
import slenduhhova.myfitty.views.mainafterloginviews.ManageExercises;
import slenduhhova.myfitty.dto.Exercici;
import slenduhhova.myfitty.dto.Usuari;
import slenduhhova.myfitty.dto.Workout;

/**
 * Clase principal del panel que se muestra después de iniciar sesión. Esta
 * clase es responsable de mostrar la interfaz gráfica después de que el
 * instructor se haya autenticado, y proporciona funcionalidades para gestionar
 * usuarios, ejercicios y entrenamientos.
 *
 * El panel permite al instructor interactuar con los usuarios y gestionar los
 * entrenamientos mediante la creación de nuevos entrenamientos y ejercicios,
 * así como visualizar los detalles de los entrenamientos.
 *
 * @author annas
 */
public class MainAfterLogin extends javax.swing.JPanel {

    private Main main;
    private JList<Usuari> jListShowUsers;
    private JComboBox<Object> jComboBoxShowWorkouts;
    private CreateWorkouts createWorkouts;
    private ManageExercises manageExercises;
    private CreateExercise createExercise;
    private JComboBox jComboBoxDetails;
    private JMenuBar menuBar;

    /**
     * Constructor que inicializa la clase {@link MainAfterLogin} y sus
     * componentes.
     *
     * @param main la instancia principal de la aplicación.
     */
    public MainAfterLogin(Main main) {
        this.main = main;
        initComponents();
        setSize(800, 600);
        setBackground(new Color(240, 240, 240));

        menuBar = new JMenuBar();
        add(menuBar);

        createWorkouts = new CreateWorkouts(this);
        add(createWorkouts);
        createWorkouts.setVisible(false);

        manageExercises = new ManageExercises(this);
        add(manageExercises);
        manageExercises.setVisible(false);

        createExercise = new CreateExercise(this);
        add(createExercise);
        createExercise.setVisible(false);

        jComboBoxDetails = new JComboBox();
        add(jComboBoxDetails);

        jLabelDate.setVisible(false);
        jLabelComments.setVisible(false);
        jComboBoxDetails.setVisible(false);

        int welcomeX = (getWidth() - 306) / 2;
        jLabelWelcomeNameOfInstructor.setBounds(welcomeX, 15, 306, 37);
        jScrollPaneListUsers.setBounds(60, 140, 106, 70);
        jScrollPaneListWorkouts.setBounds(60, 270, 106, 32);
        jLabelDate.setBounds(60, 360, 82, 45);
        jLabelComments.setBounds(160, 360, 140, 45);
        jComboBoxDetails.setBounds(60, 410, 240, 37);
        jLabelChooseUser.setBounds(60, 110, 140, 15);
        jLabelChooseWorkout.setBounds(60, 240, 140, 15);
        jLabelExerciseDetails.setBounds(60, 330, 230, 15);
        jButtonCreateWorkout.setBounds(305, 110, 145, 27);
        jButtonCreateExercise.setBounds(305, 155, 145, 27);
        jButtonManageExercises.setBounds(305, 200, 145, 27);
        createWorkouts.setBounds(455, 85, 295, 440);
        manageExercises.setBounds(455, 85, 295, 440);
        createExercise.setBounds(455, 85, 295, 440);
        jLabelIcon.setBounds(450, 95, 300, 330);
        menuBar.setBounds(690, 15, 45, 33);

        jListShowUsers = new JList<>();
        jListShowUsers.setLayoutOrientation(JList.VERTICAL);
        jScrollPaneListUsers.setViewportView(jListShowUsers);
        jListShowUsers.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jListShowUsersValueChanged(evt);
            }
        });

        jComboBoxShowWorkouts = new JComboBox();
        jScrollPaneListWorkouts.setViewportView(jComboBoxShowWorkouts);
        jComboBoxShowWorkouts.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
                    jComboBoxShowWorkoutsItemStateChanged(evt);
                }
            }
        });

        addComponentListener(new java.awt.event.ComponentAdapter() {
            @Override
            public void componentResized(java.awt.event.ComponentEvent evt) {
                resizeInternalPanels();
            }
        });

        setMenu();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelWelcomeNameOfInstructor = new javax.swing.JLabel();
        jScrollPaneListUsers = new javax.swing.JScrollPane();
        jScrollPaneListWorkouts = new javax.swing.JScrollPane();
        jButtonManageExercises = new javax.swing.JButton();
        jLabelIcon = new javax.swing.JLabel();
        jButtonCreateWorkout = new javax.swing.JButton();
        jLabelChooseUser = new javax.swing.JLabel();
        jLabelChooseWorkout = new javax.swing.JLabel();
        jLabelExerciseDetails = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jLabelComments = new javax.swing.JLabel();
        jButtonCreateExercise = new javax.swing.JButton();

        setOpaque(false);
        setLayout(null);

        jLabelWelcomeNameOfInstructor.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabelWelcomeNameOfInstructor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelWelcomeNameOfInstructor.setToolTipText("");
        jLabelWelcomeNameOfInstructor.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        add(jLabelWelcomeNameOfInstructor);
        jLabelWelcomeNameOfInstructor.setBounds(45, 26, 306, 37);
        add(jScrollPaneListUsers);
        jScrollPaneListUsers.setBounds(90, 130, 110, 65);

        jScrollPaneListWorkouts.setBackground(new java.awt.Color(255, 204, 51));
        add(jScrollPaneListWorkouts);
        jScrollPaneListWorkouts.setBounds(90, 250, 49, 30);

        jButtonManageExercises.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonManageExercises.setText("Manage exercise");
        jButtonManageExercises.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonManageExercises.setFocusPainted(false);
        jButtonManageExercises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonManageExercisesActionPerformed(evt);
            }
        });
        add(jButtonManageExercises);
        jButtonManageExercises.setBounds(380, 220, 140, 30);

        jLabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/runners.png"))); // NOI18N
        add(jLabelIcon);
        jLabelIcon.setBounds(480, 60, 330, 360);

        jButtonCreateWorkout.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCreateWorkout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCreateWorkout.setFocusPainted(false);
        jButtonCreateWorkout.setLabel("New workout");
        jButtonCreateWorkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateWorkoutActionPerformed(evt);
            }
        });
        add(jButtonCreateWorkout);
        jButtonCreateWorkout.setBounds(380, 130, 140, 30);

        jLabelChooseUser.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelChooseUser.setText("Choose user:");
        add(jLabelChooseUser);
        jLabelChooseUser.setBounds(90, 110, 100, 20);

        jLabelChooseWorkout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelChooseWorkout.setText("Choose workout:");
        add(jLabelChooseWorkout);
        jLabelChooseWorkout.setBounds(90, 230, 100, 20);

        jLabelExerciseDetails.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelExerciseDetails.setText("Consult workout details here:");
        add(jLabelExerciseDetails);
        jLabelExerciseDetails.setBounds(90, 310, 200, 20);

        jLabelDate.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Date", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        add(jLabelDate);
        jLabelDate.setBounds(90, 330, 120, 40);

        jLabelComments.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Comments", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 12))); // NOI18N
        add(jLabelComments);
        jLabelComments.setBounds(100, 380, 120, 23);

        jButtonCreateExercise.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCreateExercise.setText("New exercise");
        jButtonCreateExercise.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCreateExercise.setFocusPainted(false);
        jButtonCreateExercise.setMaximumSize(new java.awt.Dimension(125, 21));
        jButtonCreateExercise.setMinimumSize(new java.awt.Dimension(125, 21));
        jButtonCreateExercise.setPreferredSize(new java.awt.Dimension(125, 21));
        jButtonCreateExercise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateExerciseActionPerformed(evt);
            }
        });
        add(jButtonCreateExercise);
        jButtonCreateExercise.setBounds(380, 180, 140, 30);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método que se ejecuta cuando se presiona el botón de gestionar
     * ejercicios. Muestra el panel para gestionar los ejercicios.
     *
     * @param evt el evento del clic en el botón.
     */
    private void jButtonManageExercisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonManageExercisesActionPerformed
        jLabelIcon.setVisible(false);
        createWorkouts.setVisible(false);
        createExercise.setVisible(false);
        manageExercises.setVisible(true);
    }//GEN-LAST:event_jButtonManageExercisesActionPerformed

    /**
     * Método que se ejecuta cuando se presiona el botón de crear un nuevo
     * entrenamiento. Muestra el panel para crear un nuevo entrenamiento.
     *
     * @param evt el evento del clic en el botón.
     */
    private void jButtonCreateWorkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateWorkoutActionPerformed
        jLabelIcon.setVisible(false);
        manageExercises.setVisible(false);
        createExercise.setVisible(false);
        createWorkouts.setVisible(true);
        createWorkouts.fillComboBoxUsers(main.getId());
    }//GEN-LAST:event_jButtonCreateWorkoutActionPerformed

    /**
     * Método que se ejecuta cuando se presiona el botón de crear un nuevo
     * ejercicio. Muestra el panel para crear un nuevo ejercicio.
     *
     * @param evt el evento del clic en el botón.
     */
    private void jButtonCreateExerciseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateExerciseActionPerformed
        jLabelIcon.setVisible(false);
        manageExercises.setVisible(false);
        createWorkouts.setVisible(false);
        createExercise.setVisible(true);
    }//GEN-LAST:event_jButtonCreateExerciseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreateExercise;
    private javax.swing.JButton jButtonCreateWorkout;
    private javax.swing.JButton jButtonManageExercises;
    private javax.swing.JLabel jLabelChooseUser;
    private javax.swing.JLabel jLabelChooseWorkout;
    private javax.swing.JLabel jLabelComments;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelExerciseDetails;
    private javax.swing.JLabel jLabelIcon;
    private javax.swing.JLabel jLabelWelcomeNameOfInstructor;
    private javax.swing.JScrollPane jScrollPaneListUsers;
    private javax.swing.JScrollPane jScrollPaneListWorkouts;
    // End of variables declaration//GEN-END:variables

    /**
     * Método llamado cuando se selecciona un usuario en la lista. Actualiza el
     * ComboBox con los entrenamientos disponibles para el usuario seleccionado.
     *
     * @param evt el evento que contiene la selección del usuario.
     */
    private void jListShowUsersValueChanged(javax.swing.event.ListSelectionEvent evt) {

        Usuari selectedUsuari = jListShowUsers.getSelectedValue();
        ArrayList<Workout> workouts = DataAccess.getWorkoutsPerUser(selectedUsuari);
        DefaultComboBoxModel<Object> model = new DefaultComboBoxModel<>();
        model.addElement("-select one-");
        for (Workout workout : workouts) {
            model.addElement(workout);
        }
        jComboBoxShowWorkouts.setModel(model);
    }

    /**
     * Método llamado cuando se selecciona un entrenamiento en el ComboBox.
     * Actualiza la interfaz con los detalles del entrenamiento seleccionado.
     *
     * @param evt el evento que contiene el estado de la selección del
     * entrenamiento.
     */
    private void jComboBoxShowWorkoutsItemStateChanged(ItemEvent evt) {
        jComboBoxDetails.addItem("-exercises-");
        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            jComboBoxDetails.removeAllItems();
            Workout selectedWorkout = (Workout) jComboBoxShowWorkouts.getSelectedItem();
            ArrayList<Exercici> exercicis = DataAccess.getExercicisPerWorkout(selectedWorkout);
            for (Exercici exercici : exercicis) {
                jComboBoxDetails.addItem(exercici.toString());
            }
            LocalDateTime localDateTime = LocalDateTime.parse(selectedWorkout.getForDate(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSSS"));
            DateTimeFormatter displayFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            String formattedDate = localDateTime.format(displayFormatter);

            jLabelDate.setText(formattedDate);
            jLabelComments.setText(selectedWorkout.getComments());

            jLabelDate.setVisible(true);
            jLabelComments.setVisible(true);
            jComboBoxDetails.setVisible(true);

        }
    }

    /**
     * Muestra la lista de usuarios en el panel, actualizando la lista de
     * usuarios.
     */
    void showListOfUsers() {

        ArrayList<Usuari> usuaris = DataAccess.getAllUsersByInstructor(main.getId());
        DefaultListModel<Usuari> model = new DefaultListModel<>();
        for (Usuari usuari : usuaris) {
            model.addElement(usuari);
        }
        jListShowUsers.setModel(model);

        final int[] hoveredIndex = {-1};

        // Cambiar el renderer de la lista
        jListShowUsers.setCellRenderer(new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

                if (index == hoveredIndex[0]) {
                    label.setBackground(new Color(180, 220, 220));
                } else if (isSelected) {
                    label.setBackground(new Color(255, 204, 51));
                    label.setForeground(Color.black);
                } else {
                    label.setBackground(Color.WHITE);
                }

                label.setOpaque(true); // Hacer visible el fondo
                return label;
            }
        });

        // Añadir un MouseMotionListener para detectar el movimiento del ratón
        jListShowUsers.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                Point mousePoint = e.getPoint();
                int index = jListShowUsers.locationToIndex(mousePoint);

                // Actualizar el índice hover solo si cambió
                if (index != hoveredIndex[0]) {
                    hoveredIndex[0] = index;
                    jListShowUsers.repaint(); // Forzar re-renderización
                }
            }
        });

        // Añadir un MouseListener para limpiar el hover al salir de la lista
        jListShowUsers.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                hoveredIndex[0] = -1; // Ningún elemento está siendo hover
                jListShowUsers.repaint(); // Forzar re-renderización
            }
        });
    }

    /**
     * Establece el menú de la aplicación con las opciones disponibles. Incluye
     * un botón para cerrar sesión.
     */
    // Código generado con la ayuda de ChatGPT el 29 de enero de 2025.
    // Fuente: ChatGPT, OpenAI.
    private void setMenu() {
        JMenu jMenu = new JMenu();
        ImageIcon menuIcon = new ImageIcon(getClass().getResource("/images/MenuIcon.png"));
        jMenu.setIcon(menuIcon); // Establecer el icono en lugar del texto
        jMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                jMenu.setOpaque(true);
                jMenu.setBackground(new Color(220, 220, 220));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                jMenu.setOpaque(false);
                jMenu.setBackground(null);
            }
        });
        JMenuItem exitMenuItem = new JMenuItem("Sign out");
        exitMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                main.setLogOut();
            }
        });

        jMenu.add(exitMenuItem);
        menuBar.add(jMenu);
    }

    /**
     * Ajusta el tamaño de los paneles internos al redimensionar el panel.
     */
    private void resizeInternalPanels() {
        int panelWidth = getWidth() - 470;
        int panelHeight = getHeight() - 110;
        panelWidth = Math.max(300, panelWidth);
        panelHeight = Math.max(300, panelHeight);

        createExercise.setBounds(455, 85, panelWidth, panelHeight);
    }

    /**
     * Regresa al panel de gestión de ejercicios, ocultando los otros paneles.
     */
    public void goBackToManageExercises() {
        createExercise.setVisible(false);
        manageExercises.setVisible(true);
    }

    /**
     * Abre el panel con el icono y oculta el panel de creación de
     * entrenamientos.
     */
    public void createWorkout() {
        createWorkouts.setVisible(false);
        jLabelIcon.setVisible(true);
    }

    /**
     * Devuelve la etiqueta de bienvenida del instructor.
     *
     * @return la etiqueta de bienvenida.
     */
    public JLabel getjLabelWelcomeNameOfInstructor() {
        return jLabelWelcomeNameOfInstructor;
    }

    /**
     * Establece la etiqueta de bienvenida del instructor.
     *
     * @param jLabelWelcomeNameOfInstructor la etiqueta de bienvenida.
     */
    public void setjLabelWelcomeNameOfInstructor(javax.swing.JLabel jLabelWelcomeNameOfInstructor) {
        this.jLabelWelcomeNameOfInstructor = jLabelWelcomeNameOfInstructor;
    }

}
