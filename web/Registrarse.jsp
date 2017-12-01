
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrarse</title>
        <link rel="stylesheet" type="text/css" href="CSS.css">
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
        <div class="wrapper">
            <form class="form-signin" action="ControlerRegistrarse" method="post">       
                <h2 class="form-signin-heading">Ingresar</h2>
                <h5>Nombre</h5><input type="text" class="form-control" name="nombre" placeholder="ej: Pedro" required="" autofocus="">
                <h5>Apellido</h5><input type="text" class="form-control" name="apellido" placeholder="ej: Diaz" required=""/>
                <h5>DNI</h5><input type="text" class="form-control" name="dni" placeholder="ej: 12345678" required=""/>
                <h5>N° tarjeta</h5><input type="text" class="form-control" name="tarjeta" placeholder="ej: 548418574" required=""/>
                <h5>Usuario</h5><input type="text" class="form-control" name="user" placeholder="ej: pedroD" required=""/>
                <h5>Password</h5><input type="password" class="form-control" name="password" placeholder="Password" required=""/>
                <h5>Password</h5><input type="password" class="form-control" name="password2" placeholder="Repetir Password" required=""/>
                <button class="btn btn-lg btn-primary btn-block" type="submit">Guardar</button>  
            </form>
        </div>
    </body>
</html>
