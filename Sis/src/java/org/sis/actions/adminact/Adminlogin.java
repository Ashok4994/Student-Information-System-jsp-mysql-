/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sis.actions.adminact;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.sis.dao.admindao.AdminloginDao;

/**
 *
 * @author PEDDI'S
 */
public class Adminlogin extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private String SUCCESS = "success";

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
        String usern = null;
        String psswd = null;
        usern = request.getParameter("uname");
        psswd = request.getParameter("pwd");
        if ((usern == null) || (psswd == null)) {
            String error = "Please Enter Correct Username & Password!Check Database";
            request.setAttribute("err", error);
            SUCCESS = "failure";
        } else if ((usern.equals("adminlbce")) && (usern != null) && (psswd != null)) {
            AdminloginDao sl = new AdminloginDao();
            Boolean isBoolean = sl.verifyadmin(usern, psswd);
            HttpSession session = request.getSession(true);
            if (isBoolean) {
                session.setAttribute("username", usern);
                session.setAttribute("alog", "alog");
                SUCCESS = "success";

            } else {
                String error = "Please Enter Correct Username & Password!Check Database";
                request.setAttribute("err", error);
                SUCCESS = "failure";
            }
        } else {
            String error = "Please Enter Correct Username & Password!Check Database";
            request.setAttribute("err", error);
            SUCCESS = "failure";
        }
        return mapping.findForward(SUCCESS);
    }
}
