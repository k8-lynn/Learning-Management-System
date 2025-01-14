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
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
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
public class LecturerEditDelete extends javax.swing.JPanel {

    /**
     * Creates new form LecturerEditDelete
     */
    DefaultTableModel model;
    private ArrayList<ConcreteLecturer> lecturersED;
    
    public LecturerEditDelete() {
        initComponents();
        
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
        
        txtRole.setText("-");
        txtRole.setVisible(false);
        
        // Initialize student array
        lecturersED = new ArrayList<>();
         // Load existing data
        loadData();
       
        // Populate table
        populateTable();
        
        // Apply custom cell renderer to each column
        CustomTableCellRenderer renderer = new CustomTableCellRenderer();
        for (int i = 0; i < jTable1.getColumnCount(); i++) {
            jTable1.getColumnModel().getColumn(i).setCellRenderer(renderer);
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
        lblLModifyTitle = new javax.swing.JLabel();
        lblLectInfo = new javax.swing.JLabel();
        pnlLecturerKey = new javax.swing.JPanel();
        pnlLKey = new javax.swing.JPanel();
        lblKeyId = new javax.swing.JLabel();
        txtKeyId = new javax.swing.JTextField();
        txtKeyPass = new javax.swing.JTextField();
        lblKeyPass = new javax.swing.JLabel();
        lblLSchool = new javax.swing.JLabel();
        lblLInfo = new javax.swing.JLabel();
        lblLKey = new javax.swing.JLabel();
        pnlLInfo = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblICNo = new javax.swing.JLabel();
        txtIdNo = new javax.swing.JTextField();
        lblDOB = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lblContactNo = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        txtDob = new javax.swing.JTextField();
        txtContactNo = new javax.swing.JTextField();
        pnlLSchool = new javax.swing.JPanel();
        lblSchool = new javax.swing.JLabel();
        txtSchool = new javax.swing.JTextField();
        txtRole = new javax.swing.JTextField();
        pnlTableCourse = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblLectTable = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblBack = new javax.swing.JLabel();
        lblBox = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMainLEditDelete.setPreferredSize(new java.awt.Dimension(1075, 650));
        pnlMainLEditDelete.setLayout(new java.awt.CardLayout());

        pnlLEditDelete.setBackground(new java.awt.Color(255, 255, 255));
        pnlLEditDelete.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLModifyTitle.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblLModifyTitle.setText("Modify Lecturer Information");
        pnlLEditDelete.add(lblLModifyTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 35, -1, -1));

        lblLectInfo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblLectInfo.setForeground(new java.awt.Color(29, 62, 105));
        lblLectInfo.setText("Lecturer Information");
        pnlLEditDelete.add(lblLectInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        pnlLecturerKey.setBackground(new java.awt.Color(255, 255, 255));
        pnlLecturerKey.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(221, 218, 218), 1, true));
        pnlLecturerKey.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlLKey.setBackground(new java.awt.Color(255, 255, 255));
        pnlLKey.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        pnlLKey.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblKeyId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblKeyId.setText("Key ID : ");
        pnlLKey.add(lblKeyId, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, -1));

        txtKeyId.setBackground(new java.awt.Color(221, 218, 218));
        pnlLKey.add(txtKeyId, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 5, 110, -1));

        txtKeyPass.setBackground(new java.awt.Color(221, 218, 218));
        pnlLKey.add(txtKeyPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 5, 130, -1));

        lblKeyPass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblKeyPass.setText("Key Password : ");
        pnlLKey.add(lblKeyPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 10, -1, -1));

        pnlLecturerKey.add(pnlLKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 490, 40));

        lblLSchool.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        lblLSchool.setForeground(new java.awt.Color(29, 62, 105));
        lblLSchool.setText("Lecturer School");
        pnlLecturerKey.add(lblLSchool, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 280, -1, -1));

        lblLInfo.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        lblLInfo.setForeground(new java.awt.Color(29, 62, 105));
        lblLInfo.setText("Lecturer Personal Infromation");
        pnlLecturerKey.add(lblLInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 90, -1, -1));

        lblLKey.setFont(new java.awt.Font("Segoe UI", 1, 11)); // NOI18N
        lblLKey.setForeground(new java.awt.Color(29, 62, 105));
        lblLKey.setText("Lecturer Key");
        pnlLecturerKey.add(lblLKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 20, -1, -1));

        pnlLInfo.setBackground(new java.awt.Color(255, 255, 255));
        pnlLInfo.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        pnlLInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblName.setText("Name : ");
        pnlLInfo.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 15, 52, -1));

        txtName.setBackground(new java.awt.Color(221, 218, 218));
        pnlLInfo.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 10, 190, -1));

        lblICNo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblICNo.setText("IC No : ");
        pnlLInfo.add(lblICNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 50, 52, -1));

        txtIdNo.setBackground(new java.awt.Color(221, 218, 218));
        pnlLInfo.add(txtIdNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 46, 190, -1));

        lblDOB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDOB.setText("D.O.B : ");
        pnlLInfo.add(lblDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 15, 52, -1));

        lblGender.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblGender.setText("Gender : ");
        pnlLInfo.add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 50, 52, -1));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmail.setText("Email : ");
        pnlLInfo.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 85, 52, -1));

        txtEmail.setBackground(new java.awt.Color(221, 218, 218));
        pnlLInfo.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 80, 190, -1));

        lblContactNo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblContactNo.setText("Contact No : ");
        pnlLInfo.add(lblContactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 120, 80, -1));

        txtGender.setBackground(new java.awt.Color(221, 218, 218));
        txtGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtGenderActionPerformed(evt);
            }
        });
        pnlLInfo.add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 45, 150, -1));

        txtDob.setBackground(new java.awt.Color(221, 218, 218));
        txtDob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDobActionPerformed(evt);
            }
        });
        pnlLInfo.add(txtDob, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 150, -1));

        txtContactNo.setBackground(new java.awt.Color(221, 218, 218));
        txtContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNoActionPerformed(evt);
            }
        });
        pnlLInfo.add(txtContactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 115, 173, -1));

        pnlLecturerKey.add(pnlLInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 490, 160));

        pnlLSchool.setBackground(new java.awt.Color(255, 255, 255));
        pnlLSchool.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 204, 204)));
        pnlLSchool.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSchool.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSchool.setText("School : ");
        pnlLSchool.add(lblSchool, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 15, 80, -1));

        txtSchool.setBackground(new java.awt.Color(221, 218, 218));
        txtSchool.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSchoolKeyReleased(evt);
            }
        });
        pnlLSchool.add(txtSchool, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 300, -1));

        txtRole.setBackground(new java.awt.Color(255, 102, 102));
        pnlLSchool.add(txtRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 170, -1));

        pnlLecturerKey.add(pnlLSchool, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 490, 150));

        pnlLEditDelete.add(pnlLecturerKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 510, 470));

        pnlTableCourse.setBackground(new java.awt.Color(255, 255, 255));
        pnlTableCourse.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        pnlTableCourse.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));

        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Key ID", "Key Password", "Name", "IC No", "D.O.B", "Gender", "Email", "Contact No", "School", "Role"
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

        pnlTableCourse.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 60, 490, 390));

        lblLectTable.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        lblLectTable.setForeground(new java.awt.Color(29, 62, 105));
        lblLectTable.setText("Lecturer Table");
        pnlTableCourse.add(lblLectTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, -1, -1));

        txtSearch.setBackground(new java.awt.Color(244, 244, 244));
        txtSearch.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });
        pnlTableCourse.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 230, 25));

        lblSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSearch.setForeground(new java.awt.Color(51, 153, 255));
        lblSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/searchIcon.png"))); // NOI18N
        lblSearch.setText(":");
        pnlTableCourse.add(lblSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 40, 30));

        pnlLEditDelete.add(pnlTableCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 110, 510, 470));

        btnEdit.setBackground(new java.awt.Color(102, 102, 102));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        pnlLEditDelete.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 600, -1, -1));

        btnDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        pnlLEditDelete.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 600, -1, -1));

        btnClear.setBackground(new java.awt.Color(51, 51, 51));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        pnlLEditDelete.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 600, -1, -1));

        lblBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBack.setForeground(new java.awt.Color(51, 153, 255));
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/leftArrow.png"))); // NOI18N
        lblBack.setText("Lecturer Dashboard");
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        pnlLEditDelete.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, -1, -1));

        lblBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/TransparentBox2.png"))); // NOI18N
        lblBox.setPreferredSize(new java.awt.Dimension(1074, 650));
        pnlLEditDelete.add(lblBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlMainLEditDelete.add(pnlLEditDelete, "card2");

        add(pnlMainLEditDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void txtGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtGenderActionPerformed

    private void txtDobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDobActionPerformed

    private void txtContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNoActionPerformed

    private void txtSchoolKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSchoolKeyReleased
        txtSchool.setText(txtSchool.getText().toUpperCase());
    }//GEN-LAST:event_txtSchoolKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        // Get the ID as an integer from the first column of the selected row
        //int id = (int) model.getValueAt(row, 0);

        // Set the text of txtId with the integer ID converted to a string
        txtKeyId.setText(model.getValueAt(row, 0).toString());
        txtKeyPass.setText(model.getValueAt(row, 1).toString());
        txtName.setText(model.getValueAt(row, 2).toString());
        txtIdNo.setText(model.getValueAt(row, 3).toString());
        txtDob.setText(model.getValueAt(row, 4).toString());
        txtGender.setText(model.getValueAt(row, 5).toString());
        txtEmail.setText(model.getValueAt(row, 6).toString());
        txtContactNo.setText(model.getValueAt(row, 7).toString());
        txtSchool.setText(model.getValueAt(row, 8).toString());
        txtRole.setText(model.getValueAt(row, 9).toString());

        if(txtSearch.getText()!=""){
            // Get the sorted row index in the model
            int sortedRowIndex = jTable1.convertRowIndexToModel(row);
            String idSort = model.getValueAt(sortedRowIndex, 0).toString();

            // Set the text of txtId with the integer ID converted to a string
            txtKeyId.setText(idSort);

            // Retrieve data from the model using the sorted row index
            txtKeyPass.setText(model.getValueAt(sortedRowIndex, 1).toString());
            txtName.setText(model.getValueAt(sortedRowIndex, 2).toString());
            txtIdNo.setText(model.getValueAt(sortedRowIndex, 3).toString());
            txtDob.setText(model.getValueAt(sortedRowIndex, 4).toString());
            txtGender.setText(model.getValueAt(sortedRowIndex, 5).toString());
            txtEmail.setText(model.getValueAt(sortedRowIndex, 6).toString());
            txtContactNo.setText(model.getValueAt(sortedRowIndex, 7).toString());
            txtSchool.setText(model.getValueAt(sortedRowIndex, 8).toString());
            txtRole.setText(model.getValueAt(sortedRowIndex, 9).toString());

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
        String searchText = txtSearch.getText(); // Get the search text
        obj.setRowFilter(RowFilter.regexFilter("(?i)" + Pattern.quote(searchText))); // Apply a case-insensitive row filter
    }//GEN-LAST:event_txtSearchKeyReleased

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        txtSearch.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLUE)); // Add border
    }//GEN-LAST:event_txtSearchKeyTyped

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if (txtSearch.getText().isEmpty() == false) {
            String idToEdit = txtKeyId.getText(); // Assuming txtKeyID holds the ID of the row to edit
            boolean found = false;
            int viewIndexToEdit = -1;
            int modelIndexToEdit = -1;

            // Iterate over each row in the list
            for (int i = 0; i < lecturersED.size(); i++) {
                ConcreteLecturer lecturer = lecturersED.get(i);
                if (lecturer.getKeyId().equals(idToEdit)) {
                    found = true;
                    modelIndexToEdit = i; // Set the model index to the index in the courses list
                    break;
                }
            }

            // If ID is found
            if (found) {
                // Update data in table
                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.setValueAt(txtKeyPass.getText(), modelIndexToEdit, 1); // Assuming ID is in the first column
                model.setValueAt(txtName.getText(), modelIndexToEdit, 2);
                model.setValueAt(txtIdNo.getText(), modelIndexToEdit, 3);
                model.setValueAt(txtDob.getText(), modelIndexToEdit, 4);
                model.setValueAt(txtGender.getText(), modelIndexToEdit, 5);
                model.setValueAt(txtEmail.getText(), modelIndexToEdit, 6);
                model.setValueAt(txtContactNo.getText(), modelIndexToEdit, 7);          
                model.setValueAt(txtSchool.getText(), modelIndexToEdit, 8);
                model.setValueAt(txtRole.getText(), modelIndexToEdit, 9);

    

                // Update data in list
                ConcreteLecturer lecturer = lecturersED.get(modelIndexToEdit);
                lecturer.setKeyPass(txtKeyPass.getText());
                lecturer.setName(txtName.getText());
                lecturer.setIc(txtIdNo.getText());
                lecturer.setDob(txtDob.getText());
                lecturer.setGender(txtGender.getText());
                lecturer.setEmail(txtEmail.getText());
                lecturer.setNumber(txtContactNo.getText());
                lecturer.setSchool(txtSchool.getText());
                lecturer.setRole(txtRole.getText());

                // Save data to file
                saveData();
                JOptionPane.showMessageDialog(this, "Data successfully edited");
            } else {
                JOptionPane.showMessageDialog(this, "Row with ID: " + idToEdit + " not found.");
            }
        } else {
            int selectedRow = jTable1.getSelectedRow();
            if (selectedRow != -1) {
                ConcreteLecturer lecturer = lecturersED.get(selectedRow);
                lecturer.setKeyPass(txtKeyPass.getText());
                lecturer.setName(txtName.getText());
                lecturer.setIc(txtIdNo.getText());
                lecturer.setDob(txtDob.getText());
                lecturer.setGender(txtGender.getText());
                lecturer.setEmail(txtEmail.getText());
                lecturer.setNumber(txtContactNo.getText());
                lecturer.setSchool(txtSchool.getText());
                lecturer.setRole(txtRole.getText());


                // Update data in table
                model.setValueAt(txtKeyPass.getText(), selectedRow, 1); // Assuming ID is in the first column
                model.setValueAt(txtName.getText(), selectedRow, 2);
                model.setValueAt(txtIdNo.getText(), selectedRow, 3);
                model.setValueAt(txtDob.getText(), selectedRow, 4);
                model.setValueAt(txtGender.getText(), selectedRow, 5);
                model.setValueAt(txtEmail.getText(), selectedRow, 6);
                model.setValueAt(txtContactNo.getText(), selectedRow, 7);
                model.setValueAt(txtSchool.getText(), selectedRow, 8);
                model.setValueAt(txtRole.getText(), selectedRow, 9);


                // Save data to file
                saveData();
                JOptionPane.showMessageDialog(this, "Data successfully edited");
            } else {
                JOptionPane.showMessageDialog(this, "Please select a row to edit data");
            }
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (!txtSearch.getText().isEmpty()) {
            String IdToDelete =""; // Initialize to a sentinel value

            // Check if the ID text field is not empty
            if (!txtKeyId.getText().isEmpty()) {
                IdToDelete = txtKeyId.getText();
            }

            // If ID is provided or not empty
            if (!IdToDelete.isEmpty()) {
                boolean found = false;
                int viewIndexToDelete = -1;
                int modelIndexToDelete = -1;

                // Iterate over each row in the view
                for (int viewIndex = 0; viewIndex < jTable1.getRowCount(); viewIndex++) {
                    // Convert view index to model index
                    int modelIndex = jTable1.convertRowIndexToModel(viewIndex);

                    // Get the ID from the model at the model index
                    String id = jTable1.getModel().getValueAt(modelIndex, 0).toString();

                    // Check if the ID matches the one to delete
                    if (IdToDelete.equals(id)) {
                        viewIndexToDelete = viewIndex;
                        modelIndexToDelete = modelIndex;
                        found = true;
                        break; // Exit loop if ID is found
                    }
                }

                // If ID is found
                if (found) {
                    int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete the row with ID: " + IdToDelete + "?", "Confirmation", JOptionPane.YES_NO_OPTION);
                    if (option == JOptionPane.YES_OPTION) {
                        // Remove the row from the table model
                        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                        lecturersED.remove(modelIndexToDelete);
                        model.removeRow(modelIndexToDelete);

                        // Clear text fields
                        txtKeyId.setText("");
                        txtKeyPass.setText("");
                        txtName.setText("");
                        txtIdNo.setText("");
                        txtDob.setText("");
                        txtGender.setText("");
                        txtEmail.setText("");
                        txtContactNo.setText("");
                        txtSchool.setText("");
                        txtSearch.setText("");
                

                        // Save data to file
                        saveData();

                        JOptionPane.showMessageDialog(this, "Row with ID: " + IdToDelete + " successfully deleted.");
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Row with ID: " + IdToDelete + " not found.");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please enter a valid ID to delete.");
            }
        } else {
            // Delete the selected row if the search field is empty
            int selectedRow = jTable1.getSelectedRow();
            if (selectedRow != -1) {
                int option = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete the selected row?", "Confirmation", JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    lecturersED.remove(selectedRow);
                    model.removeRow(selectedRow);

                    // Clear text fields
                    txtKeyId.setText("");
                    txtKeyPass.setText("");
                    txtName.setText("");
                    txtIdNo.setText("");
                    txtDob.setText("");
                    txtGender.setText("");
                    txtEmail.setText("");
                    txtContactNo.setText("");
                    txtSchool.setText("");
                    txtSearch.setText("");

                    // Save data to file
                    saveData();
                    JOptionPane.showMessageDialog(this, "Data successfully deleted");
                } else {
                    JOptionPane.showMessageDialog(this, "Data delete unsuccessful");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            }
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // Clear text fields
        txtKeyId.setText("");
        txtKeyPass.setText("");
        txtName.setText("");
        txtIdNo.setText("");
        txtDob.setText("");
        txtGender.setText("");
        txtEmail.setText("");
        txtContactNo.setText("");
        txtSchool.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        LecturerDashboardA lectD = new LecturerDashboardA();
        pnlMainLEditDelete.add(lectD);
        lectD.setVisible(true);
        pnlLEditDelete.setVisible(false);
    }//GEN-LAST:event_lblBackMouseClicked

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

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

    private void loadData() {
        
        File file = new File("lecturer_list.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
               
                if (parts.length == 10) {
                    
                    ConcreteLecturer  lecturer = new ConcreteLecturer (parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], parts[6], parts[7], parts[8], parts[9]);
                   
                    lecturersED.add(lecturer);  // Add the student to the list
                }
                
               
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    } 
     private void saveData() {
        File file = new File("lecturer_list.txt");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (Lecturer lecturer : lecturersED) {
                writer.write(lecturer.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    private void populateTable() {
        model = (DefaultTableModel) jTable1.getModel();
        //model.setColumnIdentifiers(new Object[]{"KeyId", "KeyPass", "Name", "DOB", "Gender", "Number", "Email", "StudyLevel", "School", "Program", "IntakeCode"});
        model.setRowCount(0);  // Clear existing rows
        for (ConcreteLecturer lecturer : lecturersED) {

            model.addRow(lecturer.toObjectArray());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBox;
    private javax.swing.JLabel lblContactNo;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblICNo;
    private javax.swing.JLabel lblKeyId;
    private javax.swing.JLabel lblKeyPass;
    private javax.swing.JLabel lblLInfo;
    private javax.swing.JLabel lblLKey;
    private javax.swing.JLabel lblLModifyTitle;
    private javax.swing.JLabel lblLSchool;
    private javax.swing.JLabel lblLectInfo;
    private javax.swing.JLabel lblLectTable;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblSchool;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JPanel pnlLEditDelete;
    private javax.swing.JPanel pnlLInfo;
    private javax.swing.JPanel pnlLKey;
    private javax.swing.JPanel pnlLSchool;
    private javax.swing.JPanel pnlLecturerKey;
    private javax.swing.JLayeredPane pnlMainLEditDelete;
    private javax.swing.JPanel pnlTableCourse;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtDob;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtIdNo;
    private javax.swing.JTextField txtKeyId;
    private javax.swing.JTextField txtKeyPass;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtRole;
    private javax.swing.JTextField txtSchool;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
