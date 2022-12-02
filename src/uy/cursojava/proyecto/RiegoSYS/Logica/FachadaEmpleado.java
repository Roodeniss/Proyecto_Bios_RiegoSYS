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
     
    public DefaultTableModel FachaEmpleadoListar(Empleado e) {
       DefaultTableModel retorno = new DefaultTableModel();
        try {
            ArrayList<Empleado> listaAux = new ArrayList();
            listaAux = pe.listarTodos(e);
            Empleado emAux = null;
            for (int i = 0; i < listaAux.size(); i++) {
                emAux = listaAux.get(i);
                String nombre = emAux.getNombre();
                String apellido = emAux.getApellido();
                String direcc = emAux.getDirecc();
                String email = emAux.getDirecc();
                Integer documento = emAux.getDocumento();
                Integer cel = emAux.getNumCel();
                Integer cuentaBanco = emAux.getCueBanPago();
                String banco = emAux.getBanco();
                Object[] data = {nombre, apellido, documento, direcc, email, cel, cuentaBanco, banco};
                retorno.addRow(data);
            }
        } catch (BDException ex) {
            Logger.getLogger(FachadaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }
}
