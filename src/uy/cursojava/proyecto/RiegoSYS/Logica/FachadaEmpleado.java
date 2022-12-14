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
import uy.cursojava.proyecto.RiegoSYS.Persistencia.PersistenciaEmpleado;

/**
 *
 * @author rodrigodenis
 */
public class FachadaEmpleado {

    private PersistenciaEmpleado pe = new PersistenciaEmpleado();

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
    
    public ArrayList<Empleado> fachaEmpleadoLista()throws EmpleadoNoValidoException{
        ArrayList<Empleado> listaAux = null;
        try{
            listaAux= new ArrayList();
            listaAux =  pe.listarEmpleados();
        }catch (BDException ex) {
            Logger.getLogger(FachadaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaAux;
    }

    public void fachaEmpleadoModificar(Empleado e) {
        pe.modificar(e);
    }
    
    public Empleado fachaEmpladoRet(Empleado e){
        Empleado ret = null;
        return ret = pe.retornoEmpleado(e);
    }
    
    public void fachaEmpleadoModificaHora(Empleado e){
        pe.modificaHoras(e);
    }
    /*public Integer numeroContrato(Empleado e){
        Empleado ret = pe.retornoEmpleado(e);
        return ret.getContrato().getNumeroContrato();
    }*/
}
