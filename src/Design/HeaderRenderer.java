/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author nisha
 */
    
     // Custom renderer for table header to set height
public class HeaderRenderer implements TableCellRenderer {

    private int height;

    public HeaderRenderer(int height) {
        this.height = height;
    }

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel label = new JLabel(value.toString());
        label.setOpaque(true);
        label.setBackground(new Color(15, 30, 53));
        label.setForeground(Color.WHITE);
        label.setHorizontalAlignment(JLabel.LEFT);
        label.setFont(new Font("Arial",Font.BOLD,13));
        label.setPreferredSize(new Dimension(label.getWidth(), height));
        return label;
    }
}
