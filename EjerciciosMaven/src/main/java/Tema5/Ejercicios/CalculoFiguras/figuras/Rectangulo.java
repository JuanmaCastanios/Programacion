package figuras;

/**
 *
 * @author Juan Jose Blanco Diaz
 */
public class Rectangulo {
    //Atributos
    private double base;
    private double altura;

    //Constructores
    public Rectangulo(double base, double altura){
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
        return base * altura;
    }
    
    public double perimetro(){
        return (base * 2) + (altura * 2);
    }
    
    public double diagonal(){
        return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
    }
    
    @Override
    public String toString(){
        return "Base: " + getBase()+ "\nAltura: " + getAltura() + "\nArea: " + area() + "\nPerimetro: " + perimetro() + "\nDiagonal: " + diagonal();
    }
}
