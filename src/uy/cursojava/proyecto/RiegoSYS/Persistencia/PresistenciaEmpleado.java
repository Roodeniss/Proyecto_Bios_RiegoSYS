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
import uy.cursojava.proyecto.RiegoSYS.Excepciones.EmpleadoNoValidoException;

/**
 *
 * @author rodrigodenis
 */
public class PresistenciaEmpleado {

    private static final String SQL_CONSULTA_EXISTE_EMPLEADO = ("SELECT Cedula from Riego_SYS.Empleado WHERE Cedula=? ");
    private static final String SQL_CONSULTA_INSERT_EMPLEADO = ("INSERT INTO Riego_SYS.Empleado (Cedula, Nombre, Apellido, Celular, Direccion, Banco, CuentaBanco, Email)" + "VALUES (?,?,?,?,?,?,?,?)");
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
        Connection con = null;
        try {
            con = Conexion.getConnection();
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
        } catch (SQLException | BDException ex) {
            throw new BDException(ex.getMessage());
        } finally {

        }
    }

}
