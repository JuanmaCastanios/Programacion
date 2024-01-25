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
        try{
            metodo111();
        } catch (java.lang.IndexOutOfBoundsException eox) {
            System.out.println("Manejo error: " + eox.getMessage());
        }catch (java.lang.NullPointerException eox2) {
            System.out.println("Manejo error: " + eox2.getMessage());
        }
    }

    public static void metodo111(){
        String s = null;
        System.out.println("Mi cadena es " + s.toLowerCase());
        
    }
}