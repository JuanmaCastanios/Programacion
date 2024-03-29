package Tema5.Ejercicios.PuntoCentro;

import Tema6.Ejercicios.Figuras.*;
import Tema5.Ejercicios.PuntoCentro.*;
import java.awt.Dimension;
import java.awt.Toolkit;

public class PuntoV2 implements Comparable<PuntoV2>{
    
    //Atributos
    private double x;
    private double y;

    //Constructores
    public PuntoV2(double x, double y){
        this.x = x;
        this.y = y;
    }
    //Métodos
    public void desplazarPunto(double distanciaX, double distanciaY){
        x += distanciaX;
        y += distanciaY;
    }

    public void moverPunto(double posicionX, double posicionY){
        setX(posicionX);
        setY(posicionY);
    }

    public double distanciaDosPuntos(PuntoV2 otro){
        double distancia = Math.sqrt(Math.pow(otro.x - this.x, 2) + Math.pow(otro.y - this.y, 2));
        return distancia;
    }

    public void alCentro(){
        Dimension tamanio = Toolkit.getDefaultToolkit().getScreenSize();
        double xCentro = tamanio.width/2;
        double yCentro = tamanio.height/2;
        x = xCentro;
        y = yCentro;
    }

    public double getX(){
        return x;
    }

    public void setX(double valorX){
        x = valorX;
    }

    public double getY(){
        return y;
    }

    public void setY(double valorY){
        y = valorY;
    }

    @Override
    public String toString(){
        return "(" + x + ", " + y + ")";
    }
    
    @Override
    public boolean equals(Object otro){
        PuntoV2 otroPunto = (PuntoV2) otro;
        return (this.x == otroPunto.x) && (this.y == otroPunto.y);
    }

    @Override
    public int compareTo(PuntoV2 otro){
        //Determinamos el orden "natural" de objetos PuntoV2
        return (int) (this.x - otro.x);
    }

}
