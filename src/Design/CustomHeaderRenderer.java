/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design;

import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author nisha
 */
// Custom table cell renderer for table header
public class CustomHeaderRenderer extends DefaultTableCellRenderer {

    public CustomHeaderRenderer() {
        setOpaque(true);
        setBackground(new Color(15, 30, 53));
        setBorder(BorderFactory.createMatteBorder(0, 0, 1, 1, Color.BLACK));
        setHorizontalAlignment(JLabel.LEFT); // Left-align header text
        //setBorder(BorderFactory.createMatteBorder(0, 0, 1, 1, Color.RED)); 

    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = (JLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        label.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 1, Color.WHITE)); // Add border
        return label;
    }
}
