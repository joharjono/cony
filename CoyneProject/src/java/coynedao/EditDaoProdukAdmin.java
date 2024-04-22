/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coynedao;

import coynebean.EditProdukAdmin;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Hieronymus Kurniawan
 */
public class EditDaoProdukAdmin {
    public String authorizeEditProduk(EditProdukAdmin editProdukBean) {
        int idProduk = editProdukBean.getIdProduk();
        String namaProduk = editProdukBean.getNamaProduk();
        String kategoriProduk = editProdukBean.getKategoriProduk();
        int beratProduk = editProdukBean.getBeratProduk();
        int stokProduk = editProdukBean.getStokProduk();
        String deskripsiProduk = editProdukBean.getDeskripsiProduk();
        int hargaProduk = editProdukBean.getHargaProduk();
        String gambarProduk = editProdukBean.getGambarProduk();

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
            pstmt = con.prepareStatement("update produk set namaProduk = ?, kategoriProduk = ?, beratProduk = ?"
                    + ", stokProduk = ?, deskripsiProduk = ?, hargaProduk = ?, gambarProduk = ? where idProduk = ?");
                     
            pstmt.setString(1, namaProduk);
            pstmt.setString(2, kategoriProduk);
            pstmt.setInt(3, beratProduk);
            pstmt.setInt(4, stokProduk);
            pstmt.setString(5, deskripsiProduk);
            pstmt.setInt(6, hargaProduk);
            pstmt.setString(7, gambarProduk);
            pstmt.setInt(8, idProduk);
            pstmt.executeUpdate(); 

            pstmt.close();

            con.close();
            return "SUCCESS EDIT DATA"; //
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "FAIL EDIT DATA";
    }
}
