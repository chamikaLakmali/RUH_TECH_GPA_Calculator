
package UI;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import userFunctions.UserFunctions;


public class AddResults extends javax.swing.JFrame {

    UserFunctions userFunctions=new UserFunctions();
    public AddResults() {
        
        initComponents();
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
        filter = new javax.swing.JComboBox();
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

        bPanel.setBackground(new java.awt.Color(255, 255, 255));
        bPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane1.setViewportView(bPanel);

        panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 760, 360));

        filter.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        filter.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Level 1 Semester 1", "Level 1 Semester 2", "Level 2 Semester 1", "Level 2 Semester 2", "Level 3 Semester 1", "Level 3 Semester 2", "Level 4 Semester 1", "Level 4 Semester 2" }));
        filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterActionPerformed(evt);
            }
        });
        panel.add(filter, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 70, 250, -1));

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

    private void filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterActionPerformed
        bPanel.removeAll();
        String t=filter.getSelectedItem().toString()+ " Results";
        
        fillTitle();
        
        bPanel.setVisible(false);
        bPanel.setVisible(true);
        int filterStat=filter.getSelectedIndex();
        fillForm(filterStat);
        
        
    }//GEN-LAST:event_filterActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddResults().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bPanel;
    private javax.swing.JLabel back;
    private javax.swing.JLabel background;
    private javax.swing.JLabel close;
    private javax.swing.JComboBox filter;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logout;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables

    public void fillTitle(){

        
        int height=50;
      
        JLabel title = new JLabel();
        JPanel addPanal = new JPanel();
        JLabel jLabel3 = new JLabel();
        JLabel jLabel4 = new JLabel();
        JLabel jLabel5 = new JLabel();
        JLabel jLabel6 = new JLabel();


        addPanal.setBackground(new java.awt.Color(51,51,0));
        addPanal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        
        title.setText(filter.getSelectedItem().toString() + " Results");
        bPanel.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 230, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Course Code");
        addPanal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 40));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Course Name");
        addPanal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 0, 320, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Result");
        addPanal.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 5, 100, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Attempt");
        addPanal.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 5, 100, 30));


        bPanel.add(addPanal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, height, 740, 40));
       
    }
    
    
    
    public void fillForm(int filterStat) {
 
        try {
            ResultSet rs=userFunctions.fillResultForm(filterStat);
            
            int height=100;
            
            JButton add = new JButton();
            if (rs.next()==false){
                bPanel.removeAll();
                fillTitle();
                bPanel.setVisible(false);
                bPanel.setVisible(true);
                
            }
            else{
                while(rs.next()){
                    
                    JPanel addPanal = new JPanel();
                    JLabel jLabel3 = new JLabel();
                    JLabel jLabel4 = new JLabel();
                    JComboBox jComboBox1 = new JComboBox();
                    JComboBox jComboBox2 = new JComboBox();


                    addPanal.setBackground(new java.awt.Color(153, 153, 153));
                    addPanal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                    jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                    jLabel3.setText(rs.getString(1));
                    addPanal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 150, 40));

                    jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                    jLabel4.setText(rs.getString(2));
                    addPanal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 0, 320, 40));

                    jComboBox1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                    jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "E", "E*" }));
                    addPanal.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(475, 5,100, 30));

                    jComboBox2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
                    jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "First","Repeat"}));
                    addPanal.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 5, 100, 30));
                    bPanel.add(addPanal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, height, 740, 40));

                    height=height+50;
                }

                add.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
                add.setText("Add");
                bPanel.add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, height, 120, 40));
                
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AddResults.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

}
