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
public class StudentChangePassworddao {

    String u = "";
    String p = "";

    public boolean verifyop(String usern, String psswd) {
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

    public int update(String idp, String np, String rnp) {
        int k = 0;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement(" update stdlogin set pswd=? where sid=? ");
            pstmt.setString(1, rnp);
            pstmt.setString(2, idp);
            k = pstmt.executeUpdate();
            if (pstmt != null) {
                pstmt.close();
            }
            if (cp != null) {
                cp.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(StdmarksEntryAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return k;
    }

    public int updatem(String idp, String np, String rnp) {
        int k = 0;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement(" update stdlogin set email=? where sid=? ");
            pstmt.setString(1, rnp);
            pstmt.setString(2, idp);
            k = pstmt.executeUpdate();
            if (pstmt != null) {
                pstmt.close();
            }
            if (cp != null) {
                cp.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(StdmarksEntryAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return k;
    }

    public String getmail(String sid) {
        String mail = "INVALID REGDNO";
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement("select email from stdlogin where sid=? ");
            pstmt.setString(1, sid);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                mail = rs.getString("email");
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentChangePassworddao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mail;
    }

    public int updatep(String sid, String pswd) {
        int k = 0;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement(" update stdlogin set pswd=? where sid=? ");
            pstmt.setString(1, pswd);
            pstmt.setString(2, sid);
            k = pstmt.executeUpdate();
            if (pstmt != null) {
                pstmt.close();
            }
            if (cp != null) {
                cp.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(StdmarksEntryAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return k;
    }
}
