package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Logica.Servicio;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import Logica.Habitacion;
import Logica.Hotel;

public final class Presupuesto_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

Hotel unHotel = new Hotel();
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        ");
      out.write("\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css\" integrity=\"sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb\" crossorigin=\"anonymous\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Presupuesto</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estiloLogin.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estiloMenu.css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <a>");
      out.print( session.getAttribute("seccion"));
      out.write("</a>\n");
      out.write("        </header>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"Presupuesto.jsp\">Presupuesto</a></li>\n");
      out.write("                <li><a href=\"");
      out.print( request.getContextPath()+"/ControlerReserva");
      out.write("\" >Reservas</a></li>\n");
      out.write("                <li><a href=\"");
      out.print( request.getContextPath()+"/ControlerCuenta");
      out.write("\" >Cuenta</a></li>\n");
      out.write("            </ul>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <form id=\"ffecha\" action=\"ControlerPresupuestar\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"text\">Fecha Entrada</label>\n");
      out.write("                            <input type=\"date\" name=\"fechaInicio\" class=\"form-control\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"text\">Fecha Salida</label>\n");
      out.write("                            <input type=\"date\" name=\"fechaFinal\" class=\"form-control\"/>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <div class=\"dropdown\">\n");
      out.write("                            <select name=\"habitaciones\">\n");
      out.write("                                ");
for(Habitacion unaHabitacion : unHotel.mostrarHabitaciones()){
      out.write("\n");
      out.write("                                <option name=\"habitacion\" value='");
      out.print( unaHabitacion.getId() );
      out.write('\'');
      out.write('>');
      out.print( "Número: " + unaHabitacion.getId() + " Tipo: " + unaHabitacion.getUnTipo().getNombre() + " Precio: " +unaHabitacion.getMontoPorNoche() );
      out.write("</option>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                            </select>   \n");
      out.write("                        </div>\n");
      out.write("                        <div>\n");
      out.write("                             <select name=\"servicios\">\n");
      out.write("                                ");
for(Servicio unServicio : unHotel.mostrarServicios()){
      out.write("\n");
      out.write("                                <option name=\"servicio\" value=\"");
      out.print( unServicio.getId() );
      out.write('"');
      out.write('>');
      out.print( "Servicio: " + unServicio.getNombre() );
      out.write("</option>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                            </select>    \n");
      out.write("                        </div>\n");
      out.write("                        <input type=\"submit\" />\n");
      out.write("                    </form>\n");
      out.write("               </div>\n");
      out.write("                <div class=\"col-sm-4\">\n");
      out.write("                    <ul>\n");
      out.write("                        ");

                        if(request.getParameter("fechaInicio") == null){
                            request.setAttribute("dias", 0);
                        }
                        double precio = 0.0;
                        if(request.getParameter("fechaFinal") == null){
                            request.setAttribute("precio", precio);
                        }
                        
                        
      out.write("\n");
      out.write("                        <li><label>Detalles</label></li>\n");
      out.write("                        <li><label>Dias: ");
      out.print(request.getAttribute("dias"));
      out.write("</label></li>\n");
      out.write("                        <li><label >Precio final: ");
      out.print((Double)request.getAttribute("precio"));
      out.write("</label></li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        ");
if(request.getAttribute("mensaje")!= null){
      out.write("\n");
      out.write("        <script>alert(\"");
      out.print(request.getAttribute("mensaje"));
      out.write("\");</script>\n");
      out.write("        ");
 request.setAttribute("mensaje",null);
      out.write("\n");
      out.write("        ");
}
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("<!-- \n");
      out.write("a) Realizar un presupuesto.\n");
      out.write("    i) Consultar disponibilidad de las habitaciones según las fechas.\n");
      out.write("    ii) Consultar servicios adicionales.\n");
      out.write("    iii) Ver precio final\n");
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
