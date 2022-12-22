/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uy.cursojava.proyecto.RiegoSYS.Persistencia;

import java.sql.Connection;
import java.sql.Date;
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
public class PersistenciaEmpleado {

    private static final String SQL_CONSULTA_EXISTE_EMPLEADO = ("SELECT documento FROM riego_sys.empleado WHERE documento=?");
    private static final String SQL_CONSULTA_INSERT_EMPLEADO = ("INSERT INTO riego_sys.empleado VALUES (?,?,?,?,?,?,?,?,?,?,?)");
    private static final String PS_DELETE_EMPLEADO = ("DELETE FROM riego_sys.empleado WHERE documento = ? ");
    private static final String PS_SELECT_EMPLEADO_ALL = ("SELECT * FROM riego_sys.empleado WHERE nombre = ?");
    private static final String PS_SELECT_EMPLEADO = ("SELECT * FROM riego_sys.empleado");
    private static final String SQL_CONSULTA_MODIFICACION_EMPLEADO = ("UPDATE riego_sys.empleado SET cel = ?,direccion = ?, banco=?, cuentabanco=?, email=? WHERE documento=?");
    private static final String SQL_CONSULTA_SELECT_EMPLEADO = ("SELECT * FROM riego_sys.empleado WHERE documento=?");
    private static final String SQL_CONSULTA_MODIFICACION_EMPLEADO_HORA = ("UPDATE riego_sys.empleado SET  horatrabajo=?, horaextra=?, sueldo=?  WHERE documento = ?");

    //paso 1 : crear la conexion a la base
    //paso 2 : crear el prepare statement
    //paso 3 : ejecutar la consulta del preparestatement
    //paso 4 : cargar los resultados en los objetos de la capa logical
    public static Empleado existeEmpleado(Empleado e) throws EmpleadoNoValidoException {
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
                empleadoRes.setDocumento(Integer.parseInt(rs.getString("cedula")));
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

    public static Empleado retornoEmpleado(Empleado e) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Empleado empleadoRet = null;
        try {
            Connection con = Conexion.conectar();
            ps = (PreparedStatement) con.prepareStatement(SQL_CONSULTA_SELECT_EMPLEADO);
            ps.setInt(1, e.getDocumento());
            rs = ps.executeQuery();
            while (rs.next()) {
                empleadoRet = new Empleado();
                empleadoRet.setNombre(rs.getString("nombre"));
                empleadoRet.setApellido(rs.getString("apellido"));
                empleadoRet.setDocumento(rs.getInt("documento"));
                empleadoRet.setBanco(rs.getString("banco"));
                empleadoRet.setNumCel(rs.getInt("cel"));
                empleadoRet.setDirecc(rs.getString("direccion"));
                empleadoRet.setCueBanPago(rs.getInt("cuentabanco"));
                empleadoRet.setEmail(rs.getString("email"));
            }
        } catch (PersistenciaException ex) {
            Logger.getLogger(PersistenciaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PersistenciaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return empleadoRet;
    }

    public static void agregar(Empleado e) throws BDException {
        PreparedStatement ps = null;
        try {
            Connection con = Conexion.conectar();
            ps = con.prepareStatement(SQL_CONSULTA_INSERT_EMPLEADO);
            ps.setString(1, e.getNombre().toLowerCase());
            ps.setString(2, e.getApellido());
            ps.setString(3, e.getDocumento().toString());
            ps.setString(4, e.getEmail());
            ps.setInt(5, e.getNumCel());
            ps.setString(6, e.getDirecc());
            ps.setString(7, e.getBanco());
            ps.setString(8, e.getCueBanPago().toString());
            ps.setLong(9, e.getHoraTrabajo());
            ps.setLong(10, e.getHoraExtra());
            ps.setLong(11, e.getSueldo());
            //     ps.setObject(9, e.getContrato());
            ps.execute();
        } catch (SQLException ex) {
            throw new BDException(ex.getMessage());
        } catch (PersistenciaException ex) {
            Logger.getLogger(PersistenciaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
    }
    
    public static ArrayList<Empleado> listarEmpleados() throws BDException{
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;
        ArrayList<Empleado> listaEmpleado = new ArrayList();
        try {
            con = Conexion.conectar();
            ps = con.prepareStatement(PS_SELECT_EMPLEADO);
            rs = ps.executeQuery();
            while (rs.next()) {
                Integer cedula = rs.getInt("documento");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                Integer celular = rs.getInt("cel");
                String direcc = rs.getString("direccion");
                String banco = rs.getString("banco");
                Integer cuentaBanco = rs.getInt("cuentabanco");
                String email = rs.getString("email");
                Long sueldo = rs.getLong("sueldo");
                Empleado e = new Empleado(banco, cuentaBanco);
                e.setDocumento(cedula);
                e.setNombre(nombre);
                e.setApellido(apellido);
                e.setNumCel(celular);
                e.setDirecc(direcc);
                e.setEmail(email);
                e.setSueldo(sueldo);
                listaEmpleado.add(e);
            }
        } catch (SQLException ex) {
            throw new BDException("Error al obtener los datos de los Empleados.");
        } catch (PersistenciaException ex) {
            Logger.getLogger(PersistenciaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
        return listaEmpleado;
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
                Integer cedula = rs.getInt("documento");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                Integer celular = rs.getInt("cel");
                String direcc = rs.getString("direccion");
                String banco = rs.getString("banco");
                Integer cuentaBanco = rs.getInt("cuentabanco");
                String email = rs.getString("email");
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
            Logger.getLogger(PersistenciaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
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
            Logger.getLogger(PersistenciaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
    }

    public static void modificar(Empleado empleado) {
        PreparedStatement ps = null;
        Connection con = null;
        try {
            con = Conexion.conectar();
            ps = con.prepareStatement(SQL_CONSULTA_MODIFICACION_EMPLEADO);
            ps.setInt(1, empleado.getNumCel());
            ps.setString(2, empleado.getDirecc());
            ps.setString(3, empleado.getBanco());
            ps.setInt(4, empleado.getCueBanPago());
            ps.setString(5, empleado.getEmail());
            ps.setInt(6, empleado.getDocumento());
            ps.executeUpdate();
        } catch (SQLException e) {
            // throw new BDException(e.getMessage());
        } catch (PersistenciaException ex) {
            Logger.getLogger(PersistenciaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
    }

    public static void modificaHoras(Empleado empleado) {
        PreparedStatement ps = null;
        Connection con = null;
        try {
            con = Conexion.conectar();
            ps = con.prepareStatement(SQL_CONSULTA_MODIFICACION_EMPLEADO_HORA);
            ps.setLong(1, empleado.getHoraTrabajo());
            ps.setLong(2, empleado.getHoraExtra());
            ps.setLong(3, empleado.getSueldo());
            ps.setInt(4, empleado.getDocumento());
            ps.executeUpdate();
        } catch (SQLException e) {
            // throw new BDException(e.getMessage());
        } catch (PersistenciaException ex) {
            Logger.getLogger(PersistenciaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
    }
}
