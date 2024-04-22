package coynecontroller;

import coynebean.EditProdukAdmin;
import coynedao.EditDaoProdukAdmin;
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
public class ControllerEditProduk extends HttpServlet {

//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException, ClassNotFoundException, SQLException {
//        
//        String namaProduk = request.getParameter("namaProduk");
//        String kategoriProduk = request.getParameter("kategori");
//        int beratProduk = Integer.parseInt(request.getParameter("beratProduk"));
//        int stokProduk = Integer.parseInt(request.getParameter("stokProduk"));
//        String deskripsiProduk = request.getParameter("deskripsi");
//        int hargaProduk = Integer.parseInt(request.getParameter("hargaProduk"));
//        String gambarProduk = request.getParameter("gambarProduk");
//        
//        Connection conn = null;
//        Statement st = null;
//       
//        Koneksi dbConn = new Koneksi();
//        conn = dbConn.getConnection();      
//        
//         String sql = "insert into produk (namaProduk, kategoriProduk, beratProduk, stokProduk, deskripsiProduk, hargaProduk, gambarProduk) "
//                + "values ('" + namaProduk + "','" + kategoriProduk + "'" + ",'" + beratProduk + "','" + stokProduk + "','"
//                + deskripsiProduk + "','" + hargaProduk + "','" + gambarProduk + "')";
//         
//        try {
//            st = conn.createStatement();
//            st.executeUpdate(sql);
//        } catch (SQLException ex) {
//            Logger.getLogger(ControllerTambahProduk.class.getName()).log(Level.SEVERE, null, ex);
//        } finally{
//            try {
//                st.close();
//                conn.close();
//            } catch (SQLException ex) {
//                Logger.getLogger(ControllerTambahProduk.class.getName()).log(Level.SEVERE, null, ex);
//            }
//        } 
//
//        response.setContentType("text/html;charset=UTF-8");
//        try (PrintWriter out = response.getWriter()) {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Data Berhasil Di Tambah</title>");
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Data Berhasil Di Tambah</h1>");
//            out.println("<a href='./tambahProduk.jsp'>Kembali</a>");
//            out.println("</body>");
//            out.println("</html>");
//        }
//    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        if (request.getParameter("submit") != null) {
            int idProduk = Integer.parseInt(request.getParameter("idProduk"));
            String namaProduk = request.getParameter("namaProduk");
            String kategoriProduk = request.getParameter("kategori");
            int beratProduk = Integer.parseInt(request.getParameter("beratProduk"));
            int stokProduk = Integer.parseInt(request.getParameter("stokProduk"));
            String deskripsiProduk = request.getParameter("deskripsi");
            int hargaProduk = Integer.parseInt(request.getParameter("hargaProduk"));
            String gambarProduk = request.getParameter("gambarProduk");

            EditProdukAdmin editProdukBean = new EditProdukAdmin();
            
            editProdukBean.setIdProduk(idProduk);
            editProdukBean.setNamaProduk(namaProduk);
            editProdukBean.setKategoriProduk(kategoriProduk);
            editProdukBean.setBeratProduk(beratProduk);
            editProdukBean.setStokProduk(stokProduk);
            editProdukBean.setDeskripsiProduk(deskripsiProduk);
            editProdukBean.setHargaProduk(hargaProduk);
            editProdukBean.setGambarProduk(gambarProduk);

            EditDaoProdukAdmin editProdukdao = new EditDaoProdukAdmin();

            String editProdukValidate = editProdukdao.authorizeEditProduk(editProdukBean);

            if (editProdukValidate.equals("SUCCESS EDIT DATA")) {
                request.setAttribute("EditSuccessMsg", editProdukValidate);
                RequestDispatcher rd = request.getRequestDispatcher("halamanutamaadmin.jsp");
                rd.forward(request, response);
            } else {
                request.setAttribute("EditErrorMsg", editProdukValidate);
                RequestDispatcher rd = request.getRequestDispatcher("editProduk.jsp");
                rd.include(request, response);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */

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