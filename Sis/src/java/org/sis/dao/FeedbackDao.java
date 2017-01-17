/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sis.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.database.Databaseconn;
import org.sis.dto.FeedbackDto;

/**
 *
 * @author PEDDI'S
 */
public class FeedbackDao {

    public HashMap getd(int i) {
        int a=i;
       HashMap mp = new HashMap();
         Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement("select * from departmentlist where id=?");
             pstmt.setInt(1, a);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
               
                mp.put("depart", rs.getString("dname"));
                mp.put("mail", rs.getString("mailid"));
               
               
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
            Logger.getLogger(StdmarksEntryAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return mp;
    }

    public ArrayList gett(int i) {
      ArrayList al=new ArrayList();
       int a=i;
       
         Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement("select * from faculty where id=?");
             pstmt.setInt(1, a);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                HashMap mp = new HashMap();
              //  mp.put("dname", rs.getString("dname"));
                mp.put("tid", rs.getInt("tid"));
                mp.put("tname", rs.getString("tname"));
               al.add(mp);
               
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
            Logger.getLogger(StdmarksEntryAction.class.getName()).log(Level.SEVERE, null, ex);
        }
      return al;
    }
    
    public ArrayList getd() {
      ArrayList al=new ArrayList();
 
       
         Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement("select * from departmentlist");
           
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                HashMap mp = new HashMap();
              //  mp.put("dname", rs.getString("dname"));
                mp.put("did", rs.getInt("id"));
                mp.put("dname", rs.getString("dname"));
               al.add(mp);
               
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
            Logger.getLogger(StdmarksEntryAction.class.getName()).log(Level.SEVERE, null, ex);
        }
      return al;
        
    }
}
