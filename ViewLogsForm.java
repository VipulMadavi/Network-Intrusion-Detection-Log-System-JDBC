import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

public class ViewLogsForm extends JFrame {
    public ViewLogsForm() {
        setTitle("View Network Logs");
        setSize(500, 300);

        String[] columnNames = {"ID", "IP Address", "Port", "Action", "Time"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        JTable table = new JTable(model);

        try (Connection conn = DatabaseUtil.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("SELECT * FROM network_logs ORDER BY log_time DESC")) {

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("log_id"),
                    rs.getString("ip_address"),
                    rs.getInt("port"),
                    rs.getString("action"),
                    rs.getTimestamp("log_time")
                });
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane);
        setVisible(true);
    }
}