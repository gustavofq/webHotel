package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Ajustes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Ajustes</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2>Gestionar cuenta</h2>\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"index.jsp\">Inicio</a></li>\n");
      out.write("            <li><a href=\"Reserva.jsp\">Reservas</a></li>\n");
      out.write("            <li><a href=\"Presupuesto.jsp\"></a></li>\n");
      out.write("        </ul>\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <form class=\"form-signin\" action=\"ControlerAjustes\" method=\"post\">       \n");
      out.write("                <h2 class=\"form-signin-heading\">Modificar</h2>\n");
      out.write("                <h2>Nombre</h3><input type=\"text\" class=\"form-control\" name=\"nombre\"/>\n");
      out.write("                <h2>apellido</h3><input type=\"text\" class=\"form-control\" name=\"apellido\" />\n");
      out.write("                <h2>Número de Tarjeta</h3><input type=\"text\" class=\"form-control\" name=\"tarjeta\"/>\n");
      out.write("                <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\">Cambiar</button>   \n");
      out.write("            </form>\n");
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
