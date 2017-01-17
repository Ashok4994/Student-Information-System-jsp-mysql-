/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sis.actions;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.sis.dao.FacultyEnrollDao;
import org.sis.forms.FeedbackForm;
import org.sis.service.EmailUtility;
import org.sis.service.FeedbackService;

/**
 *
 * @author PEDDI'S
 */
public class FacultyEnrollAction extends DispatchAction {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";
    ArrayList dl = new ArrayList();
     ArrayList al = new ArrayList();

    private String host;
    private String port;
    private String user;
    private String pass;

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
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        FeedbackForm ff = (FeedbackForm) form;
        FeedbackService fs = new FeedbackService();
        dl = fs.getd();
        ff.setDlist(dl);
        ff.setTlist(al);
        return mapping.findForward("success");
    }

    public ActionForward tname(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        FeedbackForm ff = (FeedbackForm) form;
        FeedbackService fs = new FeedbackService();
        int a = ff.getDname();
        al = fs.gett(a);
        ff.setDlist(dl);
        ff.setTlist(al);
        return mapping.findForward("success");
    }

    public ActionForward enroll(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String err;
        host = "smtp.gmail.com";
        port = "587";
        user = "lbceemail@gmail.com";
        pass = "lbrcecsemail";
        boolean b = false;
        boolean bb = false;
        FacultyEnrollDao fed = new FacultyEnrollDao();
        String d = request.getParameter("dname");
        String t = request.getParameter("tname");
        String temail = request.getParameter("temail").trim();
        String pswd = request.getParameter("pswd");
        String subject = "Your new Password For Faculty Login";
        String content = "Your new Password for Faculty Login:" + pswd;
        b = fed.verify(t, temail);
        System.out.println("bbbbb"+b);
        if (b) {
            bb = fed.update(t, temail, pswd);
            if (bb) {
                EmailUtility.sendEmail(host, port, user, pass, temail, subject, content);
                err = "Your Password is Sent to Your Mail Successfully";
                request.setAttribute("err", err);
            } else {
                err = "You Are Already Registered! or Your Registered MailId is Invalid";
                request.setAttribute("err", err);
            }
        } else {
            err = "You Are Already Registered! or Your Registered MailId is Invalid";
            request.setAttribute("err", err);
        }
        return mapping.findForward("success");
    }
}
