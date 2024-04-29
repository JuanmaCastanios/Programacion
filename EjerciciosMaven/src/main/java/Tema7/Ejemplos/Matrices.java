
package Tema7.Ejemplos;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author bladiaju
 */
public class Matrices {
    
    public static void mostrarMatriz(int[][] matriz){
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < filas; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
    
    public static void rellenarMatriz(int[][] matriz){
        Random gen = new Random();
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = gen.nextInt(1,11);
            }
        }
    }
    
    public static void main(String[] args) {
        //Creamos una matriz de enteros
        //con valores aleatorios entre 1 y 10
        
        int[][] matriz;
        matriz = new int[5][4]; //5 filas x 4 columnas
        
        System.out.println("Numero de filas: " + matriz.length);
        System.out.println("Numero de columnas: " + matriz[0].length);
        rellenarMatriz(matriz);
        mostrarMatriz(matriz);
        
        
    }
}
