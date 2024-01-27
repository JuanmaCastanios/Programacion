package figuras;

import java.awt.Dimension;
import java.awt.Toolkit;

public class Punto implements Comparable<Punto>{
    
    //Atributos
    private double x;
    private double y;

    //Constructores
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public Punto(){
        x = 0;
        y = 0;
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

    public double distanciaDosPuntos(Punto otro){
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
        Punto otroPunto = (Punto) otro;
        return (this.x == otroPunto.x) && (this.y == otroPunto.y);
    }

    @Override
    public int compareTo(Punto otro){
        //Determinamos el orden "natural" de objetos PuntoV2
        return (int) (this.x - otro.x);
    }

}
