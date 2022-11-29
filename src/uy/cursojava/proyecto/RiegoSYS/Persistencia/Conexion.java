/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uy.cursojava.proyecto.RiegoSYS.Persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import uy.cursojava.proyecto.RiegoSYS.Excepciones.BDException;
import uy.cursojava.proyecto.RiegoSYS.Excepciones.PersistenciaException;

/**
 * ß
 *
 * @author rodrigodenis, rodrigo silveria, bruno rasetti
 */
public class Conexion {

    public static Connection conectar() throws PersistenciaException {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Riego_SYS?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "password");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            throw new PersistenciaException("No encontre el driver de BASE DE DATOS");

        } catch (InstantiationException exInst) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, exInst);
            throw new PersistenciaException("No encontre instanciacion  BASE DE DATOS");
        } catch (IllegalAccessException exIllegal) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, exIllegal);
            throw new PersistenciaException("Acceso ilegal a la BASE DE DATOS");
        } catch (SQLException eSql) {
            throw new PersistenciaException(" REVISA EL SQL la BASE DE DATOS");
        }
        return con;
    }

    static Connection getConnection() throws SQLException, BDException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
