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

        <h1><img src="<%=contextPath%>/Start/Images/Home/1.jpg" width="35"/>&nbsp<a  href="https://lbrce.ac.in//">Lakireddy Balireddy College Of Engineering</a></h1>
        <p class="slogan">Student Information System</p>

        <div class="menu4">
            <a href="login.pvk"  ><span>Seventh Sem Home</span></a>
            <a href="seventhdayat.pvk" ><span>Day Attendance</span></a>
            <a href="seventhsdae.pvk" ><span>Attendence Entry</span></a>
            <a href="seventhsdme.pvk" ><span>Mid Marks Entry</span></a>
            <a href="seventhsdsme.pvk"><span>Sem Marks Entry</span></a>
            <a href="seventhgrades.pvk" class="current"><span>Grades</span></a>
            <a href="./Start/Depart/cse/logout.jsp" ><span>Logout</span></a>

        </div>
        <div class="menu4sub"> </div>
        <br>
        <div  id="maincontent">  
            <html:form action="seventhgrades">
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
                            <th>NBL</th>
                            <th>Sgpa</th>
                            <th>Cgpa</th>
                        </tr>
                        <logic:iterate name="list" id="user" >
                            <tr>
                                <td bgcolor="yellow" style="color:black;" ><input  type="hidden" name="sid<%=k%>" value="${user.sid}"/>${user.sid}</td>
                                <td bgcolor="skyblue ">${user.sname}</td>
                                <td bgcolor="violet"><bean:write name="user" property="section"/></td>
                                <td ><input size="1" type="text"  name="scn<%=k%>" value="${user.scn}" readonly/></td>
                                <td ><input size="1" type="text"  name="scd<%=k%>" value="${user.scd}" readonly/></td>
                                <td ><input size="1" type="text"  name="swt<%=k%>" value="${user.swt}" readonly/></td>
                                <td ><input size="1" type="text"  name="sli<%=k%>" value="${user.sli}" readonly/></td>
                                <td ><input size="1" type="text"  name="scg<%=k%>" value="${user.scg}" readonly/></td>
                                <td ><input size="1" type="text"  name="spe<%=k%>" value="${user.spe}" readonly/></td>
                                <td ><input size="1" type="text"  name="swtlab<%=k%>" value="${user.swtlab}" readonly/></td>
                                <td ><input size="1" type="text"  name="slilab<%=k%>" value="${user.slilab}" readonly/></td>
                                <td ><input size="1" type="text"  name="scompviva1<%=k%>" value="${user.scompviva1}" readonly/></td>
                                 <td ><input size="1" type="text"  name="sdtp<%=k%>" value="${user.sdtp}" readonly/></td>
                                <td ><input size="1" type="text"  name="nbl<%=k%>" value="${user.nbl}" readonly/></td>
                                <td ><input size="1" type="text"  name="sgpa<%=k%>" value="${user.sgpa}" readonly/></td>
                                <td ><input size="1" type="text"  name="cgpa<%=k%>" value="${user.cgpa}" readonly/></td>
                                    <%k++;%>
                            </tr>
                        </logic:iterate>
                    </table>
                    <input type="hidden" name="sdsme"  value="<%=k%>"/>
                </logic:notEmpty>
                
                </html:form>
        </div>
    </body>
</html>