package slenduhhova.myfitty.views.mainviews;

import java.awt.Color;
import java.awt.Component;
import java.awt.Point;
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
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.event.ListSelectionListener;
import slenduhhova.myfitty.dataaccess.DataAccess;
import slenduhhova.myfitty.views.mainafterloginviews.CreateWorkouts;
import slenduhhova.myfitty.views.mainafterloginviews.CreateExercise;
import slenduhhova.myfitty.views.mainafterloginviews.ManageExercises;
import slenduhhova.myfitty.dto.Exercici;
import slenduhhova.myfitty.dto.Usuari;
import slenduhhova.myfitty.dto.Workout;

/**
 *
 * @author annas
 */
public class MainAfterLogin extends javax.swing.JPanel {

    private Main main;
    private javax.swing.JList<Usuari> jListShowUsers;
    private JComboBox<Object> jComboBoxShowWorkouts;
    private CreateWorkouts createWorkouts;
    private ManageExercises manageExercises;
    private CreateExercise createExercise;
    private JComboBox jComboBoxDetails;

    public MainAfterLogin(Main main) {
        this.main = main;
        initComponents();
        setSize(800, 600);
        setBackground(new Color(240, 240, 240));

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
        jLabelWelcomeNameOfInstructor.setBounds(welcomeX, 30, 306, 37);
        jScrollPaneListUsers.setBounds(60, 140, 130, 70);
        jScrollPaneListWorkouts.setBounds(60, 270, 102, 32);
        jLabelDate.setBounds(60, 360, 80, 45);
        jLabelComments.setBounds(160, 360, 140, 45);
        jComboBoxDetails.setBounds(60, 410, 240, 40);
        jLabelChooseUser.setBounds(60, 110, 140, 15);
        jLabelChooseWorkout.setBounds(60, 240, 140, 15);
        jLabelExerciseDetails.setBounds(60, 330, 230, 15);
        jButtonCreateWorkout.setBounds(305, 110, 145, 27);
        jButtonManageExercises.setBounds(305, 155, 145, 27);
        createWorkouts.setBounds(455, 85, 295, 440);
        manageExercises.setBounds(455, 85, 295, 440);
        createExercise.setBounds(455, 85, 295, 440);
        jLabelIcon.setBounds(450, 95, 300, 330);
        jButtonSignOut.setBounds(690, 15, 80, 25);

        jListShowUsers = new JList<>();
        jListShowUsers.setLayoutOrientation(JList.VERTICAL_WRAP);
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
        jButtonSignOut = new javax.swing.JButton();
        jLabelChooseUser = new javax.swing.JLabel();
        jLabelChooseWorkout = new javax.swing.JLabel();
        jLabelExerciseDetails = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jLabelComments = new javax.swing.JLabel();

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
        add(jScrollPaneListWorkouts);
        jScrollPaneListWorkouts.setBounds(90, 250, 49, 30);

        jButtonManageExercises.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonManageExercises.setText("Manage exercise");
        jButtonManageExercises.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonManageExercises.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonManageExercisesActionPerformed(evt);
            }
        });
        add(jButtonManageExercises);
        jButtonManageExercises.setBounds(380, 170, 140, 30);

        jLabelIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/runners.png"))); // NOI18N
        add(jLabelIcon);
        jLabelIcon.setBounds(480, 50, 330, 360);

        jButtonCreateWorkout.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButtonCreateWorkout.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCreateWorkout.setLabel("New workout");
        jButtonCreateWorkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateWorkoutActionPerformed(evt);
            }
        });
        add(jButtonCreateWorkout);
        jButtonCreateWorkout.setBounds(380, 130, 140, 30);

        jButtonSignOut.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButtonSignOut.setText("Sign out");
        jButtonSignOut.setFocusPainted(false);
        jButtonSignOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSignOutActionPerformed(evt);
            }
        });
        add(jButtonSignOut);
        jButtonSignOut.setBounds(685, 10, 100, 23);

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

        jLabelDate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabelDate.setBorder(javax.swing.BorderFactory.createTitledBorder("Date"));
        add(jLabelDate);
        jLabelDate.setBounds(90, 330, 120, 40);

        jLabelComments.setBorder(javax.swing.BorderFactory.createTitledBorder("Comments"));
        add(jLabelComments);
        jLabelComments.setBounds(100, 380, 120, 23);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonManageExercisesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonManageExercisesActionPerformed
        jLabelIcon.setVisible(false);
        createWorkouts.setVisible(false);
        createExercise.setVisible(false);
        manageExercises.setVisible(true);
    }//GEN-LAST:event_jButtonManageExercisesActionPerformed

    private void jButtonCreateWorkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateWorkoutActionPerformed
        jLabelIcon.setVisible(false);
        manageExercises.setVisible(false);
        createExercise.setVisible(false);
        createWorkouts.setVisible(true);
        createWorkouts.fillComboBoxUsers(main.getId());
    }//GEN-LAST:event_jButtonCreateWorkoutActionPerformed

    private void jButtonSignOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSignOutActionPerformed
        main.setLogOut();
    }//GEN-LAST:event_jButtonSignOutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreateWorkout;
    private javax.swing.JButton jButtonManageExercises;
    private javax.swing.JButton jButtonSignOut;
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

                // Cambiar el fondo si el índice coincide con el que tiene el ratón encima
                if (index == hoveredIndex[0]) {
                    label.setBackground(new Color(220, 220, 220)); // Azul oscuro para hover
                } else if (isSelected) {
                    label.setBackground(new Color(180, 220, 220)); // Color para elementos seleccionados
                } else {
                    label.setBackground(Color.WHITE); // Fondo por defecto
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

    private void resizeInternalPanels() {
        int panelWidth = getWidth() - 470;
        int panelHeight = getHeight() - 110;
        panelWidth = Math.max(300, panelWidth);
        panelHeight = Math.max(300, panelHeight);

        createExercise.setBounds(455, 85, panelWidth, panelHeight);
    }

    public void goBackToManageExercises() {
        createExercise.setVisible(false);
        manageExercises.setVisible(true);
    }

    public void createWorkout() {
        createWorkouts.setVisible(false);
        jLabelIcon.setVisible(true);
    }

    public void createExercise() {
        manageExercises.setVisible(false);
        createExercise.setVisible(true);
    }

    public javax.swing.JLabel getjLabelWelcomeNameOfInstructor() {
        return jLabelWelcomeNameOfInstructor;
    }

    public void setjLabelWelcomeNameOfInstructor(javax.swing.JLabel jLabelWelcomeNameOfInstructor) {
        this.jLabelWelcomeNameOfInstructor = jLabelWelcomeNameOfInstructor;
    }

}
