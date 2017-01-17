<%-- 
    Document   : logout
    Created on : Jun 15, 2015, 9:17:36 PM
    Author     : PEDDI'S
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <!--        <h1>You have been successfully logged out!!!!</h1>
                <br> <br> <br> <br>
                <h2>Go back<a href="login.jsp">Home!!!</a></h2>-->
        <%

            if ((session.getAttribute("username") != null) && (session.getAttribute("slog") != null)) {
                session.invalidate();
                response.sendRedirect("/Sis/Student.pvk");
            } else if ((session.getAttribute("username") == null) && (session.getAttribute("slog") == null)) {
                session.invalidate();
                response.sendRedirect("/Sis/Student.pvk");
            } else {
                session.invalidate();
                response.sendRedirect("/Sis/Student.pvk");
            }

        %>
</body>
</html>
