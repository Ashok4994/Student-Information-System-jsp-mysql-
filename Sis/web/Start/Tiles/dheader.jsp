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
            <br><center><font color="red" size="5" ><%
            Object err = request.getAttribute("err");
            if (err == null) {
            } else {
                out.print(request.getAttribute("err"));
            }
            %></font></center>
        </div><!--end topBanner-->
        <br>
       
        <div id="wrap">
            <nav>
                <div id="menubar">
                    <ul id="nav">
                        <li ><a href="Home.pvk">Home</a></li>
                        <li class="current"><a href="Depart.pvk">Departments Home</a></li>
                        <li><a href="Student.pvk">Student Information Form</a></li>
                        <li><a href="facultyen.pvk">Faculty Enrollment</a></li>

                    </ul>
                </div><!--close menubar-->	
            </nav>
        </div>
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
            <h4>Admin Login</h4>
            <form action="alogin.pvk" method="post" >
                <p>
                    <input type="text" name="uname" id="uname" required size="22" autocomplete="off" autofocus />
                    <label for="log"> Username</label>
                </p>
                <p>
                    <input type="password" name="pwd" id="pwd" size="22" required  autocomplete="off" /> 
                    <label for="pwd">Password</label>
                </p>
                <input type="submit" name="submit" value="Login" class="button" required/>
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


    </body>
</html>