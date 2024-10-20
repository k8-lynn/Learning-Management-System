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
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
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
public class LecturerRegistrationList extends javax.swing.JPanel {

    /**
     * Creates new form StudentRegistrationList
     */
    DefaultTableModel model;
    private ArrayList<ConcreteLecturer> lecturersList;
    private JComboBox<String> schoolComboBox;
    private JComboBox<String> intakeCodeComboBox;
    
    public LecturerRegistrationList() {
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
        
        // Initialize student array
        lecturersList = new ArrayList<>();
         // Load existing data
        loadData();
        
        populateSchoolComboBox();
       
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

        pnlMainLList = new javax.swing.JLayeredPane();
        pnlLList = new javax.swing.JPanel();
        lblLListTitle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        lblBack = new javax.swing.JLabel();
        lblPrint = new javax.swing.JLabel();
        lblSchool = new javax.swing.JLabel();
        cboSchool = new javax.swing.JComboBox<>();
        lblBox = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1075, 650));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMainLList.setPreferredSize(new java.awt.Dimension(1075, 650));
        pnlMainLList.setLayout(new java.awt.CardLayout());

        pnlLList.setBackground(new java.awt.Color(255, 255, 255));
        pnlLList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLListTitle.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblLListTitle.setText("Lecturer Registration Lists");
        pnlLList.add(lblLListTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 35, -1, -1));

        jScrollPane2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        jScrollPane2.setForeground(new java.awt.Color(221, 218, 218));

        jTable1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(244, 244, 244), 1, true));
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

        pnlLList.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 1030, 440));

        lblSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSearch.setForeground(new java.awt.Color(51, 153, 255));
        lblSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/searchIcon.png"))); // NOI18N
        lblSearch.setText(":");
        pnlLList.add(lblSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 40, 30));

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
        pnlLList.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 90, 230, 25));

        lblBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBack.setForeground(new java.awt.Color(51, 153, 255));
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/leftArrow.png"))); // NOI18N
        lblBack.setText("Lecturer Dashboard");
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        pnlLList.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, -1, -1));

        lblPrint.setForeground(new java.awt.Color(51, 153, 255));
        lblPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/iconPrint.png"))); // NOI18N
        lblPrint.setText("Print");
        lblPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPrintMouseClicked(evt);
            }
        });
        pnlLList.add(lblPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 35, -1, -1));

        lblSchool.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSchool.setText("School : ");
        pnlLList.add(lblSchool, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        cboSchool.setBackground(new java.awt.Color(204, 204, 204));
        cboSchool.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        cboSchool.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSchoolActionPerformed(evt);
            }
        });
        pnlLList.add(cboSchool, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 210, -1));

        lblBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/TransparentBox2.png"))); // NOI18N
        pnlLList.add(lblBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pnlMainLList.add(pnlLList, "card2");

        add(pnlMainLList, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
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

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        LecturerDashboardA lectD = new LecturerDashboardA();
        pnlMainLList.add(lectD);
        lectD.setVisible(true);
        pnlLList.setVisible(false);
     
    }//GEN-LAST:event_lblBackMouseClicked

    private void lblPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPrintMouseClicked
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Lecturer Registration List\n");
        MessageFormat footer = new MessageFormat("\nAGHUB");

        try{
            jTable1.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }catch(PrinterException e){
            JOptionPane.showMessageDialog(null,"Cannot be print ! " +e.getMessage());
        }

    }//GEN-LAST:event_lblPrintMouseClicked

    private void cboSchoolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSchoolActionPerformed

        filterTable();
    }//GEN-LAST:event_cboSchoolActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void loadData() {

        File file = new File("lecturer_list.txt");
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 10) {

                    ConcreteLecturer lecturer = new ConcreteLecturer(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], parts[6], parts[7], parts[8], parts[9]);

                    lecturersList.add(lecturer);  // Add the student to the list
                }


            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    } 
    
    private void populateTable() {
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);  // Clear existing rows

        for (ConcreteLecturer lecturer : lecturersList) {
            model.addRow(lecturer.toObjectArray());
        }
    }
    
    private void populateSchoolComboBox() {
        cboSchool.addItem("All");
        List<String> schools = lecturersList.stream().map(ConcreteLecturer::getSchool).distinct().collect(Collectors.toList());
        for (String school : schools) {
            cboSchool.addItem(school);
        }
    }

    
     private void filterTable() {
        String selectedSchool = (String) cboSchool.getSelectedItem();

        List<ConcreteLecturer> filteredLecturer = lecturersList.stream()
                .filter(student -> ("All".equals(selectedSchool) || student.getSchool().equals(selectedSchool)))
                .collect(Collectors.toList());

        populateTable2(filteredLecturer);
    }
     
     private void populateTable2(List<ConcreteLecturer> lecturers) {
        model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        for (ConcreteLecturer lecturer : lecturers) {
            model.addRow(lecturer.toObjectArray());
        }
    }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboSchool;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBox;
    private javax.swing.JLabel lblLListTitle;
    private javax.swing.JLabel lblPrint;
    private javax.swing.JLabel lblSchool;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JPanel pnlLList;
    private javax.swing.JLayeredPane pnlMainLList;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
