
package Tema6.Ejercicios.Figuras;

/**
 *
 * @author bladiaju
 */
public class Cuadrado extends Cuadrilatero{
    
    
    public Cuadrado(double lado, Punto centro){
        super(lado, lado, centro);
    }
    
    @Override
    public void dibujar(){
        System.out.println("Se ha dibujado un cuadrado");
    }
}
