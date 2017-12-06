package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Registrarse_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css\" integrity=\"sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb\" crossorigin=\"anonymous\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Registrarse</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"CSS.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"estiloLogin.css\">\n");
      out.write("        <script>\n");
      out.write("            function validarPass(){\n");
      out.write("                var pass1 = formulario.pw1.value;\n");
      out.write("                var pass2 = formulario.pw2.value;\n");
      out.write("                if(pass1 !== pass2){\n");
      out.write("                    alert(\"El password no coincide\");\n");
      out.write("                    document.getElementById(\"pw1\").focus();\n");
      out.write("                }else{\n");
      out.write("                    formulario.\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("        <style type=\"text/css\"> \n");
      out.write("            body {\n");
      out.write("                background: #eee !important;\t\n");
      out.write("            }\n");
      out.write("            .wrapper {\t\n");
      out.write("                margin-top: 80px;\n");
      out.write("                margin-bottom: 80px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .form-signin {\n");
      out.write("                max-width: 380px;\n");
      out.write("                padding: 15px 35px 45px;\n");
      out.write("                margin: 0 auto;\n");
      out.write("                background-color: #fff;\n");
      out.write("                border: 1px solid rgba(0,0,0,0.1);  \n");
      out.write("                .form-signin-heading,\n");
      out.write("                .checkbox {\n");
      out.write("                    margin-bottom: 30px;\n");
      out.write("                }\n");
      out.write("                .checkbox {\n");
      out.write("                    font-weight: normal;\n");
      out.write("                }\n");
      out.write("                .form-control {\n");
      out.write("                    position: relative;\n");
      out.write("                    font-size: 16px;\n");
      out.write("                    height: auto;\n");
      out.write("                    padding: 10px;\n");
      out.write("                    @include box-sizing(border-box);\n");
      out.write("                    &:focus {\n");
      out.write("                        z-index: 2;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                input[type=\"text\"] {\n");
      out.write("                    margin-bottom: -1px;\n");
      out.write("                    border-bottom-left-radius: 0;\n");
      out.write("                    border-bottom-right-radius: 0;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("                input[type=\"password\"] {\n");
      out.write("                    margin-bottom: 20px;\n");
      out.write("                    border-top-left-radius: 0;\n");
      out.write("                    border-top-right-radius: 0;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </style> \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"wrapper\">\n");
      out.write("            <form id=\"formulario\" class=\"form-signin\" action=\"ControlerRegistrarse\" method=\"post\">       \n");
      out.write("                <h2 class=\"form-signin-heading\">Ingresar</h2>\n");
      out.write("                <h5>Nombre</h5><input type=\"text\" class=\"form-control\" name=\"nombre\" placeholder=\"ej: Pedro\" required=\"\" autofocus=\"\">\n");
      out.write("                <h5>Apellido</h5><input type=\"text\" class=\"form-control\" name=\"apellido\" placeholder=\"ej: Diaz\" required=\"\"/>\n");
      out.write("                <h5>DNI</h5><input type=\"text\" class=\"form-control\" name=\"dni\" placeholder=\"ej: 12345678\" required=\"\"/>\n");
      out.write("                <h5>N° tarjeta</h5><input type=\"text\" class=\"form-control\" name=\"tarjeta\" placeholder=\"ej: 548418574\" required=\"\"/>\n");
      out.write("                <h5>Usuario</h5><input type=\"text\" class=\"form-control\" name=\"user\" placeholder=\"ej: pedroD\" required=\"\"/>\n");
      out.write("                <h5>Password</h5><input id=\"pw1\" type=\"password\" class=\"form-control\" name=\"password\" placeholder=\"Password\" required=\"\"/>\n");
      out.write("                <h5>Password</h5><input id=\"pw2\" type=\"password\" class=\"form-control\" name=\"password2\" placeholder=\"Repetir Password\" required=\"\"/>\n");
      out.write("                <button class=\"btn btn-lg btn-primary btn-block\" type=\"submit\" onclick='validarPass()'>Guardar</button>  \n");
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
      out.write("            \n");
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
