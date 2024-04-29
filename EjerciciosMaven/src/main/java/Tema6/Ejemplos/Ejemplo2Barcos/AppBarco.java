
package Tema6.Ejemplos.Ejemplo2Barcos;

/**
 *
 * @author Juan Jose Blanco Diaz
 */
public class AppBarco {
    
    public static void naufragio(Barco barco){
        barco.alarma(); //-> SOS desde un barco
        
        if (barco instanceof Velero)
        ((Velero)barco).metodoPremium();
    }
    
    public static void main(String[] args) {
        Velero v1 = new Velero();
        Yate y1 = new Yate();
        
        naufragio(v1); //-> SOS desde velero
        naufragio(y1); //-> SOS desde yate
    }
}
