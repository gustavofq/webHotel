<%-- 
    Document   : Presupuesto
    Created on : 27/11/2017, 18:18:52
    Author     : maquinola
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Presupuestar</title>
        <style>
             ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
            width: 200px;
            background-color: #f1f1f1;
            }

            li a {
            display: block;
            color: #000;
            padding: 8px 16px;
            text-decoration: none;
            }

            li a:hover {
            background-color: #555;
            color: white;
            }
            
            footer{
                margin: 0;
            color: #000;
            padding: 650px 16px;
            text-decoration: none;
            text-align: center;  
        </style>
            
    </head>
    <body>
        <ul>
            <li><a href="index.jsp">Inicio</a></li>
            <li><a href="Reserva.jsp">Reservas</a></li>
            <li><a href="Cuenta.jsp">Cuenta</a></li>
        </ul>
    </body>
</html>
<!-- 
a) Realizar un presupuesto.
    i) Consultar disponibilidad de las habitaciones según las fechas.
    ii) Consultar servicios adicionales.
    iii) Ver precio final
-->