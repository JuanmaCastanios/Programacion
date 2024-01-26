package Ejemplos;

import java.util.Random;

public class EjemploExcepcion {

    public static void main(String[] args) {
        while (true) {
            metodo1();
        }
    }

    public static void metodo1(){
        metodo11();
    }

    public static void metodo11(){
        metodo111();
    }

    public static void metodo111(){
        try{
            String s = null;
            System.out.println("Mi cadena es " + s.toLowerCase());
        }catch (java.lang.IndexOutOfBoundsException eox) {
            System.out.println("Manejo error: " + eox.getMessage());
        }catch (java.lang.NullPointerException eox2) {
            System.out.println("Manejo error: " + eox2.getMessage());
        }
    }
}