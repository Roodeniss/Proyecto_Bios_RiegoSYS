/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uy.cursojava.proyecto.RiegoSYS.Logica;

import uy.cursojava.proyecto.RiegoSYS.Excepciones.BDException;
import uy.cursojava.proyecto.RiegoSYS.Excepciones.EmpleadoNoValidoException;
import uy.cursojava.proyecto.RiegoSYS.Persistencia.PresistenciaEmpleado;

/**
 *
 * @author rodrigodenis
 */
public class FachadaEmpleado {

    public Empleado FachaEmpleadoExiste(Empleado e) throws EmpleadoNoValidoException {
        PresistenciaEmpleado pu = new PresistenciaEmpleado();
        Empleado empleadoRes = null;
        return empleadoRes = pu.existeEmpleado(e);
    }

    public void FachaEmpleadoAgregar(Empleado e) throws EmpleadoNoValidoException, BDException {
        PresistenciaEmpleado pu = new PresistenciaEmpleado();
        pu.agregar(e);
    }
}
