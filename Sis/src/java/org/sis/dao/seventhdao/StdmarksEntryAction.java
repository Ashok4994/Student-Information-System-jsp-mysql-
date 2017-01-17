/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sis.dao.seventhdao;

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
            pstmt = cp.prepareStatement("select * from seventh");
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
                mp.put("mpe", rs.getString("mpe"));
                mp.put("mwtlab", rs.getString("mwtlab"));
                mp.put("mlilab", rs.getString("mlilab"));
                mp.put("mcompviva1", rs.getString("mcompviva1"));
 mp.put("mdtp", rs.getString("mdtp"));
                mp.put("scn", rs.getString("scn"));
                mp.put("scd", rs.getString("scd"));
                mp.put("swt", rs.getString("swt"));
                mp.put("sli", rs.getString("sli"));
                mp.put("scg", rs.getString("scg"));
                mp.put("spe", rs.getString("spe"));
                mp.put("swtlab", rs.getString("swtlab"));
                mp.put("slilab", rs.getString("slilab"));
                mp.put("scompviva1", rs.getString("scompviva1"));
mp.put("sdtp", rs.getString("sdtp"));
                mp.put("acn", rs.getString("acn"));
                mp.put("acd", rs.getString("acd"));
                mp.put("awt", rs.getString("awt"));
                mp.put("ali", rs.getString("ali"));
                mp.put("acg", rs.getString("acg"));
                mp.put("ape", rs.getString("ape"));
                mp.put("awtlab", rs.getString("awtlab"));
                mp.put("alilab", rs.getString("alilab"));
                mp.put("acompviva1", rs.getString("acompviva1"));
 mp.put("adtp", rs.getString("adtp"));
                int pe = Integer.parseInt(rs.getString("ape"));
                int cn = Integer.parseInt(rs.getString("acn"));
                int cg = Integer.parseInt(rs.getString("acg"));
                int cd = Integer.parseInt(rs.getString("acd"));
                int wt = Integer.parseInt(rs.getString("awt"));
                int li = Integer.parseInt(rs.getString("ali"));
                int wtlab = Integer.parseInt(rs.getString("awtlab"));
                int lilab = Integer.parseInt(rs.getString("alilab"));
                int compviva1 = Integer.parseInt(rs.getString("acompviva1"));
                 int dtp = Integer.parseInt(rs.getString("adtp"));
                float fa = pe + cn + cg + cd + wt + li + wtlab + lilab + compviva1+dtp;
                Float a = (fa / 1000) * 100;
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

    public int updateAttendance(String acn, String acd, String awt, String ali, String acg, String ape, String awtlab, String alilab, String acompviva1,String adtp, String sid) {
        int k = 0;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement(" update seventh set acn=?,acd=?,awt=?,ali=?,acg=?,ape=?,awtlab=?,alilab=?,acompviva1=?,adtp=? where sid=? ");
            pstmt.setString(1, acn);
            pstmt.setString(2, acd);
            pstmt.setString(3, awt);
            pstmt.setString(4, ali);
            pstmt.setString(5, acg);
            pstmt.setString(6, ape);
            pstmt.setString(7, awtlab);
            pstmt.setString(8, alilab);
            pstmt.setString(9, acompviva1);
             pstmt.setString(10, adtp);
            pstmt.setString(11, sid);
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

    public int updateMarks(String acn, String acd, String awt, String ali, String acg, String ape, String awtlab, String alilab, String acompviva1,String adtp, String sid) {
        int k = 0;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement(" update seventh set mcn=?,mcd=?,mwt=?,mli=?,mcg=?,mpe=?,mwtlab=?,mlilab=?,mcompviva1=?,mdtp=? where sid=? ");
            pstmt.setString(1, acn);
            pstmt.setString(2, acd);
            pstmt.setString(3, awt);
            pstmt.setString(4, ali);
            pstmt.setString(5, acg);
            pstmt.setString(6, ape);
            pstmt.setString(7, awtlab);
            pstmt.setString(8, alilab);
            pstmt.setString(9, acompviva1);
            pstmt.setString(10, adtp);
            pstmt.setString(11, sid);
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

    public int updatesemMarks(String scn, String scd, String swt, String sli, String scg, String spe, String swtlab, String slilab, String scompviva1,String sdtp, String sid) {
        int j = 0;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement(" update seventh set scn=?,scd=?,swt=?,sli=?,scg=?,spe=?,swtlab=?,slilab=?,scompviva1=?,sdtp=? where sid=? ");
            pstmt.setString(1, scn);
            pstmt.setString(2, scd);
            pstmt.setString(3, swt);
            pstmt.setString(4, sli);
            pstmt.setString(5, scg);
            pstmt.setString(6, spe);
            pstmt.setString(7, swtlab);
            pstmt.setString(8, slilab);
            pstmt.setString(9, scompviva1);
            pstmt.setString(10, sdtp);
            pstmt.setString(11, sid);
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
            pstmt = cp.prepareStatement(" update seventh set Af=? where sid=? ");
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
