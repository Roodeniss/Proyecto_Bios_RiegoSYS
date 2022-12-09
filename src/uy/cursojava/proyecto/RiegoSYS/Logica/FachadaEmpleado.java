/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uy.cursojava.proyecto.RiegoSYS.Logica;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import uy.cursojava.proyecto.RiegoSYS.Excepciones.BDException;
import uy.cursojava.proyecto.RiegoSYS.Excepciones.EmpleadoNoValidoException;
import uy.cursojava.proyecto.RiegoSYS.Persistencia.PresistenciaEmpleado;

/**
 *
 * @author rodrigodenis
 */
public class FachadaEmpleado {

    private PresistenciaEmpleado pe = new PresistenciaEmpleado();

    public Empleado fachaEmpleadoExiste(Empleado e) throws EmpleadoNoValidoException {
        Empleado empleadoRes = null;
        return empleadoRes = pe.existeEmpleado(e);
    }

    public void fachaEmpleadoAgregar(Empleado e) throws EmpleadoNoValidoException {
        try {
            pe.agregar(e);
        } catch (BDException ex) {
            Logger.getLogger(FachadaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void fachaEmoleadoEliminar(Empleado e) throws EmpleadoNoValidoException {
        try {
            pe.eliminar(e.getDocumento());
        } catch (BDException ex) {
            Logger.getLogger(FachadaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Empleado> fachaEmpleadoListar(Empleado e) throws EmpleadoNoValidoException {
        ArrayList<Empleado> listaAux = null;
        try {
            listaAux = new ArrayList();
            listaAux = pe.listarTodos(e);
        } catch (BDException ex) {
            Logger.getLogger(FachadaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaAux;
    }

    public void fachaEmpleadoModificar(Empleado e) {
        pe.modificar(e);
    }
}
