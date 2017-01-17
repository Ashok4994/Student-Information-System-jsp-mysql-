/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sis.dao;

import org.sis.dto.DloginDto;
import java.sql.*;
import org.database.Databaseconn;

/**
 *
 * @author PEDDI'S
 */
public class DloginDao {

    public boolean verifydetails(DloginDto ddto) {
        boolean isBoolean = true;

        try {
            Databaseconn db = new Databaseconn();
            Connection con = db.getConnection();
            String query = "select * from flogin";
            // System.out.println("query:" + query);
            if (ddto.uname != null && !ddto.uname.equals("")) {
                query = query + " where uname = ? and pwd=? ";
            }
           System.out.println("sdfsdfdsfdsfdsf"+ddto.getUname());
            PreparedStatement pstmt = con.prepareStatement(query);
            if (ddto.pwd != null && !ddto.pwd.equals("")) {
                pstmt.setString(1, ddto.getUname());
                pstmt.setString(2, ddto.getPwd());
            } 
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                ddto.setDuname(rs.getString(1));
                ddto.setDpwd(rs.getString(2));
            }

        } catch (SQLException e) {

        }

        if (ddto.getDuname() == null && ddto.getDpwd() == null) {
            isBoolean = false;
        }
        return isBoolean;
    }

}
