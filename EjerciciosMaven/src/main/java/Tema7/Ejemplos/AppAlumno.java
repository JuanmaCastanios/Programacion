
package Tema7.Ejemplos;

import java.util.Arrays;

/**
 *
 * @author bladiaju
 */
public class AppAlumno {
    
    public static void alumnosAprobados(Alumno[] clase){
        for (Alumno alumno: clase){
            if(alumno!= null && alumno.getNota() >= 5){
                System.out.println(alumno);
            }
        }
    }
    
    public static Alumno[] cambiarTamanioManual(Alumno[] clase, int nuevoTam){
        Alumno[] nuevaClase = new Alumno [nuevoTam];
        try {
            for(int i = 0;i< nuevaClase.length;i++){
                nuevaClase[i] = clase[i];
            }
        }catch (IndexOutOfBoundsException error){
        } finally{
            return nuevaClase;
        }
    }
    
    public static int buscarAlumno(Alumno[] clase, String nombre){
        int i = 0;
        for (Alumno alumno: clase){
            if(alumno!= null && alumno.getNombre().equals(nombre)){
                return i;
            }
            i++;
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Alumno[] clase = new Alumno[20];
        clase[0] = new Alumno("Juan", 8.75, "NT");
        clase[1] = new Alumno("Maria", 5.5, "A");
        clase[2] = new Alumno("Gusi", 2.0, "I");
        clase[3] = new Alumno("Pedro", 4.0, "I");
        clase[4] = new Alumno("Laura", 6.3, "B");
       System.out.println(Arrays.toString(clase));
    
        //mostrar alumnos aprobados
        alumnosAprobados(clase);
        
        //aumentar el tamaño de la clase a 30 alumnos
        clase = cambiarTamanioManual(clase, 30);
        
        //buscar alumno por nombre
        int posicion = buscarAlumno(clase,"Juan");
        if(posicion > -1){
            System.out.println(clase[posicion]);
        }else{
            System.out.println("Alumno inexistente");
        }
        
        Alumno key = new Alumno();
        key.setNombre("Pedro");
        posicion = Arrays.binarySearch(clase, 0, 4, key);
        
        if(posicion > -1){
            System.out.println(clase[posicion]);
        }else{
            System.out.println("Alumno inexistente");
        }
    }
}
