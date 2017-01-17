<%-- 
    Document   : aftloginhome
    Created on : Jun 12, 2015, 11:36:32 AM
    Author     : PEDDI'S
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String contextPath = request.getContextPath();%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="<%=contextPath%>/Start/Css/aftlgn.css" title="Home" media="screen,projection" />
        <title>JSP Page</title>
        <script language="javascript" type="text/javascript">
            window.history.forward();
        </script>
    </head>
    <body id="wrap" background="<%=contextPath%>/Start/Depart/cse/aftlgnbg.jpg">
       <%
             if (session.getAttribute("username") == null) {
                response.sendRedirect("./Start/Depart/cse/logout.jsp");
            }
            else if (session.getAttribute("dlog") == null) {
                response.sendRedirect("./Start/Depart/cse/logout.jsp");
            }
        %>
        <h1><img src="<%=contextPath%>/Start/Images/Home/1.jpg" width="35"/>&nbsp<a  href="http://lbrce.ac.in//">Lakireddy Balireddy College Of Engineering</a></h1>
        <p class="slogan">Student Information System</p>

        <div class="menu4">
            <a href="login.pvk" class="current"><span>Eighth Sem Home</span></a>
            <a href="eighthdayat.pvk" ><span>Day Attendance</span></a>
            <a href="eighthsdae.pvk" ><span>Attendence Entry</span></a>
            <a href="eighthsdme.pvk"><span>Mid Marks Entry</span></a>
            <a href="eighthsdsme.pvk"><span>Sem Marks Entry</span></a>
            <a href="eighthgrades.pvk"><span>Grades</span></a>
            <a href="./Start/Depart/cse/logout.jsp" ><span>Logout</span></a>
        </div><div class="menu4sub"> </div><br>



        <br>
        <div  id="maincontent">
            <p>A student information system (SIS) is a software application for education establishments to manage student data. Student Information Systems (often abbreviated as SIS systems) provide capabilities for retrieving student information and other assessment scores, build student schedules, track student attendance, and manage many other student-related data needs in a school.</p>
            <p></p>
        </div>
    </body>
</html>
