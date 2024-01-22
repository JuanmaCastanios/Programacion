package CalculadoraEstandar;

/**
 *
 * @author Juan José Blanco Díaz
 */
public class CalculadoraEstandar {
    
    //Atributos
    private static double num1;
    private static double num2;
    
    //Metodos 
    
    public static double suma(double a, double b){
        return a + b;
    }
    
    public static double resta(double a, double b){
        return a -b;
    }
    
    public static double producto(double a, double b){
        return a * b;
    }
    
    public static double division(double a, double b){
        return a/b;
    }
    
    public static double modulo(double a, double b){
        return a%b;
    }
    
    public static double potencia(double a, double b){
        return Math.pow(a, b);
    }
    
    public static double raiz(double a){
        return Math.sqrt(a);
    }

    public static double getNum1() {
        return num1;
    }

    public static void setNum1(double aNum1) {
        num1 = aNum1;
    }

    public static double getNum2() {
        return num2;
    }

    public static void setNum2(double aNum2) {
        num2 = aNum2;
    }
}
