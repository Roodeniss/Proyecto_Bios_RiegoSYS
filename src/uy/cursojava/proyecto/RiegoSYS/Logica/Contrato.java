/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uy.cursojava.proyecto.RiegoSYS.Logica;

/**
 *
 * @author rodrigo denis, rodrigo silveria, bruno rasetti
 */
public class Contrato {

    /*    atributos      */
    private String tipoContrato;
    private String tipoSalario;

    /*   Constructor     */
    public Contrato(String tipoC, String tipoS) {
        this.tipoContrato = tipoC;
        this.tipoSalario = tipoS;
    }

    public Contrato() {
        this.tipoContrato = "";
        this.tipoSalario = "";
    }

    /*
    tipoC y tipoS son enteros, 1 o 2, que idicarán el tipo de contrato y de salario, es
    decir que si tipoC = 1 el contrato será mensual y si tipoC = 2 será jornarelo.
    lo mismo para tipoS, si tipoS = 1 su sueldo será mensual y si tipoS = 2 su sueldo 
    será por quincena.
     */

 /*   Getter y setter     */
    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    public String getTipoSalario() {
        return tipoSalario;
    }

    public void setTipoSalario(String tipoSalario) {
        this.tipoSalario = tipoSalario;
    }

}
