/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author User01
 */
public class AddResults extends javax.swing.JFrame {

    /**
     * Creates new form AddResults
     */
    public AddResults() {
        
        initComponents();
        fill();
        
        
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
        title = new javax.swing.JLabel();
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

        title.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        title.setText("Level 01 Semester 01 Results");
        bPanel.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 230, 30));

        jScrollPane1.setViewportView(bPanel);

        panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 760, 380));

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

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(AddResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddResults.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logout;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables

    public void fill(){

        int height=50;
      
        for (int x=0;x<20;x++){
            JPanel addPanal = new JPanel();
            JLabel jLabel3 = new JLabel();
            JLabel jLabel4 = new JLabel();
            JComboBox jComboBox1 = new JComboBox();
            
            addPanal.setBackground(new java.awt.Color(153, 153, 153));
            addPanal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

            jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
            jLabel3.setText("jLabel3");
            addPanal.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 338, 40));

            jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
            jLabel4.setText("jLabel4");
            addPanal.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 0, 200, 40));

            jComboBox1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
            jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "E", "E*" }));
            addPanal.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 5, 141, 30));
            bPanel.add(addPanal, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, height, 740, 40));
            
            height=height+50;
        }
        

        
    }
    
    public void testFull(){
        int x=10;
        if (x==10){
            title.setText("Level 2 second semester");
        }
    }

}
