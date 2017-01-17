/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sis.dao.admindao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.database.Databaseconn;
import org.sis.dao.StudentLogin;

/**
 *
 * @author PEDDI'S
 */
public class AdminloginDao {

    public Boolean verifyadmin(String usern, String psswd) {
        boolean b = false;
        String u = null;
        String p = null;
        String us = usern;
        String ps = psswd;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        try {
            String query = "select * from rlogin";
            if (us.equals("") || us.equals(null) || ps.equals("") || ps.equals(null)) {
                b = false;
            } else {
                query = query + " where uname=?";
            }
            PreparedStatement pstmt = cp.prepareStatement(query);
            pstmt.setString(1, usern);
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

    public int insertFaculty(String did, String dname, String tid, String tname, String temail) {
        int k = 0;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        try {
            String query = "insert into faculty values(?,?,?,?,?,?)";
            PreparedStatement pstmt = cp.prepareStatement(query);
            pstmt.setString(1, did);
            pstmt.setString(2, dname);
            pstmt.setString(3, tid);
            pstmt.setString(4, tname);
            pstmt.setString(5, temail);
            pstmt.setString(6, "0");
            k = pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AdminloginDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return k;
    }

    public int deleteFaculty(String tid) {
        int k = 0, f = 0;
        String m = null;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        PreparedStatement pstmt, pstmt1, pstmt2;
        try {
            String query = "select * from faculty where tid=?";
            pstmt = cp.prepareStatement(query);
            pstmt.setString(1, tid);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                m = rs.getString("temail");
            }
            String query1 = "delete flogin where uname=?";
            pstmt1 = cp.prepareStatement(query1);
            pstmt1.setString(1, m);
            f = pstmt1.executeUpdate();
            if (f == 1) {
                String query2 = "delete faculty where tid=?";
                pstmt2 = cp.prepareStatement(query2);
                pstmt2.setString(1, tid);
                k = pstmt2.executeUpdate();
            }
            else
            {
                k=0;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminloginDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return k;
    }
}
