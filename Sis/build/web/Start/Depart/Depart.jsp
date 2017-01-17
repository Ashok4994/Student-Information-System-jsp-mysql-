<%-- 
    Document   : Depart
    Created on : May 30, 2015, 12:54:46 PM
    Author     : PEDDI'S
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<% String contextPath = request.getContextPath();%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<title>Department Home</title>

	<link rel="stylesheet" href="<%=contextPath%>/Start/Css/style.css" type="text/css" media="screen" />
	
</head>
<body>


<div id="formbackground"></div>
<!--ANIMATING GIF WHILE PAGE LOADS-->
<img id="loadingGif" SRC="<%=contextPath%>/Start/Images/Dheader/ajax-loader.gif" alt="" />
<div id="slider">
	<a class="tooltip" HREF="" title="admin block"><img SRC="<%=contextPath%>/Start/Images/Dheader/1.jpg" alt="" height="400" width="780" /></a>
	<a class="tooltip" HREF="" title="cse"><img SRC="<%=contextPath%>/Start/Images/Dheader/7.jpg" alt="" height="400" width="780" /></a>
	<a class="tooltip" HREF="" title="ece"><img SRC="<%=contextPath%>/Start/Images/Dheader/2.jpg" alt="" height="400" width="780" /></a>
	<a class="tooltip" HREF="" title="cse 1st block"><img SRC="<%=contextPath%>/Start/Images/Dheader/3.jpg" alt="" height="400" width="780" /></a>
	<a class="tooltip" HREF="" title="garden"><img SRC="<%=contextPath%>/Start/Images/Dheader/4.jpg" alt="" height="400" width="780" /></a>
	<a class="tooltip" HREF="" title="overview"><img SRC="<%=contextPath%>/Start/Images/Dheader/5.jpg" alt="" height="400" width="780" /></a>
	<a class="tooltip" HREF="" title="library"><img SRC="<%=contextPath%>/Start/Images/Dheader/6.jpg" alt="" height="400" width="780" /></a>
</div><!--end slider-->



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

</body>
</html>