
package Tema7.Ejercicios;

import java.util.Random;

/**
 *
 * @author bladiaju
 */
public class Ejercicio2 {
    public static void imprimeNumeros(int []array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posicion "+ i + " : " + array[i]);
        }
    }
    
    public static void sumaPares(int []array){
        int sum = 0;
        for (int i = 0; i < array.length; i+=2) {
            sum = sum + array[i];
        }
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        Random gen = new Random();
        int []numeros = new int[10];
      
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = gen.nextInt(0, 101);
        }
        
        imprimeNumeros(numeros);
        
        sumaPares(numeros);
        
    }
}
