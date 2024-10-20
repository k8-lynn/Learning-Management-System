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
public class RequestAssignLecturer extends javax.swing.JPanel {

    /**
     * Creates new form LecturerEditDelete
     */
    //Initialize variables
    String KeyId;
    String name;
    String intakeCode;
    String Assess;
    String date;
    String time;
    String supervisorName;
    String supervisorId;
    String secondMName;
    String secondMId;

    String approve;
    DefaultTableModel model;
    private List<String[]> assignedStud;
    private List<String[]> LectInfo;
    
    public RequestAssignLecturer() {
        initComponents();
        
        //Design table
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
        
        // Make even rows a different color
        jTable1.setOpaque(false); // Make table transparent
        jTable1.setBackground(new Color(240, 240, 240)); // Set background color for odd rows

       
        // Initialize student & lecturer array
        assignedStud = new ArrayList<>();
        LectInfo = new ArrayList<>();

        // Load students from file
        loadStudentsFromFile("assign_student_list.txt");
        // Load LECTURER from file
        loadLecturersFromFile("lecturer_list.txt");

        // Populate combo box with Key IDs
        populateComboBoxes();

        
        for (String[] lecturer : LectInfo) {
            if (!lecturer[9].equalsIgnoreCase("Project Manager")) { // Check the role column 
                cboSuperId.addItem(lecturer[0]); // Assuming the Key ID is in the first column
                cboSMarkerId.addItem(lecturer[0]);
            }
        }

        // Handle combo box selection
        cboKeyId.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedId = (String) cboKeyId.getSelectedItem();
                populateFields(selectedId);
            }
        });
        
        cboSuperId.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedId = (String) cboSuperId.getSelectedItem();
                populateFieldsSuper(selectedId);
            }
        });
        
        cboSMarkerId.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedId = (String) cboSMarkerId.getSelectedItem();
                populateFieldsSMarker(selectedId);
            }
        });
        
        //Load data in table
        populateTable();

        // Apply custom cell renderer to each column
        CustomTableCellRenderer renderer = new CustomTableCellRenderer();
        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setCellRenderer(renderer);
        }
        
        // if table have value, execute this function
        System.out.println(jTable1.getRowCount());
        if(jTable1.getRowCount() > 0 ){

            StatusCellRenderer renderer2 = new StatusCellRenderer();
            for (int i = 0; i < jTable1.getColumnCount(); i++) {
                jTable1.getColumnModel().getColumn(i).setCellRenderer(renderer2);
            }
        }

        

        // Add hours and minutes to hour
        for (int i = 0; i < 24; i++) {
            cboHours.addItem(String.format("%02d", i));
        }
        
        // Add minutes to minute
        for (int i = 0; i < 60; i++) {
            cboMinute.addItem(String.format("%02d", i));
        }
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMainLEditDelete = new javax.swing.JLayeredPane();
        pnlLEditDelete = new javax.swing.JPanel();
        lblLAssignLTitle = new javax.swing.JLabel();
        lblRequestAssignInfo = new javax.swing.JLabel();
        pnlTableCourse = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblSupervisorStatusTable = new javax.swing.JLabel();
        btnAssign = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblKeyId = new javax.swing.JLabel();
        txtSMarkerName = new javax.swing.JTextField();
        txtSuperName = new javax.swing.JTextField();
        txtAssess = new javax.swing.JTextField();
        lblIntake = new javax.swing.JLabel();
        txtIntake = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblAssess = new javax.swing.JLabel();
        cboMinute = new javax.swing.JComboBox<>();
        cboHours = new javax.swing.JComboBox<>();
        cboSMarkerId = new javax.swing.JComboBox<>();
        cboSuperId = new javax.swing.JComboBox<>();
        cboKeyId = new javax.swing.JComboBox<>();
        lblDuedate = new javax.swing.JLabel();
        dataC = new com.toedter.calendar.JDateChooser();
        lblHour = new javax.swing.JLabel();
        lblMinute = new javax.swing.JLabel();
        lblSupervisoriId = new javax.swing.JLabel();
        lblSupervisorName = new javax.swing.JLabel();
        lblSMarkerId = new javax.swing.JLabel();
        lblSMarkerName = new javax.swing.JLabel();
        btnRequest = new javax.swing.JButton();
        lblRefresh = new javax.swing.JLabel();
        lblBox = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMainLEditDelete.setPreferredSize(new java.awt.Dimension(1075, 650));
        pnlMainLEditDelete.setLayout(new java.awt.CardLayout());

        pnlLEditDelete.setBackground(new java.awt.Color(255, 255, 255));
        pnlLEditDelete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLAssignLTitle.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblLAssignLTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblLAssignLTitle.setText("Request and Assign Supervisor and Second Marker");
        pnlLEditDelete.add(lblLAssignLTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 35, -1, -1));

        lblRequestAssignInfo.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblRequestAssignInfo.setForeground(new java.awt.Color(29, 62, 105));
        lblRequestAssignInfo.setText("Request & Assign");
        pnlLEditDelete.add(lblRequestAssignInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 125, -1, -1));

        pnlTableCourse.setBackground(new java.awt.Color(255, 255, 255));
        pnlTableCourse.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        pnlTableCourse.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        pnlTableCourse.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 50, 530, 450));

        lblSupervisorStatusTable.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblSupervisorStatusTable.setForeground(new java.awt.Color(29, 62, 105));
        lblSupervisorStatusTable.setText("Supervisor & Second Marker Approve Status Table");
        pnlTableCourse.add(lblSupervisorStatusTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, -1, -1));

        pnlLEditDelete.add(pnlTableCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 550, 510));

        btnAssign.setBackground(new java.awt.Color(51, 255, 51));
        btnAssign.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAssign.setForeground(new java.awt.Color(255, 255, 255));
        btnAssign.setText("Assign");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });
        pnlLEditDelete.add(btnAssign, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 600, 150, -1));

        btnClear.setBackground(new java.awt.Color(51, 51, 51));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        pnlLEditDelete.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, -1, -1));

        lblKeyId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblKeyId.setForeground(new java.awt.Color(0, 0, 0));
        lblKeyId.setText("Key ID : ");
        pnlLEditDelete.add(lblKeyId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 50, -1));

        txtSMarkerName.setBackground(new java.awt.Color(221, 218, 218));
        pnlLEditDelete.add(txtSMarkerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 465, 230, -1));

        txtSuperName.setBackground(new java.awt.Color(221, 218, 218));
        pnlLEditDelete.add(txtSuperName, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 385, 230, -1));

        txtAssess.setBackground(new java.awt.Color(221, 218, 218));
        pnlLEditDelete.add(txtAssess, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, 230, -1));

        lblIntake.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIntake.setForeground(new java.awt.Color(0, 0, 0));
        lblIntake.setText("Intake code : ");
        pnlLEditDelete.add(lblIntake, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        txtIntake.setBackground(new java.awt.Color(221, 218, 218));
        txtIntake.setForeground(new java.awt.Color(0, 0, 0));
        txtIntake.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIntakeActionPerformed(evt);
            }
        });
        pnlLEditDelete.add(txtIntake, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 265, 230, -1));

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 0, 0));
        lblName.setText("Name : ");
        pnlLEditDelete.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 225, -1, -1));

        txtName.setBackground(new java.awt.Color(221, 218, 218));
        txtName.setForeground(new java.awt.Color(0, 0, 0));
        pnlLEditDelete.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 230, -1));

        lblAssess.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblAssess.setForeground(new java.awt.Color(0, 0, 0));
        lblAssess.setText("Assessment : ");
        pnlLEditDelete.add(lblAssess, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        cboMinute.setBackground(new java.awt.Color(204, 204, 204));
        cboMinute.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        pnlLEditDelete.add(cboMinute, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, 60, -1));

        cboHours.setBackground(new java.awt.Color(204, 204, 204));
        cboHours.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        cboHours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboHoursActionPerformed(evt);
            }
        });
        pnlLEditDelete.add(cboHours, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, 60, -1));

        cboSMarkerId.setBackground(new java.awt.Color(204, 204, 204));
        cboSMarkerId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        cboSMarkerId.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        cboSMarkerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSMarkerIdActionPerformed(evt);
            }
        });
        pnlLEditDelete.add(cboSMarkerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 430, 230, -1));

        cboSuperId.setBackground(new java.awt.Color(204, 204, 204));
        cboSuperId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        cboSuperId.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        cboSuperId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSuperIdActionPerformed(evt);
            }
        });
        pnlLEditDelete.add(cboSuperId, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 345, 230, -1));

        cboKeyId.setBackground(new java.awt.Color(204, 204, 204));
        cboKeyId.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        cboKeyId.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        pnlLEditDelete.add(cboKeyId, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 175, 230, -1));

        lblDuedate.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDuedate.setForeground(new java.awt.Color(0, 0, 0));
        lblDuedate.setText("Dealine : ");
        pnlLEditDelete.add(lblDuedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, -1, -1));

        dataC.setBackground(new java.awt.Color(255, 255, 255));
        dataC.setForeground(new java.awt.Color(0, 0, 0));
        dataC.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dataCPropertyChange(evt);
            }
        });
        pnlLEditDelete.add(dataC, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, 140, -1));

        lblHour.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblHour.setForeground(new java.awt.Color(0, 0, 0));
        lblHour.setText("Hour : ");
        pnlLEditDelete.add(lblHour, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, -1, -1));

        lblMinute.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblMinute.setForeground(new java.awt.Color(0, 0, 0));
        lblMinute.setText("Minute : ");
        pnlLEditDelete.add(lblMinute, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 520, -1, -1));

        lblSupervisoriId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSupervisoriId.setForeground(new java.awt.Color(0, 0, 0));
        lblSupervisoriId.setText("Supervisor ID : ");
        pnlLEditDelete.add(lblSupervisoriId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        lblSupervisorName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSupervisorName.setForeground(new java.awt.Color(0, 0, 0));
        lblSupervisorName.setText("Supervisor Name : ");
        pnlLEditDelete.add(lblSupervisorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, -1, -1));

        lblSMarkerId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSMarkerId.setForeground(new java.awt.Color(0, 0, 0));
        lblSMarkerId.setText("Second Marker ID : ");
        pnlLEditDelete.add(lblSMarkerId, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, -1, -1));

        lblSMarkerName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSMarkerName.setForeground(new java.awt.Color(0, 0, 0));
        lblSMarkerName.setText("Second Marker Name : ");
        pnlLEditDelete.add(lblSMarkerName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 470, -1, -1));

        btnRequest.setBackground(new java.awt.Color(51, 153, 255));
        btnRequest.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnRequest.setText("Request");
        btnRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestActionPerformed(evt);
            }
        });
        pnlLEditDelete.add(btnRequest, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, 150, -1));

        lblRefresh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblRefresh.setForeground(new java.awt.Color(51, 153, 255));
        lblRefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/iconRef.png"))); // NOI18N
        lblRefresh.setText("Refresh");
        lblRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRefreshMouseClicked(evt);
            }
        });
        pnlLEditDelete.add(lblRefresh, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 130, -1, -1));

        lblBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/TransparentBox2.png"))); // NOI18N
        lblBox.setPreferredSize(new java.awt.Dimension(1074, 650));
        pnlLEditDelete.add(lblBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlMainLEditDelete.add(pnlLEditDelete, "card2");

        add(pnlMainLEditDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();

        // Set the cboKeyId 
        cboKeyId.setSelectedItem(model.getValueAt(row, 0).toString());
        cboSuperId.setSelectedItem(model.getValueAt(row, 4).toString());
        cboSMarkerId.setSelectedItem(model.getValueAt(row, 7).toString());

    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseEntered

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        String keyIdToEdit = cboKeyId.getSelectedItem().toString();
        Date dateC = dataC.getDate();
        date = DateFormat.getDateInstance().format(dateC); // Convert to string
        time = cboHours.getSelectedItem().toString() + ":" + cboMinute.getSelectedItem().toString();


       //Add data in "assign_student_list.txt" file
        try {
            // Read all lines from the file
            List<String> lines = Files.readAllLines(Paths.get("assign_student_list.txt"));

            // List to store the updated lines
            List<String> updatedLines = new ArrayList<>();

            for (String line : lines) {
                // Split the line into columns
                String[] columns = line.split(",");

                // Check if this is the line we need to edit
                if (columns[0].equals(keyIdToEdit)) {
                    // Update the specific column
                    columns[6] = cboSuperId.getSelectedItem().toString();
                    columns[7] = txtSuperName.getText();
                    columns[8] = cboSMarkerId.getSelectedItem().toString();
                    columns[9] = txtSMarkerName.getText();
                    columns[10] = date;
                    columns[11] = time;
                    
                }

                // Join the columns back into a single line
                updatedLines.add(String.join(",", columns));
            }

            // Write the updated lines back to the file
            Files.write(Paths.get("assign_student_list.txt"), updatedLines);

            JOptionPane.showMessageDialog(null, "File updated successfully.");
            populateTable(); // Reload the table to reflect changes

        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error updating file: " + e.getMessage(), 
                    "Error", JOptionPane.ERROR_MESSAGE);
        }

       //Add role in "lecturer_list.txt" file
        try {
            // Read all lines from the file
            List<String> lines = Files.readAllLines(Paths.get("lecturer_list.txt"));

            // List to store the updated lines
            List<String> updatedLines = new ArrayList<>();

            for (String line : lines) {
                // Split the line into columns
                String[] columns = line.split(",");

                // Check if this is the line we need to edit
                if (columns[0].equals(cboSuperId.getSelectedItem().toString())) {
                    // Update the specific column
                    columns[9] = "Supervisor";
                    
                }
                
                if(columns[0].equals(cboSMarkerId.getSelectedItem().toString())) {
                    // Update the specific column
                    columns[9] = "Second Marker";
                }

                // Join the columns back into a single line
                updatedLines.add(String.join(",", columns));
            }

            // Write the updated lines back to the file
            Files.write(Paths.get("lecturer_list.txt"), updatedLines);

            JOptionPane.showMessageDialog(null, "File lecturer updated successfully.");
            populateTable(); // Reload the table to reflect changes

        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error updating file: " + e.getMessage(), 
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        //Clear all text 
        txtAssess.setText("");
        txtName.setText("");
        txtIntake.setText("");
        cboKeyId.setSelectedIndex(-1);
        cboSuperId.setSelectedIndex(-1);
        cboSMarkerId.setSelectedIndex(-1);
        txtSuperName.setText("");
        txtSMarkerName.setText("");
        dataC.setDate(null);
        cboHours.setSelectedIndex(0);
        cboMinute.setSelectedIndex(0);



    }//GEN-LAST:event_btnAssignActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // Clear text fields
        txtAssess.setText("");
        txtName.setText("");
        txtIntake.setText("");
        cboKeyId.setSelectedIndex(-1);
        cboSuperId.setSelectedIndex(-1);
        cboSMarkerId.setSelectedIndex(-1);
        txtSuperName.setText("");
        txtSMarkerName.setText("");
        dataC.setDate(null);
        cboHours.setSelectedIndex(0);
        cboMinute.setSelectedIndex(0);
    }//GEN-LAST:event_btnClearActionPerformed

    private void txtIntakeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIntakeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIntakeActionPerformed

    private void dataCPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dataCPropertyChange
        if ("date".equals(evt.getPropertyName())) {
            Date selectedDate = (Date) evt.getNewValue();
            if (selectedDate != null) {
                //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                SimpleDateFormat dateF = new SimpleDateFormat("ddMMYY");
                String date = dateF.format(selectedDate);

            }
        }
    }//GEN-LAST:event_dataCPropertyChange

    private void cboHoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboHoursActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboHoursActionPerformed

    private void cboSuperIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSuperIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboSuperIdActionPerformed

    private void cboSMarkerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSMarkerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboSMarkerIdActionPerformed

    private void btnRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestActionPerformed

        KeyId = cboKeyId.getSelectedItem().toString();
        intakeCode = txtIntake.getText();
        name = txtName.getText();
        Assess = txtAssess.getText();
        supervisorId = cboSuperId.getSelectedItem().toString();
        supervisorName = txtSuperName.getText();
        secondMId = cboSMarkerId.getSelectedItem().toString();
        secondMName = txtSMarkerName.getText();
        approve = "Pending";


        //boolean duplicateFound = false;
        boolean notCompletedForm = false;

        if (KeyId.isEmpty() || name.isEmpty() ||  intakeCode.isEmpty()) {
            notCompletedForm = true;
            JOptionPane.showMessageDialog(this, "Please complete the form");
        }


        //!duplicateFound && 
        if (!notCompletedForm) {
            
              try {
                FileWriter writer = new FileWriter("get_approve_list.txt", true);
                writer.write(KeyId + "," + name + "," + intakeCode + "," + Assess + "," 
                        + supervisorId + "," + supervisorName +"," + approve +"," + 
                        secondMId + "," + secondMName + "," + approve);
                writer.write(System.getProperty("line.separator"));

                writer.close();
                JOptionPane.showMessageDialog(null, "Successfully set approvel");
                
                
                // Call the method to populate the table 
                populateTable();
            } catch (IOException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Error : " 
                        + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Fill all fields");
        }
        
    }//GEN-LAST:event_btnRequestActionPerformed

    private void lblRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRefreshMouseClicked
        assignedStud.clear();
        loadStudentsFromFile("assign_student_list.txt");

        // Update the combo boxes
        populateComboBoxes();
    }//GEN-LAST:event_lblRefreshMouseClicked

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


    private void loadStudentsFromFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 3) { // Ensure there are at least 3 elements (KeyId, name, intakeCode)
                    assignedStud.add(data);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    private void loadLecturersFromFile(String filePath) {
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length >= 3) { // 
                    LectInfo.add(data);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

     // Populate combo boxes with data
    private void populateComboBoxes() {
        cboKeyId.removeAllItems(); // Clear existing items
        cboKeyId.addItem("Select");
        for (String[] student : assignedStud) {
            cboKeyId.addItem(student[0]); // Assuming the Key ID is in the first column
        }

    }
    private void populateFields(String selectedId) {
        for (String[] student : assignedStud) {
            if (student[0].equals(selectedId)) {
                txtName.setText(student[1]); // the name is in the second column
                txtIntake.setText(student[2]); // the intake code is in the third column
                txtAssess.setText(student[3]); // the Assessment is in the fourth column
                break;
            }
        }
    }
    
    private void populateFieldsSuper(String selectedId) {
        for (String[] lecturer : LectInfo) {
            if (lecturer[0].equals(selectedId)) {
                txtSuperName.setText(lecturer[2]); // the name is in the second column
                break;
            }
        }
    }
    
    private void populateFieldsSMarker(String selectedId) {
        for (String[] lecturer : LectInfo) {
            if (lecturer[0].equals(selectedId)) {
                txtSMarkerName.setText(lecturer[2]); // the name is in the second column
                break;
            }
        }
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
            JOptionPane.showMessageDialog(null, "Error reading data from file: " 
                    + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnRequest;
    private javax.swing.JComboBox<String> cboHours;
    private javax.swing.JComboBox<String> cboKeyId;
    private javax.swing.JComboBox<String> cboMinute;
    private javax.swing.JComboBox<String> cboSMarkerId;
    private javax.swing.JComboBox<String> cboSuperId;
    private com.toedter.calendar.JDateChooser dataC;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblAssess;
    private javax.swing.JLabel lblBox;
    private javax.swing.JLabel lblDuedate;
    private javax.swing.JLabel lblHour;
    private javax.swing.JLabel lblIntake;
    private javax.swing.JLabel lblKeyId;
    private javax.swing.JLabel lblLAssignLTitle;
    private javax.swing.JLabel lblMinute;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblRefresh;
    private javax.swing.JLabel lblRequestAssignInfo;
    private javax.swing.JLabel lblSMarkerId;
    private javax.swing.JLabel lblSMarkerName;
    private javax.swing.JLabel lblSupervisorName;
    private javax.swing.JLabel lblSupervisorStatusTable;
    private javax.swing.JLabel lblSupervisoriId;
    private javax.swing.JPanel pnlLEditDelete;
    private javax.swing.JLayeredPane pnlMainLEditDelete;
    private javax.swing.JPanel pnlTableCourse;
    private javax.swing.JTextField txtAssess;
    private javax.swing.JTextField txtIntake;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSMarkerName;
    private javax.swing.JTextField txtSuperName;
    // End of variables declaration//GEN-END:variables
}
