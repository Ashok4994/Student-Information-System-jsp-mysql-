<%-- 
    Document   : sdae
    Created on : Jun 16, 2015, 11:21:59 PM
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
                response.sendRedirect("./Start/Depart/cse/registar/logout.jsp");
            }
            else if (session.getAttribute("rlog") == null) {
                response.sendRedirect("./Start/Depart/cse/registar/logout.jsp");
            }
        %>
        <% int k = 1;%>
        <h1><img src="<%=contextPath%>/Start/Images/Home/1.jpg" width="35"/>&nbsp<a target="_blank" href="http://lbrce.ac.in/">Lakireddy Balireddy College Of Engineering</a></h1>
        <p class="slogan">Student Information System</p>

        <div class="menu4">
              <a href="rhome.pvk"  ><span>Fifth Sem Home</span></a>
           
            <a href="fifthsdaer.pvk" class="current"><span>Attendence Entry</span></a>
            <a href="fifthsdmer.pvk" ><span>Mid Marks Entry</span></a>
            <a href="fifthsdsmer.pvk"><span>Sem Marks Entry</span></a>
            <a href="fifthgradesr.pvk"><span>Grades</span></a>
            <a href="./Start/Depart/cse/registar/logout.jsp" ><span>Logout</span></a>

        </div>
        <div class="menu4sub"> </div>
        <br>
        <div  id="maincontent">  
            <html:form action="fifthsdaer">
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
                            <th>Pe</th>
                            <th>Ooadlab</th>
                            <th>Mpilab</th>
                            <th>Seminar2</th>
                             <th>FATT</th>
                        </tr>
                        <logic:iterate name="list" id="user" >
                            <tr>
                                <td bgcolor="yellow" style="color:black;" ><input  type="hidden" name="sid<%=k%>" value="${user.sid}"/>${user.sid}</td>
                                <td bgcolor="skyblue ">${user.sname}</td>
                                <td bgcolor="violet"><bean:write name="user" property="section"/></td>
                                <td ><input size="3" type="text"  name="acn<%=k%>" value="${user.acn}" readonly/></td>
                                <td ><input size="3" type="text"  name="acd<%=k%>" value="${user.acd}" readonly/></td>
                                <td ><input size="3" type="text"  name="awt<%=k%>" value="${user.awt}" readonly/></td>
                                <td ><input size="3" type="text"  name="ali<%=k%>" value="${user.ali}" readonly/></td>
                                <td ><input size="3" type="text"  name="acg<%=k%>" value="${user.acg}" readonly/></td>
                                <td ><input size="3" type="text"  name="ape<%=k%>" value="${user.ape}" readonly/></td>
                                <td ><input size="3" type="text"  name="awtlab<%=k%>" value="${user.awtlab}" readonly/></td>
                                <td ><input size="3" type="text"  name="alilab<%=k%>" value="${user.alilab}" readonly/></td>
                                <td ><input size="3" type="text"  name="acompviva1<%=k%>" value="${user.acompviva1}" readonly/></td>
                                <td ><input size="3" type="text"  name="a<%=k%>" value="${user.a}" readonly/></td>
                                    <%k++;%>
                            </tr>
                        </logic:iterate>
                    </table>
                    <input type="hidden" name="sdae"  value="<%=k%>"/>
                </logic:notEmpty>
               
                </html:form>
        </div>
    </body>
</html>
