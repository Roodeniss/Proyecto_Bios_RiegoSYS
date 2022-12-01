/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uy.cursojava.proyecto.RiegoSYS.Logica;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import uy.cursojava.proyecto.RiegoSYS.Excepciones.BDException;
import uy.cursojava.proyecto.RiegoSYS.Excepciones.EmpleadoNoValidoException;

/**
 *
 * @author rodrigodenis
 */
public class FachadaEmpleado {

    private PresistenciaCliente pe = new PresistenciaCliente();

    public Empleado FachaEmpleadoExiste(Empleado e) throws EmpleadoNoValidoException {
        Empleado empleadoRes = null;
        return empleadoRes = pe.existeEmpleado(e);
    }

    public void FachaEmpleadoAgregar(Empleado e) throws EmpleadoNoValidoException {
        try {
            pe.agregar(e);
        } catch (BDException ex) {
            Logger.getLogger(FachadaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void FachaEmoleadoEliminar(Empleado e){
        try {
            pe.eliminar(e.getDocumento());
        } catch (BDException ex) {
            Logger.getLogger(FachadaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public DefaultListModel FachaEmpleadoListar(Empleado e) {
       DefaultListModel<Empleado> retorno = new DefaultListModel();
        try {
            ArrayList<Empleado> listaAux = new ArrayList();
            listaAux = pe.listarTodos(e);
            for (int i = 0; i < listaAux.size(); i++) {
                retorno.addElement(listaAux.get(i));
            }
        } catch (BDException ex) {
            Logger.getLogger(FachadaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }
}
