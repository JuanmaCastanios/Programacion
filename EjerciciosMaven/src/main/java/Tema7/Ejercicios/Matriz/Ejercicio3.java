
package Tema7.Ejercicios.Matriz;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author bladiaju
 */
public class Ejercicio3 {
    
    public static void rellenarMatriz(int[][] matriz){
        Random gen = new Random();
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                matriz[i][j] = gen.nextInt(1,101);
            }
        }
    }
    
    public static void imprimirMatriz(int[][] matriz){
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void permutaFilas(int[][] matriz, int fila1, int fila2){
        int[] aux = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {

                aux[i] = matriz[fila1][i];
                matriz[fila1][i] = matriz[fila2][i];
                matriz[fila2][i] = aux[i];
        }   
    }
    
    public static void permutaColumnas(int[][] matriz, int columna1, int columna2){
        int[] aux = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {

                aux[i] = matriz[i][columna1];
                matriz[i][columna1] = matriz[i][columna2];
                matriz[i][columna2] = aux[i];
        }   
    }
     
    public static void main(String[] args) {
        int[][] matriz = new int[4][5];
        
        rellenarMatriz(matriz);
        imprimirMatriz(matriz);
        System.out.println();
        permutaColumnas(matriz, 0, 2);
        imprimirMatriz(matriz);
    }
}
