/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uy.cursojava.proyecto.RiegoSYS.Logica;

/**
 *
 * @author rodrigo denis, rodrigo silveria, bruno rasetti
 */
public class Persona {

    /*   Atributos    */
    private String nombre;
    private String apellido;
    private Integer documento;
    private String email;
    private Integer numCel;
    private String direcc;

    /*    Constructor      */
    public Persona(String nombre, String apellido, Integer documento, String email, Integer numCel, String direcc) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.email = email;
        this.numCel = numCel;
        this.direcc = direcc;
    }

    public Persona() {
        this.nombre = "";
        this.apellido = "";
        this.direcc = "";
        this.documento = 0;
        this.email = "";
        this.numCel = 0;
    }

    /*         getter y setter            */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getNumCel() {
        return numCel;
    }

    public void setNumCel(Integer numCel) {
        this.numCel = numCel;
    }

    public String getDirecc() {
        return direcc;
    }

    public void setDirecc(String direcc) {
        this.direcc = direcc;
    }

}
