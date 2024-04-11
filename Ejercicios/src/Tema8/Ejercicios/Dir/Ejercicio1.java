
package Tema8.Ejercicios.Dir;

import java.io.File;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author bladiaju
 */
public class Ejercicio1 {
    
    public static String formatoPowerShell(File archivo){
        if(archivo.isDirectory()){
            if(archivo.isHidden()){
                    return "d--h--"; 
                }else{
                    return "d-----"; 
                }
        }else{
            if(archivo.canRead() == true && !archivo.canWrite()== false){
                if(archivo.isHidden()){
                    return "-arh--";
                }else{
                    return "-ar---";
                }
            }else{
                if(archivo.isHidden()){
                    return "-a-h--";
                }else{
                    return "-a----";
                }
            }
        }
    }
    
    public static void main(String[] args) {
        DateTimeFormatter fecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter hora = DateTimeFormatter.ofPattern("HH:mm");
        
        JFileChooser jfc = new JFileChooser();
        jfc.setDialogTitle("Selecciona una carpeta");
        jfc.setFileSelectionMode(jfc.DIRECTORIES_ONLY);
        
        int numArchivos = 0;
        int numDirectorios = 0;
        long espacioOcupado = 0;
        String[] opciones = {"MS-DOS","PowerShell"};
        
        Object valorOpcion = JOptionPane.showInputDialog(null, "Selecciona: ", "Consola de comandos", JOptionPane.INFORMATION_MESSAGE,null, opciones, opciones[0]);
        if(!(valorOpcion == null)){
            int respuesta = jfc.showSaveDialog(null);
            if(respuesta == jfc.APPROVE_OPTION){
                File[] files = jfc.getSelectedFile().listFiles();
                for(File file:files){
                    LocalDateTime time = LocalDateTime.ofEpochSecond(file.lastModified()/1000, 0, ZoneOffset.UTC).plusHours(2);
                    if(file.isFile()){
                        if(String.valueOf(valorOpcion).equals("MS-DOS")){
                            System.out.print(fecha.format(time) + " " + hora.format(time) + " <FILE> " + file.length() + "\t");
                            System.out.println(file.getName());
                        }
                        else{
                            System.out.print(formatoPowerShell(file) + " " + fecha.format(time) + " " + hora.format(time) + " " + file.length() + "\t");
                            System.out.println(file.getName());
                        }
                            numArchivos++;
                            espacioOcupado += file.length();
                    }
                    else if(file.isDirectory()){
                        if(String.valueOf(valorOpcion).equals("MS-DOS")){
                            System.out.print(fecha.format(time) + " " + hora.format(time) + " <DIR> \t\t");
                            System.out.println(file.getName());
                        }
                        else{
                            System.out.print(formatoPowerShell(file) + " " + fecha.format(time) + " " + hora.format(time) + "\t\t");
                            System.out.println(file.getName());
                        }
                        numDirectorios++;
                    }
                }
                System.out.println(numArchivos + " archivos\t" + espacioOcupado + " bytes");
                System.out.println(numDirectorios + " directorios\t" + jfc.getSelectedFile().getFreeSpace() + " bytes");
            }
        }
    }
}
