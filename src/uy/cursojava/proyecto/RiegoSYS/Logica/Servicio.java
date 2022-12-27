/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uy.cursojava.proyecto.RiegoSYS.Logica;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author rodrigo denis, rodrigo  silveria, bruno rasetti
 */
public class Servicio {
    /*     Atributos      */
    private Empleado empleado;
    private Cliente cliente;
    private String tipoServicio;
    private LocalDate fecha;
    
    /*     Constructores         */
    
    public Servicio(Empleado empleado, String tipoServicio, LocalDate fecha) {
        this.empleado = empleado;
        this.tipoServicio = tipoServicio;
        this.fecha = fecha;
    }
    
    public Servicio(){
    this.empleado= null;
    this.tipoServicio = "";
    this.fecha = null; //averiguar como dejar una fehca de tipo calendar vacia.
    }
    
    /*      getter y setter         */
    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }
    
    public Cliente getCliente(){
        return cliente;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    
    
}
