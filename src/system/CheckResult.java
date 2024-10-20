/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package system;

import Design.CurvedScrollBarUI;
import Design.CustomCellRenderer;
import Design.CustomHeaderRenderer;
import Design.CustomTableCellRenderer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import static java.awt.print.Printable.NO_SUCH_PAGE;
import static java.awt.print.Printable.PAGE_EXISTS;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.RowSorter;
import javax.swing.SortOrder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author nisha
 */
public class CheckResult extends javax.swing.JPanel {

    /**
     * Creates new form StudentRegistrationList
     */

    public String id;
    public String name;
    LoginPage login = new LoginPage();
    String date;
    String file;

    public CheckResult() {
        initComponents();


 
        String input = login.getUsername();;
        String[] parts = input.split("-");
        if (parts.length > 1) {
            id = parts[1].trim();
            name = parts[0].trim();
        }
        
        populateBox();
        populateResult();
        
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();

        // Define the desired format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        // Format the current date and time
        date = now.format(formatter);
        
        lblDateS.setText(date);

       

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMainCheckResult = new javax.swing.JLayeredPane();
        pnlCheckResult = new javax.swing.JPanel();
        lblResultTitle = new javax.swing.JLabel();
        pnlResult = new javax.swing.JPanel();
        lblSMNameS = new javax.swing.JLabel();
        lblSMName = new javax.swing.JLabel();
        lblSuperNameS = new javax.swing.JLabel();
        lblSuperName = new javax.swing.JLabel();
        lblIDS = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        lblNameS = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblIntakeCode = new javax.swing.JLabel();
        intakeLabel1 = new javax.swing.JLabel();
        lblRemarksS = new javax.swing.JLabel();
        lblRemarks = new javax.swing.JLabel();
        lblResultS = new javax.swing.JLabel();
        lblResult = new javax.swing.JLabel();
        lblDateS = new javax.swing.JLabel();
        lblDate = new javax.swing.JLabel();
        lblAssessementS = new javax.swing.JLabel();
        lblAssessement = new javax.swing.JLabel();
        lblLogo = new javax.swing.JLabel();
        lblResultTile = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        lblStudPresentationReq = new javax.swing.JLabel();
        lblPrint2 = new javax.swing.JLabel();
        lblBox = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1075, 650));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMainCheckResult.setPreferredSize(new java.awt.Dimension(1075, 650));
        pnlMainCheckResult.setLayout(new java.awt.CardLayout());

        pnlCheckResult.setBackground(new java.awt.Color(255, 255, 255));
        pnlCheckResult.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblResultTitle.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblResultTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblResultTitle.setText("Check Result");
        pnlCheckResult.add(lblResultTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 35, -1, -1));

        pnlResult.setBackground(new java.awt.Color(255, 255, 255));
        pnlResult.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        pnlResult.setPreferredSize(new java.awt.Dimension(1010, 230));
        pnlResult.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSMNameS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSMNameS.setForeground(new java.awt.Color(0, 0, 0));
        pnlResult.add(lblSMNameS, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 280, -1, -1));

        lblSMName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSMName.setForeground(new java.awt.Color(0, 0, 0));
        lblSMName.setText("Second Marker : ");
        pnlResult.add(lblSMName, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, -1, -1));

        lblSuperNameS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSuperNameS.setForeground(new java.awt.Color(0, 0, 0));
        pnlResult.add(lblSuperNameS, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, -1, -1));

        lblSuperName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSuperName.setForeground(new java.awt.Color(0, 0, 0));
        lblSuperName.setText("Supervisor : ");
        pnlResult.add(lblSuperName, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 230, -1, -1));

        lblIDS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIDS.setForeground(new java.awt.Color(0, 0, 0));
        pnlResult.add(lblIDS, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, -1, -1));

        lblID.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblID.setForeground(new java.awt.Color(0, 0, 0));
        lblID.setText("Key ID : ");
        pnlResult.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, -1, -1));

        lblNameS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblNameS.setForeground(new java.awt.Color(0, 0, 0));
        pnlResult.add(lblNameS, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 0, 0));
        lblName.setText("Name : ");
        pnlResult.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        lblIntakeCode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIntakeCode.setForeground(new java.awt.Color(0, 0, 0));
        pnlResult.add(lblIntakeCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, -1, -1));

        intakeLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        intakeLabel1.setForeground(new java.awt.Color(0, 0, 0));
        intakeLabel1.setText("Intake Code : ");
        pnlResult.add(intakeLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));

        lblRemarksS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRemarksS.setForeground(new java.awt.Color(0, 0, 0));
        pnlResult.add(lblRemarksS, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        lblRemarks.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRemarks.setForeground(new java.awt.Color(0, 0, 0));
        lblRemarks.setText("Remarks : ");
        pnlResult.add(lblRemarks, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        lblResultS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblResultS.setForeground(new java.awt.Color(0, 0, 0));
        pnlResult.add(lblResultS, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, -1));

        lblResult.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblResult.setForeground(new java.awt.Color(0, 0, 0));
        lblResult.setText("Grade : ");
        pnlResult.add(lblResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        lblDateS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDateS.setForeground(new java.awt.Color(0, 0, 0));
        pnlResult.add(lblDateS, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 140, -1, -1));

        lblDate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDate.setForeground(new java.awt.Color(0, 0, 0));
        lblDate.setText("Date : ");
        pnlResult.add(lblDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 140, -1, -1));

        lblAssessementS.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAssessementS.setForeground(new java.awt.Color(0, 0, 0));
        pnlResult.add(lblAssessementS, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        lblAssessement.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAssessement.setForeground(new java.awt.Color(0, 0, 0));
        lblAssessement.setText("Assessement Type : ");
        pnlResult.add(lblAssessement, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/ResultIcon.png"))); // NOI18N
        pnlResult.add(lblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        lblResultTile.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblResultTile.setForeground(new java.awt.Color(0, 0, 0));
        lblResultTile.setText("Student Assessment Result");
        pnlResult.add(lblResultTile, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, -1));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblTitle.setText("Academic Guidance Hub");
        pnlResult.add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, -1, -1));

        pnlCheckResult.add(pnlResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 1010, 490));

        lblStudPresentationReq.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblStudPresentationReq.setForeground(new java.awt.Color(29, 62, 105));
        lblStudPresentationReq.setText("Result");
        pnlCheckResult.add(lblStudPresentationReq, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        lblPrint2.setForeground(new java.awt.Color(51, 153, 255));
        lblPrint2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/iconPrint.png"))); // NOI18N
        lblPrint2.setText("Print");
        lblPrint2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPrint2MouseClicked(evt);
            }
        });
        pnlCheckResult.add(lblPrint2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 35, -1, -1));

        lblBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/TransparentBox2.png"))); // NOI18N
        pnlCheckResult.add(lblBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlMainCheckResult.add(pnlCheckResult, "card2");

        add(pnlMainCheckResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void lblPrint2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPrint2MouseClicked
               // Code to print the JPanel
        try {
            PrinterJob job = PrinterJob.getPrinterJob();
            job.setPrintable(new Printable() {
                @Override
                public int print(Graphics g, PageFormat pf, int page) throws PrinterException {
                    if (page > 0) {
                        return NO_SUCH_PAGE;
                    }
                    Graphics2D g2d = (Graphics2D) g;
                    g2d.translate(pf.getImageableX(), pf.getImageableY());

                    // Calculate scale to fit width
                    double panelWidth = pnlResult.getWidth();
                    double pageWidth = pf.getImageableWidth();
                    double scale = pageWidth / panelWidth;

                    g2d.scale(scale, scale);

                    pnlResult.printAll(g2d);
                    return PAGE_EXISTS;
                }
            });

            if (job.printDialog()) {
                job.print();
            }
        } catch (PrinterException e) {
            JOptionPane.showMessageDialog(null, "Cannot be printed! " + e.getMessage());
        }
    }//GEN-LAST:event_lblPrint2MouseClicked



    
    private void populateBox() {
        String filePath = "assign_student_list.txt"; 
        String currentId = id; 
        Set<String> uniqueIntakes1 = new HashSet<>(); 

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(","); 

                if (data.length >= 6) {
                    String id = data[0].trim();  

                    if (id.equalsIgnoreCase(currentId)) {                        
                        lblNameS.setText(data[1]);
                        lblIDS.setText(data[0]);
                        lblIntakeCode.setText(data[2]);
                        lblAssessementS.setText(data[3]);
                        lblSuperNameS.setText(data[7]);
                        lblSMNameS.setText(data[9]);
                        file = data[12].trim();

                    }
                  
                } else {
                    System.err.println("Invalid data : " + line);
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    
     private void populateResult() {
        String filePath = "reportEvaluation.txt"; 
        Set<String> uniqueIntakes1 = new HashSet<>();
         System.out.println(file);


        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\\|"); 

                if (data.length >= 2) {
                    String fileId = data[0].trim();  

                    if (fileId.equalsIgnoreCase(file)) {                        
                        lblResultS.setText(data[1]);
                        lblRemarksS.setText(data[2] + ", " + data[3]);

                    }
                  
                } else {
                    System.err.println("Invalid data : " + line);
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
        
    }




     
  
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel intakeLabel1;
    private javax.swing.JLabel lblAssessement;
    private javax.swing.JLabel lblAssessementS;
    private javax.swing.JLabel lblBox;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblDateS;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIDS;
    private javax.swing.JLabel lblIntakeCode;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNameS;
    private javax.swing.JLabel lblPrint;
    private javax.swing.JLabel lblPrint1;
    private javax.swing.JLabel lblPrint2;
    private javax.swing.JLabel lblRemarks;
    private javax.swing.JLabel lblRemarksS;
    private javax.swing.JLabel lblResult;
    private javax.swing.JLabel lblResultS;
    private javax.swing.JLabel lblResultTile;
    private javax.swing.JLabel lblResultTitle;
    private javax.swing.JLabel lblSMName;
    private javax.swing.JLabel lblSMNameS;
    private javax.swing.JLabel lblStudPresentationReq;
    private javax.swing.JLabel lblSuperName;
    private javax.swing.JLabel lblSuperNameS;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlCheckResult;
    private javax.swing.JLayeredPane pnlMainCheckResult;
    private javax.swing.JPanel pnlResult;
    // End of variables declaration//GEN-END:variables
}