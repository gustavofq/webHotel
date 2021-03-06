<%@page import="Logica.Servicio"%>
<%@page import="java.text.DateFormat"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="Logica.Habitacion"%>
<%@page import="Logica.Hotel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>

<!DOCTYPE html>
<html>
    <head>
        
        <%!Hotel unHotel = new Hotel();%>
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
        <div class="container">
            <div class="row">
                <div class="col-sm-4">
                </div>
                <div class="col-sm-4">
                    <form id="ffecha" action="ControlerPresupuestar">
                        <div class="form-group">
                            <label for="text">Fecha Entrada</label>
                            <input type="date" name="fechaInicio" class="form-control"/>
                        </div>
                        <div class="form-group">
                            <label for="text">Fecha Salida</label>
                            <input type="date" name="fechaFinal" class="form-control"/>
                        </div>
                        
                        <div class="dropdown">
                            <select name="habitaciones">
                                <%for(Habitacion unaHabitacion : unHotel.mostrarHabitaciones()){%>
                                <option name="habitacion" value='<%= unaHabitacion.getId() %>'><%= "Número: " + unaHabitacion.getId() + " Tipo: " + unaHabitacion.getUnTipo().getNombre() + " Precio: " +unaHabitacion.getMontoPorNoche() %></option>
                                <%}%>
                            </select>   
                        </div>
                        <div>
                             <select name="servicios">
                                <%for(Servicio unServicio : unHotel.mostrarServicios()){%>
                                <option name="servicio" value="<%= unServicio.getId() %>"><%= "Servicio: " + unServicio.getNombre() %></option>
                                <%}%>
                            </select>    
                        </div>
                        <input type="submit" />
                    </form>
               </div>
                <div class="col-sm-4">
                    <ul>
                        <%
                        if(request.getParameter("fechaInicio") == null){
                            request.setAttribute("dias", 0);
                        }
                        double precio = 0.0;
                        if(request.getParameter("fechaFinal") == null){
                            request.setAttribute("precio", precio);
                        }
                        
                        %>
                        <li><label>Detalles</label></li>
                        <li><label>Dias: <%=request.getAttribute("dias")%></label></li>
                        <li><label >Precio final: <%=(Double)request.getAttribute("precio")%></label></li>
                    </ul>
                </div>
            </div>
        </div>
        <%if(request.getAttribute("mensaje")!= null){%>
        <script>alert("<%=request.getAttribute("mensaje")%>");</script>
        <% request.setAttribute("mensaje",null);%>
        <%}%>
    </body>
</html>
<!-- 
a) Realizar un presupuesto.
    i) Consultar disponibilidad de las habitaciones según las fechas.
    ii) Consultar servicios adicionales.
    iii) Ver precio final
-->