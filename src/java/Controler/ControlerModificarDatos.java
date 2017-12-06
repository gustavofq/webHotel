package Controler;


import Logica.Cliente;
import Logica.Hotel;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class ControlerModificarDatos extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        Hotel unHotel = new Hotel();
        HttpSession unaSession = request.getSession();
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String tarjeta = request.getParameter("tarjeta");
        String user = request.getParameter("user");
        Cliente newCliente = new Cliente();
        Cliente oldCliente = unHotel.DameElCliente(unHotel.buscarPorUsuario((String)unaSession.getAttribute("seccion")));
        newCliente = oldCliente;
        newCliente.setApellido(apellido);
        newCliente.setNombre(nombre);
        newCliente.setTarjetaDeCredito(Double.parseDouble(tarjeta));
        newCliente.setUsuario(user);
        if((unHotel.buscarPorUsuario(user)== -1)||(user.equals(unaSession.getAttribute("seccion")))){
            unHotel.modificarCliente(oldCliente, newCliente);
             unaSession.setAttribute("seccion", user);
            request.getRequestDispatcher("Principal.jsp").forward(request, response);
        }else{
            String mensaje= "el usuario ya existe.";
            request.setAttribute("mensaje", mensaje);
           request.getRequestDispatcher("/ControlerCuenta").include(request, response);
        }
        request.getRequestDispatcher("Principal.jsp").forward(request, response);
       
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(ControlerModificarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(ControlerModificarDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
