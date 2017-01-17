/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sis.dto;

import java.util.ArrayList;

/**
 *
 * @author PEDDI'S
 */
public class FeedbackDto {

    private String dname;
    private int fid;

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }

    public String getFpost() {
        return fpost;
    }

    public void setFpost(String fpost) {
        this.fpost = fpost;
    }
    private String tname;
    private String subname;
     private String mail;
  private ArrayList mailif;
private String maili;

    public String getMaili() {
        return maili;
    }

    public void setMaili(String maili) {
        this.maili = maili;
    }
    public ArrayList getMailif() {
        return mailif;
    }

    public void setMailif(ArrayList mailif) {
        this.mailif = mailif;
    }


    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    private String fpost;

}
