/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Students_Result;

import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author paul.oamen
 */
public class Student_Result extends javax.swing.JFrame {

    /** Creates new form Student_Result */
    public Student_Result() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jtxtStudentID = new javax.swing.JTextField();
        jtxtFirstname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtxtSurname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtRanking = new javax.swing.JTextField();
        jtxtAverage = new javax.swing.JTextField();
        jtxtTotalScore = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtxtPhysics = new javax.swing.JTextField();
        jtxtChemistry = new javax.swing.JTextField();
        jtxtComputing = new javax.swing.JTextField();
        jtxtBiology = new javax.swing.JTextField();
        jtxtEnglish = new javax.swing.JTextField();
        jtxtMaths = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jtxtAddMaths = new javax.swing.JTextField();
        jtxtBusiness = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jcmbCourseCode = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtTranscript = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbtnTranscript = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnRanking = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jbtnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Student Result Systems");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4), "Student Records", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Student_ID:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jtxtStudentID.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(jtxtStudentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 250, -1));

        jtxtFirstname.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(jtxtFirstname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 250, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Firstname:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jtxtSurname.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(jtxtSurname, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 250, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Surname:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setText("Ranking:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        jtxtRanking.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(jtxtRanking, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 250, -1));

        jtxtAverage.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(jtxtAverage, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 250, -1));

        jtxtTotalScore.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(jtxtTotalScore, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, 250, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setText("Course Code:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Average:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jtxtPhysics.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtPhysics.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtPhysicsKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtPhysics, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 250, -1));

        jtxtChemistry.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtChemistry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtChemistryActionPerformed(evt);
            }
        });
        jtxtChemistry.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtChemistryKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtChemistry, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 240, 250, -1));

        jtxtComputing.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtComputing.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtComputingKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtComputing, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 190, 250, -1));

        jtxtBiology.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtBiology.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtBiologyKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtBiology, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 250, -1));

        jtxtEnglish.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtEnglish.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtEnglishKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtEnglish, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, 250, -1));

        jtxtMaths.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtMaths.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtMathsActionPerformed(evt);
            }
        });
        jtxtMaths.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtMathsKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtMaths, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 250, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Maths:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setText("English:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setText("Biology:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 150, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setText("Computing:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setText("Chemistry:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setText("Physics:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel13.setText("Add Maths:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, -1, -1));

        jtxtAddMaths.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtAddMaths.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtAddMathsKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtAddMaths, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, 250, -1));

        jtxtBusiness.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jtxtBusiness.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtxtBusinessKeyTyped(evt);
            }
        });
        jPanel1.add(jtxtBusiness, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 250, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel14.setText("Business:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel15.setText("Total Score:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        jcmbCourseCode.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jcmbCourseCode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C98123", "C98234", "C98345", "C98567" }));
        jPanel1.add(jcmbCourseCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 250, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 420, 10));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 900, 440));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102), 4), "Grades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        jtxtTranscript.setColumns(20);
        jtxtTranscript.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jtxtTranscript.setRows(5);
        jScrollPane1.setViewportView(jtxtTranscript);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 450, 440));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student_ID", "Course_Code", "Maths", "English", "Biology", "Computing", "Chemistry", "Physics", "Add Maths", "Business", "Total_Score", "Average", "Ranking"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 1360, 120));

        jbtnTranscript.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnTranscript.setText("Transcript");
        jbtnTranscript.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnTranscriptActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnTranscript, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 570, -1, -1));

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 570, 220, -1));

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 570, 220, -1));

        jbtnRanking.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnRanking.setText("Ranking");
        jbtnRanking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnRankingActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnRanking, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 570, 220, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 760, 1360, 10));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 630, 1360, 10));

        jbtnDelete.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jbtnDelete.setText("Delete");
        jbtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnDeleteActionPerformed(evt);
            }
        });
        getContentPane().add(jbtnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 570, 220, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {                                          
       
        JTextField temp=null;
    for(Component c:jPanel1.getComponents()){
     if(c.getClass().toString().contains("javax.swing.JTextField")){
        temp=(JTextField)c;
        temp.setText(null);
    }
}
    }                                         
private JFrame frame;
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {                                         
        
        frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Student Result System",
                JOptionPane.YES_NO_OPTION)== JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }                                        

    private void jtxtMathsActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void jbtnRankingActionPerformed(java.awt.event.ActionEvent evt) {                                            
       double[] R = new double[14];
       
       R[0] = Double.parseDouble(jtxtMaths.getText());
       R[1] = Double.parseDouble(jtxtEnglish.getText());
       R[2] = Double.parseDouble(jtxtBiology.getText());
       R[3] = Double.parseDouble(jtxtComputing.getText());
       R[4] = Double.parseDouble(jtxtChemistry.getText());
       R[5] = Double.parseDouble(jtxtPhysics.getText());
       R[6] = Double.parseDouble(jtxtAddMaths.getText());
       R[7] = Double.parseDouble(jtxtBusiness.getText());
       
       R[8] = (R[0] + R[1] + R[2] + R[3] + R[4] + R[5] + R[6] + R[7]) / 8;
       R[9] = R[0] + R[1] + R[2] + R[3] + R[4] + R[5] + R[6] + R[7];
            
        String Average = String.format("%.0f", R[8]);
        jtxtAverage.setText(Average);
        
        String TotalScore = String.format("%.0f", R[9]);
        jtxtTotalScore.setText(TotalScore);
        
       if (R[9] >= 700)
       {
           jtxtRanking.setText("1st");
       }
       else if (R[9] >= 600)
       {
           jtxtRanking.setText("2i");
       }
       else if (R[9] >= 500)
       {
           jtxtRanking.setText("2ii");
       }
        else if (R[9] >= 400)
       {
           jtxtRanking.setText("3");
       }
        else if (R[9] >= 300)
       {
           jtxtRanking.setText("CoHE");
       }
        else if (R[9] >= 200)
       {
           jtxtRanking.setText("Fail");
       }
       
       DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
       model.addRow(new Object[]{
        
        jtxtStudentID.getText(),
        jcmbCourseCode.getSelectedItem(),
        jtxtMaths.getText(),
        jtxtEnglish.getText(),
        jtxtBiology.getText(),
        jtxtComputing.getText(),
        jtxtChemistry.getText(),
        jtxtPhysics.getText(),
        jtxtAddMaths.getText(),
        jtxtBusiness.getText(),
        jtxtTotalScore.getText(),
        jtxtAverage.getText(),
        jtxtRanking.getText(),
        
                        
        });
       
    }                                           

    private void jtxtMathsKeyTyped(java.awt.event.KeyEvent evt) {                                   
        // TODO add your handling code here:
         char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        ||(iNumber == KeyEvent.VK_BACK_SPACE)
        ||(iNumber == KeyEvent.VK_DELETE)){
         evt.consume();
    }                                  
    }
    private void jtxtEnglishKeyTyped(java.awt.event.KeyEvent evt) {                                     
        // TODO add your handling code here:
         char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        ||(iNumber == KeyEvent.VK_BACK_SPACE)
        ||(iNumber == KeyEvent.VK_DELETE)){
         evt.consume();
        }
    }                                    

    private void jtxtBiologyKeyTyped(java.awt.event.KeyEvent evt) {                                     
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        ||(iNumber == KeyEvent.VK_BACK_SPACE)
        ||(iNumber == KeyEvent.VK_DELETE)){
         evt.consume();
        }
    }                                    

    private void jtxtComputingKeyTyped(java.awt.event.KeyEvent evt) {                                       
        // TODO add your handling code here:
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        ||(iNumber == KeyEvent.VK_BACK_SPACE)
        ||(iNumber == KeyEvent.VK_DELETE)){
         evt.consume();
        }
    }                                      

    private void jtxtChemistryActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
       
    }                                             

    private void jtxtPhysicsKeyTyped(java.awt.event.KeyEvent evt) {                                     
        // TODO add your handling code here:
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        ||(iNumber == KeyEvent.VK_BACK_SPACE)
        ||(iNumber == KeyEvent.VK_DELETE)){
         evt.consume();
        }
    }                                    

    private void jtxtChemistryKeyTyped(java.awt.event.KeyEvent evt) {                                       
        // TODO add your handling code here:
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        ||(iNumber == KeyEvent.VK_BACK_SPACE)
        ||(iNumber == KeyEvent.VK_DELETE)){
         evt.consume();
        }
    }                                      

    private void jtxtAddMathsKeyTyped(java.awt.event.KeyEvent evt) {                                      
        // TODO add your handling code here:
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        ||(iNumber == KeyEvent.VK_BACK_SPACE)
        ||(iNumber == KeyEvent.VK_DELETE)){
         evt.consume();
        }
    }                                     

    private void jtxtBusinessKeyTyped(java.awt.event.KeyEvent evt) {                                      
        // TODO add your handling code here:
        char iNumber = evt.getKeyChar();
        if(!(Character.isDigit(iNumber))
        ||(iNumber == KeyEvent.VK_BACK_SPACE)
        ||(iNumber == KeyEvent.VK_DELETE)){
         evt.consume();
        }
    }                                     

    private void jbtnTranscriptActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
        jtxtTranscript.append("Student Result Recording Systems\n" 
                + "================================\n"
                + "Maths:\t\t\t" + jtxtMaths.getText()
                + "\nEnglish:\t\t"+ jtxtEnglish.getText()
                + "\nBiology:\t\t"+ jtxtBiology.getText()
                + "\nComputing:\t\t" + jtxtComputing.getText()
                + "\nChemistry:\t\t" + jtxtChemistry.getText()
                + "\nPhysics:\t\t" + jtxtPhysics.getText()
                + "\nAdd Maths:\t\t" + jtxtAddMaths.getText()
                + "\nBusiness:\t\t" + jtxtBusiness.getText()
                + "\n================================"
                + "\nTotal Score:\t\t" + jtxtTotalScore.getText()
                + "\nAverage:\t\t" + jtxtAverage.getText()
                + "\nRanking:\t\t" + jtxtRanking.getText()+"\n"
        );
    }                                              

    private void jbtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if(jTable1.getSelectedRow()==-1){
            if(jTable1.getRowCount()==0){

                JOptionPane.showMessageDialog(null, "No data to delete ", 
                        "Student Result System",JOptionPane.OK_OPTION);
            }else{

                JOptionPane.showMessageDialog(null, "Select a row to delete ", 
                        "Student Result System",JOptionPane.OK_OPTION);
            }
        }else{
            model.removeRow(jTable1.getSelectedRow());
        }     
    }                                          

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Student_Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Result.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Result().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbtnDelete;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnRanking;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JButton jbtnTranscript;
    private javax.swing.JComboBox<String> jcmbCourseCode;
    private javax.swing.JTextField jtxtAddMaths;
    private javax.swing.JTextField jtxtAverage;
    private javax.swing.JTextField jtxtBiology;
    private javax.swing.JTextField jtxtBusiness;
    private javax.swing.JTextField jtxtChemistry;
    private javax.swing.JTextField jtxtComputing;
    private javax.swing.JTextField jtxtEnglish;
    private javax.swing.JTextField jtxtFirstname;
    private javax.swing.JTextField jtxtMaths;
    private javax.swing.JTextField jtxtPhysics;
    private javax.swing.JTextField jtxtRanking;
    private javax.swing.JTextField jtxtStudentID;
    private javax.swing.JTextField jtxtSurname;
    private javax.swing.JTextField jtxtTotalScore;
    private javax.swing.JTextArea jtxtTranscript;
    // End of variables declaration                   

}
