/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uy.cursojava.proyecto.RiegoSYS.Logica;

/**
 *
 * @author rodrigo denis, rodrigo silveria, bruno rasetti
 */
public class Empleado extends Persona {

    /*    Aatributos      */
    private String banco;
    private Integer cueBanPago;
    private Long horaTrabajo;
    private Long horaExtra;
    private Contrato contrato;
    private Long sueldo;

    /*    constructores     */
    public Empleado(String banco, Integer cueBanPago) {
        this.banco = banco;
        this.cueBanPago = cueBanPago;
    }

    public Empleado(Integer documento){
        this.setDocumento(documento);
    }
    
    public Empleado() {
        this.banco = "";
        this.contrato = null;
        this.cueBanPago = 0;
        this.sueldo = 0l;
        this.horaExtra = 0l;
        this.horaTrabajo = 0l;
    }

    /*      getter y setter   */
    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public Integer getCueBanPago() {
        return cueBanPago;
    }

    public void setCueBanPago(Integer cueBanPago) {
        this.cueBanPago = cueBanPago;
    }

    public Long getHoraTrabajo() {
        return horaTrabajo;
    }

    public void setHoraTrabajo(Long horaTrabajo) {
        this.horaTrabajo = horaTrabajo;
    }

    public Long getHoraExtra() {
        return horaExtra;
    }

    public void setHoraExtra(Long horaExtra) {
        this.horaExtra = horaExtra;
    }

    public Long getSueldo() {
        return sueldo;
    }

    public void setSueldo(Long sueldo) {
        this.sueldo = sueldo;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    @Override
    public String toString() {
        return this.getDocumento() + " " + this.getApellido() + " " + this.getNombre();
    }

}
