<%@ page import ="java.sql.*" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <form action="loginServlet">
            <center>
            
            <h4>Benvenuto in Project Cip Cip il nuovo modo di monitorare la tua auto!</h4>
            <h4>Procedi al login se sei un utente già registrato!</h4>
            <table border="1" width="30%" cellpadding="5">
                <thead>
                    <tr>
                        <th colspan="2">Inserire dati utente</th>
                    </tr>
                </thead>
                <tbody>
                     <tr>
                        <td>Username</td>
                        <td><input type="text" name="username" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="pwd" value="" /></td>
                    </tr>
                    </tbody>
                    
            </table>
            <button type="submit" value="submit">Login</button>
             
             <h5>Non ancora registrato?<a href="reg.jsp">Procedi alla registrazione</a></h5>
             
            
            </center>
        </form>
    </body>
</html>