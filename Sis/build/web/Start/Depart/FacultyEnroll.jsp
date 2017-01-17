<%-- 
    Document   : header
    Created on : May 30, 2015, 12:33:43 PM
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
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>Department Home</title>
        <link rel="stylesheet" href="<%=contextPath%>/Start/Css/style.css" type="text/css" media="screen" />
        <link rel="stylesheet" href="<%=contextPath%>/Start/Css/prettyPhoto.css" type="text/css" media="screen" />
        <script SRC="<%=contextPath%>/Start/Css/scripts.js" type="text/javascript"></script>
        <style>
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
               
                width: 300px;
                appearance: none;
                outline: 0;
                border: 1px solid rgba(255, 255, 255, 0.4);
                background-color: rgba(255, 255, 255, 0.2);
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
            #inputid {
                width: 500px;
                appearance: none;
                outline: 0;
                border: 1px solid rgba(255, 255, 255, 0.4);
                background-color: rgba(255, 255, 255, 0.2);
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
            form input:hover {
                background-color: rgba(255, 255, 255, 0.4);
            }
            /*  transition for table */         form input:focus {
                background-color: white;
                width: 300px;
                color: #53e3a6;
            }
            form input:hover {
                background-color: rgba(255, 255, 255, 0.4);
            }
            /*  transition for table */         form input:focus {
                background-color: white;
                width: 300px;
                color: #53e3a6;
            }
            #feedform {background:#333; text-align:left; border:4px solid #666; padding:15px 15px 5px 15px; margin:0 0 15px 0;}

        </style>
        <script>
            function gettname()
            {
                document.forms[0].enroll.value = "tname";
                document.forms[0].submit();

            }
            window.onload = function () {
                DrawCaptcha();
            }
            function DrawCaptcha()
            {
                var a = Math.ceil(Math.random() * 10) + '';
                var b = Math.ceil(Math.random() * 10) + '';
                var c = Math.ceil(Math.random() * 10) + '';
                var d = Math.ceil(Math.random() * 10) + '';
                var e = Math.ceil(Math.random() * 10) + '';
                var f = Math.ceil(Math.random() * 10) + '';
                var g = Math.ceil(Math.random() * 10) + '';
                var code = a + b + c + d + e + f + g;
                document.getElementById("txtCaptcha").value = code
            }
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
                var dname = document.forms[0].dfield;
                var tname = document.forms[0].tfield;
                var temail = document.forms[0].inputid;
                if (dname.value == "0")
                {
                    alert("Please select your department name");
                    dfield.focus();
                    return false;

                } else if (tname.value == "0")
                {
                    alert("Please select your  name");
                    tfield.focus();
                    return false;
                } else if (temail.value == "Enter your Registered MailId" || temail.value == "")
                {
                    alert("Please give your registered mailId");
                    inputid.focus();
                    return false;
                } else
                {
                    //document.getElementById("dfield").value = 0;
                }
            }
        </script>
    </head>
    <body>
        <div id="formbackground"></div>
        <div align="center"><h2 >Student Information System</h2></div>
        <!--TOP BAR-->
        <div id="topBanner">

            <!--LOGIN BUTTON-->
            <div  class="metaButton" id="loginOpen"><img SRC="<%=contextPath%>/Start/Images/Dheader/profile-trans.png" alt="" height="10" width="9" />&nbsp;<span>Admin LOGIN</span></div>

            <!--CONTACT BUTTON-->
            <div  class="metaButton" id="formOpen"><img SRC="<%=contextPath%>/Start/Images/Dheader/email-trans.png" alt="" height="10" width="18" /> &nbsp;<span>CONTACT Admin</span></div>

            <!--SEARCH BUTTON-->
            <div  class="metaButton" id="searchOpen"><img SRC="<%=contextPath%>/Start/Images/Dheader/search-trans.png" alt="" height="10" width="13" /> &nbsp;<span>About Admin</span></div>

            <!--SITE NAME-->
            <h1 id="logo"><a HREF="#">LBRCE Departments Description&nbsp&nbsp&nbsp&nbsp</a></h1><!--end logo--> 
            <br>
        </div><!--end topBanner-->
        <br>

        <div id="wrap">
            <nav>
                <div id="menubar">
                    <ul id="nav">
                        <li ><a href="Home.pvk">Home</a></li>
                        <li ><a href="Depart.pvk">Departments Home</a></li>
                        <li><a href="Student.pvk">Student Information Form</a></li>
                        <li class="current"><a href="facultyen.pvk">Faculty Enrollment</a></li>

                    </ul>
                </div><!--close menubar-->	
            </nav>
        </div>
        <div id="content">
            <div id="scrollContent">
                <img SRC="<%=contextPath%>/Start/Images/registration.jpg" alt="" height="100" width="740" />
                <div class="entry">
                    <html:form action="/facultyen" method="post" onsubmit="return ValidateContactForm()" >
                        <center><font color="red" size="4"><%
                            Object err = request.getAttribute("err");
                            if (err == null) {
                            } else {
                                out.print(request.getAttribute("err"));
                            }
                            %></font></center>
                        <input  type="hidden" name="pswd" id="txtCaptcha" />
                        <input type="hidden" name="enroll" id="enroll" value="enroll" /><br>
                        <center>
                            <html:select property="dname" onchange="gettname();"  styleId="dfield"  >
                                <html:option value="0" >Select your Department Name</html:option>
                                <html:optionsCollection property="dlist"  label="dname" value="did"  />
                            </html:select>
                        </center><br>
                        <center> 
                            <html:select property="tname"  styleId="tfield">
                                <html:option value="0">Select your Teacher Name</html:option>
                                <html:optionsCollection property="tlist"  label="tname" value="tid" />
                            </html:select>
                        </center><br>
                        <center>  <input type="text" name="temail" required onblur="onBlur(this)" onfocus="onFocus(this)"
                                         value="Enter your Registered MailId"  
                                         maxlength="30" autoComplete="off" name="temail" id="inputid"/></center> <br>
                            <html:submit value="Email The Password" style=" width: 350px;"/>
                        </html:form>
                </div><!--end entry-->
                <div class="clear"></div>
            </div><!--end scrollContent-->
        </div><!--end content-->
        <!--NAVIGATION-->
        <div id="menu">
            <div id="menuHint"></div>	
            <div id="menuScroll">	
                <ul id="dropmenu">
                    <li><a href="csehome.pvk" title="">Computer Science Engineering</a></li>
                    <li><a href="#" title="Sub Pages">Information Technology</a></li>
                    <li><a HREF="" title="">Electrical & Electronics  </a></li>
                    <li><a href="#" title="">Mechanical Engineering</a></li>
                    <li><a href="#" title="">AeroSpace Engineering</a></li>
                    <li><a href="#" title="">Electronics & Communication </a></li>
                    <li><a href="#" title="">Electronics & Instrumentation </a></li>
                    <li><a HREF="" title="">Cvil Engineering</a>
                    </li>
                    <li><a HREF="About.pvk" title="">About LBCE</a>
                    </li>
                </ul><!--end dropmenu-->
            </div><!--end menuScroll-->
        </div><!--end menu-->

        <div id="sidebar">
            <div id="sidebarHint">BACKGROUNDs</div>

            <div id="sidebarScroll">
                <ul>
                    <li class="widget">
                        <h2 class="widgettitle">Design Options (15 of 20)</h2>
                        <div class="textwidget">
                            <div id="nebula" class="design"></div>
                            <div id="wood" class="design"></div>
                            <div id="two" class="design"></div>
                            <div id="starfield" class="design"></div>
                            <div id="starfieldTwo" class="design"></div>
                            <div id="nebulaTwo" class="design"></div>
                            <div id="one" class="design"></div>
                            <div id="woodTwo" class="design"></div>
                            <div id="dark" class="design"></div>
                            <div id="darker" class="design"></div>
                            <div id="light" class="design"></div>
                            <div id="grunge" class="design"></div>
                            <div id="grungeTwo" class="design"></div>
                            <div id="three" class="design"></div>
                            <div id="grungeThree" class="design"></div>
                            <div class="clear"></div></div>
                    </li>
                </ul>
            </div><!--end sidebarScroll-->
        </div><!--end sidebar-->
        <!--LOGIN FORM-->
        <div id="login" class="flyer">
            <div class="close">X</div>
            <h4>Login</h4>
            <form action="alogin.pvk" method="post" >
                <p>
                    <input type="text" name="uname" id="uname" required size="22" autocomplete="off" autofocus />
                    <label for="log"> Username</label>
                </p>
                <p>
                    <input type="password" name="pwd" id="pwd" size="22" required  autocomplete="off" /> 
                    <label for="pwd">Password</label>
                </p> <p></p>
                <center><input type="submit" name="submit" value="Login" class="button" required/></center>
            </form>				
        </div>
        <!--CONTACT FORM-->
        <div id="contactform"  class="contact flyer">
            <div class="close">X</div>
             <img SRC="<%=contextPath%>/Start/Images/Dheader/sitedown.jpg" alt="" height="300" width="300" />
        </div><!--end contact-->
        <!--SEARCH FORM-->
        <div id="searching" class="flyer">
            <div class="close">X</div>
            <img SRC="<%=contextPath%>/Start/Images/Dheader/sitedown.jpg" alt="" height="300" width="300" />
        </div><!--end searching-->

        <!--FOOTER-->
        <div id="footerBanner">  
            <!--NEWSTICKER-->
            <div class="fadein">
                <div class="newsTick"><a HREF=""><strong>Dhirubhai Ambani</strong>:  “If you don’t build your dream, someone else will hire you to help them build theirs.”  ...</a></div>
                <div class="newsTick"><a HREF=""><strong>Eleanor Roosevelt</strong>: “Great minds discuss ideas; average minds discuss events; small minds discuss people.” ...</a></div>
                <div class="newsTick"><a HREF=""><strong>Mahatma Gandhi</strong>:  “Live as if you were to die tomorrow. Learn as if you were to live forever.” ...</a></div>
                <div class="newsTick"><a HREF=""><strong>David Allen</strong>: You can do anything, but not everything....</a></div>
                <div class="newsTick"><a HREF=""><strong>Albert Einstein</strong>:Imagination is more important than knowledge....</a></div>
            </div><!--end fadein-->

            <!--SOCIAL ICONS-->
            <a id="rss" class="socialBtn" href="http://technicalgoals.blogspot.in/" target="_blank"></a>
            <a id="twitter" class="socialBtn" HREF=""></a>
            <a id="facebook" class="socialBtn" HREF="https://www.facebook.com/vamsi.peddi" target="_blank"></a>
            <a id="youtube" class="socialBtn" HREF=""></a>
        </div><!--end footerBanner-->


    </body>
</html>