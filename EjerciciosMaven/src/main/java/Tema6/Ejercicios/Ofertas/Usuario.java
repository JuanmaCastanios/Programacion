
package Tema6.Ejercicios.Ofertas;

/**
 *
 * @author bladiaju
 */
public abstract class Usuario implements Operaciones{
    //datos personales 
    protected double PRECIOSEGUNDO = 0.02;
    protected String nombre;
    protected String apellidos;
    protected String dni;
    protected int totalSegundos;
    
    //Constructor
    public Usuario(String nombre, String apellidos, String dni){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }
}
