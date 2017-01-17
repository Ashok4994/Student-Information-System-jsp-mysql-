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
public class Dayattendancedao {

    public ArrayList studentUtils() {
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
                mp.put("sid", rs.getString("sid"));
                mp.put("sname", rs.getString("sname"));
                mp.put("section", rs.getString("section"));
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

    public void updateCN(String dcn, String sid) {
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement(" update eighth set  dcn=? where sid=? ");

            pstmt.setString(1, dcn);
            pstmt.setString(2, sid);
            pstmt.executeUpdate();
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

    public void updateCD(String dcn, String sid) {
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement(" update eighth set dcd=? where sid=? ");
            pstmt.setString(1, dcn);
            pstmt.setString(2, sid);
            pstmt.executeUpdate();
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

    public void updateWT(String dcn, String sid) {
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement(" update eighth set dwt=? where sid=? ");
            pstmt.setString(1, dcn);
            pstmt.setString(2, sid);
            pstmt.executeUpdate();
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

    public void updateLI(String dcn, String sid) {
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement(" update eighth set dli=? where sid=? ");
            pstmt.setString(1, dcn);
            pstmt.setString(2, sid);
            pstmt.executeUpdate();
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

    public void updateCG(String dcn, String sid) {
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement(" update eighth set dcg=? where sid=? ");
            pstmt.setString(1, dcn);
            pstmt.setString(2, sid);
            pstmt.executeUpdate();
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

    public void studentU() {
        String sid = null, dcn = null, dcd = null, dcg = null,dwt = null, dli = null;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement("select * from eighth");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                sid = rs.getString("sid");
                dcn = rs.getString("dcn");
                dcd = rs.getString("dcd");
                dwt = rs.getString("dwt");
                dli = rs.getString("dli");
                dcg = rs.getString("dcg");
               

                int nwdcn = rs.getInt("nwdcn");
                int nadcn = rs.getInt("nadcn");
                int nwdcd = rs.getInt("nwdcd");
                int nadcd = rs.getInt("nadcd");
                int nwdwt = rs.getInt("nwdwt");
                int nadwt = rs.getInt("nadwt");
                int nwdli = rs.getInt("nwdli");
                int nadli = rs.getInt("nadli");
                int nwdcg = rs.getInt("nwdcg");
                int nadcg = rs.getInt("nadcg");
                if (dcn.equals("p")) {
                    nwdcn = nwdcn + 1;
                    nadcn = nadcn + 1;
                } else {
                    nwdcn = nwdcn + 1;
                }
                if (dcd.equals("p")) {
                    nwdcd = nwdcd + 1;
                    nadcd = nadcd + 1;
                } else {
                    nwdcd = nwdcd + 1;
                }
                if (dwt.equals("p")) {
                    nwdwt = nwdwt + 1;
                    nadwt = nadwt + 1;
                } else {
                    nwdwt = nwdwt + 1;
                }
                if (dli.equals("p")) {
                    nwdli = nwdli + 1;
                    nadli = nadli + 1;
                } else {
                    nwdli = nwdli + 1;
                }
                if (dcg.equals("p")) {
                    nwdcg = nwdcg + 1;
                    nadcg = nadcg + 1;
                } else {
                    nwdcg = nwdcg + 1;
                }
               
                updatefinal(nwdcn, nadcn, nwdcd, nadcd, nwdwt, nadwt, nwdli, nadli, nwdcg, nadcg,sid);
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

    }

    private void updatefinal(int nwdcn, int nadcn, int nwdcd, int nadcd, int nwdwt, int nadwt, int nwdli, int nadli, int nwdcg, int nadcg,String sid) {
        float acn = nadcn;
        float wcn = nwdcn;
        float ccn = 0;
        ccn = (acn) / (wcn);
        double cn = ccn * 100;
        float acd = nadcd;
        float wcd = nwdcd;
        float ccd = 0;
        ccd = (acd) / (wcd);
        double cd = ccd * 100;
        float awt = nadwt;
        float wwt = nwdwt;
        float cwt = 0;
        cwt = (awt) / (wwt);
        double wt = cwt * 100;
        float ali = nadli;
        float wli = nwdli;
        float cli = 0;
        cli = (ali) / (wli);
        double li = cli * 100;
        float acg = nadcg;
        float wcg = nwdcg;
        float ccg = 0;
        ccg = (acg) / (wcg);
        double cg = ccg * 100;
       
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement("update eighth set nwdcn=?, nadcn=?, Acn=?,nwdcd=?,\n"
                    + "      nadcd=?,\n"
                    + "      Acd=?,\n"
                    + "      nwdwt=?,\n"
                    + "      nadwt=?,\n"
                    + "      Awt=?,\n"
                    + "      nwdli=?,\n"
                    + "      nadli=?,\n"
                    + "      Ali=?,\n"
                    + "      nwdcg=?,\n"
                    + "      nadcg=?,\n"
                    + "      Acg=?,\n"
                    + "      where sid=? ");
            pstmt.setDouble(1, wcn);
            pstmt.setDouble(2, acn);
            pstmt.setDouble(3, cn);
            pstmt.setDouble(4, wcd);
            pstmt.setDouble(5, acd);
            pstmt.setDouble(6, cd);
            pstmt.setDouble(7, wwt);
            pstmt.setDouble(8, awt);
            pstmt.setDouble(9, wt);
            pstmt.setDouble(10, wli);
            pstmt.setDouble(11, ali);
            pstmt.setDouble(12, li);
            pstmt.setDouble(13, wcg);
            pstmt.setDouble(14, acg);
            pstmt.setDouble(15, cg);
            pstmt.setString(16, sid);
            pstmt.executeUpdate();

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
