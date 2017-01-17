<%-- 
    Document   : Home
    Created on : May 29, 2015, 10:38:25 PM
    Author     : THOTA'S
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%=request.getContextPath() %>--%>
<% String contextPath = request.getContextPath();%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en" xml:lang="en">
    <head>
        <meta http-equiv="content-type" content="text/html; charset=utf-8" />
        <meta name="description" content="Your description goes here" />
        <meta name="keywords" content="your,keywords,goes,here" />
        <meta name="pvk" content="Ashok Chakravarthy Thota" />
        <link rel="stylesheet" type="text/css" href="<%=contextPath%>/Start/Css/Home/Home.css" title="Home" media="screen,projection" />
        <title>Home</title>
    </head>

    <body id="back">
        <div id="wrap">
            <h1><img src="<%=contextPath%>/Start/Images/Home/1.jpg" width="35"/>Acharya Nagarjuna University</h1>
            <h3 class="slogan"><b>Student Information System</b></h3>
            <nav>
                <div id="menubar">
                    <ul id="nav">
                        <li class="current"><a href="Home.pvk">Home</a></li>
                        <li><a href="Depart.pvk">Departments Home</a></li>
                        <li><a href="Student.pvk">Student Information Form</a></li>
                        <li><a href="Feedback.pvk">Feedback Form</a></li>
                    </ul>
                </div><!--close menubar-->	
            </nav>
            <div id="maincontent">
                <h2 id="hback">No need to <a href="https://www.google.com" target="_blank">make things</a> complicated...</h2>
                <img src="<%=contextPath%>/Start/Images/Home/2.png" width="400" height="" align="right"/>
                <p>A student information system (SIS) is a software application for education establishments to manage student data. Student Information Systems (often abbreviated as SIS systems) provide capabilities for retrieving student information and other assessment scores, build student schedules, track student attendance, and manage many other student-related data needs in a school.</p>
                <p></p>
                <h3>More useful resources:</h3>
                <ul>
                    <li><a href="http://www.tutorialspoint.com/" target="_blank">Online Guide for CSE Students</a></li>
                    <li><a href="http://www.realworldengineering.org/" target="_blank">Engineering Projects</a></li>
                    <li><a href="http://www.campusrecruitment.co.in/" target="_blank">CRT</a></li>
                </ul>
            </div>

            <p class="footer">Copyright &copy; 2015 <a href="http://hacktrack55.blogspot.com/" target="_blank">Ashok Chakravarthy Thota</a><br />
            </p>
          </div>
    </body>
</html>
