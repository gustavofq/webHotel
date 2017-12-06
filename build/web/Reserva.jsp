

<%@page import="Logica.Habitacion"%>
<%@page import="Logica.Tipo"%>
<%@page import="Logica.Hotel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <script src="js/bootstrap.min.js"></script>
        <title>Reserva</title>
        <link rel="stylesheet" type="text/css" href="CSS.css"> 
        <link href="css/estiloMenu.css" rel="stylesheet">
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