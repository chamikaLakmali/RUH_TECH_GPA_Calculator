/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author User01
 */
public class StudentMainMenuLogged extends javax.swing.JFrame {

    String userName;
    public StudentMainMenuLogged() {
        initComponents();
        logout.setVisible(false);
    }

    StudentMainMenuLogged(String userName) {
        initComponents();
        this.userName=userName;
        logout.setVisible(true);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        close2 = new javax.swing.JLabel();
        addResults = new javax.swing.JButton();
        viewGPA = new javax.swing.JButton();
        viewResults = new javax.swing.JButton();
        heading = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/edited_close_btn.png"))); // NOI18N
        close2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close2MouseClicked(evt);
            }
        });
        jPanel3.add(close2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 10, -1, -1));

        addResults.setBackground(new java.awt.Color(0, 51, 102));
        addResults.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        addResults.setForeground(new java.awt.Color(255, 255, 255));
        addResults.setText("Add New Results");
        addResults.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addResultsMouseClicked(evt);
            }
        });
        jPanel3.add(addResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 130, 240, 40));

        viewGPA.setBackground(new java.awt.Color(0, 51, 102));
        viewGPA.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        viewGPA.setForeground(new java.awt.Color(255, 255, 255));
        viewGPA.setText("View GPA");
        viewGPA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewGPAMouseClicked(evt);
            }
        });
        jPanel3.add(viewGPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 150, 40));

        viewResults.setBackground(new java.awt.Color(0, 51, 102));
        viewResults.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        viewResults.setForeground(new java.awt.Color(255, 255, 255));
        viewResults.setText("View Results");
        viewResults.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewResultsMouseClicked(evt);
            }
        });
        jPanel3.add(viewResults, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 170, 40));

        heading.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        heading.setForeground(new java.awt.Color(255, 255, 255));
        heading.setText("Faculty of Technology/ University of Ruhuna");
        jPanel3.add(heading, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 690, 60));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 50)); // NOI18N
        jLabel1.setText("Welcome to GPA Calculator");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 650, 60));

        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logout.png"))); // NOI18N
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        jPanel3.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 10, -1, -1));

        background.setBackground(new java.awt.Color(102, 0, 102));
        background.setForeground(new java.awt.Color(102, 102, 102));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background1.png"))); // NOI18N
        background.setMaximumSize(new java.awt.Dimension(800, 500));
        background.setMinimumSize(new java.awt.Dimension(800, 500));
        background.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel3.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 500));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void close2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close2MouseClicked
        this.dispose();
    }//GEN-LAST:event_close2MouseClicked

    private void addResultsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addResultsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_addResultsMouseClicked

    private void viewGPAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewGPAMouseClicked
        
    }//GEN-LAST:event_viewGPAMouseClicked

    private void viewResultsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewResultsMouseClicked
        
    }//GEN-LAST:event_viewResultsMouseClicked

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
            java.util.logging.Logger.getLogger(StudentMainMenuLogged.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentMainMenuLogged.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentMainMenuLogged.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentMainMenuLogged.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentMainMenuLogged().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addResults;
    private javax.swing.JLabel background;
    private javax.swing.JLabel close2;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel logout;
    private javax.swing.JButton viewGPA;
    private javax.swing.JButton viewResults;
    // End of variables declaration//GEN-END:variables
}
