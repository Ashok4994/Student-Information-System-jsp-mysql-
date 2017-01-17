/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sis.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.database.Databaseconn;

/**
 *
 * @author PEDDI'S
 */
public class StudentLogin {

    String u = "";
    String p = "";

    public boolean verify(String usern, String psswd) {
        boolean b = false;
        String us = usern;
        String ps = psswd;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        try {
            String query = "select * from stdlogin";
            if (us.equals("") || us.equals(null) || ps.equals("") || ps.equals(null)) {
                b = false;
            } else {
                query = query + " where sid=? and pswd=? ";
            }
            PreparedStatement pstmt = cp.prepareStatement(query);
            pstmt.setString(1, usern);
            pstmt.setString(2, psswd);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                u = rs.getString("sid");
                p = rs.getString("pswd");
            }
            if (u.equals("") || u.equals(null) || p.equals("") || p.equals(null)) {
                b = false;
            } else if (u.equalsIgnoreCase(us) && p.equals(ps)) {
                b = true;

            } else {
                b = false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(StudentLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return b;
    }

    public Boolean verifyregistar(String usern, String psswd) {
         boolean b = false;
        String us = usern;
        String ps = psswd;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        try {
            String query = "select * from rlogin";
            if (us.equals("") || us.equals(null) || ps.equals("") || ps.equals(null)) {
                b = false;
            } else {
                query = query + " where uname=? and pwd=? ";
            }
            PreparedStatement pstmt = cp.prepareStatement(query);
            pstmt.setString(1, usern);
            pstmt.setString(2, psswd);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                u = rs.getString("uname");
                p = rs.getString("pwd");
            }
            if (u.equals("") || u.equals(null) || p.equals("") || p.equals(null)) {
                b = false;
            } else if (u.equals(us) && p.equals(ps)) {
                b = true;

            } else {
                b = false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(StudentLogin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return b;
    }
}
