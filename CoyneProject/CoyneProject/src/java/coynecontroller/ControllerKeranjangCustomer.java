/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coynecontroller;

import coynebean.KeranjangCustomer;
import coynedao.KeranjangDaoCustomer;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Hieronymus Kurniawan
 */
public class ControllerKeranjangCustomer extends HttpServlet {
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        if (request.getParameter("submit") != null) {

            String namaProduk = request.getParameter("namaProduk");
            String kategoriProduk = request.getParameter("kategori");
            int beratProduk = Integer.parseInt(request.getParameter("beratProduk"));
            int stokProduk = Integer.parseInt(request.getParameter("stokProduk"));   
            int hargaProduk = Integer.parseInt(request.getParameter("hargaProduk"));
            String gambarProduk = request.getParameter("gambarProduk");
            int idProduk = Integer.parseInt(request.getParameter("idProduk"));         
            String usernameCustomer = request.getParameter("usernameCustomer");
            int qty = Integer.parseInt(request.getParameter("qty"));

            KeranjangCustomer keranjangCustomer = new KeranjangCustomer();

            keranjangCustomer.setNamaProduk(namaProduk);
            keranjangCustomer.setKategoriProduk(kategoriProduk);
            keranjangCustomer.setBeratProduk(beratProduk);
            keranjangCustomer.setStokProduk(stokProduk);
            keranjangCustomer.setHargaProduk(hargaProduk);
            keranjangCustomer.setGambarProduk(gambarProduk);
            keranjangCustomer.setIdProduk(idProduk);
            keranjangCustomer.setUsernameCustomer(usernameCustomer);
            keranjangCustomer.setQty(qty);
            keranjangCustomer.setTotalHarga(qty, hargaProduk);

            KeranjangDaoCustomer keranjangDaoCustomer = new KeranjangDaoCustomer();

            String keranjangValidate = keranjangDaoCustomer.authorizeKeranjangCustomer(keranjangCustomer);

            if (keranjangValidate.equals("SUCCESS TAMBAH KE KERANJANG")) {
                request.setAttribute("TambahSuccessMsg", keranjangValidate);
                RequestDispatcher rd = request.getRequestDispatcher("keranjangProduk.jsp");
                rd.forward(request, response);
            } else {
                request.setAttribute("TambahErrorMsg", keranjangValidate);
                RequestDispatcher rd = request.getRequestDispatcher("beliProduk.jsp");
                rd.include(request, response);
            }
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
