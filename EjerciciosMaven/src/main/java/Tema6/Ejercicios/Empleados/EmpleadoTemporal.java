
package Tema6.Ejercicios.Empleados;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author bladiaju
 */
public class EmpleadoTemporal extends Empleado{
    //Atributos
    private LocalDate fechaAlta;
    private LocalDate fechaBaja;
    private double sueldoFijo;
    //Constructores
    public EmpleadoTemporal(String nombre, String apellidos, String dni, double sueldoFijo){
        super(nombre, apellidos, dni);
        this.sueldoFijo = sueldoFijo;
        fechaAlta = LocalDate.of(2024, Month.MARCH, 24);
        fechaBaja = LocalDate.of(2024, Month.SEPTEMBER, 15);
    }
    //Metodos

    public LocalDate getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(LocalDate fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public LocalDate getFechaBaja() {
        return fechaBaja;
    }

    public void setFechaBaja(LocalDate fechaBaja) {
        this.fechaBaja = fechaBaja;
    }
    
    @Override
    public double calculoSueldo() {
        return this.sueldoFijo;
    }
    
    @Override
    public String toString() {
        return "Empleado Temporal\nNombre: " + this.nombre + "\nApellidos: " + this.apellidos + "\nDNI: " + this.dni + "\nFecha Alta: " + this.fechaAlta + "\nFecha Baja: " + this.fechaBaja;
    }
}
