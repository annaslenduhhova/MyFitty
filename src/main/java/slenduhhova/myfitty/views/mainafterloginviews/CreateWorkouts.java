package slenduhhova.myfitty.views.mainafterloginviews;

import com.anna.calendar.DayClickedListener;
import com.anna.calendar.MyCalendar;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import slenduhhova.myfitty.dataaccess.DataAccess;
import slenduhhova.myfitty.dto.Exercici;
import slenduhhova.myfitty.dto.Usuari;
import slenduhhova.myfitty.dto.Workout;
import slenduhhova.myfitty.views.mainviews.MainAfterLogin;

/**
 *
 * @author annas
 */
public class CreateWorkouts extends javax.swing.JPanel {

    private MainAfterLogin mainAfterLogin;
    private JList<Integer> jListExercises;
    private ArrayList<Exercici> exercicis;
    private JComboBox<Object> jComboBoxShowAllUsers;

    public CreateWorkouts(MainAfterLogin mainAfterLogin) {
        this.mainAfterLogin = mainAfterLogin;
        initComponents();
        setSize(300, 440);
        setBackground(new Color(240, 240, 240));

        jLabelCalendario.setText(formatDate());
        jListExercises = new JList<>();
        jListExercises.setLayoutOrientation(JList.VERTICAL);
        jListExercises.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPaneExcercises.setViewportView(jListExercises);

        jComboBoxShowAllUsers = new JComboBox<>();
        jScrollPaneUserName.setViewportView(jComboBoxShowAllUsers);
        jButtonCalendario.setToolTipText("Press icon to choose date");
        jListExercises.setToolTipText("<html>Hold <b>Ctrl</b> to choose multiple options</html>");

        fillListExcercises();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelUser = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jLabelExcercises = new javax.swing.JLabel();
        jScrollPaneExcercises = new javax.swing.JScrollPane();
        jScrollPaneComments = new javax.swing.JScrollPane();
        jTextAreaComments = new javax.swing.JTextArea();
        jButtonCreateWorkout = new javax.swing.JButton();
        jScrollPaneUserName = new javax.swing.JScrollPane();
        jButtonCalendario = new javax.swing.JButton();
        jLabelCalendario = new javax.swing.JLabel();

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelUser.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelUser.setText("User name:");
        jLabelUser.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabelName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelName.setText("Comments:");
        jLabelName.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabelDate.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelDate.setText("Date:");
        jLabelDate.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabelExcercises.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelExcercises.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelExcercises.setText("Exercises:");
        jLabelExcercises.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jScrollPaneExcercises.setBackground(new java.awt.Color(255, 204, 51));
        jScrollPaneExcercises.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPaneExcercises.setNextFocusableComponent(jButtonCreateWorkout);

        jTextAreaComments.setColumns(20);
        jTextAreaComments.setRows(5);
        jTextAreaComments.setNextFocusableComponent(jScrollPaneExcercises);
        jScrollPaneComments.setViewportView(jTextAreaComments);

        jButtonCreateWorkout.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButtonCreateWorkout.setText("Create");
        jButtonCreateWorkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateWorkoutActionPerformed(evt);
            }
        });

        jScrollPaneUserName.setBackground(new java.awt.Color(255, 204, 51));
        jScrollPaneUserName.setNextFocusableComponent(jScrollPaneComments);

        jButtonCalendario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Calendar.png"))); // NOI18N
        jButtonCalendario.setAlignmentY(0.0F);
        jButtonCalendario.setBorder(null);
        jButtonCalendario.setBorderPainted(false);
        jButtonCalendario.setContentAreaFilled(false);
        jButtonCalendario.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jButtonCalendario.setFocusPainted(false);
        jButtonCalendario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButtonCalendario.setIconTextGap(0);
        jButtonCalendario.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButtonCalendario.setPreferredSize(new java.awt.Dimension(31, 31));
        jButtonCalendario.setRequestFocusEnabled(false);
        jButtonCalendario.setRolloverEnabled(false);
        jButtonCalendario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCalendarioActionPerformed(evt);
            }
        });

        jLabelCalendario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCalendario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabelCalendario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabelCalendario.setNextFocusableComponent(jScrollPaneUserName);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelExcercises, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPaneExcercises, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelUser, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPaneComments, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPaneUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jButtonCreateWorkout, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCalendario, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCalendario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabelUser, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(jScrollPaneUserName))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneComments, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabelExcercises, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jScrollPaneExcercises, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonCreateWorkout)
                .addGap(17, 17, 17))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCreateWorkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateWorkoutActionPerformed
        try {
            insertWorkout();
            JOptionPane.showMessageDialog(null, "New workout is added successfully!", "Workout", JOptionPane.PLAIN_MESSAGE);
            mainAfterLogin.createWorkout();
        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(null, "The date format is incorrect.", "Date Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An unexpected error occurred. Please try again.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonCreateWorkoutActionPerformed

    private void jButtonCalendarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCalendarioActionPerformed
        JFrame calendarFrame = new JFrame("Select Date");
        calendarFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        calendarFrame.setSize(400, 300);
        calendarFrame.setLocationRelativeTo(null);

        MyCalendar calendar = new MyCalendar();
        calendar.addDayClickedListener(new DayClickedListener() {
            @Override
            public void dayClicked(Date date) {
                jLabelCalendario.setText(new SimpleDateFormat("dd/MM/yyyy").format(date));
                calendarFrame.dispose(); // Cierra la ventana después de seleccionar una fecha
            }
        });

        calendarFrame.add(calendar);
        calendarFrame.setVisible(true);
    }//GEN-LAST:event_jButtonCalendarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCalendario;
    private javax.swing.JButton jButtonCreateWorkout;
    private javax.swing.JLabel jLabelCalendario;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelExcercises;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JScrollPane jScrollPaneComments;
    private javax.swing.JScrollPane jScrollPaneExcercises;
    private javax.swing.JScrollPane jScrollPaneUserName;
    private javax.swing.JTextArea jTextAreaComments;
    // End of variables declaration//GEN-END:variables

    private Workout createWorkout() {

        String date = formatDateToSql();
        Usuari selectedUser = (Usuari) jComboBoxShowAllUsers.getSelectedItem();
        int idUser = selectedUser.getId();
        String comments = jTextAreaComments.getText();

        Workout workout = new Workout();
        workout.setForDate(date);
        workout.setUserId(idUser);
        workout.setComments(comments);

        return workout;
    }

    private String formatDateToSql() {
        try {
            String selectedDateText = jLabelCalendario.getText();

            DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate localDate = LocalDate.parse(selectedDateText, inputFormatter);

            LocalDateTime localDateTime = localDate.atStartOfDay();

            DateTimeFormatter sqlFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSSS");
            String formattedDateForSQL = localDateTime.format(sqlFormatter);

            return formattedDateForSQL;
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("La fecha en el JLabel no está en el formato esperado (dd.MM.yyyy).", e);
        }
    }

    public void fillComboBoxUsers(int id) {

        ArrayList<Usuari> usuaris = DataAccess.getAllUsersByInstructor(id);
        jComboBoxShowAllUsers.addItem("-select one-");
        for (Usuari usuari : usuaris) {
            jComboBoxShowAllUsers.addItem(usuari);
        }
    }

    private void fillListExcercises() {

        exercicis = DataAccess.getAllExercicis();
        DefaultListModel<Integer> model = new DefaultListModel<>();
        for (Exercici exercici : exercicis) {
            model.addElement(exercici.getId());
        }

        jListExercises.setModel(model);
    }

    private void insertWorkout() {

        ArrayList<Exercici> selectedExercises = new ArrayList<>();
        List<Integer> selectedIds = jListExercises.getSelectedValuesList();

        for (Exercici exercici : exercicis) {
            if (selectedIds.contains(exercici.getId())) {
                selectedExercises.add(exercici);
            }
        }
        DataAccess.insertWorkout(createWorkout(), selectedExercises);
    }

    private String formatDate() {
        LocalDate today = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = today.format(formatter);

        return formattedDate;
    }

}
