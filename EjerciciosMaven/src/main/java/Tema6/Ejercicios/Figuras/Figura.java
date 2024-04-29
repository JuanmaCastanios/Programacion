
package Tema6.Ejercicios.Figuras;

import Tema6.Ejercicios.Figuras.Punto;
/**
 *
 * @author bladiaju
 * Prototipo de todas las figuras geométricas.
 * Define el comportamineto mínimo común de todas las figuras
 */
public abstract class Figura {

    protected Punto centro;
            
    public abstract void dibujar();
    public abstract double calcularArea();
}
