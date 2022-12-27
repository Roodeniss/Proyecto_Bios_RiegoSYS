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
import uy.cursojava.proyecto.RiegoSYS.Excepciones.ClienteNoValidoException;
import uy.cursojava.proyecto.RiegoSYS.Excepciones.PersistenciaException;
import uy.cursojava.proyecto.RiegoSYS.Logica.Cliente;

/**
 *
 * @author rodrigodenis
 */
public class PersistenciaCliente {

    private static final String SQL_CONSULTA_EXISTE_CLIENTE = ("SELECT documento from riego_sys.cliente WHERE documento=?");
    private static final String SQL_CONSULTA_INSERT_CLIENTE = ("INSERT INTO riego_sys.cliente VALUES (?,?,?,?,?,?)");
    private static final String PS_DELETE_CLIENTE = ("DELETE FROM riego_sys.cliente WHERE documento = ? ");
    private static final String PS_SELECT_CLIENTE_ALL = ("SELECT * FROM riego_sys.cliente WHERE nombre = ?");
    private static final String SQL_CONSULTA_MODIFICACION_CLIENTE = ("UPDATE riego_sys.cliente SET cel = ?,email = ?,direccion = ? WHERE documento = ?");
    private static final String SQL_CONSULTA_SELECT_CLIENTE = ("SELECT * FROM riego_sys.cliente WHERE documento=?");
//paso 1 : crear la conexion a la base
    //paso 2 : crear el prepare statement
    //paso 3 : ejecutar la consulta del preparestatement
    //paso 4 : cargar los resultados en los objetos de la capa logical
    // jaja no funciona

    public static Cliente existeCliente(Cliente e) throws ClienteNoValidoException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Cliente clienteRes = null;
        try {
            Connection con = Conexion.conectar();
            ps = (PreparedStatement) con.prepareStatement(SQL_CONSULTA_EXISTE_CLIENTE);
            ps.setString(1, e.getDocumento().toString());
            rs = ps.executeQuery();

            while (rs.next()) {
                clienteRes = new Cliente();
                clienteRes.setDocumento(Integer.parseInt(rs.getString("cedula")));
            }
        } catch (SQLException ex) {
            throw new ClienteNoValidoException("Tuve un problemita en la base, sql");
        } catch (Exception ex) {
            throw new ClienteNoValidoException("Tuve un problemita en la base");
        }
        if (clienteRes == null) {
            throw new ClienteNoValidoException("Los datos ingresados no son correctos, verifique y vuelva a intentar. Gracias");
        }
        return clienteRes;
    }

    public static Cliente retornoCliente(Cliente c) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Cliente clienteRet = null;
        try {
            Connection con = Conexion.conectar();
            ps = (PreparedStatement) con.prepareStatement(SQL_CONSULTA_SELECT_CLIENTE);
            ps.setInt(1, c.getDocumento());
            rs = ps.executeQuery();
            while (rs.next()) {
                clienteRet = new Cliente();
                clienteRet.setNombre(rs.getString("nombre"));
                clienteRet.setApellido(rs.getString("apellido"));
                clienteRet.setDocumento(rs.getInt("documento"));
                clienteRet.setNumCel(rs.getInt("cel"));
                clienteRet.setDirecc(rs.getString("direccion"));
                clienteRet.setEmail(rs.getString("email"));
            }
        } catch (PersistenciaException ex) {
            Logger.getLogger(PersistenciaCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PersistenciaCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clienteRet;
    }

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
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                Integer cedula = rs.getInt("documento");
                String direcc = rs.getString("direccion");
                String email = rs.getString("email");
                Integer celular = rs.getInt("cel");
                Cliente c = new Cliente();
                c.setNombre(nombre);
                c.setApellido(apellido);
                c.setDocumento(cedula);
                c.setNumCel(celular);
                c.setEmail(email);
                c.setDirecc(direcc);
                listaCliente.add(c);
            }
        } catch (SQLException ex) {
            throw new BDException("Error al obtener los datos de los Cliente.");
        } catch (PersistenciaException ex) {
            Logger.getLogger(PersistenciaCliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
        return listaCliente;
    }

    public static void agregar(Cliente c) throws BDException {
        PreparedStatement ps = null;
        try {
            Connection con = Conexion.conectar();
            ps = con.prepareStatement(SQL_CONSULTA_INSERT_CLIENTE);
            ps.setString(1, c.getNombre());
            ps.setString(2, c.getApellido());
            ps.setInt(3, c.getDocumento());
            ps.setInt(4, c.getNumCel());
            ps.setString(5, c.getEmail());
            ps.setString(6, c.getDirecc());

            ps.execute();
        } catch (SQLException ex) {
            ex.printStackTrace();
            throw new BDException(ex.getMessage());
        } catch (PersistenciaException ex) {
            Logger.getLogger(PersistenciaCliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
    }

    public static void eliminar(Integer documento) throws BDException {
        PreparedStatement ps = null;
        Connection con = null;
        try {
            con = Conexion.conectar();
            ps = con.prepareStatement(PS_DELETE_CLIENTE);
            ps.setInt(1, documento);
            int cambios = ps.executeUpdate();
            if (cambios != 1) {
                throw new BDException("No se encontró el cliente de cedula: " + documento);
            }
        } catch (SQLException | BDException e) {
            throw new BDException("Error al borrar el cliente.");
        } catch (PersistenciaException ex) {
            Logger.getLogger(PersistenciaCliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
    }

    public static void modificar(Cliente cliente) {
        PreparedStatement ps = null;
        Connection con = null;
        try {
            con = Conexion.conectar();
            ps = con.prepareStatement(SQL_CONSULTA_MODIFICACION_CLIENTE);
            ps.setInt(1, cliente.getNumCel());
            ps.setString(2, cliente.getEmail());
            ps.setString(3, cliente.getDirecc());
            ps.setInt(4, cliente.getDocumento());
            ps.executeUpdate();
        } catch (SQLException e) {
            // throw new BDException(e.getMessage());
        } catch (PersistenciaException ex) {
            Logger.getLogger(PersistenciaCliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
    }
}
