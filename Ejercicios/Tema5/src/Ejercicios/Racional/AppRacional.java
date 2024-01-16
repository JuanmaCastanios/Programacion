package Ejercicios.Racional;
import Ejercicios.Racional.Racional;
public class AppRacional {
    
    public static void main(String[] args) {
        Racional num1 = new Racional(4, 48);
        Racional num2 = new Racional (7,8);
        System.out.println(num1.suma(num2));
    }
}
