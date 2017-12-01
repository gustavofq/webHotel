<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page session="true" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingresar</title>
        
        <link rel="stylesheet" type="text/css" href="css/estiloLogin.css"
    </head>
    <body>
        <div class="wrapper">
            <form class="form-signin" action="ControlerHome" method="post">       
                <h2 class="form-signin-heading">Ingresar</h2>
                <input type="text" class="form-control" name="username" placeholder="Email Address" required="" autofocus="" />
                <input type="password" class="form-control" name="password" placeholder="Password" required=""/>      
                <label class="checkbox">
                    <input type="checkbox" value="remember-me" id="rememberMe" name="rememberMe"> Remember me
                </label>
                <button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>  
                <a href="Registrarse.jsp">Registrarse</a>
            </form>
            <%if(request.getAttribute("mensaje")!= null){%>
                <script>alert("<%=request.getAttribute("mensaje")%>");</script>
                <% request.setAttribute("mensaje",null);%>
            <%}%>
        </div>
    </body>
</html>

<!--
(b)Registrarse en la aplicación.
    (i) Añadir cliente en el registro.
        (1) Introducir nombre único de usuario y contraseña.
        (2) Introducir datos personales.
-->