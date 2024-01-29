package Ejercicios.Ascensor;

import javax.swing.JOptionPane;

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

    public int getCapacidad(){
        return capacidad;
    }

    public void setPisoActual(int pisoActual){
        this.pisoActual = pisoActual;
    }

    public int getPisoActual(){
        return pisoActual;
    }

    public void setPuertas(boolean puertas){
        this.puertas = puertas;
    }

    public boolean isPuertas(){
        return puertas;
    }

    public void setAlarma(boolean alarma){
        this.alarma = alarma;
    }

    public boolean isAlarma(){
        return alarma;
    }

    public void setPesoActual(double pesoActual){
        this.pesoActual = pesoActual;
    }

    public double getPesoActual(){
        return pesoActual;
    }

    public boolean abrirPuertas(){
        return puertas = true;
    }

    public boolean cerrarPuertas(){
        return puertas = false;
    }

    public boolean encenderAlarma(){
        return alarma = true;
    }

    public boolean apagarAlarma(){
        return alarma = false;
    }

    public void cambiarPiso(){
        int piso = JOptionPane.showInputDialog(null, "Introduce al piso que quieres ir: ", "Cambio Piso", 1);
        pisoActual = piso;
    }

    
}
