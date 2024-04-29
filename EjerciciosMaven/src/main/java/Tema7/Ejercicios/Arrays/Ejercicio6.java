package Tema7.Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);

        System.out.print("Introduce un numero: ");
        String num = dato.nextLine();

        char[] numero = new char[num.length()];
        
        numero = num.toCharArray();
        
        // Otra manera de separar el numero en un array de enteros
        // for (int i = 0; i < numero.length; i++) {
        // numero[i] = Integer.parseInt(num.substring(i, i+1));
        // }

        boolean capicua = false;
        for (int i = 0; i < numero.length/2; i++) {    
            if(numero[i] == numero[(numero.length-1) - i]){
                capicua = true;
            }
        }
        if(!capicua){
            System.out.println("No es capicua");
        }
        else{
            System.out.println("Es capicua");
        }
    }
}
