/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uy.cursojava.proyecto.RiegoSYS.Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import uy.cursojava.proyecto.RiegoSYS.Excepciones.UsuarioNoValidoException;
import uy.cursojava.proyecto.RiegoSYS.Logica.Usuario;

/**
 *
 * @author rodrigo denis, rodrigo silveria, bruno rasetti
 */
public class PersistenciaUsuario {

    private static final String SQL_CONSULTA_EXISTE_USUARIO = ("select * from Riego_SYS.Usuario where Usuario=? and clave=? ");

    //paso 1 : crear la conexion a la base
    //paso 2 : crear el prepare statement
    //paso 3 : ejecutar la consulta del preparestatement
    //paso 4 : cargar los resultados en los objetos de la capa logical
    
    public Usuario existeUsuario(Usuario u) throws UsuarioNoValidoException {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Usuario usuarioRes = null;

        try {
            Connection con = Conexion.conectar();
            ps = (PreparedStatement) con.prepareStatement(SQL_CONSULTA_EXISTE_USUARIO);
            ps.setString(1, u.getNombreUsuario());
            ps.setString(2, u.getClave());
            rs = ps.executeQuery();

            while (rs.next()) {
                usuarioRes = new Usuario();
                usuarioRes.setNombreUsuario(rs.getString("Usuario"));
                usuarioRes.setClave(rs.getString("clave"));
            }

        } catch (SQLException e) {
            throw new UsuarioNoValidoException("Tuve un problemita en la base, sql");

        } catch (Exception e) {
            throw new UsuarioNoValidoException("Tuve un problemita en la base");
        }
        if (usuarioRes == null) {
            throw new UsuarioNoValidoException("Los datos ingresados no son correctos, verifique y vuelva a intentar. Gracias");
        }
        return usuarioRes;
    }
}
