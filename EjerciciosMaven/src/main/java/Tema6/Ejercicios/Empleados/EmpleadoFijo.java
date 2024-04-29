
package Tema6.Ejercicios.Empleados;

import java.time.LocalDate;

/**
 *
 * @author bladiaju
 */
public class EmpleadoFijo extends Empleado{
    //Atributos
    private int anioAlta;
    private double salarioBase;
    private double complemento;
    //Constructores
    public EmpleadoFijo(String nombre, String apellidos, String dni, double salarioBase, int anioAlta){
        super(nombre, apellidos, dni);
        this.anioAlta = anioAlta;
    }
    //Metodos
 
    public int getAnioAlta() {
        return anioAlta;
    }


    public void setAnioAlta(int anioAlta) {
        this.anioAlta = anioAlta;
    }


    public double getSalarioBase() {
        return salarioBase;
    }


    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double calculoSueldo(){
        int aniosContratado = (LocalDate.now().getYear()) - this.anioAlta;
        return this.salarioBase + (this.complemento * aniosContratado);
    }

    @Override
    public String toString(){
        return "Empleado Fijo\nNombre: " + this.nombre + "\nApellidos: " + this.apellidos + "\nDNI: " + this.dni + "\nAño de Alta: " + this.anioAlta + "\nComplemento: " + this.complemento;
    }

}
