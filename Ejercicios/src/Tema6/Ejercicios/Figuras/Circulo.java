
package Tema6.Ejercicios.Figuras;

/**
 *
 * @author bladiaju
 */
public class Circulo extends Figura{

    private double radio;
    
    public Circulo(double radio, Punto centro){
        this.radio = radio;
        this.centro = centro;
    }
    
    @Override
    public void dibujar() {
        System.out.println("Se ha dibujado un circulo");
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(this.radio, 2);
    }
    
}
