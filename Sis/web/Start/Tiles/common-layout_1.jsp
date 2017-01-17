<%-- 
    Document   : common-layout
    Created on : May 25, 2015, 9:52:52 PM
    Author     : PEDDI'S
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table align="center">
            <tr><td>
                    <tiles:insert attribute="header"/></td></tr>
 
        <tr><td> <tiles:insert attribute="body"/> </td></tr>
 
      <tr><td> <tiles:insert attribute="footer"/></td></tr>
        </table>
    </body>
</html>
