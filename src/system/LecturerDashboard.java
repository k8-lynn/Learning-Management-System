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
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author nisha
 */
public class LecturerDashboard extends javax.swing.JPanel {

    /**
     * Creates new form StudentRegistrationList
     */
    DefaultTableModel model;
    public String id; 
    LoginPage login = new LoginPage();
    public String role;
    ViewSuperviseeList view = new ViewSuperviseeList();
    public int totalStud = 0;
    public int totalPending = 0;

    public LecturerDashboard() {
        initComponents();
        pnlMainDashboardL.add(view);
        view.setVisible(false);
          // Set custom scroll bar UI for jScrollPane2
        jScrollPane2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jScrollPane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jScrollPane2.getVerticalScrollBar().setUI(new CurvedScrollBarUI());
        jScrollPane2.getHorizontalScrollBar().setUI(new CurvedScrollBarUI());

        jTable1.getTableHeader().setDefaultRenderer(new CustomHeaderRenderer());
        jTable1.setDefaultRenderer(Object.class, new CustomCellRenderer());

        // Set the row height and curve radius
        jTable1.setRowHeight(20); // Set row height
        jTable1.setIntercellSpacing(new Dimension(0, 0)); // Remove cell spacing
        jTable1.setShowGrid(false); // Hide grid lines
        jTable1.setShowHorizontalLines(true);
       
        setTableHeaderHeight(jTable1, 30); // Set header height
    
        lblDashTitle.setText("Dashboard "+login.getRole());
 
        String input = login.getUsername();
        String[] parts = input.split("-");
        if (parts.length > 1) {
            id = parts[1];
        }


       
        // Populate table
        populateTable();
        
        // Apply custom cell renderer to each column
        CustomTableCellRenderer renderer = new CustomTableCellRenderer();
        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        


        if (role.equals("Supervisor")){
            lblTotalSuper.setText(""+totalStud);
            lblTotalSM.setText("0");
            
        }else{
            lblTotalSuper.setText("0");
            lblTotalSM.setText(""+totalStud);
        }
        
        lblTotalPending.setText(""+totalPending);

       
 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMainDashboardL = new javax.swing.JLayeredPane();
        pnlDashboardL = new javax.swing.JPanel();
        lblDashTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        lblViewList = new javax.swing.JLabel();
        lblTotalPending = new javax.swing.JLabel();
        lblTPending = new javax.swing.JLabel();
        lblBgTSupervisee1 = new javax.swing.JLabel();
        lblTotalSM = new javax.swing.JLabel();
        lblTotalSuper = new javax.swing.JLabel();
        lblTSM = new javax.swing.JLabel();
        lblTSuper = new javax.swing.JLabel();
        lblBgTSupervisee = new javax.swing.JLabel();
        lblAs = new javax.swing.JLabel();
        lblBgTSupervisee2 = new javax.swing.JLabel();
        lblBox = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1075, 650));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMainDashboardL.setPreferredSize(new java.awt.Dimension(1075, 650));
        pnlMainDashboardL.setLayout(new java.awt.CardLayout());

        pnlDashboardL.setBackground(new java.awt.Color(255, 255, 255));
        pnlDashboardL.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblDashTitle.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblDashTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblDashTitle.setText("Dashboard");
        pnlDashboardL.add(lblDashTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 35, -1, -1));

        jScrollPane2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jScrollPane2.setForeground(new java.awt.Color(221, 218, 218));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(244, 244, 244), 1, true));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Key ID", "Name", "Intake Code", "Assessment", "Duedate", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(204, 204, 204));
        jTable1.setSelectionBackground(new java.awt.Color(102, 255, 51));
        jTable1.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        pnlDashboardL.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 1030, 380));

        lblSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSearch.setForeground(new java.awt.Color(51, 153, 255));
        lblSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/searchIcon.png"))); // NOI18N
        lblSearch.setText(":");
        pnlDashboardL.add(lblSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 40, 30));

        txtSearch.setBackground(new java.awt.Color(244, 244, 244));
        txtSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });
        pnlDashboardL.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 230, 25));

        lblViewList.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblViewList.setForeground(new java.awt.Color(51, 153, 255));
        lblViewList.setText("View List");
        lblViewList.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(51, 153, 255)));
        lblViewList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblViewListMouseClicked(evt);
            }
        });
        pnlDashboardL.add(lblViewList, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 225, -1, -1));

        lblTotalPending.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblTotalPending.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalPending.setText("0");
        pnlDashboardL.add(lblTotalPending, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 105, 30, -1));

        lblTPending.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        lblTPending.setForeground(new java.awt.Color(255, 255, 255));
        lblTPending.setText("<html>Total Pending</html>");
        pnlDashboardL.add(lblTPending, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 110, 140, -1));

        lblBgTSupervisee1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/box2.png"))); // NOI18N
        pnlDashboardL.add(lblBgTSupervisee1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, 250, 120));

        lblTotalSM.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblTotalSM.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalSM.setText("0");
        pnlDashboardL.add(lblTotalSM, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 105, 30, -1));

        lblTotalSuper.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        lblTotalSuper.setForeground(new java.awt.Color(255, 255, 255));
        lblTotalSuper.setText("0");
        pnlDashboardL.add(lblTotalSuper, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 105, 40, -1));

        lblTSM.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        lblTSM.setForeground(new java.awt.Color(255, 255, 255));
        lblTSM.setText("<html>Total Student</html>");
        pnlDashboardL.add(lblTSM, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, 140, -1));

        lblTSuper.setFont(new java.awt.Font("Segoe UI", 1, 26)); // NOI18N
        lblTSuper.setForeground(new java.awt.Color(255, 255, 255));
        lblTSuper.setText("<html>Total Supervisee</html>");
        pnlDashboardL.add(lblTSuper, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 170, -1));

        lblBgTSupervisee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/box1.png"))); // NOI18N
        lblBgTSupervisee.setMaximumSize(new java.awt.Dimension(233, 120));
        lblBgTSupervisee.setMinimumSize(new java.awt.Dimension(233, 120));
        pnlDashboardL.add(lblBgTSupervisee, new org.netbeans.lib.awtextra.AbsoluteConstraints(87, 90, -1, 120));

        lblAs.setForeground(new java.awt.Color(102, 102, 102));
        lblAs.setText("As Second Marker");
        pnlDashboardL.add(lblAs, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, -1));

        lblBgTSupervisee2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/box3.png"))); // NOI18N
        lblBgTSupervisee2.setPreferredSize(new java.awt.Dimension(233, 120));
        pnlDashboardL.add(lblBgTSupervisee2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 233, 120));

        lblBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/TransparentBox2.png"))); // NOI18N
        pnlDashboardL.add(lblBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlMainDashboardL.add(pnlDashboardL, "card2");

        add(pnlMainDashboardL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

       // Method to set table header height
    private void setTableHeaderHeight(JTable table, int height) {
        JTableHeader header = table.getTableHeader();
        TableColumnModel columnModel = header.getColumnModel();
        for (int i = 0; i < columnModel.getColumnCount(); i++) {
            TableColumn column = columnModel.getColumn(i);
            column.setHeaderRenderer(new Design.HeaderRenderer(height));
            column.setPreferredWidth(130); // Set preferred column width
        }
        header.setPreferredSize(new Dimension(header.getWidth(), height));
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();




        if(txtSearch.getText()!=""){
            // Get the sorted row index in the model
            int sortedRowIndex = jTable1.convertRowIndexToModel(row);
            String idSort = model.getValueAt(sortedRowIndex, 0).toString();

        }
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseEntered

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        txtSearch.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.LIGHT_GRAY)); // Add border
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel(); // Get the table model
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(model); // Create a new row sorter for the table model
        jTable1.setRowSorter(obj); // Set the row sorter for the table
        obj.setRowFilter(RowFilter.regexFilter(txtSearch.getText())); // Apply a row filter based on the text in the search field
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        txtSearch.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLUE)); // Add border
    }//GEN-LAST:event_txtSearchKeyTyped

    private void lblViewListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblViewListMouseClicked
        view.setVisible(true);
        pnlDashboardL.setVisible(false);
    }//GEN-LAST:event_lblViewListMouseClicked


    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Clear existing rows
        role = login.getRole();
        //Variable to set index number based on the role
        int i = 0;
        int p = 0;

        if (role.equals("Supervisor")){
            i = 7;
            p = 9;
        }else{
            i = 10;
            p = 12;
        }



        File file = new File("status_report.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 8) { // Ensure there are enough columns
                    if (data[i].equals(id)) { // Check if the ID matches the filter
                        String[] selectedData = new String[] {
                            data[0], // Student ID
                            data[1], // Student Name
                            data[2], // Intake Code
                            data[3], // Assessment
                            data[4], // Date
                            data[6], // Status
                        };
                        model.addRow(selectedData);
                        totalStud++;
                    }
                    if (data[i].equals(id)&& data[p].equals("Pending")) { // Check if the ID matches the filter

                        totalPending++;
                    }
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error reading data from file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }



     
  
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAs;
    private javax.swing.JLabel lblBgTSupervisee;
    private javax.swing.JLabel lblBgTSupervisee1;
    private javax.swing.JLabel lblBgTSupervisee2;
    private javax.swing.JLabel lblBox;
    private javax.swing.JLabel lblDashTitle;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblTPending;
    private javax.swing.JLabel lblTSM;
    private javax.swing.JLabel lblTSuper;
    private javax.swing.JLabel lblTotalPending;
    private javax.swing.JLabel lblTotalSM;
    private javax.swing.JLabel lblTotalSuper;
    private javax.swing.JLabel lblViewList;
    private javax.swing.JPanel pnlDashboardL;
    private javax.swing.JLayeredPane pnlMainDashboardL;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
