package myPackages;

import java.sql.*;

public class conns {

    Connection c;
    Statement s;
    conns(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/universitymanagementsystem", "root", "Piyushbodhe@9022");
            s=c.createStatement();

            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
