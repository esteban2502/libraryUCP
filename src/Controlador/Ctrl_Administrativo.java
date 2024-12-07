/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Conexion.Conexion;
import Modelo.Administrativo;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author Juan Esteban
 */
public class Ctrl_Administrativo {
    
    //metodo para iniciar sesion
    public boolean loginAdmid(Administrativo admid){
        
        boolean respuesta = false;
        //establece una conexión a la base de datos utilizando el método conectar() de la clase Conexion.
         Connection cn = Conexion.conectar();
         
        // Construye una consulta SQL para seleccionar los campos 'usuario' y 'contraseña' de la tabla 'tb_administrativo'
        // donde el nombre de usuario y la contraseña coinciden con los valores proporcionados por el objeto 'admid'.
         String sql = "select usuario, contraseña from tb_administrativo where usuario = '" + admid.getUsuario() + "' and contraseña = '" + admid.getContraseña() + "'";
         // (JDBC), un Statement se utiliza para enviar consultas SQL a una base de datos y obtener resultados.
         Statement st; 
         try {
               // Crear un objeto Statement para ejecutar consultas SQL
             st = cn.createStatement();
             // Ejecutar la consulta SQL y obtener el resultado en un objeto ResultSet
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
        // En este caso, se establece la variable "respuesta" como verdadera si hay al menos una fila en el resultado
                respuesta = true;
            }
        } catch (SQLException e) {
            // mensaje en consola para identificar el error
            System.out.println("Error al intentar Iniciar Sesion");
            //mensaje en pantalla para mostrar el error
            JOptionPane.showMessageDialog(null, "Error al intentar Iniciar Sesion");
        }
        
        
        return respuesta;        
    }
    
}
