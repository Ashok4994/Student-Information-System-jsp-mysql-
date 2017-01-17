/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sis.actions;

import java.sql.Connection;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.sis.dao.StdmarksEntryAction;

/**
 *
 * @author PEDDI'S
 */
public class StudentDataEntryAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
//        String s = request.getParameter("sdae");
//        int a = s != null ? Integer.parseInt(s) : 0;
//        String sid = null, acn = null, acd = null, acg = null, ape = null, awt = null, ali = null, awtlab = null, alilab = null, acompviva1 = null;
//        if (a > 0) {
//            Connection conn = null;
//            StdmarksEntryAction std = new StdmarksEntryAction();
//            try {
//                for (int i = 1; i < a; i++) {
//                    sid = request.getParameter("sid" + i);
//                    acn = request.getParameter("acn" + i);
//                    acd = request.getParameter("acd" + i);
//                    acg = request.getParameter("acg" + i);
//                    ape = request.getParameter("ape" + i);
//                    awt = request.getParameter("awt" + i);
//                    ali = request.getParameter("ali" + i);
//                    awtlab = request.getParameter("awtlab" + i);
//                    alilab = request.getParameter("alilab" + i);
//                    acompviva1 = request.getParameter("acompviva1" + i);
//                    std.updateAttendance(acn, acd, awt, ali, acg, ape, awtlab, alilab, acompviva1, sid);
//                    sid = null;
//                    acn = null;
//                    acd = null;
//                    acg = null;
//                    ape = null;
//                    awt = null;
//                    ali = null;
//                    awtlab = null;
//                    alilab = null;
//                    acompviva1 = null;
//                }
//            } catch (Exception e) {
//                System.out.println("Exception" + e);
//            } finally {
//                try {
//                    if (conn != null) {
//                        conn.close();
//                        conn = null;
//                    }
//                } catch (Exception ex) {
//                    System.out.println("Eception in final" + ex);
//                }
//            }
//            StdmarksEntryAction sme = new StdmarksEntryAction();
//            ArrayList al = sme.studentUtils();
//            request.setAttribute("list", al);
//        } else {
//            StdmarksEntryAction sme = new StdmarksEntryAction();
//            ArrayList al = sme.studentUtils();
//            request.setAttribute("list", al);
//        }
        String s = request.getParameter("sdae");
        int a = s != null ? Integer.parseInt(s) : 0;
        String sid = null, acn = null, acd = null, acg = null, ape = null, awt = null, ali = null, awtlab = null, alilab = null, acompviva1 = null;
        if (a > 0) {
            
            StdmarksEntryAction sme = new StdmarksEntryAction();
          
            ArrayList al = sme.studentUtils();
            request.setAttribute("list", al);
            
        }
        else
        {
             StdmarksEntryAction sme = new StdmarksEntryAction();
            ArrayList al = sme.studentUtils();
            request.setAttribute("list", al);
        }
            return mapping.findForward(SUCCESS);
        }
    }
