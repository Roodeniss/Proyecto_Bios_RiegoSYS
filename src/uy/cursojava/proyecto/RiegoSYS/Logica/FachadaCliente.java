/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uy.cursojava.proyecto.RiegoSYS.Logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import uy.cursojava.proyecto.RiegoSYS.Excepciones.BDException;
import uy.cursojava.proyecto.RiegoSYS.Excepciones.ClienteNoValidoException;
import uy.cursojava.proyecto.RiegoSYS.Excepciones.PersistenciaException;
import uy.cursojava.proyecto.RiegoSYS.Persistencia.Conexion;
import uy.cursojava.proyecto.RiegoSYS.Persistencia.PersistenciaCliente;

/**
 *
 * @author rodrigodenis
 */
public class FachadaCliente {
    
      
    private PersistenciaCliente pc = new PersistenciaCliente();

    public Cliente fachaClienteExiste(Cliente c) throws ClienteNoValidoException {
        Cliente clienteRes = null;
        return clienteRes = pc.existeCliente(c);
    }
    
    
    public void FachaClienteAgregar(Cliente c) throws ClienteNoValidoException {
        try {
            pc.agregar(c);
        } catch (BDException ex) {
            Logger.getLogger(FachadaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
 public ArrayList<Cliente> fachaClienteListar(Cliente c) throws ClienteNoValidoException {
        ArrayList<Cliente> listaCli = null;
        try {
            listaCli = new ArrayList();
            listaCli = pc.listarTodos(c);
             } catch (BDException ex) {
            Logger.getLogger(FachadaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaCli;
    }
     public void fachaClienteEliminar(Cliente c) throws ClienteNoValidoException {
        try {
            pc.eliminar(c.getDocumento());
        } catch (BDException ex) {
            Logger.getLogger(FachadaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
     public void fachaClienteModificar(Cliente c) {
        pc.modificar(c);
    }
     public Cliente fachaClienteRet(Cliente c){
        Cliente ret = null;
        return ret = pc.retornoCliente(c);
    }
}