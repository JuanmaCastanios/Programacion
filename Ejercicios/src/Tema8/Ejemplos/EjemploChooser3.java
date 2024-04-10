
package Tema8.Ejemplos;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author bladiaju
 */
public class EjemploChooser3 {
    public static void main(String[] args) {
        
        JFileChooser jfc = new JFileChooser();
        
        jfc.setDialogTitle("Ejemplo de JFileChooser de selección múltiple");
        jfc.setMultiSelectionEnabled(true);
        jfc.setFileSelectionMode(jfc.FILES_AND_DIRECTORIES);
        
        
        int respuesta = jfc.showSaveDialog(null);
        if(respuesta == jfc.APPROVE_OPTION){
            File[] files = jfc.getSelectedFiles();
            for(File file:files){
                if(file.isFile()){
                    System.out.println("Fichero seleccionado: " + file.getAbsolutePath()); 
                }
                else if(file.isDirectory()){
                    System.out.println("Directorio seleccionado: " + file.getAbsolutePath());
                }
            }
        }
    }
}
