
package Tema8.Ejemplos;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author bladiaju
 * 
 * Programa que muestre las unidades de disco
 * espacio ocupado y espacio lbire
 */
public class Ejemplo3 {
    
    public static void main(String[] args) {
        
        Scanner dato = new Scanner(System.in);
        
        try {
            File temporal = File.createTempFile("prueba", null);
            temporal.deleteOnExit();
            
            System.out.println(temporal.getAbsolutePath());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        /*File[] unidades = File.listRoots();
        System.out.println("Unidades de disco");
        for(File unidad: unidades){
            System.out.println("Nombre: " + unidad);
            System.out.println("Espacio Libre: " + unidad.getFreeSpace());
            System.out.println("Espacio Ocupado: " + unidad.getUsableSpace());
            System.out.println("Espcaio total: " + unidad.getTotalSpace());
            System.out.println("---------------------");
        }*/
        
        
    }
    
}
