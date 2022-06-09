package com.mycompany.student_result_recording_system;

import java.awt.Component;                                                      // importing necessary java libraries that are used
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Comparator.reverseOrder;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

public class Student_Result extends javax.swing.JFrame {                        // inherit from JFrame library

    public Student_Result() {
        initComponents();                                                       // initialize all components within the JFrame, including
    }                                                                           // initialize all elements, their coordinates of placements,
                                                                                // size, fonts, text included, grouping, gaps, actions
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtxtTranscript1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxtStudentID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtFirstname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtxtSurname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtCharacterBuilding = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtIndonesian = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtxtHistory = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtxtEnglish = new javax.swing.JTextField();
        jtxtArts = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtxtBiology = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtxtPhysics = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtxtChemistry = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jtxtTotalScore = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jtxtAverage = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jtxtRanking = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jcmbCourseCode = new javax.swing.JComboBox<>();
        jtxtMathematics = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        jtxtPhysicalEducation = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jtxtEnterpreneurship = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jtxtEconomics = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtxtareaTranscript = new javax.swing.JTextArea();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbtnReset = new javax.swing.JButton();
        jbtnRanking = new javax.swing.JButton();
        jbtnTranscript = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jbtnDelete = new javax.swing.JButton();

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4), "Grades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jtxtTranscript1.setColumns(20);
        jtxtTranscript1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jtxtTranscript1.setRows(5);
        jScrollPane2.setViewportView(jtxtTranscript1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Result Systems");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4), "Student Records", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 36))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Student ID:");

        jtxtStudentID.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Firstname:");

        jtxtFirstname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Surname:");

        jtxtSurname.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Character Building:");

        jtxtCharacterBuilding.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtCharacterBuilding.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtCharacterBuildingKeyTyped(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Indonesian:");

        jtxtIndonesian.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtIndonesian.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtIndonesianKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Mathematics:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("History:");

        jtxtHistory.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtHistory.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtHistoryKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("English:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Arts:");

        jtxtEnglish.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtEnglish.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtEnglishKeyTyped(evt);
            }
        });

        jtxtArts.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtArts.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtArtsKeyTyped(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Biology:");

        jtxtBiology.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtBiology.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtBiologyKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Physics:");

        jtxtPhysics.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtPhysics.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtPhysicsKeyTyped(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Chemistry:");

        jtxtChemistry.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtChemistry.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtChemistryKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Course Code:");

        jtxtTotalScore.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Average:");

        jtxtAverage.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("Ranking:");

        jtxtRanking.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("Total Score:");

        jcmbCourseCode.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jcmbCourseCode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CHAR6042001", "COMP6048001", "COMP6699001", "ENGL6171001", "ENTR6091005", "MATH6030001", "MATH6031001" }));

        jtxtMathematics.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtMathematics.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtMathematicsKeyTyped(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Physical Education:");

        jtxtPhysicalEducation.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtPhysicalEducation.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtPhysicalEducationKeyTyped(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("Enterpreneurship:");

        jtxtEnterpreneurship.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtEnterpreneurship.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtEnterpreneurshipKeyTyped(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Economics:");

        jtxtEconomics.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtxtEconomics.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtEconomicsKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jcmbCourseCode, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtxtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(6, 6, 6))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtxtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtxtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(4, 4, 4)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtxtAverage, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtTotalScore, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtArts, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtPhysicalEducation, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtEnterpreneurship, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtBiology, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtPhysics, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtChemistry, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtxtEconomics, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtxtMathematics, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jtxtCharacterBuilding, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtxtIndonesian, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jtxtHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxtCharacterBuilding, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxtIndonesian, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxtFirstname, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jtxtMathematics, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jtxtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel13)
                        .addComponent(jcmbCourseCode, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxtHistory, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jtxtEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 23, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtArts, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jtxtPhysicalEducation, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jtxtBiology, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel16)
                                        .addComponent(jtxtTotalScore, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jtxtPhysics, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel11)))
                                .addGap(5, 5, 5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(3, 3, 3))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jtxtEnterpreneurship, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtxtAverage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jtxtChemistry, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jtxtEconomics, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(jtxtRanking, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))))
                .addGap(19, 19, 19))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 0, 750, 490));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4), "Grades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jtxtareaTranscript.setColumns(20);
        jtxtareaTranscript.setRows(5);
        jScrollPane3.setViewportView(jtxtareaTranscript);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 382, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 410, 410));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Course Code", "Character Building", "Indonesian", "Mathematics", "History", "English", "Arts", "Physical Education", "Enterpreneurship", "Biology", "Physics", "Chemistry", "Economics", "Total Score", "Average", "Ranking"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(110);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(5).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(6).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(7).setPreferredWidth(30);
            jTable1.getColumnModel().getColumn(8).setPreferredWidth(110);
            jTable1.getColumnModel().getColumn(9).setPreferredWidth(100);
            jTable1.getColumnModel().getColumn(10).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(11).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(12).setPreferredWidth(60);
            jTable1.getColumnModel().getColumn(13).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(14).setPreferredWidth(70);
            jTable1.getColumnModel().getColumn(15).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(16).setPreferredWidth(50);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, 1260, 140));

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 460, 120, -1));

        jbtnRanking.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnRanking.setText("Ranking");
        jbtnRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRankingActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnRanking, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 420, 120, -1));

        jbtnTranscript.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnTranscript.setText("Transcript");
        jbtnTranscript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTranscriptActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnTranscript, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 420, -1, -1));

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 440, 120, -1));

        jbtnDelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jbtnDelete.setText("Delete");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 460, 120, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        JTextField temp = null;                                                 // when reset button is pressed, declare temp = null
        for(Component c:jPanel1.getComponents()) {                              // for every component in jPanel1
            if(c.getClass().toString().contains("javax.swing.JTextField")) {    // if it is a part of JTextField
                temp = (JTextField)c;                                           // temp will be equal to all JTextField and set to null
                temp.setText(null);
            }
        }
    }//GEN-LAST:event_jbtnResetActionPerformed

    private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
        frame = new JFrame("Exit");                                             // when exit button is pressed, initialize new JFrame named exit
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit",  // show "Confirm if you want to exit" in the JFrame
           "Student Result System", JOptionPane.YES_NO_OPTION)                  // titled "Student Result System" with JOPtionPane yes or no
           == JOptionPane.YES_NO_OPTION) {
            System.exit(0);                                                     // if yes exit the app, if no continue in the app
        }
    }//GEN-LAST:event_jbtnExitActionPerformed

    ArrayList<Double> rank = new ArrayList<>();
    private void jbtnRankingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnRankingActionPerformed
        double[] R = new double[18];                                            // declare array to contain all scores
        R[0] = Double.parseDouble(jtxtCharacterBuilding.getText());             // index 0 for jtxtCharacterBuilding
        R[1] = Double.parseDouble(jtxtIndonesian.getText());                    // index 1 for jtxtIndonesian
        R[2] = Double.parseDouble(jtxtMathematics.getText());                   // index 2 for jtxtMathematics
        R[3] = Double.parseDouble(jtxtHistory.getText());                       // index 3 for jtxtHistory
        R[4] = Double.parseDouble(jtxtEnglish.getText());                       // index 4 for jtxtEnglish
        R[5] = Double.parseDouble(jtxtArts.getText());                          // index 5 for jtxtArts
        R[6] = Double.parseDouble(jtxtPhysicalEducation.getText());             // index 6 for jtxtPhysicalEducation
        R[7] = Double.parseDouble(jtxtEnterpreneurship.getText());              // index 7 for jtxtEnterpreneurship
        R[8] = Double.parseDouble(jtxtBiology.getText());                       // index 8 for jtxtBiology
        R[9] = Double.parseDouble(jtxtPhysics.getText());                       // index 9 for jtxtPhysics
        R[10] = Double.parseDouble(jtxtChemistry.getText());                    // index 10 for jtxtChemistry
        R[11] = Double.parseDouble(jtxtEconomics.getText());                    // index 11 for jtxtEconomics
        
        R[12] = R[0] + R[1] + R[2] + R[3] + R[4] + R[5] + R[6] + R[7] + R[8]    // index 12 for jtxtTotalScore
                + R[9] + R[10] + R[11];
        R[13] = (R[0] + R[1] + R[2] + R[3] + R[4] + R[5] + R[6] + R[7] + R[8]   // index 13 for jtxtAverage
                + R[9] + R[10] + R[11]) / 12;
        
        String TotalScore = String.format("%.0f", R[12]);                       // format TotalScore to 0 decimal place and to string
        jtxtTotalScore.setText(TotalScore);                                     // set to jtxtTotalScore
        String Average = String.format("%.0f", R[13]);                          // format Average to 0 decimal place and to string
        jtxtAverage.setText(Average);                                           // set to jtxtAverage
        
        rank.add(R[12]);
        rank.sort(reverseOrder());
        for (int i = 0; i < rank.size(); i++) {
            if (rank.get(i) == 0) {
                jtxtRanking.setText("1st");
            }
            else if (rank.get(i) == 1) {
                jtxtRanking.setText("2nd");
            }
            else if (rank.get(i) == 2) {
                jtxtRanking.setText("3rd");
            }
            else {
                jtxtRanking.setText((i + 1) + "th");
            }
        }
        
//        if(R[12] >= 1200) {                                                     // if total score is more than 1200
//            jtxtRanking.setText("1st");                                         // set jtxtRanking to 1st
//        } else if(R[12] >= 1100) {                                              // else if total score is more than 1200
//            jtxtRanking.setText("2nd");                                         // set jtxtRanking to 2nd
//        } else if(R[12] >= 1000) {                                              // else if total score is more than 1200
//            jtxtRanking.setText("3rd");                                         // set jtxtRanking to 3rd
//        } else if(R[12] >= 900) {                                               // else if total score is more than 1200
//            jtxtRanking.setText("4th");                                         // set jtxtRanking to 4th
//        } else if(R[12] >= 800) {                                               // else if total score is more than 1200
//            jtxtRanking.setText("5th");                                         // set jtxtRanking to 5th
//        } else if(R[12] >= 700) {                                               // else if total score is more than 1200
//            jtxtRanking.setText("6nd");                                         // set jtxtRanking to 6th
//        } else if(R[12] >= 600) {                                               // else if total score is more than 1200
//            jtxtRanking.setText("7th");                                         // set jtxtRanking to 7th
//        } else if(R[12] >= 500) {                                               // else if total score is more than 1200
//            jtxtRanking.setText("8th");                                         // set jtxtRanking to 8th
//        } else if(R[12] >= 400) {                                               // else if total score is more than 1200
//            jtxtRanking.setText("9th");                                         // set jtxtRanking to 9th
//        } else if(R[12] >= 300) {                                               // else if total score is more than 1200
//            jtxtRanking.setText("10th");                                        // set jtxtRanking to 10th
//        } else if(R[12] >= 200) {                                               // else if total score is more than 1200
//            jtxtRanking.setText("11th");                                        // set jtxtRanking to 11th
//        } else if(R[12] >= 100) {                                               // else if total score is more than 1200
//            jtxtRanking.setText("12th");                                        // set jtxtRanking to 12th
//        } else if(R[12] < 100) {                                                // else if total score is more than 1200
//            jtxtRanking.setText("FAIL");                                        // set jtxtRanking to FAIL
//        }
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();       // declare and get jTable1 model
        model.addRow(new Object[] {                                             // add necessary texts to rows in the jTable1
            jtxtStudentID.getText(),
            jcmbCourseCode.getSelectedItem(),
            jtxtCharacterBuilding.getText(),
            jtxtIndonesian.getText(),
            jtxtMathematics.getText(),
            jtxtHistory.getText(),
            jtxtEnglish.getText(),
            jtxtArts.getText(),
            jtxtPhysicalEducation.getText(),
            jtxtEnterpreneurship.getText(),
            jtxtBiology.getText(),
            jtxtPhysics.getText(),
            jtxtChemistry.getText(),
            jtxtEconomics.getText(),
            jtxtTotalScore.getText(),
            jtxtAverage.getText(),
            jtxtRanking.getText(),
        });
    }//GEN-LAST:event_jbtnRankingActionPerformed

    private void jbtnTranscriptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnTranscriptActionPerformed
        jtxtareaTranscript.setText(null);                                       // set to null to clear everytime transcript button is pressed
        jtxtareaTranscript.append("Student Result Recording Systems"            // append/print the transcripted text
        + "\n=========================="
        + "\n" + jtxtStudentID.getText() + ":\t" + jtxtFirstname.getText() + " "
          + jtxtSurname.getText()
        + "\nCharacter Building\t: " + jtxtCharacterBuilding.getText()
        + "\nIndonesian\t\t: "       + jtxtIndonesian.getText()
        + "\nMathematics\t\t: "      + jtxtMathematics.getText()
        + "\nHistory\t\t: "          + jtxtHistory.getText()
        + "\nEnglish\t\t: "          + jtxtEnglish.getText()
        + "\nArts\t\t: "             + jtxtArts.getText()
        + "\nPhysical Education\t: " + jtxtPhysicalEducation.getText()
        + "\nEnterpreneurship\t: "   + jtxtEnterpreneurship.getText()
        + "\nBiology\t\t: "          + jtxtBiology.getText()
        + "\nPhysics\t\t: "          + jtxtPhysics.getText()
        + "\nChemistry\t\t: "        + jtxtChemistry.getText()
        + "\nEconomics\t\t: "        + jtxtEconomics.getText()
        + "\n=========================="
        + "\nTotal Score\t\t: "      + jtxtTotalScore.getText()
        + "\nAverage\t\t: "          + jtxtAverage.getText()
        + "\nRanking\t\t: "          + jtxtRanking.getText());
    }//GEN-LAST:event_jbtnTranscriptActionPerformed

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnDeleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();       // declare and get jTable1 model
        if(jTable1.getSelectedRow() == -1) {                                    // if the user does not select a row in jTable1
            if(jTable1.getRowCount() == 0) {                                    // if the row count in jTable equals to 0
                String message = "No data to delete\nSelect row to delete";     // declare message
                JOptionPane.showMessageDialog(null, message,                    // show message in new JFrame
                "Student Result System", JOptionPane.OK_OPTION);                // titled "Student Result System" with JOPtionPane ok
            }
        } else {                                                                // else the row counr in jTable1 more than 0
                model.removeRow(jTable1.getSelectedRow());                      // remove selected row in jTable1
        }
    }//GEN-LAST:event_jbtnDeleteActionPerformed

    private void jtxtEconomicsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtEconomicsKeyTyped
        char iNumber = evt.getKeyChar();                                        // input text in text field for every character
        if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) // if the character is digit or pressed backspace
           || (iNumber == KeyEvent.VK_DELETE)) {                                // or pressed delete
            evt.consume();                                                      // it will eliminate or not process the character
        }
    }//GEN-LAST:event_jtxtEconomicsKeyTyped

    private void jtxtEnterpreneurshipKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtEnterpreneurshipKeyTyped
        char iNumber = evt.getKeyChar();                                        // input text in text field for every character
        if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) // if the character is digit or pressed backspace
           || (iNumber == KeyEvent.VK_DELETE)) {                                // or pressed delete
            evt.consume();                                                      // it will eliminate or not process the character
        }
    }//GEN-LAST:event_jtxtEnterpreneurshipKeyTyped

    private void jtxtPhysicalEducationKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtPhysicalEducationKeyTyped
        char iNumber = evt.getKeyChar();                                        // input text in text field for every character
        if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) // if the character is digit or pressed backspace
           || (iNumber == KeyEvent.VK_DELETE)) {                                // or pressed delete
            evt.consume();                                                      // it will eliminate or not process the character
        }
    }//GEN-LAST:event_jtxtPhysicalEducationKeyTyped

    private void jtxtMathematicsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtMathematicsKeyTyped
        char iNumber = evt.getKeyChar();                                        // input text in text field for every character
        if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) // if the character is digit or pressed backspace
           || (iNumber == KeyEvent.VK_DELETE)) {                                // or pressed delete
            evt.consume();                                                      // it will eliminate or not process the character
        }
    }//GEN-LAST:event_jtxtMathematicsKeyTyped

    private void jtxtChemistryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtChemistryKeyTyped
        char iNumber = evt.getKeyChar();                                        // input text in text field for every character
        if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) // if the character is digit or pressed backspace
           || (iNumber == KeyEvent.VK_DELETE)) {                                // or pressed delete
            evt.consume();                                                      // it will eliminate or not process the character
        }
    }//GEN-LAST:event_jtxtChemistryKeyTyped

    private void jtxtPhysicsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtPhysicsKeyTyped
        char iNumber = evt.getKeyChar();                                        // input text in text field for every character
        if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) // if the character is digit or pressed backspace
           || (iNumber == KeyEvent.VK_DELETE)) {                                // or pressed delete
            evt.consume();                                                      // it will eliminate or not process the character
        }
    }//GEN-LAST:event_jtxtPhysicsKeyTyped

    private void jtxtBiologyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtBiologyKeyTyped
        char iNumber = evt.getKeyChar();                                        // input text in text field for every character
        if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) // if the character is digit or pressed backspace
           || (iNumber == KeyEvent.VK_DELETE)) {                                // or pressed delete
            evt.consume();                                                      // it will eliminate or not process the character
        }
    }//GEN-LAST:event_jtxtBiologyKeyTyped

    private void jtxtArtsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtArtsKeyTyped
        char iNumber = evt.getKeyChar();                                        // input text in text field for every character
        if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) // if the character is digit or pressed backspace
           || (iNumber == KeyEvent.VK_DELETE)) {                                // or pressed delete
            evt.consume();                                                      // it will eliminate or not process the character
        }
    }//GEN-LAST:event_jtxtArtsKeyTyped

    private void jtxtEnglishKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtEnglishKeyTyped
        char iNumber = evt.getKeyChar();                                        // input text in text field for every character
        if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) // if the character is digit or pressed backspace
           || (iNumber == KeyEvent.VK_DELETE)) {                                // or pressed delete
            evt.consume();                                                      // it will eliminate or not process the character
        }
    }//GEN-LAST:event_jtxtEnglishKeyTyped

    private void jtxtHistoryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtHistoryKeyTyped
        char iNumber = evt.getKeyChar();                                        // input text in text field for every character
        if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) // if the character is digit or pressed backspace
           || (iNumber == KeyEvent.VK_DELETE)) {                                // or pressed delete
            evt.consume();                                                      // it will eliminate or not process the character
        }
    }//GEN-LAST:event_jtxtHistoryKeyTyped

    private void jtxtIndonesianKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtIndonesianKeyTyped
        char iNumber = evt.getKeyChar();                                        // input text in text field for every character
        if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) // if the character is digit or pressed backspace
           || (iNumber == KeyEvent.VK_DELETE)) {                                // or pressed delete
            evt.consume();                                                      // it will eliminate or not process the character
        }
    }//GEN-LAST:event_jtxtIndonesianKeyTyped

    private void jtxtCharacterBuildingKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtxtCharacterBuildingKeyTyped
        char iNumber = evt.getKeyChar();                                        // input text in text field for every character
        if(!(Character.isDigit(iNumber)) || (iNumber == KeyEvent.VK_BACK_SPACE) // if the character is digit or pressed backspace
           || (iNumber == KeyEvent.VK_DELETE)) {                                // or pressed delete
            evt.consume();                                                      // it will eliminate or not process the character
        }
    }//GEN-LAST:event_jtxtCharacterBuildingKeyTyped

    public static void main(String args[]) throws ClassNotFoundException,       // throws execption for jtattoo during execution
                                           InstantiationException,
                                           IllegalAccessException,
                                           UnsupportedLookAndFeelException {

        UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel"); // set UIManager to AluminiumLookAndFeel
        java.awt.EventQueue.invokeLater(new Runnable() {                        // to update the GUI to be responsive and completing
            public void run() {                                                 // the swing java methods with EDT
                new Student_Result().setVisible(true);                          // run the Student_Result and set the GUI to be visible
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnRanking;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnTranscript;
    private javax.swing.JComboBox<String> jcmbCourseCode;
    private javax.swing.JTextField jtxtArts;
    private javax.swing.JTextField jtxtAverage;
    private javax.swing.JTextField jtxtBiology;
    private javax.swing.JTextField jtxtCharacterBuilding;
    private javax.swing.JTextField jtxtChemistry;
    private javax.swing.JTextField jtxtEconomics;
    private javax.swing.JTextField jtxtEnglish;
    private javax.swing.JTextField jtxtEnterpreneurship;
    private javax.swing.JTextField jtxtFirstname;
    private javax.swing.JTextField jtxtHistory;
    private javax.swing.JTextField jtxtIndonesian;
    private javax.swing.JTextField jtxtMathematics;
    private javax.swing.JTextField jtxtPhysicalEducation;
    private javax.swing.JTextField jtxtPhysics;
    private javax.swing.JTextField jtxtRanking;
    private javax.swing.JTextField jtxtStudentID;
    private javax.swing.JTextField jtxtSurname;
    private javax.swing.JTextField jtxtTotalScore;
    private javax.swing.JTextArea jtxtTranscript1;
    private javax.swing.JTextArea jtxtareaTranscript;
    // End of variables declaration//GEN-END:variables
}
