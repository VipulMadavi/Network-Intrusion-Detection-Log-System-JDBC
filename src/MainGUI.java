import javax.swing.*;
import java.awt.event.*;

public class MainGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Network Security Log System");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton logButton = new JButton("Log Network Activity");
        JButton viewButton = new JButton("View Logs");

        logButton.setBounds(100, 80, 200, 40);
        viewButton.setBounds(100, 140, 200, 40);

        frame.setLayout(null);
        frame.add(logButton);
        frame.add(viewButton);

        logButton.addActionListener(e -> new LogActivityForm());
        viewButton.addActionListener(e -> new ViewLogsForm());

        frame.setVisible(true);
    }
}