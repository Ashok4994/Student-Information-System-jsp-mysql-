<%-- 
    Document   : About
    Created on : May 30, 2015, 7:16:07 PM
    Author     : PEDDI'S
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<% String contextPath = request.getContextPath();%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Feedback Page</title>
        <link rel="stylesheet" type="text/css" href="<%=contextPath%>/Start/Css/Home/Home.css" title="Home" media="screen,projection" />

        <style>
            OPTION 
            { background:#666666;  height:42px;
              border:1px solid #d8d8d8;
              width:525px;text-align: center; }
            select {
                background-color: rgba(255, 255, 255, 0.2);
                text-align: center;
                font-size: 23px;
                color: white;
                -webkit-transition-duration: 0.25s;
                transition-duration: 0.25s;
                font-weight: 300;
                height:42px;
                border:1px solid #d8d8d8;
                width:525px;
            }
            form input {
                appearance: none;
                outline: 0;
                border: 1px solid rgba(255, 255, 255, 0.4);
                background-color: rgba(255, 255, 255, 0.2);
                border-radius: 3px;
                padding: 10px 15px;
                margin: 0 auto 10px auto;
                display: block;
                text-align: center;
                font-size: 23px;
                color: white;
                -webkit-transition-duration: 0.25s;
                transition-duration: 0.25s;
                font-weight: 300;
            }
            form {
                padding: 20px 0;
                position: relative;
                z-index: 2;
            }
            form input:hover {
                background-color: rgba(255, 255, 255, 0.4);
            }
            /*  transition for table */         form input:focus {
                background-color: white;
                width: 300px;
                color: #53e3a6;
            }
            #feedform {background:#333; text-align:left; border:4px solid #666; padding:15px 15px 5px 15px; margin:0 0 15px 0;}
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
              window.history.forward();
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
            function onBlur(el) {
                if (el.value == '') {
                    el.value = el.defaultValue;
                }
            }
            function onFocus(el) {

                el.value = '';

            }
            function ValidateContactForm()
            {
                var sname = document.forms[0].sfield;
                 var dname = document.forms[0].dfield;
                  if (dname.value == "0")
                {
                    window.Alert.render("Please select your Department");
                    dfield.focus();
                    return false;
                }
                 if (sname.value == "0")
                {
                    window.Alert.render("Please select your Semester");
                    sfield.focus();
                    return false;
                }
            }


        </script>
    </head>
    <body id="back">
        <%
            if (session.getAttribute("username") == null) {
                response.sendRedirect("./Start/feedback/logout.jsp");
            } else if (session.getAttribute("flog") == null) {
                response.sendRedirect("./Start/feedback/logout.jsp");
            }
        %>
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
            <div id="maincontent">
                <h2 id="hback">No need to <a target="_blank" href="https://www.google.com">make things</a> complicated...</h2>
                <div id="feedform" align="center">
                    <center><font color="red" size="4"><%
                        Object errf = request.getAttribute("errf");
                        if (errf == null) {
                        } else {
                            out.print(request.getAttribute("errf"));
                        }
                        %></font></center>
                        <html:form action="/fsem" method="post" onsubmit="return ValidateContactForm()" >
                             <center><select name="dname" id="dfield"  >
                                <option value="0">Select Department</option>
                                <option value="1">Computer Science Engineering</option>
                                <option value="2">Electronics And Communication Engineering</option>
                                <option value="3">Information Technology</option>
                                <option value="4">Electrical And Electronics Engineering</option>
                                <option value="5">Mechanical Engineering</option>
                                <option value="6">Civil Engineering</option> 
                                <option value="7">Aerospace Engineering</option>
                                <option value="8">Electronics And Instrumentation Engineering</option>
                                 </select> </center><br>
                        <input type="hidden" name="sid" value="<%=session.getAttribute("username")%>"/>
                        <center><select name="sname" id="sfield"  >
                                <option value="0">Select Semester</option>
                                <option value="1">1st Semester</option>
                                <option value="2">2nd Semester</option>
                                <option value="3">3rd Semester</option>
                                <option value="4">4th Semester</option>
                                <option value="5">5th Semester</option>
                                <option value="6">6th Semester</option> 
                                <option value="7">7th Semester</option>
                                <option value="8">8th Semester</option>
                            </select></center><br><br>
                        <html:submit value="Submit Semester" style=" width: 250px;"/>
                        </html:form>
                </div>
            </div>
        </div>
        <p class="footer">Copyright &copy; 2015 <a target="_blank" href="http://technicalgoals.blogspot.in/">Peddi Vamsi Krishna</a><br />
        </p>
    </body>
</html>