/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uy.cursojava.proyecto.RiegoSYS.Sistema;

import java.util.ArrayList;
import uy.cursojava.proyecto.RiegoSYS.Logica.*;

/**
 *
 * @author rodrigo denis, rodrigo  silveria, bruno rasetti
 */
public class Sistema {
    private ArrayList<Empleado> listaEmpleado;
    private ArrayList<Servicio> listaServicio;
    private ArrayList<Cliente> listaCliente;
    private ArrayList<Usuario> listaUsuario;
    
    /*    gets    */

    public ArrayList<Empleado> getListaEmpleado() {
        return listaEmpleado;
    }

    public ArrayList<Servicio> getListaServicio() {
        return listaServicio;
    }

    public ArrayList<Cliente> getListaCliente() {
        return listaCliente;
    }

    public ArrayList<Usuario> getListaUsuario() {
        return listaUsuario;
    }
    
}
