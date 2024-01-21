package CalculadoraEstandar;

/**
 *
 * @author Juan José Blanco Díaz
 */
public class CalculadoraEstandar {
    
    //Atributos
    private double num1;
    private double num2;
    
    //Constructor
    public CalculadoraEstandar(){
        num1 = 0;
        num2 = 0;
    }
    
    //Metodos
    public double getNum1(){
        return num1;
    }
    
    public void setNum1(double num1){
        this.num1 = num1;
    }
    
    public double getNum2(){
        return num2;
    }
    
    public void setNum2(double num2){
        this.num2 = num2;
    }
    
    public double suma(double a, double b){
        return a + b;
    }
    
    public double resta(double a, double b){
        return a -b;
    }
    
    public double producto(double a, double b){
        return a * b;
    }
    
    public double division(double a, double b){
        return a/b;
    }
    
    public double modulo(double a, double b){
        return a%b;
    }
    
    public double potencia(double a, double b){
        return Math.pow(a, b);
    }
    
    public double raiz(double a){
        return Math.sqrt(a);
    }
}
