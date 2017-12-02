package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Reserva_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css\" integrity=\"sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb\" crossorigin=\"anonymous\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>Gestionar Reserva</title>\r\n");
      out.write("        <style>\r\n");
      out.write("            body{\r\n");
      out.write("                padding: 0px 0px;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            ul {\r\n");
      out.write("            list-style-type: none;\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            width: 200px;\r\n");
      out.write("            background-color: #f1f1f1;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            li a {\r\n");
      out.write("            display: block;\r\n");
      out.write("            color: #111;\r\n");
      out.write("            padding: 8px 16px;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            li a:hover {\r\n");
      out.write("            background-color: #555;\r\n");
      out.write("            color: white;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            footer{\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            color: #000;\r\n");
      out.write("            padding: 650px 16px;\r\n");
      out.write("            text-decoration: none;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            header{\r\n");
      out.write("                display: line;\r\n");
      out.write("                text-align: center;\r\n");
      out.write("                font: fantasy;\r\n");
      out.write("                background-color: #138496;\r\n");
      out.write("                padding: auto;\r\n");
      out.write("                font-size: 25px; \r\n");
      out.write("                \r\n");
      out.write("            }\r\n");
      out.write("            header ul{\r\n");
      out.write("                align-content: space-around;\r\n");
      out.write("            }\r\n");
      out.write("            ffecha{\r\n");
      out.write("                align-content: center;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("        </style>\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <header>\r\n");
      out.write("            <a>");
      out.print( session.getAttribute("seccion"));
      out.write("</a>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"Ajustes.jsp\">Ajustes</a></li>\r\n");
      out.write("                <li><a href=\"cambiarPass.jsp\">Cambiar Contraseña</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </header>\r\n");
      out.write("        <ul class=\"menu\">\r\n");
      out.write("            <li><a href=\"Principal.jsp\">Inicio</a></li>\r\n");
      out.write("            <li><a href=\"Presupuesto.jsp\">Presupuesto</a></li> \r\n");
      out.write("        </ul>\r\n");
      out.write("        <form id=\"ffecha\" action=\"\">\r\n");
      out.write("            fecha Ingreso<input type=\"date\" name=\"fechaInicio\" />\r\n");
      out.write("            fecha Egreso<input type=\"date\" name=\"fechaFin\"/>\r\n");
      out.write("            <select>\r\n");
      out.write("                <option value=\"volvo\">Volvo</option>\r\n");
      out.write("                <option value=\"saab\">Saab</option>\r\n");
      out.write("                <option value=\"opel\">Opel</option>\r\n");
      out.write("                <option value=\"audi\">Audi</option>\r\n");
      out.write("            </select>\r\n");
      out.write("            <button type=\"submit\">verificar</button>\r\n");
      out.write("        </form>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>\r\n");
      out.write("<!--\r\n");
      out.write("d) Realizar reserva de habitación.\r\n");
      out.write("    i) Consultar disponibilidad de las habitaciones según las fechas.\r\n");
      out.write("    ii) Elegir tipo de habitación y cantidad de las mismas.\r\n");
      out.write("    iii) Ver precio final.\r\n");
      out.write("    iv) Introducir número de tarjeta.\r\n");
      out.write("    v) Realizar reserva.\r\n");
      out.write("e) Modificar reserva.\r\n");
      out.write("    i) Mandar mensaje a recepción.\r\n");
      out.write("f) Cancelar reserva.\r\n");
      out.write("    i) Mandar mensaje a recepción.\r\n");
      out.write("g) Consultar Reservas.\r\n");
      out.write("    i) Consultar factura.\r\n");
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
