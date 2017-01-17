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
import org.sis.dao.admindao.AdminhomeFacultyDao;

/**
 *
 * @author PEDDI'S
 */
public class AdminhomeAction extends org.apache.struts.action.Action {

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
        AdminhomeFacultyDao af = new AdminhomeFacultyDao();
        ArrayList al ;
      
        String s = request.getParameter("sdae");
        int a = s != null ? Integer.parseInt(s) : 0;
        String did = null, tid = null, dname = null, tname = null, temail = null,log=null;
        if (a > 0) {
            
            try {
                for (int i = 1; i < a; i++) {
                    did = request.getParameter("did" + i);
                    tid = request.getParameter("tid" + i);
                    dname = request.getParameter("dname" + i);
                    tname = request.getParameter("tname" + i);
                    temail = request.getParameter("temail" + i);
                     log = request.getParameter("log" + i);
                   int k= af.updateFaculty(did, tid, dname, tname, temail,log);
                    did = null;
                    tid = null;
                    dname = null;
                    tname = null;
                    temail = null;
                    log=null;
                    System.out.println("updation"+k);
                }
            } catch (Exception e) {
                System.out.println("Exception" + e);
            }
           al = af.Faculty();
            request.setAttribute("list", al);
        } else {
         al = af.Faculty();
            request.setAttribute("list", al);
        }
        return mapping.findForward(SUCCESS);
    }
}
