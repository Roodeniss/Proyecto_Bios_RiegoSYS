/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uy.cursojava.proyecto.RiegoSYS.Excepciones;

/**
 *
 * @author rodrigodenis
 */
public class EmpleadoNoValidoException extends Exception {
      /**
     * Creates a new instance of <code>UsuarioNoValidoException</code> without
     * detail message.
     */
    public EmpleadoNoValidoException() {
    }

    /**
     * Constructs an instance of <code>UsuarioNoValidoException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public EmpleadoNoValidoException(String msg) {
        super(msg);
    }
}

