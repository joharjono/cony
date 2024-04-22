<%-- 
    Document   : keranjangProduk
    Created on : Dec 9, 2021, 6:05:26 PM
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
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://unpkg.com/swiper@7/swiper-bundle.min.css" />
        <link rel="stylesheet" href="CSS/halmanutamacustomer.css">
        <!-- font awesome cdn link  -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
        <link rel="stylesheet" href="CSS/halpertama.css">
        
        <style>
            .bungkus{
                background-color: #ffffff;
                margin-left: 100px;
                margin-right: 100px;
                border-radius: 5px;
                padding-bottom: 200px;
                padding-top: 50px;
                box-shadow: 4px 3px 2px #d9d9d9;
            }
            table{
                text-align: center;
                margin-left: 100px;
                background-color:  #f2f2f2;
                padding-right: 350px;
                border-radius: 5px;
                color:  #4d4d4d;


            }
            .head
            {

                border-bottom-color: #000000;
                height: 30px;
                padding-left: 100px;
                padding-right: 100px;
            } 
            .baris2{
                border-bottom:#009933 5px solid;
            }
            #hapus, #chakout{
                border: #ffffff 2px solid;
                border-radius: 5px;
                font-size: 15px;
                color: #f2f2f2;
                padding-left: 5px;
                padding-right: 5px;
                padding-bottom: 5px;
                padding-top: 5px;

            }
            #hapus:hover, #chakout:hover{
                opacity: 0.5;
            }
            #hapus{
                background-color: red;
            }
            #chakout{
                background-color: #ff9900;
            }    
            .judul{
                margin-top: -50px;
                text-align: center;
                font-size: 20px;
                font-family: serif;
                background-color: orange;
                border-bottom: orange 2px solid;
                border-top: orange 2px solid;
                color: #ffffff;
                padding-top: 10px;
                border-radius: 5px;


            }
            #inputQ{
                border: #e6e6e6 2px solid;
                border-radius: 5px;
            }

        </style>
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
                <form action="" class="search-form">

                    <input type="search" id="search-box" placeholder="search here...">
                    <label for="search-box" class="fas fa-search" id="btncari"></label>  

                </form>

            </div>
            <div class="icons">
                <div class="fas fa-bars" id="menu-btn"></div>

                <a href="keranjangProduk.jsp"><div class="fas fa-shopping-cart" id="cart-btn"></div></a>

            </div>
            <h3>
                <a href="customerlogout.jsp" id="logout"><i class="fas fa-sign-out-alt">Logout</i> </a>
            </h3>

        </header>


        <%
            if (session.getAttribute("login") == null || session.getAttribute("login") == "") {
                response.sendRedirect("customerlogin.jsp");
            }
        %> 
        <div class="col-md-10 p-5 pt-2">
            <h3><i class="fas fa-plus-circle mr-2"></i>KERANJANG</h3> <hr class="bg-secondary">
            <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
            <div class="bungkus">
                <div class="judul">
                    <i class="fas fa-cart-arrow-down"></i>
                    <h3>Cart</h3>
                </div>

                <table >
                    <thead>
                        <tr class="head">
                            <th>Gambar Produk</th>
                            <th>Id Produk</th>
                            <th>Nama Produk</th>
                            <th>Berat Produk</th>
                            <th>Stok</th>
                            <th>Harga (Satuan)</th>
                            <th>Qty</th>
                            <th>Total Harga</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            String username = (String) session.getAttribute("login");
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coyne", "root", "");
                            Statement st = cn.createStatement();
                            ResultSet rs = st.executeQuery("select * from keranjang where usernameCustomer = '" + username + "'");

                            while (rs.next()) {

                        %>
                        <tr class="baris2">
                            <td><img src="gambar/<%= rs.getString(6)%>" width=150px height=100px align="middle"/></td>
                            <td><% out.print(rs.getString(7)); %></td>
                            <td><% out.print(rs.getString(1)); %></td>
                            <td><% out.print(rs.getString(3));%></td>
                            <td><% out.print(rs.getString(4));%></td>
                            <td><% out.print(rs.getString(5));%></td>
                            <td><input  id="inputQ" type="text" name="qty" class="teks" value="<% out.print(rs.getString(9));%>"></td>
                            <td><% out.print(rs.getString(10));%></td>
                            <td><a  id="hapus" href="hapusKeranjangProduk.jsp?idKeranjang=<% out.print(rs.getString(11)); %>">Hapus</a></td>
                            <td><a  id="chakout" href="checkoutKeranjangProduk.jsp?idKeranjang=<% out.print(rs.getString(11)); %>">Checkout</a></td>
                        </tr>
                        <% }%>

                    <br>
                    </tbody>
                </table>
            </div>

        </div>
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
