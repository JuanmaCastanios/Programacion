
package Tema6.Ejercicios.Ofertas;


/**
 *
 * @author bladiaju
 */
public class Cliente2 extends Usuario implements Oferta2{
    //Atributos
    private double descuento;
    //Constructor
    public Cliente2(String nombre, String apellidos, String dni){
        super(nombre, apellidos, dni);
    }
    @Override
    public void getDescuento(double descuento){
        this.descuento = descuento;
    }
    
    @Override
    public void conexion(int s){
        this.totalSegundos = s;
    }
    
    @Override
    public double importe(){
        return (PRECIOSEGUNDO * this.totalSegundos) * (1 - descuento);
    }
    
    @Override
    public void reset(){
        this.totalSegundos = 0;
        this.descuento = 0;
    } 
}
