
package Tema6.Ejercicios.Amarres;

import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Jose Blanco Diaz
 */
public class Cliente {
    //Atributos
    private String nombre;
    private String dni;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Barco barco;
    
    //Constructor
    public Cliente(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
        fechaInicio = LocalDate.now();
        barco = new Barco(JOptionPane.showInputDialog(null, "Introduce la matricula: ", "CREACION BARCO", 1), Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el eslora: ", "CREACION BARCO", 1)), Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el año de fabricacionSS: ", "CREACION BARCO", 1)));
    }
    
    //Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    public double calcularFactura(){
        
        return (10 * barco.getEslora()) * 2;
    }
}
