
package Tema7.Ejercicios.Matriz;

import java.util.Random;

/**
 *
 * @author juanj
 */
public class Ejercicio4 {
    
    public static void rellenarMatriz(int[][] matriz){
        Random gen = new Random();
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < filas; i++){
            for (int j = 0; j < columnas; j++){
                matriz[i][j] = gen.nextInt(1,11);
            }
        }
    }
    
    public static void imprimirMatriz(int[][] matriz){
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(matriz[j][i] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Random gen = new Random();
        int[][] matriz = new int[gen.nextInt(1, 11)][gen.nextInt(1, 11)];
        
        rellenarMatriz(matriz);
        imprimirMatriz(matriz);
    }
}
