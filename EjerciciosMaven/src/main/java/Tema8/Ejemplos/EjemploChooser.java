
package Tema8.Ejemplos;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author bladiaju
 * Ejemplo de seleccion de un fichero a traves de JFileChooser
 */
public class EjemploChooser {
    public static void main(String[] args) {
        
        JFileChooser jfc = new JFileChooser();
        int respuesta = jfc.showOpenDialog(null);
        if(respuesta == jfc.APPROVE_OPTION){
            File fichero = jfc.getSelectedFile();
            System.out.println("Fichero seleccionado " + fichero.getAbsolutePath());
            //procesamos el fichero
            
        }
        
        
    }
}
