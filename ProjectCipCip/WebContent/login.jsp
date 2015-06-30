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
            <table border="1" width="30%" cellpadding="5">
                <thead>
                    <tr>
                        <th colspan="2">Inserire dati utente</th>
                    </tr>
                </thead>
                <tbody>
                     <tr>
                        <td>User Name</td>
                        <td><input type="text" name="username" value="" /></td>
                    </tr>
                    <tr>
                        <td>Password</td>
                        <td><input type="password" name="pwd" value="" /></td>
                    </tr>
                    </tbody>
                    
            </table>
            <button type="submit" value="submit">Login</button>
             
             <h1>Already registered!! <a href="reg.jsp">ALtrimenti procedi alla registrazione</a></h1>
             
            
            </center>
        </form>
    </body>
</html>