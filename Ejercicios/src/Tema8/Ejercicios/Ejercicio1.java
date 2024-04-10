
package Tema8.Ejercicios;

import java.io.File;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import javax.swing.JFileChooser;

/**
 *
 * @author bladiaju
 */
public class Ejercicio1 {
    
    
    public static void main(String[] args) {
        DateTimeFormatter fecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter hora = DateTimeFormatter.ofPattern("HH:mm");
        
        JFileChooser jfc = new JFileChooser();
        jfc.setDialogTitle("Selecciona una carpeta");
        jfc.setFileSelectionMode(jfc.DIRECTORIES_ONLY);
        
        int numArchivos = 0;
        int numDirectorios = 0;
        long espacioOcupado = 0;
        int respuesta = jfc.showSaveDialog(null);
        if(respuesta == jfc.APPROVE_OPTION){
            File[] files = jfc.getSelectedFile().listFiles();
            for(File file:files){
                LocalDateTime time = LocalDateTime.ofEpochSecond(file.lastModified()/1000, 0, ZoneOffset.UTC);
                if(file.isFile()){
                    System.out.print(fecha.format(time) + " " + hora.format(time) + " <FILE> " + file.length() + "\t");
                    System.out.println(file.getName());
                    numArchivos++;
                    espacioOcupado += file.length();
                }
                else if(file.isDirectory()){
                    System.out.print(fecha.format(time) + " " + hora.format(time) + " <DIR> \t\t");
                    System.out.println(file.getName());
                    numDirectorios++;
                }
            }
            System.out.println(numArchivos + " archivos\t" + espacioOcupado + " bytes");
            System.out.println(numDirectorios + " directorios\t" + jfc.getSelectedFile().getFreeSpace() + " bytes");
        }   
    }
}
