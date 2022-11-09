/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uy.cursojava.proyecto.RiegoSYS.Logica;

import java.util.Calendar;

/**
 *
 * @author rodrigo denis, rodrigo  silveria, bruno rasetti
 */
public class Servicio {
    /*     Atributos      */
    private Empleado empleado;
    private Integer tipoServicio;
    private Calendar fecha;
    
    /*     Constructores         */
    
    public Servicio(Empleado empleado, Integer tipoServicio, Calendar fecha) {
        this.empleado = empleado;
        this.tipoServicio = tipoServicio;
        this.fecha = fecha;
    }
    
    public Servicio(){
    this.empleado= null;
    this.tipoServicio = 0;
    this.fecha = null; //averiguar como dejar una fehca de tipo calendar vacia.
    }
    
    /*      getter y setter         */
    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Integer getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(Integer tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public Calendar getFecha() {
        return fecha;
    }

    public void setFecha(Calendar fecha) {
        this.fecha = fecha;
    }

    
    
}
