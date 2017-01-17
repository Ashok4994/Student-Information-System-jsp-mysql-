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
                        <li class="current"><a href="feedbacka.pvk">Feedback</a></li>
                        <li><a href="./Start/admin/logout.jsp">Logout</a></li>
                    </ul>
                </div><!--close menubar-->	
            </nav>
        </div>
        <div id="content">
            <div id="scrollContent">
                <html:form action="adminfeedloginset.pvk" method="post">
                     <h3 align="center">Here If You Update The Login Status to "0" Then Only Students are allowed To Login And Submit Their Feedbacks</h3><br>
                    <logic:notEmpty name="list">
                        <center> <table align="center" border="1" >
                            <tr align="center" bgcolor="green" style="color:white;">
                                <th>Student ID</th>
                                <th>Student Login Status</th>
                            </tr>
                            <logic:iterate name="list" id="user" >
                                <tr>
                                    <td ><input readonly autocomplete="off" size="3" type="text"  name="sid<%=k%>" value="${user.sid}" /></td>
                                    <td ><input readonly autocomplete="off" type="text"  name="log<%=k%>" value="${user.log}" /></td> 
                                        <%k++;%>
                                </tr>
                            </logic:iterate>
                            </table></center>
                        <input type="hidden" name="sdae"  value="<%=k%>"/>
                    </logic:notEmpty>
                    <br> <center><input type="submit" value="Update Login Status" /></center>
                    </html:form>

            </div>
        </div>
    </body>
</html>
