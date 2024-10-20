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
public class StatusCellRenderer2 extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, 
            boolean hasFocus, int row, int column) {
        Component cell = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        String status1 = (String) table.getValueAt(row, 4);
        String status2 = (String) table.getValueAt(row, 6);
        String status3 = (String) table.getValueAt(row, 8);
        if (status1.equals("Submitted") && status2.equals("Marked") && status3.equals("Marked")) {
            cell.setBackground(Color.GREEN);
            cell.setForeground(Color.BLACK);
        } else if ((status1.equals("Submitted") && status2.equals("Marked") && status3.equals("Pending")) 
                || (status1.equals("Submitted") && status2.equals("Pending") && status3.equals("Marked"))
                || (status1.equals("Submitted") && status2.equals("Pending") && status3.equals("Pending"))) {
            cell.setBackground(Color.YELLOW);
            cell.setForeground(Color.BLACK);
        } else if ((status1.equals("Pending") && status2.equals("Marked") && status3.equals("Pending")) 
                || (status1.equals("Pending") && status2.equals("Pending") && status3.equals("Marked")) 
                || (status1.equals("Pending") && status2.equals("Marked") && status3.equals("Marked"))) {
            cell.setBackground(Color.DARK_GRAY);
            cell.setForeground(Color.WHITE);
        } else {
            cell.setBackground(Color.WHITE);
            cell.setForeground(Color.BLACK);
        }
        return cell;
    }
}