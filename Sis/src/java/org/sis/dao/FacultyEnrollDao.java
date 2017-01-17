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
public class FacultyEnrollDao {

    public boolean verify(String t, String temail) {
        boolean b = false;
        String mail = null;
        int log = 0;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement("select temail,log from faculty where tid=? ");
            pstmt.setString(1, t);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                mail = rs.getString("temail").trim();
                log = rs.getInt("log");
            }
            if (temail == null || mail == null) {
                b = false;
            } else if (log == 0) {
                if (temail.equals(mail)) {
                    b = true;
                } else {
                    b = false;
                }
            } else {
                b = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentChangePassworddao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }

    public boolean forgot(String t, String temail) {
        boolean b = false;
        String mail = null;
        int log = 0;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement("select temail,log from faculty where tid=? ");
            pstmt.setString(1, t);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                mail = rs.getString("temail").trim();
                log = rs.getInt("log");
            }
            if (temail == null || mail == null) {
                b = false;
            } else if (log == 1) {
                if (temail.equals(mail)) {
                    b = true;
                } else {
                    b = false;
                }
            } else {
                b = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentChangePassworddao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }

    public boolean update(String t, String temail, String pswd) {
        boolean bb = false;
        int k = 0;
        boolean b = false;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement("update faculty set log=? where tid=?");
            pstmt.setInt(1, 1);
            pstmt.setInt(2, Integer.parseInt(t));
            k = pstmt.executeUpdate();
            if (k == 1) {
                bb = newlog(t, temail, pswd);
                if (bb) {
                    b = true;
                } else {
                    b = false;
                }
            } else {
                b = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentChangePassworddao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }

    private boolean newlog(String t, String temail, String pswd) {
        int k = 0;
        boolean b = false;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            String query = "insert into flogin values(?,?)";
            pstmt = cp.prepareStatement(query);
            pstmt.setString(1, temail);
            pstmt.setString(2, pswd);
            k = pstmt.executeUpdate();
            if (k == 1) {
                b = true;
            } else {
                b = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(FacultyEnrollDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }
      public boolean newlogp(String t, String temail, String pswd) {
        int k = 0;
        boolean b = false;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt,pstmt1;
        try {
            String query = "update flogin set pwd=? where uname=?";
            pstmt = cp.prepareStatement(query);
             pstmt.setString(1, pswd);
            pstmt.setString(2, temail);
            k = pstmt.executeUpdate();
            if (k == 1) {
                b = true;
            } else {
                b = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(FacultyEnrollDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }

}
