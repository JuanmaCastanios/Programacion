
package Tema7.Ejemplos;

import java.util.Objects;

/**
 *
 * @author bladiaju
 */
public class Alumno implements Comparable<Alumno>{
    private String nombre;
    private double nota;
    private String calificacion;
    
    public Alumno(String nombre, double nota, String calificacion){
        this.nombre = nombre;
        this.nota = nota;
        this.calificacion = calificacion;
    }
    
    public Alumno(){
        
    }
    
    //Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public String toString() {
        return "Alumno -> nombre: " + nombre + ", nota: " + nota + ", calificacion: " + calificacion;
    }

    @Override
    public int compareTo(Alumno alum) {
        return this.nombre.compareTo(alum.getNombre());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Alumno other = (Alumno) obj;
        return Objects.equals(this.nombre, other.nombre);
    }
    
    
    
}
