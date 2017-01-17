<%-- 
    Document   : cseh
    Created on : Jun 11, 2015, 10:02:12 PM
    Author     : PEDDI'S
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% String contextPath = request.getContextPath();%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="<%=contextPath%>/Start/Css/style.css" type="text/css" media="screen" />
        <link rel="stylesheet" href="<%=contextPath%>/Start/Css/prettyPhoto.css" type="text/css" media="screen" />
        <title>JSP Page</title>
        <script type="text/javascript">
jQuery.noConflict(); jQuery(document).ready(function(){
	//SLIDER STUFF
	jQuery('#slider').fadeIn(400).nivoSlider({
		effect:'random',
		slices:15,
		animSpeed:500,
		pauseTime:3000,
		directionNav:true,
		directionNavHide:false, //Only show on hover
		controlNav:true, //1,2,3...
		pauseOnHover:true, //Stop animation while hovering
		manualAdvance:false, //Force manual transitions
		beforeChange: function(){},
		afterChange: function(){}
	});
	var negativemargin = jQuery(".nivo-controlNav").outerWidth() / 2;
	jQuery(".nivo-controlNav").css("marginLeft",-negativemargin);
	
	//TYPEWRITER EFFECT
	jQuery('.listing p > a, small > a, .comment-meta > a, h1 > a, h2 > a, h3 > a, h4 > a, h5 > a, h6 > a').jTypeWriter({duration:1, sequential:false});
		
	//BACKGROUND CHANGER
	jQuery(".design").click(function() {
		var background = jQuery(this).css("backgroundImage");
		jQuery("body").css("backgroundImage",background);
	});	
});
</script>
    </head>
    <body>
        <div id="content">
            <div id="scrollContent">
                <marquee width="100%" behavior="alternate"> <h2 class="entrytitle">Welcome! to Computer Science Department</h2></marquee>
                <div class="entry">
                    <h3 style="color:violet;">VISION:</h3>
                    <p>The Computer Science & Engineering department is committed to continuous technical improvement of its educational environment  in order to  provide quality education and professional experiences to empower students in the computing disciplines to attain their professional and academic goals.
                    </p><br>
                    <h3 style="color:violet;">Login Here:</h3><br>
                     <a href="rlogin.pvk"> <img SRC="<%=contextPath%>/Start/Depart/cse/login.jpg" alt="Login here"  width='500'height="50" /></a><br><br>
                    <img SRC="<%=contextPath%>/Start/Depart/cse/new.gif" alt="" height='50' />
                    <a href="dlogin.pvk"> <img SRC="<%=contextPath%>/Start/Depart/cse/flogin.png" alt="Login here"  width='300'height="50" /></a><br><br>
                    <br>
                    <img SRC="<%=contextPath%>/Start/Images/Dheader/9.jpg" alt="" height="400" width="780" /><br><br>
                    <h3 style="color:violet;">MISSION:</h3>
                    <ul type='circle'>
                        <li>To develop a strong theoretical and practical background across the computer science discipline with an emphasis on problem solving.</li>
                        <li>To produce globally competetive graduates having creative skills and ethical values, who can keep pace with technological advancements in Computer Science and Engineering.</li>
                        <li>Enhance the students knowledge in the latest technologies by organizing technical workshops on cutting edge technologies.</li>
                        <li>To provide a vibrant academic environment that imparts value addition to faculty and students to achieve personal and professional growth.</li>
                    </ul>   
                </div><!--end entry-->
            </div><!--end scrollContent-->
        </div><!--end content-->
    </body>
</html>
