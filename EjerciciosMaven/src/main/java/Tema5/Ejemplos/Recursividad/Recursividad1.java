
package Tema5.Ejemplos.Recursividad;

/**
 *
 * @author bladiaju
 */
public class Recursividad1 {
    
    public static void contar(int i){
        if(i == 101) return;
        System.out.println(i);
        contar(++i);
    }
    
    public static void main(String[] args) {
        contar(0);
    }
}
