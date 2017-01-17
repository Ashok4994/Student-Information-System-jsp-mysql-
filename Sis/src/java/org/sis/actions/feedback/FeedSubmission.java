/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sis.actions.feedback;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.sis.dao.feedback.FeedSubmissionDao;

/**
 *
 * @author PEDDI'S
 */
public class FeedSubmission extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private String SUCCESS = "failure";

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
        String sid = request.getParameter("sid");
        if (sid == null) {
            SUCCESS = "failure";
        } else {
            FeedSubmissionDao fs = new FeedSubmissionDao();
            String qna = null, qnb = null, qnc = null, qnd = null, qne = null, subid = null, sem = null;
            String kval = request.getParameter("kval");
            sem = request.getParameter("sem");
            if (sem.equals("1")) {
                int k = Integer.parseInt(kval);
                for (int i = 1; i < k; i++) {
                    qna = request.getParameter("qna" + i);
                    qnb = request.getParameter("qnb" + i);
                    qnc = request.getParameter("qnc" + i);
                    qnd = request.getParameter("qnd" + i);
                    qne = request.getParameter("qne" + i);
                    subid = request.getParameter("subid" + i);
                    boolean b = fs.updatesem1(qna, qnb, qnc, qnd, qne, subid, kval);

                    qna = null;
                    qnb = null;
                    qnc = null;
                    qnd = null;
                    qne = null;
                    subid = null;
                    sem = null;
                }
                boolean b = fs.updatefeedlog(sid);
                if (b) {
                    SUCCESS = "success";
                    String errf = "You Are Successfully Submitted Your Feedback And Logged Out";
                    request.setAttribute("errf", errf);
                } else {
                    SUCCESS = "failure";
                }
            } else if (sem.equals("2")) {

                int k = Integer.parseInt(kval);
                for (int i = 1; i < k; i++) {
                    qna = request.getParameter("qna" + i);
                    qnb = request.getParameter("qnb" + i);
                    qnc = request.getParameter("qnc" + i);
                    qnd = request.getParameter("qnd" + i);
                    qne = request.getParameter("qne" + i);
                    subid = request.getParameter("subid" + i);
                    boolean b = fs.updatesem2(qna, qnb, qnc, qnd, qne, subid, kval);

                    qna = null;
                    qnb = null;
                    qnc = null;
                    qnd = null;
                    qne = null;
                    subid = null;
                    sem = null;
                }
                boolean b = fs.updatefeedlog(sid);
                if (b) {
                    SUCCESS = "success";
                    String errf = "You Are Successfully Submitted Your Feedback And Logged Out";
                    request.setAttribute("errf", errf);
                } else {
                    SUCCESS = "failure";
                }
            } else if (sem.equals("3")) {
                int k = Integer.parseInt(kval);
                for (int i = 1; i < k; i++) {
                    qna = request.getParameter("qna" + i);
                    qnb = request.getParameter("qnb" + i);
                    qnc = request.getParameter("qnc" + i);
                    qnd = request.getParameter("qnd" + i);
                    qne = request.getParameter("qne" + i);
                    subid = request.getParameter("subid" + i);
                    boolean b = fs.updatesem3(qna, qnb, qnc, qnd, qne, subid, kval);

                    qna = null;
                    qnb = null;
                    qnc = null;
                    qnd = null;
                    qne = null;
                    subid = null;
                    sem = null;
                }
                boolean b = fs.updatefeedlog(sid);
                if (b) {
                    SUCCESS = "success";
                    String errf = "You Are Successfully Submitted Your Feedback And Logged Out";
                    request.setAttribute("errf", errf);
                } else {
                    SUCCESS = "failure";
                }
            } else if (sem.equals("4")) {
                int k = Integer.parseInt(kval);
                for (int i = 1; i < k; i++) {
                    qna = request.getParameter("qna" + i);
                    qnb = request.getParameter("qnb" + i);
                    qnc = request.getParameter("qnc" + i);
                    qnd = request.getParameter("qnd" + i);
                    qne = request.getParameter("qne" + i);
                    subid = request.getParameter("subid" + i);
                    boolean b = fs.updatesem4(qna, qnb, qnc, qnd, qne, subid, kval);

                    qna = null;
                    qnb = null;
                    qnc = null;
                    qnd = null;
                    qne = null;
                    subid = null;
                    sem = null;
                }
                boolean b = fs.updatefeedlog(sid);
                if (b) {
                    SUCCESS = "success";
                    String errf = "You Are Successfully Submitted Your Feedback And Logged Out";
                    request.setAttribute("errf", errf);
                } else {
                    SUCCESS = "failure";
                }
            } else if (sem.equals("5")) {
                int k = Integer.parseInt(kval);
                for (int i = 1; i < k; i++) {
                    qna = request.getParameter("qna" + i);
                    qnb = request.getParameter("qnb" + i);
                    qnc = request.getParameter("qnc" + i);
                    qnd = request.getParameter("qnd" + i);
                    qne = request.getParameter("qne" + i);
                    subid = request.getParameter("subid" + i);
                    boolean b = fs.updatesem5(qna, qnb, qnc, qnd, qne, subid, kval);

                    qna = null;
                    qnb = null;
                    qnc = null;
                    qnd = null;
                    qne = null;
                    subid = null;
                    sem = null;
                }
                boolean b = fs.updatefeedlog(sid);
                if (b) {
                    SUCCESS = "success";
                    String errf = "You Are Successfully Submitted Your Feedback And Logged Out";
                    request.setAttribute("errf", errf);
                } else {
                    SUCCESS = "failure";
                }
            } else if (sem.equals("6")) {
                int k = Integer.parseInt(kval);
                for (int i = 1; i < k; i++) {
                    qna = request.getParameter("qna" + i);
                    qnb = request.getParameter("qnb" + i);
                    qnc = request.getParameter("qnc" + i);
                    qnd = request.getParameter("qnd" + i);
                    qne = request.getParameter("qne" + i);
                    subid = request.getParameter("subid" + i);
                    boolean b = fs.updatesem6(qna, qnb, qnc, qnd, qne, subid, kval);

                    qna = null;
                    qnb = null;
                    qnc = null;
                    qnd = null;
                    qne = null;
                    subid = null;
                    sem = null;
                }
                boolean b = fs.updatefeedlog(sid);
                if (b) {
                    SUCCESS = "success";
                    String errf = "You Are Successfully Submitted Your Feedback And Logged Out";
                    request.setAttribute("errf", errf);
                } else {
                    SUCCESS = "failure";
                }
            } else if (sem.equals("7")) {
                int k = Integer.parseInt(kval);
                for (int i = 1; i < k; i++) {
                    qna = request.getParameter("qna" + i);
                    qnb = request.getParameter("qnb" + i);
                    qnc = request.getParameter("qnc" + i);
                    qnd = request.getParameter("qnd" + i);
                    qne = request.getParameter("qne" + i);
                    subid = request.getParameter("subid" + i);
                    boolean b = fs.updatesem7(qna, qnb, qnc, qnd, qne, subid, kval);

                    qna = null;
                    qnb = null;
                    qnc = null;
                    qnd = null;
                    qne = null;
                    subid = null;
                    sem = null;
                }
                boolean b = fs.updatefeedlog(sid);
                if (b) {
                    SUCCESS = "success";
                    String errf = "You Are Successfully Submitted Your Feedback And Logged Out";
                    request.setAttribute("errf", errf);
                } else {
                    SUCCESS = "failure";
                }
            } else if (sem.equals("8")) {
                int k = Integer.parseInt(kval);
                for (int i = 1; i < k; i++) {
                    qna = request.getParameter("qna" + i);
                    qnb = request.getParameter("qnb" + i);
                    qnc = request.getParameter("qnc" + i);
                    qnd = request.getParameter("qnd" + i);
                    qne = request.getParameter("qne" + i);
                    subid = request.getParameter("subid" + i);
                    boolean b = fs.updatesem8(qna, qnb, qnc, qnd, qne, subid, kval);

                    qna = null;
                    qnb = null;
                    qnc = null;
                    qnd = null;
                    qne = null;
                    subid = null;
                    sem = null;
                }
                boolean b = fs.updatefeedlog(sid);
                if (b) {
                    SUCCESS = "success";
                    String errf = "You Are Successfully Submitted Your Feedback And Logged Out";
                    request.setAttribute("errf", errf);
                } else {
                    SUCCESS = "failure";
                }
            } else {
                SUCCESS = "failure";
            }
        }
        return mapping.findForward(SUCCESS);
    }
}
