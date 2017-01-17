<%-- 
    Document   : aftloginhome
    Created on : Jun 12, 2015, 11:36:32 AM
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
        <link rel="stylesheet" type="text/css" href="<%=contextPath%>/Start/Css/aftlgn.css" title="Home" media="screen,projection" />
        <title>Student Details</title>
        <script language="javascript" type="text/javascript">
            window.history.forward();
        </script>
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
        <script type="text/javascript" language="javascript" >
            function printDiv(divName) {
                var printContents = document.getElementById(divName).innerHTML;
                var originalContents = document.body.innerHTML;
                document.body.innerHTML = printContents;
                window.print();
                document.body.innerHTML = originalContents;
            }
            function onBlur(el) {
                if (el.value == '') {
                    el.value = el.defaultValue;
                }
            }
            function onFocus(el) {
                el.value = '';
            }
            function sub()
            {
                document.getElementById("sub").focus();
            }
            function validate(key)
            {
                //getting key code of pressed key
                var keycode = (key.which) ? key.which : key.keyCode;
                if (keycode == 13)
                {
                    var name = document.forms[0].field;
                    if (name.value == "Enter your Valid RegdNo" || name == "")
                    {
                        alert("Please enter correct number.");
                    } else
                    {
                        document.getElementById("sub").focus();
                    }
                }
                //comparing pressed keycodes
                if (!(keycode == 9 || keycode == 46 || keycode == 65 || keycode == 97 || keycode == 13) && (keycode < 48 || keycode > 57))
                {
                    return false;
                }
                return true;
            }
            function ValidateContactForm()
            {

                var name = document.forms[0].field;
                var sem = document.forms[0].dfield;
                if (name.value == "Enter your Valid RegdNo" || name.value == "")
                {
                    alert("Please enter correct number.");
                    field.focus();
                    return false;
                }
                if (sem.value == 0)
                {
                    alert("Please give Semester as input.");
                    dfield.focus();
                    return false;
                }
            }
        </script>
    </head>
    <body id="wrap" background="<%=contextPath%>/Start/Depart/cse/aftlgnbg.jpg">
        <%
          if (session.getAttribute("username") == null) {
                response.sendRedirect("./Start/Depart/cse/registar/logout.jsp");
            }
            else if (session.getAttribute("rlog") == null) {
                response.sendRedirect("./Start/Depart/cse/registar/logout.jsp");
            }
        %>
        <h1><img src="<%=contextPath%>/Start/Images/Home/1.jpg" width="35"/>&nbsp<a target="_blank" target="_blank" href="http://lbrce.ac.in//">Lakireddy Balireddy College Of Engineering</a></h1>
        <p class="slogan">Student Information System</p>

        <div class="menu4">
            <a href="rhome.pvk" class="current" ><span>Home</span></a>
            <a href="firstr.pvk" ><span>FIRST SEMESTER</span></a>
            <a href="secondr.pvk" ><span>SECOND SEMESTER</span></a>
            <a href="thirdr.pvk"><span>THIRD SEMESTER</span></a>
            <a href="fourthr.pvk"><span>FOURTH SEMESTER</span></a>
        </div><div class="menu4sub"> </div><br>
        <div class="menu4">
            <a href="fifthr.pvk"><span>FIFTH SEMESTER</span></a>
            <a href="threeoner.pvk" ><span>SIXTH SEMESTER</span></a>
            <a href="seventhr.pvk"><span>SEVENTH SEMESTER</span></a>
            <a href="eighthr.pvk"><span>EIGHTH SEMESTER</span></a>
            <a href="./Start/Depart/cse/registar/logout.jsp" ><span>Logout</span></a>
        </div><div class="menu4sub"> </div><br>
        <br>
        <div  id="maincontent">
            <p>A student information system (SIS) is a software application for education establishments to manage student data. Student Information Systems (often abbreviated as SIS systems) provide capabilities for retrieving student information and other assessment scores, build student schedules, track student attendance, and manage many other student-related data needs in a school.</p>
            <br><font size="16" ><center>Student Details Search</center></font><br>
                <html:form action="stdr" method="post" onsubmit="return ValidateContactForm();" >
                <table align="center">
                    <tr><th> Enter Registration Number</th>
                        <th> <input type="text" name="sid" 
                                    required 
                                    value="Enter your Valid RegdNo"  
                                    maxlength="10"  onkeypress="return validate(event)"   autoComplete="off"
                                    onblur="onBlur(this)" onfocus="onFocus(this)"  id="field"/></th>
                    <tr><th></th></tr>  <tr><th></th></tr>  
                    <tr><th></th> </tr><tr><th></th></tr>  
                    <tr><th></th></tr>  <tr><th></th></tr>
                    <tr>  <th>Semester</th><th><select name="sem" id="dfield" >
                                <option value="0">Select Semester</option>
                                <option value="1">1-1 (First Semester)</option>
                                <option value="2">1-2 (Second Semester)</option>
                                <option value="3">2-1 (Third Semester)</option>
                                <option value="4">2-2 (Fourth Semester)</option>
                                <option value="5">3-1 (Fifth Semester)</option>
                                <option value="6">3-2 (Sixth Semester)</option> 
                                <option value="7">4-1 (Seventh Semester)</option>
                                <option value="8">4-2 (Eighth Semester)</option>
                                <option value="9">All Semester Details</option>
                            </select></th></tr>
                    <tr><th></th></tr>  <tr><th></th></tr>  <tr><th></th></tr>
                    <tr><th></th></tr>  <tr><th></th></tr>  <tr><th></th></tr>
                    <tr><th></th><th> </th></tr>
                </table>
                <center>  <input type="submit" value="Search"  /></center>
                </html:form>
            <br>
            <div id="printf">
            <logic:notEmpty name="empty"> 
                <font size="16"> <center><%=request.getAttribute("empty")%><br> <br></center></font></logic:notEmpty>
                <logic:notEmpty name="first"> <font size="5" color="#FA5858"><b>Student Details Of Fist Semester:</b></font>
                <div  id="maincontent">
                    <div id="print">
                        <table border="1" class="CSSTableGenerator"> 
                            <tr>
                            <td>Student Id</td>
                            <td>Student Name</td> 
                            <td>Section</td>
                            <td>Semester</td>
                            </tr>
                            <tr>
                                <logic:iterate id="user" name="first">      
                                    <td><font size="2" color="000000"><center><b><bean:write name="user" property="sid"/></b></center></font></td>
                                <td> <font size="2" color="000000"><center><b><bean:write name="user" property="sname"/></b></center></font></td>
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="section"/></b></center></font></td>
                                <td><font size="2" color="000000"><center><b>First Semester</b></center></font></td>
                                </logic:iterate>
                            </tr>
                        </table><br>
                        <table border="1" class="CSSTableGenerator">
                            <tr>
                            <font size="5" color="000000"><b>Student Attendence:</b></font>
                            <td>am1</td>
                            <td>cprg</td>
                            <td>eng1</td>
                            <td>nm1</td>
                            <td>es</td>
                            <td>cplab</td>
                            <td>englab</td>
                            <td>engwrksdp</td>
                            <td>Total</td>
                            </tr>
                            <tr>
                                <logic:iterate id="user" name="first">  
                                    <td><font size="2" color="000000"><center><b><bean:write name="user" property="acn"/></b></center></font></td>
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="acd"/></b></center></font></td>
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="awt"/></b></center></font></td>
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="ali"/></b></center></font></td>
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="acg"/></b></center></font></td>
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="ape"/></b></center></font></td>
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="awtlab"/></b></center></font></td>
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="alilab"/></b></center></font></td>
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="Af"/></b></center></font></td>
                                </logic:iterate>
                            </tr>
                        </table><br>
                        <table border="1" class="CSSTableGenerator">
                            <tr>
                            <font size="5" color="000000"><b>Student Mid Marks:</b></font>
                            <td>am1</td>
                            <td>cprg</td>
                            <td>eng1</td>
                            <td>nm1</td>
                            <td>es</td>
                            <td>cplab</td>
                            <td>englab</td>
                            <td>engwrksdp</td>
                            </tr>
                            <tr>
                                <logic:iterate id="user" name="first">
                                    <td> <font size="2" color="000000"><center><b><bean:write name="user" property="mcn"/></b></center></font></td> 
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="mcd"/></b></center></font></td>
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="mwt"/></b></center></font></td>
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="mli"/></b></center></font></td>
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="mcg"/></b></center></font></td>
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="mpe"/></b></center></font></td>
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="mwtlab"/></b></center></font></td>
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="mlilab"/></b></center></font></td>
                                </logic:iterate>
                            </tr>
                        </table><br>
                        <table border="1" class="CSSTableGenerator">
                            <tr>
                            <font size="5" color="000000"><b>Student Sem Grades:</b></font>
                            <td>am1</td>
                            <td>cprg</td>
                            <td>eng1</td>
                            <td>nm1</td>
                            <td>es</td>
                            <td>cplab</td>
                            <td>englab</td>
                            <td>engwrksdp</td>
                            </tr>
                            <tr>
                                <logic:iterate id="user" name="first">
                                    <td> <font size="2" color="000000"><center><b><bean:write name="user" property="Gcn"/></b></center></font></td> 
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gcd"/></b></center></font></td>
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gwt"/></b></center></font></td>
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gli"/></b></center></font></td>
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gcg"/></b></center></font></td>
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gpe"/></b></center></font></td>
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gwtlab"/></b></center></font></td>
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="Glilab"/></b></center></font></td>
                                </logic:iterate>
                            </tr>
                        </table>
                        <br>                  
                        <table border="1" class="CSSTableGenerator">
                            <tr>
                            <font size="5" color="000000"><b>Student Total % :</b></font>
                            <td>Number Of Backlogs(current)</td>
                            <td>Number Of Backlogs(Upto This sem)</td>
                            <td>SGPA</td>
                            <td>CGPA</td>
                            </tr>
                            <tr>
                                <logic:iterate id="user" name="first">
                                    <td> <font size="2" color="000000"><center><b><bean:write name="user" property="Nbl"/></b></center></font></td> 
                                <td> <font size="2" color="000000"><center><b><%=request.getAttribute("tnbl1")%></b></center></font></td> 
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="Sgpa"/></b></center></font></td>
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="Cgpa"/></b></center></font></td>
                                </logic:iterate>
                            </tr>
                        </table>
                    </div>
                    <br>
                </div>
            </logic:notEmpty>
            <logic:notEmpty name="second"> <font size="5" color="#FA5858"><b>Student Details Of Second Semester:</b></font>
                 <div  id="maincontent">
                <div id="print">
                    <table border="1" class="CSSTableGenerator"> 
                        <tr>
                        <td>Student Id</td>
                        <td>Student Name</td> 
                        <td>Section</td>
                        <td>Semester</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="second">      
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="sid"/></b></center></font></td>
                            <td> <font size="2" color="000000"><center><b><bean:write name="user" property="sname"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="section"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b>Second Semester</b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table><br>
                    <table border="1" class="CSSTableGenerator">
                        <tr>
                        <font size="5" color="000000"><b>Student Attendence:</b></font>
                        <td>am2</td>
                        <td>eng2</td>
                        <td>chem</td>
                        <td>ds</td>
                        <td>phy</td>
                        <td>atcd</td>
                        <td>phychelab</td>
                        <td>dslab</td>
                        <td>mprj1</td>
                        <td>Total</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="second">  
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="acn"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="acd"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="awt"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="ali"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="acg"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="ape"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="awtlab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="alilab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="acompviva1"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Af"/></b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table><br>
                    <table border="1" class="CSSTableGenerator">
                        <tr>
                        <font size="5" color="000000"><b>Student Mid Marks:</b></font>
                        <td>am2</td>
                        <td>eng2</td>
                        <td>chem</td>
                        <td>ds</td>
                        <td>phy</td>
                        <td>atcd</td>
                        <td>phychelab</td>
                        <td>dslab</td>
                        <td>mprj1</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="second">
                                <td> <font size="2" color="000000"><center><b><bean:write name="user" property="mcn"/></b></center></font></td> 
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mcd"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mwt"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mli"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mcg"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mpe"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mwtlab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mlilab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mcompviva1"/></b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table><br>
                    <table border="1" class="CSSTableGenerator">
                        <tr>
                        <font size="5" color="000000"><b>Student Sem Grades:</b></font>
                        <td>am2</td>
                        <td>eng2</td>
                        <td>chem</td>
                        <td>ds</td>
                        <td>phy</td>
                        <td>atcd</td>
                        <td>phychelab</td>
                        <td>dslab</td>
                        <td>mprj1</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="second">
                                <td> <font size="2" color="000000"><center><b><bean:write name="user" property="Gcn"/></b></center></font></td> 
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gcd"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gwt"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gli"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gcg"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gpe"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gwtlab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Glilab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gcompviva1"/></b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table>
                    <br>                  
                    <table border="1" class="CSSTableGenerator">
                        <tr>
                        <font size="5" color="000000"><b>Student Total % :</b></font>
                        <td>Number Of Backlogs(current)</td>
                        <td>Number Of Backlogs(Upto This sem)</td>
                        <td>SGPA</td>
                        <td>CGPA</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="second">
                                <td> <font size="2" color="000000"><center><b><bean:write name="user" property="Nbl"/></b></center></font></td> 
                            <td> <font size="2" color="000000"><center><b><%=request.getAttribute("tnbl2")%></b></center></font></td> 
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Sgpa"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Cgpa"/></b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table>
                </div> <br>
                 </div>
            </logic:notEmpty>
            <logic:notEmpty name="third"> <font size="5" color="#FA5858"><b>Student Details Of Third Semester:</b></font>
                <div  id="maincontent">
                <div id="print">
                    <table border="1" class="CSSTableGenerator"> 
                        <tr>
                        <td>Student Id</td>
                        <td>Student Name</td> 
                        <td>Section</td>
                        <td>Semester</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="third">      
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="sid"/></b></center></font></td>
                            <td> <font size="2" color="000000"><center><b><bean:write name="user" property="sname"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="section"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b>Third Semester</b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table><br>
                    <table border="1" class="CSSTableGenerator">
                        <tr>
                        <font size="5" color="000000"><b>Student Attendence:</b></font>
                        <td>edc</td>
                        <td>prbst</td>
                        <td>dld</td>
                        <td>dms</td>
                        <td>oops</td>
                        <td>edclab</td>
                        <td>oppslab</td>
                        <td>dldlab</td>
                        <td>seminar1</td>
                        <td>Total</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="third">  
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="acn"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="acd"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="awt"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="ali"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="acg"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="ape"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="awtlab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="alilab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="acompviva1"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Af"/></b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table><br>
                    <table border="1" class="CSSTableGenerator">
                        <tr>
                        <font size="5" color="000000"><b>Student Mid Marks:</b></font>
                        <td>edc</td>
                        <td>prbst</td>
                        <td>dld</td>
                        <td>dms</td>
                        <td>oops</td>
                        <td>edclab</td>
                        <td>oppslab</td>
                        <td>dldlab</td>
                        <td>seminar1</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="third">
                                <td> <font size="2" color="000000"><center><b><bean:write name="user" property="mcn"/></b></center></font></td> 
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mcd"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mwt"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mli"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mcg"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mpe"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mwtlab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mlilab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mcompviva1"/></b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table><br>
                    <table border="1" class="CSSTableGenerator">
                        <tr>
                        <font size="5" color="000000"><b>Student Sem Grades:</b></font>
                        <td>edc</td>
                        <td>prbst</td>
                        <td>dld</td>
                        <td>dms</td>
                        <td>oops</td>
                        <td>edclab</td>
                        <td>oppslab</td>
                        <td>dldlab</td>
                        <td>seminar1</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="third">
                                <td> <font size="2" color="000000"><center><b><bean:write name="user" property="Gcn"/></b></center></font></td> 
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gcd"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gwt"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gli"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gcg"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gpe"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gwtlab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Glilab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gcompviva1"/></b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table>
                    <br>                  
                    <table border="1" class="CSSTableGenerator">
                        <tr>
                        <font size="5" color="000000"><b>Student Total % :</b></font>
                        <td>Number Of Backlogs(current)</td>
                        <td>Number Of Backlogs(Upto This sem)</td>
                        <td>SGPA</td>
                        <td>CGPA</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="third">
                                <td> <font size="2" color="000000"><center><b><bean:write name="user" property="Nbl"/></b></center></font></td> 
                            <td> <font size="2" color="000000"><center><b><%=request.getAttribute("tnbl3")%></b></center></font></td> 
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Sgpa"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Cgpa"/></b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table>
                </div><br>
                </div>
            </logic:notEmpty>
            <logic:notEmpty name="fourth"> <font size="5" color="#FA5858"><b>Student Details Of Fourth Semester:</b></font>
                <div  id="maincontent"> 
                <div id="print">
                    <table border="1" class="CSSTableGenerator"> 
                        <tr>
                        <td>Student Id</td>
                        <td>Student Name</td> 
                        <td>Section</td>
                        <td>Semester</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="fourth">      
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="sid"/></b></center></font></td>
                            <td> <font size="2" color="000000"><center><b><bean:write name="user" property="sname"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="section"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b>Fourth Semester</b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table><br>
                    <table border="1" class="CSSTableGenerator">
                        <tr>
                        <font size="5" color="000000"><b>Student Attendence:</b></font>
                        <td>dbms</td>
                        <td>co</td>
                        <td>os</td>
                        <td>ip</td>
                        <td>se</td>
                        <td>bee</td>
                        <td>dbmslab</td>
                        <td>iplab</td>
                        <td>mprj2</td>
                        <td>Total</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="fourth">  
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="acn"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="acd"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="awt"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="ali"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="acg"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="ape"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="awtlab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="alilab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="acompviva1"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Af"/></b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table><br>
                    <table border="1" class="CSSTableGenerator">
                        <tr>
                        <font size="5" color="000000"><b>Student Mid Marks:</b></font>
                        <td>dbms</td>
                        <td>co</td>
                        <td>os</td>
                        <td>ip</td>
                        <td>se</td>
                        <td>bee</td>
                        <td>dbmslab</td>
                        <td>iplab</td>
                        <td>mprj2</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="fourth">
                                <td> <font size="2" color="000000"><center><b><bean:write name="user" property="mcn"/></b></center></font></td> 
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mcd"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mwt"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mli"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mcg"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mpe"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mwtlab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mlilab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mcompviva1"/></b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table><br>
                    <table border="1" class="CSSTableGenerator">
                        <tr>
                        <font size="5" color="000000"><b>Student Sem Grades:</b></font>
                        <td>dbms</td>
                        <td>co</td>
                        <td>os</td>
                        <td>ip</td>
                        <td>se</td>
                        <td>bee</td>
                        <td>dbmslab</td>
                        <td>iplab</td>
                        <td>mprj2</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="fourth">
                                <td> <font size="2" color="000000"><center><b><bean:write name="user" property="Gcn"/></b></center></font></td> 
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gcd"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gwt"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gli"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gcg"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gpe"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gwtlab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Glilab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gcompviva1"/></b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table>
                    <br>                  
                    <table border="1" class="CSSTableGenerator">
                        <tr>
                        <font size="5" color="000000"><b>Student Total % :</b></font>
                        <td>Number Of Backlogs(current)</td>
                        <td>Number Of Backlogs(Upto This sem)</td>
                        <td>SGPA</td>
                        <td>CGPA</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="fourth">
                                <td> <font size="2" color="000000"><center><b><bean:write name="user" property="Nbl"/></b></center></font></td> 
                            <td> <font size="2" color="000000"><center><b><%=request.getAttribute("tnbl4")%></b></center></font></td> 
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Sgpa"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Cgpa"/></b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table>
                </div><br>
                </div>
            </logic:notEmpty>
            <logic:notEmpty name="fifth"><font size="5" color="#FA5858"><b>Student Details Of Fifth Semester:</b></font>  
                <div  id="maincontent">
                <div id="print">
                    <table border="1" class="CSSTableGenerator"> 
                        <tr>
                        <td>Student Id</td>
                        <td>Student Name</td> 
                        <td>Section</td>
                        <td>Semester</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="fifth">      
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="sid"/></b></center></font></td>
                            <td> <font size="2" color="000000"><center><b><bean:write name="user" property="sname"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="section"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b>Fifth Semester</b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table><br>
                    <table border="1" class="CSSTableGenerator">
                        <tr>
                        <font size="5" color="000000"><b>Student Attendence:</b></font>
                        <td>Daa</td>
                        <td>Atfl</td>
                        <td>Ooad</td>
                        <td>Ppl</td>
                        <td>Mpi</td>
                        <td>Stm</td>
                        <td>Ooadlab</td>
                        <td>Mpilab</td>
                        <td>Seminar2</td>
                        <td>Total</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="fifth">  
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="acn"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="acd"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="awt"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="ali"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="acg"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="ape"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="awtlab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="alilab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="acompviva1"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Af"/></b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table><br>
                    <table border="1" class="CSSTableGenerator">
                        <tr>
                        <font size="5" color="000000"><b>Student Mid Marks:</b></font>
                        <td>Daa</td>
                        <td>Atfl</td>
                        <td>Ooad</td>
                        <td>Ppl</td>
                        <td>Mpi</td>
                        <td>Stm</td>
                        <td>Ooadlab</td>
                        <td>Mpilab</td>
                        <td>Seminar2</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="fifth">
                                <td> <font size="2" color="000000"><center><b><bean:write name="user" property="mcn"/></b></center></font></td> 
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mcd"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mwt"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mli"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mcg"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mpe"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mwtlab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mlilab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mcompviva1"/></b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table><br>
                    <table border="1" class="CSSTableGenerator">
                        <tr>
                        <font size="5" color="000000"><b>Student Sem Grades:</b></font>
                        <td>Daa</td>
                        <td>Atfl</td>
                        <td>Ooad</td>
                        <td>Ppl</td>
                        <td>Mpi</td>
                        <td>Stm</td>
                        <td>Ooadlab</td>
                        <td>Mpilab</td>
                        <td>Seminar2</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="fifth">
                                <td> <font size="2" color="000000"><center><b><bean:write name="user" property="Gcn"/></b></center></font></td> 
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gcd"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gwt"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gli"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gcg"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gpe"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gwtlab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Glilab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gcompviva1"/></b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table>
                    <br>                  
                    <table border="1" class="CSSTableGenerator">
                        <tr>
                        <font size="5" color="000000"><b>Student Total % :</b></font>
                        <td>Number Of Backlogs(current)</td>
                        <td>Number Of Backlogs(Upto This sem)</td>
                        <td>SGPA</td>
                        <td>CGPA</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="fifth">
                                <td> <font size="2" color="000000"><center><b><bean:write name="user" property="Nbl"/></b></center></font></td> 
                            <td> <font size="2" color="000000"><center><b><%=request.getAttribute("tnbl5")%></b></center></font></td> 
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Sgpa"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Cgpa"/></b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table>
                </div><br>
                </div>
            </logic:notEmpty>
            <logic:notEmpty name="threeone"><font size="5" color="#FA5858"><b>Student Details Of Sixth Semester:</b></font>
                <div  id="maincontent">
                <div id="print">
                    <table border="1" class="CSSTableGenerator"> 
                        <tr>
                        <td>Student Id</td>
                        <td>Student Name</td> 
                        <td>Section</td>
                        <td>Semester</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="threeone">      
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="sid"/></b></center></font></td>
                            <td> <font size="2" color="000000"><center><b><bean:write name="user" property="sname"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="section"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b>Sixth Semester</b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table><br>
                    <table border="1" class="CSSTableGenerator">
                        <tr>
                        <font size="5" color="000000"><b>Student Attendence:</b></font>
                        <td>Cn</td>
                        <td>Cd</td>
                        <td>Wt</td>
                        <td>Li</td>
                        <td>Cg</td>
                        <td>Pe</td>
                        <td>Wtlab</td>
                        <td>Lilab</td>
                        <td>Cviva1</td>
                        <td>Total</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="threeone">  
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="acn"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="acd"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="awt"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="ali"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="acg"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="ape"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="awtlab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="alilab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="acompviva1"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Af"/></b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table><br>
                    <table border="1" class="CSSTableGenerator">
                        <tr>
                        <font size="5" color="000000"><b>Student Mid Marks:</b></font>
                        <td>Cn</td>
                        <td>Cd</td>
                        <td>Wt</td>
                        <td>Li</td>
                        <td>Cg</td>
                        <td>Pe</td>
                        <td>Wtlab</td>
                        <td>Lilab</td>
                        <td>Cviva1</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="threeone">
                                <td> <font size="2" color="000000"><center><b><bean:write name="user" property="mcn"/></b></center></font></td> 
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mcd"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mwt"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mli"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mcg"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mpe"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mwtlab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mlilab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mcompviva1"/></b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table><br>
                    <table border="1" class="CSSTableGenerator">
                        <tr>
                        <font size="5" color="000000"><b>Student Sem Grades:</b></font>
                        <td>Cn</td>
                        <td>Cd</td>
                        <td>Wt</td>
                        <td>Li</td>
                        <td>Cg</td>
                        <td>Pe</td>
                        <td>Wtlab</td>
                        <td>Lilab</td>
                        <td>Cviva1</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="threeone">
                                <td> <font size="2" color="000000"><center><b><bean:write name="user" property="Gcn"/></b></center></font></td> 
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gcd"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gwt"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gli"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gcg"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gpe"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gwtlab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Glilab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gcompviva1"/></b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table>
                    <br>                  
                    <table border="1" class="CSSTableGenerator">
                        <tr>
                        <font size="5" color="000000"><b>Student Total % :</b></font>
                        <td>Number Of Backlogs(current)</td>
                        <td>Number Of Backlogs(Upto This sem)</td>
                        <td>SGPA</td>
                        <td>CGPA</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="threeone">
                                <td> <font size="2" color="000000"><center><b><bean:write name="user" property="Nbl"/></b></center></font></td> 
                            <td> <font size="2" color="000000"><center><b><%=request.getAttribute("tnbl6")%></b></center></font></td> 
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Sgpa"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Cgpa"/></b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table>
                </div><br>
                </div>
            </logic:notEmpty>
            <logic:notEmpty name="seventh"><font size="5" color="#FA5858"><b>Student Details Of Seventh Semester:</b></font> 
                <div  id="maincontent">
                <div id="print">
                    <table border="1" class="CSSTableGenerator"> 
                        <tr>
                        <td>Student Id</td>
                        <td>Student Name</td> 
                        <td>Section</td>
                        <td>Semester</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="seventh">      
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="sid"/></b></center></font></td>
                            <td> <font size="2" color="000000"><center><b><bean:write name="user" property="sname"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="section"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b>Seventh Semester</b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table><br>
                    <table border="1" class="CSSTableGenerator">
                        <tr>
                        <font size="5" color="000000"><b>Student Attendence:</b></font>
                        <td>is</td>
                        <td>dmdw</td>
                        <td>mc</td>
                        <td>spm</td>
                        <td>aca</td>
                        <td>ai</td>
                        <td>mclab</td>
                        <td>stmlab</td>
                        <td>internship</td>
                        <td>termpaper</td>
                        <td>Total</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="seventh">  
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="acn"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="acd"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="awt"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="ali"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="acg"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="ape"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="awtlab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="alilab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="acompviva1"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="adtp"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Af"/></b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table><br>
                    <table border="1" class="CSSTableGenerator">
                        <tr>
                        <font size="5" color="000000"><b>Student Mid Marks:</b></font>
                        <td>is</td>
                        <td>dmdw</td>
                        <td>mc</td>
                        <td>spm</td>
                        <td>aca</td>
                        <td>ai</td>
                        <td>mclab</td>
                        <td>stmlab</td>
                        <td>internship</td>
                        <td>termpaper</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="seventh">
                                <td> <font size="2" color="000000"><center><b><bean:write name="user" property="mcn"/></b></center></font></td> 
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mcd"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mwt"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mli"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mcg"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mpe"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mwtlab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mlilab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mcompviva1"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mdtp"/></b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table><br>
                    <table border="1" class="CSSTableGenerator">
                        <tr>
                        <font size="5" color="000000"><b>Student Sem Grades:</b></font>
                        <td>is</td>
                        <td>dmdw</td>
                        <td>mc</td>
                        <td>spm</td>
                        <td>aca</td>
                        <td>ai</td>
                        <td>mclab</td>
                        <td>stmlab</td>
                        <td>internship</td>
                        <td>termpaper</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="seventh">
                                <td> <font size="2" color="000000"><center><b><bean:write name="user" property="Gcn"/></b></center></font></td> 
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gcd"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gwt"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gli"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gcg"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gpe"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gwtlab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Glilab"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gcompviva1"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="gdtp"/></b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table>
                    <br>                  
                    <table border="1" class="CSSTableGenerator">
                        <tr>
                        <font size="5" color="000000"><b>Student Total % :</b></font>
                        <td>Number Of Backlogs(current)</td>
                        <td>Number Of Backlogs(Upto This sem)</td>
                        <td>SGPA</td>
                        <td>CGPA</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="seventh">
                                <td> <font size="2" color="000000"><center><b><bean:write name="user" property="Nbl"/></b></center></font></td> 
                            <td> <font size="2" color="000000"><center><b><%=request.getAttribute("tnbl7")%></b></center></font></td> 
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Sgpa"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Cgpa"/></b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table>
                </div><br>
                </div>
            </logic:notEmpty>
            <logic:notEmpty name="eighth"> <font size="5" color="#FA5858"><b>Student Details Of Eighth Semester:</b></font>
                <div  id="maincontent">
                <div id="print">
                    <table border="1" class="CSSTableGenerator"> 
                        <tr>
                        <td>Student Id</td>
                        <td>Student Name</td> 
                        <td>Section</td>
                        <td>Semester</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="eighth">      
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="sid"/></b></center></font></td>
                            <td> <font size="2" color="000000"><center><b><bean:write name="user" property="sname"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="section"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b>Eighth Semester</b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table><br>
                    <table border="1" class="CSSTableGenerator">
                        <tr>
                        <font size="5" color="000000"><b>Student Attendence:</b></font>
                        <td>im</td>
                        <td>hci</td>
                        <td>cc</td>
                        <td>cmpviva2</td>
                        <td>prjectwrk</td>
                        <td>Total</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="eighth">  
                                <td><font size="2" color="000000"><center><b><bean:write name="user" property="acn"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="acd"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="awt"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="ali"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="acg"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Af"/></b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table><br>
                    <table border="1" class="CSSTableGenerator">
                        <tr>
                        <font size="5" color="000000"><b>Student Mid Marks:</b></font>
                        <td>im</td>
                        <td>hci</td>
                        <td>cc</td>
                        <td>cmpviva2</td>
                        <td>prjectwrk</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="eighth">
                                <td> <font size="2" color="000000"><center><b><bean:write name="user" property="mcn"/></b></center></font></td> 
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mcd"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mwt"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mli"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="mcg"/></b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table><br>
                    <table border="1" class="CSSTableGenerator">
                        <tr>
                        <font size="5" color="000000"><b>Student Sem Grades:</b></font>
                        <td>im</td>
                        <td>hci</td>
                        <td>cc</td>
                        <td>cmpviva2</td>
                        <td>prjectwrk</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="eighth">
                                <td> <font size="2" color="000000"><center><b><bean:write name="user" property="Gcn"/></b></center></font></td> 
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gcd"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gwt"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gli"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Gcg"/></b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table>
                    <br>                  
                    <table border="1" class="CSSTableGenerator">
                        <tr>
                        <font size="5" color="000000"><b>Student Total % :</b></font>
                        <td>Number Of Backlogs(current)</td>
                        <td>Number Of Backlogs(Upto This sem)</td>
                        <td>SGPA</td>
                        <td>CGPA</td>
                        </tr>
                        <tr>
                            <logic:iterate id="user" name="eighth">
                                <td> <font size="2" color="000000"><center><b><bean:write name="user" property="Nbl"/></b></center></font></td> 
                            <td> <font size="2" color="000000"><center><b><%=request.getAttribute("tnbl8")%></b></center></font></td> 
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Sgpa"/></b></center></font></td>
                            <td><font size="2" color="000000"><center><b><bean:write name="user" property="Cgpa"/></b></center></font></td>
                            </logic:iterate>
                        </tr>
                    </table>
                </div><br>
                </div>
            </logic:notEmpty>
        </div>
  <br> <logic:notEmpty name="printf">  <center>  
                    <input  type="button" onclick="printDiv('printf')" value="Print The Data!"  class="myButton"/>
                </center></logic:notEmpty>
            <br> 
            <br> <logic:notEmpty name="print">  <center>  
                    <input  type="button" onclick="printDiv('print')" value="Print The Data!"  class="myButton"/>
                </center></logic:notEmpty>
        </div>
    </body>
</html>
