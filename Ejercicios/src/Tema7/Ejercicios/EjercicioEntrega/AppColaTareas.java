
package Tema7.Ejercicios.EjercicioEntrega;

import java.util.LinkedList;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Juan Jose Blanco Diaz
 * 
 * Programa que gestione 2 colas de procesos por prioridades.
 * Las prioridades son: 
 * - Alta
 * - Baja
 * Cada proceso dispone de PID, nombre, prioridad y uso de memoria (KB)
 * 
 * Cada vez que se cree un proceso (simulado por su creacion a traves del usuario), le asignamos
 * PID único y correlativo, nombre, prioridad aleatoria entre las permitidas y memoria también aleatoria entre 1 KB y 1000 K
 * 
 * Segun la prioridad pasaran los procesos a la cola correspondiente
 * 
 * API: Timer -> temporizador con retardo configurable
 *      TimerTask -> run 
 * 
 */
public class AppColaTareas {
    private static LinkedList <Tarea> colaAlta = new LinkedList();
    private static LinkedList <Tarea> colaBaja = new LinkedList();
    private static String resultado = "";
   
    
    public static void main(String[] args) {
        
        System.out.println("ADMINISTRADOR DE TAREAS");
        
        
     
    }
    
    public static void  aniadirCola(Tarea tarea){
        if(tarea.getPrioridad().toUpperCase().equals("ALTA")){
            colaAlta.addLast(tarea);
        }
        else{
            colaBaja.addLast(tarea);
        }
    }
    
    public static void ordenarTareas(){
        if(!colaAlta.isEmpty()){
            resultado += colaAlta.getFirst() + "\n";
        }
        else{
            if(!colaBaja.isEmpty()){
                resultado += colaBaja.getFirst() + "\n";
            }
        }
    }
    
    public static void actualizarTareas(String resultado){
        System.out.println(resultado);
        System.out.println("--------------------------------------------");
    }
}
