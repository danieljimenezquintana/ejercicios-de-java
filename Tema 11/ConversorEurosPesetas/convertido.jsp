<%-- 
    Document   : convertido
    Created on : 30-ene-2019, 10:08:01
    Author     : daniel
--%>

<%@page import="java.text.DecimalFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Conversor de Euros y Pesetas</title>
    </head>
    <body style="background-color: blue; position:relative; padding-left: 35%;padding-top: 5%; text-align: center; ">
        <div style="background-color:rgba(204, 255, 255,0.6); width: 60%;border-radius: 40px;">
        <%
          DecimalFormat dosDecimales = new DecimalFormat("0.00");
          if(request.getParameter("conversion").equals("pe")){
            int pesetas = Integer.parseInt(request.getParameter("cantidad"));
            double euros;
            euros = (double)pesetas / 166.386;
            double respuesta = euros;
        %><h1>El cambio de moneda ha sido <%= dosDecimales.format(respuesta) %></h1>
          <%}else{
            int euros = Integer.parseInt(request.getParameter("cantidad"));
            double pesetas;
            pesetas = euros * 166.386;
            double respuesta = pesetas;
          %><h1>El cambio de moneda ha sido <%= dosDecimales.format(respuesta) %></h1>
          <%
            }
          %>
        </div>
    </body>
</html>
