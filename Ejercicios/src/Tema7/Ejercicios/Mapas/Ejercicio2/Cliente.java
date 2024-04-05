
package Tema7.Ejercicios.Mapas.Ejercicio2;

/**
 *
 * @author bladiaju
 */
public class Cliente {
    //Atributos
    private int idCliente;
    private String dni;
    private String nombre;
    private double saldo;
    
    //Constructores
    public Cliente(String dni, String nombre, int saldo){
        this.dni = dni;
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    //Metodos

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente++;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
}
