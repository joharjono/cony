<%-- 
    Document   : halamanSearch
    Created on : Dec 15, 2021, 10:56:08 PM
    Author     : Hieronymus Kurniawan
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
        <title>Halaman Search</title>
        <link rel="stylesheet" href="https://unpkg.com/swiper@7/swiper-bundle.min.css" />
        <link rel="stylesheet" href="CSS/halmanutamacustomer.css">
        <!-- font awesome cdn link  -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
        <link rel="stylesheet" href="CSS/halpertama.css">
    </head>
    <body>

        <!--header   -->
        <!-- header section starts  -->

        <header class="header">

            <a href="halamanutamacustomer.jsp"><img src="CSS/ilogo.png" alt="" id="ilogo"></a>
            <nav class="navbar">
                <a href="halamanKategoriSayur.jsp">Sayur</a>
                <a href="halamanKategoriBuah.jsp">Buah</a>

            </nav>
            <div>
                <%
                        String namaProduk = request.getParameter("namaProduk");                       
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coyne", "root", "");
                    %>
                <form action="halamanSearch.jsp?namaProduk=<%=namaProduk%>" class="search-form">                 
                    <input type="search" name="namaProduk" id="search-box" placeholder="search here...">
                    <label for="search-box" class="fas fa-search" id="btncari"></label>  

                </form>
            </div>
            <div class="icons">
                <div class="fas fa-bars" id="menu-btn"></div>

                <a href="keranjangProduk.jsp"><div class="fas fa-shopping-cart" id="cart-btn"></div></a>

            </div>
            <h3>
                <a href="customerlogout.jsp" id="logout" onClick="alert('Anda akan keluar dari halaman ini!')"><i class="fas fa-sign-out-alt"></i>Logout</a>
            </h3>

        </header>

        <!--konten-->
        <!--<center class="bener">
            <div id="bener">
                <h2 id="ucapanselamat">
        <%-- <%
            if (session.getAttribute("login") == null || session.getAttribute("login") == "") {
                response.sendRedirect("customerlogin.jsp");
            }
        %> --%>

        Welcome, <%-- <%=session.getAttribute("login")%> --%>

    </h2>
    <h4 id="deskripsibener">silakan pilih sayur dan buah sesuai keinginan anda</h4>
</div>
</center>-->

        <section class="home" id="home">
            <h1 id="deskripsibener">
                <%
                    if (session.getAttribute("login") == null || session.getAttribute("login") == "") {
                        response.sendRedirect("customerlogin.jsp");
                    }
                %> 
                <div class="content">

                    Haloo, <%=session.getAttribute("login")%>                  
                    <h4 id="deskripsibener">Anda sedang melihat barang yang anda cari</h4>
                </div>
            </h1>
        </section>
        <section class="categories" id="categories">

            <div class="box-container">

                <%
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement st = cn.createStatement();
                    ResultSet rs = st.executeQuery("select * from produk where namaProduk = '" + namaProduk + "'");
                    while (rs.next()) {
                %>
                <div class="box" data-tilt>
                    <img src="gambar/<%= rs.getString(8)%>" width=178 height=178/>
                    <h1><% out.print(rs.getString(2)); %></h1>
                    <h3>Rp.<% out.print(rs.getString(7)); %></h3>
                    <a href="inputKeranjang.jsp?idProduk=<% out.print(rs.getString(1)); %>">
                        <button type="submit" class="btn btn-success w-25" name="submit" value="BELI">BELI</button>
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
