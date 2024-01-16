package Ejercicios.Racional;

public class Racional {
    
    //Atributos
    private int num;
    private int den;

    //Constructor
    public Racional(int num, int den){
        this.num = num;
        this.den = den;
    }
    //Métodos
    public void setNumerador(int num){
        this.num = num;
    }

    public int getNumerador(){
        return num;
    }

    public void setDenominador(int den){
        this.den = den;
    }

    public int getDenominador(){
        return den;
    }

    public int MCD(int num1){
        int cont = 2;
        int num = 1;
        while (num1 != 1) {

            if(num1 % cont != 0){
                cont++;
            }
            else{
               num = num1 % cont;
            }
        }
        return num;
    }
}
