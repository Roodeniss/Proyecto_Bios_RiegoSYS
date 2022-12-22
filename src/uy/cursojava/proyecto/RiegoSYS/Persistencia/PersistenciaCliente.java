/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uy.cursojava.proyecto.RiegoSYS.Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import uy.cursojava.proyecto.RiegoSYS.Excepciones.BDException;
import uy.cursojava.proyecto.RiegoSYS.Excepciones.PersistenciaException;
import uy.cursojava.proyecto.RiegoSYS.Logica.Cliente;

/**
 *
 * @author rodrigodenis
 */
public class PersistenciaCliente {
    
    private static final String SQL_CONSULTA_EXISTE_CLIENTE = ("SELECT Cedula from Riego_SYS.Cliente WHERE Cedula=?");
    private static final String SQL_CONSULTA_INSERT_CLIENTE = ("INSERT INTO Riego_SYS.Cliente VALUES (?,?,?,?,?,?,?,?)");
    private static final String PS_DELETE_CLIENTE = ("DELETE FROM Riego_SYS.Cliente WHERE Cedula = ? ");
    private static final String PS_SELECT_CLIENTE_ALL = ("SELECT * FROM Riego_SYS.Cliente WHERE Nombre = ?");
    
    //paso 1 : crear la conexion a la base
    //paso 2 : crear el prepare statement
    //paso 3 : ejecutar la consulta del preparestatement
    //paso 4 : cargar los resultados en los objetos de la capa logical
    
    public static ArrayList<Cliente> listarTodos(Cliente cliente) throws BDException {
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;
        ArrayList<Cliente> listaCliente = new ArrayList();
        try {
            con = Conexion.conectar();
            ps = con.prepareStatement(PS_SELECT_CLIENTE_ALL);
            ps.setString(1, cliente.getNombre());
            rs = ps.executeQuery();
            while (rs.next()) {
                Integer cedula = rs.getInt("Cedula");
                String nombre = rs.getString("Nombre");
                String apellido = rs.getString("Apellido");
                Integer celular = rs.getInt("Celular");
                String direcc = rs.getString("Direccion");
                String email = rs.getString("Email");
                Cliente c =  new Cliente();
               c.setApellido(apellido);
               c.setDirecc(direcc);
               c.setDocumento(cedula);
               c.setEmail(email);
               c.setNombre(nombre);
               c.setNumCel(celular);
               listaCliente.add(c);
            }
        } catch (SQLException ex) {
            throw new BDException("Error al obtener los datos de los Cliente.");
        } catch (PersistenciaException ex) {
            Logger.getLogger(PersistenciaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
        return listaCliente;
    }
    
    public static void agregar(Cliente c) throws BDException {
        PreparedStatement ps = null;
        try {
            Connection con = Conexion.conectar();
            ps = con.prepareStatement(SQL_CONSULTA_INSERT_CLIENTE);
            ps.setString(3, c.getDocumento().toString());
            ps.setString(1, c.getNombre());
            ps.setString(2, c.getApellido());
            ps.setInt(5, c.getNumCel());
            ps.setString(6, c.getDirecc());
            ps.setString(4, c.getEmail());
            ps.execute();
        } catch (SQLException ex) {
            throw new BDException(ex.getMessage());
        } catch (PersistenciaException ex) {
            Logger.getLogger(PersistenciaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
    }
}
