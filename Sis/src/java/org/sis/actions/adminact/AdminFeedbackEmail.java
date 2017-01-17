/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sis.actions.adminact;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.sis.dao.admindao.AdminFeedbackEmailDao;

/**
 *
 * @author PEDDI'S
 */
public class AdminFeedbackEmail extends org.apache.struts.action.Action {

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
            String status = "Other Departments Will Be Updated Later!";
            request.setAttribute("status", status);
            SUCCESS = "failure";
        } else if (dname.equals("1")) {
            String dep = "1";
            request.setAttribute("dep", dep);
            String sem = request.getParameter("sname");
              request.setAttribute("sem", sem);
            if (sem.equals("1")) {
                AdminFeedbackEmailDao afe = new AdminFeedbackEmailDao();
                String query = "select * from feedsem1";
                ArrayList list = afe.getsemfeed(query);
                request.setAttribute("list", list);
                String status = "CSE SEMESTER-1 Feedback";
                request.setAttribute("status", status);
            } else if (sem.equals("2")) {
                AdminFeedbackEmailDao afe = new AdminFeedbackEmailDao();
                String query = "select * from feedsem2";
                ArrayList list = afe.getsemfeed(query);
                request.setAttribute("list", list);
                String status = "CSE SEMESTER-2 Feedback";
                request.setAttribute("status", status);
            } else if (sem.equals("3")) {
                AdminFeedbackEmailDao afe = new AdminFeedbackEmailDao();
                String query = "select * from feedsem3";
                ArrayList list = afe.getsemfeed(query);
                request.setAttribute("list", list);
                String status = "CSE SEMESTER-3 Feedback";
                request.setAttribute("status", status);
            } else if (sem.equals("4")) {
                AdminFeedbackEmailDao afe = new AdminFeedbackEmailDao();
                String query = "select * from feedsem4";
                ArrayList list = afe.getsemfeed(query);
                request.setAttribute("list", list);
                String status = "CSE SEMESTER-4 Feedback";
                request.setAttribute("status", status);

            } else if (sem.equals("5")) {
                AdminFeedbackEmailDao afe = new AdminFeedbackEmailDao();
                String query = "select * from feedsem5";
                ArrayList list = afe.getsemfeed(query);
                request.setAttribute("list", list);
                String status = "CSE SEMESTER-5 Feedback";
                request.setAttribute("status", status);
            } else if (sem.equals("6")) {
                AdminFeedbackEmailDao afe = new AdminFeedbackEmailDao();
                String query = "select * from feedsem6";
                ArrayList list = afe.getsemfeed(query);
                request.setAttribute("list", list);
                String status = "CSE SEMESTER-6 Feedback";
                request.setAttribute("status", status);
            } else if (sem.equals("7")) {
                AdminFeedbackEmailDao afe = new AdminFeedbackEmailDao();
                String query = "select * from feedsem7";
                ArrayList list = afe.getsemfeed(query);
                request.setAttribute("list", list);
                String status = "CSE SEMESTER-7 Feedback";
                request.setAttribute("status", status);
            } else if (sem.equals("8")) {
                AdminFeedbackEmailDao afe = new AdminFeedbackEmailDao();
                String query = "select * from feedsem8";
                ArrayList list = afe.getsemfeed(query);
                request.setAttribute("list", list);
                String status = "CSE SEMESTER-8 Feedback";
                request.setAttribute("status", status);
            } else {
                String status = "Some Thing Went Wrong!";
                request.setAttribute("status", status);
                SUCCESS = "failure";
            }

        } else {
            String status = "Other Departments Will Be Updated Later!";
            request.setAttribute("status", status);
            SUCCESS = "failure";
        }

        return mapping.findForward(SUCCESS);
    }
}
