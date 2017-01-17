/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sis.actions;

import java.sql.Connection;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;
import org.sis.dao.Dayattendancedao;

/**
 *
 * @author PEDDI'S
 */
public class Dayattendance extends DispatchAction {

    String stcn;
    String stcd;
    String stcg;
    String stwt;
    String stli;
    String stpe;
    String stwtlab;
    String stlilab;
    String stcompviva1;

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
    public ActionForward unspecified(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        Dayattendancedao da = new Dayattendancedao();
        ArrayList al = da.studentUtils();
        request.setAttribute("list", al);
        request.setAttribute("stcn", stcn);
        request.setAttribute("stcd", stcd);
        request.setAttribute("stcg", stcg);
        request.setAttribute("stpe", stpe);
        request.setAttribute("stwt", stwt);
        request.setAttribute("stli", stli);
        request.setAttribute("stwtlab", stwtlab);
        request.setAttribute("stlilab", stlilab);
        request.setAttribute("stcompviva1", stcompviva1);
        return mapping.findForward(SUCCESS);
    }

    public ActionForward saveCN(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String s = request.getParameter("sdsme");
        int a = s != null ? Integer.parseInt(s) : 0;
        String sid = null, dcn = null;
        Dayattendancedao std = new Dayattendancedao();
        Connection conn = null;
        String g = null;
        for (int i = 1; i < a; i++) {
            dcn = request.getParameter("dcn" + i);
            if (dcn == null) {
                g = "no";
            } else {
                g = "ok";
            }
        }
        try {
            if (g == "ok") {
                for (int i = 1; i < a; i++) {
                    sid = request.getParameter("sid" + i);
                    dcn = request.getParameter("dcn" + i);
                    std.updateCN(dcn, sid);
                    sid = null;
                    dcn = null;
                }
                String er = "for subject CN!";
                request.setAttribute("status", er);
                Dayattendancedao da = new Dayattendancedao();
                ArrayList al = da.studentUtils();
                request.setAttribute("list", al);
                stcn = "UPDATED";
                request.setAttribute("stcn", stcn);
                request.setAttribute("stcd", stcd);
                request.setAttribute("stcg", stcg);
                request.setAttribute("stpe", stpe);
                request.setAttribute("stwt", stwt);
                request.setAttribute("stli", stli);
                request.setAttribute("stwtlab", stwtlab);
                request.setAttribute("stlilab", stlilab);
                request.setAttribute("stcompviva1", stcompviva1);
            } else {
                String er = "Please give attendace for all students in CN!";
                request.setAttribute("error", er);
                Dayattendancedao da = new Dayattendancedao();
                ArrayList al = da.studentUtils();
                request.setAttribute("list", al);
                return mapping.findForward(SUCCESS);
            }
        } catch (Exception ex) {
            System.out.println("Eception in final" + ex);
        }
        return mapping.findForward(SUCCESS);
    }

    public ActionForward saveCD(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String s = request.getParameter("sdsme");
        int a = s != null ? Integer.parseInt(s) : 0;
        String sid = null, dcn = null;
        Dayattendancedao std = new Dayattendancedao();
        Connection conn = null;
        String g = null;
        for (int i = 1; i < a; i++) {
            dcn = request.getParameter("dcd" + i);
            if (dcn == null) {
                g = "no";
            } else {
                g = "ok";
            }
        }
        try {
            if (g == "ok") {
                for (int i = 1; i < a; i++) {
                    sid = request.getParameter("sid" + i);
                    dcn = request.getParameter("dcd" + i);
                    std.updateCD(dcn, sid);
                    sid = null;
                    dcn = null;
                }
                String er = "for subject CD!";
                request.setAttribute("status", er);
                Dayattendancedao da = new Dayattendancedao();
                ArrayList al = da.studentUtils();
                request.setAttribute("list", al);
                stcd = "UPDATED";
                request.setAttribute("stcn", stcn);
                request.setAttribute("stcd", stcd);
                request.setAttribute("stcg", stcg);
                request.setAttribute("stpe", stpe);
                request.setAttribute("stwt", stwt);
                request.setAttribute("stli", stli);
                request.setAttribute("stwtlab", stwtlab);
                request.setAttribute("stlilab", stlilab);
                request.setAttribute("stcompviva1", stcompviva1);
            } else {
                String er = "Please give attendace for all students in CD!";
                request.setAttribute("error", er);
                Dayattendancedao da = new Dayattendancedao();
                ArrayList al = da.studentUtils();
                request.setAttribute("list", al);
                return mapping.findForward(SUCCESS);
            }
        } catch (Exception ex) {
            System.out.println("Eception in final" + ex);
        }
        return mapping.findForward(SUCCESS);
    }

    public ActionForward saveWT(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String s = request.getParameter("sdsme");
        int a = s != null ? Integer.parseInt(s) : 0;
        String sid = null, dcn = null;
        Dayattendancedao std = new Dayattendancedao();
        Connection conn = null;
        String g = null;
        for (int i = 1; i < a; i++) {
            dcn = request.getParameter("dwt" + i);
            if (dcn == null) {
                g = "no";
            } else {
                g = "ok";
            }
        }
        try {
            if (g == "ok") {
                for (int i = 1; i < a; i++) {
                    sid = request.getParameter("sid" + i);
                    dcn = request.getParameter("dwt" + i);
                    std.updateWT(dcn, sid);
                    sid = null;
                    dcn = null;
                }
                String er = "for subject WT!";
                request.setAttribute("status", er);
                Dayattendancedao da = new Dayattendancedao();
                ArrayList al = da.studentUtils();
                request.setAttribute("list", al);
                stwt = "UPDATED";
                request.setAttribute("stcn", stcn);
                request.setAttribute("stcd", stcd);
                request.setAttribute("stcg", stcg);
                request.setAttribute("stpe", stpe);
                request.setAttribute("stwt", stwt);
                request.setAttribute("stli", stli);
                request.setAttribute("stwtlab", stwtlab);
                request.setAttribute("stlilab", stlilab);
                request.setAttribute("stcompviva1", stcompviva1);
            } else {
                String er = "Please give attendace for all students in WT!";
                request.setAttribute("error", er);
                Dayattendancedao da = new Dayattendancedao();
                ArrayList al = da.studentUtils();
                request.setAttribute("list", al);
                return mapping.findForward(SUCCESS);
            }
        } catch (Exception ex) {
            System.out.println("Eception in final" + ex);
        }
        return mapping.findForward(SUCCESS);
    }

    public ActionForward saveLI(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String s = request.getParameter("sdsme");
        int a = s != null ? Integer.parseInt(s) : 0;
        String sid = null, dcn = null;
        Dayattendancedao std = new Dayattendancedao();
        Connection conn = null;
        String g = null;
        for (int i = 1; i < a; i++) {
            dcn = request.getParameter("dli" + i);
            if (dcn == null) {
                g = "no";
            } else {
                g = "ok";
            }
        }
        try {
            if (g == "ok") {
                for (int i = 1; i < a; i++) {
                    sid = request.getParameter("sid" + i);
                    dcn = request.getParameter("dli" + i);
                    std.updateLI(dcn, sid);
                    sid = null;
                    dcn = null;
                }
                String er = "for subject LI!";
                request.setAttribute("status", er);
                Dayattendancedao da = new Dayattendancedao();
                ArrayList al = da.studentUtils();
                request.setAttribute("list", al);
                stli = "UPDATED";
                request.setAttribute("stcn", stcn);
                request.setAttribute("stcd", stcd);
                request.setAttribute("stcg", stcg);
                request.setAttribute("stpe", stpe);
                request.setAttribute("stwt", stwt);
                request.setAttribute("stli", stli);
                request.setAttribute("stwtlab", stwtlab);
                request.setAttribute("stlilab", stlilab);
                request.setAttribute("stcompviva1", stcompviva1);
            } else {
                String er = "Please give attendace for all students in LI!";
                request.setAttribute("error", er);
                Dayattendancedao da = new Dayattendancedao();
                ArrayList al = da.studentUtils();
                request.setAttribute("list", al);
                return mapping.findForward(SUCCESS);
            }
        } catch (Exception ex) {
            System.out.println("Eception in final" + ex);
        }
        return mapping.findForward(SUCCESS);
    }

    public ActionForward saveCG(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String s = request.getParameter("sdsme");
        int a = s != null ? Integer.parseInt(s) : 0;
        String sid = null, dcn = null;
        Dayattendancedao std = new Dayattendancedao();
        Connection conn = null;
        String g = null;
        for (int i = 1; i < a; i++) {
            dcn = request.getParameter("dcg" + i);
            if (dcn == null) {
                g = "no";
            } else {
                g = "ok";
            }
        }
        try {
            if (g == "ok") {
                for (int i = 1; i < a; i++) {
                    sid = request.getParameter("sid" + i);
                    dcn = request.getParameter("dcg" + i);
                    std.updateCG(dcn, sid);
                    sid = null;
                    dcn = null;
                }
                String er = "for subject CG!";
                request.setAttribute("status", er);
                Dayattendancedao da = new Dayattendancedao();
                ArrayList al = da.studentUtils();
                request.setAttribute("list", al);
                stcg = "UPDATED";
                request.setAttribute("stcn", stcn);
                request.setAttribute("stcd", stcd);
                request.setAttribute("stcg", stcg);
                request.setAttribute("stpe", stpe);
                request.setAttribute("stwt", stwt);
                request.setAttribute("stli", stli);
                request.setAttribute("stwtlab", stwtlab);
                request.setAttribute("stlilab", stlilab);
                request.setAttribute("stcompviva1", stcompviva1);
            } else {
                String er = "Please give attendace for all students in CG!";
                request.setAttribute("error", er);
                Dayattendancedao da = new Dayattendancedao();
                ArrayList al = da.studentUtils();
                request.setAttribute("list", al);
                return mapping.findForward(SUCCESS);
            }
        } catch (Exception ex) {
            System.out.println("Eception in final" + ex);
        }
        return mapping.findForward(SUCCESS);
    }

    public ActionForward savePE(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String s = request.getParameter("sdsme");
        int a = s != null ? Integer.parseInt(s) : 0;
        String sid = null, dcn = null;
        Dayattendancedao std = new Dayattendancedao();
        Connection conn = null;
        String g = null;
        for (int i = 1; i < a; i++) {
            dcn = request.getParameter("dpe" + i);
            if (dcn == null) {
                g = "no";
            } else {
                g = "ok";
            }
        }
        try {
            if (g == "ok") {
                for (int i = 1; i < a; i++) {
                    sid = request.getParameter("sid" + i);
                    dcn = request.getParameter("dpe" + i);
                    std.updatePE(dcn, sid);
                    sid = null;
                    dcn = null;
                }
                String er = "for subject PE!";
                request.setAttribute("status", er);
                Dayattendancedao da = new Dayattendancedao();
                ArrayList al = da.studentUtils();
                request.setAttribute("list", al);
                stpe = "UPDATED";
                request.setAttribute("stcn", stcn);
                request.setAttribute("stcd", stcd);
                request.setAttribute("stcg", stcg);
                request.setAttribute("stpe", stpe);
                request.setAttribute("stwt", stwt);
                request.setAttribute("stli", stli);
                request.setAttribute("stwtlab", stwtlab);
                request.setAttribute("stlilab", stlilab);
                request.setAttribute("stcompviva1", stcompviva1);
            } else {
                String er = "Please give attendace for all students in PE!";
                request.setAttribute("error", er);
                Dayattendancedao da = new Dayattendancedao();
                ArrayList al = da.studentUtils();
                request.setAttribute("list", al);
                return mapping.findForward(SUCCESS);
            }
        } catch (Exception ex) {
            System.out.println("Eception in final" + ex);
        }
        return mapping.findForward(SUCCESS);
    }

    public ActionForward saveWTLAB(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String s = request.getParameter("sdsme");
        int a = s != null ? Integer.parseInt(s) : 0;
        String sid = null, dcn = null;
        Dayattendancedao std = new Dayattendancedao();
        Connection conn = null;
        String g = null;
        for (int i = 1; i < a; i++) {
            dcn = request.getParameter("dwtlab" + i);
            if (dcn == null) {
                g = "no";
            } else {
                g = "ok";
            }
        }
        try {
            if (g == "ok") {
                for (int i = 1; i < a; i++) {
                    sid = request.getParameter("sid" + i);
                    dcn = request.getParameter("dwtlab" + i);
                    std.updateWTLAB(dcn, sid);
                    sid = null;
                    dcn = null;
                }
                String er = "for subject WTLAB!";
                request.setAttribute("status", er);
                Dayattendancedao da = new Dayattendancedao();
                ArrayList al = da.studentUtils();
                request.setAttribute("list", al);
                stwtlab = "UPDATED";
                request.setAttribute("stcn", stcn);
                request.setAttribute("stcd", stcd);
                request.setAttribute("stcg", stcg);
                request.setAttribute("stpe", stpe);
                request.setAttribute("stwt", stwt);
                request.setAttribute("stli", stli);
                request.setAttribute("stwtlab", stwtlab);
                request.setAttribute("stlilab", stlilab);
                request.setAttribute("stcompviva1", stcompviva1);
            } else {
                String er = "Please give attendace for all students in WTLAB!";
                request.setAttribute("error", er);
                Dayattendancedao da = new Dayattendancedao();
                ArrayList al = da.studentUtils();
                request.setAttribute("list", al);
                return mapping.findForward(SUCCESS);
            }
        } catch (Exception ex) {
            System.out.println("Eception in final" + ex);
        }
        return mapping.findForward(SUCCESS);
    }

    public ActionForward saveLILAB(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String s = request.getParameter("sdsme");
        int a = s != null ? Integer.parseInt(s) : 0;
        String sid = null, dcn = null;
        Dayattendancedao std = new Dayattendancedao();
        Connection conn = null;
        String g = null;
        for (int i = 1; i < a; i++) {
            dcn = request.getParameter("dlilab" + i);
            if (dcn == null) {
                g = "no";
            } else {
                g = "ok";
            }
        }
        try {
            if (g == "ok") {
                for (int i = 1; i < a; i++) {
                    sid = request.getParameter("sid" + i);
                    dcn = request.getParameter("dlilab" + i);
                    std.updateLILAB(dcn, sid);
                    sid = null;
                    dcn = null;
                }
                String er = "for subject LILAB!";
                request.setAttribute("status", er);
                Dayattendancedao da = new Dayattendancedao();
                ArrayList al = da.studentUtils();
                request.setAttribute("list", al);
                stlilab = "UPDATED";
                request.setAttribute("stcn", stcn);
                request.setAttribute("stcd", stcd);
                request.setAttribute("stcg", stcg);
                request.setAttribute("stpe", stpe);
                request.setAttribute("stwt", stwt);
                request.setAttribute("stli", stli);
                request.setAttribute("stwtlab", stwtlab);
                request.setAttribute("stlilab", stlilab);
                request.setAttribute("stcompviva1", stcompviva1);
            } else {
                String er = "Please give attendace for all students in LILAB!";
                request.setAttribute("error", er);
                Dayattendancedao da = new Dayattendancedao();
                ArrayList al = da.studentUtils();
                request.setAttribute("list", al);
                return mapping.findForward(SUCCESS);
            }
        } catch (Exception ex) {
            System.out.println("Eception in final" + ex);
        }
        return mapping.findForward(SUCCESS);
    }

    public ActionForward saveCVIVA(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        String s = request.getParameter("sdsme");
        int a = s != null ? Integer.parseInt(s) : 0;
        String sid = null, dcn = null;
        Dayattendancedao std = new Dayattendancedao();
        Connection conn = null;
        String g = null;
        for (int i = 1; i < a; i++) {
            dcn = request.getParameter("dcompviva1" + i);
            if (dcn == null) {
                g = "no";
            } else {
                g = "ok";
            }
        }
        try {
            if (g == "ok") {
                for (int i = 1; i < a; i++) {
                    sid = request.getParameter("sid" + i);
                    dcn = request.getParameter("dcompviva1" + i);
                    std.updateCVIVA(dcn, sid);
                    sid = null;
                    dcn = null;
                }
                String er = "for subject CVIVA!";
                request.setAttribute("status", er);
                Dayattendancedao da = new Dayattendancedao();
                ArrayList al = da.studentUtils();
                request.setAttribute("list", al);
                stcompviva1 = "UPDATED";
                request.setAttribute("stcn", stcn);
                request.setAttribute("stcd", stcd);
                request.setAttribute("stcg", stcg);
                request.setAttribute("stpe", stpe);
                request.setAttribute("stwt", stwt);
                request.setAttribute("stli", stli);
                request.setAttribute("stwtlab", stwtlab);
                request.setAttribute("stlilab", stlilab);
                request.setAttribute("stcompviva1", stcompviva1);
            } else {
                String er = "Please give attendace for all students in CVIVA!";
                request.setAttribute("error", er);
                Dayattendancedao da = new Dayattendancedao();
                ArrayList al = da.studentUtils();
                request.setAttribute("list", al);
                return mapping.findForward(SUCCESS);
            }
        } catch (Exception ex) {
            System.out.println("Eception in final" + ex);
        }
        return mapping.findForward(SUCCESS);
    }

    public ActionForward save(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        Dayattendancedao std = new Dayattendancedao();
        std.studentU();
        ArrayList al = std.studentUtils();
        request.setAttribute("list", al);
        stcn = "NotUpdated";
        stcd = "NotUpdated";
        stcg = "NotUpdated";
        stcompviva1 = "NotUpdated";
        stwt = "NotUpdated";
        stli = "NotUpdated";
        stpe = "NotUpdated";
        stwtlab = "NotUpdated";
        stlilab = "NotUpdated";
        request.setAttribute("stcn", stcn);
        request.setAttribute("stcd", stcd);
        request.setAttribute("stcg", stcg);
        request.setAttribute("stpe", stpe);
        request.setAttribute("stwt", stwt);
        request.setAttribute("stli", stli);
        request.setAttribute("stwtlab", stwtlab);
        request.setAttribute("stlilab", stlilab);
        request.setAttribute("stcompviva1", stcompviva1);
        return mapping.findForward(SUCCESS);
    }
}
