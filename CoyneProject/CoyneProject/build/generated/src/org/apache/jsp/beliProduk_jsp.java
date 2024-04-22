package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class beliProduk_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://unpkg.com/swiper@7/swiper-bundle.min.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/halmanutamacustomer.css\">\n");
      out.write("        <!-- font awesome cdn link  -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/halpertama.css\">\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            .cart{\n");
      out.write("                background-color: #ffffff;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                padding-top: 30px;\n");
      out.write("                padding-left: 50px;\n");
      out.write("                padding-bottom: 30px;\n");
      out.write("            }\n");
      out.write("            table{\n");
      out.write("                border:\t #f2f2f2 1px solid\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .bungkus{\n");
      out.write("                margin-left: 30px;\n");
      out.write("            }\n");
      out.write("            #formQyt{\n");
      out.write("                border: #e6e6e6 2px solid;\n");
      out.write("                border-radius:5px ;\n");
      out.write("            }\n");
      out.write("            #img{\n");
      out.write("                border: #000000 5px solid;\n");
      out.write("                border-image-outset: initial \n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .btn{\n");
      out.write("                background-color: #00cc00;\n");
      out.write("                margin-left: 1050px;\n");
      out.write("                width:auto;\n");
      out.write("                height: auto;\n");
      out.write("                font-size: 15px;;\n");
      out.write("                color: whitesmoke;\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("            table{\n");
      out.write("                width: 400px;\n");
      out.write("                height: 40px;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                font-size: 12px;\n");
      out.write("                color: #4d4d4d;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
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
      out.write("               \n");
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
      out.write("\n");
      out.write("            <div class=\"bungkus\">\n");
      out.write("                <form method=\"POST\" action=\"ControllerKeranjangCustomer\"> \n");
      out.write("                    <div class=\"cart\">\n");
      out.write("                        <table>\n");
      out.write("                            <tbody>\n");
      out.write("                                ");

                                    String idProduk = request.getParameter("idProduk");
                                    Class.forName("com.mysql.jdbc.Driver");
                                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coyne", "root", "");
                                    Statement st = cn.createStatement();
                                    ResultSet rs = st.executeQuery("select * from produk where idProduk ='" + idProduk + "'");
                                    while (rs.next()) {
                                
      out.write("\n");
      out.write("                                <tr id=\"gambar\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <td rowspan=\"8\" ><img src=\"gambar/");
      out.print( rs.getString(8));
      out.write("\" width=150px height=100px align=\"middle\"/></td>   \n");
      out.write("                            <input type=\"hidden\" name=\"gambarProduk\" value=\"");
      out.print( rs.getString(8));
      out.write("\"/>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td><b>Id Produk</b></td>\n");
      out.write("                                <td>:</td>\n");
      out.write("                                <td><input type=\"hidden\" name=\"idProduk\" value=\"");
      out.print( rs.getString(1));
      out.write('"');
      out.write('>');
 out.print(rs.getString(1));
      out.write("</td>  \n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td><b>Nama Produk</b></td>\n");
      out.write("                                <td>:</td>\n");
      out.write("                                <td><input type=\"hidden\" name=\"namaProduk\" value=\"");
      out.print( rs.getString(2));
      out.write('"');
      out.write('>');
 out.print(rs.getString(2));
      out.write("</td>   \n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td><b>Kategori Produk</b></td> \n");
      out.write("                                <td>:</td>\n");
      out.write("                                <td><input type=\"hidden\" name=\"kategori\" value=\"");
      out.print( rs.getString(3));
      out.write('"');
      out.write('>');
 out.print(rs.getString(3));
      out.write("</td>    \n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td><b>Berat Produk (Kg)</b></td>\n");
      out.write("                                <td>:</td>\n");
      out.write("                                <td><input type=\"hidden\" name=\"beratProduk\" value=\"");
      out.print( rs.getString(4));
      out.write('"');
      out.write('>');
 out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td><b>Stok</b></td>\n");
      out.write("                                <td>:</td>\n");
      out.write("                                <td><input type=\"hidden\" name=\"stokProduk\" value=\"");
      out.print( rs.getString(5));
      out.write('"');
      out.write('>');
 out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td><b>Rp.</b></td>\n");
      out.write("                                <td>:</td>\n");
      out.write("                                <td><input type=\"hidden\" name=\"hargaProduk\" value=\"");
      out.print( rs.getString(7));
      out.write('"');
      out.write('>');
 out.print(rs.getString(7));
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td><b>Deskripsi</b></td>\n");
      out.write("                                <td>:</td>\n");
      out.write("                                <td><input type=\"hidden\" name=\"deskripsi\" value=\"");
      out.print( rs.getString(6));
      out.write('"');
      out.write('>');
 out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            ");

                                String username = (String) session.getAttribute("login");
                                Class.forName("com.mysql.jdbc.Driver");
                                Statement st1 = cn.createStatement();
                                ResultSet rs1 = st1.executeQuery("SELECT * FROM `accountcustomer` WHERE username = '" + username + "'");
                                while (rs1.next()) {
                            
      out.write("\n");
      out.write("                            <input type=\"hidden\" name=\"usernameCustomer\" value=\"");
      out.print( rs1.getString(2));
      out.write("\"/>\n");
      out.write("                            ");
 }
      out.write(" \n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("\n");
      out.write("                        <br><br>  \n");
      out.write("                        <input id=\"formQyt\" type=\"text\" name=\"qty\" placeholder=\"--isi qty---\"/><br> \n");
      out.write("                    </div>\n");
      out.write("                    <button type=\"submit\" class=\"btn btn-success w-25\" name=\"submit\" value=\"Add To Cart\"><i class=\"fas fa-cart-plus\" color=\"white\">Add To Cart</i></button>\n");
      out.write("\n");
      out.write("                    ");
 }
      out.write(" \n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <!-- bagian ffluter -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <section class=\"footer\">\n");
      out.write("                <div class=\"box-container\">\n");
      out.write("                    <div class=\"box\">\n");
      out.write("                        <h3> Coyne <i class=\"fas fa-shopping-basket\"></i> </h3>\n");
      out.write("                        <p>Melengkapi kebutuhan sayur dan buah yang segar dan higenis</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"box\">\n");
      out.write("                        <h3>contact info</h3>\n");
      out.write("                        <h4>+123-123-492 </h4>\n");
      out.write("                        <h4>+62-111-2222 </h4>\n");
      out.write("                        <h4>coyne@gmail.com </h4>\n");
      out.write("                        <h4>Maguwoharjo, Yogyakarta </h4>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\" src=\"AccountJS/vanilla-tilt.min.js\"></script>\n");
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
