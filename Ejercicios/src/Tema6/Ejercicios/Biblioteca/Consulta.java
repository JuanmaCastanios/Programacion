
package Tema6.Ejercicios.Biblioteca;

import java.time.LocalDate;

/**
 *
 * @author bladiaju
 */
public class Consulta {
    //Atributos
    private LocalDate fecha;
    private String dniAlumno;
    private LibroPapel libro;
    //Constructor
    public Consulta(String dniAlumno, LibroPapel libro){
        this.dniAlumno = dniAlumno;
        fecha = LocalDate.now();
        this.libro = libro;
    }
    //Metodos

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getDniAlumno() {
        return dniAlumno;
    }

    public void setDniAlumno(String dniAlumno) {
        this.dniAlumno = dniAlumno;
    }
    
    @Override
    public String toString(){
        return "DNI Alumno: " + this.dniAlumno + "\nFecha: " + this.fecha + "\n" + this.libro;
    }
}
