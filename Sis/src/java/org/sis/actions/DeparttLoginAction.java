/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sis.actions;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.sis.dto.DloginDto;
import org.sis.forms.LoginForm;
import org.sis.service.DloginService;

/**
 *
 * @author PEDDI'S
 */
public class DeparttLoginAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
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
       
        LoginForm lf = (LoginForm) form;
        String usern = lf.getUname();
        String psswd = lf.getPwd();
        DloginDto ddto = new DloginDto();
        ActionForward forward = new ActionForward();
        ddto.setUname(usern);
        ddto.setPwd(psswd);
        DloginService ds = new DloginService();
        boolean isBoolean = ds.loginuser(ddto);
        System.out.println("here is value" + isBoolean);
        HttpSession session = request.getSession(true);
        
        if (isBoolean) {
            session.setAttribute("username", usern);
            session.setAttribute("dlog", "dlog");
            forward = mapping.findForward("success");
        } else {
           String error="Please Enter Correct Username & Password";
            request.setAttribute("errd", error);
            forward = mapping.findForward("failure");
        }
        return forward;
    }
}
