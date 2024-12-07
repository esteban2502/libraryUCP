/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Juan Esteban
 */
public class Registro {
    private int idRegistro;
    private int idPersona;
    private String horaEntrada;
    private String horaSalida;
    private String fecha;
    private String Estado;

    public Registro(int idRegistro, int idPersona, String horaEntrada, String horaSalida, String fecha, String Estado) {
        this.idRegistro = idRegistro;
        this.idPersona = idPersona;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.fecha = fecha;
        this.Estado = Estado;
    }

    public int getIdRegistro() {
        return idRegistro;
    }
    
     public Registro(){
        this.idRegistro = 0;
        this.idPersona = 0;
        this.horaEntrada = "";
        this.horaSalida = "";
        this.fecha = "";
        this.Estado = "";
        
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

 

  
 
    
    
    
}
