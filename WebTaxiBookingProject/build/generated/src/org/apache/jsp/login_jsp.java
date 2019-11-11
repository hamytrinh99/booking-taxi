package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.Account;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <title> Login Form</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n");
      out.write("\n");
      out.write("        <script type=\"application/x-javascript\"> addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n");
      out.write("        <link href=\"css/login.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n");
      out.write("\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Cormorant+SC:300,400,500,600,700\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"//fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i,800,800i\" rel=\"stylesheet\">\n");
      out.write("        <!-- Latest compiled and minified CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Optional theme -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap-theme.min.css\">\n");
      out.write("\n");
      out.write("        <!-- Latest compiled and minified JavaScript -->\n");
      out.write("        <script src=\"//netdna.bootstrapcdn.com/bootstrap/3.1.1/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        ");

            Account a = (Account) session.getAttribute("account");
        
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div id=\"logo\">\n");
      out.write("            <h2> <a href=\"start.jsp\">Home</a> </h2>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"padding-all\">\n");
      out.write("            <div class=\"header\">\n");
      out.write("                <h1>Login Form</h1>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"design-w3l\">\n");
      out.write("                <div class=\"mail-form-agile\">\n");
      out.write("\n");
      out.write("                    <div>\n");
      out.write("                        ");
 if (request.getAttribute("mess") != null) {
      out.write("\n");
      out.write("                        <h4 style=\"color: red\"> \n");
      out.write("                            ");
      out.print( request.getAttribute("mess"));
      out.write("    \n");
      out.write("                        </h4>\n");
      out.write("                        ");
 }
                        
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <form action=\"login\" method=\"post\">\n");
      out.write("                        <input type=\"text\" name=\"username\" placeholder=\"User Name  or  email...\" required=\"\"/>\n");
      out.write("                        <input type=\"password\"  name=\"password\" class=\"padding\" placeholder=\"Password\" required=\"\"/>\n");
      out.write("                        <p>You do not have account. Please do <a href=\"register.jsp\">register.</a></p><br>\n");
      out.write("                        <input type='submit' value='Login'>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clear\"> </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <div class=\"footer\">\n");
      out.write("                <p>© 2019  Login form. Design by  <a href=\"#\" >  HaMyTrinh </a></p>\n");
      out.write("            </div>\n");
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
