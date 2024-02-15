
package Tema7.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author bladiaju
 */
public class Ejercicio1 {
    public static void imprimePersonas(String []array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posicion "+ i + " : " + array[i]);
        }
    }
    
    public static void pares(String []array){
        for (int i = 0; i < array.length ; i+=2) {

            System.out.println("Posicion "+ i + " : " + array[i]);
        }
    }
    
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        String []personas = new String[20];
        
        for (int i = 0; i < personas.length; i++) {
            System.out.print("Introduce un nombre: ");
            personas[i] = dato.nextLine();
        }
        
        imprimePersonas(personas);
        System.out.println("-------------------------------");
        pares(personas);
    }
}
