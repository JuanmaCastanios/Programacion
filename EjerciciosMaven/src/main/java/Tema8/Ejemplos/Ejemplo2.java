
package Tema8.Ejemplos;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author bladiaju
 *
 * Ejemplo de creacion de objetos File que representan a ficheros o directorios
 * cuyas rutas son introducidas por el usuario
 */
public class Ejemplo2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String ruta;

        do {
            System.out.println("Ruta al fichero o directorio");
            System.out.println("ENTER para terminar");
            ruta = sc.nextLine();

            if (!ruta.isEmpty()) {
                File file = new File(ruta);
                if (file.exists()) {
                    if (file.isFile()) {
                        System.out.println("Fichero existente.");
                        System.out.println("\t" + file.length() + " bytes");
                    } else if (file.isDirectory()) {
                        System.out.println("Directorio existente");
                        //mostramos el contenido
                        for (File obj : file.listFiles()) {
                            if (obj.isFile()) {
                                //atributos
                                System.out.println("\tFichero: " + obj.getPath());
                                System.out.printf("\tAtributos (r/w/x/h):%b/%b/%b/%b %n", obj.canRead(), obj.canWrite(), obj.canExecute(), obj.isHidden());
                            } else {
                                System.out.println("Carpeta: " + obj.getPath());
                            }
                            System.out.println("\t" + obj);
                        }
                    }
                } else {
                    System.out.println("Fichero/directorio inexistente");
                }
            }
        } while (!ruta.isEmpty());
    }
}
