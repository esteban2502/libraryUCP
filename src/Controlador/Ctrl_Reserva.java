/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Conexion.Conexion;
import Modelo.Registro;
import Modelo.Reserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Juan Esteban
 */
public class Ctrl_Reserva {
    
    public boolean guardar(Reserva objeto) {
        boolean respuesta = false;
        Connection cn = (Connection) Conexion.conectar();
        try {
            PreparedStatement consulta = (PreparedStatement) cn.prepareStatement("insert into tb_reserva values(?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setInt(2,objeto.getIdHorario());
            consulta.setInt(3, objeto.getIdPersona());
            consulta.setString(4, objeto.getHoraEntrada());
            consulta.setString(5, objeto.getHoraSalida());
            consulta.setString(6, objeto.getFecha());


            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al hacer la reserva. tipo de error: " + e);
        }

        return respuesta;
    }
    
        public boolean eliminar(int idReserva){
        boolean respuesta = false;
        Connection cn = (Connection) Conexion.conectar();
        
        try{
            PreparedStatement consulta = (PreparedStatement) cn.prepareStatement(
                    "delete from tb_reserva  where idReserva='"+idReserva+"'");
            consulta.executeUpdate();
            
            
            if(consulta.executeUpdate()>0){
                respuesta = true;
            }
            cn.close();
        }catch(SQLException e){
            System.out.println("Error al eliminar la Reserva: "+e);
        }
        return respuesta;
    }
}
