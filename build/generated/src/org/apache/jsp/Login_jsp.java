package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("         <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css\" integrity=\"sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb\" crossorigin=\"anonymous\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Ingresar</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estiloLogin.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <form class=\"form-signin\" action=\"ControlerHome\" method=\"post\">       \n");
      out.write("                <h2 class=\"form-signin-heading\">Ingresar</h2>\n");
      out.write("                <input type=\"text\" class=\"form-control\" name=\"username\" placeholder=\"Email Address\" required=\"\" autofocus=\"\" />\n");
      out.write("                <input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Password\" required=\"\"/>      \n");
      out.write("                <label class=\"checkbox\">\n");
      out.write("                    <input type=\"checkbox\" value=\"remember-me\" id=\"rememberMe\" name=\"rememberMe\"> Remember me\n");
      out.write("                </label>\n");
      out.write("                <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Login</button>  \n");
      out.write("                <a href=\"Registrarse.jsp\">Registrarse</a>\n");
      out.write("            </form>\n");
      out.write("            ");
if(request.getAttribute("mensaje")!= null){
      out.write("\n");
      out.write("                <script>alert(\"");
      out.print(request.getAttribute("mensaje"));
      out.write("\");</script>\n");
      out.write("                ");
 request.setAttribute("mensaje",null);
      out.write("\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("<!--\n");
      out.write("(b)Registrarse en la aplicación.\n");
      out.write("    (i) Añadir cliente en el registro.\n");
      out.write("        (1) Introducir nombre único de usuario y contraseña.\n");
      out.write("        (2) Introducir datos personales.\n");
      out.write("-->");
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
