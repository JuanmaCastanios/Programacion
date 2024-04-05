
package Tema7.Ejemplos;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author bladiaju
 */
public class EjemploMapas {
    public static void pruebaMap(Map mapa){
        //Añadimos elementos clave-valor al mapa
        mapa.put(1, "Cliente 1");
        mapa.put(2, "Cliente 2");
        mapa.put(3, "Cliente 3");
        
        //Mostramos las claves
        System.out.println("Tamanio de mapa: " + mapa.size());
        System.out.println(mapa.keySet());
        
        //Mostramos los valores
        System.out.println(mapa.values());
        
        //Mostramos contenido del mapa
        System.out.println(mapa);
        
        //Buscamos un elemento por clave
        if(mapa.containsKey(2)) System.out.println(mapa.get(2));
        else System.out.println("Clave inexistente");
        
        //Buscamos un elemento por valor
        if(mapa.containsValue("Cliente 2"))System.out.println("Elemento existente");
        else System.out.println("Elemento inexistente");
    }
    
    public static void main(String[] args) {
        System.out.println("Prueba HashMap");
        Map hm = new HashMap();
        pruebaMap(hm);
        
        System.out.println("Prueba TreeMap");
        Map tm = new TreeMap();
        pruebaMap(tm);
    
    }
}
