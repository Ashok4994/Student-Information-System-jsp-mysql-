<%-- 
    Doc/* global field */

/* global field */

ument   : Student
    Created on : May 31, 2015, 2:00:10 PM
    Author     : PEDDI'S
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%--<%@  taglib uri="/WEB-INF/tlds/myHtml.tld" prefix="html" %>--%>
<% String contextPath = request.getContextPath();%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="<%=contextPath%>/Start/Css/Home/Home.css" title="Home" media="screen,projection" />
        <link rel="stylesheet" type="text/css" href="<%=contextPath%>/Start/Css/logins/style.css" title="Home" media="screen,projection" />
        <title>Student Details</title>
        <style>
            
            #dialogoverlay{
                display: none;
                opacity: .8;
                position: fixed;
                top: 0px;
                left: 0px;
                background: #FFF;
                width: 100%;
                z-index: 10;
            }
            #dialogbox{
                display: none;
                position: fixed;
                background: #000;
                border-radius:7px; 
                width:550px;
                z-index: 10;
            }
            #dialogbox > div{ background:#FFF; margin:8px; }
            #dialogbox > div > #dialogboxhead{ background: #666; font-size:25px; padding:10px; text-align:left; color:#66FF00; }
            #dialogbox > div > #dialogboxbody{ background:#333; padding:20px; font-size:19px;text-align:center; color:#FF0000 ; }
            #dialogbox > div > #dialogboxfoot{ background: #666; padding:10px; text-align:right; }
        </style>
        <script type="text/javascript" language="javascript" >
            function onBlur(el) {
                if (el.value == '') {
                    el.value = el.defaultValue;
                }
            }
            function onFocus(el) {

                el.value = '';

            }
            function validate(key)
            {
                //getting key code of pressed key
                var keycode = (key.which) ? key.which : key.keyCode;
                if (keycode == 13)
                {
                    var name = document.forms[0].field;
                    if (name.value == "Enter your Valid RegdNo" || name == "")
                    {
                        window.Alert.render("Please enter correct number.");
                    } else
                    {
                        document.getElementById("sub").focus();
                    }
                }
                //comparing pressed keycodes
                if (!(keycode == 9 || keycode == 46 || keycode == 65 || keycode == 97 || keycode == 13) && (keycode < 48 || keycode > 57))
                {
                    return false;
                }
                return true;
            }
            function ValidateContactForm()
            {  
                var name = document.forms[0].field;
                var pname = document.forms[0].pfield;
                if (name.value == "Enter your Valid RegdNo" || name.value == "")
                {
                     window.Alert.render("Please enter regd number.");
                    field.focus();
                    return false;
                } else if (pname.value == "Password" || pname.value == "")
                {
                     window.Alert.render("Please enter password.");
                     pfield.focus();
                    return false;
                }
            }
            window.onload = function () {
                document.getElementById("field").focus();
                var myInput = document.getElementById('field');
                myInput.onpaste = function (e) {
                    e.preventDefault();
                }
            }
            function sub()
            {
                document.getElementById("sub").focus();
            }
            function CustomAlert() {
                this.render = function (dialog) {
                    var winW = window.innerWidth;
                    var winH = window.innerHeight;
                    var dialogoverlay = document.getElementById('dialogoverlay');
                    var dialogbox = document.getElementById('dialogbox');
                    dialogoverlay.style.display = "block";
                    dialogoverlay.style.height = winH + "px";
                    dialogbox.style.left = (winW / 2) - (550 * .5) + "px";
                    dialogbox.style.top = "300px";
                    dialogbox.style.display = "block";
                    document.getElementById('dialogboxhead').innerHTML = "Acknowledge This Alert";
                    document.getElementById('dialogboxbody').innerHTML = dialog;
                    document.getElementById('dialogboxfoot').innerHTML = '<button onclick="Alert.ok()">OK</button>';
                }
                this.ok = function () {
                    document.getElementById('dialogbox').style.display = "none";
                    document.getElementById('dialogoverlay').style.display = "none";
                    field.focus();
                }
            }
            var Alert = new CustomAlert();
           
        </script>
    </head>
    <body id="back"  >
        <div id="dialogoverlay"></div>
        <div id="dialogbox">
            <div>
                <div id="dialogboxhead"></div>
                <div id="dialogboxbody"></div>
                <div id="dialogboxfoot"></div>
            </div>
        </div>
        <div id="wrap">
            <h1><img src="<%=contextPath%>/Start/Images/Home/1.jpg" width="35"/>&nbsp<a target="_blank" href="https://lbrce.ac.in//">Lakireddy Balireddy College Of Engineering</a></h1>
            <h3 class="slogan"><b>Student Information System</b></h3>
            <nav>
                <div id="menubar">
                    <ul id="nav">
                        <li ><a href="Home.pvk">Home</a></li>
                        <li><a href="Depart.pvk">Departments Home</a></li>
                        <li class="current"><a href="Student.pvk">Student Information Form</a></li>
                        <li><a href="Feedback.pvk">Feedback Form</a></li>
                    </ul>
                </div><!--close menubar-->	
            </nav>
            <div id="maincontent">
                <h2 id="hback">No need to <a target="_blank" href="https://www.google.com">make things</a> complicated...</h2>
                <section class="webdesigntuts-workshop"  >
                    <html:form action="/slogin" onsubmit="return ValidateContactForm()" >
                        <label><font size="7">Student Login :</font></label>
                      <br>  <br>  <center><font color="red" size="4"><%
                            Object err = request.getAttribute("err");
                            if (err == null) {
                            } else {
                                out.print(request.getAttribute("err"));
                            }
                            %></font></center>
                        <br> 
                        <table align="center"> 
                            <tr>
                                <td align="right" > <font size="4.5" >REGD NO:</font></td>
                                <td> <input type="text" name="sid" 
                                            required 
                                            value="Enter your Valid RegdNo"  
                                            maxlength="10"  onkeypress="return validate(event)"   autoComplete="off"
                                            onblur="onBlur(this)" onfocus="onFocus(this)"  id="field"/></td>
                            </tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr>
                                <td><font size="4.5">PASSWORD:</font></td>
                                <td> <input type="Password" name="pass" 
                                            required 
                                            value="Password"  
                                            autoComplete="off"
                                            onblur="onBlur(this)" onfocus="onFocus(this)"  id="pfield"/></td> </tr>
                            <tr></tr> 
                            <tr><td></td><td align="right"><font size="2"><u><a href="fp.pvk">Forgot Password</a></u></font></td></tr>
                            <tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr><tr></tr>
                    <tr> <td></td><td> <input type="submit" value="Login" id="sub" /></td></tr>
                </table>
                <br>  <br>  
            </html:form>
        </section>

    </div>
    <p class="footer">Copyright &copy; 2015 <a target="_blank" href="http://technicalgoals.blogspot.in/">Ashok Chakravarthy Thota</a><br />
    </p>
</div>
</body>
</html>
