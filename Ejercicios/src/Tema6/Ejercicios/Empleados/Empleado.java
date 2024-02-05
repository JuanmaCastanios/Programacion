
package Tema6.Ejercicios.Empleados;

/**
 *
 * @author Juan José Blanco Díaz
 */
public class Empleado {
    //Atributos
    protected String nombre;
    protected String apellidos;
    protected String dni;
    protected double sueldo;
    //Constructores
    public Empleado(String nombre, String apellidos, String dni, double sueldo){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.sueldo = sueldo;
    }
    //Métodos
    
   
    public double calculoSueldo(){
        return sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo() {
        this.sueldo = sueldo;
    }
    
    @Override
    public String toString() {
        return "Empleado Base\nNombre: " + this.nombre + "\nApellidos: " + this.apellidos + "\nDNI: " + this.dni + "\nSueldo: " + this.sueldo;
    }
}
