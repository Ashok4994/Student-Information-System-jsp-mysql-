<%-- 
    Document   : sde
    Created on : Jun 16, 2015, 9:50:05 PM
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
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="<%=contextPath%>/Start/Css/aftlgn.css" title="Home" media="screen,projection" />
        <script language="javascript" type="text/javascript">
            window.history.forward();
        </script>
    </head>
    <body id="wrap" background="<%=contextPath%>/Start/Depart/cse/aftlgnbg.jpg" >
       <%
            if (session.getAttribute("username") == null) {
                response.sendRedirect("./Start/Depart/cse/logout.jsp");
            }
            else if (session.getAttribute("dlog") == null) {
                response.sendRedirect("./Start/Depart/cse/logout.jsp");
            }
        %>
        <% int k = 1;%>

        <h1><img src="<%=contextPath%>/Start/Images/Home/1.jpg" width="35"/>&nbsp<a  href="http://lbrce.ac.in//">Lakireddy Balireddy College Of Engineering</a></h1>
        <p class="slogan">Student Information System</p>

        <div class="menu4">
             <a href="login.pvk"  ><span>Fifth Sem Home</span></a>
             <a href="fifthdayat.pvk" ><span>Day Attendance</span></a>
            <a href="fifthsdae.pvk" ><span>Attendence Entry</span></a>
            <a href="fifthsdme.pvk" class="current"><span>Mid Marks Entry</span></a>
            <a href="fifthsdsme.pvk"><span>Sem Marks Entry</span></a>
            <a href="fifthgrades.pvk"><span>Grades</span></a>
            <a href=" ./Start/Depart/cse/logout.jsp" ><span>Logout</span></a>

        </div>
        <div class="menu4sub"> </div>
        <br>
        <div  id="maincontent">  
            <html:form action="fifthsdme">
                <logic:notEmpty name="list">
                    <table align="center" border="1" >
                        <tr align="center" bgcolor="green" style="color:white;">
                            <th>RollNo</th>
                            <th>Student name</th>
                            <th>Section</th>
                           <th>Daa</th>
                            <th>Atfl</th>
                            <th>Ooad</th>
                            <th>Ppl</th>
                            <th>Mpi</th>
                            <th>Stm</th>
                            <th>Ooadlab</th>
                            <th>Mpilab</th>
                            <th>Seminar2</th>
                        </tr>

                        <logic:iterate name="list" id="user" >
                            <tr>
                                <td bgcolor="yellow" style="color:black;" ><input  type="hidden" name="sid<%=k%>" value="${user.sid}"/>${user.sid}</td>
                                <td bgcolor="skyblue ">${user.sname}</td>
                                <td bgcolor="violet"><bean:write name="user" property="section"/></td>
                                <td ><input size="3" type="number"  readonly  name="mcn<%=k%>" value="${user.mcn}" min="0" max="20"/></td>
                                <td ><input size="3" type="number"  readonly  name="mcd<%=k%>" value="${user.mcd}" min="0" max="20"/></td>
                                <td ><input size="3" type="number"  readonly  name="mwt<%=k%>" value="${user.mwt}" min="0" max="20"/></td>
                                <td ><input size="3" type="number"  readonly  name="mli<%=k%>" value="${user.mli}" min="0" max="20"/></td>
                                <td ><input size="3" type="number"  readonly  name="mcg<%=k%>" value="${user.mcg}" min="0" max="20"/></td>
                                <td ><input size="3" type="number"  readonly  name="mpe<%=k%>" value="${user.mpe}" min="0" max="20"/></td>
                                 <td ><input size="3" type="number"  readonly  name="mwtlab<%=k%>" value="${user.mwtlab}" min="0" max="20"/></td>
                                <td ><input size="3" type="number"  readonly  name="mlilab<%=k%>" value="${user.mlilab}" min="0" max="20"/></td>
                                <td ><input size="3" type="number"  readonly  name="mcompviva1<%=k%>" value="${user.mcompviva1}" min="0" max="20"/></td>
                                    <%k++;%>
                            </tr>
                        </logic:iterate>
                    </table>
                    <input type="hidden" name="sdme"  value="<%=k%>"/>
                </logic:notEmpty>
               
                </html:form>
        </div>
    </body>
</html>