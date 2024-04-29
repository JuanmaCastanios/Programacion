
package Tema7.Ejemplos;

import java.util.Arrays;
import java.util.LinkedList;

/**
 *
 * @author bladiaju
 */
public class EjemploPila {
    public static void main(String[] args) {
        String diaSemana [] = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        //Mostramos array
        System.out.println(Arrays.toString(diaSemana));
        
        //Creamos una pila con el contenido del array
        LinkedList <String> pila = new LinkedList();
        
        for(String dia:diaSemana){
            pila.push(dia); //Apilando
        }
        
        //Vuelvo a introducir los elementos en el array usando la pila
        int pos = 0;
        while(!pila.isEmpty()){
            diaSemana[pos] = pila.pop();
            pos++;
        }
        //Mostramos array
        System.out.println(Arrays.toString(diaSemana));
        
    }
}
