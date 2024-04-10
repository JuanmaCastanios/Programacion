
package Tema8.Ejercicios;

import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author bladiaju
 */
public class Ejercicio1 {
    
    
    public static void main(String[] args) {
        
        JFileChooser jfc = new JFileChooser();
        jfc.setDialogTitle("Selecciona una carpeta");
        jfc.setMultiSelectionEnabled(true);
        jfc.setFileSelectionMode(jfc.DIRECTORIES_ONLY);
        
        int respuesta = jfc.showSaveDialog(null);
        if(respuesta == jfc.APPROVE_OPTION){
            File[] files = jfc.getSelectedFiles();
            for(File file:files){
                if(file.isFile()){
                    System.out.println("Hola: " + file.lastModified());
                }
                else if(file.isDirectory()){
                    System.out.println("Hola: " + file.lastModified());
                }
            }
        }   
    }
}
