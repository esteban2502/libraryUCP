/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Juan Esteban
 */
public class Conexion {
        //conexion local
    
   
    public static Connection conectar() {
        
        try {
            // ruta de la base de datos con su usuario y contraseña de MySQL
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/bd_Biblioteca", "root", "administrador");
            return cn; // Devolver la conexión establecida
        } catch (SQLException e) {
            System.out.println("Error en la conexion local" + e);
        }
         // En caso de error, imprimir el mensaje de error y devolver null
        return null;
    }

}

