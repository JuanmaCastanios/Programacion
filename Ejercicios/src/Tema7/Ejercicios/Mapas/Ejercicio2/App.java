
package Tema7.Ejercicios.Mapas.Ejercicio2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author bladiaju
 */
public class App {
    public static void aniadirCliente(Cliente cliente, Map mapa){
        mapa.put(cliente.getIdCliente(), cliente);
    }
    public static void main(String[] args) {
        Map doraLaExploradora = new HashMap();
        Cliente c1 = new Cliente("12345678A", "Gusiluz1", -100);
        aniadirCliente(c1, doraLaExploradora);
        
        Cliente c2 = new Cliente("12345678B", "Gusiluz2", -1000);
        aniadirCliente(c1, doraLaExploradora);
        
        Cliente c3 = new Cliente("12345678C", "Gusiluz3", -10000);
        aniadirCliente(c1, doraLaExploradora);
    }
}
