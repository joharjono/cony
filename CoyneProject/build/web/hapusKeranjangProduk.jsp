<%-- 
    Document   : hapusKeranjangProduk
    Created on : Dec 15, 2021, 9:26:24 PM
    Author     : ASUS
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
        <title>Hapus Produk dari Keranjang</title>

        <style>
            .sukses{
                position: absolute;
                width: 262px;
                height: 269px;
                left: 589px;
                top: 377px;
                border-radius: 50%;
                background: rgba(92, 255, 35, 0.54);
                margin-top: -10rem;


            }
            .notif{
                margin-top: 28rem;
                margin-left: 32rem;
                display: inline-block;
                color: #4a4a4a;
                font-style: italic;
            }
            .kembali a{
                text-decoration: none;
                color: blue;
                font-family: sans-serif;

            }
            .chklis{
                margin-top: 90px;
                text-align: center;
                font-size: 100px;
                color: #fff;
            }

        </style>

    </head>
    <body>
        <div class="kembali">
            <p>Kelik disini untuk <a href = "keranjangProduk.jsp">kembali!</a>
        </div>
        <% String id = request.getParameter("idKeranjang");%>

        <%

            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coyne", "root", "");
            Statement st = cn.createStatement();
            st.executeUpdate("delete from keranjang where idKeranjang='" + id + "'");
        %>




        <div class="sukses">

            <div class="chklis">
                <i class="fas fa-check"></i>
            </div>

        </div>
        <div class="notif">
            <h2>Produk berhasil dihapus dari keranjang</h2>
        </div>
    </body>
</html>
