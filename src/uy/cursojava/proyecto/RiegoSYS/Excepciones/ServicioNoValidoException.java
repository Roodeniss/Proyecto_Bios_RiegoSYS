/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uy.cursojava.proyecto.RiegoSYS.Excepciones;

/**
 *
 * @author Dorca
 */
public class ServicioNoValidoException extends Exception {
    
    
      
    public ServicioNoValidoException() {
    }

    /**
     * Constructs an instance of <code>UsuarioNoValidoException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ServicioNoValidoException(String msg) {
        super(msg);
    }
}
