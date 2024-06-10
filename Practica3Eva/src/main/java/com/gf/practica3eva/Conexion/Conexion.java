
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
    
    /**
     * getConexion realiza la conexion con la base de datos
     * @return
     * @throws SQLException Tratamiento de errores procedentes de la conexion con base de datos
     */
    public Connection getConexion() throws SQLException  {
        conexion = DriverManager.getConnection(url, user + " as sysdba", password);
        return conexion;
    }
    
    /**
     * getUser obtiene el usuario de la base de datos
     * @return Usuario de la base de datos
     */
    public String getUser() {
        return user;
    }
    
    /**
     * setUser establece el usuario
     * @param user Usuario de la base de datos 
     */
    public void setUser(String user) {
        this.user = user;
    }
    
    /**
     * getPassword obtiene la contraseña de la base de datos
     * @return Contraseña de la base de datos
     */
    public String getPassword() {
        return password;
    }
    
    /**
     * setPassword establece la contraseña
     * @param password Contraseña de la base de datos 
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * getHostname obtiene el hostname de la base de datos
     * @return Hostname de la base de datos
     */
    public String getHostname() {
        return hostname;
    }
    /**
     * setHostname establece el hostname
     * @param hostname Hostname de la base de datos
     */
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }
    
    /**
     * getPuerto obtiene el puerto de la base de datos
     * @return Puerto de la base de datos
     */
    public String getPuerto() {
        return puerto;
    }
    
    /**
     * setPuerto establece el puerto
     * @param puerto Puerto de la base de datos
     */
    public void setPuerto(String puerto) {
        this.puerto = puerto;
    }
    
    /**
     * getTipo obtiene el tipo de la base de datos
     * @return Tipo de la base de datos
     */
    public String getTipo() {
        return tipo;
    }
    
    /**
     * setTipo establece el tipo
     * @param tipo Tipo de la base de datos
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    /**
     * getUrl obtiene la url de la base de datos
     * @return Url de la base de datos
     */
    public String getUrl() {
        return url;
    }
    /**
     * setUrl establece la url
     * @param cadena Tipo de la base de datos
     */
    public void setUrl(String cadena) {
        if(cadena.equals("MySQL")){ //Para bases de datos MySQL
            this.url = "jdbc:" + tipo.toLowerCase() + "://"+ hostname.toLowerCase() + ":" + puerto + "/" + baseDatos;
        } else { //Para bases de datos Oracle
            this.url = "jdbc:" + tipo.toLowerCase() + ":thin:@//"+ hostname.toLowerCase() + ":" + puerto + "/ORCLCDB".toUpperCase() + baseDatos;
        }
    }
    
    /**
     * getBaseDatos obtiene la base de datos
     * @return Base de datos
     */
    public String getBaseDatos() {
        return baseDatos;
    }
    
    /**
     * setBaseDatos establece el nombre de la base de datos
     * @param baseDatos Base de datos
     */
    public void setBaseDatos(String baseDatos) {
        this.baseDatos = baseDatos;
    }
    
}
