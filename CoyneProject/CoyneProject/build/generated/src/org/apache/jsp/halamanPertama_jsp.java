package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class halamanPertama_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Halaman Awal Customer</title>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"CSS/halpertama.css\">\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header class=\"header\">\n");
      out.write("            <a href=\"halamanPertama.jsp\"><img src=\"CSS/ilogo.png\" width=\"200\" height=\"80\" alt=\"\" id=\"ilogo\"></a>\n");
      out.write("            <nav class=\"navbar\">\n");
      out.write("                <a href=\"customerregister.jsp\" id=\"daftar\">Daftar</a>\n");
      out.write("                <a href=\"customerlogin.jsp\" id=\"login\">login</a>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("\n");
      out.write("        <section class=\"home\" id=\"home\">\n");
      out.write("\n");
      out.write("            <div class=\"content\">\n");
      out.write("                <h3>Sayur & Buah segar untukmu</h3>\n");
      out.write("                <p>dapatkan sayur dan buah hanya di <span>coyne</span>, beli sekarang anda dijamin mendapat kepuasan</p>\n");
      out.write("                <a href=\"customerlogin.jsp\" class=\"btn\"  onClick=\"alert('Login terlebih dahulu untuk membeli produk!')\">shop now</a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <section class=\"categories\" id=\"categories\">\n");
      out.write("\n");
      out.write("            <div class=\"box-container\">\n");
      out.write("\n");
      out.write("                ");

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coyne", "root", "");
                    Statement st = cn.createStatement();
                    ResultSet rs = st.executeQuery("select * from produk");
                    while (rs.next()) {
                
      out.write("\n");
      out.write("                <div class=\"box\" data-tilt>\n");
      out.write("                    <img src=\"gambar/");
      out.print( rs.getString(8));
      out.write("\" width=178 height=178/>\n");
      out.write("                    <h1>");
 out.print(rs.getString(2)); 
      out.write("</h1>\n");
      out.write("                    <h3>Rp.");
 out.print(rs.getString(7)); 
      out.write("</h3>\n");
      out.write("                    <a href=\"customerlogin.jsp\">\n");
      out.write("                    <button  id=\"beli\" type=\"submit\" class=\"btn btn-success w-25\" name=\"submit\" value=\"BELI\" onClick=\"alert('Login terlebih dahulu untuk membeli produk!')\">BELI</button>\n");
      out.write("                    </a>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                ");
 }
      out.write("\n");
      out.write("                \n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("        <!-- bagian ffluter -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <section class=\"footer\">\n");
      out.write("\n");
      out.write("                <div class=\"box-container\">\n");
      out.write("\n");
      out.write("                    <div class=\"box\">\n");
      out.write("                        <h3> Coyne <i class=\"fas fa-shopping-basket\"></i> </h3>\n");
      out.write("                        <p>Melengkapi kebutuhan sayur dan buah yang segar dan higenis</p>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
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
      out.write("\n");
      out.write("\n");
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
