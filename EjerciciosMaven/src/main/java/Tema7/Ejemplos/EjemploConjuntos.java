
package Tema7.Ejemplos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author bladiaju
 */
public class EjemploConjuntos {
    public static void pruebaConjunto(Set conjunto){
    //Añadimos elementos al conjunto
    conjunto.add("Uno");
    conjunto.add("Dos");
    conjunto.add("Tres");
    conjunto.add("Tres");
    conjunto.add("Tres");
    conjunto.add("Cuatro");
    conjunto.add("Cinco");
    
    //Le mostramos
    System.out.println(conjunto);
    
    //Buscamos un elemento en el conjunto
    System.out.println(conjunto.contains("Tres"));
    
    }
    
    public static void main(String[] args) {
        System.out.println("Prueba HashSet");
        Set <String> hs = new HashSet();
        pruebaConjunto(hs);
        
        System.out.println("Prueba TreeSet");
        Set <String> ts =  new TreeSet();
        pruebaConjunto(ts);
    }
}
