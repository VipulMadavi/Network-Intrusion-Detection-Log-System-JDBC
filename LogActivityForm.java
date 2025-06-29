import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class LogActivityForm extends JFrame {
    JTextField ipField, portField, actionField;

    public LogActivityForm() {
        setTitle("Log Network Activity");
        setSize(350, 250);
        setLayout(null);

        JLabel ipLabel = new JLabel("IP Address:");
        ipLabel.setBounds(30, 30, 100, 25);
        add(ipLabel);

        ipField = new JTextField();
        ipField.setBounds(130, 30, 150, 25);
        add(ipField);

        JLabel portLabel = new JLabel("Port:");
        portLabel.setBounds(30, 70, 100, 25);
        add(portLabel);

        portField = new JTextField();
        portField.setBounds(130, 70, 150, 25);
        add(portField);

        JLabel actionLabel = new JLabel("Action:");
        actionLabel.setBounds(30, 110, 100, 25);
        add(actionLabel);

        actionField = new JTextField();
        actionField.setBounds(130, 110, 150, 25);
        add(actionField);

        JButton logBtn = new JButton("Log");
        logBtn.setBounds(100, 160, 100, 30);
        add(logBtn);

        logBtn.addActionListener(e -> {
            String ip = ipField.getText();
            int port = Integer.parseInt(portField.getText());
            String action = actionField.getText();
            DatabaseUtil.logActivity(ip, port, action);
            JOptionPane.showMessageDialog(null, "Activity Logged!");
        });

        setVisible(true);
    }
}