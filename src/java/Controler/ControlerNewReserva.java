package Controler;


import Logica.Cliente;
import Logica.Habitacion;
import Logica.Hotel;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ControlerNewReserva extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ParseException, Exception {
        response.setContentType("text/html;charset=UTF-8");
        Hotel unHotel = new Hotel();
        String dateJsp2 = request.getParameter("fechaFinal");
        String dateJsp = request.getParameter("fechaInicio");
        int dias = 0;
        double precio = 0.0;
        if((dateJsp != "") && (dateJsp2 != "")){
            SimpleDateFormat formaDate = new SimpleDateFormat("yyyy-MM-dd");
            Date dateFecha = formaDate.parse(dateJsp);
            Calendar fecha = Calendar.getInstance();
            fecha.setTime(dateFecha);
            Date dateFecha2 = formaDate.parse(dateJsp2);
            Calendar fecha2 = Calendar.getInstance();
            fecha2.setTime(dateFecha2);
            dias = unHotel.calcularDias(fecha, fecha2);
            request.setAttribute("dias", dias);
            int numero = Integer.parseInt(request.getParameter("habitaciones"));
            precio = unHotel.presupuestar(fecha, fecha2, unHotel.DameLaHabitacion(numero)) + unHotel.DameElServicio(Integer.parseInt(request.getParameter("servicios"))).getPrecio();
            request.setAttribute("precio", precio);
            if(unHotel.filtrarReservas(fecha, fecha2).isEmpty() != true){
                Habitacion unaHabitacion = null;
                int numeroHabitacion = Integer.parseInt(request.getParameter("habitaciones"));
                unaHabitacion = unHotel.DameLaHabitacion(numeroHabitacion);
                HttpSession unaSession = request.getSession();
                int dni = unHotel.buscarPorUsuario(unaSession.getAttribute("seccion").toString());
                Cliente unCliente = unHotel.DameElCliente(dni);
                unHotel.altaRHabitacion(fecha, fecha2, 1, unaHabitacion, unCliente);
                request.setAttribute("mensaje", "Se ha reservado satisfactoriamente!.");
                request.setAttribute("fechaI", fecha);
                request.setAttribute("fechaE", fecha2);
                request.setAttribute("tipo", unaHabitacion.getUnTipo().getNombre());
                request.setAttribute("habitacion", numeroHabitacion);
                request.getRequestDispatcher("/ControlerReserva").include(request, response);
            }else{
                request.setAttribute("mensaje", "No hay disponibilidad para tal fecha en esa habitacion.");
                request.getRequestDispatcher("/ControlerReserva").include(request, response);
            }
        }else{
            request.setAttribute("mensaje", "Debe completar los campo con las fechas.");
            request.setAttribute("dias", dias);
            request.setAttribute("precio", precio);
           request.getRequestDispatcher("/ControlerReserva").include(request, response);
        }
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
        } catch (ParseException ex) {
            Logger.getLogger(ControlerNewReserva.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ControlerNewReserva.class.getName()).log(Level.SEVERE, null, ex);
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
        } catch (ParseException ex) {
            Logger.getLogger(ControlerNewReserva.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ControlerNewReserva.class.getName()).log(Level.SEVERE, null, ex);
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
