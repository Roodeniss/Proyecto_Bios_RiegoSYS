/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uy.cursojava.proyecto.RiegoSYS.Logica;

/**
 *
 * @author rodrigo denis, rodrigo silveria, bruno rasetti
 */
public class Empleado extends Persona{
    /*    Aatributos      */
    private String banco;
    private Integer cueBanPago;
    private Integer tipoEmpleado;
    private String horaEntrada;
    private String horaSalida;
    private Contrato contrato;
    
    /*    constructores     */
    public Empleado(String banco, Integer cueBanPago, Integer tipoEmpleado, String horaEntrada, String horaSalida, Contrato contrato) {
        this.banco = banco;
        this.cueBanPago = cueBanPago;
        this.tipoEmpleado = tipoEmpleado;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.contrato = contrato;
    }
    
    public Empleado(){
        this.banco = "";
        this.contrato = null;
        this.cueBanPago = 0;
        this.horaEntrada = "";
        this.horaSalida = "";
        this.tipoEmpleado = 0;
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

    public Integer getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(Integer tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    
}
