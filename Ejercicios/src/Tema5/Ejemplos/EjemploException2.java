package Ejemplos;

public class EjemploException2 {
    public static void main(String[] args) {
        try {
            double resultado = dividir(4,5);
            System.out.println("El resultado es " + resultado);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static double dividir (double a, double b) throws Exception{
        if (b == 0){
           throw new Exception("ERROR. Division entre 0");
        }
        return a/b;
    }
}
