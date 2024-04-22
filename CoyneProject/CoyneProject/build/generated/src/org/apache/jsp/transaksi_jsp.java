package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class transaksi_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <style>\n");
      out.write("        body{\n");
      out.write("            padding: 5% 40%;\n");
      out.write("            box-shadow:  green 0px 0px 10px 6px;\n");
      out.write("        }\n");
      out.write("        .keluar a{\n");
      out.write("            color: green;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("    <body>\n");
      out.write("        <!--header   -->\n");
      out.write("        <!-- header section starts  -->\n");
      out.write("\n");
      out.write("        <header class=\"header\">\n");
      out.write("\n");
      out.write("            <a href=\"halamanutamacustomer.jsp\"><img src=\"CSS/ilogo.png\" alt=\"\" id=\"ilogo\"></a>\n");
      out.write("            <nav class=\"navbar\">\n");
      out.write("                <a href=\"halamanKategoriSayur.jsp\">Sayur</a>\n");
      out.write("                <a href=\"halamanKategoriBuah.jsp\">Buah</a>\n");
      out.write("\n");
      out.write("            </nav>\n");
      out.write("            <div>\n");
      out.write("                <form action=\"\" class=\"search-form\">\n");
      out.write("\n");
      out.write("                    <input type=\"search\" id=\"search-box\" placeholder=\"search here...\">\n");
      out.write("                    <label for=\"search-box\" class=\"fas fa-search\" id=\"btncari\"></label>  \n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <div class=\"icons\">\n");
      out.write("                <div class=\"fas fa-bars\" id=\"menu-btn\"></div>\n");
      out.write("\n");
      out.write("                <a href=\"keranjangProduk.jsp\"><div class=\"fas fa-shopping-cart\" id=\"cart-btn\"></div></a>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <h3>\n");
      out.write("                <a href=\"customerlogout.jsp\">Logout</a>\n");
      out.write("            </h3>\n");
      out.write("\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <!--konten-->\n");
      out.write("        <!--<center class=\"bener\">\n");
      out.write("            <div id=\"bener\">\n");
      out.write("                <h2 id=\"ucapanselamat\">\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("        Welcome, ");
      out.write("\n");
      out.write("\n");
      out.write("    </h2>\n");
      out.write("    <h4 id=\"deskripsibener\">silakan pilih sayur dan buah sesuai keinginan anda</h4>\n");
      out.write("</div>\n");
      out.write("</center>-->\n");
      out.write("        ");

            if (session.getAttribute("login") == null || session.getAttribute("login") == "") {
                response.sendRedirect("customerlogin.jsp");
            }
        
      out.write(" \n");
      out.write("        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>\n");
      out.write("        <section class=\"categories\" id=\"categories\">\n");
      out.write("            ");

                String namaPembeli = request.getParameter("namaPembeli");
                String namaProduk = request.getParameter("namaProduk");
                String noHP = request.getParameter("noHP");
                String alamat = request.getParameter("alamat");
                String pilihPembayaran = request.getParameter("pilih_pembayaran");
                String totalHarga = request.getParameter("totalHarga");
                String qty = request.getParameter("qty");

                Class.forName("com.mysql.jdbc.Driver");
                Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coyne", "root", "");
                Statement st = cn.createStatement();
                st.executeUpdate("insert into transaksi (noHP, alamat, pilihPembayaran, totalHarga, tanggalPembelian, namaProduk, qty, namaPembeli) "
                        + "values ('" + noHP + "','" + alamat + "','" + pilihPembayaran + "','" + totalHarga + "',CURDATE(),'" + namaProduk + "','" + qty + "','" + namaPembeli + "')");
            
      out.write("  \n");
      out.write("            <h1>Bukti Pembayaran</h1>\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Transaksi Atas Nama </td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td>");
 out.print(namaPembeli);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>No Hp</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td>");
out.print(noHP);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Alamat</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td>");
out.print(alamat);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Via Pembayaran</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td>");
out.print(pilihPembayaran);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Nama Produk</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td>");
out.print(namaProduk);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Jumlah yang dibeli</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td>");
out.print(qty);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Total Harga</td>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td>");
out.print(totalHarga);
      out.write("</td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("                \n");
      out.write("               \n");
      out.write("            ");

                int stokBaru = 0;
                String idKeranjang = request.getParameter("idKeranjang");
                Class.forName("com.mysql.jdbc.Driver");
                Statement st1 = cn.createStatement();
                st1.executeUpdate("delete from keranjang where idKeranjang='"+ idKeranjang +"'");
            
      out.write("\n");
      out.write("            ");
  
                String idProduk = request.getParameter("idProduk");
                Class.forName("com.mysql.jdbc.Driver");
                Statement st2 = cn.createStatement();
                ResultSet rs2 = st2.executeQuery("select * from produk where idProduk='"+ idProduk +"'");
                while (rs2.next()) {     
                stokBaru = Integer.parseInt(rs2.getString(5)) - Integer.parseInt(qty);
            
      out.write("    \n");
      out.write("            ");
 }
      out.write("\n");
      out.write("            ");
                              
                Class.forName("com.mysql.jdbc.Driver");
                Statement st3 = cn.createStatement();
                st3.executeUpdate("update produk set stokProduk='"+stokBaru+"' where idProduk='"+ idProduk +"'");
            
      out.write("\n");
      out.write("    </section>\n");
      out.write("    <!-- bagian ffluter -->\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <section class=\"footer\">\n");
      out.write("            <div class=\"box-container\">\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <h3> Coyne <i class=\"fas fa-shopping-basket\"></i> </h3>\n");
      out.write("                    <p>Melengkapi kebutuhan sayur dan buah yang segar dan higenis</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"box\">\n");
      out.write("                    <h3>contact info</h3>\n");
      out.write("                    <h4>+123-123-492 </h4>\n");
      out.write("                    <h4>+62-111-2222 </h4>\n");
      out.write("                    <h4>coyne@gmail.com </h4>\n");
      out.write("                    <h4>Maguwoharjo, Yogyakarta </h4>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("    </div>\n");
      out.write("    <script type=\"text/javascript\" src=\"AccountJS/vanilla-tilt.min.js\"></script>                \n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
