
import com.google.gson.Gson;
import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableRowSorter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author nisha
 */
public class CourseList extends javax.swing.JFrame {

    /**
     * Creates new form CourseList
     */
    String studyLevel;
    String school;
    String program;
    String intakeCode;
    int row;
    
    
    public CourseList() {
        initComponents();
        //addCustomButtonToTable();
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
        pnlInfo = new javax.swing.JPanel();
        txtStudyLevel = new javax.swing.JTextField();
        txtListSchool = new javax.swing.JTextField();
        txtCourse = new javax.swing.JTextField();
        txtIntakeCode = new javax.swing.JTextField();
        txtSearch = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBg.setBackground(new java.awt.Color(255, 255, 255));
        pnlBg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlInfo.setBackground(new java.awt.Color(255, 255, 255));
        pnlInfo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        pnlInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtStudyLevel.setForeground(new java.awt.Color(0, 0, 0));
        txtStudyLevel.setText("level");
        pnlInfo.add(txtStudyLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 17, 244, -1));

        txtListSchool.setForeground(new java.awt.Color(0, 0, 0));
        txtListSchool.setText("School");
        pnlInfo.add(txtListSchool, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 240, -1));

        txtCourse.setForeground(new java.awt.Color(0, 0, 0));
        txtCourse.setText("course");
        pnlInfo.add(txtCourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 260, -1));

        txtIntakeCode.setForeground(new java.awt.Color(0, 0, 0));
        txtIntakeCode.setText("intake code");
        pnlInfo.add(txtIntakeCode, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 260, -1));

        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtSearchKeyReleased(evt);
            }
        });
        pnlInfo.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 30, 230, -1));

        pnlBg.add(pnlInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 1060, 120));

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        pnlBg.add(btnAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 520, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Study Level", "School", "Program", "Intake Code"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setRowHeight(50);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        pnlBg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 1030, 350));

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        pnlBg.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 530, -1, -1));

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        pnlBg.add(btnDelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 530, -1, -1));

        getContentPane().add(pnlBg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1080, 650));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        //Person person = new Person(name, age);
        // You can add more attributes and handle more complex logic here
        
        studyLevel = txtStudyLevel.getText();
        school = txtListSchool.getText();
        program = txtCourse.getText();
        intakeCode = txtIntakeCode.getText();
        
         // Check if the data already exists in the file
        boolean dataExists = doesDataExist("course1.txt", studyLevel, school, program, intakeCode);
        System.out.println("hfbgh" + dataExists);
        
        if (!dataExists) {
        // If data does not exist, add it to the file
        Course c = new Course(studyLevel, school, program, intakeCode);
        
        Gson gson = new Gson();
        String json = gson.toJson(c);
        
        try (FileWriter writer = new FileWriter("course1.txt", true)) {
            File file = new File("course1.txt");
            if (file.exists() && file.length() > 0) {
                writer.write(",");
            }
            writer.write(json);
            JOptionPane.showMessageDialog(null, "Data added successfully4.");
            } catch (IOException e) {
                e.printStackTrace();
            }
            } else {
                JOptionPane.showMessageDialog(null, "Data already exists in the file.");
            }
        //Course(String studyLevel,String school,String program,String intakeCode){
        /*Course c = new Course(studyLevel,school, program, intakeCode);
        
        Gson gson = new Gson();
        String json = gson.toJson(c);
        
        try (FileWriter writer = new FileWriter("course1.txt",true)) {
             File file = new File("course1.txt");
             if (file.exists() && file.length() > 0) {
                writer.write(",");
            }
            writer.write(json);
            JOptionPane.showMessageDialog(null, "Done add");
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        
        // JSON data
        // JSON data
           /* String jsonData = "{\"studyLevel\":\"pre-uni\",\"school\":\"School of sc\",\"program\":\"cs\",\"intakeCode\":\"123\"}," +
        "{\"studyLevel\":\"pre-uni\",\"school\":\"School of sc\",\"program\":\"cs\",\"intakeCode\":\"12334\"}";

        
        // Parse JSON data
        JSONArray jsonArray = new JSONArray("[" + jsonData + "]");
        
        // Populate table
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject obj = jsonArray.getJSONObject(i);
            String studyLevel = obj.getString("studyLevel");
            String school = obj.getString("school");
            String program = obj.getString("program");
            String intakeCode = obj.getString("intakeCode");
            model.addRow(new Object[]{studyLevel, school, program, intakeCode});
        }*/
           
           // Read JSON data from file
        /*StringBuilder jsonDataBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("course1.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                jsonDataBuilder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Parse JSON data
        JSONArray jsonArray = new JSONArray("[" + jsonDataBuilder.toString() + "]");
        
        // Populate table
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject obj = jsonArray.getJSONObject(i);
            String studyLevel = obj.getString("studyLevel");
            String school = obj.getString("school");
            String program = obj.getString("program");
            String intakeCode = obj.getString("intakeCode");
            model.addRow(new Object[]{studyLevel, school, program, intakeCode});
        }*/
        
        // Read JSON data from file
        /*StringBuilder jsonDataBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("course1.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                jsonDataBuilder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Parse JSON data
        JSONArray jsonArray = new JSONArray("[" + jsonDataBuilder.toString() + "]");
        
        // Populate table
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
      
        model.setRowCount(0); // Set row count to 0 to clear all rows
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject obj = jsonArray.getJSONObject(i);
            String studyLevel = obj.getString("studyLevel");
            String school = obj.getString("school");
            String program = obj.getString("program");
            String intakeCode = obj.getString("intakeCode");
            model.addRow(new Object[]{studyLevel, school, program, intakeCode});
            
       
        }*/
        
        addTable();
        
        
        
        
        
    }//GEN-LAST:event_btnAddActionPerformed

    private boolean doesDataExist(String fileName, String studyLevel, String school, String program, String intakeCode) {
     boolean dataExists = false;
   try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
    StringBuilder data = new StringBuilder(); // StringBuilder to store the entire file content
    String line;
    while ((line = reader.readLine()) != null) {
        data.append(line); // Append each line of the file to the StringBuilder
    }

    String regex = "\\{[^\\{\\}]*\\}"; // Regular expression to match JSON objects
    Pattern pattern = Pattern.compile(regex); // Compile the regular expression pattern
    Matcher matcher = pattern.matcher(data.toString()); // Create a matcher for the data
    
    // Print out the matcher for debugging purposes
    System.out.println(matcher);

    // Loop through each match found by the matcher
    while (matcher.find()) {
        String json = matcher.group(); // Extract the JSON object string from the match
        JSONObject jsonObject = new JSONObject(json); // Create a JSONObject from the JSON string
        
        // Extract studyLevel, school, program, and intakeCode from the JSON object
        String existingStudyLevel = jsonObject.getString("studyLevel");
        String existingSchool = jsonObject.getString("school");
        String existingProgram = jsonObject.getString("program");
        String existingIntakeCode = jsonObject.getString("intakeCode");

        // Check if the extracted data matches the new data
        if (studyLevel.equals(existingStudyLevel) && school.equals(existingSchool) &&
            program.equals(existingProgram) && intakeCode.equals(existingIntakeCode)) {
            dataExists = true;
            break; // No need to continue checking if data is found
        }
    }
} catch (IOException e) {
    e.printStackTrace(); // Print the stack trace if an IO exception occurs
}

     
    /*StringBuilder jsonDataBuilder = new StringBuilder(); // Declaration moved outside the loop
    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
        String line;
        while ((line = br.readLine()) != null) {
            // Trim leading and trailing whitespace from the line
            line = line.trim();
            
            // Skip empty lines
            if (line.isEmpty()) {
                continue;
            }
            
            // Append the line to the StringBuilder
            jsonDataBuilder.append(line).append("\n"); // Appends the line and a newline character
            
            // Parse each line as a JSON object
            JSONObject jsonObject = new JSONObject(line);

            // Extract studyLevel, school, program, and intakeCode from the JSON object
            String existingStudyLevel = jsonObject.getString("studyLevel");
            String existingSchool = jsonObject.getString("school");
            String existingProgram = jsonObject.getString("program");
            String existingIntakeCode = jsonObject.getString("intakeCode");

            // Check if the extracted data matches the new data
            if (studyLevel.equals(existingStudyLevel) && school.equals(existingSchool) &&
                program.equals(existingProgram) && intakeCode.equals(existingIntakeCode)) {
                dataExists = true;
                break; // No need to continue checking if data is found
            }
        }
    } catch (IOException | JSONException e) {
        e.printStackTrace();
    }*/
    return dataExists;
    }
    
    public void addTable(){
        
        // Read JSON data from file
        StringBuilder jsonDataBuilder = new StringBuilder();
         System.out.println("hdvgvggc3");
        try (BufferedReader br = new BufferedReader(new FileReader("course1.txt"))) {
            String line;
             System.out.println("hdvgvggc1");
            while ((line = br.readLine()) != null) {
                jsonDataBuilder.append(line);
                 System.out.println("hdvgvggc2");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        // Parse JSON data
        JSONArray jsonArray = new JSONArray("[" + jsonDataBuilder.toString() + "]");
        System.out.println("hdvgvggc");
 

               
        
        // Populate table
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
      
        model.setRowCount(0); // Set row count to 0 to clear all rows
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject obj = jsonArray.getJSONObject(i);
            String studyLevel = obj.getString("studyLevel");
            String school = obj.getString("school");
            String program = obj.getString("program");
            String intakeCode = obj.getString("intakeCode");
            model.addRow(new Object[]{studyLevel, school, program, intakeCode});
            
       
        }
        
    }
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        row = jTable1.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        txtStudyLevel.setText(model.getValueAt(row, 0).toString());
        txtListSchool.setText(model.getValueAt(row, 1).toString());
        txtCourse.setText(model.getValueAt(row, 2).toString());
        txtIntakeCode.setText(model.getValueAt(row, 3).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try (BufferedReader reader3 = new BufferedReader(new FileReader("course1.txt"))) {
            StringBuilder data3 = new StringBuilder();
            String line;
            while ((line = reader3.readLine()) != null) {
               
                data3.append(line);
                
            }

            String regex3 = "\\{[^\\{\\}]*\\}";
            Pattern pattern3 = Pattern.compile(regex3);
            Matcher matcher3 = pattern3.matcher(data3.toString());
            
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            
            boolean nameModified = false;

            while (matcher3.find()) {
                String json3 = matcher3.group();
                JSONObject jsonObject3 = new JSONObject(json3);
                //System.out.println(model.getValueAt(row, 3).toString());
                String code= jsonObject3.getString("intakeCode");
                if (code.equals(model.getValueAt(row, 3).toString())) {
                    String code2 = jsonObject3.getString("intakeCode");
                    //System.out.println("KeyId: " + code2);
                    
             
                    // Update the name if KeyId matches
                    if (code2.equals(model.getValueAt(row, 3).toString())) {
                        System.out.println(row);
                        jsonObject3.put("studyLevel", txtStudyLevel.getText());
                        jsonObject3.put("school", txtListSchool.getText());
                        jsonObject3.put("program", txtCourse.getText());
                        jsonObject3.put("intakeCode", txtIntakeCode.getText());
                        
                        nameModified = true;
                    }

                    // Replace the original JSON object with the modified one
                    data3.replace(matcher3.start(), matcher3.end(), jsonObject3.toString());
                    
                    break;
                }
            }
            
             // If name was modified, write the updated JSON objects back to the file
            if (nameModified) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("course1.txt"))) {
                    writer.write(data3.toString());
                    System.out.println("Name modified and file updated successfully.");
                }
            } else {
                System.out.println("No matching KeyId found.");
            }
            
            addTable();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String fileName2 = "course1.txt";
        String studyLevelToDelete = txtIntakeCode.getText(); // Example data to delete

        try (BufferedReader reader2 = new BufferedReader(new FileReader(fileName2))) {
            StringBuilder data2 = new StringBuilder();
            String line2;
            while ((line2 = reader2.readLine()) != null) {
                data2.append(line2).append("\n"); // Append each line to the StringBuilder
            }

            // Define a regular expression to match JSON objects containing the studyLevelToDelete
            System.out.println(studyLevelToDelete);
            String regex2 = "\\{[^\\{\\}]*\"intakeCode\":\"" + studyLevelToDelete + "\"[^\\{\\}]*\\},";
            System.out.println(regex2);
            Pattern pattern2 = Pattern.compile(regex2);
            Matcher matcher2 = pattern2.matcher(data2);
            System.out.println(matcher2);
            System.out.println("lulu"+matcher2.getClass());
            
            while (matcher2.find()) {
            System.out.println("Matched string: " + matcher2.group());
        }

            // Remove matching JSON objects from the content
            data2 = new StringBuilder(matcher2.replaceAll(""));
            System.out.println(data2);

            // Write the modified content back to the file
            try (BufferedWriter writer2 = new BufferedWriter(new FileWriter(fileName2))) {
                writer2.write(data2.toString());
                System.out.println(data2.toString());
                System.out.println("Data deleted successfully.");
                
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        addTable();
        
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void txtSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyReleased
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        TableRowSorter<DefaultTableModel> obj = new TableRowSorter<>(model);
        jTable1.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(txtSearch.getText()));
        
//         row = jTable1.getSelectedRow();
//        //DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        txtStudyLevel.setText(model.getValueAt(row, 0).toString());
//        txtListSchool.setText(model.getValueAt(row, 1).toString());
//        txtCourse.setText(model.getValueAt(row, 2).toString());
//        txtIntakeCode.setText(model.getValueAt(row, 3).toString());
        
        
    }//GEN-LAST:event_txtSearchKeyReleased

     private void addCustomButtonToTable() {
        // Create a custom renderer and editor for the button
        TableColumn column = jTable1.getColumnModel().getColumn(3); // Replace 3 with the index of the column where you want to add the button
        
        // Set the renderer
        column.setCellRenderer(new ButtonRenderer());
        
        // Set the editor
        column.setCellEditor(new ButtonEditor(new JTextField()));
    }
     
     // Custom button renderer
    class ButtonRenderer extends JButton implements TableCellRenderer {

        public ButtonRenderer() {
            setOpaque(true);
        }

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value,
                                                       boolean isSelected, boolean hasFocus,
                                                       int row, int column) {
            setText((value == null) ? "" : value.toString());
            return this;
        }
    }

    // Custom button editor
    class ButtonEditor extends DefaultCellEditor {
        protected JButton button;

        public ButtonEditor(JTextField textField) {
            super(textField);
            button = new JButton();
            button.setOpaque(true);
            button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "Button clicked!");
                // You can access the row and column of the clicked button using table.getSelectedRow() and table.getSelectedColumn()
                // For example:
                int row = jTable1.getSelectedRow();
                int column = jTable1.getSelectedColumn();
                System.out.println("Button clicked at row: " + row + ", column: " + column);
                button.setText("Active");
                button.setBackground(Color.green);
                fireEditingStopped();
                    
                    
                    
                    // Handle button click action here
                    // For example, you can get the row and column of the clicked button using table.getSelectedRow() and table.getSelectedColumn()
                }
            });
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value,
                                                     boolean isSelected, int row, int column) {
            button.setText((value == null) ? "" : value.toString());
            return button;
        }
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
            java.util.logging.Logger.getLogger(CourseList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel pnlBg;
    private javax.swing.JPanel pnlInfo;
    private javax.swing.JTextField txtCourse;
    private javax.swing.JTextField txtIntakeCode;
    private javax.swing.JTextField txtListSchool;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtStudyLevel;
    // End of variables declaration//GEN-END:variables
}
