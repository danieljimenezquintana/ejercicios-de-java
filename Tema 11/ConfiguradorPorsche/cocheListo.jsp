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
        <h1>Aquí tiene su coche</h1>
        <img src="img/<%= request.getParameter("color") %><%= request.getParameter("llantas") %>.jpg">
    </body>
</html>
