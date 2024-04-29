
package Tema7.Ejercicios.Matriz;

import java.util.Random;

/**
 *
 * @author bladiaju
 */
public class Ejercicio1 {
    
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
    
    public static void imprimirMatriz(int[][] matriz){
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if(i%2 == 0){
                    System.out.print(matriz[i][j] * 2 + " ");
                }
                else{
                    System.out.print(matriz[i][j] * 3 + " ");
                }
            }
            System.out.println();
        }
    }
    
    public static int sumaMatriz(int[][] matriz){
        int sumTotal = 0;
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if(i%2 == 0){
                   sumTotal = sumTotal + (matriz[i][j] * 2);
                }
                else{
                    sumTotal = sumTotal + (matriz[i][j] * 3);
                }
            }
        }
        return sumTotal;
    }
    
    public static void diagonal(int[][] matriz){
        int filas = matriz.length;
        int columnas = matriz[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if(i == j){
                    if(i%2 == 0){
                        System.out.print(matriz[i][j] * 2 + " ");
                    }
                    else{
                        System.out.print(matriz[i][j] * 3 + " ");
                    }
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int[][] matriz = new int[5][5];
        
        rellenarMatriz(matriz);
        imprimirMatriz(matriz);
        System.out.println("Suma de los componentes: " + sumaMatriz(matriz));
        diagonal(matriz);
    }
}
