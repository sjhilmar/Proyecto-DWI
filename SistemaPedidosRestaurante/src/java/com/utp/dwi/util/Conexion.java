/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.utp.dwi.util;

import java.sql.Connection;
import java.sql.DriverManager;


/**
 *
 * @author JMR CODE
 */
public class Conexion {
    
    private static String driver ="com.mysql.jdbc.Driver";
    private static String usuario="root";
    private static String contrasenia="root";
    private static String url="jdbc:mysql://localhost:3306/bdrestaurant";
    
    static {
        try {
            Class.forName(driver);
          
        } catch (Exception e) {
            System.out.println("Error al establecer clase de la conexión " + e.toString());
        }
    }
    
    public static Connection obtenerConexion() throws Exception{
        Connection conexion = DriverManager.getConnection(url,usuario,contrasenia);
        return conexion;
    }

	
    
}
