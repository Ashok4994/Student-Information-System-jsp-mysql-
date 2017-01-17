/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sis.actions.adminact;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.sis.dao.admindao.AdminloginDao;

/**
 *
 * @author PEDDI'S
 */
public class AddmentorAction extends org.apache.struts.action.Action {

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
        AdminloginDao ald = new AdminloginDao();
        String did = request.getParameter("did");
        String dname = request.getParameter("dname");
        String tid = request.getParameter("tid");
        String tname = request.getParameter("tname");
         String temail=request.getParameter("temail");
         int k=ald.insertFaculty(did,dname,tid,tname,temail);
         if(k == 1)
         {
          String status="New Mentor Is Added";
          request.setAttribute("status", status);
          SUCCESS = "success";
         }
         else
         {
          String status="Not Updated";
          request.setAttribute("status", status);   
         }
        return mapping.findForward(SUCCESS);
    }
}
