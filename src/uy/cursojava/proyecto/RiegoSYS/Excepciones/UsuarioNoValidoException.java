/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package uy.cursojava.proyecto.RiegoSYS.Excepciones;

/**
 *
 * @author rodrigo denis, rodrigo silveira, bruno rasetti
 */
public class UsuarioNoValidoException  extends Exception{

    /**
     * Creates a new instance of <code>UsuarioNoValidoException</code> without
     * detail message.
     */
    public UsuarioNoValidoException() {
    }

    /**
     * Constructs an instance of <code>UsuarioNoValidoException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public UsuarioNoValidoException(String msg) {
        super(msg);
    }
}
