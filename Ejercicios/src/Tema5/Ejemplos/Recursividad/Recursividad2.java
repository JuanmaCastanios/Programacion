
package Tema5.Ejemplos.Recursividad;

/**
 *
 * @author bladiaju
 */
public class Recursividad2 {
    
    public static long factorial(long n){
        if(n==0) return 1;
        return n * factorial(n-1);
    }
    
    public static void main(String[] args) {
        System.out.println(factorial(39));
    }
}
