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
import java.util.logging.Level;
import java.util.logging.Logger;
import org.database.Databaseconn;

/**
 *
 * @author PEDDI'S
 */
public class FeedSubmissionDao {

    public boolean updatefeedlog(String sid) {
        boolean b = false;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement("update stdlogin set log=? where sid=?");
            pstmt.setInt(1, 1);
            pstmt.setString(2, sid);
            int k = pstmt.executeUpdate();
            if (k == 1) {
                b = true;
            } else {
                b = false;
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (cp != null) {
                cp.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(FeedSubmissionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }

    public boolean updatesem1(String qna, String qnb, String qnc, String qnd, String qne, String subid, String kval) {
        int qnal = Integer.parseInt(qna);
        int qnbl = Integer.parseInt(qnb);
        int qncl = Integer.parseInt(qnc);
        int qndl = Integer.parseInt(qnd);
        int qnel = Integer.parseInt(qne);
        int subidl = Integer.parseInt(subid);
        int kvalf = Integer.parseInt(kval)-1;
        double qnad = 0;
        double qnbd = 0;
        double qncd = 0;
        double qndd = 0;
        double qned = 0;
        double finalfeed = 0;
        int memd = 0;
        int memf = 0;
        double qnaf = 0;
        double qnbf = 0;
        double qncf = 0;
        double qndf = 0;
        double qnef = 0;
        double qnan = 0;
        double qnbn = 0;
        double qncn = 0;
        double qndn = 0;
        double qnen = 0;
        boolean b = false;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement("select * from feedsem1 where subid=?");
            pstmt.setInt(1, subidl);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                qnad = rs.getFloat("qn1");
                qnbd = rs.getFloat("qn2");
                qncd = rs.getFloat("qn3");
                qndd = rs.getFloat("qn4");
                qned = rs.getFloat("qn5");
                memd = rs.getInt("mem");
            }
            memf = memd + 1;
            qnan = (qnal + qnad);
            qnbn = (qnbl + qnbd);
            qncn = (qncl + qncd);
            qndn = (qndl + qndd);
            qnen = (qnel + qned);
            qnaf = (qnan) / memf;
            qnbf = (qnbn) / memf;
            qncf = (qncn) / memf;
            qndf = (qndn) / memf;
            qnef = (qnen) / memf;
            double n = qnaf + qnbf + qncf + qndf + qnef;
            finalfeed = n / kvalf;
            boolean bb = updatefinalsem1(qnan, qnbn, qncn, qndn, qnen, qnaf, qnbf, qncf, qndf, qnef, finalfeed, memf, subidl);
            if (bb) {
                b = true;
            } else {
                b = false;
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (cp != null) {
                cp.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(FeedSubmissionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }

    private boolean updatefinalsem1(double qnan, double qnbn, double qncn, double qndn, double qnen, double qnaf, double qnbf, double qncf, double qndf, double qnef, double finalfeed, double memf, int subidl) {
        boolean b = false;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement("update feedsem1 set qn1=?,qn2=?,qn3=?,qn4=?,qn5=?,qn1n=?,qn2n=?,qn3n=?,qn4n=?,qn5n=?,mem=?,finalfeed=?  where subid=?");
            pstmt.setDouble(1, qnan);
            pstmt.setDouble(2, qnbn);
            pstmt.setDouble(3, qncn);
            pstmt.setDouble(4, qndn);
            pstmt.setDouble(5, qnen);
            pstmt.setDouble(6, qnaf);
            pstmt.setDouble(7, qnbf);
            pstmt.setDouble(8, qncf);
            pstmt.setDouble(9, qndf);
            pstmt.setDouble(10, qnef);
            pstmt.setDouble(11, memf);
            pstmt.setDouble(12, finalfeed);
            pstmt.setInt(13, subidl);
            int k = pstmt.executeUpdate();
            if (k == 1) {
                b = true;
            } else {
                b = false;
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (cp != null) {
                cp.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(FeedSubmissionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }

    public boolean updatesem2(String qna, String qnb, String qnc, String qnd, String qne, String subid, String kval) {
        int qnal = Integer.parseInt(qna);
        int qnbl = Integer.parseInt(qnb);
        int qncl = Integer.parseInt(qnc);
        int qndl = Integer.parseInt(qnd);
        int qnel = Integer.parseInt(qne);
        int subidl = Integer.parseInt(subid);
        int kvalf = Integer.parseInt(kval) - 1;
        double qnad = 0;
        double qnbd = 0;
        double qncd = 0;
        double qndd = 0;
        double qned = 0;
        double finalfeed = 0;
        int memd = 0;
        int memf = 0;
        double qnaf = 0;
        double qnbf = 0;
        double qncf = 0;
        double qndf = 0;
        double qnef = 0;
        double qnan = 0;
        double qnbn = 0;
        double qncn = 0;
        double qndn = 0;
        double qnen = 0;
        boolean b = false;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement("select * from feedsem2 where subid=?");
            pstmt.setInt(1, subidl);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                qnad = rs.getFloat("qn1");
                qnbd = rs.getFloat("qn2");
                qncd = rs.getFloat("qn3");
                qndd = rs.getFloat("qn4");
                qned = rs.getFloat("qn5");
                memd = rs.getInt("mem");
            }
            memf = memd + 1;
            qnan = (qnal + qnad);
            qnbn = (qnbl + qnbd);
            qncn = (qncl + qncd);
            qndn = (qndl + qndd);
            qnen = (qnel + qned);
            qnaf = (qnan) / memf;
            qnbf = (qnbn) / memf;
            qncf = (qncn) / memf;
            qndf = (qndn) / memf;
            qnef = (qnen) / memf;
            double n = qnaf + qnbf + qncf + qndf + qnef;
            finalfeed = n / kvalf;
            boolean bb = updatefinalsem2(qnan, qnbn, qncn, qndn, qnen, qnaf, qnbf, qncf, qndf, qnef, finalfeed, memf, subidl);
            if (bb) {
                b = true;
            } else {
                b = false;
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (cp != null) {
                cp.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(FeedSubmissionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }

    private boolean updatefinalsem2(double qnan, double qnbn, double qncn, double qndn, double qnen, double qnaf, double qnbf, double qncf, double qndf, double qnef, double finalfeed, double memf, int subidl) {
        boolean b = false;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement("update feedsem2 set qn1=?,qn2=?,qn3=?,qn4=?,qn5=?,qn1n=?,qn2n=?,qn3n=?,qn4n=?,qn5n=?,mem=?,finalfeed=?  where subid=?");
            pstmt.setDouble(1, qnan);
            pstmt.setDouble(2, qnbn);
            pstmt.setDouble(3, qncn);
            pstmt.setDouble(4, qndn);
            pstmt.setDouble(5, qnen);
            pstmt.setDouble(6, qnaf);
            pstmt.setDouble(7, qnbf);
            pstmt.setDouble(8, qncf);
            pstmt.setDouble(9, qndf);
            pstmt.setDouble(10, qnef);
            pstmt.setDouble(11, memf);
            pstmt.setDouble(12, finalfeed);
            pstmt.setInt(13, subidl);
            int k = pstmt.executeUpdate();
            if (k == 1) {
                b = true;
            } else {
                b = false;
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (cp != null) {
                cp.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(FeedSubmissionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }
      public boolean updatesem3(String qna, String qnb, String qnc, String qnd, String qne, String subid, String kval) {
        int qnal = Integer.parseInt(qna);
        int qnbl = Integer.parseInt(qnb);
        int qncl = Integer.parseInt(qnc);
        int qndl = Integer.parseInt(qnd);
        int qnel = Integer.parseInt(qne);
        int subidl = Integer.parseInt(subid);
        int kvalf = Integer.parseInt(kval) - 1;
        double qnad = 0;
        double qnbd = 0;
        double qncd = 0;
        double qndd = 0;
        double qned = 0;
        double finalfeed = 0;
        int memd = 0;
        int memf = 0;
        double qnaf = 0;
        double qnbf = 0;
        double qncf = 0;
        double qndf = 0;
        double qnef = 0;
        double qnan = 0;
        double qnbn = 0;
        double qncn = 0;
        double qndn = 0;
        double qnen = 0;
        boolean b = false;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement("select * from feedsem3 where subid=?");
            pstmt.setInt(1, subidl);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                qnad = rs.getFloat("qn1");
                qnbd = rs.getFloat("qn2");
                qncd = rs.getFloat("qn3");
                qndd = rs.getFloat("qn4");
                qned = rs.getFloat("qn5");
                memd = rs.getInt("mem");
            }
            memf = memd + 1;
            qnan = (qnal + qnad);
            qnbn = (qnbl + qnbd);
            qncn = (qncl + qncd);
            qndn = (qndl + qndd);
            qnen = (qnel + qned);
            qnaf = (qnan) / memf;
            qnbf = (qnbn) / memf;
            qncf = (qncn) / memf;
            qndf = (qndn) / memf;
            qnef = (qnen) / memf;
            double n = qnaf + qnbf + qncf + qndf + qnef;
            finalfeed = n / kvalf;
            boolean bb = updatefinalsem3(qnan, qnbn, qncn, qndn, qnen,qnaf, qnbf, qncf, qndf, qnef, finalfeed, memf, subidl);
            if (bb) {
                b = true;
            } else {
                b = false;
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (cp != null) {
                cp.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(FeedSubmissionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }

    private boolean updatefinalsem3(double qnan, double qnbn, double qncn, double qndn, double qnen,double qnaf, double qnbf, double qncf, double qndf, double qnef, double finalfeed, double memf, int subidl) {
        boolean b = false;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement("update feedsem3 set qn1=?,qn2=?,qn3=?,qn4=?,qn5=?,qn1n=?,qn2n=?,qn3n=?,qn4n=?,qn5n=?,mem=?,finalfeed=?  where subid=?");
            pstmt.setDouble(1, qnan);
            pstmt.setDouble(2, qnbn);
            pstmt.setDouble(3, qncn);
            pstmt.setDouble(4, qndn);
            pstmt.setDouble(5, qnen);
            pstmt.setDouble(6, qnaf);
            pstmt.setDouble(7, qnbf);
            pstmt.setDouble(8, qncf);
            pstmt.setDouble(9, qndf);
            pstmt.setDouble(10, qnef);
            pstmt.setDouble(11, memf);
            pstmt.setDouble(12, finalfeed);
            pstmt.setInt(13, subidl);
            int k = pstmt.executeUpdate();
            if (k == 1) {
                b = true;
            } else {
                b = false;
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (cp != null) {
                cp.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(FeedSubmissionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }
      public boolean updatesem4(String qna, String qnb, String qnc, String qnd, String qne, String subid, String kval) {
        int qnal = Integer.parseInt(qna);
        int qnbl = Integer.parseInt(qnb);
        int qncl = Integer.parseInt(qnc);
        int qndl = Integer.parseInt(qnd);
        int qnel = Integer.parseInt(qne);
        int subidl = Integer.parseInt(subid);
        int kvalf = Integer.parseInt(kval) - 2;
        double qnad = 0;
        double qnbd = 0;
        double qncd = 0;
        double qndd = 0;
        double qned = 0;
        double finalfeed = 0;
        int memd = 0;
        int memf = 0;
        double qnaf = 0;
        double qnbf = 0;
        double qncf = 0;
        double qndf = 0;
        double qnef = 0;
        double qnan = 0;
        double qnbn = 0;
        double qncn = 0;
        double qndn = 0;
        double qnen = 0;
        boolean b = false;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement("select * from feedsem4 where subid=?");
            pstmt.setInt(1, subidl);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                qnad = rs.getFloat("qn1");
                qnbd = rs.getFloat("qn2");
                qncd = rs.getFloat("qn3");
                qndd = rs.getFloat("qn4");
                qned = rs.getFloat("qn5");
                memd = rs.getInt("mem");
            }
            memf = memd + 1;
            qnan = (qnal + qnad);
            qnbn = (qnbl + qnbd);
            qncn = (qncl + qncd);
            qndn = (qndl + qndd);
            qnen = (qnel + qned);
            qnaf = (qnan) / memf;
            qnbf = (qnbn) / memf;
            qncf = (qncn) / memf;
            qndf = (qndn) / memf;
            qnef = (qnen) / memf;
            double n = qnaf + qnbf + qncf + qndf + qnef;
            finalfeed = n / kvalf;
            boolean bb = updatefinalsem4(qnan, qnbn, qncn, qndn, qnen,qnaf, qnbf, qncf, qndf, qnef, finalfeed, memf, subidl);
            if (bb) {
                b = true;
            } else {
                b = false;
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (cp != null) {
                cp.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(FeedSubmissionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }

    private boolean updatefinalsem4(double qnan, double qnbn, double qncn, double qndn, double qnen,double qnaf, double qnbf, double qncf, double qndf, double qnef, double finalfeed, double memf, int subidl) {
        boolean b = false;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement("update feedsem4 set qn1=?,qn2=?,qn3=?,qn4=?,qn5=?,qn1n=?,qn2n=?,qn3n=?,qn4n=?,qn5n=?,mem=?,finalfeed=?  where subid=?");
            pstmt.setDouble(1, qnan);
            pstmt.setDouble(2, qnbn);
            pstmt.setDouble(3, qncn);
            pstmt.setDouble(4, qndn);
            pstmt.setDouble(5, qnen);
            pstmt.setDouble(6, qnaf);
            pstmt.setDouble(7, qnbf);
            pstmt.setDouble(8, qncf);
            pstmt.setDouble(9, qndf);
            pstmt.setDouble(10, qnef);
            pstmt.setDouble(11, memf);
            pstmt.setDouble(12, finalfeed);
            pstmt.setInt(13, subidl);
            int k = pstmt.executeUpdate();
            if (k == 1) {
                b = true;
            } else {
                b = false;
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (cp != null) {
                cp.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(FeedSubmissionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }
      public boolean updatesem5(String qna, String qnb, String qnc, String qnd, String qne, String subid, String kval) {
        int qnal = Integer.parseInt(qna);
        int qnbl = Integer.parseInt(qnb);
        int qncl = Integer.parseInt(qnc);
        int qndl = Integer.parseInt(qnd);
        int qnel = Integer.parseInt(qne);
        int subidl = Integer.parseInt(subid);
        int kvalf = Integer.parseInt(kval) - 2;
        double qnad = 0;
        double qnbd = 0;
        double qncd = 0;
        double qndd = 0;
        double qned = 0;
        double finalfeed = 0;
        int memd = 0;
        int memf = 0;
        double qnaf = 0;
        double qnbf = 0;
        double qncf = 0;
        double qndf = 0;
        double qnef = 0;
        double qnan = 0;
        double qnbn = 0;
        double qncn = 0;
        double qndn = 0;
        double qnen = 0;
        boolean b = false;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement("select * from feedsem5 where subid=?");
            pstmt.setInt(1, subidl);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                qnad = rs.getFloat("qn1");
                qnbd = rs.getFloat("qn2");
                qncd = rs.getFloat("qn3");
                qndd = rs.getFloat("qn4");
                qned = rs.getFloat("qn5");
                memd = rs.getInt("mem");
            }
            memf = memd + 1;
            qnan = (qnal + qnad);
            qnbn = (qnbl + qnbd);
            qncn = (qncl + qncd);
            qndn = (qndl + qndd);
            qnen = (qnel + qned);
            qnaf = (qnan) / memf;
            qnbf = (qnbn) / memf;
            qncf = (qncn) / memf;
            qndf = (qndn) / memf;
            qnef = (qnen) / memf;
            double n = qnaf + qnbf + qncf + qndf + qnef;
            finalfeed = n / kvalf;
            boolean bb = updatefinalsem5(qnan, qnbn, qncn, qndn, qnen,qnaf, qnbf, qncf, qndf, qnef, finalfeed, memf, subidl);
            if (bb) {
                b = true;
            } else {
                b = false;
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (cp != null) {
                cp.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(FeedSubmissionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }

    private boolean updatefinalsem5(double qnan, double qnbn, double qncn, double qndn, double qnen,double qnaf, double qnbf, double qncf, double qndf, double qnef, double finalfeed, double memf, int subidl) {
        boolean b = false;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement("update feedsem5 set qn1=?,qn2=?,qn3=?,qn4=?,qn5=?,qn1n=?,qn2n=?,qn3n=?,qn4n=?,qn5n=?,mem=?,finalfeed=?  where subid=?");
            pstmt.setDouble(1, qnan);
            pstmt.setDouble(2, qnbn);
            pstmt.setDouble(3, qncn);
            pstmt.setDouble(4, qndn);
            pstmt.setDouble(5, qnen);
            pstmt.setDouble(6, qnaf);
            pstmt.setDouble(7, qnbf);
            pstmt.setDouble(8, qncf);
            pstmt.setDouble(9, qndf);
            pstmt.setDouble(10, qnef);
            pstmt.setDouble(11, memf);
            pstmt.setDouble(12, finalfeed);
            pstmt.setInt(13, subidl);
            int k = pstmt.executeUpdate();
            if (k == 1) {
                b = true;
            } else {
                b = false;
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (cp != null) {
                cp.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(FeedSubmissionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }
       public boolean updatesem6(String qna, String qnb, String qnc, String qnd, String qne, String subid, String kval) {
        int qnal = Integer.parseInt(qna);
        int qnbl = Integer.parseInt(qnb);
        int qncl = Integer.parseInt(qnc);
        int qndl = Integer.parseInt(qnd);
        int qnel = Integer.parseInt(qne);
        int subidl = Integer.parseInt(subid);
        int kvalf = Integer.parseInt(kval) - 2;
        double qnad = 0;
        double qnbd = 0;
        double qncd = 0;
        double qndd = 0;
        double qned = 0;
        double finalfeed = 0;
        int memd = 0;
        int memf = 0;
        double qnaf = 0;
        double qnbf = 0;
        double qncf = 0;
        double qndf = 0;
        double qnef = 0;
        double qnan = 0;
        double qnbn = 0;
        double qncn = 0;
        double qndn = 0;
        double qnen = 0;
        boolean b = false;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement("select * from feedsem6 where subid=?");
            pstmt.setInt(1, subidl);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                qnad = rs.getFloat("qn1");
                qnbd = rs.getFloat("qn2");
                qncd = rs.getFloat("qn3");
                qndd = rs.getFloat("qn4");
                qned = rs.getFloat("qn5");
                memd = rs.getInt("mem");
            }
            memf = memd + 1;
            qnan = (qnal + qnad);
            qnbn = (qnbl + qnbd);
            qncn = (qncl + qncd);
            qndn = (qndl + qndd);
            qnen = (qnel + qned);
            qnaf = (qnan) / memf;
            qnbf = (qnbn) / memf;
            qncf = (qncn) / memf;
            qndf = (qndn) / memf;
            qnef = (qnen) / memf;
            double n = qnaf + qnbf + qncf + qndf + qnef;
            finalfeed = n / kvalf;
            boolean bb = updatefinalsem6(qnan, qnbn, qncn, qndn, qnen,qnaf, qnbf, qncf, qndf, qnef, finalfeed, memf, subidl);
            if (bb) {
                b = true;
            } else {
                b = false;
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (cp != null) {
                cp.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(FeedSubmissionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }

    private boolean updatefinalsem6(double qnan, double qnbn, double qncn, double qndn, double qnen,double qnaf, double qnbf, double qncf, double qndf, double qnef, double finalfeed, double memf, int subidl) {
        boolean b = false;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement("update feedsem6 set qn1=?,qn2=?,qn3=?,qn4=?,qn5=?,qn1n=?,qn2n=?,qn3n=?,qn4n=?,qn5n=?,mem=?,finalfeed=?  where subid=?");
            pstmt.setDouble(1, qnan);
            pstmt.setDouble(2, qnbn);
            pstmt.setDouble(3, qncn);
            pstmt.setDouble(4, qndn);
            pstmt.setDouble(5, qnen);
            pstmt.setDouble(6, qnaf);
            pstmt.setDouble(7, qnbf);
            pstmt.setDouble(8, qncf);
            pstmt.setDouble(9, qndf);
            pstmt.setDouble(10, qnef);
            pstmt.setDouble(11, memf);
            pstmt.setDouble(12, finalfeed);
            pstmt.setInt(13, subidl);
            int k = pstmt.executeUpdate();
            if (k == 1) {
                b = true;
            } else {
                b = false;
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (cp != null) {
                cp.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(FeedSubmissionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }
      public boolean updatesem7(String qna, String qnb, String qnc, String qnd, String qne, String subid, String kval) {
        int qnal = Integer.parseInt(qna);
        int qnbl = Integer.parseInt(qnb);
        int qncl = Integer.parseInt(qnc);
        int qndl = Integer.parseInt(qnd);
        int qnel = Integer.parseInt(qne);
        int subidl = Integer.parseInt(subid);
        int kvalf = Integer.parseInt(kval) - 2;
        double qnad = 0;
        double qnbd = 0;
        double qncd = 0;
        double qndd = 0;
        double qned = 0;
        double finalfeed = 0;
        int memd = 0;
        int memf = 0;
        double qnaf = 0;
        double qnbf = 0;
        double qncf = 0;
        double qndf = 0;
        double qnef = 0;
        double qnan = 0;
        double qnbn = 0;
        double qncn = 0;
        double qndn = 0;
        double qnen = 0;
        boolean b = false;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement("select * from feedsem7 where subid=?");
            pstmt.setInt(1, subidl);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                qnad = rs.getFloat("qn1");
                qnbd = rs.getFloat("qn2");
                qncd = rs.getFloat("qn3");
                qndd = rs.getFloat("qn4");
                qned = rs.getFloat("qn5");
                memd = rs.getInt("mem");
            }
            memf = memd + 1;
            qnan = (qnal + qnad);
            qnbn = (qnbl + qnbd);
            qncn = (qncl + qncd);
            qndn = (qndl + qndd);
            qnen = (qnel + qned);
            qnaf = (qnan) / memf;
            qnbf = (qnbn) / memf;
            qncf = (qncn) / memf;
            qndf = (qndn) / memf;
            qnef = (qnen) / memf;
            double n = qnaf + qnbf + qncf + qndf + qnef;
            finalfeed = n / kvalf;
            boolean bb = updatefinalsem7(qnan, qnbn, qncn, qndn, qnen,qnaf, qnbf, qncf, qndf, qnef, finalfeed, memf, subidl);
            if (bb) {
                b = true;
            } else {
                b = false;
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (cp != null) {
                cp.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(FeedSubmissionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }

    private boolean updatefinalsem7(double qnan, double qnbn, double qncn, double qndn, double qnen,double qnaf, double qnbf, double qncf, double qndf, double qnef, double finalfeed, double memf, int subidl) {
        boolean b = false;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement("update feedsem7 set qn1=?,qn2=?,qn3=?,qn4=?,qn5=?,qn1n=?,qn2n=?,qn3n=?,qn4n=?,qn5n=?,mem=?,finalfeed=?  where subid=?");
            pstmt.setDouble(1, qnan);
            pstmt.setDouble(2, qnbn);
            pstmt.setDouble(3, qncn);
            pstmt.setDouble(4, qndn);
            pstmt.setDouble(5, qnen);
            pstmt.setDouble(6, qnaf);
            pstmt.setDouble(7, qnbf);
            pstmt.setDouble(8, qncf);
            pstmt.setDouble(9, qndf);
            pstmt.setDouble(10, qnef);
            pstmt.setDouble(11, memf);
            pstmt.setDouble(12, finalfeed);
            pstmt.setInt(13, subidl);
            int k = pstmt.executeUpdate();
            if (k == 1) {
                b = true;
            } else {
                b = false;
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (cp != null) {
                cp.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(FeedSubmissionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }
    public boolean updatesem8(String qna, String qnb, String qnc, String qnd, String qne, String subid, String kval) {
        int qnal = Integer.parseInt(qna);
        int qnbl = Integer.parseInt(qnb);
        int qncl = Integer.parseInt(qnc);
        int qndl = Integer.parseInt(qnd);
        int qnel = Integer.parseInt(qne);
        int subidl = Integer.parseInt(subid);
        int kvalf = Integer.parseInt(kval) + 1;
        double qnad = 0;
        double qnbd = 0;
        double qncd = 0;
        double qndd = 0;
        double qned = 0;
        double finalfeed = 0;
        int memd = 0;
        int memf = 0;
        double qnaf = 0;
        double qnbf = 0;
        double qncf = 0;
        double qndf = 0;
        double qnef = 0;
        double qnan = 0;
        double qnbn = 0;
        double qncn = 0;
        double qndn = 0;
        double qnen = 0;
        boolean b = false;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement("select * from feedsem8 where subid=?");
            pstmt.setInt(1, subidl);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                qnad = rs.getFloat("qn1");
                qnbd = rs.getFloat("qn2");
                qncd = rs.getFloat("qn3");
                qndd = rs.getFloat("qn4");
                qned = rs.getFloat("qn5");
                memd = rs.getInt("mem");
            }
            memf = memd + 1;
            qnan = (qnal + qnad);
            qnbn = (qnbl + qnbd);
            qncn = (qncl + qncd);
            qndn = (qndl + qndd);
            qnen = (qnel + qned);
            qnaf = (qnan) / memf;
            qnbf = (qnbn) / memf;
            qncf = (qncn) / memf;
            qndf = (qndn) / memf;
            qnef = (qnen) / memf;
            double n = qnaf + qnbf + qncf + qndf + qnef;
            finalfeed = n / kvalf;
            boolean bb = updatefinalsem8(qnan, qnbn, qncn, qndn, qnen, qnaf, qnbf, qncf, qndf, qnef, finalfeed, memf, subidl);
            if (bb) {
                b = true;
            } else {
                b = false;
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (cp != null) {
                cp.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(FeedSubmissionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }

    private boolean updatefinalsem8(double qnan, double qnbn, double qncn, double qndn, double qnen, double qnaf, double qnbf, double qncf, double qndf, double qnef, double finalfeed, double memf, int subidl) {
        boolean b = false;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement("update feedsem8 set qn1=?,qn2=?,qn3=?,qn4=?,qn5=?,qn1n=?,qn2n=?,qn3n=?,qn4n=?,qn5n=?,mem=?,finalfeed=?  where subid=?");
            pstmt.setDouble(1, qnan);
            pstmt.setDouble(2, qnbn);
            pstmt.setDouble(3, qncn);
            pstmt.setDouble(4, qndn);
            pstmt.setDouble(5, qnen);
            pstmt.setDouble(6, qnaf);
            pstmt.setDouble(7, qnbf);
            pstmt.setDouble(8, qncf);
            pstmt.setDouble(9, qndf);
            pstmt.setDouble(10, qnef);
            pstmt.setDouble(11, memf);
            pstmt.setDouble(12, finalfeed);
            pstmt.setInt(13, subidl);
            int k = pstmt.executeUpdate();
            if (k == 1) {
                b = true;
            } else {
                b = false;
            }
            if (pstmt != null) {
                pstmt.close();
            }
            if (cp != null) {
                cp.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(FeedSubmissionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return b;
    }

}
