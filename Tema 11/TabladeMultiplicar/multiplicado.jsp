<%-- 
    Document   : multiplicado
    Created on : 30-ene-2019, 19:02:03
    Author     : daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tabla de multiplicar</title>
    </head>
    <body>
        <h1>Resultado</h1>
        <table>
        <%
          int num = Integer.parseInt(request.getParameter("numero"));
          for (int i = 0; i <= 10; i++) {
                out.print("<tr><th>" + num + "</th><th>x</th><th>" + i + "</th><th>=</th><th>" + (num * i) + "</th></tr>");
            }
        %>
        </table>
    </body>
</html>
