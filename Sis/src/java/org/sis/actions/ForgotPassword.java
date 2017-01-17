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
import org.sis.service.EmailUtility;

/**
 *
 * @author PEDDI'S
 */
public class ForgotPassword extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private String host;
    private String port;
    private String user;
    private String pass;
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
        host = "smtp.gmail.com";
        port = "587";
        user = "lbceemail@gmail.com";
        pass = "lbrcecsemail";
        String err = null;
        String sid = request.getParameter("sid");
        String pwd = request.getParameter("pswd");
        String pswd = pwd.trim();
        StudentChangePassworddao scpd = new StudentChangePassworddao();
        String mail = scpd.getmail(sid);
        int m = scpd.updatep(sid, pswd);
        if (m == 1) {
            String recipient = mail;
            String subject = "Password Changed for LBRCE Student Login";
            String content = "Your New Generated Password:" + pswd;
            try {
                EmailUtility.sendEmail(host, port, user, pass, recipient, subject, content);
                err = "The New Generated Passsword Is Emailed Successfully";
            } catch (Exception ex) {
                err = "There were an error: " + ex.getMessage();
            } finally {
                request.setAttribute("err", err);
            }
        } else {
            err = "Your Request Is Denied";
            request.setAttribute("err", err);
        }
        return mapping.findForward(SUCCESS);
    }
}
