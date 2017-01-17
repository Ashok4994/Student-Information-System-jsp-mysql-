/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sis.actions.adminact;

import javax.mail.Session;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.sis.dao.admindao.AdminFeedbackEmailDao;
import org.sis.service.EmailUtility;

/**
 *
 * @author PEDDI'S
 */
public class AdminMailFeedback extends org.apache.struts.action.Action {

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
        AdminFeedbackEmailDao afd = new AdminFeedbackEmailDao();
        host = "smtp.gmail.com";
        port = "587";
        user = "lbceemail@gmail.com";
        pass = "lbrcecsemail";
        String s = request.getParameter("sdae");
        String sem = request.getParameter("sem");
        String subject = "semester" + "-" + sem + " " + "feedback";
        String dep = request.getParameter("dep");
        int d = Integer.parseInt(dep);
        String recipient = afd.getd(d);
        String content = "";
        int a = s != null ? Integer.parseInt(s) : 0;
        String subname = null, qn1n = null, qn2n = null, qn3n = null, qn4n = null, qn5n = null, finalfeed = null, mem = null;
        if (a > 0) {
            for (int i = 1; i < a; i++) {
                subname = request.getParameter("subname" + i);
                qn1n = request.getParameter("qn1n" + i);
                qn2n = request.getParameter("qn2n" + i);
                qn3n = request.getParameter("qn3n" + i);
                qn4n = request.getParameter("qn4n" + i);
                qn5n = request.getParameter("qn5n" + i);
                finalfeed = request.getParameter("finalfeed" + i);
                mem = request.getParameter("mem" + i);
                content += "<br><br><font size=5 color=#04B404>" + "<strong>Subject Name:-</strong>" + subname + " " + "Feedback" + "</font><br>"
                        + "<table border=1 width=75%><tr><th>Queries Given</th> " + "<th>Percentage</th></tr>"
                        + "<tr><td>The teacher explains important concepts/ideas in ways that I can understand:</td> " + "<td>" + qn1n + "%" + "</td></tr>"
                        + "<tr><td>The teacher stimulates my interest in the subject:</td>" + "<td>" + qn2n + "%" + "</td></tr>"
                        + "<tr><td>The teacher demonstrates enthusiasm in teaching the unit:</td>" + "<td>" + qn3n + "%" + "</td></tr>"
                        + "<tr><td>Appropriate teaching techniques are used by the teacher to enhance my learning:</td>" + "<td>" + qn4n + "%" + "</td></tr>"
                        + "<tr><td>The teacher is helpful if I encounter difficulties with the lecture or unit:</td>" + "<td>" + qn5n + "%" + "</td></tr>"
                        + "<tr><td>Overall Final Percentage:</td>" + "<td>" + finalfeed + "%" + "</td></tr>"
                        + "<tr><td>Total Nuumber of members given Feedback:</td>" + "<td>" + mem + "members</td></tr></table>";
                subname = null;
                qn1n = null;
                qn2n = null;
                qn3n = null;
                qn4n = null;
                qn5n = null;
                finalfeed = null;
                mem = null;
            }
            EmailUtility.sendEmail(host, port, user, pass, recipient, subject, content);
            String m = "semester" + "-" + sem + " " + "feedback" + " has sent to concern department head Successfully";
            request.setAttribute("mail", m);
        }
        return mapping.findForward(SUCCESS);
    }
}
