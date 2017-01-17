<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<% String contextPath = request.getContextPath();%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Feedback Page</title>
        <link rel="stylesheet" type="text/css" href="<%=contextPath%>/Start/Css/Home/Home.css" title="Home" media="screen,projection" />
        <style>
            form {
                padding: 20px 0;
                position: relative;
                z-index: 2;
            }
            form input {
                appearance: none;
                outline: 0;
                border: 1px solid rgba(255, 255, 255, 0.4);
                background-color: rgba(255, 255, 255, 0.2);
                width: 500px;
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
            form input:focus {
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
            #lab {
                width: 100px;
                height: 100px;
                color: #B4886B;
                position: relative;
                -webkit-animation-name: example;  Chrome, Safari, Opera 
                -webkit-animation-duration: 4s;  Chrome, Safari, Opera 
                -webkit-animation-iteration-count: 3;  Chrome, Safari, Opera 
                -webkit-animation-direction: alternate;  Chrome, Safari, Opera 
                animation-name: example;
                animation-duration: 4s;
                animation-iteration-count: 3;
                animation-direction: alternate;    
            }

            /* Chrome, Safari, Opera */
            @-webkit-keyframes example {
                0%   {color:blue; left:0px; top:0px;}
                0%  {color:yellow; left:200px; top:0px;}

                0% {color:yellow; left:0px; top:0px;}
            }

            /* Standard syntax */
            @keyframes example {
                0%   {color:blue; left:0px; top:0px;}
                0%  {color:yellow; left:150px; top:0px;}
                0% {color:yellow; left:0px; top:0px;}

            }


        </style>
    </head>
    <body id="back">
        <div id="dialogoverlay"></div>
        <div id="dialogbox">
            <div>
                <div id="dialogboxhead"></div>
                <div id="dialogboxbody"></div>
                <div id="dialogboxfoot"></div>
            </div>
        </div>
        <div id="wrap">
            <h1><img src="<%=contextPath%>/Start/Images/Home/1.jpg" width="35"/>&nbsp<a target="_blank" href="https://lbrce.ac.in//">Lakireddy Balireddy College Of Engineering</a></h1>
            <h3 class="slogan"><b>Student Information System</b></h3>
            <nav>
                <div id="menubar">
                    <ul id="nav">
                        <li ><a href="Home.pvk">Home</a></li>
                        <li><a href="Depart.pvk">Departments Home</a></li>
                        <li ><a href="Student.pvk">Student Information Form</a></li>
                        <li class="current"><a href="Feedback.pvk">Feedback Form</a></li>

                    </ul>
                </div><!--close menubar-->	
            </nav>
            <div id="maincontent">
                <h2 id="hback">No need to <a href="https://www.google.com">make things</a> complicated...</h2>
                <div id="maincontent">
                    <h2 id="hback">Do you Want to see <a href="./feddisplay.pvk">Submitted Feedbacks</a>!!!!</h2>
                </div>
                <div id="feedform" align="center">
                    <!--                    <font size="6" color="white" id="head" > Your FeedBack Is Submitted</label></font>-->

                    <font size="4" color="white" id="head" ><label id="lab"> <center><%=request.getAttribute("Message")%><br> <br>and also submitted</center></label></font>

                </div>
            </div>
            <p class="footer">Copyright &copy; 2015 <a target="_blank" href="http://technicalgoals.blogspot.in/">Peddi Vamsi Krishna</a><br />
            </p>
        </div>

    </body>