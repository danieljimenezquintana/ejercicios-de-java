<%-- 
    Document   : piramide
    Created on : 30-ene-2019, 19:57:58
    Author     : daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Piramide</title>
    </head>
    <body>
        <h1>Pirámide</h1>
        <table>
        <%
          int altura = Integer.parseInt(request.getParameter("altura"));
          int planta = 1;
          int espacios = altura - 1;
          int longitudDeLinea = 1;
          while (planta <= altura) {
            out.print("<tr>");
            // inserta espacios
            for (int i = 1; i <= espacios; i++) {
              out.print("<th> </th>");
            }

            // pinta la línea
            for (int i = 1; i <= longitudDeLinea; i++) {
              out.print("<th><img src='img/ladrillo.jpg'></th>");
            }

            out.print("</tr>");
            planta++;
            espacios--;
            longitudDeLinea += 2;
          }
        %>
        </table>
    </body>
</html>
