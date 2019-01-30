<%-- 
    Document   : cocheListo
    Created on : 29-ene-2019, 13:58:43
    Author     : daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Aquí tiene su reloj</h1>
        <img src="img/reloj_<%= request.getParameter("material") %>_<%= request.getParameter("color") %>.png">
    </body>
</html>

