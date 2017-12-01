<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ajustes</title>
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
        </div>
    </body>
</html>
