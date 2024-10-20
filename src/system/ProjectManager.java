/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package system;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author nisha
 */
public class ProjectManager extends javax.swing.JFrame {

    /**
     * Creates new form ProjectManager
     */

    //Create object for panel
    AssignStudent student = new AssignStudent();
    RequestAssignLecturer Reqlecturer = new RequestAssignLecturer();
    RequestSubmissonLecturer ReqSub = new RequestSubmissonLecturer();
    ViewStatusReport status = new ViewStatusReport();
    LoginPage login = new LoginPage();
 
    public ProjectManager() {
        initComponents();
        
        //Add panel
        pnlMain.add(student);
        pnlMain.add(Reqlecturer);
        pnlMain.add(ReqSub);
        pnlMain.add(status);
        //Set visibility
        student.setVisible(false);
        Reqlecturer.setVisible(false);
        ReqSub.setVisible(false);
        status.setVisible(false);
        
        //Set label as user login
        lblId.setText(login.getUsername());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMenu = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        pnlViewStatus = new javax.swing.JPanel();
        lblViewStatus = new javax.swing.JLabel();
        pnlReqSub = new javax.swing.JPanel();
        lblReqSub = new javax.swing.JLabel();
        pnlReqAssL = new javax.swing.JPanel();
        lblRequestAssignL = new javax.swing.JLabel();
        pnlSAssign = new javax.swing.JPanel();
        lblAssignS = new javax.swing.JLabel();
        lblSignOut = new javax.swing.JLabel();
        pnlProfile = new javax.swing.JPanel();
        lblMini = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        lblAdminIcon = new javax.swing.JLabel();
        lblPM = new javax.swing.JLabel();
        lblId = new javax.swing.JLabel();
        pnlMain = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMenu.setBackground(new java.awt.Color(15, 30, 53));
        pnlMenu.setPreferredSize(new java.awt.Dimension(210, 750));
        pnlMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/logoT.png"))); // NOI18N
        pnlMenu.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        pnlViewStatus.setBackground(new java.awt.Color(15, 30, 53));
        pnlViewStatus.setForeground(new java.awt.Color(204, 204, 204));
        pnlViewStatus.setPreferredSize(new java.awt.Dimension(210, 70));
        pnlViewStatus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlViewStatusMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlViewStatusMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlViewStatusMouseExited(evt);
            }
        });
        pnlViewStatus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblViewStatus.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblViewStatus.setForeground(new java.awt.Color(153, 153, 153));
        lblViewStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/iconManager.png"))); // NOI18N
        lblViewStatus.setText("<html>View Status Report</html>");
        lblViewStatus.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lblViewStatus.setPreferredSize(new java.awt.Dimension(210, 80));
        pnlViewStatus.add(lblViewStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, 40));

        pnlMenu.add(pnlViewStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 210, 60));

        pnlReqSub.setBackground(new java.awt.Color(15, 30, 53));
        pnlReqSub.setForeground(new java.awt.Color(204, 204, 204));
        pnlReqSub.setPreferredSize(new java.awt.Dimension(210, 70));
        pnlReqSub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlReqSubMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlReqSubMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlReqSubMouseExited(evt);
            }
        });
        pnlReqSub.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblReqSub.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblReqSub.setForeground(new java.awt.Color(153, 153, 153));
        lblReqSub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/iconManager.png"))); // NOI18N
        lblReqSub.setText("<html>Request Submitted</html>");
        lblReqSub.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lblReqSub.setPreferredSize(new java.awt.Dimension(210, 80));
        pnlReqSub.add(lblReqSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, 40));

        pnlMenu.add(pnlReqSub, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 210, 60));

        pnlReqAssL.setBackground(new java.awt.Color(15, 30, 53));
        pnlReqAssL.setForeground(new java.awt.Color(204, 204, 204));
        pnlReqAssL.setPreferredSize(new java.awt.Dimension(210, 70));
        pnlReqAssL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlReqAssLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlReqAssLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlReqAssLMouseExited(evt);
            }
        });
        pnlReqAssL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblRequestAssignL.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblRequestAssignL.setForeground(new java.awt.Color(153, 153, 153));
        lblRequestAssignL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/iconL.png"))); // NOI18N
        lblRequestAssignL.setText("<html>Request & Assign Lecturere</html>");
        lblRequestAssignL.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lblRequestAssignL.setPreferredSize(new java.awt.Dimension(210, 80));
        pnlReqAssL.add(lblRequestAssignL, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 180, 40));

        pnlMenu.add(pnlReqAssL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 210, 60));

        pnlSAssign.setBackground(new java.awt.Color(15, 30, 53));
        pnlSAssign.setForeground(new java.awt.Color(204, 204, 204));
        pnlSAssign.setPreferredSize(new java.awt.Dimension(210, 70));
        pnlSAssign.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlSAssignMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlSAssignMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlSAssignMouseExited(evt);
            }
        });
        pnlSAssign.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAssignS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAssignS.setForeground(new java.awt.Color(153, 153, 153));
        lblAssignS.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAssignS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/IconSM.png"))); // NOI18N
        lblAssignS.setText("Assign Student");
        lblAssignS.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lblAssignS.setPreferredSize(new java.awt.Dimension(210, 80));
        pnlSAssign.add(lblAssignS, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 30));

        pnlMenu.add(pnlSAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 210, 50));

        lblSignOut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSignOut.setForeground(new java.awt.Color(153, 153, 153));
        lblSignOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/iconLogOut.png"))); // NOI18N
        lblSignOut.setText("LogOut");
        lblSignOut.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        lblSignOut.setPreferredSize(new java.awt.Dimension(210, 80));
        lblSignOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSignOutMouseClicked(evt);
            }
        });
        pnlMenu.add(lblSignOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 180, 40));

        getContentPane().add(pnlMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 710));

        pnlProfile.setBackground(new java.awt.Color(255, 255, 255));
        pnlProfile.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray, java.awt.Color.lightGray));
        pnlProfile.setPreferredSize(new java.awt.Dimension(1120, 60));
        pnlProfile.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMini.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblMini.setForeground(new java.awt.Color(153, 153, 153));
        lblMini.setText("-");
        lblMini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMiniMouseClicked(evt);
            }
        });
        pnlProfile.add(lblMini, new org.netbeans.lib.awtextra.AbsoluteConstraints(1080, 15, -1, -1));

        lblExit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblExit.setForeground(new java.awt.Color(153, 153, 153));
        lblExit.setText(" X ");
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });
        pnlProfile.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 15, -1, -1));

        lblAdminIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/icons8_id_man_in_red_glasses_50px.png"))); // NOI18N
        pnlProfile.add(lblAdminIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 15, -1, -1));

        lblPM.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        lblPM.setForeground(new java.awt.Color(0, 0, 0));
        lblPM.setText("Project Manager");
        pnlProfile.add(lblPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(915, 20, -1, -1));

        lblId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblId.setForeground(new java.awt.Color(0, 0, 204));
        lblId.setText("jLabel1");
        pnlProfile.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(919, 40, 90, -1));

        getContentPane().add(pnlProfile, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, -10, 1120, 70));

        pnlMain.setBackground(new java.awt.Color(255, 255, 255));
        pnlMain.setMinimumSize(new java.awt.Dimension(1075, 640));
        pnlMain.setPreferredSize(new java.awt.Dimension(1075, 650));
        pnlMain.setLayout(new java.awt.CardLayout());
        getContentPane().add(pnlMain, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 1075, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pnlReqSubMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlReqSubMouseClicked
    
        //Set visibility
        student.setVisible(false);
        Reqlecturer.setVisible(false);
        ReqSub.setVisible(true);
        status.setVisible(false);
        //Set front color
        lblReqSub.setForeground(new java.awt.Color(56, 182, 255));
        lblRequestAssignL.setForeground(new java.awt.Color(153,153,153));
        lblAssignS.setForeground(new java.awt.Color(153,153,153));
        lblViewStatus.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_pnlReqSubMouseClicked

    private void pnlReqSubMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlReqSubMouseEntered
        pnlReqSub.setBackground(Color.white);
    }//GEN-LAST:event_pnlReqSubMouseEntered

    private void pnlReqSubMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlReqSubMouseExited
        pnlReqSub.setBackground(new java.awt.Color(15,30,55));
    }//GEN-LAST:event_pnlReqSubMouseExited

    private void pnlReqAssLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlReqAssLMouseClicked

        //Set visibility
        student.setVisible(false);
        Reqlecturer.setVisible(true);
        ReqSub.setVisible(false);
        status.setVisible(false);
        //Set color
        lblRequestAssignL.setForeground(new java.awt.Color(56, 182, 255));
        lblAssignS.setForeground(new java.awt.Color(153,153,153));
        lblReqSub.setForeground(new java.awt.Color(153,153,153));
        lblViewStatus.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_pnlReqAssLMouseClicked

    private void pnlReqAssLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlReqAssLMouseEntered
        pnlReqAssL.setBackground(Color.white);
    }//GEN-LAST:event_pnlReqAssLMouseEntered

    private void pnlReqAssLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlReqAssLMouseExited
        pnlReqAssL.setBackground(new java.awt.Color(15,30,55));
    }//GEN-LAST:event_pnlReqAssLMouseExited

    private void pnlSAssignMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSAssignMouseClicked
       
        //Set visibility and color
        pnlSAssign.setBackground(Color.white);
        student.setVisible(true);
        Reqlecturer.setVisible(false);
        ReqSub.setVisible(false);
        status.setVisible(false);
        lblAssignS.setForeground(new java.awt.Color(56, 182, 255));
        lblRequestAssignL.setForeground(new java.awt.Color(153,153,153));
        lblReqSub.setForeground(new java.awt.Color(153,153,153));
        lblViewStatus.setForeground(new java.awt.Color(153,153,153));
    }//GEN-LAST:event_pnlSAssignMouseClicked

    private void pnlSAssignMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSAssignMouseEntered
        pnlSAssign.setBackground(Color.white);
    }//GEN-LAST:event_pnlSAssignMouseEntered

    private void pnlSAssignMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSAssignMouseExited
        pnlSAssign.setBackground(new java.awt.Color(15,30,55));
    }//GEN-LAST:event_pnlSAssignMouseExited

    private void lblMiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMiniMouseClicked
        this.setExtendedState(Admin.ICONIFIED);
    }//GEN-LAST:event_lblMiniMouseClicked

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void pnlViewStatusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlViewStatusMouseClicked
        //Set visibility and color
        student.setVisible(false);
        Reqlecturer.setVisible(false);
        ReqSub.setVisible(false);
        status.setVisible(true);
        lblViewStatus.setForeground(new java.awt.Color(56, 182, 255));
        lblAssignS.setForeground(new java.awt.Color(153,153,153));
        lblRequestAssignL.setForeground(new java.awt.Color(153,153,153));
        lblReqSub.setForeground(new java.awt.Color(153,153,153));
  
    }//GEN-LAST:event_pnlViewStatusMouseClicked

    private void pnlViewStatusMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlViewStatusMouseEntered
        pnlViewStatus.setBackground(Color.white);
    }//GEN-LAST:event_pnlViewStatusMouseEntered

    private void pnlViewStatusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlViewStatusMouseExited
        pnlViewStatus.setBackground(new java.awt.Color(15,30,55));
    }//GEN-LAST:event_pnlViewStatusMouseExited

    private void lblSignOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignOutMouseClicked
        //Go to login page
        LoginPage login = new LoginPage();
        login.show();
        dispose();// closing our current Menu
        JOptionPane.showMessageDialog(null, "Logout successful");
    }//GEN-LAST:event_lblSignOutMouseClicked

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
            java.util.logging.Logger.getLogger(ProjectManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAdminIcon;
    private javax.swing.JLabel lblAssignS;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMini;
    private javax.swing.JLabel lblPM;
    private javax.swing.JLabel lblReqSub;
    private javax.swing.JLabel lblRequestAssignL;
    private javax.swing.JLabel lblSignOut;
    private javax.swing.JLabel lblViewStatus;
    private javax.swing.JLayeredPane pnlMain;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlProfile;
    private javax.swing.JPanel pnlReqAssL;
    private javax.swing.JPanel pnlReqSub;
    private javax.swing.JPanel pnlSAssign;
    private javax.swing.JPanel pnlViewStatus;
    // End of variables declaration//GEN-END:variables
}