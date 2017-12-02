<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <script src="js/bootstrap.min.js"></script>
        <title>Principal</title>
        <link rel="stylesheet" type="text/css" href="CSS.css"> 
        <link href="css/estiloMenu.css" rel="stylesheet">
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
                <li><a href="Presupuesto.jsp">Presupuesto</a></li>
                <li><a href="Reserva.jsp">Reservas</a>
                    <ul>
                        <li><a href="ListaDeReserva.jsp">Lista de Reserva</a></li>
                    </ul>
                </li>
            </ul>
        <footer>Todos los derechos reservados Facundo Enriquez T. - Quintana Gustavo F.</footer>
    </body>
</html>