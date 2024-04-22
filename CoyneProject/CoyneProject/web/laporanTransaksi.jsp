<%-- 
    Document   : laporanTransaksi
    Created on : Nov 30, 2021, 2:34:05 PM
    Author     : Hieronymus Kurniawan
--%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="en">
    <head>
        <!-- Required meta tags -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
        <link rel="stylesheet" href="fontawesome-free/css/all.min.css">
        <link rel="stylesheet" href="CSS/halamaadmin.css">
        <link       rel="stylesheet"
                    href="https://use.fontawesome.com/releases/v5.13.0/css/all.css"
                    integrity="sha384-Bfad6CLCknfcloXFOyFnlgtENryhrpZCe29RTifKEixXQZ38WheV+i/6YWSzkz3V"
                    crossorigin="anonymous"/>

        <title>Admin | Laporan Transaksi</title>

    </head>
    <body>
        <!-- ====================== Navbar ========================= -->
        <nav class="navbar navbar-expand-lg  fixed-top">
            <img src="CSS/ilogo.png" alt="" id="logo" >
            <a class="navbar-brand" href="halamanutamaadmin.jsp" id="dasbor">DASHBOARD</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
        </nav>
        <!-- ==================================== END NAVBAR ====================================== -->
        <!-- ============================= Main Page side by side ================================= -->

        <div class="row no-gutters mt-5">
            <!-- side bar -->
            <div class="col-md-2 bg-dark mt-2 pr-3 pt-4" id="bungkus">
                <ul class="nav flex-column ml-3 mb-5">
                    <li class="nav-item">
                        <a class="nav-link active text-white" href="halamanutamaadmin.jsp"><i class="fas fa-eye mr-2"></i>Lihat Produk</a> <hr class="bg-secondary">
                    </li>
                    <li class="nav-item">
                        <a class="nav-link active text-white" href="tambahProduk.jsp"><i class="fas fa-plus-circle mr-2"></i>Tambah Produk</a> <hr class="bg-secondary">
                    </li>
                    <li class="nav-item">
                        <a class="nav-link text-white" href="laporanTransaksi.jsp"><i class="fas fa-eye mr-2"></i>Laporan Transaksi</a> <hr class="bg-secondary">
                    </li>
                    <li class="nav-item">
                        <a class="nav-link text-white" href="adminlogin.jsp"><i class="fas fa-sign-out-alt mr-2"></i>Logout</a> 
                    </li>
                    <li class="nav-item">
                        <br><br><br><br><br>  
                        <br><br><br><br>
                    </li>
                </ul>
            </div>
            <!-- end sidebar -->
            <!-- main page -->
            <div class="col-md-10 p-5 pt-2">
                <h4></i> TRANSAKSI</h4><br><br><br>


                <table border="1">
                    <thead>
                        <tr class="head">
                            <th>No</th>
                            <th>Id Pesanan</th>
                            <th>Nama Pembeli</th>
                            <th>No.Hp</th>
                            <th>Alamat Pengiriman</th>
                            <th>Via Pembayaran</th>
                            <th>Tanggal Pembelian</th>
                            <th>Nama Produk</th>
                            <th>Jumlah Dibeli</th>
                            <th>Total Harga</th>
                            <th>Bukti Transfer</th>
                        </tr>
                    </thead>
                    <tbody class="bodi">
                        <%
                            Class.forName("com.mysql.jdbc.Driver");
                            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coyne", "root", "");
                            Statement st = cn.createStatement();
                            ResultSet rs = st.executeQuery("select * from transaksi");
                            int nomor = 1;
                            while (rs.next()) {
                        %>
                        <tr>
                            <td><% out.print(nomor++); %></td>
                            <td><% out.print(rs.getString(1)); %></td>
                            <td><% out.print(rs.getString(9)); %></td>
                            <td><% out.print(rs.getString(2)); %></td>
                            <td><% out.print(rs.getString(3)); %></td>
                            <td><% out.print(rs.getString(4)); %></td>
                            <td><% out.print(rs.getString(6)); %></td>
                            <td><% out.print(rs.getString(7)); %></td>
                            <td><% out.print(rs.getString(8)); %></td>
                            <td>Rp.<% out.print(rs.getString(5)); %></td>
                            <td><img src="buktiTransfer/<%= rs.getString(10)%>" width=150px height=100px align="middle"/></td>
                        </tr>
                        <% }%>
                    </tbody>
                </table>
                <br>
            </div>
            <!-- end main page -->
        </div>


        <!-- =========================== End Main Page side by side ================================= -->

        <!-- Optional JavaScript -->
        <!-- jQuery first, then Popper.js, then Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    </body>
</html>
