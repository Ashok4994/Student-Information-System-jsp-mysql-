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
            <div id="scrollContent" >
                <html:form action="adminmailfeedback.pvk" method="post">
                    <center><font color="red" size="5"><%
                        Object status = request.getAttribute("status");
                        if (status == null) {
                        } else {
                            out.print(request.getAttribute("status"));
                        }
                        %></font></center>
                    <center><font color="red" size="5"><%
                        Object mail = request.getAttribute("mail");
                        if (mail == null) {
                        } else {
                            out.print(request.getAttribute("mail"));
                        }
                        %></font></center><br>
                    <input type="hidden" name="dep" value="<%=request.getAttribute("dep")%>"/>
                    <input type="hidden" name="sem" value="<%=request.getAttribute("sem")%>"/>
                    <logic:notEmpty name="list">
                        <center><table align="center"  border="1" >
                                <tr align="center" bgcolor="green" style="color:white;">
                                    <th>SNO</th>
                                    <th>Subject Name</th>
                                    <th>Qn1</th>
                                    <th>Qn2</th>
                                    <th>Qn3</th>
                                    <th>Qn4</th>
                                    <th>Qn5</th>
                                    <th>Total</th>
                                    <th>No Mem Submitted</th>
                                </tr>
                                <logic:iterate name="list" id="user" >
                                    <tr style="width:10px">
                                        <td ><input style="width:70px;" readonly autocomplete="off" size="3" type="text"  name="subid<%=k%>" value="${user.subid}" /></td>
                                        <td ><input style="width:400px;" readonly autocomplete="off" size="10" type="text"  name="subname<%=k%>" value="${user.subname}" /></td>
                                        <td ><input style="width:70px;" readonly autocomplete="off" size="3" type="text"  name="qn1n<%=k%>" value="${user.qn1n}" /></td>
                                        <td ><input style="width:70px;" readonly autocomplete="off" size="3" type="text"  name="qn2n<%=k%>" value="${user.qn2n}" /></td>
                                        <td ><input style="width:70px;" readonly autocomplete="off" type="text"  name="qn3n<%=k%>" value="${user.qn3n}" /></td>
                                        <td ><input style="width:70px;" readonly autocomplete="off" type="text"  name="qn4n<%=k%>" value="${user.qn4n}" /></td> 
                                        <td ><input style="width:70px;" readonly autocomplete="off" size="3" type="text"  name="qn5n<%=k%>" value="${user.qn5n}" /></td>
                                        <td ><input style="width:70px;" readonly autocomplete="off" type="text"  name="finalfeed<%=k%>" value="${user.finalfeed}" /></td>
                                        <td ><input style="width:150px;" readonly autocomplete="off" type="text"  name="mem<%=k%>" value="${user.mem}" /></td> 
                                            <%k++;%>
                                    </tr>
                                </logic:iterate>
                            </table></center>
                        <input type="hidden" name="sdae"  value="<%=k%>"/>
                    </logic:notEmpty>
                    <br> <center>
                        <logic:empty name="mail"><input type="submit" value="Send Mail To Department Head" />
                        </logic:empty> </center> <br>
                    </html:form>

            </div>
        </div>
    </body>
</html>
