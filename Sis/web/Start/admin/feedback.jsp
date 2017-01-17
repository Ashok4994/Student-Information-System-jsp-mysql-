<%-- 
    Document   : ahome
    Created on : Feb 27, 2016, 11:14:36 AM
    Author     : PEDDI'S
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<% String contextPath = request.getContextPath();%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="<%=contextPath%>/Start/admin/Css/style.css" type="text/css" media="screen" />
        <link rel="stylesheet" href="<%=contextPath%>/Start/Css/prettyPhoto.css" type="text/css" media="screen" />
        <script SRC="<%=contextPath%>/Start/Css/scripts.js" type="text/javascript"></script>
        <title>JSP Page</title>
        <script>
            window.history.forward();
        </script>
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

        </style>
        <script type="text/javascript" language="javascript" >
            window.history.forward();
            function ValidateContactForm()
            {
                var sname = document.forms[0].sfield;
                var dname = document.forms[0].dfield;
                if (dname.value == "0")
                {
                    alert("Please select your Department");
                    dfield.focus();
                    return false;
                }
                if (sname.value == "0")
                {
                    alert("Please select your Semester");
                    sfield.focus();
                    return false;
                }
            }
        </script>
    </head>
    <body>
        <%
            if (session.getAttribute("username") == null) {
                response.sendRedirect("./Start/admin/logout.jsp");
            } else if (session.getAttribute("alog") == null) {
                response.sendRedirect("./Start/admin/logout.jsp");
            }
        %><% int k = 1;%>
        <div id="wrap">
            <h1><img src="<%=contextPath%>/Start/Images/Home/1.jpg" width="35"/>&nbsp<a target="_blank" href="http://lbrce.ac.in/" target="_blank">Lakireddy Balireddy College Of Engineering</a></h1>
            <h3 class="slogan"><b>Student Information System</b></h3>
            <nav>
                <div id="menubar">
                    <ul id="nav">
                        <li ><a href="ahome.pvk">Home</a></li>
                        <li ><a href="addmentor.pvk">Add New Mentor</a></li>
                        <li><a href="deletementor.pvk">Delete Mentor</a></li>
                        <li class="current"><a href="">Feedback</a></li>
                        <li><a href="./Start/admin/logout.jsp">Logout</a></li>
                    </ul>
                </div><!--close menubar-->	
            </nav>
        </div>
        <div id="content">
            <div id="scrollContent">
                <html:form action="/feedemail.pvk" method="post"  onsubmit="return ValidateContactForm()">
                    <center><font color="red" size="4"><%
                        Object status = request.getAttribute("status");
                        if (status == null) {
                        } else {
                            out.print(request.getAttribute("status"));
                        }
                        %></font></center>
                    <h2 align="center">Mail Feedbacks To Concern Department HOD's</h2><br>
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
                        </select></center><br><h5 align="center" ><a  href="adminfeedloginset.pvk" style="color: greenyellow">Do You Want To Set Feedback Login Status! Click Here</a></h5>
                    <br> <center><input type="submit" value="Submit" /></center><br><br><br><br><br>
                    </html:form>

            </div>
        </div>
    </body>
</html>
