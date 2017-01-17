/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sis.actions.feedback;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.sis.dao.feedback.Feedbacklogin;

/**
 *
 * @author PEDDI'S
 */
public class FeedbackSem extends org.apache.struts.action.Action {

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
        String dname = request.getParameter("dname");
        if (dname == null) {
            String depart = "Other Departments Will Be Updated Later!";
            request.setAttribute("depart", depart);
            SUCCESS = "failure";
        } else if (dname.equals("1")) {
            String sid = request.getParameter("sid");
            if (sid == null) {
                SUCCESS = "failure";
            } else {
                String b = sid.substring(6, 8);
                if (b.equals("05")) {
                    String sem = request.getParameter("sname");
                    if (sem.equals("1")) {
                        Feedbacklogin fbl = new Feedbacklogin();
                        ArrayList list = fbl.sem1();
                        request.setAttribute("list", list);
                        String s = "1";
                        request.setAttribute("sem", s);
                    } else if (sem.equals("2")) {
                        Feedbacklogin fbl = new Feedbacklogin();
                        ArrayList list = fbl.sem2();
                        request.setAttribute("list", list);
                        String s = "2";
                        request.setAttribute("sem", s);
                    } else if (sem.equals("3")) {
                        Feedbacklogin fbl = new Feedbacklogin();
                        ArrayList list = fbl.sem3();
                        request.setAttribute("list", list);
                        String s = "3";
                        request.setAttribute("sem", s);
                    } else if (sem.equals("4")) {
                        Feedbacklogin fbl = new Feedbacklogin();
                        ArrayList list = fbl.sem4();
                        request.setAttribute("list", list);
                        String s = "4";
                        request.setAttribute("sem", s);
                    } else if (sem.equals("5")) {
                        Feedbacklogin fbl = new Feedbacklogin();
                        ArrayList list = fbl.sem5();
                        request.setAttribute("list", list);
                        String s = "5";
                        request.setAttribute("sem", s);
                    } else if (sem.equals("6")) {
                        Feedbacklogin fbl = new Feedbacklogin();
                        ArrayList list = fbl.sem6();
                        request.setAttribute("list", list);
                        String s = "6";
                        request.setAttribute("sem", s);
                    } else if (sem.equals("7")) {
                        Feedbacklogin fbl = new Feedbacklogin();
                        ArrayList list = fbl.sem7();
                        request.setAttribute("list", list);
                        String s = "7";
                        request.setAttribute("sem", s);
                    } else if (sem.equals("8")) {
                        Feedbacklogin fbl = new Feedbacklogin();
                        ArrayList list = fbl.sem8();
                        request.setAttribute("list", list);
                        String s = "8";
                        request.setAttribute("sem", s);
                    } else {
                        String errf = "Some thing went wrong!Try Later";
                        request.setAttribute("errf", errf);
                    }
                }
            }
        } else {
            String depart = "Other Departments Will Be Updated Later!";
            request.setAttribute("depart", depart);
            SUCCESS = "failure";
        }
        return mapping.findForward(SUCCESS);
    }
}
