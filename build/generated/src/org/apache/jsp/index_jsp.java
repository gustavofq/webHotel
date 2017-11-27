package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Example</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS.css\"> \n");
      out.write("        <style type=\"text/css\"> \n");
      out.write("            body{\n");
      out.write("                padding: 0px 0px;\n");
      out.write("            }\n");
      out.write("            ul {\n");
      out.write("            list-style-type: none;\n");
      out.write("            margin: 0;\n");
      out.write("            padding: 0;\n");
      out.write("            width: 200px;\n");
      out.write("            background-color: #f1f1f1;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            li a {\n");
      out.write("            display: block;\n");
      out.write("            color: #000;\n");
      out.write("            padding: 8px 16px;\n");
      out.write("            text-decoration: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            li a:hover {\n");
      out.write("            background-color: #555;\n");
      out.write("            color: white;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            footer{\n");
      out.write("                margin: 0;\n");
      out.write("            color: #000;\n");
      out.write("            padding: 650px 16px;\n");
      out.write("            text-decoration: none;\n");
      out.write("            text-align: center;\n");
      out.write("            }\n");
      out.write("        </style> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <ul>\n");
      out.write("            <li><a href=\"default.asp\">Presupuestar</a></li>\n");
      out.write("            <li><a href=\"news.asp\">Reservas</a></li>\n");
      out.write("            <li><a href=\"contact.asp\">Cuenta</a></li>\n");
      out.write("        </ul>\n");
      out.write("        <footer>Todos los derechos reservados Facundo Enriquez T. - Quintana Gustavo F.</footer>\n");
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
