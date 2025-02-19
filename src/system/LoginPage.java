/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package system;

import java.awt.Color;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author nisha
 */
public class LoginPage extends javax.swing.JFrame {

    /**
     * Creates new form LoginPage
     */
    int x,y;
    private static String saveUsername;
    private static String role;
    public LoginPage() {
        initComponents();
        txtID.setBackground(new java.awt.Color(0,0,0,1));
        txtPass.setBackground(new java.awt.Color(0,0,0,1));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBg = new javax.swing.JPanel();
        lblMini = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblPic = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblTitle2 = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblIconID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lblLine = new javax.swing.JLabel();
        lblPass = new javax.swing.JLabel();
        lblIconPass = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        lblLine2 = new javax.swing.JLabel();
        lblBg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBg.setBackground(new java.awt.Color(255, 255, 255));
        pnlBg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblMini.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblMini.setForeground(new java.awt.Color(0, 0, 0));
        lblMini.setText("-");
        lblMini.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblMini.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMiniMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblMiniMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblMiniMouseExited(evt);
            }
        });
        pnlBg.add(lblMini, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 0, 20, 20));

        lblExit.setFont(new java.awt.Font("Segoe UI Black", 1, 16)); // NOI18N
        lblExit.setForeground(new java.awt.Color(0, 0, 0));
        lblExit.setText("X");
        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblExitMouseExited(evt);
            }
        });
        pnlBg.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 0, -1, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/logo.png"))); // NOI18N
        pnlBg.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 80, -1, -1));

        lblPic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/logo2.png"))); // NOI18N
        pnlBg.add(lblPic, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("Academic Guidance Hub ");
        pnlBg.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        lblTitle2.setBackground(new java.awt.Color(35, 77, 255));
        lblTitle2.setFont(new java.awt.Font("Segoe UI Black", 1, 22)); // NOI18N
        lblTitle2.setForeground(new java.awt.Color(35, 77, 255));
        lblTitle2.setText("System");
        pnlBg.add(lblTitle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, -1, -1));

        lblLogin.setBackground(new java.awt.Color(255, 255, 255));
        lblLogin.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblLogin.setText("Login");
        pnlBg.add(lblLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, -1, -1));

        lblID.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblID.setText("User ID Key : ");
        pnlBg.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, -1, -1));

        lblIconID.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/IDKey2.png"))); // NOI18N
        pnlBg.add(lblIconID, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));

        txtID.setBorder(null);
        txtID.setName(""); // NOI18N
        txtID.setPreferredSize(new java.awt.Dimension(64, 18));
        txtID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIDFocusLost(evt);
            }
        });
        pnlBg.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 160, 230, 25));
        txtID.getAccessibleContext().setAccessibleName("");

        lblLine.setText("______________________________________");
        pnlBg.add(lblLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, -1, 30));
        lblLine.getAccessibleContext().setAccessibleName("___________________________________");

        lblPass.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        lblPass.setText("Password : ");
        pnlBg.add(lblPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 220, -1, -1));

        lblIconPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/PassKey.png"))); // NOI18N
        pnlBg.add(lblIconPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, -1, -1));

        btnLogin.setBackground(new java.awt.Color(255, 255, 255));
        btnLogin.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(0, 51, 255));
        btnLogin.setText("Login");
        btnLogin.setBorder(null);
        btnLogin.setMargin(new java.awt.Insets(2, 6, 2, 6));
        btnLogin.setPreferredSize(new java.awt.Dimension(35, 25));
        btnLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoginMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnLoginMousePressed(evt);
            }
        });
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        pnlBg.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 120, -1));

        txtPass.setBorder(null);
        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassFocusLost(evt);
            }
        });
        pnlBg.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 230, 25));

        lblLine2.setText("______________________________________");
        pnlBg.add(lblLine2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, -1, 30));

        lblBg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/bg3.png"))); // NOI18N
        lblBg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                lblBgMouseDragged(evt);
            }
        });
        lblBg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblBgMousePressed(evt);
            }
        });
        pnlBg.add(lblBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 460));

        getContentPane().add(pnlBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 460));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseEntered
        lblExit.setForeground(Color.red);
    }//GEN-LAST:event_lblExitMouseEntered

    private void lblExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseExited
        lblExit.setForeground(Color.black);
    }//GEN-LAST:event_lblExitMouseExited

    private void lblBgMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBgMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_lblBgMousePressed

    private void lblBgMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBgMouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();
        
        this.setLocation(xx-x, yy-y);
    }//GEN-LAST:event_lblBgMouseDragged

    private void lblMiniMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMiniMouseClicked
        this.setExtendedState(LoginPage.ICONIFIED);
    }//GEN-LAST:event_lblMiniMouseClicked

    private void lblMiniMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMiniMouseEntered
        lblMini.setForeground(Color.white);
    }//GEN-LAST:event_lblMiniMouseEntered

    private void lblMiniMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMiniMouseExited
        lblMini.setForeground(Color.black);
    }//GEN-LAST:event_lblMiniMouseExited

    private void txtIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDFocusGained
       
        lblLine.setForeground(Color.white);
    }//GEN-LAST:event_txtIDFocusGained

    private void txtIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIDFocusLost
        
        lblLine.setForeground(Color.black);
    }//GEN-LAST:event_txtIDFocusLost

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
        
        lblLine2.setForeground(Color.white);
    }//GEN-LAST:event_txtPassFocusGained

    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
        
        lblLine2.setForeground(Color.black);
    }//GEN-LAST:event_txtPassFocusLost

    private void btnLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMouseClicked
        
    }//GEN-LAST:event_btnLoginMouseClicked

    private void btnLoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoginMousePressed
        
    }//GEN-LAST:event_btnLoginMousePressed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String username = txtID.getText().toString();
        String password = txtPass.getText().toString();
        
        if (username.startsWith("A")) {
            validateAdmin(username, password);
        } else if (username.startsWith("L")) {
            validateLecturer(username, password);
        }else if (username.startsWith("S")) {
            validateStudent(username, password);
        }else {
            JOptionPane.showMessageDialog(null, "Invalid username prefix");
        }
        
        
        
    }//GEN-LAST:event_btnLoginActionPerformed

    
    private void validateAdmin(String username, String password) {
        // Placeholder for admin validation logic
        if (username.equals("Admin") && password.equals("Admin123")) {
            // Open admin window
            Admin admin = new Admin();
            admin.show();
            dispose();// closing our current Menu
            JOptionPane.showMessageDialog(null, "Admin login successful");
  
            
        } else {
            JOptionPane.showMessageDialog(null, "Invalid admin credentials");
        }
    }
    
    private void validateLecturer(String username, String password) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("lecturer_list.txt"));
            boolean found = false;

            for (String line : lines) {
                String[] columns = line.split(",");
                if (columns[0].equals(username) && columns[1].equals(password)) {
                    found = true;
                    String role = columns[9];
                    if (role.equals("Project Manager")) {
                        LoginPage.saveUsername = columns[2]+ "-"+username;
                        ProjectManager proManager = new ProjectManager();
                        proManager.show();
                        dispose();// closing our current Menu
                        JOptionPane.showMessageDialog(null, "Project Manager login successful");
                        // Open project manager window here
                    } else {
                        LoginPage.saveUsername = columns[2]+ "-"+username;
                        LoginPage.role = columns[9];
                        LecturerPage lect = new LecturerPage();
                        lect.show();
                        dispose();// closing our current Menu
                        JOptionPane.showMessageDialog(null, "Lecturer login successful");
                        // Open lecturer window here
                    }
                    break;
                }
            }

            if (!found) {
                JOptionPane.showMessageDialog(null, "Invalid lecturer credentials");
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error reading lecturer file");
        }
    }
    
    private void validateStudent(String username, String password) {
        try {
            List<String> lines = Files.readAllLines(Paths.get("student_list.txt"));
            boolean found = false;

            for (String line : lines) {
                String[] columns = line.split(",");
                if (columns[0].equals(username) && columns[1].equals(password)) {

                    found = true;
                        LoginPage.saveUsername = columns[2]+ "-"+username;
                        StudentPage stud = new StudentPage();
                        stud.show();
                        dispose();// closing our current Menu
                        JOptionPane.showMessageDialog(null, "Student login successful");
                    break;
                }
            }

            if (!found) {
                JOptionPane.showMessageDialog(null, "Invalid student credentials");
            }
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error reading lecturer file");
        }
    }
    
    
    public String getUsername(){
        return LoginPage.saveUsername;
    }
    public String getRole(){
        return LoginPage.role;
    }
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
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lblBg;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIconID;
    private javax.swing.JLabel lblIconPass;
    private javax.swing.JLabel lblLine;
    private javax.swing.JLabel lblLine2;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMini;
    private javax.swing.JLabel lblPass;
    private javax.swing.JLabel lblPic;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTitle2;
    private javax.swing.JPanel pnlBg;
    private javax.swing.JTextField txtID;
    private javax.swing.JPasswordField txtPass;
    // End of variables declaration//GEN-END:variables
}
