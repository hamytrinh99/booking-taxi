package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.User;
import dal.DBContext;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/index.css\" />\n");
      out.write("        <title>header</title>\n");
      out.write("\n");
      out.write("        ");

            User u = (User) session.getAttribute("user");
        
      out.write("\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("\n");
      out.write("            <!--header-->\n");
      out.write("        <header>\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <!--nav-->\n");
      out.write("                <nav class=\"py-sm-4 py-3 d-lg-flex \">\n");
      out.write("                    <div id=\"logo\">\n");
      out.write("                        <h1> <a href=\"start.jsp\"><span></span>MiMi Taxi</a> </h1>\n");
      out.write("                    </div>\n");
      out.write("                    <ul class=\"menu mt-md-2 ml-auto\">\n");
      out.write("                        <li class=\"mr-lg-4 mr-2 active\"><a href=\"start.jsp\">Home</a></li>\n");
      out.write("                        <li class=\"mr-lg-4 mr-2\"><a href=\"#\">Booking</a></li>\n");
      out.write("                        <li class=\"mr-lg-4 mr-2\"><a href=\"#\">About</a></li>   \n");
      out.write("                        <li class=\"mr-lg-4 mr-2\"><a href=\"#\">Vehicle</a></li>\n");
      out.write("                        <li class=\"mr-lg-4 mr-2\"><a href=\"#\">Price</a></li>\n");
      out.write("                        <li class=\"mr-lg-4 mr-2\"><a href=\"#\">Register</a></li>\n");
      out.write("                        <li class=\"dropdown\">\n");
      out.write("                    ");
if (u != null) {
      out.write("\n");
      out.write("                    <button class=\"dropbtn\">My Account</button>\n");
      out.write("                    <div class=\"dropdown-content\">\n");
      out.write("                        <a href=\"myaccount\"  target=\"home\">Change Info</a>\n");
      out.write("                        <a href=\"logout\">Sign Out</a>\n");
      out.write("                    </div>\n");
      out.write("                    ");
} else {
      out.write("\n");
      out.write("                    <a class=\"mr-lg-4 mr-2\" href=\"login.jsp\">Login</a>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </li>\n");
      out.write("                     \n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
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
