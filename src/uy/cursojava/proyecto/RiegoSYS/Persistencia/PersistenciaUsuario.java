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
 * @author rodrigodenis
 */
public class PersistenciaUsuario {
     private static final String SQL_CONSULTA_EXISTE_USUARIO =("select * from  ");
   
    
    public Usuario exiUsuario(Usuario u){
        PreparedStatement ps = null;
        ResultSet rs = null;
        Usuario resultado = null;
        
        try{
           
        }catch(Exception e){
            
        }
    }
}
