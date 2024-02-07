
package Tema6.Ejercicios.Figuras;

/**
 *
 * @author Juan Jose Blanco Diaz
 */
public class AppFiguras {
    
    
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo(5, new Punto(4, 6));
        Rectangulo rectangulo = new Rectangulo(5, 3, new Punto(2, 8));
        Cuadrado cuadrado = new Cuadrado(5, new Punto(0, 0));
        
        calcularAreaFigura(circulo);
        calcularAreaFigura(rectangulo);
        calcularAreaFigura(cuadrado);
        
        dibujarFigura(circulo);
        dibujarFigura(rectangulo);
        dibujarFigura(cuadrado);
    }
    
    public static void calcularAreaFigura(Figura f){
        System.out.println("Area figura: " + f.calcularArea());
    }
    
    public static void dibujarFigura(Figura f){
        f.dibujar();
    }
}
