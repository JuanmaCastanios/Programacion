
package Tema7.Ejemplos;

import java.util.Comparator;

/**
 *
 * @author bladiaju
 */
public class OrdenPorEdad implements Comparator<Persona>{

    @Override
    public int compare(Persona o1, Persona o2) {
        return o1.getEdadPersona() - o2.getEdadPersona();
    }
    
}
