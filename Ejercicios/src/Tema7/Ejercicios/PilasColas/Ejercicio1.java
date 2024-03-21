
package Tema7.Ejercicios.PilasColas;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author bladiaju
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        System.out.print("Escribe una cadena de parentesis: ");
        String parentesis = dato.nextLine().trim();
        LinkedList <Character> lista = new LinkedList();
        aniadirLista(parentesis, lista);
        System.out.println(lista);
    }
    
    public static void aniadirLista(String cadena, LinkedList <Character> lista){
        for (int i = 0; i < cadena.length(); i++) {
            lista.addLast(cadena.charAt(i));
            lista.
        }
    }
    
}
