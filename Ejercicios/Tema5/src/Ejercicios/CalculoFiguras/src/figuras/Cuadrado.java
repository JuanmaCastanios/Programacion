
package figuras;

import figuras.Punto;
/**
 *
 * @author Juan Jose Blanco Díaz
 */
public class Cuadrado {
    //Atributos
    private double lado;
    private Punto centro;
    //Constructores
    public Cuadrado(double lado){
        this.lado = lado;
    }
    //Metodos
    public void setLado(double lado){
        this.lado = lado;
    }
    
    public double getLado(){
        return lado;
    }
    
    public double area(){
        return Math.pow(lado, 2);
    }
    
    public double perimetro(){
        return lado * 4;
    }
    
    public double diagonal(){
        return Math.sqrt(Math.pow(lado, 2) + Math.pow(lado, 2));
    }
    
    @Override
    public String toString(){
        return "Lado: " + getLado() + "\nArea: " + area() + "\nPerimetro: " + perimetro() + "\nDiagonal: " + diagonal();
    }
}
