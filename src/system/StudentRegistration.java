/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package system;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author nisha
 */

class Student{
    private String KeyId;
    private String KeyPass;
    private String name;
    private String ic;
    private String dob;
    private String gender;
    private String number;
    private String email;
    private String StudyLevel;
    private String school;
    private String program;
    private String intakeCode;
    
    
    public Student(String KeyId, String KeyPass, String name, String ic, String dob, String gender, String email, String number, String StudyLevel,
            String school, String program, String intakeCode){
        
        this.KeyId = KeyId;
        this.KeyPass = KeyPass;
        this.name = name;
        this.ic = ic;
        this.number = number;
        this.dob = dob;
        this.gender = gender;
        this.email = email;
        this.StudyLevel = StudyLevel;
        this.school = school;
        this.program = program;
        this.intakeCode = intakeCode;
        
    }

    

    public String getKeyId() {
        return KeyId;
    }

    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    public String getKeyPass() {
        return KeyPass;
    }

    public void setKeyPass(String KeyPass) {
        this.KeyPass = KeyPass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getIc() {
        return ic;
    }

    public void setIc(String ic) {
        this.ic = ic;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStudyLevel() {
        return StudyLevel;
    }

    public void setStudyLevel(String StudyLevel) {
        this.StudyLevel = StudyLevel;
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
    
    public Object[] toObjectArray() {
    
        return new Object[]{KeyId, KeyPass, name, ic, dob, gender, email, number, StudyLevel, school, program, intakeCode};
    }

    public String toString() {
        return KeyId + "," + KeyPass+ "," + name + "," + ic + "," + dob + "," + gender + "," + email + "," + number + "," + StudyLevel + "," + school + "," + program + "," + intakeCode ;
    }
}
public class StudentRegistration extends javax.swing.JPanel {

    /**
     * Creates new form StudentRegistration
     */
    String KeyId;
    String KeyPass;
    String name;
    String ic;
    String dob;
    String gender;
    String number;
    String email;
    String Level;
    String school;
    String program;
    String intakeCode;
    private JComboBox<String> StudyLevel;
    private JComboBox<String> School;
    private JComboBox<String> Program;
    private JComboBox<String> IntakeCode;
    private Map<String, Set<String>> studyLevelToSchoolMap;
    private Map<String, Set<String>> schoolToProgramMap;
    private Map<String, Set<String>> programToIntakeCodeMap;
    private ArrayList<Student> students;
    
    
    
    public StudentRegistration() {
        initComponents();

        StudyLevel = new JComboBox<>();
        School = new JComboBox<>();
        Program = new JComboBox<>();
        IntakeCode = new JComboBox<>();
        studyLevelToSchoolMap = new HashMap<>();
        schoolToProgramMap = new HashMap<>();
        programToIntakeCodeMap = new HashMap<>();
        
        // Initialize student array
        students = new ArrayList<>();
        
        populateStudyLevelComboBox(StudyLevel);
        setupListeners();
        
        // Load existing data
        loadData();
        txtKeyId.setText(generateNextStudentID());
        
        
        
        //cboSchool.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup = new javax.swing.ButtonGroup();
        pnlMainSReg = new javax.swing.JLayeredPane();
        pnlSReg = new javax.swing.JPanel();
        lblStudentTitle = new javax.swing.JLabel();
        lblStudentKey = new javax.swing.JLabel();
        pnlStudentKey = new javax.swing.JPanel();
        lblKeyId = new javax.swing.JLabel();
        txtKeyId = new javax.swing.JTextField();
        lblKeyPass = new javax.swing.JLabel();
        txtKeyPass = new javax.swing.JTextField();
        lblStudentInfo = new javax.swing.JLabel();
        pnlStudentDetails = new javax.swing.JPanel();
        lblName = new javax.swing.JLabel();
        lblICNo = new javax.swing.JLabel();
        lblDOB = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblEmail = new javax.swing.JLabel();
        lblContactNo = new javax.swing.JLabel();
        txtIdNo = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        dataC = new com.toedter.calendar.JDateChooser();
        rdoMale = new javax.swing.JRadioButton();
        rdoFemale = new javax.swing.JRadioButton();
        txtEmail = new javax.swing.JTextField();
        txtContactNo = new javax.swing.JTextField();
        lblStudentCourse = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cboIntakeCode = new javax.swing.JComboBox<>();
        cboProgram = new javax.swing.JComboBox<>();
        cboSchool = new javax.swing.JComboBox<>();
        cboStudyLevel = new javax.swing.JComboBox<>();
        lblIntakeCode = new javax.swing.JLabel();
        lblProgram = new javax.swing.JLabel();
        lblSchool = new javax.swing.JLabel();
        lblStudyLevel = new javax.swing.JLabel();
        btnClearS = new javax.swing.JButton();
        btnRegisterS = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        lblBack = new javax.swing.JLabel();
        lblBox = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1075, 650));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMainSReg.setPreferredSize(new java.awt.Dimension(1075, 650));
        pnlMainSReg.setLayout(new java.awt.CardLayout());

        pnlSReg.setBackground(new java.awt.Color(255, 255, 255));
        pnlSReg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblStudentTitle.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        lblStudentTitle.setText("Student Registration");
        pnlSReg.add(lblStudentTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 35, -1, -1));

        lblStudentKey.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblStudentKey.setForeground(new java.awt.Color(29, 62, 105));
        lblStudentKey.setText("Student Key");
        pnlSReg.add(lblStudentKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        pnlStudentKey.setBackground(new java.awt.Color(244, 244, 244));
        pnlStudentKey.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(221, 218, 218), 1, true));
        pnlStudentKey.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblKeyId.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblKeyId.setText("Key ID : ");
        pnlStudentKey.add(lblKeyId, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 15, 52, -1));

        txtKeyId.setBackground(new java.awt.Color(221, 218, 218));
        txtKeyId.setEnabled(false);
        pnlStudentKey.add(txtKeyId, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 10, 237, -1));

        lblKeyPass.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblKeyPass.setText("Key Password : ");
        pnlStudentKey.add(lblKeyPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 15, -1, -1));

        txtKeyPass.setBackground(new java.awt.Color(221, 218, 218));
        txtKeyPass.setEnabled(false);
        pnlStudentKey.add(txtKeyPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 10, 237, -1));

        pnlSReg.add(pnlStudentKey, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 1035, 50));

        lblStudentInfo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblStudentInfo.setForeground(new java.awt.Color(29, 62, 105));
        lblStudentInfo.setText("Student Personal Information");
        pnlSReg.add(lblStudentInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        pnlStudentDetails.setBackground(new java.awt.Color(244, 244, 244));
        pnlStudentDetails.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(221, 218, 218), 1, true));
        pnlStudentDetails.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblName.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblName.setText("Name : ");
        pnlStudentDetails.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 15, 52, -1));

        lblICNo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblICNo.setText("IC No : ");
        pnlStudentDetails.add(lblICNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 50, 52, -1));

        lblDOB.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblDOB.setText("D.O.B : ");
        pnlStudentDetails.add(lblDOB, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 90, 52, -1));

        lblGender.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblGender.setText("Gender : ");
        pnlStudentDetails.add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 125, 52, -1));

        lblEmail.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblEmail.setText("Email : ");
        pnlStudentDetails.add(lblEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 50, 52, -1));

        lblContactNo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblContactNo.setText("Contact No : ");
        pnlStudentDetails.add(lblContactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 95, 80, -1));

        txtIdNo.setBackground(new java.awt.Color(221, 218, 218));
        pnlStudentDetails.add(txtIdNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 46, 237, -1));

        txtName.setBackground(new java.awt.Color(221, 218, 218));
        pnlStudentDetails.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 10, 237, -1));

        dataC.setBackground(new java.awt.Color(255, 255, 255));
        dataC.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                dataCPropertyChange(evt);
            }
        });
        pnlStudentDetails.add(dataC, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 80, 237, -1));

        btnGroup.add(rdoMale);
        rdoMale.setText("Male");
        pnlStudentDetails.add(rdoMale, new org.netbeans.lib.awtextra.AbsoluteConstraints(75, 125, -1, -1));

        btnGroup.add(rdoFemale);
        rdoFemale.setText("Female");
        pnlStudentDetails.add(rdoFemale, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 125, -1, -1));

        txtEmail.setBackground(new java.awt.Color(221, 218, 218));
        pnlStudentDetails.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 45, 237, -1));

        txtContactNo.setBackground(new java.awt.Color(221, 218, 218));
        txtContactNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContactNoActionPerformed(evt);
            }
        });
        pnlStudentDetails.add(txtContactNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 237, -1));

        pnlSReg.add(pnlStudentDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 1035, 160));

        lblStudentCourse.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblStudentCourse.setForeground(new java.awt.Color(29, 62, 105));
        lblStudentCourse.setText("Student Enroll");
        pnlSReg.add(lblStudentCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, -1));

        jPanel1.setBackground(new java.awt.Color(244, 244, 244));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(221, 218, 218)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboIntakeCode.setBackground(new java.awt.Color(204, 204, 204));
        cboIntakeCode.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        cboIntakeCode.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel1.add(cboIntakeCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, 210, -1));

        cboProgram.setBackground(new java.awt.Color(204, 204, 204));
        cboProgram.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        cboProgram.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel1.add(cboProgram, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 50, 210, -1));

        cboSchool.setBackground(new java.awt.Color(204, 204, 204));
        cboSchool.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        cboSchool.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        jPanel1.add(cboSchool, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 210, -1));

        cboStudyLevel.setBackground(new java.awt.Color(204, 204, 204));
        cboStudyLevel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select" }));
        cboStudyLevel.setSelectedIndex(-1);
        cboStudyLevel.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        cboStudyLevel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboStudyLevelActionPerformed(evt);
            }
        });
        jPanel1.add(cboStudyLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 180, -1));

        lblIntakeCode.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblIntakeCode.setText("Intake Code : ");
        jPanel1.add(lblIntakeCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 30, -1, -1));

        lblProgram.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblProgram.setText("Program : ");
        jPanel1.add(lblProgram, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 30, -1, -1));

        lblSchool.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblSchool.setText("School : ");
        jPanel1.add(lblSchool, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, -1, -1));

        lblStudyLevel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblStudyLevel.setText("Study Level : ");
        jPanel1.add(lblStudyLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        pnlSReg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 1035, 130));

        btnClearS.setBackground(new java.awt.Color(102, 102, 102));
        btnClearS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnClearS.setForeground(new java.awt.Color(255, 255, 255));
        btnClearS.setText("Clear");
        btnClearS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearSActionPerformed(evt);
            }
        });
        pnlSReg.add(btnClearS, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 570, -1, -1));

        btnRegisterS.setBackground(new java.awt.Color(51, 153, 255));
        btnRegisterS.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegisterS.setForeground(new java.awt.Color(255, 255, 255));
        btnRegisterS.setText("Register");
        btnRegisterS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterSActionPerformed(evt);
            }
        });
        pnlSReg.add(btnRegisterS, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 570, -1, -1));

        btnCancel.setBackground(new java.awt.Color(255, 0, 0));
        btnCancel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(255, 255, 255));
        btnCancel.setText("Cancel");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        pnlSReg.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 570, -1, -1));

        lblBack.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBack.setForeground(new java.awt.Color(51, 153, 255));
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/leftArrow.png"))); // NOI18N
        lblBack.setText("Student Dashboard");
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        pnlSReg.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, -1));

        lblBox.setIcon(new javax.swing.ImageIcon(getClass().getResource("/system/img_icon/TransparentBox2.png"))); // NOI18N
        pnlSReg.add(lblBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1075, 650));

        pnlMainSReg.add(pnlSReg, "card2");

        add(pnlMainSReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void populateStudyLevelComboBox(JComboBox<String> StudyLevel) {
        Set<String> studyLevels = new HashSet<>();
        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader("course_list.txt"));
            String line;
            // Skip the header line
            reader.readLine();
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 4) { // 
                    String studyLevel = parts[1].trim();
                    String school = parts[2].trim();
                    String program = parts[3].trim();
                    String intakeCode = parts[4].trim();
                    studyLevels.add(studyLevel);

                    // Populate the studyLevelToSchoolMap
                    studyLevelToSchoolMap
                        .computeIfAbsent(studyLevel, k -> new HashSet<>())
                        .add(school);

                    // Populate the schoolToProgramMap
                    schoolToProgramMap
                        .computeIfAbsent(school, k -> new HashSet<>())
                        .add(program);

                    // Populate the programToIntakeCodeMap
                    programToIntakeCodeMap
                        .computeIfAbsent(program, k -> new HashSet<>())
                        .add(intakeCode);
                }
            }
        } catch (IOException e) {
            e.printStackTrace(); // Handle file reading errors
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
      
        

        // Update the combo box with unique study levels
        cboStudyLevel.setModel(new DefaultComboBoxModel<>(studyLevels.toArray(new String[0])));
    }
    
    private void setupListeners() {
         cboStudyLevel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedStudyLevel = (String) cboStudyLevel.getSelectedItem();
                //cboSchool.setVisible(true);
                populateSchoolComboBox(selectedStudyLevel);
            }
        });

        cboSchool.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedSchool = (String) cboSchool.getSelectedItem();
                populateProgramComboBox(selectedSchool);
            }
        });

        cboProgram.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedProgram = (String) cboProgram.getSelectedItem();
                populateIntakeCodeComboBox(selectedProgram);
            }
        });
    }

    private void populateSchoolComboBox(String studyLevel) {
        Set<String> schools = studyLevelToSchoolMap.getOrDefault(studyLevel, Collections.emptySet());
        cboSchool.setModel(new DefaultComboBoxModel<>(schools.toArray(new String[0])));
        cboSchool.setSelectedIndex(-1); // Clear previous selection
        cboProgram.setModel(new DefaultComboBoxModel<>());
        cboIntakeCode.setModel(new DefaultComboBoxModel<>());
    }

    private void populateProgramComboBox(String school) {
        Set<String> programs = schoolToProgramMap.getOrDefault(school, Collections.emptySet());
        cboProgram.setModel(new DefaultComboBoxModel<>(programs.toArray(new String[0])));
        cboProgram.setSelectedIndex(-1); // Clear previous selection
        cboIntakeCode.setModel(new DefaultComboBoxModel<>());
    }

    private void populateIntakeCodeComboBox(String program) {
        Set<String> intakeCodes = programToIntakeCodeMap.getOrDefault(program, Collections.emptySet());
        cboIntakeCode.setModel(new DefaultComboBoxModel<>(intakeCodes.toArray(new String[0])));
        cboIntakeCode.setSelectedIndex(-1); // Clear previous selection
    }

    private void txtContactNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContactNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContactNoActionPerformed

    private void btnClearSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearSActionPerformed
        txtKeyId.setText(generateNextStudentID());
            txtKeyPass.setText("");
            txtName.setText("");
            txtIdNo.setText("");
            dataC.setDate(null);
            btnGroup.clearSelection();
            txtContactNo.setText("");
            txtEmail.setText("");
            cboStudyLevel.setSelectedIndex(-1);
    }//GEN-LAST:event_btnClearSActionPerformed

    private void dataCPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_dataCPropertyChange
         if ("date".equals(evt.getPropertyName())) {
                    Date selectedDate = (Date) evt.getNewValue();
                    if (selectedDate != null) {
                        //SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
                        SimpleDateFormat dateF = new SimpleDateFormat("ddMMYY");
                        String date = dateF.format(selectedDate);
                        
                        KeyPass = "ST@" + date;
                        
                        txtKeyPass.setText(KeyPass);
                        
                    }
                }
    }//GEN-LAST:event_dataCPropertyChange

    private void btnRegisterSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterSActionPerformed
        Date date = dataC.getDate();
        KeyId = txtKeyId.getText();
        KeyPass = txtKeyPass.getText();
        name = txtName.getText();
        ic = txtIdNo.getText();
       
        
        if(rdoMale.isSelected()){
            gender = "Male";
        }
        else if(rdoFemale.isSelected()){
            gender = "Female";
        }
        
        number = txtContactNo.getText();
        email = txtEmail.getText();
        Level = cboStudyLevel.getSelectedItem().toString();
        school = cboSchool.getSelectedItem().toString();
        program = cboProgram.getSelectedItem().toString();
        intakeCode = cboIntakeCode.getSelectedItem().toString();
        
         // Check if a course with the same intake code already exists
        //boolean duplicateFound = false;
        boolean notCompletedForm = false;

        if (KeyId.isEmpty() || KeyPass.isEmpty() || name.isEmpty() || ic.isEmpty() || date == null || gender.isEmpty() || email.isEmpty() || number.isEmpty() || Level.isEmpty() || school.equals("Select") || program.equals("Select") || intakeCode.equals("Select")) {
            notCompletedForm = true;
            JOptionPane.showMessageDialog(this, "Please complete the registration form");
        }

        dob = DateFormat.getDateInstance().format(date); // Convert to string

        //!duplicateFound && 
        if (!notCompletedForm) {
            Student student = new Student(KeyId, KeyPass, name, ic, dob, gender, email, number, Level, school, program, intakeCode);
            students.add(student);

            // Save data to file
            saveData();
            txtKeyId.setText(generateNextStudentID());
            txtKeyPass.setText("");
            txtName.setText("");
            txtIdNo.setText("");
            dataC.setDate(null);
            btnGroup.clearSelection();
            txtContactNo.setText("");
            txtEmail.setText("");
            cboStudyLevel.setSelectedIndex(-1);
            
            JOptionPane.showMessageDialog(this, "Successfully added student");
            
        } else {
            JOptionPane.showMessageDialog(this, "Duplicate intake code found. Please enter a unique intake code.");
        }
        
    }//GEN-LAST:event_btnRegisterSActionPerformed

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        StudentDashboardA studD = new StudentDashboardA();
        pnlMainSReg.add(studD);
        studD.setVisible(true);
        pnlSReg.setVisible(false);
    }//GEN-LAST:event_lblBackMouseClicked

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        StudentDashboardA studD = new StudentDashboardA();
        pnlMainSReg.add(studD);
        studD.setVisible(true);
        pnlSReg.setVisible(false);
    }//GEN-LAST:event_btnCancelActionPerformed

    private void cboStudyLevelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboStudyLevelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboStudyLevelActionPerformed


      private String generateNextStudentID() {
        try {
            
            Scanner scanner = new Scanner(new File("student_list.txt"));
            
            Set<String> existingIDs = new HashSet<>();
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                
                String[] parts = line.split(",");
                String studentID = parts[0].trim();
                existingIDs.add(studentID);
            }
            scanner.close();

            
            int number = 1;
            while (existingIDs.contains("ST" + String.format("%03d", number))) {
                number++;
            }
            String nextStudentID = "ST" + String.format("%03d", number);
            return nextStudentID;
        } catch (FileNotFoundException e) {
            
            System.out.println("File not found: student.txt");
            e.printStackTrace();
        }
        return "S002"; 
    }
    private void loadData() {
        
        File file = new File("student_list.txt");
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
                if (parts.length == 12) {
                    
                    Student student = new Student(parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], parts[6], parts[7], parts[8], parts[9], parts[10], parts[11]);
                }
                
               
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    } 

    private void saveData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("student_list.txt", true))) {
            for (Student student : students) {
                boolean duplicate = false;
                try (BufferedReader reader = new BufferedReader(new FileReader("student_list.txt"))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        if (line.equals(student.toString())) {
                            duplicate = true;
                            break;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (!duplicate) {
                    writer.write(student.toString());
                    writer.newLine();
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnClearS;
    private javax.swing.ButtonGroup btnGroup;
    private javax.swing.JButton btnRegisterS;
    private javax.swing.JComboBox<String> cboIntakeCode;
    private javax.swing.JComboBox<String> cboProgram;
    private javax.swing.JComboBox<String> cboSchool;
    private javax.swing.JComboBox<String> cboStudyLevel;
    private com.toedter.calendar.JDateChooser dataC;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblBox;
    private javax.swing.JLabel lblContactNo;
    private javax.swing.JLabel lblDOB;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblICNo;
    private javax.swing.JLabel lblIntakeCode;
    private javax.swing.JLabel lblKeyId;
    private javax.swing.JLabel lblKeyPass;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblProgram;
    private javax.swing.JLabel lblSchool;
    private javax.swing.JLabel lblStudentCourse;
    private javax.swing.JLabel lblStudentInfo;
    private javax.swing.JLabel lblStudentKey;
    private javax.swing.JLabel lblStudentTitle;
    private javax.swing.JLabel lblStudyLevel;
    private javax.swing.JLayeredPane pnlMainSReg;
    private javax.swing.JPanel pnlSReg;
    private javax.swing.JPanel pnlStudentDetails;
    private javax.swing.JPanel pnlStudentKey;
    private javax.swing.JRadioButton rdoFemale;
    private javax.swing.JRadioButton rdoMale;
    private javax.swing.JTextField txtContactNo;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIdNo;
    private javax.swing.JTextField txtKeyId;
    private javax.swing.JTextField txtKeyPass;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
