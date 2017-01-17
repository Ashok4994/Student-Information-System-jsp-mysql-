<%-- 
    Document   : About
    Created on : May 30, 2015, 7:16:07 PM
    Author     : PEDDI'S
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<% String contextPath = request.getContextPath();%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Feedback Page</title>
        <link rel="stylesheet" type="text/css" href="<%=contextPath%>/Start/feedback/Home.css" title="Home" media="screen,projection" />

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
                text-align:center;
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
            OPTION 
            { background:#666666;  height:42px;
              border:1px solid #d8d8d8;
              width:525px;text-align: center; }
            select {
                background-color: rgba(255, 255, 255, 0.2);
                text-align: center;
                font-size: 23px;
                color: white;
                -webkit-transition-duration: 0.25s;
                transition-duration: 0.25s;
                font-weight: 300;
                height:42px;
                border:1px solid #d8d8d8;
                width:525px;
            }
            form input {
                appearance: none;
                outline: 0;
                border: #000000;
                background-color: #666666;
                border-radius: 3px;
                padding: 10px 15px;
                margin: 0 auto 10px auto;
                display: block;
                text-align: center;
                font-size: 23px;
                color: white;
                -webkit-transition-duration: 0.25s;
                transition-duration: 0.25s;
                font-weight: 300;
            }
            form {
                padding: 20px 0;
                position: relative;
                z-index: 2;
            }
            form input:hover {
                background-color: #000;
            }
            /*  transition for table */         form input:focus {
                background-color: white;
                width: 300px;
                color: #53e3a6;
            }
            #feedform {background:#333; text-align:left; border:4px solid #666; padding:15px 15px 5px 15px; margin:0 0 15px 0;}
            #dialogoverlay{
                display: none;
                opacity: .8;
                position: fixed;
                top: 0px;
                left: 0px;
                background: #FFF;
                width: 100%;
                z-index: 10;
            }
            #dialogbox{
                display: none;
                position: fixed;
                background: #000;
                border-radius:7px; 
                width:550px;
                z-index: 10;
            }
            #dialogbox > div{ background:#FFF; margin:8px; }
            #dialogbox > div > #dialogboxhead{ background: #666; font-size:25px; padding:10px; text-align:left; color:#66FF00; }
            #dialogbox > div > #dialogboxbody{ background:#333; padding:20px; font-size:19px;text-align:center; color:#FF0000 ; }
            #dialogbox > div > #dialogboxfoot{ background: #666; padding:10px; text-align:right; }
        </style>
        <script type="text/javascript" language="javascript" >
              window.history.forward();
            function CustomAlert() {
                this.render = function (dialog) {
                    var winW = window.innerWidth;
                    var winH = window.innerHeight;
                    var dialogoverlay = document.getElementById('dialogoverlay');
                    var dialogbox = document.getElementById('dialogbox');
                    dialogoverlay.style.display = "block";
                    dialogoverlay.style.height = winH + "px";
                    dialogbox.style.left = (winW / 2) - (550 * .5) + "px";
                    dialogbox.style.top = "300px";
                    dialogbox.style.display = "block";
                    document.getElementById('dialogboxhead').innerHTML = "Acknowledge This Alert";
                    document.getElementById('dialogboxbody').innerHTML = dialog;
                    document.getElementById('dialogboxfoot').innerHTML = '<button onclick="Alert.ok()">OK</button>';
                }
                this.ok = function () {
                    document.getElementById('dialogbox').style.display = "none";
                    document.getElementById('dialogoverlay').style.display = "none";
                    field.focus();
                }
            }
            var Alert = new CustomAlert();
            function onBlur(el) {
                if (el.value == '') {
                    el.value = el.defaultValue;
                }
            }
            function onFocus(el) {

                el.value = '';

            }



        </script>
    </head>
    <body id="back">
        <%
            if (session.getAttribute("username") == null) {
                response.sendRedirect("./Start/feedback/logout.jsp");
            } else if (session.getAttribute("flog") == null) {
                response.sendRedirect("./Start/feedback/logout.jsp");
            }
        %><%int k = 1;%>
        <div id="dialogoverlay"></div>
        <div id="dialogbox">
            <div>
                <div id="dialogboxhead"></div>
                <div id="dialogboxbody"></div>
                <div id="dialogboxfoot"></div>
            </div>
        </div>
        <div id="wrap">
            <h1><img src="<%=contextPath%>/Start/Images/Home/1.jpg" width="35"/>&nbsp<a target="_blank" href="http://lbrce.ac.in//">Lakireddy Balireddy College Of Engineering</a></h1>
            <h3 class="slogan"><b>Student Information System</b></h3>
            <div id="maincontent">
                <h2 id="hback">No need to <a target="_blank" href="https://www.google.com">make things</a> complicated...</h2>
                <div  align="center">
                          <center><font color="red" size="5">Once You Submit Your Feedback You Are Automatically Redirected and Logged Out</font></center>
                        <html:form action="/feedsubmission" method="post" onsubmit="return ValidateContactForm()" >
                        <input type="hidden" name="sem" value="<%=request.getAttribute("sem")%>"/>
                        <input type="hidden" name="sid" value="<%=session.getAttribute("username")%>"/>
                        <center><font color="red" size="6"><%
                        Object depart = request.getAttribute("depart");
                        if (depart == null) {
                        } else {
                            out.print(request.getAttribute("depart"));
                        }
                        %></font></center>
                        <logic:notEmpty name="list">
                            <table class="CSSTableGenerator">
                                <tr>
                                    <td>SNO</td>
                                    <td>Subject/Question</td>
                                    <td>Feedback Input</td>
                                </tr>
                            </table><br>
                            <logic:iterate id="user" name="list"> 

                                <table class="CSSTableGenerator">
                                    <tr>
                                        <td>
                                            <input type="hidden" name="subid<%=k%>" value="${user.subid}"/>  
                                            ${user.subid}
                                        </td>
                                        <td>
                                            <input type="hidden" name="subid" value="${user.subname}"/>  
                                            ${user.subname}
                                        </td>
                                        <td>Good</td><td>Above Average</td><td>Average</td>
                                        <td>Below Average</td><td>Bad</td>
                                    </tr>
                                    <tr>
                                        <td colspan="2" style="font-size:127%; font-weight: bold;" > The teacher explains important concepts/ideas in ways that I can understand</td>
                                        <td><input type="radio" name="qna<%=k%>" value="100" required/> </td>
                                        <td><input type="radio" name="qna<%=k%>" value="95" required/> </td>
                                        <td><input type="radio" name="qna<%=k%>" value="90" required/> </td>
                                        <td><input type="radio" name="qna<%=k%>" value="85" required/> </td>
                                        <td><input type="radio" name="qna<%=k%>" value="80" required/> </td>
                                    </tr>
                                    <tr>
                                        <td colspan="2" style=" font-size:150%;font-weight: bold;" >  The teacher stimulates my interest in the subject</td>
                                        <td><input required type="radio" name="qnb<%=k%>" value="100"/> </td>
                                        <td><input required type="radio" name="qnb<%=k%>" value="95"/> </td>
                                        <td><input required type="radio" name="qnb<%=k%>" value="90"/> </td>
                                        <td><input required type="radio" name="qnb<%=k%>" value="85"/> </td>
                                        <td><input required type="radio" name="qnb<%=k%>" value="80"/> </td>
                                    </tr>
                                    <tr>
                                        <td colspan="2" style=" font-size:150%;font-weight: bold;" > The teacher demonstrates enthusiasm in teaching the unit</td>
                                        <td><input required type="radio" name="qnc<%=k%>" value="100"/> </td>
                                        <td><input required type="radio" name="qnc<%=k%>" value="95"/> </td>
                                        <td><input required type="radio" name="qnc<%=k%>" value="90"/> </td>
                                        <td><input required type="radio" name="qnc<%=k%>" value="85"/> </td>
                                        <td><input required type="radio" name="qnc<%=k%>" value="80"/> </td>
                                    </tr>
                                    <tr>
                                        <td colspan="2" style=" font-size:127%;font-weight: bold;" > Appropriate teaching techniques are used by the teacher to enhance my learning</td>
                                        <td><input required type="radio" name="qnd<%=k%>" value="100"/> </td>
                                        <td><input required type="radio" name="qnd<%=k%>" value="95"/> </td>
                                        <td><input required type="radio" name="qnd<%=k%>" value="90"/> </td>
                                        <td><input required type="radio" name="qnd<%=k%>" value="85"/> </td>
                                        <td><input required type="radio" name="qnd<%=k%>" value="80"/> </td>
                                    </tr>
                                    <tr>
                                        <td colspan="2" style="font-size:127%; font-weight: bold;"> The teacher is helpful if I encounter difficulties with the lecture or unit</td>
                                        <td><input required type="radio" name="qne<%=k%>" value="100"/> </td>
                                        <td><input required type="radio" name="qne<%=k%>" value="95"/> </td>
                                        <td><input required type="radio" name="qne<%=k%>" value="90"/> </td>
                                        <td><input required type="radio" name="qne<%=k%>" value="85"/> </td>
                                        <td><input required type="radio" name="qne<%=k%>" value="80"/> </td>
                                    </tr>
                                </table><br>
                                <%k++;%>
                            </logic:iterate>
                        </logic:notEmpty>
                        <input type="hidden" value="<%=k%>" name="kval"/>
                        <br> <input type="submit" value="Submit Feedback" style="width: 250px;"/>
                    </html:form>
                </div>
            </div>
        </div>
        <p class="footer">Copyright &copy; 2015 <a target="_blank" href="http://technicalgoals.blogspot.in/">Peddi Vamsi Krishna</a><br />
        </p>
    </body>
</html>