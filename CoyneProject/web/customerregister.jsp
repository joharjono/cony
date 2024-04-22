<%
    if (session.getAttribute("login") != null) {
        response.sendRedirect("customerlogin.jsp");
    }
%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Register</title>
        <link rel="stylesheet" href="CSS/customer.css"> 
        <script src="AccountJS/register.js"></script>
    </head>
    <body>
        <div class="bungkus">
            <center>
                <div class="logo">
                    <img src="CSS/ilogo.png" alt="" id="ilogo">
                </div>  
                <!--                <h2>Register</h2>-->

                <form method="post" action="RegisterController" onsubmit="return validate();">

                    <input type="text" name="txt_username" id="username" placeholder="Username"></br>
                    <input type="password" name="txt_password" id="password" placeholder="Password"></br>
                    <input type="text" name="txt_email" id="email" placeholder="Email">
                    <input type="submit" name="btn_register" id="registrasi" value="Register" >

                    <h3>You have a account? <a href="customerlogin.jsp">Login</a></h3>

                </form>

                <h3 style="color:red">
                    <%
                        if (request.getAttribute("RegisterErrorMsg") != null) {
                            out.println(request.getAttribute("RegisterErrorMsg"));
                        }
                    %>
                </h3>

            </center>
        </div>
        <br><br><br><br><br><br>
    </body>

</html>
