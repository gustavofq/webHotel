/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 *
 * @author Facu
 */
@Entity
@Inheritance (strategy = InheritanceType.JOINED)
public class Camarero extends Empleado implements Serializable{

    public Camarero() {
    }

    public Camarero(int dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
    }

    
    

}
