/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package system;

import Design.CurvedScrollBarUI;
import Design.CustomCellRenderer;
import Design.CustomHeaderRenderer;
import Design.CustomTableCellRenderer;
import Design.StatusCellRenderer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
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
public class ViewMarkerAccept extends javax.swing.JPanel {

    /**
     * Creates new form LecturerEditDelete
     */
    String KeyId;
    String intakeCode;
    String Assess;
    String supervisorId;
    String approve;
    DefaultTableModel model;
    LoginPage login = new LoginPage();
    public String id;
    public String role;

    
    public ViewMarkerAccept() {
        initComponents();
        
        // Set custom scroll bar UI for jScrollPane2
        jScrollPane2.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jScrollPane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jScrollPane2.getVerticalScrollBar().setUI(new CurvedScrollBarUI());
        jScrollPane2.getHorizontalScrollBar().setUI(new CurvedScrollBarUI());
        jScrollPane3.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        jScrollPane3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jScrollPane3.getVerticalScrollBar().setUI(new CurvedScrollBarUI());
        jScrollPane3.getHorizontalScrollBar().setUI(new CurvedScrollBarUI());


        jTable1.getTableHeader().setDefaultRenderer(new CustomHeaderRenderer());
        jTable1.setDefaultRenderer(Object.class, new CustomCellRenderer());
        
        jTable2.getTableHeader().setDefaultRenderer(new CustomHeaderRenderer());
        jTable2.setDefaultRenderer(Object.class, new CustomCellRenderer());

        // Set the row height and curve radius
        jTable1.setRowHeight(20); // Set row height
        jTable1.setIntercellSpacing(new Dimension(0, 0)); // Remove cell spacing
        jTable1.setShowGrid(false); // Hide grid lines
        jTable1.setShowHorizontalLines(true);
        
        // Set the row height and curve radius
        jTable2.setRowHeight(20); // Set row height
        jTable2.setIntercellSpacing(new Dimension(0, 0)); // Remove cell spacing
        jTable2.setShowGrid(false); // Hide grid lines
        jTable2.setShowHorizontalLines(true);

       
        setTableHeaderHeight(jTable1, 30); // Set header height
        setTableHeaderHeight2(jTable2, 30); // Set header height
        


        // Make even rows a different color
        jTable1.setOpaque(false); // Make table transparent
        jTable1.setBackground(new Color(240, 240, 240)); // Set background color for odd rows
        jTable2.setOpaque(false); // Make table transparent
        jTable2.setBackground(new Color(240, 240, 240)); // Set background color for odd rows


        //Load data in table
        populateTable();
        

        // Apply custom cell renderer to each column
        CustomTableCellRenderer renderer = new CustomTableCellRenderer();
        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        // Apply custom cell renderer to each column
        CustomTableCellRenderer renderer3 = new CustomTableCellRenderer();
        for (int i = 0; i < jTable2.getColumnCount(); i++) {
            jTable2.getColumnModel().getColumn(i).setCellRenderer(renderer3);
        }
        

        
        
        
        // if table have value, execute this function
        System.out.println(jTable1.getRowCount());
        if(jTable1.getRowCount() > 0 ){

            StatusCellRenderer renderer2 = new StatusCellRenderer();
            for (int i = 0; i < jTable1.getColumnCount(); i++) {
                jTable1.getColumnModel().getColumn(i).setCellRenderer(renderer2);
            }
        }
        
        if(jTable2.getRowCount() > 0 ){

            StatusCellRenderer renderer4 = new StatusCellRenderer();
            for (int i = 0; i < jTable2.getColumnCount(); i++) {
                jTable2.getColumnModel().getColumn(i).setCellRenderer(renderer4);
            }
        }
        

        
        String input = login.getUsername();
        String[] parts = input.split("-");
        if (parts.length > 1) {
            id = parts[1];
        }
        
        role = login.getRole();
        
        populateTable2();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMainViewAccept = new javax.swing.JLayeredPane();
        pnlViewAccept = new javax.swing.JPanel();
        lblViewAcceptTitle = new javax.swing.JLabel();
        pnlTableStatus2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        lblRequestedStatus = new javax.swing.JLabel();
        pnlTableStatus = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblSupervisorStatusTable = new javax.swing.JLabel();
        btnAssign = new javax.swing.JButton();
        btnApprove = new javax.swing.JButton();
        lblBox = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMainViewAccept.setPreferredSize(new java.awt.Dimension(1075, 650));
        pnlMainViewAccept.setLayout(new java.awt.CardLayout());

        pnlViewAccept.setBackground(new java.awt.Color(255, 255, 255));
        pnlViewAccept.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblViewAcceptTitle.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblViewAcceptTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblViewAcceptTitle.setText("View Markers Acceptance & Request");
        pnlViewAccept.add(lblViewAcceptTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 35, -1, -1));

        pnlTableStatus2.setBackground(new java.awt.Color(255, 255, 255));
        pnlTableStatus2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        pnlTableStatus2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jTable2.setBackground(new java.awt.Color(255, 255, 255));
        jTable2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jTable2.setForeground(new java.awt.Color(0, 0, 0));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Intake code", "Assessment", "Supervisor ID/Second Marker ID", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable2.setAutoResizeMode(0);
        jTable2.setFocusable(false);
        jTable2.setGridColor(new java.awt.Color(204, 204, 204));
        jTable2.setOpaque(false);
        jTable2.setSelectionBackground(new java.awt.Color(102, 255, 51));
        jTable2.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable2.setShowHorizontalLines(true);
        jTable2.setShowVerticalLines(true);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable2MouseEntered(evt);
            }
        });
        jScrollPane3.setViewportView(jTable2);

        pnlTableStatus2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 50, 1010, 190));

        lblRequestedStatus.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblRequestedStatus.setForeground(new java.awt.Color(29, 62, 105));
        lblRequestedStatus.setText("Requested By Project Manager");
        pnlTableStatus2.add(lblRequestedStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, -1, -1));

        pnlViewAccept.add(pnlTableStatus2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 1030, 250));

        pnlTableStatus.setBackground(new java.awt.Color(255, 255, 255));
        pnlTableStatus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        pnlTableStatus.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jTable1.setBackground(new java.awt.Color(255, 255, 255));
        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student ID", "Student Name", "Intake code", "Assessment", "Supervisor ID", "Supervisor Name", "Status", "Second Marker ID", "Second Marker Name", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(0);
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(204, 204, 204));
        jTable1.setOpaque(false);
        jTable1.setSelectionBackground(new java.awt.Color(102, 255, 51));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
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
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setHeaderValue("Student Name");
            jTable1.getColumnModel().getColumn(5).setHeaderValue("Supervisor Name");
            jTable1.getColumnModel().getColumn(7).setHeaderValue("Second Marker ID");
            jTable1.getColumnModel().getColumn(8).setHeaderValue("Second Marker Name");
            jTable1.getColumnModel().getColumn(9).setHeaderValue("Status");
        }

        pnlTableStatus.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 50, 1010, 180));

        lblSupervisorStatusTable.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblSupervisorStatusTable.setForeground(new java.awt.Color(29, 62, 105));
        lblSupervisorStatusTable.setText("Supervisor & Second Marker Approve Status Table");
        pnlTableStatus.add(lblSupervisorStatusTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, -1, -1));

        pnlViewAccept.add(pnlTableStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 1030, 240));

        btnAssign.setBackground(new java.awt.Color(255, 0, 0));
        btnAssign.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAssign.setForeground(new java.awt.Color(255, 255, 255));
        btnAssign.setText("Reject");
        btnAssign.setPreferredSize(new java.awt.Dimension(76, 30));
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        pnlViewAccept.add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 595, 150, -1));

        btnApprove.setBackground(new java.awt.Color(51, 153, 255));
        btnApprove.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnApprove.setForeground(new java.awt.Color(255, 255, 255));
        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });
        pnlViewAccept.add(btnApprove, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 595, 150, 30));

        lblBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/TransparentBox2.png"))); // NOI18N
        lblBox.setPreferredSize(new java.awt.Dimension(1074, 650));
        pnlViewAccept.add(lblBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlMainViewAccept.add(pnlViewAccept, "card2");

        add(pnlMainViewAccept, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();


    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseEntered

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        String IdToFind = id;
        System.out.println(id+IdToFind+role);
        int i =0;
        int d = 0;
        int s =0;
        
        if(role.equals("Supervisor")){
            i=4;
            d=7;
            s=6;
        }
        else{
            i = 7;
            d = 4;
            s = 9;
        }
        try {
            // Read all lines from the file
            List<String> lines = Files.readAllLines(Paths.get("get_approve_list.txt"));

            // List to store the updated lines
            List<String> updatedLines = new ArrayList<>();

            for (String line : lines) {
                // Split the line into columns
                String[] columns = line.split(",");

                // Check if this is the line we need to edit
                if (columns[i].equals(id)&& columns[0].equals(KeyId) && columns[2].equals(intakeCode)&& columns[3].equals(Assess) && columns[d].equals(supervisorId)) {
                    // Update the specific column
                    columns[s] = "Reject";

                    
                }

                // Join the columns back into a single line
                updatedLines.add(String.join(",", columns));
            }

            // Write the updated lines back to the file
            Files.write(Paths.get("get_approve_list.txt"), updatedLines);

            JOptionPane.showMessageDialog(null, "File updated successfully.");
            populateTable2(); // Reload the table to reflect changes

        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error updating file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
  

    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed

        String IdToFind = id;
        System.out.println(id+IdToFind+role);
        int i =0;
        int d = 0;
        int s =0;
        
        if(role.equals("Supervisor")){
            i=4;
            d=7;
            s=6;
        }
        else{
            i = 7;
            d = 4;
            s = 9;
        }
        try {
            // Read all lines from the file
            List<String> lines = Files.readAllLines(Paths.get("get_approve_list.txt"));

            // List to store the updated lines
            List<String> updatedLines = new ArrayList<>();

            for (String line : lines) {
                // Split the line into columns
                String[] columns = line.split(",");

                // Check if this is the line we need to edit
                if (columns[i].equals(id)&& columns[0].equals(KeyId) && columns[2].equals(intakeCode)&& columns[3].equals(Assess) && columns[d].equals(supervisorId)) {
                    // Update the specific column
                    columns[s] = "Approve";

                    
                }

                // Join the columns back into a single line
                updatedLines.add(String.join(",", columns));
            }

            // Write the updated lines back to the file
            Files.write(Paths.get("get_approve_list.txt"), updatedLines);

            JOptionPane.showMessageDialog(null, "File updated successfully.");
            populateTable2(); // Reload the table to reflect changes

        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error updating file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
  
    }//GEN-LAST:event_btnApproveActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked

        int row = jTable2.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        
        KeyId = model.getValueAt(row, 0).toString();
        intakeCode = model.getValueAt(row, 1).toString();
        Assess = model.getValueAt(row, 2).toString();
        supervisorId = model.getValueAt(row, 3).toString();
        approve = model.getValueAt(row, 4).toString();

    }//GEN-LAST:event_jTable2MouseClicked

    private void jTable2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable2MouseEntered

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
    
        // Method to set table header height
    private void setTableHeaderHeight2(JTable table, int height) {
        JTableHeader header = table.getTableHeader();
        TableColumnModel columnModel = header.getColumnModel();
        for (int i = 0; i < columnModel.getColumnCount(); i++) {
            TableColumn column = columnModel.getColumn(i);
            column.setHeaderRenderer(new Design.HeaderRenderer(height));
            column.setPreferredWidth(210); // Set preferred column width
        }
        header.setPreferredSize(new Dimension(header.getWidth(), height));
    }



  
    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0); // Clear existing rows

        File file = new File("get_approve_list.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                model.addRow(data);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error reading data from file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }
     private void populateTable2() {
        DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        model.setRowCount(0); // Clear existing rows

        String IdToFind = id;
         System.out.println(id+IdToFind+role);
        int i =0;
        int d = 0;
        int s =0;
        
        if(role.equals("Supervisor")){
            i=4;
            d=7;
            s=6;
        }
        else{
            i = 7;
            d = 4;
            s = 9;
        }

        File file = new File("get_approve_list.txt");
        try {

            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data[i].equals(id)) {
                    String[] filteredData = {data[0], data[2], data[3], data[d], data[s]};
                    model.addRow(filteredData);
                }
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error reading data from file: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }




    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnAssign;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblBox;
    private javax.swing.JLabel lblRequestedStatus;
    private javax.swing.JLabel lblSupervisorStatusTable;
    private javax.swing.JLabel lblViewAcceptTitle;
    private javax.swing.JLayeredPane pnlMainViewAccept;
    private javax.swing.JPanel pnlTableStatus;
    private javax.swing.JPanel pnlTableStatus2;
    private javax.swing.JPanel pnlViewAccept;
    // End of variables declaration//GEN-END:variables
}
