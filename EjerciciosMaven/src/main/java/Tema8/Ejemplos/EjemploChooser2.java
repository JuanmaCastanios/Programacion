
package Tema8.Ejemplos;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author bladiaju
 */
public class EjemploChooser2 {
    public static void main(String[] args) {
        
        JFileChooser jfc = new JFileChooser();
        
        jfc.setDialogTitle("Ejemplo de JFileChooser");
        jfc.setFileSelectionMode(jfc.FILES_AND_DIRECTORIES);
        
        
        int respuesta = jfc.showSaveDialog(null);
        if(respuesta == jfc.APPROVE_OPTION){
            File file = jfc.getSelectedFile();
            if(file.isDirectory())
            System.out.println("Directorio seleccionado " + file.getAbsolutePath());
        
        }
    }
}
