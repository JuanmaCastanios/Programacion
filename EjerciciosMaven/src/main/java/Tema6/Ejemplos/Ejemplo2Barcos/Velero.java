
package Tema6.Ejemplos.Ejemplo2Barcos;

/**
 *
 * @author Juan Jose Blanco Diaz
 */
public class Velero extends Barco{
    public Velero(){
        System.out.println("Se crea la parte de un velero");
    }
    
    @Override
    public void alarma(){
        System.out.println("SOS desde un velero");
    }
    
    public void metodoPremium(){
        System.out.println("Gourmet");
    }
}
