
package Tema7.Ejercicios.EjercicioEntrega;

import java.util.Random;

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
public class Tarea {
    //Atributos
    private int pid;
    private String nombreProceso;
    private String prioridad;
    private int tamanioMemoria;
    
    //Constructores
    public Tarea(String nombreProceso){
        this.nombreProceso = nombreProceso;
        this.prioridad = aniadirPrioridad();
        this.tamanioMemoria = aniadirTamanioMemoria();
    }
    
    //Metodos
    public String aniadirPrioridad(){
        Random gen = new Random();
        int i = gen.nextInt(0,2);
        if(i == 0){
            return "Alta";
        }
        else{
            return "Baja";
        }
    }
    
    public int aniadirTamanioMemoria(){
        Random gen = new Random();
        return gen.nextInt(1,1001);
    }

    public int getPID() {
        return pid += pid++;
    }

    public void setPID(int pid) {
        this.pid = pid;
    }

    public String getNombreProceso() {
        return nombreProceso;
    }

    public void setNombreProceso(String nombreProceso) {
        this.nombreProceso = nombreProceso;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public int getTamanioMemoria() {
        return tamanioMemoria;
    }

    public void setTamanioMemoria(int tamanioMemoria) {
        this.tamanioMemoria = tamanioMemoria;
    }

    @Override
    public String toString() {
        return "Nombre Proceso: " + nombreProceso +  " | PID: " + pid + " | Prioridad: " + prioridad + " | Tamanio en memoria: " + tamanioMemoria ;
    }
}
