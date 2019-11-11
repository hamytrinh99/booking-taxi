package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class changepassword_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("\n");
      out.write("        <!-- LINEARICONS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"fonts/linearicons/style.css\">\n");
      out.write("\n");
      out.write("        <!-- STYLE CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/register.css\">\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <div class=\"inner\">\n");
      out.write("                <img src=\"img/re1.png\" alt=\"\" class=\"image-1\">\n");
      out.write("                <form action=\"\">                 \n");
      out.write("                        <h3> <a href=\"start.jsp\">Back to Home</a> </h3>\n");
      out.write("                    <h3>Change password</h3>\n");
      out.write("                    <div class=\"form-holder\">\n");
      out.write("                        <span class=\"lnr lnr-user\"></span>\n");
      out.write("                        <input type=\"text\" name=\"username\" class=\"form-control\" placeholder=\"Username\" pattern=\"^[^0-9]+$\" required>\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <div class=\"form-holder\">\n");
      out.write("                        <span class=\"lnr lnr-lock\"></span>\n");
      out.write("                        <input type=\"password\" name=\"oldpassword\" class=\"form-control\" placeholder=\"Old Password\" pattern=\"^[^0-9]+$\" required=\"\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"form-holder\">\n");
      out.write("                        <span class=\"lnr lnr-lock\"></span>\n");
      out.write("                        <input type=\"password\" name=\"newpassword\" class=\"form-control\" placeholder=\"New Password\" pattern=\"^[^0-9]+$\" required=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"form-holder\">\n");
      out.write("                        <span class=\"lnr lnr-lock\"></span>\n");
      out.write("                        <input type=\"password\" class=\"form-control\" placeholder=\"Confirm New Password\" pattern=\"^[^0-9]+$\" required=\"\">\n");
      out.write("                    </div>\n");
      out.write("                    <button>\n");
      out.write("                        <span>Change Password</span>\n");
      out.write("                    </button>\n");
      out.write("\n");
      out.write("                </form>\n");
      out.write("                <img src=\"img/re2.png\" alt=\"\" class=\"image-2\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script src=\"js/jquery-3.3.1.min.js\"></script>\n");
      out.write("        <script src=\"js/main.js\"></script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>");
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
