<%-- 
    Document   : transaksi
    Created on : Dec 15, 2021, 2:42:32 PM
    Author     : asus
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bukti Transaksi</title>
        <link rel="stylesheet" href="https://unpkg.com/swiper@7/swiper-bundle.min.css" />
        <link rel="stylesheet" href="CSS/halmanutamacustomer.css">
        <!-- font awesome cdn link  -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
        <link rel="stylesheet" href="CSS/halpertama.css">
    </head>
    <style>
        body{
            font-family: sans-serif;
        }
        .bungkus{
            background-color: #fff;
            margin-top: 12rem;
            margin-left: 300px;
            margin-right: 300px;
            padding-bottom: 50px;
        }
        .keluar a{
            color: green;
        }
        h1{
            text-align: center;
            margin-top: -130px;
            margin-bottom: 100px;
            font-size: 20px;
            color: #4d4d4d;
        }
        table{
            margin: 10px;
        }
        .label{
            font-size: 12px;
        }
        .bungkus2{
            background-color: #fff;
            margin-left: 150px;
            margin-right: 150px;
            padding-bottom: 10px;
            padding-top: 10px;
            box-shadow: rgba(0, 0, 0, 0.4) 0px 2px 4px, rgba(0, 0, 0, 0.3) 0px 7px 13px -3px, rgba(0, 0, 0, 0.2) 0px -3px 0px inset;
            border-radius: 10px;
        }
        .garis{
            position: absolute;
            width: 700px;
            height: 0px;
            left: 150px;
            top: 918px;
            border: 3px dashed #e6e6e6;
            transform: rotate(0.23deg);
            margin-top: -700px;
            margin-left: 250px;
        }

    </style>
    <body>
        <!--header   -->
        <!-- header section starts  -->
        <div class="bungkus">
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
            <%
                if (session.getAttribute("login") == null || session.getAttribute("login") == "") {
                    response.sendRedirect("customerlogin.jsp");
                }
            %> 
            <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
            <section class="categories" id="categories">
                <%
                    String namaPembeli = request.getParameter("namaPembeli");
                    String namaProduk1 = request.getParameter("namaProduk1");
                    String noHP = request.getParameter("noHP");
                    String alamat = request.getParameter("alamat");
                    String pilihPembayaran = request.getParameter("pilih_pembayaran");
                    String totalHarga = request.getParameter("totalHarga");
                    String qty = request.getParameter("qty");
                    String buktiTransfer = request.getParameter("buktiTransfer");
                    String rek = request.getParameter("rek");

                    Class.forName("com.mysql.jdbc.Driver");
                    Statement st = cn.createStatement();
                    st.executeUpdate("insert into transaksi (noHP, alamat, pilihPembayaran, totalHarga, tanggalPembelian, namaProduk, qty, namaPembeli, buktiTransfer) "
                            + "values ('" + noHP + "','" + alamat + "','" + pilihPembayaran + "','" + totalHarga + "',CURDATE(),'" + namaProduk1 + "','" + qty + "','" + namaPembeli + "','" + buktiTransfer + "')");
                %>  
                <h1>Pembayaran Berhasil</h1>
                <div class="garis">

                </div>
                <div class="bungkus2">
                    <table>
                        <tr>
                            <td class="label">Transaksi Atas Nama </td>
                            <td>:</td>
                            <td><% out.print(namaPembeli);%></td>
                        </tr>
                        <tr>
                            <td class="label">No Hp</td>
                            <td>:</td>
                            <td><%out.print(noHP);%></td>
                        </tr>
                        <tr>
                            <td class="label">Alamat</td>
                            <td>:</td>
                            <td><%out.print(alamat);%></td>
                        </tr>
                        <tr>
                            <td class="label">Via Pembayaran</td>
                            <td>:</td>
                            <td><%out.print(pilihPembayaran);%></td>
                        </tr>
                        <tr>
                            <td class="label">No Rek</td>
                            <td>:</td>
                            <td><%out.print(rek);%></td>
                        </tr>
                        <tr>
                            <td class="label">Nama Produk</td>
                            <td>:</td>
                            <td><%out.print(namaProduk1);%></td>
                        </tr>
                        <tr>
                            <td class="label">Jumlah yang dibeli</td>
                            <td>:</td>
                            <td><%out.print(qty);%></td>
                        </tr>
                        <tr>
                            <td class="label">Total Harga</td>
                            <td>:</td>
                            <td><%out.print(totalHarga);%></td>
                        </tr>
                        <tr>
                            <td class="label">Bukti Transfer</td>
                            <td>:</td>
                            <td><img src="buktiTransfer/<%out.print(buktiTransfer);%>" width=300px height=500px align="middle"/></td>
                        </tr>
                    </table>
                </div>   

                <%
                    String idKeranjang = request.getParameter("idKeranjang");
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement st1 = cn.createStatement();
                    st1.executeUpdate("delete from keranjang where idKeranjang ='" + idKeranjang + "'");
                %>
                <%
                    String idProduk = request.getParameter("idProduk");
                    Class.forName("com.mysql.jdbc.Driver");
                    Statement st2 = cn.createStatement();
                    ResultSet rs2 = st2.executeQuery("SELECT * FROM `produk` WHERE `idProduk` = '" + idProduk + "'");
                    while (rs2.next()) {
                        int stokBaru = Integer.parseInt(rs2.getString(5)) - Integer.parseInt(qty);

                %> 
                <%                Statement st3 = cn.createStatement();
                    st3.executeUpdate("UPDATE `produk` SET `stokProduk`= '" + stokBaru + "' WHERE `idProduk` = '" + idProduk + "'");
                %>        
                <% }%>
            </section>
        </div>
        <script type="text/javascript" src="AccountJS/vanilla-tilt.min.js"></script>                
    </body>
</html>

