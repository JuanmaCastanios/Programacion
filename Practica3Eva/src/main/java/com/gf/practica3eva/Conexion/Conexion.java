
package com.gf.practica3eva.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 * Establecer Conexion con base de datos MYSQL
 * @author Juan Jose Blanco Diaz y Alejandro Francos Fernandez
 * @since 04-06-2024
 * @version 1.0
 */
public class Conexion {
    private static Connection conexion;
    private static String url = "jdbc:mysql://localhost:3306/";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    
    public static Connection getConexion() throws SQLException  {
        String db = JOptionPane.showInputDialog(null, "Introduce el nombre de la base de datos", "Base Datos", JOptionPane.INFORMATION_MESSAGE);
        url = url + db; 
        System.out.println(url);
        conexion = DriverManager.getConnection(url, USER, PASSWORD);
        
        return conexion;
    }
}
