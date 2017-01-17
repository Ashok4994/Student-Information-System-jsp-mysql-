<%-- 
    Document   : profile
    Created on : Feb 5, 2016, 10:51:42 PM
    Author     : PEDDI'S
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<% String contextPath = request.getContextPath();%>
<!DOCTYPE html>
<html>
    <head>   <link rel="stylesheet" type="text/css" href="<%=contextPath%>/Start/Css/Home/Home.css" title="Home" media="screen,projection" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Details</title> 
        <style>
            .CSSTableGenerator {
                margin:0px;padding:0px;
                width:100%;	box-shadow: 10px 10px 5px #888888;
                border:1px solid #000000;

                -moz-border-radius-bottomleft:15px;
                -webkit-border-bottom-left-radius:15px;
                border-bottom-left-radius:15px;

                -moz-border-radius-bottomright:15px;
                -webkit-border-bottom-right-radius:15px;
                border-bottom-right-radius:15px;

                -moz-border-radius-topright:15px;
                -webkit-border-top-right-radius:15px;
                border-top-right-radius:15px;

                -moz-border-radius-topleft:15px;
                -webkit-border-top-left-radius:15px;
                border-top-left-radius:15px;
            }.CSSTableGenerator table{
                width:100%;
                height:100%;
                margin:0px;padding:0px;
            }.CSSTableGenerator tr:last-child td:last-child {
                -moz-border-radius-bottomright:15px;
                -webkit-border-bottom-right-radius:15px;
                border-bottom-right-radius:15px;
            }
            .CSSTableGenerator table tr:first-child td:first-child {
                -moz-border-radius-topleft:15px;
                -webkit-border-top-left-radius:15px;
                border-top-left-radius:15px;
            }
            .CSSTableGenerator table tr:first-child td:last-child {
                -moz-border-radius-topright:15px;
                -webkit-border-top-right-radius:15px;
                border-top-right-radius:15px;
            }.CSSTableGenerator tr:last-child td:first-child{
                -moz-border-radius-bottomleft:15px;
                -webkit-border-bottom-left-radius:15px;
                border-bottom-left-radius:15px;
            }.CSSTableGenerator tr:hover td{

            }.CSSTableGenerator tr:nth-child(odd){ background-color:#e5e5e5; }
            .CSSTableGenerator tr:nth-child(even)    { background-color:#ffffff; }
            .CSSTableGenerator td{
                vertical-align:middle;
                border:1px solid #000000;
                border-width:0px 1px 1px 0px;
                text-align:left;
                padding:7px;
                font-size:10px;
                font-family:Arial;
                font-weight:normal;
                color:#000000;
            }.CSSTableGenerator tr:last-child td{
                border-width:0px 1px 0px 0px;
            }.CSSTableGenerator tr td:last-child{
                border-width:0px 0px 1px 0px;
            }.CSSTableGenerator tr:last-child td:last-child{
                border-width:0px 0px 0px 0px;
            }
            .CSSTableGenerator tr:first-child td{
                background:-o-linear-gradient(bottom, #4c4c4c 5%, #000000 100%);	background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #4c4c4c), color-stop(1, #000000) );	background:-moz-linear-gradient( center top, #4c4c4c 5%, #000000 100% );	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr="#4c4c4c", endColorstr="#000000");	background: -o-linear-gradient(top,#4c4c4c,000000);
                background-color:#4c4c4c;
                border:0px solid #000000;
                text-align:center;
                border-width:0px 0px 1px 1px;
                font-size:14px;
                font-family:Arial;
                font-weight:bold;
                color:#ffffff;
            }
            .CSSTableGenerator tr:first-child:hover td{
                background:-o-linear-gradient(bottom, #4c4c4c 5%, #000000 100%);	background:-webkit-gradient( linear, left top, left bottom, color-stop(0.05, #4c4c4c), color-stop(1, #000000) );	background:-moz-linear-gradient( center top, #4c4c4c 5%, #000000 100% );	filter:progid:DXImageTransform.Microsoft.gradient(startColorstr="#4c4c4c", endColorstr="#000000");	background: -o-linear-gradient(top,#4c4c4c,000000);
                background-color:#4c4c4c;
            }
            .CSSTableGenerator tr:first-child td:first-child{
                border-width:0px 0px 1px 0px;
            }
            .CSSTableGenerator tr:first-child td:last-child{
                border-width:0px 0px 1px 1px;
            }
            .myButton {
                -moz-box-shadow: 0px 1px 0px 0px #fff6af;
                -webkit-box-shadow: 0px 1px 0px 0px #fff6af;
                box-shadow: 0px 1px 0px 0px #fff6af;
                background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #ffec64), color-stop(1, #ffab23));
                background:-moz-linear-gradient(top, #ffec64 5%, #ffab23 100%);
                background:-webkit-linear-gradient(top, #ffec64 5%, #ffab23 100%);
                background:-o-linear-gradient(top, #ffec64 5%, #ffab23 100%);
                background:-ms-linear-gradient(top, #ffec64 5%, #ffab23 100%);
                background:linear-gradient(to bottom, #ffec64 5%, #ffab23 100%);
                filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#ffec64', endColorstr='#ffab23',GradientType=0);
                background-color:#ffec64;
                -moz-border-radius:6px;
                -webkit-border-radius:6px;
                border-radius:6px;
                border:1px solid #e68f0e;
                display:inline-block;
                cursor:pointer;
                color:#333333;
                font-family:Arial;
                font-size:15px;
                font-weight:bold;
                padding:6px 24px;
                text-decoration:none;
                text-shadow:0px 1px 0px #ffee66;
            }
            .myButton:hover {
                background:-webkit-gradient(linear, left top, left bottom, color-stop(0.05, #ffab23), color-stop(1, #ffec64));
                background:-moz-linear-gradient(top, #ffab23 5%, #ffec64 100%);
                background:-webkit-linear-gradient(top, #ffab23 5%, #ffec64 100%);
                background:-o-linear-gradient(top, #ffab23 5%, #ffec64 100%);
                background:-ms-linear-gradient(top, #ffab23 5%, #ffec64 100%);
                background:linear-gradient(to bottom, #ffab23 5%, #ffec64 100%);
                filter:progid:DXImageTransform.Microsoft.gradient(startColorstr='#ffab23', endColorstr='#ffec64',GradientType=0);
                background-color:#ffab23;
            }
            .myButton:active {
                position:relative;
                top:1px;
            }
        </style>
        <script language="javascript" type="text/javascript">
            window.history.forward();
        </script>
    </head>
    <body id="back">
         <%
           if (session.getAttribute("username") == null) {
                response.sendRedirect("./Start/Student/logout.jsp");
            }
           else if (session.getAttribute("slog") == null) {
                response.sendRedirect("./Start/Student/logout.jsp");
            }
        %>
        <div id="wrap">
            <h1><img src="<%=contextPath%>/Start/Images/Home/1.jpg" width="35"/>&nbsp<a target="_blank" href="https://lbrce.ac.in//">Lakireddy Balireddy College Of Engineering</a></h1>
            <h3 class="slogan"><b>Student Information System</b></h3>
            <nav>
                <div id="menubar">
                    <ul id="nav" >
                        <li ><a href="shome.pvk">Home</a></li>
                        <li class="current"><a href="spa.pvk">View Profile</a></li>
                        <li><a href="scp.pvk">Change Password</a></li>
                        <li><a href="scm.pvk">Change MailId</a></li>
                        <li><a href="./Start/Student/logout.jsp">Logout</a></li>
                    </ul>
                </div><!--close menubar-->	
            </nav>
            <div id="maincontent">
                <html:form action="spa" >
                    <input type="hidden" name="idp" value="<%=session.getAttribute("username")%>"/>
                    <center> 
                        <input  type="submit"  value="Get MY Profile"  class="myButton"/>
                    </center>
                </html:form><br>
                <table border="1" class="CSSTableGenerator"> 
                    <tr>
                        <td>Student Id</td>
                        <logic:iterate id="user" name="list">       
                            <th><font size="2" color="000000"><center><b><bean:write name="user" property="sid"/></b></center></font></th>
                            </logic:iterate>
                    </tr>
                </table>
                <br>
                <table border="1" class="CSSTableGenerator"> 
                    <tr>
                        <td>Student Name</td>
                        <logic:iterate id="user" name="list">       
                            <th><font size="2" color="000000"><center><b><bean:write name="user" property="sname"/></b></center></font></th>
                            </logic:iterate>
                    </tr>
                </table>
                <br>
                <table border="1" class="CSSTableGenerator"> 
                    <tr>
                        <td>Registered MailId</td>
                        <logic:iterate id="user" name="list">       
                            <th><font size="2" color="000000"><center><b><bean:write name="user" property="email"/></b></center></font></th>
                            </logic:iterate>
                    </tr>
                </table><br><br>
            </div>
        </div>
    </body>
</html>
