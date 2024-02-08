
package Tema6.Ejercicios.Ofertas;

/**
 *
 * @author bladiaju
 */
public class Usuario implements Oferta1, Oferta2{
    //datos personales 
    protected String nombre;
    protected String apellidos;
    protected String dni;
    
    //Constructor
    public Usuario(String nombre, String apellidos, String dni){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }
    //Metodos
    @Override
    public double calcularOferta1(){
        return 0;
    }
    
    @Override
    public double calcularOferta2(){
        return 0;
    }
}
