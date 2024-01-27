package Ejercicios.Ascensor;

public class Ascensor {
    //Atributos
    private int pisoMax;
    private int pisoActual;
    private boolean puertas;
    private boolean alarma;
    private double capacidad;
    private double pesoActual;
    //Constructores
    public Ascensor(int pisoMax, double capacidad){
        this.pisoMax = pisoMax;
        this.capacidad = capacidad;
        pisoActual = 0;
        puertas = false;
        alarma = false;
        pesoActual = 0.0;
    }

    //Metodos
    public int getPisoMax(){
        return pisoMax;
    }
}
