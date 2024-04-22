/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coynedao;

import coynebean.TambahProdukAdmin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Hieronymus Kurniawan
 */
public class TambahDaoProdukAdmin {

    public String authorizeTambahProduk(TambahProdukAdmin tambahProdukBean) {
        String namaProduk = tambahProdukBean.getNamaProduk();
        String kategoriProduk = tambahProdukBean.getKategoriProduk();
        int beratProduk = tambahProdukBean.getBeratProduk();
        int stokProduk = tambahProdukBean.getStokProduk();
        String deskripsiProduk = tambahProdukBean.getDeskripsiProduk();
        int hargaProduk = tambahProdukBean.getHargaProduk();
        String gambarProduk = tambahProdukBean.getGambarProduk();

        String url = "jdbc:mysql://localhost/coyne";
        String uname = "root";
        String pass = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, uname, pass);

            PreparedStatement pstmt = null;

//            pstmt = con.prepareStatement("insert into produk (namaProduk, kategoriProduk, beratProduk, stokProduk, deskripsiProduk, hargaProduk, gambarProduk) "
//                    + "values ('" + namaProduk + "','" + kategoriProduk + "'" + ",'" + beratProduk + "','" + stokProduk + "','"
//                    + deskripsiProduk + "','" + hargaProduk + "','" + gambarProduk + "')");
            pstmt = con.prepareStatement("insert into produk(namaProduk, kategoriProduk, beratProduk, stokProduk, deskripsiProduk, hargaProduk, gambarProduk) values(?,?,?,?,?,?,?)");
            
            pstmt.setString(1, namaProduk);
            pstmt.setString(2, kategoriProduk);
            pstmt.setInt(3, beratProduk);
            pstmt.setInt(4, stokProduk);
            pstmt.setString(5, deskripsiProduk);
            pstmt.setInt(6, hargaProduk);
            pstmt.setString(7, gambarProduk);
            pstmt.executeUpdate(); 

            pstmt.close();

            con.close();
            return "SUCCESS TAMBAH DATA"; //
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "FAIL TAMBAH DATA";
    }
}
