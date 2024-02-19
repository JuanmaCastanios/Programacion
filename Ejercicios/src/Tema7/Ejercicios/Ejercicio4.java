package Tema7.Ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    public static void imprimirFrases(String[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
    public static void mayorFrase(String[] array){
        String maxFrase = "";
        int maxPos = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].length() > maxFrase.length()){
                maxFrase = array[i];
                maxPos = i;
            }
        }
        System.out.println(maxFrase + " en la posicion " + maxPos);
    }
    
    public static void menorFrase(String[] array){
        String minFrase = array[0];
        int minPos = array.length;
        for (int i = 0; i < array.length; i++) {
            if(array[i].length() < minFrase.length()){
                minFrase = array[i];
                minPos = i;
            }
        }
        System.out.println(minFrase + " en la posicion " + minPos);
    }
    
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        String []frases = new String[5];
        
        for (int i = 0; i < frases.length; i++) {
            System.out.print("Introduce la frase " + (i + 1) + ": ");
            frases[i] = dato.nextLine();
        }
        
        imprimirFrases(frases);
        mayorFrase(frases);
        menorFrase(frases);
    }
}
