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
            function saveCN()
            {
                document.forms[0].m.value = "saveCN";
                document.forms[0].submit();
            }
            function saveCD()
            {
                document.forms[0].m.value = "saveCD";
                document.forms[0].submit();
            }
            function saveWT()
            {
                document.forms[0].m.value = "saveWT";
                document.forms[0].submit();
            }
            function saveLI()
            {
                document.forms[0].m.value = "saveLI";
                document.forms[0].submit();
            }
            function saveCG()
            {
                document.forms[0].m.value = "saveCG";
                document.forms[0].submit();
            }
            function savePE()
            {
                document.forms[0].m.value = "savePE";
                document.forms[0].submit();
            }
            function saveWTLAB()
            {
                document.forms[0].m.value = "saveWTLAB";
                document.forms[0].submit();
            }
            function saveLILAB()
            {
                document.forms[0].m.value = "saveLILAB";
                document.forms[0].submit();
            }
            function saveCVIVA()
            {
                document.forms[0].m.value = "saveCVIVA";
                document.forms[0].submit();
            }
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
             <a href="login.pvk" ><span>Fifth Sem Home</span></a>
            <a href="fifthdayat.pvk" class="current"><span>Day Attendance</span></a>
            <a href="fifthsdae.pvk" ><span>Attendence Entry</span></a>
            <a href="fifthsdme.pvk"><span>Mid Marks Entry</span></a>
            <a href="fifthsdsme.pvk"><span>Sem Marks Entry</span></a>
            <a href="fifthgrades.pvk"><span>Grades</span></a>
            <a href="./Start/Depart/cse/logout.jsp" ><span>Logout</span></a>
        </div>
        <div class="menu4sub"> </div>
        <br>
        <div  id="maincontent">  
            <!--            <center><input type="date" name="bday" ></center><br>-->
            <logic:notEmpty name="error"><p align="center" ><font color="red" size="6">Not updated!!!<%=request.getAttribute("error")%></font></p></logic:notEmpty>
            <logic:notEmpty name="status"><p align="center" ><font color="red" size="6">Your attendance is Updated!!!<%=request.getAttribute("status")%></font></p></logic:notEmpty>
                <html:form action="/fifthdayat">
                <input type="hidden" name="mode" id="m" value="save" />
                <logic:notEmpty name="list">
                    <table align="center" border="1" >
                        <tr align="center" bgcolor="green" style="color:white;">
                            <th>RollNo</th>
                            <th>Student name</th>
                            <th>Section</th>
                            <th>Daa<table><tr><td>p</td><td></td><td></td><td>a</td></tr></table></th>
                            <th>Atfl<table><tr><td>p</td><td></td><td></td><td>a</td></tr></table></th>
                            <th>Ooad<table><tr><td>p</td><td></td><td></td><td>a</td></tr></table></th>
                            <th>Ppl<table><tr><td>p</td><td></td><td></td><td>a</td></tr></table></th>
                            <th>Mpi<table><tr><td>p</td><td></td><td></td><td>a</td></tr></table></th>
                            <th>Stm<table><tr><td>p</td><td></td><td></td><td>a</td></tr></table></th>
                            <th>Ooadlab<table><tr><td>p</td><td></td><td></td><td>a</td></tr></table></th>
                            <th>Mpilab<table><tr><td>p</td><td></td><td></td><td>a</td></tr></table></th>
                            <th>Seminar2<table><tr><td>p</td><td></td><td></td><td>a</td></tr></table></th>
                        </tr>
                        <logic:iterate name="list" id="user" >
                            <tr>
                                <td bgcolor="yellow" style="color:black;" ><input  type="hidden" name="sid<%=k%>" value="${user.sid}"/>${user.sid}</td>
                                <td bgcolor="skyblue ">${user.sname}</td>
                                <td bgcolor="violet"><bean:write name="user" property="section"/></td> 
                                <td ><input size="1" type="radio"  name="dcn<%=k%>" value="p" checked="" id="dcn"/>
                                    <input size="1" type="radio"  name="dcn<%=k%>" value="a" id="dcn"/></td>
                                <td ><input size="3" type="radio"  name="dcd<%=k%>" value="p" checked="" id="dcd"/>
                                    <input size="3" type="radio"  name="dcd<%=k%>" value="a" id="dcd"/></td>
                                <td ><input size="3" type="radio"  name="dwt<%=k%>" value="p" checked="" id="dwt"/>
                                    <input size="3" type="radio"  name="dwt<%=k%>" value="a" id="dwt"/></td>
                                <td ><input size="1" type="radio"  name="dli<%=k%>" value="p" checked="" id="dli"/>
                                    <input size="1" type="radio"  name="dli<%=k%>" value="a" id="dli"/></td>
                                <td ><input size="1" type="radio"  name="dcg<%=k%>" value="p" checked="" id="dcg"/>
                                    <input size="1" type="radio"  name="dcg<%=k%>" value="a" id="dcg"/></td>
                                <td ><input size="1" type="radio"  name="dpe<%=k%>" value="p" checked="" id="dpe"/>
                                    <input size="1" type="radio"  name="dpe<%=k%>" value="a" id="dpe"/></td>
                                <td ><input size="1" type="radio"  name="dwtlab<%=k%>" value="p" checked="" id="dwtlab"/>
                                    <input size="1" type="radio"  name="dwtlab<%=k%>" value="a" id="dwtlab"/></td>
                                <td ><input size="1" type="radio"  name="dlilab<%=k%>" value="p" checked="" id="dlilab"/>
                                    <input size="1" type="radio"  name="dlilab<%=k%>" value="a" id="dlilab"/></td>
                                <td ><input size="1" type="radio"  name="dcompviva1<%=k%>" value="p" checked="" id="dcompviva1"/>
                                    <input size="1" type="radio"  name="dcompviva1<%=k%>" value="a" id="dcompviva1"/></td>
                                    <%k++;%>
                            </tr>
                        </logic:iterate>
                        <tr>
                            <td></td>
                            <td></td>
                            <td></td>
                            <td align="center"><font size="0.5" ><logic:notEmpty name="stcn"><%=request.getAttribute("stcn")%></font></logic:notEmpty></td>
                            <td align="center"><font size="0.5" ><logic:notEmpty name="stcn"><%=request.getAttribute("stcd")%></font></logic:notEmpty></td>
                            <td align="center"><font size="0.5" ><logic:notEmpty name="stcn"><%=request.getAttribute("stwt")%></font></logic:notEmpty></td>
                            <td align="center"><font size="0.5" ><logic:notEmpty name="stcn"><%=request.getAttribute("stli")%></font></logic:notEmpty></td>
                            <td align="center"><font size="0.5" ><logic:notEmpty name="stcn"><%=request.getAttribute("stcg")%></font></logic:notEmpty></td>
                            <td align="center"><font size="0.5" ><logic:notEmpty name="stcn"><%=request.getAttribute("stpe")%></font></logic:notEmpty></td>
                            <td align="center"><font size="0.5" ><logic:notEmpty name="stcn"><%=request.getAttribute("stwtlab")%></font></logic:notEmpty></td>
                            <td align="center"><font size="0.5" ><logic:notEmpty name="stcn"><%=request.getAttribute("stlilab")%></font></logic:notEmpty></td>
                            <td align="center"><font size="0.5" ><logic:notEmpty name="stcn"><%=request.getAttribute("stcompviva1")%></font></logic:notEmpty></td>
                            </tr>
                            <tr>
                                <td ></td>
                                <td></td>
                                <td></td>
                                <td><input type="button" value="SAVE" onclick="saveCN();" /></td>
                                <td><input type="button" value="SAVE" onclick="saveCD();" /></td>
                                <td><input type="button" value="SAVE" onclick="saveWT();" /></td>
                                <td><input type="button" value="SAVE" onclick="saveLI();" /></td>
                                <td><input type="button" value="SAVE" onclick="saveCG();" /></td>
                                <td><input type="button" value="SAVE" onclick="savePE();" /></td>
                                <td><input type="button" value="SAVE" onclick="saveWTLAB();" /></td>
                                <td><input type="button" value="SAVE" onclick="saveLILAB();" /></td>
                                <td><input type="button" value="SAVE" onclick="saveCVIVA();" /></td>
                            </tr>
                        </table>
                        <input type="hidden" name="sdsme"  value="<%=k%>"/>
                </logic:notEmpty>
                <br><center><input type="submit" value="UPDATE TO FINAL ATTENDANCE"/></center>
                </html:form>
        </div>
    </body>
</html>