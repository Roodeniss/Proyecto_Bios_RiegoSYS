/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uy.cursojava.proyecto.RiegoSYS.Logica;

import java.util.logging.Level;
import java.util.logging.Logger;
import uy.cursojava.proyecto.RiegoSYS.Excepciones.BDException;
import uy.cursojava.proyecto.RiegoSYS.Excepciones.ServicioNoValidoException;
import uy.cursojava.proyecto.RiegoSYS.Logica.Servicio;
import uy.cursojava.proyecto.RiegoSYS.Persistencia.PersistenciaServicio;


/**
 *
 * @author Rodrigo
 */
public class FachadaServicio {
    
    private PersistenciaServicio pe = new PersistenciaServicio();
   
    public void agregarServicio (Servicio servicio) throws ServicioNoValidoException {
            pe.agregar(servicio);
    
    }
}
