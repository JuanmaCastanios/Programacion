package Ejemplos.EjemploStatico;

public class EjemploStatico {
    private static int id;
    private String nombre;
    private int edad;

    public EjemploStatico(String nombre, int edad){
        id++;
        this.nombre = nombre;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "EjemploStatic [id=" + id + ", nombre=" + nombre + ", edad=" + edad + "]";
    }
}
