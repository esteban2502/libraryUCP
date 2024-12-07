/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Conexion.Conexion;
import Modelo.Persona;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Juan Esteban
 */
public class Ctrl_Persona {
      
    // metodo para agregar una persona
    public boolean guardar(Persona objeto){
         boolean respuesta = false; // Variable que indica si la operación de guardado fue exitosa
        Connection cn = (Connection) Conexion.conectar(); // Establecer conexión a la base de datos utilizando la clase Conexion
          try{
             // Preparar una consulta SQL para insertar los datos en la tabla tb_persona  
            PreparedStatement consulta = (PreparedStatement) cn.prepareStatement("insert into tb_persona values(?,?,?,?,?,?,?)");
            // Establecer los valores de los parámetros en la consulta SQL utilizando los métodos getter del objeto Persona
            consulta.setInt(1,objeto.getIdPersona());
            consulta.setString(2,objeto.getNombre1());
            consulta.setString(3, objeto.getNombre2());
            consulta.setString(4,objeto.getApellido1());
            consulta.setString(5,objeto.getApellido2());
            consulta.setString(6,objeto.getCorreo());
            consulta.setString(7, objeto.getTelefono());
           

            // Ejecutar la consulta y verificar si se insertó al menos una fila en la base de datos
            if(consulta.executeUpdate()>0){
                respuesta = true;// La operación de guardado fue exitosa
            }
            cn.close(); // Cerrar la conexión a la base de datos
        }catch(SQLException e){
             // En caso de error, imprimir un mensaje de error
            System.out.println("Error al guardar la informacion de la persona. tipo de error: "+e);
        }
        
        return respuesta; // Devolver true si la operación de guardado fue exitosa, false si ocurrió algún error
        
    }
    
     // metodo para consultar si la ya esta en la base de datos 
    public boolean existePersona(String persona){
        boolean respuesta = false; // Variable que indica si la persona existe en la base de datos
        String sql = "select * from tb_persona where idPersona = '"+ persona+"';";  // Consulta SQL para verificar la existencia de la persona
        Statement st;
        
        try{
           // Establecer conexión a la base de datos 
           Connection cn = (Connection) Conexion.conectar();
           // Crear un objeto Statement para ejecutar la consulta SQL
           st = (Statement) cn.createStatement();
           // Ejecutar la consulta SQL y obtener el resultado en un objeto ResultSet
           ResultSet rs = st.executeQuery(sql);
           
             // Iterar sobre cada fila del resultado
           while(rs.next()){
               respuesta = true; // La persona existe en la base de datos
           }
           
        }catch(SQLException e){
             // En caso de error, imprimir un mensaje de error
            System.out.println("Error al consultar la persona: "+e);
        }
        return respuesta; // Devolver true si la persona existe en la base de datos, false si no existe 
    }
    
    
    public boolean eliminar(int idPersona){
        boolean respuesta = false; // Variable que indica si la operación de eliminación fue exitosa
        Connection cn = (Connection) Conexion.conectar(); // Obtener una conexión a la base de datos
        
        try{
            // Preparar una consulta SQL para eliminar la persona de la tabla tb_persona
            PreparedStatement consulta = (PreparedStatement) cn.prepareStatement(
                    "delete from tb_persona  where idPersona='"+idPersona+"'");
            // Ejecutar la consulta para eliminar la persona
            consulta.executeUpdate();
            
            // Verificar si se eliminó al menos una fila en la base de datos
            if(consulta.executeUpdate()>0){
                respuesta = true; // La persona fue eliminada exitosamente
            }
            cn.close(); // Cerrar la conexión a la base de datos
        }catch(SQLException e){
            // En caso de error, imprimir un mensaje de error
            System.out.println("Error al eliminar la persona: "+e);
        }
        return respuesta; // Devolver true si la persona fue eliminada exitosamente, false si no se pudo eliminar o si ocurrió algún error durante el proceso
    }
    
    //Metodo para actualizar
     public boolean actualizar(Persona objeto,int idPersona){
        boolean respuesta = false;
        Connection cn = (Connection) Conexion.conectar();  // Establecer conexión a la base de datos
        
        try{
            // Preparar la consulta SQL para actualizar los datos de la persona
            PreparedStatement consulta = (PreparedStatement) cn.prepareStatement("update tb_persona set idPersona= ?,nombre1 =?,nombre2=?,apellido1=?,apellido2=?,correo=?,telefono=? where idPersona='"+idPersona+"'");
            // Establecer los parámetros en la consulta SQL
            consulta.setInt(1,objeto.getIdPersona());
            consulta.setString(2, objeto.getNombre1());
            consulta.setString(3, objeto.getNombre2());
            consulta.setString(4, objeto.getApellido1());
            consulta.setString(5, objeto.getApellido2());
            consulta.setString(6, objeto.getCorreo());
            consulta.setString(7, objeto.getTelefono());
            
             // Ejecutar la consulta y verificar si se actualizó al menos una fila en la base de datos
            if(consulta.executeUpdate()>0){
                respuesta = true;
            }
            cn.close(); // Cerrar la conexión a la base de datos
        }catch(SQLException e){
            System.out.println("Error al actualizar los datos de la persona: "+e);
        }
        return respuesta;
    }
}

  
    

