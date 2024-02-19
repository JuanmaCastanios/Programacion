package Tema7.Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        String num = dato.nextLine();

        int[] numero = new int[num.length()];

        for (int i = 0; i < numero.length; i++) {
            numero[i] = Integer.parseInt(num.substring(i, i+1));
        }

        int cont = 0;
        for (int i = 0; i < numero.length/2; i++) {    
            if(numero[i] != numero[(numero.length-1) - i]){
                cont += 1;
            }
        }
        if(cont != 0){
            System.out.println("No es capicua");
        }
        else{
            System.out.println("Es capicua");
        }
    }
}
