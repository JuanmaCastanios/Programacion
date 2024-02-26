
package Tema7.Ejercicios.Matriz;

import java.util.Random;

/**
 *
 * @author bladiaju
 */
public class Ejercicio2 {
    
    public static void rellenarMatriz(int[][] matriz){
        Random gen = new Random();
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if(i%2 == 0){
                    matriz[i][j] = gen.nextInt(1,101);
                }
                else{
                    matriz[i][j] = gen.nextInt(1,101);
                }
            }
        }
    }
    
    public static void imprimirMatriz(int[][] matriz){
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if(i%2 == 0){
                    System.out.print(matriz[i][j] + " ");
                }
                else{
                    System.out.print(matriz[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
    
    public static int[][] trasponerMatriz(int[][] matriz){
        int[][] matrizTraspuesta = new int[5][4];
        
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizTraspuesta[j][i] = matriz[i][j];
            }
        }
        return matrizTraspuesta;
    }
    
    public static void main(String[] args) {
        int[][] matriz = new int[4][5];
        
        rellenarMatriz(matriz);
        imprimirMatriz(matriz);
        System.out.println();
        imprimirMatriz(trasponerMatriz(matriz));
    }
}
