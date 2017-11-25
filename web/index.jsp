<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Example</title>
        <link rel="stylesheet" type="text/css" href="CSS.css"> 
        <style type="text/css"> 
            body { 
            color: purple; 
            background-color: #d8da3d } 
        </style> 
    </head>
    <body>
        <form method="post" action="login.jsp">
            
            <center>
            <table border="1" width="30%" cellpadding="3">
                <thead>
                    <tr>
                        <th colspan="2">Ingresar</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Nombre de Usuario
                        
                            
                        </td>
                        <td><input type="text" name="uname" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="pass" value="" /></td>
                    </tr>
                    <tr>
                        <td><input type="submit" value="Ingresar" /></td>
                        <td><input type="reset" value="Restaurar" /></td>
                    </tr>
                    <tr>
                        <td colspan="2">Yet Not Registered!! <a href="reg.jsp">Register Here</a></td>
                    </tr>
                </tbody>
            </table>
            </center>
            <h1>  <%= (String)request.getAttribute("nombre")%> </h1>
        </form>
    </body>
</html>