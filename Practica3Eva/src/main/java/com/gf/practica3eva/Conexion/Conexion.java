
package com.gf.practica3eva.Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Establecer Conexion con base de datos MYSQL
 * @author Juan Jose Blanco Diaz y Alejandro Francos Fernandez
 * @since 04-06-2024
 * @version 1.0
 * "jdbc:mysql://localhost:3306/"
 */
public class Conexion {
    private Connection conexion;
    private String url;
    private String user;
    private String password;
    private String hostname;
    private String puerto;
    private String tipo;
    private String baseDatos = "";
    
    public Connection getConexion() throws SQLException  {
        conexion = DriverManager.getConnection(url, user, password);
        return conexion;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getPuerto() {
        return puerto;
    }

    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUrl() {
        return url;
    }
    
    public void setUrl() {
        this.url = "jdbc:" + tipo.toLowerCase() + "://"+ hostname.toLowerCase() + ":" + puerto + "/" + baseDatos;
    }

    public String getBaseDatos() {
        return baseDatos;
    }

    public void setBaseDatos(String baseDatos) {
        this.baseDatos = baseDatos;
    }
    
}
