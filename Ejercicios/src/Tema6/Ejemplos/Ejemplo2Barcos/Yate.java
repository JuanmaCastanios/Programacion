
package Tema6.Ejemplos.Ejemplo2Barcos;

/**
 *
 * @author Juan Jose Blanco Diaz
 */
public class Yate extends Barco{
    public Yate(){
        System.out.println("Se crea la parte de un yate");
    }
    
    @Override
    public void alarma(){
        System.out.println("SOS desde un yate");
    }
}
