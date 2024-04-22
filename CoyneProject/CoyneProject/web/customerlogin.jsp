<%
    if (session.getAttribute("login") != null) {
        response.sendRedirect("customerwelcome.jsp");
    }
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Login</title>
        <link rel="stylesheet" href="CSS/customer.css"> 
        <script src="AccountJS/login.js"></script>

    </head>
    <body>
       
        <div class="bungkus">
            <center>
                <div class="logo">
                    <img src="CSS/ilogo.png" alt="" id="ilogo">
                </div>
                <form method="post" action="LoginController" name="LoginForm" onsubmit="return validate();">

                    <input type="text" name="txt_username" id="username" placeholder="Username"><br>
                    <input type="password" name="txt_password" id="password" placeholder="Password"><br>

                    <input type="submit" name="btn_login" value="Login" id="login">

                    <h3>Your don't have a account? <a href="customerregister.jsp">Register</a></h3>
                    </div>           
                </form>
                
                <h3 style="color:green" id="cucces">
                    <%
                        if (request.getAttribute("RegiseterSuccessMsg") != null) {
                            out.println(request.getAttribute("RegiseterSuccessMsg"));
                        }
                    %>
                </h3>

                <h3 style="color:red">
                    <%
                        if (request.getAttribute("WrongLoginMsg") != null) {
                            out.println(request.getAttribute("WrongLoginMsg"));
                        }
                    %>
                </h3>
            </center>
    </body>
</html>

