/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Facu
 */
@Entity
@Inheritance (strategy = InheritanceType.JOINED)
public class RHabitacion extends Reservas implements Serializable{
    

    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar fechaEntrada;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Calendar fechaSalida;
    @Basic
    private int cantidad;
    @OneToOne
    private Habitacion unaHabitacion;
    @OneToOne
    private Cliente unCliente;

    public RHabitacion() {
    }

    public RHabitacion(Calendar fechaEntrada, Calendar fechaSalida, int cantidad, Habitacion unaHabitacion, Cliente unCliente) {
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.cantidad = cantidad;
        this.unaHabitacion = unaHabitacion;
        this.unCliente = unCliente;
    }

    public Calendar getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Calendar fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Calendar getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Calendar fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Habitacion getUnaHabitacion() {
        return unaHabitacion;
    }

    public void setUnaHabitacion(Habitacion unaHabitacion) {
        this.unaHabitacion = unaHabitacion;
    }

    public Cliente getUnCliente() {
        return unCliente;
    }

    public void setUnCliente(Cliente unCliente) {
        this.unCliente = unCliente;
    }

    public int calcularDias(Calendar fechaEntrada, Calendar fechaSalida){
        int cantidadDias = 0;
        boolean listo = false;
        
        int fecha1 = fechaEntrada.get(Calendar.DAY_OF_YEAR);
        int fecha2 = fechaSalida.get(Calendar.DAY_OF_YEAR);
        
        while(listo == false){
            if(fecha1 == fecha2){
                listo = true;
            }else{
                if(fecha1 == 365){
                    fecha1 = 0;
                    cantidadDias++;
                }
                else{
                    fecha1++;
                    cantidadDias++;
                }
            }
        }
        return cantidadDias;
    }
    
    public double CalcularPrecio(){
        double precio = 0;
        precio = this.unaHabitacion.getMontoPorNoche() * this.calcularDias(this.fechaEntrada, this.fechaSalida);
        return precio;
    }
}
