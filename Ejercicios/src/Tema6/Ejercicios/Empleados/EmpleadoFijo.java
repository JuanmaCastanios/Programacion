
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
    private final double complemento = 350;
    //Constructores
    public EmpleadoFijo(String nombre, String apellidos, String dni, double salarioBase, int anioAlta){
        super(nombre, apellidos, dni);
        this.anioAlta = anioAlta;
    }
    //Metodos

    @Override
    public double calculoSueldo(){
        int aniosContratado = (LocalDate.now().getYear()) - anioAlta;
        return salarioBase + (complemento * aniosContratado);
    }

    @Override
    public String toString(){
        return "Empleado Fijo\nNombre: " + this.nombre + "\nApellidos: " + this.apellidos + "\nDNI: " + this.dni + "\nSueldo: " + this.sueldo + "\nAño de Alta: " + this.anioAlta + "\nComplemento: " + this.complemento;
    }

}
