/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sis.dao.eighthdao;

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
public class StdmarksEntryAction {

    public ArrayList studentUtils() {
        StdmarksEntryAction s = new StdmarksEntryAction();
        ArrayList list = new ArrayList();
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement("select * from eighth");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                HashMap mp = new HashMap();
                String sid=rs.getString("sid");
                mp.put("sid", sid);
                mp.put("sname", rs.getString("sname"));
                mp.put("section", rs.getString("section"));
                mp.put("mcn", rs.getString("mcn"));
                mp.put("mcd", rs.getString("mcd"));
                mp.put("mwt", rs.getString("mwt"));
                mp.put("mli", rs.getString("mli"));
                mp.put("mcg", rs.getString("mcg"));
              
              

                mp.put("scn", rs.getString("scn"));
                mp.put("scd", rs.getString("scd"));
                mp.put("swt", rs.getString("swt"));
                mp.put("sli", rs.getString("sli"));
                mp.put("scg", rs.getString("scg"));
              
               

                mp.put("acn", rs.getString("acn"));
                mp.put("acd", rs.getString("acd"));
                mp.put("awt", rs.getString("awt"));
                mp.put("ali", rs.getString("ali"));
                mp.put("acg", rs.getString("acg"));
               
              

               
                int cn = Integer.parseInt(rs.getString("acn"));
                int cg = Integer.parseInt(rs.getString("acg"));
                int cd = Integer.parseInt(rs.getString("acd"));
                int wt = Integer.parseInt(rs.getString("awt"));
                int li = Integer.parseInt(rs.getString("ali"));
               
                
                float fa =  cn + cg + cd + wt + li  ;
                Float a = (fa / 500) * 100;
                mp.put("a", a);
                s.studentU(a,sid);
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
            Logger.getLogger(StdmarksEntryAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }

    public int updateAttendance(String acn, String acd, String awt, String ali, String acg,  String sid) {
        int k = 0;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement(" update eighth set acn=?,acd=?,awt=?,ali=?,acg=? where sid=? ");
            pstmt.setString(1, acn);
            pstmt.setString(2, acd);
            pstmt.setString(3, awt);
            pstmt.setString(4, ali);
            pstmt.setString(5, acg);
          
            pstmt.setString(6, sid);
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

    public int updateMarks(String acn, String acd, String awt, String ali, String acg,  String sid) {
        int k = 0;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement(" update eighth set mcn=?,mcd=?,mwt=?,mli=?,mcg=? where sid=? ");
            pstmt.setString(1, acn);
            pstmt.setString(2, acd);
            pstmt.setString(3, awt);
            pstmt.setString(4, ali);
            pstmt.setString(5, acg);
            pstmt.setString(6, sid);
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

    public int updatesemMarks(String scn, String scd, String swt, String sli, String scg, String sid) {
        int j = 0;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement(" update eighth set scn=?,scd=?,swt=?,sli=?,scg=? where sid=? ");
            pstmt.setString(1, scn);
            pstmt.setString(2, scd);
            pstmt.setString(3, swt);
            pstmt.setString(4, sli);
            pstmt.setString(5, scg);
          
           
            pstmt.setString(6, sid);
            j = pstmt.executeUpdate();
            if (pstmt != null) {
                pstmt.close();
            }
            if (cp != null) {
                cp.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(StdmarksEntryAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return j;
    }

    public void studentU(float a,String sid) {
        float j = a;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement(" update eighth set Af=? where sid=? ");
            pstmt.setFloat(1, j);
            pstmt.setString(2, sid);
           
            j = pstmt.executeUpdate();
            if (pstmt != null) {
                pstmt.close();
            }
            if (cp != null) {
                cp.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(StdmarksEntryAction.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
