package Tema7.Ejercicios;

import java.util.Random;

public class Ejercicio3 {
    public static void imprimirPares(int[] array){
        for (int i = 1; i < array.length; i+=2) {
            if(array[i]%2 == 0){
                System.out.println("Posicion " + i + ": " + array[i]);
            }
        }
    }
    public static void sumaPares(int[] array){
        int sum = 0;
        for (int i = 1; i < array.length; i+=2) {
            if(array[i]%2 == 0){
                sum = sum + array[i];
            }
        }
        System.out.println("Total suma: " + sum);
    }
    public static void main(String[] args) {
        Random gen = new Random();
        int []numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = gen.nextInt(0, 101);
        }

        imprimirPares(numeros);

        sumaPares(numeros);
    }
}
