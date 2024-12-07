/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Juan Esteban
 */
public class Reserva {
    private int idReserva;
    private int idHorario;
    private int idPersona;
    private String horaEntrada;
    private String horaSalida;
    private String fecha;

    public Reserva(int idReserva, int idHorario, int idPersona, String horaEntrada, String horaSalida, String fecha) {
        this.idReserva = idReserva;
        this.idHorario = idHorario;
        this.idPersona = idPersona;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
        this.fecha = fecha;
    }

 
    
    
    public Reserva(){
        this.idReserva = 0;
        this.idHorario = 0;
        this.idPersona = 0;
        this.horaEntrada = "";
        this.horaSalida = "";
        
        
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(int idHorario) {
        this.idHorario = idHorario;
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
    
    

    
    
    
    
}
