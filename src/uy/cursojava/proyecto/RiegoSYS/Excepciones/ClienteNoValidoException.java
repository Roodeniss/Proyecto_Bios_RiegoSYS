/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uy.cursojava.proyecto.RiegoSYS.Excepciones;

/**
 *
 * @author rodrigodenis
 */
public class ClienteNoValidoException extends Exception {
      /**
     * Creates a new instance of <code>PersistenciaException</code> without
     * detail message.
     */
    public ClienteNoValidoException() {
    }

    /**
     * Constructs an instance of <code>PersistenciaException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ClienteNoValidoException(String msg) {
        super(msg);
    }
}
