/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Design;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author nisha
 */
public class StatusCellRenderer extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        String status1 = (String) table.getValueAt(row, 6);

        String status2 = (String) table.getValueAt(row, 9);

        if (status1.equals("Approve") && status2.equals("Approve")) {
            cell.setBackground(Color.GREEN);
        } else if (status1.equals("Reject") && status2.equals("Reject")) {
            cell.setBackground(Color.RED);
        } else if ((status1.equals("Approve") && status2.equals("Reject")) || (status1.equals("Reject") && status2.equals("Approve"))) {
            cell.setBackground(Color.YELLOW);
        } else {
            cell.setBackground(Color.WHITE);
        }

        return cell;
    }
}