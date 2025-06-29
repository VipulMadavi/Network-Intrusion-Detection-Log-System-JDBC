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

### 📚 Add JDBC Driver to Project

1. Go to **File > Project Structure > Modules > Dependencies** tab.
2. Click the ➕ **Add** button → Choose **JARs or directories**
3. Select the `.jar` file you downloaded earlier.
4. Make sure the scope is set to **Compile**.
5. Click **Apply** and **OK**.

---

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

### 🔐 Update Database Credentials in Code

In your `DatabaseUtil.java`, update:

```java
private static final String URL = "jdbc:mysql://localhost:3306/network_security";
private static final String USER = "root";           // your MySQL username
private static final String PASSWORD = "password";   // your MySQL password

## 🚀 How to Run
1. Open project in IDE (IntelliJ, NetBeans, Eclipse)
2. Add JDBC connector `.jar` to classpath
3. Update DB credentials in `DatabaseUtil.java`
4. Compile all files
5. Run `MainGUI.java`
```
