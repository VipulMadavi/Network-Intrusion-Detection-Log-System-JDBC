import java.sql.*;

public class DatabaseUtil {
    private static final String URL = "jdbc:mysql://localhost:3006/network_security";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

    public static void logActivity(String ip, int port, String action) {
        String sql = "INSERT INTO network_logs (ip_address, port, action) VALUES (?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, ip);
            stmt.setInt(2, port);
            stmt.setString(3, action);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}