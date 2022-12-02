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
    
    private PersistenciaCliente pe = new PersistenciaCliente();

    public void FachaClienteAgregar(Cliente c) throws ClienteNoValidoException {
        try {
            pe.agregar(c);
        } catch (BDException ex) {
            Logger.getLogger(FachadaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
 public DefaultListModel FachaClienteListar(Cliente c) {
       DefaultListModel<Cliente> retorno = new DefaultListModel();
        try {
            ArrayList<Cliente> listaAux = new ArrayList();
            listaAux = pe.listarTodos(c);
            for (int i = 0; i < listaAux.size(); i++) {
                retorno.addElement(listaAux.get(i));
            }
        } catch (BDException ex) {
            Logger.getLogger(FachadaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return retorno;
    }
    
}
