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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.database.Databaseconn;

/**
 *
 * @author PEDDI'S
 */
public class AdminhomeFacultyDao {

    public ArrayList Faculty() {
        ArrayList list = new ArrayList();
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement("select * from faculty");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                HashMap mp = new HashMap();
                mp.put("did", rs.getString("id"));
                mp.put("dname", rs.getString("dname"));
                mp.put("tid", rs.getString("tid"));
                mp.put("tname", rs.getString("tname"));
                mp.put("temail", rs.getString("temail"));
                mp.put("log", rs.getString("log"));
                list.add(mp);
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (rs != null) {
                rs.close();
            }
            if (cp != null) {
                cp.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminhomeFacultyDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public int updateFaculty(String did, String tid, String dname, String tname, String temail,String log) {
        int k = 0;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement(" update faculty set id=?,dname=?,tname=?,temail=?,log=? where tid=? ");
            pstmt.setString(1, did);
            pstmt.setString(2, dname);
            pstmt.setString(3, tname);
            pstmt.setString(4, temail);
            pstmt.setString(5, log);
            pstmt.setString(6, tid);
            k = pstmt.executeUpdate();
            if (pstmt != null) {
                pstmt.close();
            }
            if (cp != null) {
                cp.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminhomeFacultyDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return k;
    }
    public ArrayList Student() {
        ArrayList list = new ArrayList();
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement("select * from stdlogin");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                HashMap mp = new HashMap();
                mp.put("sid", rs.getString("sid"));
                mp.put("log", rs.getString("log"));
                list.add(mp);
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (rs != null) {
                rs.close();
            }
            if (cp != null) {
                cp.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminhomeFacultyDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public int updateStudent(String sid) {
        int k = 0;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement(" update stdlogin set log=? where sid=? ");
            pstmt.setString(1, "0");
            pstmt.setString(2, sid);
            k = pstmt.executeUpdate();
            if (pstmt != null) {
                pstmt.close();
            }
            if (cp != null) {
                cp.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(AdminhomeFacultyDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return k;
    }
}
