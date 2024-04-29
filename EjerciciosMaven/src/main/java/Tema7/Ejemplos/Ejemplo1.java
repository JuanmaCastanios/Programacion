
package Tema7.Ejemplos;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author bladiaju
 */
public class Ejemplo1 {
    
    public static void mostrarAlturas(int [] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Posicion " + i + ": " + array[i]);
        }
    }
    
    public static void main(String[] args) {
        Random gen = new Random();
        //Creamos un array para almacenar las alturas
        //de un nº de personas:25
        int []alturas =  new int [25];
        
        //Mostramos el contenido inicial del array
        mostrarAlturas(alturas);
        
        //Rellenamos el array con alturas aleatorias entre 100 cm y 200 cm
        for (int i = 0; i < alturas.length; i++) {
            alturas[i] = gen.nextInt(100, 201);
        }
        mostrarAlturas(alturas);
        
        //Creación e inicialización directa de un array
        String []calificaciones = {"Sobresaliente", "Notable", "Bien", "Suficiente", "Insuficiente"};
        System.out.println(calificaciones.length);
        
        System.out.println(Arrays.toString(calificaciones));
        Arrays.fill(alturas,10,15, -1);
        System.out.println(Arrays.toString(alturas));
        
    }
}
