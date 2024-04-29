
package Tema8.Ejemplos;

import java.io.File;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author bladiaju
 * Ejemplo de seleccion de un fichero a traves de JFileChooser
 */
public class EjemploChooser4 {
    public static void main(String[] args) {
        
        
        //FileSystemView fsv = FileSystemView.getFileSystemView();
        //File homeDirectory = fsv.getHomeDirectory();
        JFileChooser jfc = new JFileChooser("C:\\Ejercicios");
        
        
        int respuesta = jfc.showOpenDialog(null);
        if(respuesta == jfc.APPROVE_OPTION){
            File fichero = jfc.getSelectedFile();
            System.out.println("Fichero seleccionado " + fichero.getAbsolutePath());
            //procesamos el fichero
            
        }
        
        
    }
}
