package slenduhhova.myfitty;

import java.awt.Color;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import slenduhhova.myfitty.dataaccess.DataAccess;
import slenduhhova.myfitty.dto.Exercici;
import slenduhhova.myfitty.dto.Workout;

/**
 *
 * @author annas
 */

public class CreateWorkouts extends javax.swing.JPanel {

    /**
     * Creates new form CreateWorkouts
     */
    
    private JList<Integer> jListExercises;
    ArrayList<Exercici> exercicis;
    
    public CreateWorkouts() {
        initComponents();
        setSize(300, 450);
        setBackground(new Color(240, 240, 240));
        
        jListExercises = new JList<>();
        jListExercises.setLayoutOrientation(JList.VERTICAL_WRAP);
        jListExercises.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jScrollPaneExcercises.setViewportView(jListExercises);
        
        fillListExcercises();        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelUser = new javax.swing.JLabel();
        jLabelName = new javax.swing.JLabel();
        jLabelDate = new javax.swing.JLabel();
        jLabelExcercises = new javax.swing.JLabel();
        jTextUser = new javax.swing.JTextField();
        jTextDate = new javax.swing.JTextField();
        jScrollPaneExcercises = new javax.swing.JScrollPane();
        jScrollPaneComments = new javax.swing.JScrollPane();
        jTextAreaComments = new javax.swing.JTextArea();
        jButtonCreateWorkout = new javax.swing.JButton();

        setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelUser.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabelUser.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelUser.setText("User ID:");
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

        jScrollPaneExcercises.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextAreaComments.setColumns(20);
        jTextAreaComments.setRows(5);
        jScrollPaneComments.setViewportView(jTextAreaComments);

        jButtonCreateWorkout.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButtonCreateWorkout.setText("Create");
        jButtonCreateWorkout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateWorkoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextDate, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelExcercises, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneExcercises, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPaneComments, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextUser, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(72, 72, 72))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jButtonCreateWorkout, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDate, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextDate, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(jLabelName, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPaneComments, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabelExcercises, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, Short.MAX_VALUE)
                        .addComponent(jScrollPaneExcercises, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)))
                .addComponent(jButtonCreateWorkout, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCreateWorkoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateWorkoutActionPerformed
        insertWorkout();
        JOptionPane.showMessageDialog(null, "New workouts is added successfully!", "Workout", JOptionPane.PLAIN_MESSAGE);
    }//GEN-LAST:event_jButtonCreateWorkoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCreateWorkout;
    private javax.swing.JLabel jLabelDate;
    private javax.swing.JLabel jLabelExcercises;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JScrollPane jScrollPaneComments;
    private javax.swing.JScrollPane jScrollPaneExcercises;
    private javax.swing.JTextArea jTextAreaComments;
    private javax.swing.JTextField jTextDate;
    private javax.swing.JTextField jTextUser;
    // End of variables declaration//GEN-END:variables


    private Workout createWorkout(){

        String date = formatDate();
        int idUser = Integer.valueOf(jTextUser.getText());
        String comments = jTextAreaComments.getText();
        
        Workout workout = new Workout();
        workout.setForDate(date);
        workout.setUserId(idUser);
        workout.setComments(comments);
        
        return workout;
    }

    private String formatDate(){

        String dateToFormat = jTextDate.getText();
        DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime localDateTime;
        localDateTime = LocalDateTime.parse(dateToFormat + " 00:00:00", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        DateTimeFormatter sqlFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSSSSSS");
        String formattedDateForSQL = localDateTime.format(sqlFormatter);

    return formattedDateForSQL;
    }
                     
    private void fillListExcercises(){
        
        DataAccess da = new DataAccess();
        exercicis = da.getAllExercicis();        
        DefaultListModel<Integer> model = new DefaultListModel<>();
        for (Exercici exercici : exercicis) {
            model.addElement(exercici.getId());
        }
        
        jListExercises.setModel(model);         
    }
    
    private void insertWorkout(){    
        
        DataAccess da = new DataAccess();       
        ArrayList<Exercici> selectedExercises = new ArrayList<>();   
        List<Integer> selectedIds = jListExercises.getSelectedValuesList();
    
        for (Exercici exercici : exercicis) {
            if (selectedIds.contains(exercici.getId())) {
                selectedExercises.add(exercici);
            }
        }    
        da.insertWorkout(createWorkout(), selectedExercises);      
    }
}