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
        <style type="text/css"> 
            body {
                background: #eee !important;	
            }
            .wrapper {	
                margin-top: 80px;
                margin-bottom: 80px;
            }
            
            .form-signin {
                max-width: 380px;
                padding: 15px 35px 45px;
                margin: 0 auto;
                background-color: #fff;
                border: 1px solid rgba(0,0,0,0.1);  
                .form-signin-heading,
                .checkbox {
                    margin-bottom: 30px;
                }
                .checkbox {
                    font-weight: normal;
                }
                .form-control {
                    position: relative;
                    font-size: 16px;
                    height: auto;
                    padding: 10px;
                    @include box-sizing(border-box);
                    &:focus {
                        z-index: 2;
                    }
                }

                input[type="text"] {
                    margin-bottom: -1px;
                    border-bottom-left-radius: 0;
                    border-bottom-right-radius: 0;
                }
                
                input[type="password"] {
                    margin-bottom: 20px;
                    border-top-left-radius: 0;
                    border-top-right-radius: 0;
                }
            }
        </style>
    </head>
    <body>
        <h2>Gestionar cuenta</h2>
        <ul>
            <li><a href="index.jsp">Inicio</a></li>
            <li><a href="Reserva.jsp">Reservas</a></li>
            <li><a href="Presupuesto.jsp"></a></li>
        </ul>
        <footer>Todos los derechos reservados Facundo Enriquez T. - Quintana Gustavo F.</footer>
        <div class="wrapper">
            <form class="form-signin" action="ControlerHome" method="post">       
                <h2 class="form-signin-heading">Modificar</h2>
                <h3>Usuario</h3><input type="text" class="form-control" name="username" placeholder="Nuevo Usuario" required="" autofocus="" />
                <h3>Contraseña</h3><input type="password" class="form-control" name="password" placeholder="Vieja password" required=""/>
                <h3>Contraseña</h3><input type="password" class="form-control" name="password" placeholder="Nuevo password" required=""/>
                <button class="btn btn-lg btn-primary btn-block" type="submit">Cambiar</button>   
            </form>
        </div>
    </body>
</html>
<!--
c) Modificar los datos personales.
    i) Modificar los datos introducidos cuando se registró.
-->