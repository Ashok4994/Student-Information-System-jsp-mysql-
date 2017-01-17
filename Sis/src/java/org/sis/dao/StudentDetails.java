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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.database.Databaseconn;

/**
 *
 * @author PEDDI'S
 */
public class StudentDetails {

    public ArrayList seventh(String sid, String q) {
        ArrayList list = new ArrayList();
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        //String q="select * from threeone where sid=?";
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement(q);
            pstmt.setString(1, sid);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                HashMap mp = new HashMap();
                mp.put("sid", rs.getString("sid"));
                mp.put("sname", rs.getString("sname"));
                mp.put("section", rs.getString("section"));

                mp.put("nwdcn", rs.getString("nwdcn"));
                mp.put("nadcn", rs.getString("nadcn"));
                mp.put("nwdcd", rs.getString("nwdcd"));
                mp.put("nadcd", rs.getString("nadcd"));
                mp.put("nwdwt", rs.getString("nwdwt"));
                mp.put("nadwt", rs.getString("nadwt"));
                mp.put("nwdli", rs.getString("nwdli"));
                mp.put("nadli", rs.getString("nadli"));
                mp.put("nwdcg", rs.getString("nwdcg"));
                mp.put("nadcg", rs.getString("nadcg"));
                mp.put("nwdpe", rs.getString("nwdpe"));
                mp.put("nadpe", rs.getString("nadpe"));
                mp.put("nwdwtlab", rs.getString("nwdwtlab"));
                mp.put("nadwtlab", rs.getString("nadwtlab"));
                mp.put("nwdlilB", rs.getString("nwdlilB"));
                mp.put("nadlilab", rs.getString("nadlilab"));
                mp.put("nwdcompviva1", rs.getString("nwdcompviva1"));
                mp.put("nadcompviva1", rs.getString("nadcompviva1"));
                mp.put("nwddtp", rs.getString("nwddtp"));
                mp.put("naddtp", rs.getString("naddtp"));

                mp.put("acn", rs.getString("acn"));
                mp.put("acd", rs.getString("acd"));
                mp.put("awt", rs.getString("awt"));
                mp.put("ali", rs.getString("ali"));
                mp.put("acg", rs.getString("acg"));
                mp.put("ape", rs.getString("ape"));
                mp.put("awtlab", rs.getString("awtlab"));
                mp.put("alilab", rs.getString("alilab"));
                mp.put("acompviva1", rs.getString("acompviva1"));
                mp.put("adtp", rs.getString("Adtp"));
                mp.put("Af", rs.getString("Af"));

                mp.put("mcn", rs.getString("mcn"));
                mp.put("mcd", rs.getString("mcd"));
                mp.put("mwt", rs.getString("mwt"));
                mp.put("mli", rs.getString("mli"));
                mp.put("mcg", rs.getString("mcg"));
                mp.put("mpe", rs.getString("mpe"));
                mp.put("mwtlab", rs.getString("mwtlab"));
                mp.put("mlilab", rs.getString("mlilab"));
                mp.put("mcompviva1", rs.getString("mcompviva1"));
                mp.put("mdtp", rs.getString("Mdtp"));

                mp.put("Gcn", rs.getString("Gcn"));
                mp.put("Gcd", rs.getString("Gcd"));
                mp.put("Gwt", rs.getString("Gwt"));
                mp.put("Gli", rs.getString("Gli"));
                mp.put("Gcg", rs.getString("Gcg"));
                mp.put("Gpe", rs.getString("Gpe"));
                mp.put("Gwtlab", rs.getString("Gwtlab"));
                mp.put("Glilab", rs.getString("Glilab"));
                mp.put("Gcompviva1", rs.getString("Gcompviva1"));
                mp.put("gdtp", rs.getString("Gdtp"));
                mp.put("Nbl", rs.getString("Nbl"));

                mp.put("Sgpa", rs.getString("Sgpa"));
                mp.put("Cgpa", rs.getString("Cgpa"));
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

    public ArrayList first(String sid, String q) {
        ArrayList list = new ArrayList();
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement(q);
            pstmt.setString(1, sid);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                HashMap mp = new HashMap();
                mp.put("sid", rs.getString("sid"));
                mp.put("sname", rs.getString("sname"));
                mp.put("section", rs.getString("section"));

                mp.put("nwdcn", rs.getString("nwdcn"));
                mp.put("nadcn", rs.getString("nadcn"));
                mp.put("nwdcd", rs.getString("nwdcd"));
                mp.put("nadcd", rs.getString("nadcd"));
                mp.put("nwdwt", rs.getString("nwdwt"));
                mp.put("nadwt", rs.getString("nadwt"));
                mp.put("nwdli", rs.getString("nwdli"));
                mp.put("nadli", rs.getString("nadli"));
                mp.put("nwdcg", rs.getString("nwdcg"));
                mp.put("nadcg", rs.getString("nadcg"));
                mp.put("nwdpe", rs.getString("nwdpe"));
                mp.put("nadpe", rs.getString("nadpe"));
                mp.put("nwdwtlab", rs.getString("nwdwtlab"));
                mp.put("nadwtlab", rs.getString("nadwtlab"));
                mp.put("nwdlilB", rs.getString("nwdlilB"));
                mp.put("nadlilab", rs.getString("nadlilab"));

                mp.put("acn", rs.getString("acn"));
                mp.put("acd", rs.getString("acd"));
                mp.put("awt", rs.getString("awt"));
                mp.put("ali", rs.getString("ali"));
                mp.put("acg", rs.getString("acg"));
                mp.put("ape", rs.getString("ape"));
                mp.put("awtlab", rs.getString("awtlab"));
                mp.put("alilab", rs.getString("alilab"));
                mp.put("Af", rs.getString("Af"));

                mp.put("mcn", rs.getString("mcn"));
                mp.put("mcd", rs.getString("mcd"));
                mp.put("mwt", rs.getString("mwt"));
                mp.put("mli", rs.getString("mli"));
                mp.put("mcg", rs.getString("mcg"));
                mp.put("mpe", rs.getString("mpe"));
                mp.put("mwtlab", rs.getString("mwtlab"));
                mp.put("mlilab", rs.getString("mlilab"));

                mp.put("Gcn", rs.getString("Gcn"));
                mp.put("Gcd", rs.getString("Gcd"));
                mp.put("Gwt", rs.getString("Gwt"));
                mp.put("Gli", rs.getString("Gli"));
                mp.put("Gcg", rs.getString("Gcg"));
                mp.put("Gpe", rs.getString("Gpe"));
                mp.put("Gwtlab", rs.getString("Gwtlab"));
                mp.put("Glilab", rs.getString("Glilab"));
                mp.put("Nbl", rs.getString("Nbl"));

                mp.put("Sgpa", rs.getString("Sgpa"));
                mp.put("Cgpa", rs.getString("Cgpa"));
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

    public ArrayList sem(String sid, String q) {
        ArrayList list = new ArrayList();
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        //String q="select * from threeone where sid=?";
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement(q);
            pstmt.setString(1, sid);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                HashMap mp = new HashMap();
                mp.put("sid", rs.getString("sid"));
                mp.put("sname", rs.getString("sname"));
                mp.put("section", rs.getString("section"));

                mp.put("nwdcn", rs.getString("nwdcn"));
                mp.put("nadcn", rs.getString("nadcn"));
                mp.put("nwdcd", rs.getString("nwdcd"));
                mp.put("nadcd", rs.getString("nadcd"));
                mp.put("nwdwt", rs.getString("nwdwt"));
                mp.put("nadwt", rs.getString("nadwt"));
                mp.put("nwdli", rs.getString("nwdli"));
                mp.put("nadli", rs.getString("nadli"));
                mp.put("nwdcg", rs.getString("nwdcg"));
                mp.put("nadcg", rs.getString("nadcg"));
                mp.put("nwdpe", rs.getString("nwdpe"));
                mp.put("nadpe", rs.getString("nadpe"));
                mp.put("nwdwtlab", rs.getString("nwdwtlab"));
                mp.put("nadwtlab", rs.getString("nadwtlab"));
                mp.put("nwdlilB", rs.getString("nwdlilB"));
                mp.put("nadlilab", rs.getString("nadlilab"));
                mp.put("nwdcompviva1", rs.getString("nwdcompviva1"));
                mp.put("nadcompviva1", rs.getString("nadcompviva1"));

                mp.put("acn", rs.getString("acn"));
                mp.put("acd", rs.getString("acd"));
                mp.put("awt", rs.getString("awt"));
                mp.put("ali", rs.getString("ali"));
                mp.put("acg", rs.getString("acg"));
                mp.put("ape", rs.getString("ape"));
                mp.put("awtlab", rs.getString("awtlab"));
                mp.put("alilab", rs.getString("alilab"));
                mp.put("acompviva1", rs.getString("acompviva1"));

                mp.put("Af", rs.getString("Af"));

                mp.put("mcn", rs.getString("mcn"));
                mp.put("mcd", rs.getString("mcd"));
                mp.put("mwt", rs.getString("mwt"));
                mp.put("mli", rs.getString("mli"));
                mp.put("mcg", rs.getString("mcg"));
                mp.put("mpe", rs.getString("mpe"));
                mp.put("mwtlab", rs.getString("mwtlab"));
                mp.put("mlilab", rs.getString("mlilab"));
                mp.put("mcompviva1", rs.getString("mcompviva1"));

                mp.put("Gcn", rs.getString("Gcn"));
                mp.put("Gcd", rs.getString("Gcd"));
                mp.put("Gwt", rs.getString("Gwt"));
                mp.put("Gli", rs.getString("Gli"));
                mp.put("Gcg", rs.getString("Gcg"));
                mp.put("Gpe", rs.getString("Gpe"));
                mp.put("Gwtlab", rs.getString("Gwtlab"));
                mp.put("Glilab", rs.getString("Glilab"));
                mp.put("Gcompviva1", rs.getString("Gcompviva1"));
                mp.put("Nbl", rs.getString("Nbl"));

                mp.put("Sgpa", rs.getString("Sgpa"));
                mp.put("Cgpa", rs.getString("Cgpa"));
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

    public ArrayList eighth(String sid, String q) {
        ArrayList list = new ArrayList();
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        //String q="select * from threeone where sid=?";
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement(q);
            pstmt.setString(1, sid);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                HashMap mp = new HashMap();
                mp.put("sid", rs.getString("sid"));
                mp.put("sname", rs.getString("sname"));
                mp.put("section", rs.getString("section"));

                mp.put("nwdcn", rs.getString("nwdcn"));
                mp.put("nadcn", rs.getString("nadcn"));
                mp.put("nwdcd", rs.getString("nwdcd"));
                mp.put("nadcd", rs.getString("nadcd"));
                mp.put("nwdwt", rs.getString("nwdwt"));
                mp.put("nadwt", rs.getString("nadwt"));
                mp.put("nwdli", rs.getString("nwdli"));
                mp.put("nadli", rs.getString("nadli"));
                mp.put("nwdcg", rs.getString("nwdcg"));
                mp.put("nadcg", rs.getString("nadcg"));

                mp.put("acn", rs.getString("acn"));
                mp.put("acd", rs.getString("acd"));
                mp.put("awt", rs.getString("awt"));
                mp.put("ali", rs.getString("ali"));
                mp.put("acg", rs.getString("acg"));

                mp.put("Af", rs.getString("Af"));

                mp.put("mcn", rs.getString("mcn"));
                mp.put("mcd", rs.getString("mcd"));
                mp.put("mwt", rs.getString("mwt"));
                mp.put("mli", rs.getString("mli"));
                mp.put("mcg", rs.getString("mcg"));

                mp.put("Gcn", rs.getString("Gcn"));
                mp.put("Gcd", rs.getString("Gcd"));
                mp.put("Gwt", rs.getString("Gwt"));
                mp.put("Gli", rs.getString("Gli"));
                mp.put("Gcg", rs.getString("Gcg"));

                mp.put("Nbl", rs.getString("Nbl"));

                mp.put("Sgpa", rs.getString("Sgpa"));
                mp.put("Cgpa", rs.getString("Cgpa"));
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

    public int tnblsecond(String sid) {
        int a = 0;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        PreparedStatement pstmt1, pstmt2;
        try {
            pstmt1 = cp.prepareStatement("SELECT Nbl FROM first where sid=?");
            pstmt1.setString(1, sid);
            ResultSet rs = pstmt1.executeQuery();
            while (rs.next()) {
                a = rs.getInt("Nbl");
            }
            pstmt2 = cp.prepareStatement("SELECT Nbl FROM second where sid=?");
            pstmt2.setString(1, sid);
            rs = pstmt2.executeQuery();
            while (rs.next()) {
                a = a + rs.getInt("Nbl");
            }
        } catch (SQLException ex) {
            Logger.getLogger(StdmarksEntryAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }

    public int tnbleighth(String sid) {
        int a = 0;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        PreparedStatement pstmt1, pstmt2, pstmt3, pstmt4, pstmt5, pstmt6, pstmt7, pstmt8;
        try {
            pstmt1 = cp.prepareStatement("SELECT Nbl FROM first where sid=?");
            pstmt1.setString(1, sid);
            ResultSet rs = pstmt1.executeQuery();
            while (rs.next()) {
                a = rs.getInt("Nbl");
            }
            pstmt2 = cp.prepareStatement("SELECT  Nbl FROM second where sid=?");
            pstmt2.setString(1, sid);
            rs = pstmt2.executeQuery();
            while (rs.next()) {
                a = a + rs.getInt("Nbl");
            }
            pstmt3 = cp.prepareStatement("SELECT Nbl FROM third where sid=?");
            pstmt3.setString(1, sid);
            rs = pstmt3.executeQuery();
            while (rs.next()) {
                a = a+rs.getInt("Nbl");
            }
            pstmt4 = cp.prepareStatement("SELECT Nbl FROM fourth where sid=?");
            pstmt4.setString(1, sid);
            rs = pstmt4.executeQuery();
            while (rs.next()) {
                a = a + rs.getInt("Nbl");
            }
            pstmt5 = cp.prepareStatement("SELECT Nbl FROM fifth where sid=?");
            pstmt5.setString(1, sid);
            rs = pstmt5.executeQuery();
            while (rs.next()) {
                a = a + rs.getInt("Nbl");
            }
            pstmt6 = cp.prepareStatement("SELECT Nbl FROM threeone where sid=?");
            pstmt6.setString(1, sid);
            rs = pstmt6.executeQuery();
            while (rs.next()) {
                a = a + rs.getInt("Nbl");
            }
            pstmt7 = cp.prepareStatement("SELECT Nbl FROM seventh where sid=?");
            pstmt7.setString(1, sid);
            rs = pstmt7.executeQuery();
            while (rs.next()) {
                a = a + rs.getInt("Nbl");
            }
            pstmt8 = cp.prepareStatement("SELECT Nbl FROM eighth where sid=?");
            pstmt8.setString(1, sid);
            rs = pstmt8.executeQuery();
            while (rs.next()) {
                a = a + rs.getInt("Nbl");
            }
        } catch (SQLException ex) {
            Logger.getLogger(StdmarksEntryAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }

    public int tnblseventh(String sid) {
         int a = 0;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        PreparedStatement pstmt1, pstmt2, pstmt3, pstmt4, pstmt5, pstmt6, pstmt7;
        try {
            pstmt1 = cp.prepareStatement("SELECT Nbl FROM first where sid=?");
            pstmt1.setString(1, sid);
            ResultSet rs = pstmt1.executeQuery();
            while (rs.next()) {
                a = rs.getInt("Nbl");
            }
            pstmt2 = cp.prepareStatement("SELECT Nbl FROM second where sid=?");
            pstmt2.setString(1, sid);
            rs = pstmt2.executeQuery();
            while (rs.next()) {
                a = a + rs.getInt("Nbl");
            }
            pstmt3 = cp.prepareStatement("SELECT Nbl FROM third where sid=?");
            pstmt3.setString(1, sid);
            rs = pstmt3.executeQuery();
            while (rs.next()) {
                a = a+rs.getInt("Nbl");
            }
            pstmt4 = cp.prepareStatement("SELECT Nbl FROM fourth where sid=?");
            pstmt4.setString(1, sid);
            rs = pstmt4.executeQuery();
            while (rs.next()) {
                a = a + rs.getInt("Nbl");
            }
            pstmt5 = cp.prepareStatement("SELECT Nbl FROM fifth where sid=?");
            pstmt5.setString(1, sid);
            rs = pstmt5.executeQuery();
            while (rs.next()) {
                a = a + rs.getInt("Nbl");
            }
            pstmt6 = cp.prepareStatement("SELECT Nbl FROM threeone where sid=?");
            pstmt6.setString(1, sid);
            rs = pstmt6.executeQuery();
            while (rs.next()) {
                a = a + rs.getInt("Nbl");
            }
            pstmt7 = cp.prepareStatement("SELECT Nbl FROM seventh where sid=?");
            pstmt7.setString(1, sid);
            rs = pstmt7.executeQuery();
            while (rs.next()) {
                a = a + rs.getInt("Nbl");
            }
        } catch (SQLException ex) {
            Logger.getLogger(StdmarksEntryAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }

    public int tnblthreeone(String sid) {
          int a = 0;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        PreparedStatement pstmt1, pstmt2, pstmt3, pstmt4, pstmt5, pstmt6;
        try {
            pstmt1 = cp.prepareStatement("SELECT Nbl FROM first where sid=?");
            pstmt1.setString(1, sid);
            ResultSet rs = pstmt1.executeQuery();
            while (rs.next()) {
                a = rs.getInt("Nbl");
            }
            pstmt2 = cp.prepareStatement("SELECT Nbl FROM second where sid=?");
            pstmt2.setString(1, sid);
            rs = pstmt2.executeQuery();
            while (rs.next()) {
                a = a + rs.getInt("Nbl");
            }
            pstmt3 = cp.prepareStatement("SELECT Nbl FROM third where sid=?");
            pstmt3.setString(1, sid);
            rs = pstmt3.executeQuery();
            while (rs.next()) {
                a = a+rs.getInt("Nbl");
            }
            pstmt4 = cp.prepareStatement("SELECT Nbl FROM fourth where sid=?");
            pstmt4.setString(1, sid);
            rs = pstmt4.executeQuery();
            while (rs.next()) {
                a = a + rs.getInt("Nbl");
            }
            pstmt5 = cp.prepareStatement("SELECT Nbl FROM fifth where sid=?");
            pstmt5.setString(1, sid);
            rs = pstmt5.executeQuery();
            while (rs.next()) {
                a = a + rs.getInt("Nbl");
            }
            pstmt6 = cp.prepareStatement("SELECT Nbl FROM threeone where sid=?");
            pstmt6.setString(1, sid);
            rs = pstmt6.executeQuery();
            while (rs.next()) {
                a = a + rs.getInt("Nbl");
            }
        } catch (SQLException ex) {
            Logger.getLogger(StdmarksEntryAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }

    public int tnblfifth(String sid) {
          int a = 0;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        PreparedStatement pstmt1, pstmt2, pstmt3, pstmt4, pstmt5;
        try {
            pstmt1 = cp.prepareStatement("SELECT Nbl FROM first where sid=?");
            pstmt1.setString(1, sid);
            ResultSet rs = pstmt1.executeQuery();
            while (rs.next()) {
                a = a+rs.getInt("Nbl");
            }
            pstmt2 = cp.prepareStatement("SELECT Nbl FROM second where sid=?");
            pstmt2.setString(1, sid);
            rs = pstmt2.executeQuery();
            while (rs.next()) {
                a = a + rs.getInt("Nbl");
            }
            pstmt3 = cp.prepareStatement("SELECT Nbl FROM third where sid=?");
            pstmt3.setString(1, sid);
            rs = pstmt3.executeQuery();
            while (rs.next()) {
                a = a+rs.getInt("Nbl");
            }
            pstmt4 = cp.prepareStatement("SELECT Nbl FROM fourth where sid=?");
            pstmt4.setString(1, sid);
            rs = pstmt4.executeQuery();
            while (rs.next()) {
                a = a + rs.getInt("Nbl");
            }
            pstmt5 = cp.prepareStatement("SELECT Nbl FROM fifth where sid=?");
            pstmt5.setString(1, sid);
            rs = pstmt5.executeQuery();
            while (rs.next()) {
                a = a + rs.getInt("Nbl");
            }
        } catch (SQLException ex) {
            Logger.getLogger(StdmarksEntryAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }

    public int tnblfourth(String sid) {
          int a = 0;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        PreparedStatement pstmt1, pstmt2, pstmt3, pstmt4;
        try {
            pstmt1 = cp.prepareStatement("SELECT Nbl FROM first where sid=?");
            pstmt1.setString(1, sid);
            ResultSet rs = pstmt1.executeQuery();
            while (rs.next()) {
                a =a+ rs.getInt("Nbl");
            }
            pstmt2 = cp.prepareStatement("SELECT Nbl FROM second where sid=?");
            pstmt2.setString(1, sid);
            rs = pstmt2.executeQuery();
            while (rs.next()) {
                a = a + rs.getInt("Nbl");
            }
            pstmt3 = cp.prepareStatement("SELECT Nbl FROM third where sid=?");
            pstmt3.setString(1, sid);
            rs = pstmt3.executeQuery();
            while (rs.next()) {
                a = a+rs.getInt("Nbl");
            }
            pstmt4 = cp.prepareStatement("SELECT Nbl FROM fourth where sid=?");
            pstmt4.setString(1, sid);
            rs = pstmt4.executeQuery();
            while (rs.next()) {
                a = a + rs.getInt("Nbl");
            }
        } catch (SQLException ex) {
            Logger.getLogger(StdmarksEntryAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }

    public int tnblthird(String sid) {
         int a = 0;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        PreparedStatement pstmt1, pstmt2, pstmt3;
        try {
            pstmt1 = cp.prepareStatement("SELECT Nbl FROM first where sid=?");
            pstmt1.setString(1, sid);
            ResultSet rs = pstmt1.executeQuery();
            while (rs.next()) {
                a = rs.getInt("Nbl");
            }
            pstmt2 = cp.prepareStatement("SELECT Nbl FROM second where sid=?");
            pstmt2.setString(1, sid);
            rs = pstmt2.executeQuery();
            while (rs.next()) {
                a = a + rs.getInt("Nbl");
            }
            pstmt3 = cp.prepareStatement("SELECT Nbl FROM third where sid=?");
            pstmt3.setString(1, sid);
            rs = pstmt3.executeQuery();
            while (rs.next()) {
                a = a+rs.getInt("Nbl");
            }
        } catch (SQLException ex) {
            Logger.getLogger(StdmarksEntryAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return a;
    }

}
