/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uy.cursojava.proyecto.RiegoSYS.Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import uy.cursojava.proyecto.RiegoSYS.Excepciones.BDException;
import uy.cursojava.proyecto.RiegoSYS.Logica.Empleado;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import uy.cursojava.proyecto.RiegoSYS.Excepciones.EmpleadoNoValidoException;
import uy.cursojava.proyecto.RiegoSYS.Excepciones.PersistenciaException;

/**
 *
 * @author rodrigodenis
 */
public class PresistenciaEmpleado {

    private static final String SQL_CONSULTA_EXISTE_EMPLEADO = ("SELECT Cedula from Riego_SYS.Empleado WHERE Cedula=?");
    private static final String SQL_CONSULTA_INSERT_EMPLEADO = ("INSERT INTO Riego_SYS.Empleado VALUES (?,?,?,?,?,?,?,?)");
    private static final String PS_DELETE_EMPLEADO = ("DELETE FROM Riego_SYS.Empleado WHERE Cedula = ? ");
    private static final String PS_SELECT_EMPLEADO_ALL = ("SELECT * FROM Riego_SYS.Empleado WHERE Nombre = ?");
// private static final String SQL_CONSULTA_MODIFICACION_EMPLEADO = (" ");
    
//paso 1 : crear la conexion a la base
    //paso 2 : crear el prepare statement
    //paso 3 : ejecutar la consulta del preparestatement
    //paso 4 : cargar los resultados en los objetos de la capa logical
    public Empleado existeEmpleado(Empleado e) throws EmpleadoNoValidoException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Empleado empleadoRes = null;
        try {
            Connection con = Conexion.conectar();
            ps = (PreparedStatement) con.prepareStatement(SQL_CONSULTA_EXISTE_EMPLEADO);
            ps.setString(1, e.getDocumento().toString());
            rs = ps.executeQuery();

            while (rs.next()) {
                empleadoRes = new Empleado();
                empleadoRes.setDocumento(Integer.parseInt(rs.getString("Cedula")));
            }
        } catch (SQLException ex) {
            throw new EmpleadoNoValidoException("Tuve un problemita en la base, sql");
        } catch (Exception ex) {
            throw new EmpleadoNoValidoException("Tuve un problemita en la base");
        }
        if (empleadoRes == null) {
            throw new EmpleadoNoValidoException("Los datos ingresados no son correctos, verifique y vuelva a intentar. Gracias");
        }
        return empleadoRes;
    }

    public static void agregar(Empleado e) throws BDException {
        PreparedStatement ps = null;
        try {
            Connection con = Conexion.conectar();
            ps = con.prepareStatement(SQL_CONSULTA_INSERT_EMPLEADO);
            ps.setString(1, e.getDocumento().toString());
            ps.setString(2, e.getNombre());
            ps.setString(3, e.getApellido());
            ps.setInt(4, e.getNumCel());
            ps.setString(5, e.getDirecc());
            ps.setString(6, e.getBanco());
            ps.setString(7, e.getCueBanPago().toString());
            ps.setString(8, e.getEmail());
            ps.execute();
        } catch (SQLException ex) {
            throw new BDException(ex.getMessage());
        } catch (PersistenciaException ex) {
            Logger.getLogger(PresistenciaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
    }

    public static ArrayList<Empleado> listarTodos(Empleado empleado) throws BDException {
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;
        ArrayList<Empleado> listaEmpleado = new ArrayList();
        try {
            con = Conexion.conectar();
            ps = con.prepareStatement(PS_SELECT_EMPLEADO_ALL);
            ps.setString(1, empleado.getNombre());
            rs = ps.executeQuery();
            while (rs.next()) {
                Integer cedula = rs.getInt("Cedula");
                String nombre = rs.getString("Nombre");
                String apellido = rs.getString("Apellido");
                Integer celular = rs.getInt("Celular");
                String direcc = rs.getString("Direccion");
                String banco = rs.getString("Banco");
                Integer cuentaBanco = rs.getInt("CuentaBanco");
                String email = rs.getString("Email");
                Empleado e = new Empleado(banco, cuentaBanco);
                e.setDocumento(cedula);
                e.setNombre(nombre);
                e.setApellido(apellido);
                e.setNumCel(celular);
                e.setDirecc(direcc);
                e.setEmail(email);
                listaEmpleado.add(e);
            }
        } catch (SQLException ex) {
            throw new BDException("Error al obtener los datos de los Empleados.");
        } catch (PersistenciaException ex) {
            Logger.getLogger(PresistenciaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
        return listaEmpleado;
    }

    public static void eliminar(Integer cedula) throws BDException {
        PreparedStatement ps = null;
        Connection con = null;
        try {
            con = Conexion.conectar();
            ps = con.prepareStatement(PS_DELETE_EMPLEADO);
            ps.setInt(1, cedula);
            int cambios = ps.executeUpdate();
            if (cambios != 1) {
                throw new BDException("No se encontró el empleado de cedula: " + cedula);
            }
        } catch (SQLException | BDException e) {
            throw new BDException("Error al borrar el empleado.");
        } catch (PersistenciaException ex) {
            Logger.getLogger(PresistenciaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }

    }

}
