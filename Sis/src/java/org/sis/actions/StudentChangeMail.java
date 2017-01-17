/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sis.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.sis.dao.StudentChangePassworddao;

/**
 *
 * @author PEDDI'S
 */
public class StudentChangeMail extends org.apache.struts.action.Action {

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
           String status = null;
        String idp = request.getParameter("idp");
        String op = request.getParameter("op");
        String np = request.getParameter("np");
        String rnp = request.getParameter("rnp");
        StudentChangePassworddao scp = new StudentChangePassworddao();
        boolean b = scp.verifyop(idp, op);
        if (b && np.equals(rnp)) {
            int bb = scp.updatem(idp, np, rnp);
            if (bb == 1) {
                status = "Your MailId is Updated";
                request.setAttribute("status", status);
            }
        } else {
            status = "Your MailId is Not Updated";
            request.setAttribute("status", status);
        }
        return mapping.findForward(SUCCESS);
    }
}
