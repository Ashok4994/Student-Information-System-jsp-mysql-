/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sis.actions.feedback;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.sis.dao.feedback.Feedbacklogin;

/**
 *
 * @author PEDDI'S
 */
public class FeedbackLogin extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private  String SUCCESS = "failure";

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
        String usern = request.getParameter("sid");
        String psswd = request.getParameter("pass");
        if ((usern == null) || (psswd == null)) {
            String error = "Please Enter Correct Credentials! or You are already Submited  your feedback";
            request.setAttribute("err", error);
            SUCCESS = "failure";
        } else {
            Feedbacklogin sl = new Feedbacklogin();
            Boolean isBoolean = sl.verify(usern, psswd);
            HttpSession session = request.getSession(true);
            if (isBoolean) {
                session.setAttribute("username", usern);
                session.setAttribute("flog", "flog");
                SUCCESS = "success";
            } else {
                String error = "Please Enter Correct Credentials! or You are already Submited  your feedback";
                request.setAttribute("errf", error);
                SUCCESS = "failure";
            }
        }
        return mapping.findForward(SUCCESS);
    }

}
