/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uy.cursojava.proyecto.RiegoSYS.Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import uy.cursojava.proyecto.RiegoSYS.Excepciones.BDException;
import uy.cursojava.proyecto.RiegoSYS.Excepciones.PersistenciaException;
import uy.cursojava.proyecto.RiegoSYS.Logica.Contrato;
import uy.cursojava.proyecto.RiegoSYS.Logica.Empleado;

/**
 *
 * @author rodrigodenis
 */
public class PersistenciaContrato {

    private static final String SQL_CONSULTA_INSERT_CONTRATO = ("INSERT INTO riego_sys.contrato VALUES (?,?,?)");
    private static final String PS_DELETE_CONTRATO = ("DELETE FROM riego_sys.contrato WHERE documento = ? ");
    private static final String SQL_CONSULTA_SELECT_CONTRATO = ("SELECT * FROM riego_sys.contrato WHERE empleado=?");
    // private static final String SQL_CONSULTA_JOIN_EMPLEADO_CONTRATO = ("SELECT riego_sys.empleado.nombre, riego_sys.empleado.apellido, riego_sys.empleado.documento, riego_sys.empleado.email, riego_sys.empleado.cel, riego_sys.empleado.direccion, riego_sys.empleado.banco, riego_sys.empleado.cuentabanco FROM riego_sys.empleado LEFT JOIN riego_sys.contrato ON riego_sys.empleado.documento=riego_sys.contrato.empleado");

    public static void agregar(Contrato c) throws BDException {
        PreparedStatement ps = null;
        try {
            Connection con = Conexion.conectar();
            ps = con.prepareStatement(SQL_CONSULTA_INSERT_CONTRATO);
            ps.setInt(1, c.getEmpleado().getDocumento());
            ps.setString(2, c.getTipoContrato());
            ps.setString(3, c.getTipoSalario());
            ps.execute();
        } catch (SQLException ex) {
            throw new BDException(ex.getMessage());
        } catch (PersistenciaException ex) {
            Logger.getLogger(PresistenciaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
    }

    public static Contrato retContrato(Contrato c) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Contrato contratoRet = null;
        try {
            Empleado aux = new Empleado(c.getEmpleado().getDocumento());
            Empleado e = PresistenciaEmpleado.retornoEmpleado(aux);
            Connection con = Conexion.conectar();
            ps = (PreparedStatement) con.prepareStatement(SQL_CONSULTA_SELECT_CONTRATO);
            ps.setInt(1, c.getEmpleado().getDocumento());
            rs = ps.executeQuery();
            while (rs.next()) {
                contratoRet = new Contrato();
                contratoRet.setEmpleado(e);
                contratoRet.setTipoContrato(rs.getString("tipocontrato"));
                contratoRet.setTipoSalario(rs.getString("tiposalario"));
            }
        } catch (PersistenciaException ex) {
            Logger.getLogger(PresistenciaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(PresistenciaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
        return contratoRet;
    }

    public static void eliminar(Integer cedula) throws BDException {
        PreparedStatement ps = null;
        Connection con = null;
        try {
            con = Conexion.conectar();
            ps = con.prepareStatement(PS_DELETE_CONTRATO);
            ps.setInt(1, cedula);
            int cambios = ps.executeUpdate();
            if (cambios != 1) {
                throw new BDException("No se encontró el contrato ");
            }
        } catch (SQLException | BDException e) {
            throw new BDException("Error al borrar el contrato.");
        } catch (PersistenciaException ex) {
            Logger.getLogger(PresistenciaEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
    }
}
