
package Tema6.Ejercicios.Figuras;

/**
 *
 * @author bladiaju
 */
public class Rectangulo extends Cuadrilatero{
    
    public Rectangulo(double lado1, double lado2, Punto centro){
        super(lado1, lado2, centro);
    }
    
    @Override
    public void dibujar(){
        System.out.println("Se ha dibujado un rectángulo");
    }
}
