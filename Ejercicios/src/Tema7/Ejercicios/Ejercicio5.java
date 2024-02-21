
package Tema7.Ejercicios;

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
    
    public static void colocarNumero(int[] array){
        Random gen = new Random();
        int numeroAle;
        for(int i = 0; i < array.length; i++){
            do{
                numeroAle = gen.nextInt(1, 11);
            }while (comprobarNumero(numeroAle, array));
            array[i] = numeroAle;
        }
    }
    
    public static boolean comprobarNumero(int num, int[] array){
        for(int i = 0; i < array.length; i++){        
            if(array[i] == num){
                return true;
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        int[] lista = new int [10];
        colocarNumero(lista);
        imprimirLista(lista);
    }
}
