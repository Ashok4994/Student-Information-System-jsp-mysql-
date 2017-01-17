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
public class Dayattendancedao {

    public ArrayList studentUtils() {
        ArrayList list = new ArrayList();
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement("select * from threeone");
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
            pstmt = cp.prepareStatement(" update threeone set  dcn=? where sid=? ");

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
            pstmt = cp.prepareStatement(" update threeone set dcd=? where sid=? ");
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
            pstmt = cp.prepareStatement(" update threeone set dwt=? where sid=? ");
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
            pstmt = cp.prepareStatement(" update threeone set dli=? where sid=? ");
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
            pstmt = cp.prepareStatement(" update threeone set dcg=? where sid=? ");
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

    public void updatePE(String dcn, String sid) {
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement(" update threeone set dpe=? where sid=? ");
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

    public void updateWTLAB(String dcn, String sid) {
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement(" update threeone set dwtlab=? where sid=? ");
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

    public void updateLILAB(String dcn, String sid) {
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement(" update threeone set dlilab=? where sid=? ");
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

    public void updateCVIVA(String dcn, String sid) {
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement(" update threeone set dcompviva1=? where sid=? ");
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
        String sid = null, dcn = null, dcd = null, dcg = null, dpe = null, dwt = null, dli = null, dwtlab = null, dlilab = null, dcompviva1 = null;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement("select * from threeone");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                sid = rs.getString("sid");
                dcn = rs.getString("dcn");
                dcd = rs.getString("dcd");
                dwt = rs.getString("dwt");
                dli = rs.getString("dli");
                dcg = rs.getString("dcg");
                dpe = rs.getString("dpe");
                dwtlab = rs.getString("dwtlab");
                dlilab = rs.getString("dlilab");
                dcompviva1 = rs.getString("dcompviva1");
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
                int nwdpe = rs.getInt("nwdpe");
                int nadpe = rs.getInt("nadpe");
                int nwdwtlab = rs.getInt("nwdwtlab");
                int nadwtlab = rs.getInt("nadwtlab");
                int nwdlilab = rs.getInt("nwdlilab");
                int nadlilab = rs.getInt("nadlilab");
                int nwdcompviva1 = rs.getInt("nwdcompviva1");
                int nadcompviva1 = rs.getInt("nadcompviva1");
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
                if (dpe.equals("p")) {
                    nwdpe = nwdpe + 1;
                    nadpe = nadpe + 1;
                } else {
                    nwdpe = nwdpe + 1;
                }
                if (dwtlab.equals("p")) {
                    nwdwtlab = nwdwtlab + 3;
                    nadwtlab = nadwtlab + 3;
                } else {
                    nwdwtlab = nwdwtlab + 3;
                }
                if (dlilab.equals("p")) {
                    nwdlilab = nwdlilab + 3;
                    nadlilab = nadlilab + 3;
                } else {
                    nwdlilab = nwdlilab + 3;
                }
                if (dcompviva1.equals("p")) {
                    nwdcompviva1 = nwdcompviva1 + 3;
                    nadcompviva1 = nadcompviva1 + 3;
                } else {
                    nwdcompviva1 = nwdcompviva1 + 3;
                }
                updatefinal(nwdcn, nadcn, nwdcd, nadcd, nwdwt, nadwt, nwdli, nadli, nwdcg, nadcg, nwdpe, nadpe, nwdwtlab, nadwtlab, nwdlilab, nadlilab, nwdcompviva1, nadcompviva1, sid);
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

    private void updatefinal(int nwdcn, int nadcn, int nwdcd, int nadcd, int nwdwt, int nadwt, int nwdli, int nadli, int nwdcg, int nadcg, int nwdpe, int nadpe, int nwdwtlab, int nadwtlab, int nwdlilab, int nadlilab, int nwdcompviva1, int nadcompviva1, String sid) {
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
        float ape = nadpe;
        float wpe = nwdpe;
        float cpe = 0;
        cpe = (ape) / (wpe);
        double pe = cpe * 100;
        float awtlab = nadwtlab;
        float wwtlab = nwdwtlab;
        float cwtlab = 0;
        cwtlab = (awtlab) / (wwtlab);
        double wtlab = cwtlab * 100;
        float alilab = nadlilab;
        float wlilab = nwdlilab;
        float clilab = 0;
        clilab = (alilab) / (wlilab);
        double lilab = clilab * 100;
        float acompviva1 = nadcompviva1;
        float wcompviva1 = nwdcompviva1;
        float ccompviva1 = 0;
        ccompviva1 = (acompviva1) / (wcompviva1);
        double compviva1 = ccompviva1 * 100;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement("update threeone set nwdcn=?, nadcn=?, Acn=?,nwdcd=?,\n"
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
                    + "      nwdpe=?,\n"
                    + "      nadpe=?,\n"
                    + "      Ape=?,\n"
                    + "      nwdwtlab=?,\n"
                    + "      nadwtlab=?,\n"
                    + "      Awtlab=?,\n"
                    + "      nwdlilab=?,\n"
                    + "      nadlilab=?,\n"
                    + "      Alilab=?,\n"
                    + "      nwdcompviva1=?,\n"
                    + "      nadcompviva1=?, Acompviva1=?  where sid=? ");
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
            pstmt.setDouble(16, wpe);
            pstmt.setDouble(17, ape);
            pstmt.setDouble(18, pe);
            pstmt.setDouble(19, wwtlab);
            pstmt.setDouble(20, awtlab);
            pstmt.setDouble(21, wtlab);
            pstmt.setDouble(22, wlilab);
            pstmt.setDouble(23, alilab);
            pstmt.setDouble(24, lilab);
            pstmt.setDouble(25, wcompviva1);
            pstmt.setDouble(26, acompviva1);
            pstmt.setDouble(27, compviva1);
            pstmt.setString(28, sid);
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
