/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sis.actions;

import java.util.ArrayList;
import java.util.HashMap;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.sis.dao.StudentDetails;

/**
 *
 * @author PEDDI'S
 */
public class StudentDetailsAction extends org.apache.struts.action.Action {

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
        String sid = request.getParameter("sid");
        String seme = request.getParameter("sem");
        int sem = Integer.parseInt(seme);
        if (sem == 1) {
            ArrayList first = new ArrayList();
            StudentDetails sd = new StudentDetails();
            String q = "select * from first where sid=?";
            first = sd.first(sid, q);
            if (first.isEmpty()) {
                request.setAttribute("empty", "No Records For Given RegnNo Are Available");
            } else {
                request.setAttribute("first", first);
                request.setAttribute("print", "print");
            }
        } else if (sem == 2) {
            ArrayList second = new ArrayList();
            StudentDetails sd = new StudentDetails();
            String q = "select * from second where sid=?";
            second = sd.sem(sid, q);
            int tnbl = sd.tnblsecond(sid);
            request.setAttribute("tnbl", tnbl);
            if (second.isEmpty()) {
                request.setAttribute("empty", "No Records For Given RegnNo Are Available");
            } else {
                request.setAttribute("second", second);
                request.setAttribute("print", "print");
            }

        } else if (sem == 3) {
            ArrayList third = new ArrayList();
            StudentDetails sd = new StudentDetails();
            String q = "select * from third where sid=?";
            third = sd.sem(sid, q);
            int tnbl = sd.tnblthird(sid);
            request.setAttribute("tnbl", tnbl);
            if (third.isEmpty()) {
                request.setAttribute("empty", "No Records For Given RegnNo Are Available");
            } else {
                request.setAttribute("third", third);
                request.setAttribute("print", "print");
            }

        } else if (sem == 4) {
            ArrayList fourth = new ArrayList();
            StudentDetails sd = new StudentDetails();
            String q = "select * from fourth where sid=?";
            fourth = sd.sem(sid, q);
            int tnbl = sd.tnblfourth(sid);
            request.setAttribute("tnbl", tnbl);
            if (fourth.isEmpty()) {
                request.setAttribute("empty", "No Records For Given RegnNo Are Available");
            } else {
                request.setAttribute("fourth", fourth);
                request.setAttribute("print", "print");
            }

        } else if (sem == 5) {
            ArrayList fifth = new ArrayList();
            StudentDetails sd = new StudentDetails();
            String q = "select * from fifth where sid=?";
            fifth = sd.sem(sid, q);
            int tnbl = sd.tnblfifth(sid);
            request.setAttribute("tnbl", tnbl);
            if (fifth.isEmpty()) {
                request.setAttribute("empty", "No Records For Given RegnNo Are Available");
            } else {
                request.setAttribute("fifth", fifth);
                request.setAttribute("print", "print");
            }

        } else if (sem == 6) {
            ArrayList threeone = new ArrayList();
            StudentDetails sd = new StudentDetails();
            String q = "select * from threeone where sid=?";
            threeone = sd.sem(sid, q);
            int tnbl = sd.tnblthreeone(sid);
            request.setAttribute("tnbl", tnbl);
            if (threeone.isEmpty()) {
                request.setAttribute("empty", "No Records For Given RegnNo Are Available");
            } else {
                request.setAttribute("threeone", threeone);
                request.setAttribute("print", "print");
            }

        } else if (sem == 7) {
            ArrayList seventh = new ArrayList();
            StudentDetails sd = new StudentDetails();
            String q = "select * from seventh where sid=?";
            seventh = sd.seventh(sid, q);
            int tnbl = sd.tnblseventh(sid);
            request.setAttribute("tnbl", tnbl);
            if (seventh.isEmpty()) {
                request.setAttribute("empty", "No Records For Given RegnNo Are Available");
            } else {
                request.setAttribute("seventh", seventh);
                request.setAttribute("print", "print");
            }

        } else if (sem == 8) {
            ArrayList eighth = new ArrayList();
            StudentDetails sd = new StudentDetails();
            String q = "select * from eighth where sid=?";
            eighth = sd.eighth(sid, q);
            int tnbl = sd.tnbleighth(sid);
            request.setAttribute("tnbl", tnbl);
            if (eighth.isEmpty()) {
                request.setAttribute("empty", "No Records For Given RegnNo Are Available");
            } else {
                request.setAttribute("eighth", eighth);
                request.setAttribute("print", "print");
            }

        } else if (sem == 9) {
            ArrayList first = new ArrayList();
            StudentDetails sd = new StudentDetails();
            String q1 = "select * from first where sid=?";
            first = sd.first(sid, q1);
            if (first.isEmpty()) {
                request.setAttribute("empty", "No Records For Given RegnNo Are Available");
            } else {
                request.setAttribute("first", first);

            }
            ArrayList second = new ArrayList();
            String q2 = "select * from second where sid=?";
            second = sd.sem(sid, q2);
            int tnbl2 = sd.tnblsecond(sid);
            request.setAttribute("tnbl2", tnbl2);
            if (second.isEmpty()) {
                request.setAttribute("empty", "No Records For Given RegnNo Are Available");
            } else {
                request.setAttribute("second", second);

            }
            ArrayList third = new ArrayList();
            String q3 = "select * from third where sid=?";
            third = sd.sem(sid, q3);
            int tnbl3 = sd.tnblthird(sid);
            request.setAttribute("tnbl3", tnbl3);
            if (third.isEmpty()) {
                request.setAttribute("empty", "No Records For Given RegnNo Are Available");
            } else {
                request.setAttribute("third", third);

            }
            ArrayList fourth = new ArrayList();
            String q4 = "select * from fourth where sid=?";
            fourth = sd.sem(sid, q4);
            int tnbl4 = sd.tnblfourth(sid);
            request.setAttribute("tnbl4", tnbl4);
            if (fourth.isEmpty()) {
                request.setAttribute("empty", "No Records For Given RegnNo Are Available");
            } else {
                request.setAttribute("fourth", fourth);

            }
            ArrayList fifth = new ArrayList();
            String q5 = "select * from fifth where sid=?";
            fifth = sd.sem(sid, q5);
            int tnbl5 = sd.tnblfifth(sid);
            request.setAttribute("tnbl5", tnbl5);
            if (fifth.isEmpty()) {
                request.setAttribute("empty", "No Records For Given RegnNo Are Available");
            } else {
                request.setAttribute("fifth", fifth);

            }
            ArrayList threeone = new ArrayList();
            String q6 = "select * from threeone where sid=?";
            threeone = sd.sem(sid, q6);
            int tnbl6 = sd.tnblthreeone(sid);
            request.setAttribute("tnbl6", tnbl6);
            if (threeone.isEmpty()) {
                request.setAttribute("empty", "No Records For Given RegnNo Are Available");
            } else {
                request.setAttribute("threeone", threeone);

            }
            ArrayList seventh = new ArrayList();
            String q7 = "select * from seventh where sid=?";
            seventh = sd.seventh(sid, q7);
            int tnbl7 = sd.tnblseventh(sid);
            request.setAttribute("tnbl7", tnbl7);
            if (seventh.isEmpty()) {
                request.setAttribute("empty", "No Records For Given RegnNo Are Available");
            } else {
                request.setAttribute("seventh", seventh);

            }
            ArrayList eighth = new ArrayList();
            String q8 = "select * from eighth where sid=?";
            eighth = sd.eighth(sid, q8);
            int tnbl8 = sd.tnbleighth(sid);
            request.setAttribute("tnbl8", tnbl8);
            if (eighth.isEmpty()) {
                request.setAttribute("empty", "No Records For Given RegnNo Are Available");
            } else {
                request.setAttribute("eighth", eighth);
            }
            request.setAttribute("printf", "printf");
        } else {
            request.setAttribute("empty", "No Records For Given RegnNo Are Available");
        }

        return mapping.findForward(SUCCESS);
    }
}
