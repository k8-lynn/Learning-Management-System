/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package system;

import Design.CurvedScrollBarUI;
import Design.CustomHeaderRenderer;
import Design.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.PrinterException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.MessageFormat;

import java.util.ArrayList;
import java.util.*;
import java.util.Vector;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author nisha
 */
class Course {
    
    private int id;
    private String studyLevel;
    private String school;
    private String program;
    private String intakeCode;
    private String course;
    
    public Course(int id, String studyLevel,String school,String program,String intakeCode, String course){
        this.id = id;
        this.studyLevel = studyLevel;
        this.program = program;
        this.intakeCode = intakeCode;
        this.school = school;
        this.course = course;
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStudyLevel() {
        return studyLevel;
    }

    public void setStudyLevel(String studyLevel) {
        this.studyLevel = studyLevel;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getIntakeCode() {
        return intakeCode;
    }

    public void setIntakeCode(String intakeCode) {
        this.intakeCode = intakeCode;
    }
    
    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
    
    public Object[] toObjectArray() {
        return new Object[]{id,studyLevel, school, program, intakeCode, course};
    }

    public String toCSVString() {
        return id + "," + studyLevel + "," + school + "," + program + "," + intakeCode + "," + course;
    }
    
    
    
    
    
    
}

public class CourseList extends javax.swing.JPanel {

    /**
     * Creates new form CourseList
     */
    String studyLevel;
    String school;
    String program;
    String intakeCode;
    String courseStudy;
    DefaultTableModel model;
    private ArrayList<Course> courses;
    private int nextId; // Variable to hold the next available ID
  

   
    
    public CourseList() {
        
        
        initComponents();
        
        // Set custom scroll bar UI for jScrollPane2
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
        
//        JScrollPane scrollPane = new JScrollPane(jScrollPane2);
//        scrollPane.getVerticalScrollBar().setUI(new CurvedScrollBarUI());
//        scrollPane.getHorizontalScrollBar().setUI(new CurvedScrollBarUI());

        txtId.setVisible(false);



        
        // Initialize courses array
        courses = new ArrayList<>();
        
       

     
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMainCourse = new javax.swing.JLayeredPane();
        pnlCourse = new javax.swing.JPanel();
        lblCourseTitle = new javax.swing.JLabel();
        lblCourseInfo = new javax.swing.JLabel();
        pnlStudentKey = new javax.swing.JPanel();
        txtStudyLevel = new javax.swing.JTextField();
        lblProgram = new javax.swing.JLabel();
        lblStudyLevel = new javax.swing.JLabel();
        lblSchool = new javax.swing.JLabel();
        txtSchool = new javax.swing.JTextField();
        lblCourse = new javax.swing.JLabel();
        txtProgram = new javax.swing.JTextField();
        lblIntakeCode = new javax.swing.JLabel();
        txtCourse = new javax.swing.JTextField();
        txtIntakeCode = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        pnlTableCourse = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        lblSearch = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblPrint = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();
        lblBoxCourse = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMainCourse.setPreferredSize(new java.awt.Dimension(1075, 650));
        pnlMainCourse.setLayout(new java.awt.CardLayout());

        pnlCourse.setBackground(new java.awt.Color(255, 255, 255));
        pnlCourse.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCourseTitle.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblCourseTitle.setForeground(new java.awt.Color(0, 0, 0));
        lblCourseTitle.setText("Course Lists");
        pnlCourse.add(lblCourseTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 35, -1, -1));

        lblCourseInfo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCourseInfo.setForeground(new java.awt.Color(29, 62, 105));
        lblCourseInfo.setText("Course Information");
        pnlCourse.add(lblCourseInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        pnlStudentKey.setBackground(new java.awt.Color(255, 255, 255));
        pnlStudentKey.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(221, 218, 218), 1, true));
        pnlStudentKey.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtStudyLevel.setBackground(new java.awt.Color(221, 218, 218));
        txtStudyLevel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 3, 1, 1, new java.awt.Color(204, 204, 204)));
        txtStudyLevel.setMargin(new java.awt.Insets(2, 10, 2, 6));
        txtStudyLevel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtStudyLevelKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtStudyLevelKeyTyped(evt);
            }
        });
        pnlStudentKey.add(txtStudyLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 237, 25));

        lblProgram.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblProgram.setForeground(new java.awt.Color(0, 0, 0));
        lblProgram.setText("Program : ");
        pnlStudentKey.add(lblProgram, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 15, -1, -1));

        lblStudyLevel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblStudyLevel.setForeground(new java.awt.Color(0, 0, 0));
        lblStudyLevel.setText("Study Level : ");
        pnlStudentKey.add(lblStudyLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 15, 80, -1));

        lblSchool.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSchool.setForeground(new java.awt.Color(0, 0, 0));
        lblSchool.setText("School : ");
        pnlStudentKey.add(lblSchool, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 60, 80, -1));

        txtSchool.setBackground(new java.awt.Color(221, 218, 218));
        txtSchool.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSchoolKeyReleased(evt);
            }
        });
        pnlStudentKey.add(txtSchool, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 55, 237, -1));

        lblCourse.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblCourse.setForeground(new java.awt.Color(0, 0, 0));
        lblCourse.setText("Course : ");
        pnlStudentKey.add(lblCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, -1, -1));

        txtProgram.setBackground(new java.awt.Color(221, 218, 218));
        txtProgram.setForeground(new java.awt.Color(0, 0, 0));
        txtProgram.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtProgramKeyReleased(evt);
            }
        });
        pnlStudentKey.add(txtProgram, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, 300, -1));

        lblIntakeCode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIntakeCode.setForeground(new java.awt.Color(0, 0, 0));
        lblIntakeCode.setText("Intake Code : ");
        pnlStudentKey.add(lblIntakeCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 60, -1, -1));

        txtCourse.setBackground(new java.awt.Color(221, 218, 218));
        txtCourse.setForeground(new java.awt.Color(0, 0, 0));
        txtCourse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCourseKeyReleased(evt);
            }
        });
        pnlStudentKey.add(txtCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 55, 270, -1));

        txtIntakeCode.setBackground(new java.awt.Color(221, 218, 218));
        txtIntakeCode.setForeground(new java.awt.Color(0, 0, 0));
        txtIntakeCode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIntakeCodeKeyReleased(evt);
            }
        });
        pnlStudentKey.add(txtIntakeCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 55, 200, -1));

        txtId.setBackground(new java.awt.Color(255, 102, 102));
        txtId.setText("jTextField1");
        pnlStudentKey.add(txtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 10, 190, -1));

        pnlCourse.add(pnlStudentKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 1035, 100));

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
                "Id", "Study Level", "School", "Program", "Intake Code", "Course"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setFocusable(false);
        jTable1.setGridColor(new java.awt.Color(204, 204, 204));
        jTable1.setOpaque(false);
        jTable1.setSelectionBackground(new java.awt.Color(102, 255, 51));
        jTable1.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);

        pnlTableCourse.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 1010, 290));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(29, 62, 105));
        jLabel1.setText("Course Table");
        pnlTableCourse.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 15, -1, -1));

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
        pnlTableCourse.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 230, 25));

        lblSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSearch.setForeground(new java.awt.Color(51, 153, 255));
        lblSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/searchIcon.png"))); // NOI18N
        lblSearch.setText(":");
        pnlTableCourse.add(lblSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 10, 40, 30));

        pnlCourse.add(pnlTableCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 1035, 350));

        btnAdd.setBackground(new java.awt.Color(31, 178, 209));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("ADD");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        pnlCourse.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 600, -1, -1));

        btnEdit.setBackground(new java.awt.Color(102, 102, 102));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        pnlCourse.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 600, -1, -1));

        btnDelete.setBackground(new java.awt.Color(255, 0, 0));
        btnDelete.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("DELETE");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        pnlCourse.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 600, -1, -1));

        btnClear.setBackground(new java.awt.Color(51, 51, 51));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("CLEAR");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        pnlCourse.add(btnClear, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 600, -1, -1));

        lblPrint.setForeground(new java.awt.Color(51, 153, 255));
        lblPrint.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/iconPrint.png"))); // NOI18N
        lblPrint.setText("Print");
        lblPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPrintMouseClicked(evt);
            }
        });
        pnlCourse.add(lblPrint, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 35, -1, -1));

        lblBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBack.setForeground(new java.awt.Color(51, 153, 255));
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/leftArrow.png"))); // NOI18N
        lblBack.setText("Student Dashboard");
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        pnlCourse.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 600, -1, -1));

        lblBoxCourse.setBackground(new java.awt.Color(255, 255, 255));
        lblBoxCourse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/TransparentBox2.png"))); // NOI18N
        pnlCourse.add(lblBoxCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1075, 650));

        pnlMainCourse.add(pnlCourse, "card2");

        add(pnlMainCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseEntered

 
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       String studyLevel = txtStudyLevel.getText().toUpperCase();
        String school = txtSchool.getText().toUpperCase();
        String program = txtProgram.getText().toUpperCase();
        String intakeCode = txtIntakeCode.getText().toUpperCase();
        String courseStudy = txtCourse.getText().toUpperCase();
        
        // Check if a course with the same intake code already exists
        boolean duplicateFound = false;
        for (Course course : courses) {
            if (course.getIntakeCode().equals(intakeCode) && course.getStudyLevel().equals(studyLevel)&& course.getSchool().equals(school) && course.getCourse().equals(courseStudy) ) {
                duplicateFound = true;
                break;
            }
        }
        
        if (!duplicateFound) {
            Course course = new Course(nextId++,studyLevel, school, program, intakeCode, courseStudy);
            courses.add(course);
            
            // Add data to table
            model.addRow(course.toObjectArray());
            
//             // Append new course to the file
            try (BufferedWriter writer = new BufferedWriter(new FileWriter("course_list.txt", true))) {
                writer.write(course.getId() + "," + course.getStudyLevel() + "," + course.getSchool() + "," + course.getProgram() + "," + course.getIntakeCode() + "," + course.getCourse() + "\n");
               
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Save data to file
            saveData();
        } else {
            JOptionPane.showMessageDialog(this, "Duplicate intake code found. Please enter a unique intake code.");
        }
    
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed

    if (txtSearch.getText().isEmpty() == false) {
        int idToEdit = Integer.parseInt(txtId.getText()); // Assuming txtID holds the ID of the row to edit
        boolean found = false;
        int viewIndexToEdit = -1;
        int modelIndexToEdit = -1;

        // Iterate over each row in the courses list
        for (int i = 0; i < courses.size(); i++) {
            Course course = courses.get(i);
            if (course.getId() == idToEdit) {
                found = true;
                modelIndexToEdit = i; // Set the model index to the index in the courses list
                break;
            }
        }

        // If ID is found
        if (found) {
            // Update data in table
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setValueAt(txtStudyLevel.getText(), modelIndexToEdit, 1); // Assuming ID is in the first column
            model.setValueAt(txtSchool.getText(), modelIndexToEdit, 2);
            model.setValueAt(txtProgram.getText(), modelIndexToEdit, 3);
            model.setValueAt(txtIntakeCode.getText(), modelIndexToEdit, 4);
            model.setValueAt(txtCourse.getText(), modelIndexToEdit, 5);

            // Update data in courses list
            Course course = courses.get(modelIndexToEdit);
            course.setStudyLevel(txtStudyLevel.getText());
            course.setSchool(txtSchool.getText());
            course.setProgram(txtProgram.getText());
            course.setIntakeCode(txtIntakeCode.getText());
            course.setCourse(txtCourse.getText());

            // Save data to file
            saveData();
            JOptionPane.showMessageDialog(this, "Data successfully edited");
        } else {
            JOptionPane.showMessageDialog(this, "Row with ID: " + idToEdit + " not found.");
        }
    } else {
        int selectedRow = jTable1.getSelectedRow();
        if (selectedRow != -1) {
            Course course = courses.get(selectedRow);
            course.setStudyLevel(txtStudyLevel.getText());
            course.setSchool(txtSchool.getText());
            course.setProgram(txtProgram.getText());
            course.setIntakeCode(txtIntakeCode.getText());
            course.setCourse(txtCourse.getText());
            
            // Update data in table
            model.setValueAt(course.getStudyLevel(), selectedRow, 1); // Assuming ID is in the first column
            model.setValueAt(course.getSchool(), selectedRow, 2);
            model.setValueAt(course.getProgram(), selectedRow, 3);
            model.setValueAt(course.getIntakeCode(), selectedRow, 4);
            model.setValueAt(course.getCourse(), selectedRow, 5);
            
            // Save data to file
            saveData();
            JOptionPane.showMessageDialog(this, "Data successfully edited");
        } else {
            JOptionPane.showMessageDialog(this, "Please select a row to edit data");
        }
    }
       
    
    }//GEN-LAST:event_btnEditActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        // Get the ID as an integer from the first column of the selected row
        //int id = (int) model.getValueAt(row, 0);
    
        // Set the text of txtId with the integer ID converted to a string
        txtId.setText(model.getValueAt(row, 0).toString());
        txtStudyLevel.setText(model.getValueAt(row, 1).toString());
        txtSchool.setText(model.getValueAt(row, 2).toString());
        txtProgram.setText(model.getValueAt(row, 3).toString());
        txtIntakeCode.setText(model.getValueAt(row, 4).toString());
        txtCourse.setText(model.getValueAt(row, 5).toString());
        

    
        if(txtSearch.getText()!=""){
             // Get the sorted row index in the model
            int sortedRowIndex = jTable1.convertRowIndexToModel(row);
            int idSort = (int) model.getValueAt(sortedRowIndex, 0);
    
            // Set the text of txtId with the integer ID converted to a string
            txtId.setText(String.valueOf(idSort));
    
            // Retrieve data from the model using the sorted row index
            txtStudyLevel.setText(model.getValueAt(sortedRowIndex, 1).toString());
            txtSchool.setText(model.getValueAt(sortedRowIndex, 2).toString());
            txtProgram.setText(model.getValueAt(sortedRowIndex, 3).toString());
            txtIntakeCode.setText(model.getValueAt(sortedRowIndex, 4).toString());
            txtCourse.setText(model.getValueAt(sortedRowIndex, 5).toString());
            
        }
       
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed

   if (!txtSearch.getText().isEmpty()) {
        int IdToDelete = -1; // Initialize to a sentinel value

        // Check if the ID text field is not empty
        if (!txtId.getText().isEmpty()) {
            IdToDelete = Integer.parseInt(txtId.getText());
        }

        // If ID is provided or not empty
        if (IdToDelete != -1) {
            boolean found = false;
            int viewIndexToDelete = -1;
            int modelIndexToDelete = -1;

            // Iterate over each row in the view
            for (int viewIndex = 0; viewIndex < jTable1.getRowCount(); viewIndex++) {
                // Convert view index to model index
                int modelIndex = jTable1.convertRowIndexToModel(viewIndex);

                // Get the ID from the model at the model index
                int id = (int) jTable1.getModel().getValueAt(modelIndex, 0);

                // Check if the ID matches the one to delete
                if (IdToDelete == id) {
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
                    courses.remove(modelIndexToDelete);
                    model.removeRow(modelIndexToDelete);

                    // Clear text fields
                    txtId.setText("");
                    txtStudyLevel.setText("");
                    txtSchool.setText("");
                    txtProgram.setText("");
                    txtIntakeCode.setText("");
                    txtCourse.setText("");

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
                courses.remove(selectedRow);
                model.removeRow(selectedRow);

                // Clear text fields
                txtId.setText("");
                txtStudyLevel.setText("");
                txtSchool.setText("");
                txtProgram.setText("");
                txtIntakeCode.setText("");
                txtCourse.setText("");

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
            txtStudyLevel.setText("");
            txtSchool.setText("");
            txtProgram.setText("");
            txtIntakeCode.setText("");
            txtCourse.setText("");
            txtSearch.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

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

    private void txtStudyLevelKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStudyLevelKeyTyped
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtStudyLevelKeyTyped

    private void txtStudyLevelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtStudyLevelKeyReleased
         txtStudyLevel.setText(txtStudyLevel.getText().toUpperCase());
    }//GEN-LAST:event_txtStudyLevelKeyReleased

    private void txtSchoolKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSchoolKeyReleased
        txtSchool.setText(txtSchool.getText().toUpperCase());
    }//GEN-LAST:event_txtSchoolKeyReleased

    private void txtProgramKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtProgramKeyReleased
        txtProgram.setText(txtProgram.getText().toUpperCase());
    }//GEN-LAST:event_txtProgramKeyReleased

    private void txtIntakeCodeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIntakeCodeKeyReleased
        txtIntakeCode.setText(txtIntakeCode.getText().toUpperCase());
    }//GEN-LAST:event_txtIntakeCodeKeyReleased

    private void txtCourseKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCourseKeyReleased
        txtCourse.setText(txtCourse.getText().toUpperCase());
    }//GEN-LAST:event_txtCourseKeyReleased

    private void lblPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPrintMouseClicked
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("Course List");
        MessageFormat footer = new MessageFormat("AGHUB");
        
        try{
            jTable1.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }catch(PrinterException e){
            JOptionPane.showMessageDialog(null,"Cannot be print ! " +e.getMessage());
        }
        
    }//GEN-LAST:event_lblPrintMouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        StudentDashboardA studD = new StudentDashboardA();
        pnlMainCourse.add(studD);
        studD.setVisible(true);
        pnlCourse.setVisible(false);
    }//GEN-LAST:event_lblBackMouseClicked

    private void loadData() {
        
        File file = new File("course_list.txt");
        if (!file.exists()) {
            try {
                file.createNewFile(); // Create the file if it doesn't exist
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 6) {
                    int id = Integer.parseInt(parts[0]);
                    Course course = new Course(id, parts[1], parts[2], parts[3], parts[4], parts[5]);
                    courses.add(course);

                    // Update nextId if necessary
                    nextId = Math.max(nextId, id + 1);
                }
                
               
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void saveData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("course_list.txt"))) {
            for (Course course : courses) {
                writer.write(course.toCSVString());
                writer.newLine();
            }
          
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void populateTable() {
        model = (DefaultTableModel) jTable1.getModel();
        model.setColumnIdentifiers(new Object[]{"ID", "Study Level", "School", "Program", "Intake Code", "Course"});

        for (Course course : courses) {
            model.addRow(course.toObjectArray());
        }
    }

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBoxCourse;
    private javax.swing.JLabel lblCourse;
    private javax.swing.JLabel lblCourseInfo;
    private javax.swing.JLabel lblCourseTitle;
    private javax.swing.JLabel lblIntakeCode;
    private javax.swing.JLabel lblPrint;
    private javax.swing.JLabel lblProgram;
    private javax.swing.JLabel lblSchool;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblStudyLevel;
    private javax.swing.JPanel pnlCourse;
    private javax.swing.JLayeredPane pnlMainCourse;
    private javax.swing.JPanel pnlStudentKey;
    private javax.swing.JPanel pnlTableCourse;
    private javax.swing.JTextField txtCourse;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIntakeCode;
    private javax.swing.JTextField txtProgram;
    private javax.swing.JTextField txtSchool;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtStudyLevel;
    // End of variables declaration//GEN-END:variables
}
