package Ejercicios.Televisor;

import Televisor.Televisor;
import java.util.Scanner;

public class AppTelevisor {
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        boolean continuar = true;

        System.out.print("Introduce las pulgadas: ");
        double pulgadas = dato.nextDouble();
        System.out.print("Introduce el numero de canales: ");
        int numCanales = dato.nextInt();
        
        Televisor tv = new Televisor("12744712gjf", pulgadas, numCanales);
        
        do {
            System.out.println("---------------------------------------------");
            System.out.print("Elije una opción:\nEncender/Apagar televisor -> 1\nSilenciar/Desilenciar televisor -> 2\n" + 
                    "Cambiar de canal -> 3\nSubir un canal -> 4\nBajar un canal -> 5\nSubir volumen -> 6\nBajar volumen -> 7\nSalir -> 8\nRespuesta: ");
            int respuesta = dato.nextInt();
            System.out.println("---------------------------------------------");
            switch (respuesta) {
                case 1:{
                    tv.setEncendido();
                    System.out.println(tv);
                }break;

                case 2:{
                    tv.setSilenciado();
                    System.out.println(tv);
                }break;

                case 3:{
                    System.out.print("¿A que canal quieres cambiar?: ");
                    tv.setCanalActual(dato.nextInt());
                    System.out.println(tv);
                }break;

                case 4:{
                    tv.subirCanal();
                    System.out.println(tv);
                }break;

                case 5:{
                    tv.bajarCanal();
                    System.out.println(tv);
                }break;

                case 6:{
                    tv.subirVolumen();
                    System.out.println(tv);
                }break;

                case 7:{
                    tv.bajarVolumen();
                    System.out.println(tv);
                }break;

                case 8:{
                    continuar = false;
                }break;

                default:{
                    System.out.println("ERROR.Respuesta incorrecta");
                }break;
            }
        } while (continuar);
    }
}