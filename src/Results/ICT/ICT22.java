
package Results.ICT;

import UI.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userFunctions.UserFunctions;


public class ICT22 extends javax.swing.JFrame {

    UserFunctions userFunctions=new UserFunctions();
    String userName="",dpt="";
    String course,gr;
    
    public ICT22() {
        
        initComponents();
        logout.setVisible(false);
        sub4.setText("<html>Ecommerce <br> Implementation, Management and Security              :</html>");
        fillTitle();
        fillForm(0);
        
        
        
    }

    ICT22(String userName) {
        initComponents();
        logout.setVisible(true);
        this.userName=userName;
        this.dpt=userFunctions.getUserDepartment(userName);
        
        fillTitle();
        fillForm(0);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel = new javax.swing.JPanel();
        logout = new javax.swing.JLabel();
        back = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        sub4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jComboBox2 = new javax.swing.JComboBox();
        jComboBox3 = new javax.swing.JComboBox();
        jComboBox4 = new javax.swing.JComboBox();
        jComboBox5 = new javax.swing.JComboBox();
        jComboBox6 = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBox7 = new javax.swing.JComboBox();
        save = new javax.swing.JButton();
        error = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel.setBackground(new java.awt.Color(0, 153, 153));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        panel.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(687, 11, -1, -1));

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edited_back_png.png"))); // NOI18N
        back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backMouseClicked(evt);
            }
        });
        panel.add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add Results");
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 11, 307, -1));

        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edited_close_btn.png"))); // NOI18N
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
        });
        panel.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(727, 11, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        bPanel.setBackground(new java.awt.Color(255, 255, 255));
        bPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Internet Application Development");
        bPanel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 330, 20));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Operating System Concepts and Applications");
        bPanel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 330, 20));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Computer Networks");
        bPanel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 330, 20));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Software Engineering");
        bPanel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 330, 20));

        sub4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        sub4.setText("Ecommerce Implementation, Management and Security ");
        bPanel.add(sub4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 370, 40));

        jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Grade", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "E", "E*", "F" }));
        bPanel.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 300, -1));

        jComboBox2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Grade", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "E", "E*", "F" }));
        bPanel.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, 300, -1));

        jComboBox3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Grade", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "E", "E*", "F" }));
        bPanel.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 300, -1));

        jComboBox4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Grade", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "E", "E*", "F" }));
        bPanel.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 300, -1));

        jComboBox5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Grade", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "E", "E*", "F" }));
        bPanel.add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, 300, -1));

        jComboBox6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Grade", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "E", "E*", "F" }));
        bPanel.add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 300, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Business Economics");
        bPanel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 330, 20));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Level 02 Semester 2 - Department of ICT");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 350, 40));

        bPanel.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 740, 50));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Soft Skills");
        bPanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 330, 20));

        jComboBox7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select Grade", "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "E", "E*", "F" }));
        bPanel.add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 300, -1));

        save.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        save.setText("ADD");
        bPanel.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 100, -1));

        error.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        error.setForeground(new java.awt.Color(255, 0, 0));
        error.setText("jLabel11");
        bPanel.add(error, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 380, -1));

        jScrollPane1.setViewportView(bPanel);

        panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 760, 400));

        jPanel1.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 780, 480));

        background.setBackground(new java.awt.Color(102, 0, 102));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background1.png"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(800, 500));
        background.setMinimumSize(new java.awt.Dimension(800, 500));
        background.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        this.dispose();
    }//GEN-LAST:event_closeMouseClicked

    private void backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backMouseClicked
        Welcome welcome=new Welcome();
        welcome.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        Login login=new Login();
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutMouseClicked

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ICT22().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bPanel;
    private javax.swing.JLabel back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel close;
    private javax.swing.JLabel error;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JComboBox jComboBox6;
    private javax.swing.JComboBox jComboBox7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logout;
    private javax.swing.JPanel panel;
    private javax.swing.JButton save;
    private javax.swing.JLabel sub4;
    // End of variables declaration//GEN-END:variables

    public void fillTitle(){
  
    }
    
       
    public void fillForm(int sem) {
       
    }

}
