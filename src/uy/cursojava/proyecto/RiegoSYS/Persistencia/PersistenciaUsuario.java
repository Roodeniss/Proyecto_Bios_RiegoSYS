/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uy.cursojava.proyecto.RiegoSYS.Persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import uy.cursojava.proyecto.RiegoSYS.Logica.Usuario;

/**
 *
 * @author rodrigo denis, rodrigo silveria, bruno rasetti
 */
public class PersistenciaUsuario {

    private static final String SQL_CONSULTA_EXISTE_USUARIO = ("select * from  ");

    //paso 1 : crear la conexion a la base
    //paso 2 : crear el prepare statement
    //paso 3 : ejecutar la consulta del preparestatement
    //paso 4 : cargar los resultados en los objetos de la capa logical
    
    public Usuario exiUsuario(Usuario u) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Usuario resultado = null;

        try {

        } catch (Exception e) {

        }
        return resultado;
    }
}
