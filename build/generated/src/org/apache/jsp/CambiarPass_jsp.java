package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CambiarPass_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css\" integrity=\"sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb\" crossorigin=\"anonymous\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Gestionar Cuenta</title>\n");
      out.write("        <link href=\"css/estiloMenu.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/estiloLogin.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <a>");
      out.print( session.getAttribute("seccion"));
      out.write("</a>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"Ajustes.jsp\">Ajustes</a></li>\n");
      out.write("                <li><a href=\"cambiarPass.jsp\">Cambiar Contraseña</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <form class=\"form-signin\" action=\"ControlerHome\" method=\"post\">       \n");
      out.write("                <h2 class=\"form-signin-heading\">Modificar</h2>\n");
      out.write("                <h2>Usuario</h3><input type=\"text\" class=\"form-control\" name=\"username\" placeholder=\"Nuevo Usuario\" required=\"\" autofocus=\"\" />\n");
      out.write("                <h2>Contraseña</h3><input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Vieja password\" required=\"\"/>\n");
      out.write("                <h2>Contraseña</h3><input type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Nuevo password\" required=\"\"/>\n");
      out.write("                <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Cambiar</button>   \n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("<!--\n");
      out.write("c) Modificar los datos personales.\n");
      out.write("    i) Modificar los datos introducidos cuando se registró.\n");
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
