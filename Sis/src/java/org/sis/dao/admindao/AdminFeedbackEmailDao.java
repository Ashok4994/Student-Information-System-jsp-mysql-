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
import org.sis.dao.StdmarksEntryAction;
import org.sis.dao.feedback.FeedSubmissionDao;

/**
 *
 * @author PEDDI'S
 */
public class AdminFeedbackEmailDao {

    public ArrayList getsemfeed(String query) {
        ArrayList list = new ArrayList();
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement(query);

            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                HashMap mp = new HashMap();
                mp.put("subid", rs.getString("subid"));
                mp.put("subname", rs.getString("subname"));
                mp.put("qn1n", rs.getString("qn1n"));
                mp.put("qn2n", rs.getString("qn2n"));
                mp.put("qn3n", rs.getString("qn3n"));
                mp.put("qn4n", rs.getString("qn4n"));
                mp.put("qn5n", rs.getString("qn5n"));
                mp.put("finalfeed", rs.getString("finalfeed"));
                mp.put("mem", rs.getString("mem"));
                list.add(mp);
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
        return list;
    }

    public String getd(int i) {
        int a = i;
        String mp = null;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement("select * from departmentlist where id=?");
            pstmt.setInt(1, a);
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                mp = rs.getString("mailid");
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
}
