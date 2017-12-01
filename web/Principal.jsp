<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Principal</title>
        <link rel="stylesheet" type="text/css" href="CSS.css"> 
        <style type="text/css"> 
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
                align-content: flex-end;
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
            <li><a><%= session.getAttribute("seccion")%></a></li>
            <li><a href="Presupuesto.jsp">Presupuesto</a></li>
            <li><a href="Reserva.jsp">Reservas</a></li>
            <li><a href="Ajustes.jsp">Cuenta de <%=request.getParameter("username")%></a></li>
        </ul>
        <footer>Todos los derechos reservados Facundo Enriquez T. - Quintana Gustavo F.</footer>
    </body>
</html>