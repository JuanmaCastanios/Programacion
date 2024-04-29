
package Tema6.Ejercicios.Empleados;

/**
 *
 * @author Juan José Blanco Díaz
 */
public abstract class Empleado {
    //Atributos
    protected String nombre;
    protected String apellidos;
    protected String dni;
    //Constructores
    public Empleado(String nombre, String apellidos, String dni){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
    }
    //Métodos
    
    public abstract double calculoSueldo();

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
    
    @Override
    public String toString() {
        return "Empleado Base\nNombre: " + this.nombre + "\nApellidos: " + this.apellidos + "\nDNI: " + this.dni;
    }
}
