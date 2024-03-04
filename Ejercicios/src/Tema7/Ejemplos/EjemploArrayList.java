
package Tema7.Ejemplos;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author bladiaju
 */
public class EjemploArrayList {
    public static void main(String[] args) {
        ArrayList <String> lista = new ArrayList();
        System.out.println(lista.isEmpty());
        System.out.println(lista.size());
        
        lista.add("uno");
        lista.add("dos");
        lista.add("tres");
        lista.add("cuatro");
        
        System.out.println(lista.size());
        System.out.println(lista);
        
        lista.add(0, "cero");
        System.out.println(lista);
        System.out.println("Has sustituido " + lista.set(1, "primero"));
        System.out.println("El ultimo elemento es " + lista.get(lista.size()-1));
        
        System.out.println(lista.contains("tres"));
        System.out.println(lista.indexOf("uno"));
        
        if(lista.remove("dos"))
            System.out.println("Elemento borrado");
        else
            System.out.println("NO se encontró el elemento");
        
        System.out.println(lista);
        
        if(lista.remove(0) != null)
            System.out.println("Elemento borrado");
        else
            System.out.println("NO se encontró el elemento");
        
        System.out.println(lista);
        
        for(String cadena: lista){
            System.out.println(cadena.toUpperCase());
        }
        
        Collections.sort(lista);
        int posicion = Collections.binarySearch(lista, "cuatro");
        System.out.println(posicion);
        
        lista.clear();
        System.out.println(lista);
        
    }
}