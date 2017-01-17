<%-- 
    Document   : scp
    Created on : Feb 6, 2016, 11:41:37 AM
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
        <script language="javascript" type="text/javascript">
            window.history.forward();
            function onBlur(el) {
                if (el.value == '') {
                    el.value = el.defaultValue;
                }
            }
            function onFocus(el) {
                el.value = '';
            }
            function ValidateContactForm()
            {

                var op = document.forms[0].op;
                var np = document.forms[0].np;
                var rnp = document.forms[0].rnp;
                if (op.value == "Enter Password Here" || op.value == "")
                {
                    alert("Please Enter Password!!!");
                    op.focus();
                    return false;
                } else if (np.value == "Enter New MailId Here" || np.value == "")
                {
                    alert("Please Enter New MailId!!!");
                    np.focus();
                    return false;
                } else if (rnp.value == "Re-Enter New MailId Here" || rnp.value == "")
                {
                    alert("Please Re-Enter New MailId!!!");
                    rnp.focus();
                    return false;
                } else if (rnp.value != np.value)
                {
                    alert("New MailId's are not Matching !!!");
                    rnp.focus();
                    return false;
                }
            }
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
                        <li><a href="spa.pvk">View Profile</a></li>
                        <li  ><a href="scp.pvk">Change Password</a></li>
                        <li class="current"><a href="scm.pvk">Change MailId</a></li>
                        <li><a href="./Start/Student/logout.jsp">Logout</a></li>
                    </ul>
                </div><!--close menubar-->	
            </nav>
            <div id="maincontent">
                <h2> Change Your Password Here:</h2><br>
                <html:form action="/scmi" method="post" onsubmit="return ValidateContactForm();" >
                    <input type="hidden" name="idp" value="<%=session.getAttribute("username")%>"/>
                    <center><font color="red" size="4"><%
                            Object status = request.getAttribute("status");
                            if (status == null) {
                            } else {
                                out.print(request.getAttribute("status"));
                            }
                            %></font></center>
                    <table align="center">
                        <tr>
                            <th>Enter Your  Password Here:</th>
                            <td></td>
                            <th> <input type="password" name="op" 
                                        required 
                                        value="Enter Password Here"  
                                        autoComplete="off"
                                        onblur="onBlur(this)" 
                                        onfocus="onFocus(this)"  id="op"/></th>
                        </tr>
                        <tr><th></th></tr>  <tr><th></th></tr>  <tr><th></th></tr>  <tr><th></th></tr> <tr><th></th></tr>  <tr><th></th></tr>  <tr><th></th></tr>  <tr><th></th></tr>
                        <tr>
                            <th>Enter Your New MailId Here:</th>
                            <td></td>
                            <th> <input type="text" name="np" 
                                        required 
                                        value="Enter New MailId Here"  
                                        autoComplete="off"
                                        onblur="onBlur(this)" 
                                        onfocus="onFocus(this)"  id="np"/></th>
                        </tr>  <tr><th></th></tr>  <tr><th></th></tr>  <tr><th></th></tr>  <tr><th></th></tr> <tr><th></th></tr>  <tr><th></th></tr>  <tr><th></th></tr>  <tr><th></th></tr>
                        <tr>
                            <th>Re-Enter Your New MailId Here:</th>
                            <td></td>
                            <th> <input type="text" name="rnp" 
                                        required 
                                        value="Re-Enter New MailId Here"  
                                        autoComplete="off"
                                        onblur="onBlur(this)" 
                                        onfocus="onFocus(this)"  id="rnp"/></th>
                        </tr> <tr><th></th></tr>  <tr><th></th></tr>  <tr><th></th></tr>  <tr><th></th></tr> <tr><th></th></tr>  <tr><th></th></tr>  <tr><th></th></tr>  
                    </table>
                    <center>  <input type="submit" value="Update"  /></center>
                    </html:form>
            </div>
    </body>
</html>
