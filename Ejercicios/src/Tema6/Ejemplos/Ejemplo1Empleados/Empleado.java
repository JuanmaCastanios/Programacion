
package Tema6.Ejemplos.Ejemplo1Empleados;

/**
 *
 * @author Juan José Blanco Díaz
 */
public class Empleado {
    //Estado comun para todos los objetos de tipo Empleado
    protected String nombre;
    protected String apellidos;
    protected double salarioBase;
    protected double irpf = 0.2; //Retencion a aplicar sobre el salario base
    
    //Constructores
    public Empleado(){
        System.out.println("Se crea un empleado por defecto");
    }

    public Empleado(String nombre, String apellidos, double salarioBase) {
        System.out.println("Se crea un empleado con parametros");
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salarioBase = salarioBase;
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

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    
    public double calcularSalario(){
        return (this.salarioBase - (this.irpf * this.salarioBase));
    }
    //Sobrecarga del metodo calcularSalario()
    public double calcularSalario(double prima){
        return this.calcularSalario() + prima;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + getNombre() + ", Apellidos: " + getApellidos() + ", Salario Base: " + getSalarioBase();
    }
    
}
