package Ejercicios.Racional;

public class AppRacional {
    public static void main(String[] args) {
        Racional num1 = new Racional(5, 4);
        System.out.println(num1.MCD(num1.getDenominador()));
    }
}
