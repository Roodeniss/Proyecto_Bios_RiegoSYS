/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uy.cursojava.proyecto.RiegoSYS.Logica;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import uy.cursojava.proyecto.RiegoSYS.Excepciones.BDException;
import uy.cursojava.proyecto.RiegoSYS.Excepciones.PersistenciaException;
import uy.cursojava.proyecto.RiegoSYS.Persistencia.Conexion;
import uy.cursojava.proyecto.RiegoSYS.Persistencia.PresistenciaEmpleado;

/**
 *
 * @author rodrigodenis
 */
public class FachadaCliente {

    private static final String SQL_CONSULTA_EXISTE_CLIENTE = ("SELECT Cedula from Riego_SYS.Cliente WHERE Cedula=?");
    private static final String SQL_CONSULTA_INSERT_CLIENTE = ("INSERT INTO Riego_SYS.Cliente VALUES (?,?,?,?,?,?,?,?)");
    private static final String PS_DELETE_CLIENTE = ("DELETE FROM Riego_SYS.Cliente WHERE Cedula = ? ");

    public static void agregar(Empleado e) throws BDException {
        PreparedStatement ps = null;
        try {
            Connection con = Conexion.conectar();
            ps = con.prepareStatement(SQL_CONSULTA_INSERT_CLIENTE);
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
}
