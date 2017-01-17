<%-- 
    Document   : About
    Created on : May 31, 2015, 11:29:03 PM
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
        <script>jQuery(".design").click(function() {
		var background = jQuery(this).css("backgroundImage");
		jQuery("body").css("backgroundImage",background);
	});	</script>
    </head>
    <body>
      
        <div id="content">
            <div id="scrollContent">
                <h2 class="entrytitle">About Lbrce</h2>
                <div class="entry">
                    <p>Lakireddy Balireddy College of Engineering was founded through Lakireddy Balireddy charitable trust in 1998 by a philanthropic NRI Sri Lakireddy Balireddy, an Engineer by study and a reputable entrepreneur by vocation. Since its inception it aims at value-based technical excellence, ultimately focusing on the development of the area. It started off with the total intake of 180 students and with four branches of B.Tech, namely ECE, CSE, EEE and Mechanical Engineering. In about one and a half decade of its academic saga, the college grew big in size and strength crowning its glory with invaluable accomplishments of its faculty and students.
                   <img SRC="<%=contextPath%>/Start/Images/Dheader/1.jpg" alt="" height="400" width="780" />
                        Lakireddy Balireddy College of Engineering is an ISO 9001:2008 Certified institution, approved by AICTE, Accredited by National Assesment and Accreditation Council (NAAC) with 'A' Grade and National Board of Accreditation (NBA). It has spacious campus spread over 60 acres, of serene and natural surroundings with plenty of greenery in Mylavaram, Krishna District. It has sufficient infrastructure with an administration block of 60,000 sq.ft. It facilitates AC Auditorium, AC Conference- room, well equipped laboratories, free internet with 28mbps leased line, a world class Library server with 4.5 tb back up area, an extension counter of Central Bank of India, H.T.Power supply two generator sets of capacity 375 kva, a new generator of capacity 250 kva is purchased, excellent canteen to cater to the needs of students and staff.</p>
                </div><!--end entry-->
                <div class="clear"></div>
            </div><!--end scrollContent-->
        </div><!--end content-->
    </body>
</html>
