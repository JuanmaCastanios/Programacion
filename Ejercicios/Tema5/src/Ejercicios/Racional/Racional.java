package Ejercicios.Racional;

import java.text.NumberFormat;
import java.util.Locale;

public class Racional {
    
    //Atributos
    private int num;
    private int den;

    //Constructor
    public Racional(int num, int den){
        this.num = num;
        this.den = den;
    }

    public Racional(){
        num = 0;
        den = 0;
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

    public Racional suma(Racional r){
        Racional resultado = new Racional();
        resultado.den = MCM(this.den, r.den);
        resultado.num =  (resultado.den/this.den) * this.num + (resultado.den/r.den) * r.num;
        return resultado;
    }

    public Racional resta(Racional r){
        Racional resultado = new Racional();
        resultado.den = MCM(this.den, r.den);
        resultado.num =  (resultado.den/this.den) * this.num - (resultado.den/r.den) * r.num;
        return resultado;
    }

    public Racional producto(Racional r){
        Racional resultado = new Racional();
        resultado.num = this.num * r.num;
        resultado.den = this.den * r.den;
        return resultado;
    }

    public Racional dividir(Racional r){
        Racional resultado = new Racional();
        resultado.num = this.num * r.den;
        resultado.den = this.den * r.num;
        return resultado;
    }

    public double toDecimal(){
        NumberFormat formato = NumberFormat.getNumberInstance(Locale.ENGLISH);
        formato.setMaximumFractionDigits(4);
        return Double.parseDouble(formato.format(num/(double)den));
    }

    public static int MCD(int dividendo, int divisor){
        boolean continuar = true;
        int aux;
        int cont = 0;

        if(dividendo < divisor){
            aux = dividendo;
            dividendo = divisor;
            divisor = aux;
        }
        while(continuar){
            if(dividendo%divisor == 0){
                aux = dividendo/divisor;
                dividendo = divisor;
                divisor = aux;
            }
            else{
                if(cont == 0){
                    return 1;
                }
                continuar = false;
            }
            cont++;
        }
        return dividendo;
    }
    
    public static int MCM(int num1, int num2){
        return (num1 * num2)/MCD(num1, num2);
    }

    @Override
    public String toString(){
        return num + "/" + den;
    }

    @Override
    public boolean equals(Object r){
        Racional otro = (Racional) obj;
        if(this.num == otro.num){
            if(this.den == otro.den){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }
    
    public int compareTo(Racional r){
        if(this.toDecimal() == r.toDecimal()){
            return 0;
        }
        else if(this.toDecimal() > r.toDecimal()){
            return 1;
        }
        else{
            return -1;
        }   
    }
}
