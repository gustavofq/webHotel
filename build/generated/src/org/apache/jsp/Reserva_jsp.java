package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Logica.Habitacion;
import Logica.Tipo;
import Logica.Hotel;

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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css\" integrity=\"sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb\" crossorigin=\"anonymous\">\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <title>Reserva</title>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS.css\"> \r\n");
      out.write("        <link href=\"css/estiloMenu.css\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <header>\r\n");
      out.write("            <a>");
      out.print( session.getAttribute("seccion"));
      out.write("</a>\r\n");
      out.write("        </header>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"Presupuesto.jsp\">Presupuesto</a></li>\r\n");
      out.write("                <li><a href=\"");
      out.print( request.getContextPath()+"/ControlerReserva");
      out.write("\" >Reservas</a></li>\r\n");
      out.write("                <li><a href=\"");
      out.print( request.getContextPath()+"/ControlerCuenta");
      out.write("\" >Cuenta</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-sm-4\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"col-sm-4\">\r\n");
      out.write("                    <form id=\"ffecha\" action=\"ControlerReserva\">\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"text\">Fecha Entrada</label>\r\n");
      out.write("                            <input type=\"date\" name=\"fechaInicio\" class=\"form-control\"/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"form-group\">\r\n");
      out.write("                            <label for=\"text\">Fecha Salida</label>\r\n");
      out.write("                            <input type=\"date\" name=\"fechaInicio\" class=\"form-control\"/>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <form action=\"controlerReserva\">\r\n");
      out.write("                        <div class=\"dropdown\">\r\n");
      out.write("                            \r\n");
      out.write("                            <button class=\"btn btn-default dropdown-toggle\" type=\"submit\" id=\"menu1\" data-toggle=\"dropdown\">Tipo\r\n");
      out.write("                                <span class=\"caret\"></span>\r\n");
      out.write("                            </button>\r\n");
      out.write("                            <ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"menu1\">\r\n");
      out.write("                                \r\n");
      out.write("                                <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"#\">");
      out.print(request.getAttribute("hola"));
      out.write("</a></li>\r\n");
      out.write("                                \r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                        <div class=\"dropdown\">\r\n");
      out.write("                            <button class=\"btn btn-default dropdown-toggle\" type=\"submit\" id=\"menu1\" data-toggle=\"dropdown\">Habitacion\r\n");
      out.write("                                <span class=\"caret\"></span>\r\n");
      out.write("                            </button>\r\n");
      out.write("                            <ul class=\"dropdown-menu\" role=\"menu\" aria-labelledby=\"menu1\">\r\n");
      out.write("                                ");

                                    Hotel unHotel = new Hotel();
                                    for(Habitacion unaHabitacion : unHotel.mostrarHabitaciones()){
                                      
                                
      out.write("\r\n");
      out.write("                                   <li role=\"presentation\"><a role=\"menuitem\" tabindex=\"-1\" href=\"#\">");
      out.print( unaHabitacion.getId() );
      out.write("</a></li>\r\n");
      out.write("                                ");
}
      out.write("\r\n");
      out.write("                            </ul>\r\n");
      out.write("                        </div>\r\n");
      out.write("                            <button type=\"submit\" name=\"reservar\"> Reservar</button>\r\n");
      out.write("                    </form>\r\n");
      out.write("               \r\n");
      out.write("               </div>\r\n");
      out.write("                <div class=\"col-sm-4\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
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
