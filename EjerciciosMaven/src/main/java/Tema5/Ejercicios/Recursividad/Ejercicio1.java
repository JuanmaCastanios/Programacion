
package Tema5.Ejercicios.Recursividad;

/*
 * @author bladiaju
 * 
 * Programa que calcule la potencia de una base
 * entera elevada a un exponente entero de forma
 * recursiva e iterativa.
 */
 
public class Ejercicio1 {
    
    public static int potencia(int base, int exp){
        if(exp == 0) return 1;
        return base * potencia(base, exp - 1);
    }
    
    public static void main(String[] args) {
        int base = 2;
        int exp = 6;
        System.out.println((int) Math.pow(base, exp));
        System.out.println(potencia(base, exp));
    }
}
