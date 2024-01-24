
package figuras;

/**
 *
 * @author Juan Jose Blanco Diaz
 */
public class Triangulo {
        //Atributos
    private double base;
    private double altura;

    //Constructores
    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;

    }
    //Metodos
    public void setBase(double base){
        this.base = base;
    }
    
    public double getBase(){
        return base;
    }
    
    public void setAltura(double altura){
        this.altura = altura;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public double area(){
        return (base * altura)/2;
    }
    
    public double perimetro(){
        return base * 3;
    }
    
    @Override
    public String toString(){
        return "Base: " + getBase()+ "\nAltura: " + getAltura() + "\nArea: " + area() + "\nPerimetro: " + perimetro();
    }
}
