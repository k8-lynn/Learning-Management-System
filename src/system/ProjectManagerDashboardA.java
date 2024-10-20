/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package system;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author nisha
 */
public class ProjectManagerDashboardA extends javax.swing.JPanel {

    /**
     * Creates new form StudentDashboard
     */
    ProjectManagerAllot allot = new ProjectManagerAllot();
    ProjectManagerRemove remove = new ProjectManagerRemove();
    Border lineBorder = new LineBorder(Color.BLUE, 2, true);
    Border lineBorder2 = new LineBorder(Color.WHITE, 2, true);
    
    public ProjectManagerDashboardA() {
        initComponents();
        pnlMainDash.add(allot);
        pnlMainDash.add(remove);
        allot.setVisible(false);
        remove.setVisible(false);
        
        Date currentDate = new Date();
        
        // Create SimpleDateFormat instance with the desired format
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM d, EEEE");
        
        // Format the current date
        String formattedDate = sdf.format(currentDate); 
        lblDate.setText(formattedDate.toString());
        
        // Count records and set label text
        int totalRecords = countProjectManagers();
        lblTotalPM.setText(String.valueOf(totalRecords));
        
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMainDash = new javax.swing.JLayeredPane();
        pnlDashPM = new javax.swing.JPanel();
        lblPMDTitle = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblPMTitle = new javax.swing.JLabel();
        lblMsg = new javax.swing.JLabel();
        lblBgDashL = new javax.swing.JLabel();
        lblListL = new javax.swing.JLabel();
        lblRegL = new javax.swing.JLabel();
        lblManage = new javax.swing.JLabel();
        lblTotalPM = new javax.swing.JLabel();
        lblTTotal = new javax.swing.JLabel();
        lblTPM = new javax.swing.JLabel();
        lblBgTotal = new javax.swing.JLabel();
        lblBox = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1075, 650));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMainDash.setLayout(new java.awt.CardLayout());

        pnlDashPM.setBackground(new java.awt.Color(255, 255, 255));
        pnlDashPM.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPMDTitle.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblPMDTitle.setText("Dashboard Project Manager");
        pnlDashPM.add(lblPMDTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 35, -1, -1));

        lblDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblDate.setForeground(new java.awt.Color(255, 255, 255));
        lblDate.setText("jLabel1");
        pnlDashPM.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 190, -1));

        lblPMTitle.setBackground(new java.awt.Color(255, 255, 255));
        lblPMTitle.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblPMTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblPMTitle.setText("<html>Project Manager Management</html> ");
        pnlDashPM.add(lblPMTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 145, 480, -1));

        lblMsg.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblMsg.setForeground(new java.awt.Color(255, 255, 255));
        lblMsg.setText("Welcome back, Admin!");
        pnlDashPM.add(lblMsg, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        lblBgDashL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/bgDashPM.png"))); // NOI18N
        pnlDashPM.add(lblBgDashL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 690, 180));

        lblListL.setBackground(new java.awt.Color(255, 255, 255));
        lblListL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/bgRemove.png"))); // NOI18N
        lblListL.setOpaque(true);
        lblListL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblListLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblListLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblListLMouseExited(evt);
            }
        });
        pnlDashPM.add(lblListL, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, -1, -1));

        lblRegL.setBackground(new java.awt.Color(255, 255, 255));
        lblRegL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/bgAllot.png"))); // NOI18N
        lblRegL.setOpaque(true);
        lblRegL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegLMouseExited(evt);
            }
        });
        pnlDashPM.add(lblRegL, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, -1, -1));

        lblManage.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        lblManage.setText("Manage");
        pnlDashPM.add(lblManage, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        lblTotalPM.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        lblTotalPM.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTotalPM.setText("0");
        pnlDashPM.add(lblTotalPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(929, 155, 80, -1));

        lblTTotal.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblTTotal.setForeground(new java.awt.Color(255, 255, 255));
        lblTTotal.setText("Total ");
        pnlDashPM.add(lblTTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 130, -1, -1));

        lblTPM.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblTPM.setForeground(new java.awt.Color(255, 255, 255));
        lblTPM.setText("Project Manager");
        pnlDashPM.add(lblTPM, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 230, -1, -1));

        lblBgTotal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/bgTotal.png"))); // NOI18N
        pnlDashPM.add(lblBgTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 100, 280, 180));

        lblBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/TransparentBox2.png"))); // NOI18N
        pnlDashPM.add(lblBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1075, 650));

        pnlMainDash.add(pnlDashPM, "card2");

        add(pnlMainDash, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1075, 650));
    }// </editor-fold>//GEN-END:initComponents

    private void lblRegLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegLMouseEntered

        lblRegL.setBorder(lineBorder); // Set the border to the label
        
    }//GEN-LAST:event_lblRegLMouseEntered

    private void lblRegLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegLMouseClicked

        allot.setVisible(true);
        pnlDashPM.setVisible(false);
        remove.setVisible(false);
    }//GEN-LAST:event_lblRegLMouseClicked

    private void lblRegLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegLMouseExited
        lblRegL.setBackground(Color.white);
        lblRegL.setBorder(lineBorder2); // Set the border to the label
    }//GEN-LAST:event_lblRegLMouseExited

    private void lblListLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblListLMouseEntered

        lblListL.setBorder(lineBorder); // Set the border to the label
    }//GEN-LAST:event_lblListLMouseEntered

    private void lblListLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblListLMouseExited
        lblListL.setBorder(lineBorder2); // Set the border to the label
    }//GEN-LAST:event_lblListLMouseExited

    private void lblListLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblListLMouseClicked
        allot.setVisible(false);
        pnlDashPM.setVisible(false);
        remove.setVisible(true);
    }//GEN-LAST:event_lblListLMouseClicked

    // Function to count the number of students registered with the role "Project Manager"
    public int countProjectManagers() {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader("lecturer_list.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(","); // Assuming the file is CSV format
                if (parts.length > 9 && parts[9].trim().equalsIgnoreCase("Project Manager")) {
                    count++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblBgDashL;
    private javax.swing.JLabel lblBgTotal;
    private javax.swing.JLabel lblBox;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblListL;
    private javax.swing.JLabel lblManage;
    private javax.swing.JLabel lblMsg;
    private javax.swing.JLabel lblPMDTitle;
    private javax.swing.JLabel lblPMTitle;
    private javax.swing.JLabel lblRegL;
    private javax.swing.JLabel lblTPM;
    private javax.swing.JLabel lblTTotal;
    private javax.swing.JLabel lblTotalPM;
    private javax.swing.JPanel pnlDashPM;
    private javax.swing.JLayeredPane pnlMainDash;
    // End of variables declaration//GEN-END:variables
}
