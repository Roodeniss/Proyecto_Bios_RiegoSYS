/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uy.cursojava.proyecto.RiegoSYS.Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import uy.cursojava.proyecto.RiegoSYS.Excepciones.BDException;
import uy.cursojava.proyecto.RiegoSYS.Excepciones.PersistenciaException;
import uy.cursojava.proyecto.RiegoSYS.Excepciones.ServicioNoValidoException;
import uy.cursojava.proyecto.RiegoSYS.Logica.Persona;
import uy.cursojava.proyecto.RiegoSYS.Logica.Servicio;
import uy.cursojava.proyecto.RiegoSYS.Persistencia.Conexion;

/**
 *
 * @author Rodrigo
 */
public class PersistenciaServicio {

    private static final String SQL_CONSULTA_EXISTE_SERVICIO = ("select * from riego_sys.servicio where Empleado=? and Cliente=? ");
    private static final String SQL_CONSULTA_INSERT_SERVICIO = ("INSERT INTO riego_sys.servicio VALUES (?,?,?,?)");

    //public Servicio existePersona(Persona p) throws  ServicioNoValidoException {
    //PreparedStatement ps = null;
    //ResultSet rs = null;
    //Servicio servicioRes = null;
    // try {
    // Connection con = Conexion.conectar();
    //ps = (PreparedStatement) con.prepareStatement(SQL_CONSULTA_EXISTE_SERVICIO);
    //ps.setInt(1, p.getDocumento());
    //ps.setInt(2, p.getDocumento());
    //rs = ps.executeQuery();
    //while (rs.next()) {
    //  servicioRes = new Servicio();
    // servicioRes.setEmpleado(rs.getInt("Empleado"));
    // servicioRes.setCliente(rs.getInt("Cliente"));
    //}
    //} catch (SQLException e) {
    //throw new ServicioNoValidoException("Tuve un problemita en la base");
    //} catch (Exception e) {
    //throw new ServicioNoValidoException("Tuve un problemita en la base");
    //}
    // if (servicioRes == null) {
    //   throw new ServicioNoValidoException("Los datos ingresados no son correctos, verifique y vuelva a intentar. Gracias");
    //}
    // return servicioRes;
    //}
    public void agregar(Servicio servicio) throws ServicioNoValidoException {

        PreparedStatement ps = null;
        try {
            Connection con = Conexion.conectar();
            ps = con.prepareStatement(SQL_CONSULTA_INSERT_SERVICIO);
            ps.setInt(1, servicio.getEmpleado().getDocumento());
            ps.setInt(2, servicio.getCliente().getDocumento());

            //convertir la fecha de String a Date
            String fechaSer = servicio.getFecha();

            /*
            String fechaSerAux = servicio.getFecha();           
            // 2022-12-04
            // "01/12/2022"
            String[] vec = fechaSerAux.split("-");
            String fechaSer = vec[2]+"/"+vec[1]+"/"+vec[0];
            */
            
            SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");
            Date parsed = format.parse(fechaSer);
            java.sql.Date sqlFecha = new java.sql.Date(parsed.getTime());
            ps.setDate(3, sqlFecha);
            ps.setString(4, servicio.getTipoServicio());
            ps.execute();
        } catch (SQLException ex) {
            throw new ServicioNoValidoException("No pude instertar el servicio , perdon ");
        } catch (PersistenciaException ex) {
            Logger.getLogger(PersistenciaServicio.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex) {
            Logger.getLogger(PersistenciaServicio.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }

    }

}
