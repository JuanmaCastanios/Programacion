
package Tema7.Ejemplos;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author bladiaju
 */
public class EjemploArrayListObjetos {
    
    public static ArrayList<Persona> mayoresEdad(ArrayList <Persona> lista){
        ArrayList <Persona> resultado = new ArrayList();
        for(Persona persona: lista){
            if(persona.getEdadPersona() >= 18)
                resultado.add(persona);
        }
        return resultado;
    }
    
    public static void main(String[] args) {
        ArrayList <Persona> listaPersona = new ArrayList();
        listaPersona.add(new Persona("abc111", "Pepe", 5));
        listaPersona.add(new Persona("zks222", "Martin", 18));
        listaPersona.add(new Persona("aaa451", "Maria", 13));
        listaPersona.add(new Persona("bbc999", "Serafin", 21));
        System.out.println(listaPersona);
        
        Collections.sort(listaPersona);
        
        System.out.println(listaPersona);
        
        Collections.sort(listaPersona, new OrdenPorEdad());
        System.out.println(listaPersona);
        
        //buscar persona por id
        Collections.sort(listaPersona);
        Persona key = new Persona();
        key.setIdPersona("abc111");
        int pos = Collections.binarySearch(listaPersona, key);
        if(pos > -1){
            System.out.println("Persona encontrada");
            System.out.println(listaPersona.get(pos));
        }else{
            System.out.println("Persona no encontrada");
        }
        
        System.out.println("Busqueda CONTAINS");
        if(listaPersona.contains(key)){
            System.out.println("Persona encontrada");
        }else{
            System.out.println("Persona no encontrada");
        }
        
        //Busca todas las personas mayores de edad
        System.out.println(mayoresEdad(listaPersona));
    }
}
