<%-- 
    Document   : hheader
    Created on : May 30, 2015, 6:52:59 PM
    Author     : PEDDI'S
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String contextPath = request.getContextPath();%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="<%=contextPath%>/Start/Css/Home/Home.css" title="Home" media="screen,projection" />
    </head>
    <body id="back">
              <div id="wrap">
            <h1><img src="<%=contextPath%>/Start/Images/Home/1.jpg" width="35"/>&nbsp<a  href="http://lbrce.ac.in/" target="_blank"">Lakireddy Balireddy College Of Engineering</a></h1>
            <h3 class="slogan"><b>Student Information System</b></h3>
            <nav>
                <div id="menubar">
                    <ul id="nav">
                        <li><a href="Home.pvk">Home</a></li>
                        <li><a href="Depart.pvk">Departments Home</a></li>
                        <li ><a href="Student.pvk">Student Information Form</a></li>
                        <li class="current"><a href="Feedback.pvk">Feedback Form</a></li>

                    </ul>
                </div><!--close menubar-->	
            </nav>
          

            <div id="maincontent">

                <h2 id="hback">No need to <a href="https://www.google.com" target="_blank">make things</a> complicated...</h2>
               </div>

            
          </div>
    </body>
</html>
