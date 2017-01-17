/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sis.dao.feedback;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.database.Databaseconn;
import org.sis.dao.StudentLogin;

/**
 *
 * @author PEDDI'S
 */
public class Feedbacklogin {

    String u = "";
    String p = "";

    public boolean verify(String usern, String psswd) {
        boolean b = false;
        String us = usern;
        String ps = psswd;
        int l = 0;
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
                l = rs.getInt("log");
            }
            if (u.equals("") || u.equals(null) || p.equals("") || p.equals(null) || l == 1) {
                b = false;
            } else if (u.equalsIgnoreCase(us) && p.equals(ps)) {
                b = true;

            } else {
                b = false;
            }

        } catch (SQLException ex) {
            Logger.getLogger(Feedbacklogin.class.getName()).log(Level.SEVERE, null, ex);
        }

        return b;
    }

    public ArrayList sem1() {
        ArrayList list = new ArrayList();
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        try {
            String query = "select * from feedsem1";
            PreparedStatement pstmt = cp.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                HashMap mp = new HashMap();
                mp.put("subid", rs.getInt("subid"));
                mp.put("subname", rs.getString("subname"));
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
            Logger.getLogger(Feedbacklogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList sem2() {
       ArrayList list = new ArrayList();
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        try {
            String query = "select * from feedsem2";
            PreparedStatement pstmt = cp.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                HashMap mp = new HashMap();
                mp.put("subid", rs.getInt("subid"));
                mp.put("subname", rs.getString("subname"));
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
            Logger.getLogger(Feedbacklogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList sem3() {
       ArrayList list = new ArrayList();
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        try {
            String query = "select * from feedsem3";
            PreparedStatement pstmt = cp.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                HashMap mp = new HashMap();
                mp.put("subid", rs.getInt("subid"));
                mp.put("subname", rs.getString("subname"));
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
            Logger.getLogger(Feedbacklogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList sem4() {
       ArrayList list = new ArrayList();
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        try {
            String query = "select * from feedsem4";
            PreparedStatement pstmt = cp.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                HashMap mp = new HashMap();
                mp.put("subid", rs.getInt("subid"));
                mp.put("subname", rs.getString("subname"));
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
            Logger.getLogger(Feedbacklogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList sem5() {
        ArrayList list = new ArrayList();
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        try {
            String query = "select * from feedsem5";
            PreparedStatement pstmt = cp.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                HashMap mp = new HashMap();
                mp.put("subid", rs.getInt("subid"));
                mp.put("subname", rs.getString("subname"));
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
            Logger.getLogger(Feedbacklogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList sem6() {
       ArrayList list = new ArrayList();
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        try {
            String query = "select * from feedsem6";
            PreparedStatement pstmt = cp.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                HashMap mp = new HashMap();
                mp.put("subid", rs.getInt("subid"));
                mp.put("subname", rs.getString("subname"));
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
            Logger.getLogger(Feedbacklogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList sem7() {
      ArrayList list = new ArrayList();
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        try {
            String query = "select * from feedsem7";
            PreparedStatement pstmt = cp.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                HashMap mp = new HashMap();
                mp.put("subid", rs.getInt("subid"));
                mp.put("subname", rs.getString("subname"));
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
            Logger.getLogger(Feedbacklogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public ArrayList sem8() {
       ArrayList list = new ArrayList();
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        try {
            String query = "select * from feedsem8";
            PreparedStatement pstmt = cp.prepareStatement(query);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                HashMap mp = new HashMap();
                mp.put("subid", rs.getInt("subid"));
                mp.put("subname", rs.getString("subname"));
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
            Logger.getLogger(Feedbacklogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
}
