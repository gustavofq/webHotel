<%-- 
    Document   : Reserva
    Created on : 27/11/2017, 18:20:00
    Author     : maquinola
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestionar Reserva</title>
        <link rel="stylesheet" type="text/css" href="css/estiloLogin.css">
        
       
    </head>
    <body>
<h2>Gestionar cuenta</h2>
        <ul>
            <li><a href="index.jsp">Inicio</a></li>
            <li><a href="Reserva.jsp">Reservas</a></li>
            <li><a href="Presupuesto.jsp"></a></li>
        </ul>
        <div class="wrapper">
            <form class="form-signin" action="ControlerAjustes" method="post">       
                <h2 class="form-signin-heading">Modificar</h2>
                <h2>Nombre</h3><input type="text" class="form-control" name="nombre"/>
                <h2>apellido</h3><input type="text" class="form-control" name="apellido" />
                <h2>Número de Tarjeta</h3><input type="text" class="form-control" name="tarjeta"/>
                <button class="btn btn-lg btn-primary btn-block" type="submit">Cambiar</button>   
            </form>
    </body>
</html>
<!--
d) Realizar reserva de habitación.
    i) Consultar disponibilidad de las habitaciones según las fechas.
    ii) Elegir tipo de habitación y cantidad de las mismas.
    iii) Ver precio final.
    iv) Introducir número de tarjeta.
    v) Realizar reserva.
e) Modificar reserva.
    i) Mandar mensaje a recepción.
f) Cancelar reserva.
    i) Mandar mensaje a recepción.
g) Consultar Reservas.
    i) Consultar factura.
-->