/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uy.cursojava.proyecto.RiegoSYS.Logica;

import java.util.logging.Level;
import java.util.logging.Logger;
import uy.cursojava.proyecto.RiegoSYS.Excepciones.BDException;
import uy.cursojava.proyecto.RiegoSYS.Excepciones.ContraroNoValidoException;
import uy.cursojava.proyecto.RiegoSYS.Persistencia.PersistenciaContrato;


/**
 *
 * @author rodrigodenis
 */
public class FachadaContrato {
    PersistenciaContrato pc = new PersistenciaContrato();
    
     public void fachaContratoAgregar(Contrato c) throws ContraroNoValidoException {
        try {
            pc.agregar(c);
        } catch (BDException ex) {
            Logger.getLogger(FachadaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    public Contrato fachaRetornoContrato(Contrato c){
        return pc.retContrato(c);
    }
     
    public void fachaContratoEliminar(Integer cedula){
        try {
            pc.eliminar(cedula);
        } catch (BDException ex) {
            Logger.getLogger(FachadaContrato.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
