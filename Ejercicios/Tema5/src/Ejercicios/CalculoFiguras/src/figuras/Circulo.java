
package figuras;

/**
 *
 * @author Juan Jose Blanco Diaz
 */
public class Circulo {
    //Atributos
    private double radio;
    //Constructores
    public Circulo(double radio){
        this.radio = radio;
    }
    //Metodos
    public void setLado(double radio){
        this.radio = radio;
    }
    
    public double getLado(){
        return radio;
    }
    
    public double area(){
        return Math.PI * Math.pow(radio, 2);
    }
    
    public double perimetro(){
        return 2 * Math.PI * radio;
    }
   
    @Override
    public String toString(){
        return "Radio: " + getLado() + "\nArea: " + area() + "\nPerimetro: " + perimetro();
    }
}
