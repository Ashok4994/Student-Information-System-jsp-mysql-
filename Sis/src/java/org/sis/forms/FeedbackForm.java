/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sis.forms;

import java.util.ArrayList;

/**
 *
 * @author PEDDI'S
 */
public class FeedbackForm extends org.apache.struts.action.ActionForm {

    private int dname;
    private int fid;
    private String o;
    private String s;
    private String t;
    private String f;
    private String fi;

    public String getO() {
        return o;
    }

    public void setO(String o) {
        this.o = o;
    }

    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }

    public String getFi() {
        return fi;
    }

    public void setFi(String fi) {
        this.fi = fi;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public int getDname() {
        return dname;
    }

    public void setDname(int dname) {
        this.dname = dname;
    }

    public int getTname() {
        return tname;
    }

    public void setTname(int tname) {
        this.tname = tname;
    }

    public int getSubname() {
        return subname;
    }

    public void setSubname(int subname) {
        this.subname = subname;
    }

    public String getFpost() {
        return fpost;
    }

    public void setFpost(String fpost) {
        this.fpost = fpost;
    }
    private String mode;
    private ArrayList tlist;

    public ArrayList getTlist() {
        return tlist;
    }

    public void setTlist(ArrayList tlist) {
        this.tlist = tlist;
    }
    private ArrayList slist;
    private  ArrayList dlist;

    public ArrayList getDlist() {
        return dlist;
    }

    public void setDlist(ArrayList dlist) {
        this.dlist = dlist;
    }

    public ArrayList getSlist() {
        return slist;
    }

    public void setSlist(ArrayList slist) {
        this.slist = slist;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
    private int tname;
    private int subname;
    private String mail;
    private String maili;

    public String getMaili() {
        return maili;
    }

    public void setMaili(String maili) {
        this.maili = maili;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    private String fpost;
    private ArrayList mailif;

    public ArrayList getMailif() {
        return mailif;
    }

    public void setMailif(ArrayList mailif) {
        this.mailif = mailif;
    }

}
