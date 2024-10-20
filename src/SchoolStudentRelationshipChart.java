/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nisha
 */
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

public class SchoolStudentRelationshipChart {

    public static void main(String[] args) {
        // Read data from the text file and count students per school
        Map<String, Integer> schoolStudentCount = readDataFromFile("student_list.txt");

        // Create the bar chart dataset
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        for (String school : schoolStudentCount.keySet()) {
            dataset.addValue(schoolStudentCount.get(school), "Students", school);
        }

        // Create the bar chart
        JFreeChart chart = ChartFactory.createBarChart(
                "Student Distribution by School", // Chart title
                "School", // X-axis label
                "Number of Students", // Y-axis label
                dataset);

        // Display the chart in a JFrame
        JFrame frame = new JFrame("School Student Relationship Chart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new Dimension(800, 600));
        frame.setContentPane(chartPanel);
        frame.pack();
        frame.setVisible(true);
    }

    private static Map<String, Integer> readDataFromFile(String filename) {
        Map<String, Integer> schoolStudentCount = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length >= 9) { // Assuming school is at index 8
                    String school = parts[8];
                    schoolStudentCount.put(school, schoolStudentCount.getOrDefault(school, 0) + 1);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return schoolStudentCount;
    }
}

