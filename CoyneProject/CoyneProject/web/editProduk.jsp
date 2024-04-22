<%-- 
    Document   : editProduk
    Created on : Dec 3, 2021, 4:27:12 PM
    Author     : Hieronymus Kurniawan
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin | Edit Produk</title>
        <link rel="stylesheet" href="fontawesome-free/css/all.min.css">
        <link rel="stylesheet" href="CSS/halamaadmin.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

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

            }
            tr, th,td{
                border: none;

            }
            table{
                margin-top: 3rem;
                margin-left: 2rem;
                border-radius: 5px;
            }
            .tedit{
                border: none;
            }
            #ggg{
                border: none;
            }
            .tambahP{
                padding-right: 20px;
                margin-right: 250px;
                margin-left: 2rem;
                margin-top: 2rem;
                padding-top: 2px;
                
            }
            #th{
                color: #d9d9d9;
            }
            .tombol #tobolr {
                width: 20px;
                padding-left: -100px;
                margin-left: 27px;
               
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
            .yadit, #th, #td{
                border:#bfbfbf 1px solid;
                text-align: center;
            }

        </style>



    </head>                           

    <div class="bungkus2">
        <table border="1" class="yadit">
            <thead>
                <tr class="head">
                    <th id="th">Id Produk</th>
                    <th id="th">Nama Produk</th>
                    <th id="th">Kategori Produk</th>
                    <th id="th">Berat Produk</th>
                    <th id="th">Stok</th>
                    <th id="th">Deskripsi</th>
                    <th id="th">Harga Produk</th>
                    <th id="th">Gambar Produk</th>
                </tr>
            </thead>
            <tbody>
                <%
                    String idProduk = request.getParameter("idProduk");
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coyne", "root", "");
                    Statement st = cn.createStatement();
                    ResultSet rs = st.executeQuery("select * from produk where idProduk ='" + idProduk + "'");
                    while (rs.next()) {
                %>
                <tr>
                    <td id="td"><% out.print(rs.getString(1)); %></td>
                    <td id="td"><% out.print(rs.getString(2)); %></td>
                    <td id="td"><% out.print(rs.getString(3)); %></td>
                    <td id="td"><% out.print(rs.getString(4));%></td>
                    <td id="td"><% out.print(rs.getString(5));%></td>
                    <td id="td"><% out.print(rs.getString(6));%></td>
                    <td id="td"><% out.print(rs.getString(7));%></td>
                    <td id="td"s><img src="gambar/<%= rs.getString(8)%>" width=150px height=100px align="middle"/></td>
                </tr>
                <% }%>
            </tbody>                   
        </table>
            <div class="tambahP">
        <form method="post" action="ControllerEditProduk">
            <table class="tedit">
                <tr>
                    <td><input type="hidden" name="idProduk" value="<%=idProduk%>" /></td>
                </tr>
                <tr>
                    <th>Nama Produk</th>
                    <td></td>
                    <td><input type="text" name="namaProduk" class="teks"></td>
                </tr>
                <tr id="coba"> 
                    <th>Kategori</th>
                    <td></td>
                    <td><input  id="radio" type="radio" name="kategori" value="Sayur"/>Sayur</td>                     
                </tr>   
                <tr>
                    <td></td><td></td>
                    <td><input  id="radio" type="radio" name="kategori" value="Buah"/>Buah</td> 
                </tr>
                <tr>
                    <th>Berat Produk (kg)</th>
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
                    <td></td>
                    <td><textarea name="deskripsi" rows="5" cols="25"></textarea></td>
                </tr>
                <tr>
                    <th>Harga Produk</th>
                    <td></td>
                    <td><input type="text" name="hargaProduk" class="teks"></td>
                </tr>                     
                <tr>
                    <th>Gambar</th>
                    <td></td>
                    <td><input type="file" name="gambarProduk" class="teks"></td>
                
                 </table>
                </div>
                <div class="tombol">
                <button type="reset" class="btn btn-danger w-25" name="reset" value="Reset" id="tobolr"><i class="fas fa-trash-restore-alt"></i></button>   
                <button type="submit" class="btn btn-success w-25" name="submit" value="Edit" id="tobols"><i class="fas fa-save"></i></button>
            </div> 
        </form>
        
    </div>

</html>
