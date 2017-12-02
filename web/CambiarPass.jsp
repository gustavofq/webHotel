<%-- 
    Document   : Cuenta
    Created on : 26/11/2017, 21:29:28
    Author     : maquinola
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestionar Cuenta</title>
        <link href="css/estiloMenu.css" rel="stylesheet">
        <link href="css/estiloLogin.css" rel="stylesheet">
    </head>
    <body>
        <header>
            <a><%= session.getAttribute("seccion")%></a>
            <ul>
                <li><a href="Ajustes.jsp">Ajustes</a></li>
                <li><a href="cambiarPass.jsp">Cambiar Contraseña</a></li>
            </ul>
        </header>
        <div class="wrapper">
            <form class="form-signin" action="ControlerHome" method="post">       
                <h2 class="form-signin-heading">Modificar</h2>
                <h2>Usuario</h3><input type="text" class="form-control" name="username" placeholder="Nuevo Usuario" required="" autofocus="" />
                <h2>Contraseña</h3><input type="password" class="form-control" name="password" placeholder="Vieja password" required=""/>
                <h2>Contraseña</h3><input type="password" class="form-control" name="password" placeholder="Nuevo password" required=""/>
                <button class="btn btn-lg btn-primary btn-block" type="submit">Cambiar</button>   
            </form>
        </div>
    </body>
</html>
<!--
c) Modificar los datos personales.
    i) Modificar los datos introducidos cuando se registró.
-->