<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <script src="js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Presupuesto</title>
        <link rel="stylesheet" type="text/css" href="css/estiloLogin.css"/>
        <link rel="stylesheet" type="text/css" href="css/estiloMenu.css"/>
    </head>
    <body>
        <header>
            <a><%= session.getAttribute("seccion")%></a>
        </header>
            <ul>
                <li><a href="Presupuesto.jsp">Presupuesto</a></li>
                <li><a href="<%= request.getContextPath()+"/ControlerReserva"%>" >Reservas</a></li>
                <li><a href="<%= request.getContextPath()+"/ControlerCuenta"%>" >Cuenta</a></li>
            </ul>
        
    </body>
</html>
<!-- 
a) Realizar un presupuesto.
    i) Consultar disponibilidad de las habitaciones según las fechas.
    ii) Consultar servicios adicionales.
    iii) Ver precio final
-->