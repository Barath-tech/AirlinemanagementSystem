package airlinemanagementsystem;

import java.sql.*;

public class ConnDB {
    
    Connection c;
    Statement s;
    
    public ConnDB() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql:///airlinemanagementsystem", "root", "root");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}