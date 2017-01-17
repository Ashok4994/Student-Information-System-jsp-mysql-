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
public class DeletementAction extends org.apache.struts.action.Action {

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
        String tid = request.getParameter("tid");
         int k=ald.deleteFaculty(tid);
         if(k == 1)
         {
          String status=" Mentor Is Deleted";
          request.setAttribute("status", status);
          SUCCESS = "success";
         }
         else
         {
          String status="Not Deleted";
          request.setAttribute("status", status);   
         }
        return mapping.findForward(SUCCESS);
    }
       
}
