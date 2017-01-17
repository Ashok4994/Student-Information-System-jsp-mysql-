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
                response.sendRedirect("./Start/Depart/cse/registar/logout.jsp");
            }
            else if (session.getAttribute("rlog") == null) {
                response.sendRedirect("./Start/Depart/cse/registar/logout.jsp");
            }
        %>
        <% int k = 1;%>

        <h1><img src="<%=contextPath%>/Start/Images/Home/1.jpg" width="35"/>&nbsp<a target="_blank" href="http://lbrce.ac.in//">Lakireddy Balireddy College Of Engineering</a></h1>
        <p class="slogan">Student Information System</p>

        <div class="menu4">
             <a href="rhome.pvk"  ><span>Seventh Sem Home</span></a>
            <a href="seventhsdaer.pvk" ><span>Attendence Entry</span></a>
            <a href="seventhsdmer.pvk" ><span>Mid Marks Entry</span></a>
            <a href="seventhsdsmer.pvk" class="current"><span>Sem Marks Entry</span></a>
            <a href="seventhgradesr.pvk"><span>Grades</span></a>
            <a href=" ./Start/Depart/cse/registar/logout.jsp" ><span>Logout</span></a>

        </div>
        <div class="menu4sub"> </div>
        <br>
        <div  id="maincontent">  
            <html:form action="seventhsdsmer">
                <logic:notEmpty name="list">
                    <table align="center" border="1" >
                        <tr align="center" bgcolor="green" style="color:white;">
                            <th>RollNo</th>
                            <th>Student name</th>
                            <th>Section</th>
                           <th>is</th>
                            <th>dmdw</th>
                            <th>mc</th>
                            <th>spm</th>
                            <th>aca</th>
                            <th>ai</th>
                            <th>mclab</th>
                            <th>stmlab</th>
                            <th>internship</th>
                            <th>termpaper</th>
                        </tr>
                        <logic:iterate name="list" id="user" >
                            <tr>
                                <td bgcolor="yellow" style="color:black;" ><input  type="hidden" name="sid<%=k%>" value="${user.sid}" "/>${user.sid}</td>
                                <td bgcolor="skyblue ">${user.sname}</td>
                                <td bgcolor="violet"><bean:write name="user" property="section"/></td>
                                <td ><input size="3" type="number"  name="scn<%=k%>" value="${user.scn}" min="0" max="75"/></td>
                                <td ><input size="3" type="number"  name="scd<%=k%>" value="${user.scd}" min="0" max="75"/></td>
                                <td ><input size="3" type="number"  name="swt<%=k%>" value="${user.swt}" min="0" max="75"/></td>
                                <td ><input size="3" type="number"  name="sli<%=k%>" value="${user.sli}" min="0" max="75"/></td>
                                <td ><input size="3" type="number"  name="scg<%=k%>" value="${user.scg}" min="0" max="75"/></td>
                                <td ><input size="3" type="number"  name="spe<%=k%>" value="${user.spe}" min="0" max="75"/></td>
                                <td ><input size="3" type="number"  name="swtlab<%=k%>" value="${user.swtlab}" min="0" max="75"/></td>
                                <td ><input size="3" type="number"  name="slilab<%=k%>" value="${user.slilab}" min="0" max="75"/></td>
                                <td ><input size="3" type="number"  name="scompviva1<%=k%>" value="${user.scompviva1}" min="0" max="75"/></td>
                                 <td ><input size="3" type="number"  name="sdtp<%=k%>" value="${user.sdtp}" min="0" max="75"/></td>
                                    <%k++;%>
                            </tr>
                        </logic:iterate>
                    </table>
                    <%System.out.println("k in jsp=" + k);%>
                    <input type="hidden" name="sdsme"  value="<%=k%>"/>

                </logic:notEmpty>
                <%System.out.println("k in f jsp=" + k);%>
                <br><center><input type="submit" value="Update Marks" /></center>
                </html:form>
        </div>
    </body>
</html>