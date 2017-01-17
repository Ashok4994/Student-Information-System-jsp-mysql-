/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PEDDI'S
 */
public class Databaseconn {

    Connection con;

    public Connection getConnection() {
        try {
//            DriverManager.registerDriver(new com.microsoft.sqlserver.jdbc.SQLServerDriver());
//             con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Users", "sa", "adminpeddi"); 
             Class.forName("com.mysql.jdbc.Driver");
            con = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "root");
           // Class.forName("com.mysql.jdbc.Driver");
            //con = java.sql.DriverManager.getConnection("jdbc:mysql://127.7.236.2:3306/lbcesis", "adminRpgys8w", "NtM_xhHQ8pgs");
        } catch (SQLException e) {

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Databaseconn.class.getName()).log(Level.SEVERE, null, ex);
        }

        return con;

    }

}
