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

/**
 *
 * @author rodrigodenis, rodrigo silveria, bruno rasetti
 */
public class Conexion {
    
    public static Connection conectar(){
        Connection con  = null;
        try{
            Class.forName("com.mysql.¡dbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Riego_SYS", "root" ,"password" );
            
        }catch(SQLException sql){
           
        }catch(ClassNotFoundException ClassNotF){
            
        }catch(InstantiationException InsExc){
            
        }catch(IllegalAccessException IllegalAccesExc){
            
        }
        return con;
    }
   
}
