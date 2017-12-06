<%-- 
    Document   : Reserva
    Created on : 27/11/2017, 18:20:00
    Author     : maquinola
--%>

<%@page import="Logica.Habitacion"%>
<%@page import="Logica.Tipo"%>
<%@page import="Logica.Hotel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script> 
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gestionar Reserva</title>
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
        <ul class="menu">
            <li><a href="Principal.jsp">Inicio</a></li>
            <li><a href="Presupuesto.jsp">Presupuesto</a></li> 
        </ul>
        <div class="container">
            <div class="row">
                <div class="col-sm-4">
                </div>
                <div class="col-sm-4">
                    <form id="ffecha" action="ControlerReserva">
                        <div class="form-group">
                            <label for="text">Fecha Entrada</label>
                            <input type="date" name="fechaInicio" class="form-control"/>
                        </div>
                        <div class="form-group">
                            <label for="text">Fecha Salida</label>
                            <input type="date" name="fechaInicio" class="form-control"/>
                        </div>
                        <form action="controlerReserva">
                        <div class="dropdown">
                            
                            <button class="btn btn-default dropdown-toggle" type="submit" id="menu1" data-toggle="dropdown">Tipo
                                <span class="caret"></span>
                            </button>
                            <ul class="dropdown-menu" role="menu" aria-labelledby="menu1">
                                
                                <li role="presentation"><a role="menuitem" tabindex="-1" href="#"><%=request.getAttribute("hola")%></a></li>
                                
                            </ul>
                        </div>
                        </form>
                        <div class="dropdown">
                            <button class="btn btn-default dropdown-toggle" type="submit" id="menu1" data-toggle="dropdown">Habitacion
                                <span class="caret"></span>
                            </button>
                            <ul class="dropdown-menu" role="menu" aria-labelledby="menu1">
                                <%
                                    Hotel unHotel = new Hotel();
                                    for(Habitacion unaHabitacion : unHotel.mostrarHabitaciones()){
                                      
                                %>
                                   <li role="presentation"><a role="menuitem" tabindex="-1" href="#"><%= unaHabitacion.getId() %></a></li>
                                <%}%>
                            </ul>
                        </div>
                            <button type="submit" name="reservar"> Reservar</button>
                    </form>
               
               </div>
                <div class="col-sm-4">
                </div>
            </div>
        </div>
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