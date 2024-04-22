<%-- 
    Document   : beliProduk
    Created on : Dec 6, 2021, 12:31:16 AM
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
            .cart{
                background-color: #ffffff;
                border-radius: 10px;
                padding-top: 30px;
                padding-left: 50px;
                padding-bottom: 30px;
            }
            table{
                border:	 #f2f2f2 1px solid

            }

            .bungkus{
                margin-left: 30px;
            }
            #formQyt{
                border: #e6e6e6 2px solid;
                border-radius:5px ;
            }
            #img{
                border: #000000 5px solid;
                border-image-outset: initial 

            }
            .btn{
                background-color: #00cc00;
                margin-left: 1050px;
                width:auto;
                height: auto;
                font-size: 15px;;
                color: whitesmoke;
               
            }
            table{
                width: 400px;
                height: 40px;
                border-radius: 10px;
                font-size: 12px;
                color: #4d4d4d;
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
                <a href="customerlogout.jsp">Logout</a>
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

            <div class="bungkus">
                <form method="POST" action="ControllerKeranjangCustomer"> 
                    <div class="cart">
                        <table>
                            <tbody>
                                <%
                                    String idProduk = request.getParameter("idProduk");
                                    Class.forName("com.mysql.jdbc.Driver");
                                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coyne", "root", "");
                                    Statement st = cn.createStatement();
                                    ResultSet rs = st.executeQuery("select * from produk where idProduk ='" + idProduk + "'");
                                    while (rs.next()) {
                                %>
                                <tr id="gambar">


                                    <td rowspan="8" ><img src="gambar/<%= rs.getString(8)%>" width=150px height=100px align="middle"/></td>   
                            <input type="hidden" name="gambarProduk" value="<%= rs.getString(8)%>"/>

                            </tr>

                            <tr>
                                <td><b>Id Produk</b></td>
                                <td>:</td>
                                <td><input type="hidden" name="idProduk" value="<%= rs.getString(1)%>"><% out.print(rs.getString(1));%></td>  

                            </tr>
                            <tr>
                                <td><b>Nama Produk</b></td>
                                <td>:</td>
                                <td><input type="hidden" name="namaProduk" value="<%= rs.getString(2)%>"><% out.print(rs.getString(2));%></td>   
                            </tr>
                            <tr>
                                <td><b>Kategori Produk</b></td> 
                                <td>:</td>
                                <td><input type="hidden" name="kategori" value="<%= rs.getString(3)%>"><% out.print(rs.getString(3));%></td>    
                            </tr>
                            <tr>
                                <td><b>Berat Produk (Kg)</b></td>
                                <td>:</td>
                                <td><input type="hidden" name="beratProduk" value="<%= rs.getString(4)%>"><% out.print(rs.getString(4));%></td>
                            </tr>
                            <tr>
                                <td><b>Stok</b></td>
                                <td>:</td>
                                <td><input type="hidden" name="stokProduk" value="<%= rs.getString(5)%>"><% out.print(rs.getString(5));%></td>
                            </tr>
                            <tr>
                                <td><b>Rp.</b></td>
                                <td>:</td>
                                <td><input type="hidden" name="hargaProduk" value="<%= rs.getString(7)%>"><% out.print(rs.getString(7));%></td>
                            </tr>
                            <tr>
                                <td><b>Deskripsi</b></td>
                                <td>:</td>
                                <td><input type="hidden" name="deskripsi" value="<%= rs.getString(6)%>"><% out.print(rs.getString(6));%></td>
                            </tr>

                            <%
                                String username = (String) session.getAttribute("login");
                                Class.forName("com.mysql.jdbc.Driver");
                                Statement st1 = cn.createStatement();
                                ResultSet rs1 = st1.executeQuery("SELECT * FROM `accountcustomer` WHERE username = '" + username + "'");
                                while (rs1.next()) {
                            %>
                            <input type="hidden" name="usernameCustomer" value="<%= rs1.getString(2)%>"/>
                            <% }%> 
                            </tbody>
                        </table>

                        <br><br>  
                        <input id="formQyt" type="text" name="qty" placeholder="--isi qty---"/><br> 
                    </div>
                    <button type="submit" class="btn btn-success w-25" name="submit" value="Add To Cart"><i class="fas fa-cart-plus" color="white">Add To Cart</i></button>

                    <% }%> 

                </form>

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
