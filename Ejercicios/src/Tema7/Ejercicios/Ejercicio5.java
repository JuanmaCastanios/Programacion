
package Tema7.Ejercicios;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author bladiaju
 */
public class Ejercicio5 {
    public static void imprimirLista(int []array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posicion "+ i + " : " + array[i]);
        }
    }
    
    public static void main(String[] args) {
        Random gen = new Random();
        int[] lista = new int [10];
        
        for (int i = 0; i < lista.length; i++) {
            boolean salir = false;
            do { 
                lista[i] = gen.nextInt(1, 11);
                int num = lista[i];
                System.out.println(Arrays.binarySearch(lista, num));
                for (int j = 0; j < 10; j++) {
                    if(Arrays.binarySearch(lista, num) > 0){
                        salir = true;
                    }
                }
            } while (salir);
        }
        imprimirLista(lista);
    }
}
