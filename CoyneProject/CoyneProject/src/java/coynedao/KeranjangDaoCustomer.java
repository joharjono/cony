/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coynedao;

import coynebean.KeranjangCustomer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Hieronymus Kurniawan
 */
public class KeranjangDaoCustomer {
     public String authorizeKeranjangCustomer(KeranjangCustomer keranjangCustomerBean) {
        String namaProduk = keranjangCustomerBean.getNamaProduk();
        String kategoriProduk = keranjangCustomerBean.getKategoriProduk();
        int beratProduk = keranjangCustomerBean.getBeratProduk();
        int stokProduk = keranjangCustomerBean.getStokProduk();
        int hargaProduk = keranjangCustomerBean.getHargaProduk();
        String gambarProduk = keranjangCustomerBean.getGambarProduk();
        int idProduk = keranjangCustomerBean.getIdProduk();
        String usernameCustomer = keranjangCustomerBean.getUsernameCustomer();
        int qty = keranjangCustomerBean.getQty();
        int totalHarga = keranjangCustomerBean.getTotalHarga();

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
            pstmt = con.prepareStatement("insert into keranjang(namaProduk, kategoriProduk, beratProduk, stokProduk"
                    + ", hargaProduk, gambarProduk, idProduk, usernameCustomer, qty, totalHarga) values(?,?,?,?,?,?,?,?,?,?)");
            
            pstmt.setString(1, namaProduk);
            pstmt.setString(2, kategoriProduk);
            pstmt.setInt(3, beratProduk);
            pstmt.setInt(4, stokProduk);
            pstmt.setInt(5, hargaProduk);
            pstmt.setString(6, gambarProduk);
            pstmt.setInt(7, idProduk);
            pstmt.setString(8, usernameCustomer);
            pstmt.setInt(9, qty);
            pstmt.setInt(10, totalHarga);
            pstmt.executeUpdate(); 

            pstmt.close();

            con.close();
            return "SUCCESS TAMBAH KE KERANJANG"; //
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "FAIL TAMBAH KE KERANJANG";
    }
}
