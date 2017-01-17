/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sis.actions.seventhact;

import java.sql.Connection;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.sis.dao.seventhdao.StdmarksEntryAction;

/**
 *
 * @author PEDDI'S
 */
public class FifthStudentDataMarksEntryAction extends org.apache.struts.action.Action {

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
        String s = request.getParameter("sdme");
        int a = s != null ? Integer.parseInt(s) : 0;
        String sid = null, mcn = null, mcd = null, mcg = null, mpe = null, mwt = null, mli = null, mwtlab = null, mlilab = null, mcompviva1 = null,mdtp = null;
        if (a > 0) {
            Connection conn = null;
            StdmarksEntryAction std = new StdmarksEntryAction();
            try {
                for (int i = 1; i < a; i++) {
                    sid = request.getParameter("sid" + i);
                    mcn = request.getParameter("mcn" + i);
                    mcd = request.getParameter("mcd" + i);
                    mcg = request.getParameter("mcg" + i);
                    mpe = request.getParameter("mpe" + i);
                    mwt = request.getParameter("mwt" + i);
                    mli = request.getParameter("mli" + i);
                    mwtlab = request.getParameter("mwtlab" + i);
                    mlilab = request.getParameter("mlilab" + i);
                    mcompviva1 = request.getParameter("mcompviva1" + i);
                     mdtp = request.getParameter("mdtp" + i);
                    std.updateMarks(mcn, mcd, mwt, mli, mcg, mpe, mwtlab, mlilab, mcompviva1,mdtp, sid);
                    sid = null;
                    mcn = null;
                    mcd = null;
                    mcg = null;
                    mpe = null;
                    mwt = null;
                    mli = null;
                    mwtlab = null;
                    mlilab = null;
                    mcompviva1 = null;
                }
            } catch (Exception e) {
                System.out.println("Exception" + e);
            } finally {
                try {
                    if (conn != null) {
                        conn.close();
                        conn = null;
                    }
                } catch (Exception ex) {
                    System.out.println("Eception in final" + ex);
                }
            }
            StdmarksEntryAction sme = new StdmarksEntryAction();
            ArrayList al = sme.studentUtils();
            System.out.println(al);
            request.setAttribute("list", al);
        } else {
            StdmarksEntryAction sme = new StdmarksEntryAction();
            ArrayList al = sme.studentUtils();
            System.out.println(al);
            request.setAttribute("list", al);
        }

        return mapping.findForward(SUCCESS);
    }
}
