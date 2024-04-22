<%-- 
    Document   : checkoutKeranjangProduk
    Created on : Dec 15, 2021, 11:37:41 AM
    Author     : Hieronymus Kurniawan
--%>

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
        <title>Checkout Keranjang</title>
        <link rel="stylesheet" href="https://unpkg.com/swiper@7/swiper-bundle.min.css" />
        <link rel="stylesheet" href="CSS/halmanutamacustomer.css">
        <!-- font awesome cdn link  -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
        <link rel="stylesheet" href="CSS/halpertama.css">
        <style>
/*            body{
                padding: 5% 45%;
                box-shadow:  green 0px 0px 10px 6px;
            }*/
            .bungkus{
                margin-top: 10rem;
                margin-left: 30px;
                background: #fff;
                padding-bottom: 100px;
                padding-top: 40px;
                margin-right: 40px;
            }
            .buat{
                width: 100%;
                background-color:#00cc00;
                color: white;
                padding: 10px 5px;
                border-radius: 10px;
                letter-spacing: 5px;
            }
            .klik{
                width: 74%;
                background-color: #00cc00;
                border-radius: 10px;
                color: white;
                
            }
            h1{
                width: 100%;
                background-color: white;
                text-align: center;
                padding-bottom: 10px;
                color: #009900;
                
            }
            .label,tr{
                color: #262626;
                padding-left: 0px;
                padding-right: 0px;
            }
            table{
                margin-left: 200px;
                padding-top: 100px;
                font-size: 15px;
                
            }
            table input{
                border: #e6e6e6 2px solid;
                padding-right: 80px;
            }
             #via{
                border-radius: 1px;
/*                padding-left: 10px;
                padding-right: 1px;*/
            }
            #via:hover{
                pointer-events:auto;
            }
            #bukti{
                border: none;
            }
        </style>

    </head>
    <body>
        <script>
            function rekening() {
                var seleksi = document.data.pilihan.value;
                if (seleksi == "BRI") {
                    document.data.pilih_pembayaran.value = "BRI";
                    document.data.rek.value = "09873291738";
                }
                if (seleksi == "BNI") {
                    document.data.pilih_pembayaran.value = "BNI";
                    document.data.rek.value = "0563322211";
                }
                if (seleksi == "BCA") {
                    document.data.pilih_pembayaran.value = "BCA";
                    document.data.rek.value = "321312421312";
                }
            }
        </script>
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
                <a href="customerlogout.jsp">Logout</a>
            </h3>

        </header>    
        <br><br>    
        <div class="bungkus">  
            <h1>CHECKOUT</h1>
            <%
                String idKeranjang = request.getParameter("idKeranjang");
                Class.forName("com.mysql.jdbc.Driver");
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("select * from keranjang where idKeranjang ='" + idKeranjang + "'");
                while (rs.next()) {
            %>
            <form name="data" method="POST" action="transaksi.jsp?idProduk=<%= rs.getString(7)%>">
                <table align="center">
                    <input type="hidden" name="idKeranjang" value="<%= rs.getString(11)%>">
                    <tr>
                        <td class="label">Nama Produk</td>
                        <td></td>
                        <td><input type="hidden" name="namaProduk1" value="<%= rs.getString(1)%>"><% out.print(rs.getString(1));%></td>   
                    </tr>
                    <tr>
                        <td class="label">Jumlah Dibeli</td>
                        <td></td>
                        <td><input type="hidden" name="qty" value="<%= rs.getString(9)%>"><% out.print(rs.getString(9));%></td>   
                    </tr>
                    <tr>
                        <td class="label">Nama Lengkap</td>
                        <td></td>
                        <td><input type="text" name="namaPembeli" placeholder="isi nama"></td>
                    </tr>
                    <tr>
                        <td class="label">No.Hp</td>
                        <td></td>
                        <td><input type="text" name="noHP" placeholder="isi no hp "></td>
                    </tr>
                    <tr>
                        <td class="label">Alamat Pengiriman</td>
                        <td></td>
                        <td><input type="text" name="alamat" placeholder="isi alamat" ></td>
                    </tr>
                    <tr>
                        <td class="label"><label>Pembayaran</label></td>
                        <td></td>
                        <td>
                            <select name="pilihan">
                                <option>Pilih Pembayaran Via</option>
                                <option>BRI</option>
                                <option>BNI</option>
                                <option>BCA</option>
                            </select>
                            <input id="via" type="button" value="Via" onclick="rekening()" class="klik">
                        </td>
                    </tr>
                    <tr>
                        <td class="label">Via Pembayaran</td>
                        <td></td>
                        <td><input type="text" name="pilih_pembayaran"></td>
                    </tr>
                    <tr>
                        <td class="label">No Rekening</td>
                        <td></td>
                        <td><input type="text" name="rek"</td>
                    </tr>                 
                    <tr>
                        <td class="label">Total Harga</td>
                        <td></td>
                        <td><input type="text" name="totalHarga" value="<%= rs.getString(10)%>"></td>
                    </tr>
                    <tr >
                        <th class="label">Bukti Transfer</th>
                        <td></td>
                        <td><input id="bukti" type="file" name="buktiTransfer" class="teks"></td>
                    </tr>
                    <br>
                    <tr>
                        <td>==================================</td>
                    </tr>
                    <tr>
                        <td><input type="submit" name="submit" value="Beli Produk" class="buat"></td>
                    </tr>
                </table>  
                <% }%>

            </form>
        </div>

    </body>
</html>
