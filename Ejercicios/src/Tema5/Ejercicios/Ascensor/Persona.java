package Tema5.Ejercicios.Ascensor;

public class Persona {
    //Atributos
    private String nombre;
    private double peso;
    
    //Constructores
    public Persona(String nombre, double peso){
        this.nombre = nombre;
        this.peso = peso;
    }
    //Metodos
    public String getNombre(){
        return nombre;
    }

    public double getPeso(){
        return peso;
    }
}