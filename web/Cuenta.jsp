<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<!DOCTYPE html>
<html>
    <head>
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <script src="js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cuenta</title>
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
        <div class="wrapper">
            <form class="form-signin" action="ControlerCuenta" method="post">       
                <h2 class="form-signin-heading">Modificar</h2>
                <h2>Nombre</h2>
                <input type="text" class="form-control" name="username" value="<%=(String)request.getAttribute("nombre")%>"/>
                <input type="text" class="form-control" name="username"value="<%=(String)request.getAttribute("apellido")%>"/>
                <input type="text" class="form-control" name="username" value="<%=(Double)request.getAttribute("tarjeta")%>"/>
                <input type="text" class="form-control" name="username" value="<%=(String)request.getAttribute("user")%>"/>
                <button class="btn btn-lg btn-primary btn-block" type="submit">Guardar</button>   
            </form>
            <%if(request.getAttribute("mensaje")!= null){%>
                <script>alert("<%=request.getAttribute("mensaje")%>");</script>
                <% request.setAttribute("mensaje",null);%>
            <%}%>
        </div>
    </body>
</html>