<%@page import="Logica.RHabitacion"%>
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
                    <form id="ffecha" action="ControlerNewReserva">
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
                    
                          <%
                        if(request.getParameter("fechaInicio") == null){
                            request.setAttribute("dias", 0);
                        }
                        double precio = 0.0;
                        if(request.getParameter("fechaFinal") == null){
                            request.setAttribute("precio", precio);
                        }
                        %> 
                        <hr>
                        <ul class="list-group" style="background-color: #ffffff ">
                            <li><label>Detalles</label></li>
                            <li><label>Dias: <%=request.getAttribute("dias")%></label></li>
                            <li><label>Precio final: <%=(Double)request.getAttribute("precio")%></label></li>
                        </ul>
               </div>
                <div class="col-sm-4">
                    <ul>
                        
                        <li><label>Reservas</label></li>
                        <%String usuario = session.getAttribute("seccion").toString();
                        int dni = unHotel.buscarPorUsuario(usuario);
                        for(RHabitacion unaRHabitacion : unHotel.consultarReserva(unHotel.DameElCliente(dni))){
                            String fechaEntrada = unaRHabitacion.getFechaEntrada().get(Calendar.DATE) +"/"+ unaRHabitacion.getFechaEntrada().get(Calendar.MONTH) +"/"+unaRHabitacion.getFechaEntrada().get(Calendar.YEAR);
                            String fechaSalida = unaRHabitacion.getFechaSalida().get(Calendar.DATE) +"/"+ unaRHabitacion.getFechaSalida().get(Calendar.MONTH) +"/"+unaRHabitacion.getFechaSalida().get(Calendar.YEAR);
                        %>
                        
                        <hr>   
                        <li><label>Habitacion: <%=unaRHabitacion.getUnaHabitacion().getId()+ " Tipo: " +unaRHabitacion.getUnaHabitacion().getUnTipo() +" Ingreso: "+ fechaEntrada +" Egreso: " + fechaSalida%></label></li>
                        <%}%>
                        <hr> 
                        <%if(request.getAttribute("habitacion")!= null){
                        Calendar calendarInicio = (Calendar) request.getAttribute("fechaI");
                        Calendar calendarfin = (Calendar) request.getAttribute("fechaI");
                        String fechaI = calendarInicio.get(Calendar.DATE) +"/"+ calendarInicio.get(Calendar.MONTH) +"/"+calendarInicio.get(Calendar.YEAR);
                        String fechaE = calendarfin.get(Calendar.DATE) +"/"+ calendarfin.get(Calendar.MONTH) +"/"+calendarfin.get(Calendar.YEAR);

                        %>
                         <li><label>Habitacion: <%=request.getAttribute("habitacion") +" Tipo: "+ request.getAttribute("tipo") +" Ingreso: "+ fechaI +" Egreso: "+ fechaE %></label></li>
                        <%}%>
                            
                         
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