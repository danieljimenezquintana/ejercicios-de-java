<%-- 
    Document   : test
    Created on : 30-ene-2019, 23:06:03
    Author     : daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Test</title>
    </head>
    <body>
        <%
          int nota = 0;
          String[] preguntas = new String[10];
          for (int i = 0; i < 10; i++) {
              preguntas[i]=request.getParameter("p" + (i + 1));
            }
          nota = preguntas[0].equals("a")? (nota + 1): nota;
          nota = preguntas[1].equals("c")? (nota + 1): nota;
          nota = preguntas[2].equals("a")? nota + 1: nota;
          nota = preguntas[3].equals("a")? nota + 1: nota;
          nota = preguntas[4].equals("c")? nota + 1: nota;
          nota = preguntas[5].equals("b")? nota + 1: nota;
          nota = preguntas[6].equals("b")? nota + 1: nota;
          nota = preguntas[7].equals("b")? nota + 1: nota;
          nota = preguntas[8].equals("a")? nota + 1: nota;
          nota = preguntas[9].equals("c")? nota + 1: nota;
        %>
        <h1>Tu nota es un <%=nota%> </h1>
    </body>
</html>
