<%-- 
    Document   : adminlogin
    Created on : Dec 1, 2021, 12:37:59 AM
    Author     : ASUS
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Login</title>
        <link rel="stylesheet" href="CSS/customerAccount.css"> 
        <script src="AccountJS/login.js"></script>

    </head>
    <body>
        <div class="bungkus">
            <center>
                <div class="logo">
                    <img src="CSS/ilogo.png" alt="" id="ilogo">
                </div>
                <form method="post" action="LoginControllerAdmin" name="LoginForm" onsubmit="return validate();">

                    <input type="text" name="txt_username" id="username" placeholder="Username"><br>
                    <input type="password" name="txt_password" id="password" placeholder="Password"><br>

                    <input type="submit" name="btn_login" value="Login" id="login">

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






