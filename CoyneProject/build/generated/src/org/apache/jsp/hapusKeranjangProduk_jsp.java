package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class hapusKeranjangProduk_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css\">\n");
      out.write("        <title>Hapus Produk dari Keranjang</title>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            .sukses{\n");
      out.write("                position: absolute;\n");
      out.write("                width: 262px;\n");
      out.write("                height: 269px;\n");
      out.write("                left: 589px;\n");
      out.write("                top: 377px;\n");
      out.write("                border-radius: 50%;\n");
      out.write("                background: rgba(92, 255, 35, 0.54);\n");
      out.write("                margin-top: -10rem;\n");
      out.write("\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .notif{\n");
      out.write("                margin-top: 28rem;\n");
      out.write("                margin-left: 30rem;\n");
      out.write("                display: inline-block;\n");
      out.write("                color: #00DA09;\n");
      out.write("                font-style: italic;\n");
      out.write("            }\n");
      out.write("            .kembali a{\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: blue;\n");
      out.write("                font-family: sans-serif;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            .chklis{\n");
      out.write("                margin-top: 90px;\n");
      out.write("                text-align: center;\n");
      out.write("                font-size: 100px;\n");
      out.write("                color: #fff;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"kembali\">\n");
      out.write("            <p>Kelik disini untuk <a href = \"keranjangProduk.jsp\">kembali!</a>\n");
      out.write("        </div>\n");
      out.write("        ");
 String id = request.getParameter("idKeranjang");
      out.write("\n");
      out.write("\n");
      out.write("        ");


            Class.forName("com.mysql.jdbc.Driver");
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coyne", "root", "");
            Statement st = cn.createStatement();
            st.executeUpdate("delete from keranjang where idKeranjang='" + id + "'");
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"sukses\">\n");
      out.write("\n");
      out.write("            <div class=\"chklis\">\n");
      out.write("                <i class=\"fas fa-check\"></i>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"notif\">\n");
      out.write("            <h1>Produk berhasil dihapus dari keranjang</h1>\n");
      out.write("        </div>\n");
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
