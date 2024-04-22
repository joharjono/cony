<%-- 
    Document   : tambahProduk
    Created on : Nov 30, 2021, 1:03:02 PM
    Author     : Hieronymus Kurniawan
--%>

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
        <style>
            th{
                background: transparent;
                color: #1a1a1a;
                font-size: 13px;
                font-family: monospace;
                color: 	 #262626;

            }
            tr, th,td{
                border: none;

            }
            table{
                margin-top: 1rem;
                margin-left:2rem;
            }
            #ggg{
                border: none;
            }
            #tobolr{
                background-color:#ff1a1a;
                border: #ff1a1a;
            }
            #tobols{
                background-color:#1aff1a;
                border: #1aff1a;
            }
            #tobolr:hover{
                opacity: 0.7;
            }
            #tobols:hover{
                opacity: 0.7;
            }
        </style>
        <title>Welcome Admin | Tambah Produk</title>
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
            <div class="col-md-2 bg-dark mt-2 pr-3 pt-4" id="bungkus" >
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
                <h4>TAMBAH PRODUK</h4> <br><br><br><br>
                <div class="tambahP">
                    <form method="post" action="ControllerTambahProduk">
                        <table id="tambahP">
                            <tr id="coba">
                                <th>Nama Produk</th>
                                <td></td>
                                <td><input type="text" name="namaProduk" class="teks"></td>
                            </tr>
                            <tr id="coba"> 
                                <th>Kategori</th>
                                <td></td>
                                <td><input id="radio" type="radio" name="kategori" value="Sayur"/>Sayur</td>                     
                            </tr >   

                            <td></td>
                            <td></td>
                            <td ><input id="radio" type="radio" name="kategori" value="Buah"/>Buah</td> 
                            </tr>
                            <tr>
                                <th>Berat Produk(kg)</th>
                                <td></td>
                                <td><input type="text" name="beratProduk" class="teks"></td>
                            </tr>
                            <tr>
                                <th>Stok</th>
                                <td></td>
                                <td><input type="text" name="stokProduk" class="teks"></td>
                            </tr>
                            <tr>
                                <td><label for="deskripsi">Deskripsi Produk</label></td>
                                <td>:</td>
                                <td><textarea name="deskripsi" rows="5" cols="25"></textarea></td>
                            </tr>
                            <tr>
                                <th>Harga Produk</th>
                                <td></td>
                                <td><input type="text" name="hargaProduk" class="teks"></td>
                            </tr>                     
                            <tr >
                                <th>Gambar</th>
                                <td></td>
                                <td id="ggg"><input type="file" name="gambarProduk" class="teks"></td>
                            </tr>
                            <tr>
                                <td>&nbsp;</td>
                                <td>&nbsp;</td>
                                <td></td>
                            </tr>
                        </table>
                        <div class="row">
                            <div class="col-5 col-md-4"></div>
                            <div class="col-5 col-md-4" >


                            </div>
                        </div>

                        </table>

                </div>

                <div class="tombol">
                    <button type="reset" class="btn btn-danger w-25" value="reset" id="tobolr"><i class="fas fa-trash-restore-alt"></i></button>
                    <button type="submit" class="btn btn-success w-25" name="submit" value="simpan" id="tobols" ><i class="fas fa-save"></i></button>
                </div>
                </form>



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

