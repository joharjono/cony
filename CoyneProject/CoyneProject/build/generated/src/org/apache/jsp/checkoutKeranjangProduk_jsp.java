package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class checkoutKeranjangProduk_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write('\n');
      out.write('\n');
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
      out.write("        <title>Checkout Keranjang</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://unpkg.com/swiper@7/swiper-bundle.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/halmanutamacustomer.css\">\n");
      out.write("        <!-- font awesome cdn link  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/halpertama.css\">\n");
      out.write("        <style>\n");
      out.write("/*            body{\n");
      out.write("                padding: 5% 45%;\n");
      out.write("                box-shadow:  green 0px 0px 10px 6px;\n");
      out.write("            }*/\n");
      out.write("            .bungkus{\n");
      out.write("                margin-top: 10rem;\n");
      out.write("                margin-left: 30px;\n");
      out.write("                background: #fff;\n");
      out.write("                padding-bottom: 200px;\n");
      out.write("            }\n");
      out.write("            .buat{\n");
      out.write("                width: 100%;\n");
      out.write("                background-color: green;\n");
      out.write("                color: white;\n");
      out.write("                padding: 10px 5px;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                letter-spacing: 5px;\n");
      out.write("            }\n");
      out.write("            .klik{\n");
      out.write("                width: 100%;\n");
      out.write("                background-color: green;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                color: white;\n");
      out.write("                text-align: center;\n");
      out.write("            }\n");
      out.write("            h1{\n");
      out.write("                width: 100%;\n");
      out.write("                background-color: white;\n");
      out.write("                \n");
      out.write("                color: green;\n");
      out.write("            }\n");
      out.write("            .label{\n");
      out.write("                color: green;\n");
      out.write("            }\n");
      out.write("            table{\n");
      out.write("                margin-left: 200px;\n");
      out.write("                padding-top: 100px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <script>\n");
      out.write("            function rekening() {\n");
      out.write("                var seleksi = document.data.pilihan.value;\n");
      out.write("                if (seleksi == \"BRI\") {\n");
      out.write("                    document.data.pilih_pembayaran.value = \"BRI\";\n");
      out.write("                    document.data.rek.value = \"09873291738\";\n");
      out.write("                }\n");
      out.write("                if (seleksi == \"BNI\") {\n");
      out.write("                    document.data.pilih_pembayaran.value = \"BNI\";\n");
      out.write("                    document.data.rek.value = \"0563322211\";\n");
      out.write("                }\n");
      out.write("                if (seleksi == \"BCA\") {\n");
      out.write("                    document.data.pilih_pembayaran.value = \"BCA\";\n");
      out.write("                    document.data.rek.value = \"321312421312\";\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <!--header   -->\n");
      out.write("        <!-- header section starts  -->\n");
      out.write("        <header class=\"header\">\n");
      out.write("\n");
      out.write("            <a href=\"halamanutamacustomer.jsp\"><img src=\"CSS/ilogo.png\" alt=\"\" id=\"ilogo\"></a>\n");
      out.write("            <nav class=\"navbar\">\n");
      out.write("                <a href=\"halamanKategoriSayur.jsp\">Sayur</a>\n");
      out.write("                <a href=\"halamanKategoriBuah.jsp\">Buah</a>\n");
      out.write("\n");
      out.write("            </nav>\n");
      out.write("            <div>\n");
      out.write("                ");

                    String namaProduk = request.getParameter("namaProduk");
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coyne", "root", "");
                
      out.write("\n");
      out.write("                <form action=\"halamanSearch.jsp?namaProduk=");
      out.print(namaProduk);
      out.write("\" class=\"search-form\">                 \n");
      out.write("                    <input type=\"search\" name=\"namaProduk\" id=\"search-box\" placeholder=\"search here...\">\n");
      out.write("                    <label for=\"search-box\" class=\"fas fa-search\" id=\"btncari\"></label>  \n");
      out.write("\n");
      out.write("                </form>\n");
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
      out.write("        </header>    \n");
      out.write("        <br><br>    \n");
      out.write("        <div class=\"bungkus\">  \n");
      out.write("            <h1>CHECKOUT</h1>\n");
      out.write("            ");

                String idKeranjang = request.getParameter("idKeranjang");
                Class.forName("com.mysql.jdbc.Driver");
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery("select * from keranjang where idKeranjang ='" + idKeranjang + "'");
                while (rs.next()) {
            
      out.write("\n");
      out.write("            <form name=\"data\" method=\"POST\" action=\"transaksi.jsp?idProduk=");
      out.print( rs.getString(7));
      out.write("\">\n");
      out.write("                <table align=\"center\">\n");
      out.write("                    <input type=\"hidden\" name=\"idKeranjang\" value=\"");
      out.print( rs.getString(11));
      out.write("\">\n");
      out.write("                    <tr>\n");
      out.write("                        <td><b>Nama Produk</b></td>\n");
      out.write("                        <td>:</td>\n");
      out.write("                        <td><input type=\"hidden\" name=\"namaProduk1\" value=\"");
      out.print( rs.getString(1));
      out.write('"');
      out.write('>');
 out.print(rs.getString(1));
      out.write("</td>   \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><b>Jumlah Dibeli</b></td>\n");
      out.write("                        <td>:</td>\n");
      out.write("                        <td><input type=\"hidden\" name=\"qty\" value=\"");
      out.print( rs.getString(9));
      out.write('"');
      out.write('>');
 out.print(rs.getString(9));
      out.write("</td>   \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"label\">Nama Lengkap</td>\n");
      out.write("                        <td>:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"namaPembeli\" placeholder=\"---isi nama anda---\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"label\">No.Hp</td>\n");
      out.write("                        <td>:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"noHP\" placeholder=\"---isi no hp anda---\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"label\">Alamat Pengiriman</td>\n");
      out.write("                        <td>:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"alamat\" placeholder=\"---isi alamat anda---\" align=\"center\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"label\"><label>Pembayaran</label></td>\n");
      out.write("                        <td>:</td>\n");
      out.write("                        <td>\n");
      out.write("                            <select name=\"pilihan\">\n");
      out.write("                                <option>Pilih Pembayaran Via</option>\n");
      out.write("                                <option>BRI</option>\n");
      out.write("                                <option>BNI</option>\n");
      out.write("                                <option>BCA</option>\n");
      out.write("                            </select>\n");
      out.write("                            <input type=\"button\" value=\"Via\" onclick=\"rekening()\" class=\"klik\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"label\">Via Pembayaran</td>\n");
      out.write("                        <td>:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"pilih_pembayaran\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"label\">No Rekening</td>\n");
      out.write("                        <td>:</td>\n");
      out.write("                        <td><input type=\"text\" name=\"rek\"</td>\n");
      out.write("                    </tr>                 \n");
      out.write("                    <tr>\n");
      out.write("                        <td class=\"label\">Total Harga</td>\n");
      out.write("                        <td>:Rp.</td>\n");
      out.write("                        <td><input type=\"text\" name=\"totalHarga\" value=\"");
      out.print( rs.getString(10));
      out.write("\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr >\n");
      out.write("                        <th class=\"label\">Bukti Transfer</th>\n");
      out.write("                        <td>:</td>\n");
      out.write("                        <td><input type=\"file\" name=\"buktiTransfer\" class=\"teks\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <br>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>==================================</td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><input type=\"submit\" name=\"submit\" value=\"Beli Produk\" class=\"buat\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>  \n");
      out.write("                ");
 }
      out.write("\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
