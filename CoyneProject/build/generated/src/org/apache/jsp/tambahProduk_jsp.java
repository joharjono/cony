package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class tambahProduk_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"fontawesome-free/css/all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/halamaadmin.css\">\n");
      out.write("        <link       rel=\"stylesheet\"\n");
      out.write("                    href=\"https://use.fontawesome.com/releases/v5.13.0/css/all.css\"\n");
      out.write("                    integrity=\"sha384-Bfad6CLCknfcloXFOyFnlgtENryhrpZCe29RTifKEixXQZ38WheV+i/6YWSzkz3V\"\n");
      out.write("                    crossorigin=\"anonymous\"/>\n");
      out.write("        <style>\n");
      out.write("            th{\n");
      out.write("                background: transparent;\n");
      out.write("                color: #1a1a1a;\n");
      out.write("                font-size: 13px;\n");
      out.write("                font-family: monospace;\n");
      out.write("                color: \t #262626;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            tr, th,td{\n");
      out.write("                border: none;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            table{\n");
      out.write("                margin-top: 1rem;\n");
      out.write("                margin-left:2rem;\n");
      out.write("            }\n");
      out.write("            #ggg{\n");
      out.write("                border: none;\n");
      out.write("            }\n");
      out.write("            #tobolr{\n");
      out.write("                background-color:#ff1a1a;\n");
      out.write("                border: #ff1a1a;\n");
      out.write("            }\n");
      out.write("            #tobols{\n");
      out.write("                background-color:#1aff1a;\n");
      out.write("                border: #1aff1a;\n");
      out.write("            }\n");
      out.write("            #tobolr:hover{\n");
      out.write("                opacity: 0.7;\n");
      out.write("            }\n");
      out.write("            #tobols:hover{\n");
      out.write("                opacity: 0.7;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <title>Welcome Admin | Tambah Produk</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- ====================== Navbar ========================= -->\n");
      out.write("        <nav class=\"navbar navbar-expand-lg  fixed-top\">\n");
      out.write("            <img src=\"CSS/ilogo.png\" alt=\"\" id=\"logo\" >\n");
      out.write("            <a class=\"navbar-brand\" href=\"halamanutamaadmin.jsp\" id=\"dasbor\">DASHBOARD</a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("        </nav>\n");
      out.write("        <!-- ==================================== END NAVBAR ====================================== -->\n");
      out.write("        <!-- ============================= Main Page side by side ================================= -->\n");
      out.write("\n");
      out.write("        <div class=\"row no-gutters mt-5\">\n");
      out.write("            <!-- side bar -->\n");
      out.write("            <div class=\"col-md-2 bg-dark mt-2 pr-3 pt-4\" id=\"bungkus\" >\n");
      out.write("                <ul class=\"nav flex-column ml-3 mb-5\">\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link active text-white\" href=\"halamanutamaadmin.jsp\"><i class=\"fas fa-eye mr-2\"></i>Lihat Produk</a> <hr class=\"bg-secondary\">\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link active text-white\" href=\"tambahProduk.jsp\"><i class=\"fas fa-plus-circle mr-2\"></i>Tambah Produk</a> <hr class=\"bg-secondary\">\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link text-white\" href=\"laporanTransaksi.jsp\"><i class=\"fas fa-eye mr-2\"></i>Laporan Transaksi</a> <hr class=\"bg-secondary\">\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link text-white\" href=\"adminlogin.jsp\"><i class=\"fas fa-sign-out-alt mr-2\"></i>Logout</a> \n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <br><br><br><br><br>  \n");
      out.write("                        <br><br><br><br>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("            <!-- end sidebar -->\n");
      out.write("            <!-- main page -->\n");
      out.write("            <div class=\"col-md-10 p-5 pt-2\">\n");
      out.write("                <h4>TAMBAH PRODUK</h4> <br><br><br><br>\n");
      out.write("                <div class=\"tambahP\">\n");
      out.write("                    <form method=\"post\" action=\"ControllerTambahProduk\">\n");
      out.write("                        <table id=\"tambahP\">\n");
      out.write("                            <tr id=\"coba\">\n");
      out.write("                                <th>Nama Produk</th>\n");
      out.write("                                <td></td>\n");
      out.write("                                <td><input type=\"text\" name=\"namaProduk\" class=\"teks\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr id=\"coba\"> \n");
      out.write("                                <th>Kategori</th>\n");
      out.write("                                <td></td>\n");
      out.write("                                <td><input id=\"radio\" type=\"radio\" name=\"kategori\" value=\"Sayur\"/>Sayur</td>                     \n");
      out.write("                            </tr >   \n");
      out.write("\n");
      out.write("                            <td></td>\n");
      out.write("                            <td></td>\n");
      out.write("                            <td ><input id=\"radio\" type=\"radio\" name=\"kategori\" value=\"Buah\"/>Buah</td> \n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Berat Produk(kg)</th>\n");
      out.write("                                <td></td>\n");
      out.write("                                <td><input type=\"text\" name=\"beratProduk\" class=\"teks\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Stok</th>\n");
      out.write("                                <td></td>\n");
      out.write("                                <td><input type=\"text\" name=\"stokProduk\" class=\"teks\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td><label for=\"deskripsi\">Deskripsi Produk</label></td>\n");
      out.write("                                <td>:</td>\n");
      out.write("                                <td><textarea name=\"deskripsi\" rows=\"5\" cols=\"25\"></textarea></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>Harga Produk</th>\n");
      out.write("                                <td></td>\n");
      out.write("                                <td><input type=\"text\" name=\"hargaProduk\" class=\"teks\"></td>\n");
      out.write("                            </tr>                     \n");
      out.write("                            <tr >\n");
      out.write("                                <th>Gambar</th>\n");
      out.write("                                <td></td>\n");
      out.write("                                <td id=\"ggg\"><input type=\"file\" name=\"gambarProduk\" class=\"teks\"></td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>&nbsp;</td>\n");
      out.write("                                <td>&nbsp;</td>\n");
      out.write("                                <td></td>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                        <div class=\"row\">\n");
      out.write("                            <div class=\"col-5 col-md-4\"></div>\n");
      out.write("                            <div class=\"col-5 col-md-4\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        </table>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"tombol\">\n");
      out.write("                    <button type=\"reset\" class=\"btn btn-danger w-25\" value=\"reset\" id=\"tobolr\"><i class=\"fas fa-trash-restore-alt\"></i></button>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-success w-25\" name=\"submit\" value=\"simpan\" id=\"tobols\" ><i class=\"fas fa-save\"></i></button>\n");
      out.write("                </div>\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- end main page -->\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- =========================== End Main Page side by side ================================= -->\n");
      out.write("\n");
      out.write("        <!-- Optional JavaScript -->\n");
      out.write("        <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js\" integrity=\"sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js\" integrity=\"sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM\" crossorigin=\"anonymous\"></script>\n");
      out.write("    </body>\n");
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
