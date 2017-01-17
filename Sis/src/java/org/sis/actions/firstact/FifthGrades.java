/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sis.actions.firstact;

import java.sql.Connection;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.sis.dao.firstdao.Gradesdao;

/**
 *
 * @author PEDDI'S
 */
public class FifthGrades extends org.apache.struts.action.Action {

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
        String s = request.getParameter("sdsme");
        System.out.println("s=" + s);
        int a = s != null ? Integer.parseInt(s) : 0;
        String sid = null, scn = null, scd = null, scg = null, spe = null, swt = null, sli = null, sgpa = null, swtlab = null, slilab = null, nbl=null;
        if (a > 0) {
            Connection conn = null;
            Gradesdao grdd = new Gradesdao();
            try {
                for (int i = 1; i < a; i++) {
                    sid = request.getParameter("sid" + i);
                    scn = request.getParameter("scn" + i);
                    scd = request.getParameter("scd" + i);
                    scg = request.getParameter("scg" + i);
                    spe = request.getParameter("spe" + i);
                    swt = request.getParameter("swt" + i);
                    sli = request.getParameter("sli" + i);
                    swtlab = request.getParameter("swtlab" + i);
                    slilab = request.getParameter("slilab" + i);
                   
                    nbl=request.getParameter("nbl" + i);
                    sgpa = request.getParameter("sgpa" + i);
                    grdd.updategMarks(scn, scd, swt, sli, scg, spe, swtlab, slilab, sgpa,nbl, sid);
                    sid = null;
                    scn = null;
                    scd = null;
                    scg = null;
                    spe = null;
                    swt = null;
                    sli = null;
                    sgpa = null;
                    swtlab = null;
                    slilab = null;
                   
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
            Gradesdao grd = new Gradesdao();
            ArrayList al = grd.studentUtils();
            request.setAttribute("list", al);
        } else {
            Gradesdao grd = new Gradesdao();
            ArrayList al = grd.studentUtils();
            request.setAttribute("list", al);
        }
        return mapping.findForward(SUCCESS);
    }
}
