package Controlador;

/**
 *
 * @author Juan Esteban
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Conexion.Conexion;
import Modelo.Persona;
import Modelo.Registro;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Ctrl_Registro {

    public boolean guardar(Registro objeto) {
        boolean respuesta = false;
        Connection cn = (Connection) Conexion.conectar();
        try {
            PreparedStatement consulta = (PreparedStatement) cn.prepareStatement("insert into tb_registro values(?,?,?,?,?,?)");
            consulta.setInt(1, 0);
            consulta.setInt(2, objeto.getIdPersona());
            consulta.setString(3, objeto.getHoraEntrada());
            consulta.setString(4, objeto.getHoraSalida());
            consulta.setString(5, objeto.getFecha());
            consulta.setString(6, objeto.getEstado());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;
            }
            cn.close();
        } catch (SQLException e) {
            System.out.println("Error al guardar el registro. tipo de error: " + e);
        }

        return respuesta;
    }

     //Metodo para actualizar
     public boolean actualizar(Registro objeto,int idRegistro){
        boolean respuesta = false;
        Connection cn = (Connection) Conexion.conectar();
        
        try{
            PreparedStatement consulta = (PreparedStatement) cn.prepareStatement("update tb_registro set  horaSalida=?,estado=?  where idRegistro='"+idRegistro+"'");
            consulta.setString(1,objeto.getHoraSalida());
            consulta.setString(2,objeto.getEstado());
            
            
            
            if(consulta.executeUpdate()>0){
                respuesta = true;
            }
            cn.close();
        }catch(SQLException e){
            System.out.println("Error al actualizar los datos del registro: "+e);
        }
        return respuesta;
    }
    
}
