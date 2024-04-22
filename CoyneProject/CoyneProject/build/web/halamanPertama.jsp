<%-- 
    Document   : halamanPertama
    Created on : Nov 30, 2021, 12:09:26 PM
    Author     : ASUS
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Halaman Awal Customer</title>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="CSS/halpertama.css">

    </head>
    <body>
        <header class="header">
            <a href="halamanPertama.jsp"><img src="CSS/ilogo.png" width="200" height="80" alt="" id="ilogo"></a>
            <nav class="navbar">
                <a href="customerregister.jsp" id="daftar">Daftar</a>
                <a href="customerlogin.jsp" id="login">login</a>
            </nav>
        </header>

        <section class="home" id="home">

            <div class="content">
                <h3>Sayur & Buah segar untukmu</h3>
                <p>dapatkan sayur dan buah hanya di <span>coyne</span>, beli sekarang anda dijamin mendapat kepuasan</p>
                <a href="customerlogin.jsp" class="btn"  onClick="alert('Login terlebih dahulu untuk membeli produk!')">shop now</a>
            </div>

        </section>


        <section class="categories" id="categories">

            <div class="box-container">

                <%
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coyne", "root", "");
                    Statement st = cn.createStatement();
                    ResultSet rs = st.executeQuery("select * from produk");
                    while (rs.next()) {
                %>
                <div class="box" data-tilt>
                    <img src="gambar/<%= rs.getString(8)%>" width=178 height=178/>
                    <h1><% out.print(rs.getString(2)); %></h1>
                    <h3>Rp.<% out.print(rs.getString(7)); %></h3>
                    <a href="customerlogin.jsp">
                    <button  id="beli" type="submit" class="btn btn-success w-25" name="submit" value="BELI" onClick="alert('Login terlebih dahulu untuk membeli produk!')">BELI</button>
                    </a>
                </div>
                
                <% }%>
                


            </div>

        </section>

        <!-- bagian ffluter -->
        <div class="container">
            <section class="footer">

                <div class="box-container">

                    <div class="box">
                        <h3> Coyne <i class="fas fa-shopping-basket"></i> </h3>
                        <p>Melengkapi kebutuhan sayur dan buah yang segar dan higenis</p>

                    </div>

                    <div class="box">
                        <h3>contact info</h3>
                        <h4>+123-123-492 </h4>
                        <h4>+62-111-2222 </h4>
                        <h4>coyne@gmail.com </h4>
                        <h4>Maguwoharjo, Yogyakarta </h4>
                    </div>
                </div>
            </section>
        </div>
        <script type="text/javascript" src="AccountJS/vanilla-tilt.min.js"></script>
    </body>
</html>



