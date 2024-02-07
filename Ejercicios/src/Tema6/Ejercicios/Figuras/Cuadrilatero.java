
package Tema6.Ejercicios.Figuras;

/**
 *
 * @author bladiaju
 * 
 * Clase prototipo de las figuras que son cuadrilateros
 * 
 */
public abstract class Cuadrilatero extends Figura{
    
    protected double lado1;
    protected double lado2;
    
    //Cosntructor
    public Cuadrilatero(double lado1, double lado2, Punto centro){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.centro = centro;
    }
    @Override
    public double calcularArea(){
        return lado1 * lado2;
    }
    
}
