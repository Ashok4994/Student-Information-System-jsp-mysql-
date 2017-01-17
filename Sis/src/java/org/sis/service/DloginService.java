/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sis.service;

import org.sis.dao.DloginDao;
import org.sis.dto.DloginDto;

/**
 *
 * @author PEDDI'S
 */
public class DloginService {
    public boolean loginuser(DloginDto ddto)
    {
        DloginDao ddao=new DloginDao();
        boolean isStored = ddao.verifydetails(ddto);
         return isStored;
    }
}
