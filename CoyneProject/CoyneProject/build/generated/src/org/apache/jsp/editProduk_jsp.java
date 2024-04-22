package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.Connection;

public final class editProduk_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>                           \n");
      out.write("        <h1>DATA YANG AKAN DI EDIT</h1>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <thead>\n");
      out.write("                <tr class=\"head\">\n");
      out.write("                    <th>Id Produk</th>\n");
      out.write("                    <th>Nama Produk</th>\n");
      out.write("                    <th>Kategori Produk</th>\n");
      out.write("                    <th>Berat Produk</th>\n");
      out.write("                    <th>Stok</th>\n");
      out.write("                    <th>Deskripsi</th>\n");
      out.write("                    <th>Harga Produk</th>\n");
      out.write("                    <th>Gambar Produk</th>\n");
      out.write("                </tr>\n");
      out.write("            </thead>\n");
      out.write("            <tbody>\n");
      out.write("                ");

                    String idProduk = request.getParameter("idProduk");
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coyne", "root", "");
                    Statement st = cn.createStatement();
                    ResultSet rs = st.executeQuery("select * from produk where idProduk ='"+ idProduk +"'");
                    while (rs.next()) {
                
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td>");
 out.print(rs.getString(1)); 
      out.write("</td>\n");
      out.write("                    <td>");
 out.print(rs.getString(2)); 
      out.write("</td>\n");
      out.write("                    <td>");
 out.print(rs.getString(3)); 
      out.write("</td>\n");
      out.write("                    <td>");
 out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                    <td>");
 out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("                    <td>");
 out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("                    <td>");
 out.print(rs.getString(7));
      out.write("</td>\n");
      out.write("                    <td><img src=\"gambar/");
      out.print( rs.getString(8));
      out.write("\" width=150px height=100px align=\"middle\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                ");
 }
      out.write("\n");
      out.write("            </tbody>                   \n");
      out.write("        </table>\n");
      out.write("        <form method=\"post\" action=\"ControllerEditProduk\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"text\" name=\"idProduk\" value=\"");
      out.print(idProduk);
      out.write("\" /></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Nama Produk</th>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"namaProduk\" class=\"teks\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr> \n");
      out.write("                    <th>Kategori</th>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"radio\" name=\"kategori\" value=\"Sayur\"/>Sayur</td>                     \n");
      out.write("                </tr>   \n");
      out.write("                <tr>\n");
      out.write("                    <td></td><td></td>\n");
      out.write("                    <td><input type=\"radio\" name=\"kategori\" value=\"Buah\"/>Buah</td> \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Berat Produk (kg)</th>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"beratProduk\" class=\"teks\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Stok</th>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"stokProduk\" class=\"teks\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th><label for=\"deskripsi\">Deskripsi Produk</label></th>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><textarea name=\"deskripsi\" rows=\"5\" cols=\"25\"></textarea></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th>Harga Produk</th>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"text\" name=\"hargaProduk\" class=\"teks\"></td>\n");
      out.write("                </tr>                     \n");
      out.write("                <tr>\n");
      out.write("                    <th>Gambar</th>\n");
      out.write("                    <td>:</td>\n");
      out.write("                    <td><input type=\"file\" name=\"gambarProduk\" class=\"teks\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"submit\" name=\"submit\" value=\"Edit\">\n");
      out.write("                        <input type=\"reset\" name=\"reset\" value=\"Reset\"></td>\n");
      out.write("                </tr>    \n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    \n");
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
