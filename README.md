# Network Intrusion Detection Log System (Java GUI)

## 🧠 Overview
A simple GUI-based system to log, view, and monitor network activities using Java Swing and MySQL.

## ✅ Features
- Log network activity (IP, port, action)
- View logs in a table with timestamps
- Modular Java code with JDBC backend

## 📦 Prerequisites
- Java JDK (8 or higher)
- MySQL Server
- MySQL JDBC driver (Connector/J)

## ⚙️ MySQL Setup
```sql
CREATE DATABASE network_security;

USE network_security;

CREATE TABLE network_logs (
    log_id INT AUTO_INCREMENT PRIMARY KEY,
    ip_address VARCHAR(50),
    port INT,
    action VARCHAR(50),
    log_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```

## 🧪 Sample Test Data
```sql
INSERT INTO network_logs (ip_address, port, action) VALUES
('192.168.1.10', 22, 'login_attempt'),
('203.0.113.55', 443, 'login_failed'),
('203.0.113.55', 443, 'login_failed'),
('203.0.113.55', 443, 'login_failed'),
('10.0.0.5', 80, 'access_granted'),
('192.0.2.99', 21, 'ftp_access'),
('198.51.100.77', 3389, 'remote_login');
```

## 🚀 How to Run
1. Open project in IDE (IntelliJ, NetBeans, Eclipse)
2. Add JDBC connector `.jar` to classpath
3. Update DB credentials in `DatabaseUtil.java`
4. Compile all files
5. Run `MainGUI.java`
