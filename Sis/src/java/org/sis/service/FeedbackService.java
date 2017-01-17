/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sis.service;

import java.util.ArrayList;
import java.util.HashMap;
import org.sis.dao.FeedbackDao;


public class FeedbackService {


public ArrayList getd() {
     
        FeedbackDao rudao = new FeedbackDao();
        ArrayList al= new ArrayList();
        al = rudao.getd();
        return al;
    }
    public HashMap getmail(int i) {
        int a = i;

        FeedbackDao rudao = new FeedbackDao();
        HashMap mp = new HashMap();
        mp = rudao.getd(a);
        return mp;
    }
public ArrayList gett(int i) {
        int a = i;
        FeedbackDao rudao = new FeedbackDao();
        ArrayList al= new ArrayList();
        al = rudao.gett(a);
        return al;
    }
}
