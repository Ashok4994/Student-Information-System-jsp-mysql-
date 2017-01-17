/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sis.dto;

/**
 *
 * @author PEDDI'S
 */
public class DloginDto {
        
  public String uname;
  public String pwd;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    private String duname;
    private String dpwd;

    public String getDuname() {
        return duname;
    }

    public void setDuname(String duname) {
        this.duname = duname;
    }

    public String getDpwd() {
        return dpwd;
    }

    public void setDpwd(String dpwd) {
        this.dpwd = dpwd;
    }
    
    
}
