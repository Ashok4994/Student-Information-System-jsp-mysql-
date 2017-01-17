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
public class Gradesdao {

    public ArrayList studentUtils() {
        ArrayList list = new ArrayList();
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        String a = "5";
        String b = "4";
        String c = "3";
        String d = "2";
        String e = "0";
        float a1 = (float) 4.00;
        float a2 = (float) 3.67;
        float a3 = (float) 3.33;
        float a4 = (float) 3.00;
        float a5 = (float) 2.67;
        float a6 = (float) 2.33;
        float a7 = (float) 2.00;
        float a8 = (float) 1.67;
        float a9 = (float) 1.33;
        float a10 = (float) 1.00;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement("select * from eighth");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                int nbl = 0;
                String sid=rs.getString("sid");
                HashMap mp = new HashMap();
                mp.put("sid",sid );
                mp.put("sname", rs.getString("sname"));
                mp.put("section", rs.getString("section"));
                String cna = rs.getString("acn");
                if (Integer.parseInt(cna) > 90) {
                    cna = a;
                } else if (Integer.parseInt(cna) > 85 && Integer.parseInt(cna) <= 90) {
                    cna = b;
                } else if (Integer.parseInt(cna) > 80 && Integer.parseInt(cna) <= 85) {
                    cna = c;
                } else if (Integer.parseInt(cna) > 75 && Integer.parseInt(cna) <= 80) {
                    cna = d;
                } else {
                    cna = e;
                }
                String cda = rs.getString("acd");
                if (Integer.parseInt(cda) > 90) {
                    cda = a;
                } else if (Integer.parseInt(cda) > 85 && Integer.parseInt(cda) <= 90) {
                    cda = b;
                } else if (Integer.parseInt(cda) > 80 && Integer.parseInt(cda) <= 85) {
                    cda = c;
                } else if (Integer.parseInt(cda) > 75 && Integer.parseInt(cda) <= 80) {
                    cda = d;
                } else {
                    cda = e;
                }
                String wta = rs.getString("awt");
                if (Integer.parseInt(wta) > 90) {
                    wta = a;
                } else if (Integer.parseInt(wta) > 85 && Integer.parseInt(wta) <= 90) {
                    wta = b;
                } else if (Integer.parseInt(wta) > 80 && Integer.parseInt(wta) <= 85) {
                    wta = c;
                } else if (Integer.parseInt(wta) > 75 && Integer.parseInt(wta) <= 80) {
                    wta = d;
                } else {
                    wta = e;
                }
                String lia = rs.getString("ali");
                if (Integer.parseInt(lia) > 90) {
                    lia = a;
                } else if (Integer.parseInt(lia) > 85 && Integer.parseInt(lia) <= 90) {
                    lia = b;
                } else if (Integer.parseInt(lia) > 80 && Integer.parseInt(lia) <= 85) {
                    lia = c;
                } else if (Integer.parseInt(lia) > 75 && Integer.parseInt(lia) <= 80) {
                    lia = d;
                } else {
                    lia = e;
                }
                String cga = rs.getString("acg");
                if (Integer.parseInt(cga) > 90) {
                    cga = a;
                } else if (Integer.parseInt(cga) > 85 && Integer.parseInt(cga) <= 90) {
                    cga = b;
                } else if (Integer.parseInt(cga) > 80 && Integer.parseInt(cga) <= 85) {
                    cga = c;
                } else if (Integer.parseInt(cga) > 75 && Integer.parseInt(cga) <= 80) {
                    cga = d;
                } else {
                    cga = e;
                }
                String cnm = rs.getString("mcn");
                String cdm = rs.getString("mcd");
                String wtm = rs.getString("mwt");
                String lim = rs.getString("mli");
                String cgm = rs.getString("mcg");
              
                String cns = rs.getString("scn");
                String cds = rs.getString("scd");
                String wts = rs.getString("swt");
                String lis = rs.getString("sli");
                String cgs = rs.getString("scg");
               
                float cng = Integer.parseInt(cna) + Integer.parseInt(cnm) + Integer.parseInt(cns);
                if (cng >= 90) {
                    cng = (float) 4.00;
                } else if (cng >= 85 && cng < 90) {
                    cng = (float) 3.67;
                } else if (cng >= 80 && cng < 85) {
                    cng = (float) 3.33;
                } else if (cng >= 75 && cng < 80) {
                    cng = (float) 3.00;
                } else if (cng >= 70 && cng < 75) {
                    cng = (float) 2.67;
                } else if (cng >= 65 && cng < 70) {
                    cng = (float) 2.33;
                } else if (cng >= 60 && cng < 65) {
                    cng = (float) 2.00;
                } else if (cng >= 55 && cng < 60) {
                    cng = (float) 1.67;
                } else if (cng >= 50 && cng < 55) {
                    cng = (float) 1.33;
                } else if (cng >= 40 && cng < 50) {
                    cng = (float) 1.00;
                } else {
                    cng = 0;
                }
                String cnl;
                if (cng == a1) {
                    cnl = "S";
                } else if (cng == a2) {
                    cnl = "A+";
                } else if (cng == a3) {
                    cnl = "A";
                } else if (cng == a4) {
                    cnl = "B+";
                } else if (cng == a5) {
                    cnl = "B";
                } else if (cng == a6) {
                    cnl = "C+";
                } else if (cng == a7) {
                    cnl = "C";
                } else if (cng == a8) {
                    cnl = "D+";
                } else if (cng == a9) {
                    cnl = "D";
                } else if (cng == a10) {
                    cnl = "E";
                } else {
                    cnl = "F";
                    nbl++;
                }
                mp.put("scn", cnl);
                float cdg = Integer.parseInt(cda) + Integer.parseInt(cdm) + Integer.parseInt(cds);
                if (cdg >= 90) {
                    cdg = (float) 4.00;
                } else if (cdg >= 85 && cdg < 90) {
                    cdg = (float) 3.67;
                } else if (cdg >= 80 && cdg < 85) {
                    cdg = (float) 3.33;
                } else if (cdg >= 75 && cdg < 80) {
                    cdg = (float) 3.00;
                } else if (cdg >= 70 && cdg < 75) {
                    cdg = (float) 2.67;
                } else if (cdg >= 65 && cdg < 70) {
                    cdg = (float) 2.33;
                } else if (cdg >= 60 && cdg < 65) {
                    cdg = (float) 2.00;
                } else if (cdg >= 55 && cdg < 60) {
                    cdg = (float) 1.67;
                } else if (cdg >= 50 && cdg < 55) {
                    cdg = (float) 1.33;
                } else if (cdg >= 40 && cdg < 50) {
                    cdg = (float) 1.00;
                } else {
                    cdg = 0;
                }
                String cdl;
                if (cdg == a1) {
                    cdl = "S";
                } else if (cdg == a2) {
                    cdl = "A+";
                } else if (cdg == a3) {
                    cdl = "A";
                } else if (cdg == a4) {
                    cdl = "B+";
                } else if (cdg == a5) {
                    cdl = "B";
                } else if (cdg == a6) {
                    cdl = "C+";
                } else if (cdg == a7) {
                    cdl = "C";
                } else if (cdg == a8) {
                    cdl = "D+";
                } else if (cdg == a9) {
                    cdl = "D";
                } else if (cdg == a10) {
                    cdl = "E";
                } else {
                    cdl = "F";
                    nbl++;
                }
                mp.put("scd", cdl);
                float wtg = Integer.parseInt(wta) + Integer.parseInt(wtm) + Integer.parseInt(wts);
                if (wtg >= 90) {
                    wtg = (float) 4.00;
                } else if (wtg >= 85 && wtg < 90) {
                    wtg = (float) 3.67;
                } else if (wtg >= 80 && wtg < 85) {
                    wtg = (float) 3.33;
                } else if (wtg >= 75 && wtg < 80) {
                    wtg = (float) 3.00;
                } else if (wtg >= 70 && wtg < 75) {
                    wtg = (float) 2.67;
                } else if (wtg >= 65 && wtg < 70) {
                    wtg = (float) 2.33;
                } else if (wtg >= 60 && wtg < 65) {
                    wtg = (float) 2.00;
                } else if (wtg >= 55 && wtg < 60) {
                    wtg = (float) 1.67;
                } else if (wtg >= 50 && wtg < 55) {
                    wtg = (float) 1.33;
                } else if (wtg >= 40 && wtg < 50) {
                    wtg = (float) 1.00;
                } else {
                    wtg = 0;
                }
                String wtl;
                if (wtg == a1) {
                    wtl = "S";
                } else if (wtg == a2) {
                    wtl = "A+";
                } else if (wtg == a3) {
                    wtl = "A";
                } else if (wtg == a4) {
                    wtl = "B+";
                } else if (wtg == a5) {
                    wtl = "B";
                } else if (wtg == a6) {
                    wtl = "C+";
                } else if (wtg == a7) {
                    wtl = "C";
                } else if (wtg == a8) {
                    wtl = "D+";
                } else if (wtg == a9) {
                    wtl = "D";
                } else if (wtg == a10) {
                    wtl = "E";
                } else {
                    wtl = "F";
                    nbl++;
                }
                mp.put("swt", wtl);
                float lig = Integer.parseInt(lia) + Integer.parseInt(lim) + Integer.parseInt(lis);
                if (lig >= 90) {
                    lig = (float) 4.00;
                } else if (lig >= 85 && lig < 90) {
                    lig = (float) 3.67;
                } else if (lig >= 80 && lig < 85) {
                    lig = (float) 3.33;
                } else if (lig >= 75 && lig < 80) {
                    lig = (float) 3.00;
                } else if (lig >= 70 && lig < 75) {
                    lig = (float) 2.67;
                } else if (lig >= 65 && lig < 70) {
                    lig = (float) 2.33;
                } else if (lig >= 60 && lig < 65) {
                    lig = (float) 2.00;
                } else if (lig >= 55 && lig < 60) {
                    lig = (float) 1.67;
                } else if (lig >= 50 && lig < 55) {
                    lig = (float) 1.33;
                } else if (lig >= 40 && lig < 50) {
                    lig = (float) 1.00;
                } else {
                    lig = 0;
                }
                String lil;
                if (lig == a1) {
                    lil = "S";
                } else if (lig == a2) {
                    lil = "A+";
                } else if (lig == a3) {
                    lil = "A";
                } else if (lig == a4) {
                    lil = "B+";
                } else if (lig == a5) {
                    lil = "B";
                } else if (lig == a6) {
                    lil = "C+";
                } else if (lig == a7) {
                    lil = "C";
                } else if (lig == a8) {
                    lil = "D+";
                } else if (lig == a9) {
                    lil = "D";
                } else if (lig == a10) {
                    lil = "E";
                } else {
                    lil = "F";
                    nbl++;
                }
                mp.put("sli", lil);
                float cgg = Integer.parseInt(cga) + Integer.parseInt(cgm) + Integer.parseInt(cgs);
                if (cgg >= 90) {
                    cgg = (float) 4.00;
                } else if (cgg >= 85 && cgg < 90) {
                    cgg = (float) 3.67;
                } else if (cgg >= 80 && cgg < 85) {
                    cgg = (float) 3.33;
                } else if (cgg >= 75 && cgg < 80) {
                    cgg = (float) 3.00;
                } else if (cgg >= 70 && cgg < 75) {
                    cgg = (float) 2.67;
                } else if (cgg >= 65 && cgg < 70) {
                    cgg = (float) 2.33;
                } else if (cgg >= 60 && cgg < 65) {
                    cgg = (float) 2.00;
                } else if (cgg >= 55 && cgg < 60) {
                    cgg = (float) 1.67;
                } else if (cgg >= 50 && cgg < 55) {
                    cgg = (float) 1.33;
                } else if (cgg >= 40 && cgg < 50) {
                    cgg = (float) 1.00;
                } else {
                    cgg = 0;
                }
                String cgl;
                if (cgg == a1) {
                    cgl = "S";
                } else if (cgg == a2) {
                    cgl = "A+";
                } else if (cgg == a3) {
                    cgl = "A";
                } else if (cgg == a4) {
                    cgl = "B+";
                } else if (cgg == a5) {
                    cgl = "B";
                } else if (cgg == a6) {
                    cgl = "C+";
                } else if (cgg == a7) {
                    cgl = "C";
                } else if (cgg == a8) {
                    cgl = "D+";
                } else if (cgg == a9) {
                    cgl = "D";
                } else if (cgg == a10) {
                    cgl = "E";
                } else {
                    cgl = "F";
                    nbl++;
                }
                mp.put("scg", cgl);
                mp.put("nbl", nbl);
                // System.out.println("cng"+cng);
                float sgpa = calsgpa(cng, cdg, wtg, lig, cgg,sid);

                mp.put("sgpa", sgpa);
                 String Cgpa = rs.getString("Cgpa");
                mp.put("cgpa", Cgpa);
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

    public float calsgpa(float cng, float cdg, float wtg, float lig, float cgg, String sid) {
        String name = null;

        float c = 0;
        float u, l, sgpa = 0;
        float cnui = 0;
        float cdui = 0;
        float wtui = 0;
        float liui = 0;
        float cgui = 0;
       
        float cnli = 0;
        float cdli = 0;
        float wtli = 0;
        float lili = 0;
        float cgli = 0;
       
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        PreparedStatement pstmt = null;
        try {
            pstmt = cp.prepareStatement("SELECT subname,credits FROM adminlog where reg=11 and sem=8;");
            ResultSet rs = pstmt.executeQuery();
            while (rs.next()) {
                name = rs.getString("subname");
                //System.out.println("subnema="+name);
                c = rs.getInt(2);
                //System.out.println("c="+c);
                if ("im".equals(name)) {

                    cnli = c;
                    //System.out.println("cnli="+cnli);
                    cnui = cng * cnli;
                    //System.out.println("cnui="+cnui);
                } else if ("hci".equals(name)) {
                    cdli = c;
                    cdui = cdg * cdli;
                } else if ("cc".equals(name)) {
                    wtli = c;
                    wtui = wtg * wtli;
                } else if ("cmpviva2".equals(name)) {
                    lili = c;
                    liui = lig * lili;
                } else if ("prjectwrk".equals(name)) {
                    cgli = c;
                    cgui = cgg * cgli;
                } 
            }
            u = cnui + cdui + wtui + liui + cgui  ;
            l = cnli + cdli + wtli + lili + cgli   ;
            sgpa = (u) / (l);
            int z=updatelu(u,l,sid);
           
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

        return sgpa;
    }
     public int updatelu(float u,float l, String sid) {
        int j = 0;
        float tous = u;
        float lous = l;
        float touf = 0;
        float louf = 0;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt3, pstmt1, pstmt2;
        try {
            pstmt3 = cp.prepareStatement("update eighth set Tou=?,Lou=? where sid=?");
            pstmt3.setFloat(1, u);
            pstmt3.setFloat(2, l);
            pstmt3.setString(3, sid);
            j = pstmt3.executeUpdate();
            pstmt1 = cp.prepareStatement("SELECT Touc,Louc FROM seventh where sid=?");
            pstmt1.setString(1, sid);
            ResultSet rs = pstmt1.executeQuery();
            while (rs.next()) {
                touf = rs.getFloat("Touc");
                louf = rs.getFloat("Louc");
            }
            touf = touf + tous;

            louf = lous + louf;
            float cgpa = (touf) / (louf);
            pstmt2 = cp.prepareStatement(" update eighth set Touc=?,Louc=?,Cgpa=? where sid=? ");
            pstmt2.setFloat(1, touf);
            pstmt2.setFloat(2, louf);
            pstmt2.setFloat(3, cgpa);
            pstmt2.setString(4, sid);
            j = pstmt2.executeUpdate();
            if (pstmt3 != null) {
                pstmt3.close();
            }
            if (pstmt2 != null) {
                pstmt2.close();
            }
            if (pstmt1 != null) {
                pstmt1.close();
            }
            if (cp != null) {
                cp.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(StdmarksEntryAction.class.getName()).log(Level.SEVERE, null, ex);
        }
        return j;
    }

    public int updategMarks(String scn, String scd, String swt, String sli, String scg,  String sgpa, String nbl, String sid) {
        int j = 0;
        Databaseconn db = new Databaseconn();
        Connection cp = db.getConnection();
        db = null;
        PreparedStatement pstmt;
        try {
            pstmt = cp.prepareStatement(" update eighth set gcn=?,gcd=?,gwt=?,gli=?,gcg=?, sgpa=?, Nbl=? where sid=? ");
            pstmt.setString(1, scn);
            pstmt.setString(2, scd);
            pstmt.setString(3, swt);
            pstmt.setString(4, sli);
            pstmt.setString(5, scg);
           
          
            pstmt.setString(6, sgpa);
            pstmt.setString(7, nbl);
            pstmt.setString(8, sid);

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
}
