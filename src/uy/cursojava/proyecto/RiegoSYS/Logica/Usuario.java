/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uy.cursojava.proyecto.RiegoSYS.Logica;

/**
 *
 * @author rodrigo denis, rodrigo  silveria, bruno rasetti
 */
public class Usuario {
    /*    Atributos   */
    private String id;
    private String contra;
    
    /*  constructores   */

    public Usuario(String id, String contra) {
        this.id = id;
        this.contra =  contra;
    }
    
    public Usuario(){
        this.id = " ";
        this.contra= " ";
    }
    
    /*  getters y setters   */

    public String getNombreUsuario() {
        return id;
    }

    public void getNombreUsuario(String id) {
        this.id = id;
    }

    public String getClave() {
        return contra;
    }

    public void getClave(String contra) {
        this.contra = contra;
    }

    public void setNombreUsuario(String id) {
        this.id = id;
    }

    public void setClave(String contra) {
        this.contra = contra;
    }
    
    
    
    
}
