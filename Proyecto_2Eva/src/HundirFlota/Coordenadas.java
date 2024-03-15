
package HundirFlota;

import java.util.Arrays;

/**
 *
 * @author Juan Jose Blanco y Eduardo de la Fuente
 * @version 1.0
 * @since 11-03-2024
 */
public class Coordenadas implements Comparable<Coordenadas> {
    
    //Atributos
    private String[] cord; //Array que almacenara las corrdenadas de un barco
    
    //Constructores
    public Coordenadas(String[] cord) {
        this.cord = cord;      
    }
    
    //Metodos
    
    /**
     * getCord muestra las coordenadas de un barco
     * @return Coordenadas de un barco
     */
    public String[] getCord() {
        return cord;
    }
    
    /**
     * setCord asigna las coordenadas a un objeto barco
     * @param cord Coordenadas de un barco
     */
    public void setCord(String[] cord) {
        this.cord = cord;
    }

    /**
     * toString metodo sobreescrito que muestra las coordenadas del barco
     * @return Cadena con el array de coordenadas
     */
    @Override
    public String toString() {
        return Arrays.toString(cord);
    }
    
    
    /**
     * compareTo metodo sobreescrito que 
     * @param o 
     * @return 
     */
    @Override
    public int compareTo(Coordenadas o) {
        for (int i = 0; i < this.cord.length; i++) {
            for (int j = 0; j < o.cord.length; j++) {
                if (this.cord[i].equals(o.cord[j])) {
                    return 1;
                }
            }
        }
        return 0;
    }

}
