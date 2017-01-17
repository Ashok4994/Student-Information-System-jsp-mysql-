/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sis.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.sis.dao.StudentLogin;

/**
 *
 * @author PEDDI'S
 */
public class RegistarLogin extends org.apache.struts.action.Action {

    private String SUCCESS = "success";

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String usern = request.getParameter("uname");
        String psswd = request.getParameter("pwd");
        if ((usern == null) || (psswd == null)) {
            String error = "Please Enter Correct Username & Password";
            request.setAttribute("rerr", error);
            SUCCESS = "failure";
        } else {
            StudentLogin sl = new StudentLogin();
            Boolean isBoolean = sl.verifyregistar(usern, psswd);
            HttpSession session = request.getSession(true);
            if (isBoolean) {
                session.setAttribute("username", usern);
                session.setAttribute("rlog", "rlog");
                SUCCESS = "success";
            } else {
                String error = "Please Enter Correct Username & Password";
                request.setAttribute("rerr", error);
                SUCCESS = "failure";
            }
        }
        return mapping.findForward(SUCCESS);
    }
}
