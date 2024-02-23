
package Tema7.Ejercicios.Ahorcado;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Juan Jose Blanco Diaz
 */
public class Ahorcado {
    public static String adivinarPalabra(String palabra){
        Scanner dato = new Scanner(System.in);
        char[] solucion = new char[palabra.length()];
        Arrays.fill(solucion, '_');
        int contFallos = 0;
        char letra;
        String letrasErroneas = "Letras erroneas: ";
        String respuesta = "";
        String solucionPalabra = "";
        boolean letraDesconocida;
        do{
            letraDesconocida = true;
            System.out.print("Introduce una letra: ");
            letra = dato.nextLine().trim().toUpperCase().charAt(0);
            for (int i = 0; i < palabra.length(); i++) {
                if(palabra.charAt(i) == letra){
                    solucion[i] = letra;
                    letraDesconocida = false;
                } 
            }
            if(letraDesconocida){
                contFallos++;
                letrasErroneas = letrasErroneas + letra + " ";
            }
            imprimirArray(solucion);
            System.out.println(letrasErroneas);
            System.out.print("Deseas adivinar? ");
            respuesta = dato.nextLine().toUpperCase();
        }while( (contFallos < 8 ) && !respuesta.equals("SI"));
        if(respuesta.equals("SI")){
            System.out.println("Que palabra es? ");
            solucionPalabra = dato.nextLine().toUpperCase();
        }
        return solucionPalabra;
    }
    
    public static void imprimirArray(char[] array){
         for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
         System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        Random gen = new Random();
        int ganar = 0, perder = 0;
        String[] palabras= new String[2];
        palabras[0] = "MARIPOSA";
        palabras[1] = "COCHE";
        String palabraAdivinar = palabras[gen.nextInt(0,palabras.length)].toUpperCase();
        System.out.println("AHORCADO");
        for (int i = 0; i < palabraAdivinar.length(); i++) {
            System.out.print("_ ");
        }
        System.out.println();
        if(adivinarPalabra(palabraAdivinar).equals(palabraAdivinar)){
            System.out.println("Has ganado");
            ganar++;
        }
        else{
            System.out.println("Has perdido");
            perder++;
        }
        System.out.println("Partidas ganadas: " + ganar + ", Partidas perdidas: " + perder);
        System.out.println("Jugar otra?");
    }
}
