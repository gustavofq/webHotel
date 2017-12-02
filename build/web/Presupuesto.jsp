<%-- 
    Document   : Presupuesto
    Created on : 27/11/2017, 18:18:52
    Author     : maquinola
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Presupuestar</title>
        <link rel="stylesheet" type="text/css" href="css/estiloLogin.css">
         <style>
            body{
                padding: 0px 0px;
            }
            
            ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
            width: 200px;
            background-color: #f1f1f1;
            }

            li a {
            display: block;
            color: #111;
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
            }
            
            header{
                display: line;
                text-align: center;
                font: fantasy;
                background-color: #138496;
                padding: auto;
                font-size: 25px; 
                
            }
            header ul{
                align-content: space-around;
            }
        </style>
    </head>
    <body>
        <header>
            <a><%= session.getAttribute("seccion")%></a>
            <ul>
                <li><a href="Ajustes.jsp">Ajustes</a></li>
                <li><a href="cambiarPass.jsp">Cambiar Contraseña</a></li>
            </ul>
        </header>
        <ul>
            <li><a href="Principal.jsp">Inicio</a></li>
            <li><a href="Reserva.jsp">Reservas</a></li>
        </ul>
    </body>
</html>
<!-- 
a) Realizar un presupuesto.
    i) Consultar disponibilidad de las habitaciones según las fechas.
    ii) Consultar servicios adicionales.
    iii) Ver precio final
-->