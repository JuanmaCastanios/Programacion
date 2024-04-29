
package Tema7.Ejercicios.PilasColas;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author bladiaju
 */
public class Ejercicio2 {
    public static void main(String[] args) {
        LinkedList <Integer> pila1 = new LinkedList();
        LinkedList <Integer> pila2 = new LinkedList();
        LinkedList <Integer> pila3 = new LinkedList();
        inicializarDatos(pila1);
        inicializarDatos(pila2);
        
        Collections.sort(pila1);
        Collections.sort(pila2);
        Collections.reverse(pila2);
        
        System.out.println(pila1);
        System.out.println(pila2);
        
        pila3.addAll(pila1);
        pila3.addAll(pila2);
        
        Collections.sort(pila3);
        Collections.reverse(pila3);
        
        System.out.println(pila3);
        
    }
    
    
    public static void inicializarDatos(LinkedList <Integer> pila){
        Random gen = new Random();
        int tamanio = gen.nextInt(1, 21);
        for (int i = 0; i < tamanio; i++) {
            pila.push(gen.nextInt(1, 101));
        }
    }
}
