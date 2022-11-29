/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uy.cursojava.proyecto.RiegoSYS.Logica;

import uy.cursojava.proyecto.RiegoSYS.Excepciones.UsuarioNoValidoException;
import uy.cursojava.proyecto.RiegoSYS.Persistencia.PersistenciaUsuario;

/**
 *
 * @author rodrigo denis, rodrigo silveira, bruno rasetti
 */
public class FachadaUsuario {

    public Usuario fachadaUsuario(Usuario u) throws UsuarioNoValidoException {
        PersistenciaUsuario pu = new PersistenciaUsuario();
        Usuario usuarioRes = null;
        return usuarioRes = pu.existeUsuario(u);
    }
}
