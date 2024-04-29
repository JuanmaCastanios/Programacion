
package Tema6.Ejercicios.Ofertas;

/**
 *
 * @author bladiaju
 */
public class GranCliente extends Usuario implements Oferta1, Oferta2{
    //Atributo
    private double descuento;
    //Constructor
    public GranCliente(String nombre, String apellidos, String dni){
        super(nombre, apellidos, dni);
    }
    //Metodos
    
    @Override
    public void getDescuento(double descuento){
        this.descuento = descuento;
    }
    
    @Override
    public void conexion(int s){
        if(s - SEGUNDOSDESCONTADOS < 0){
            this.totalSegundos = 0;
        }
        else{
            this.totalSegundos = s - SEGUNDOSDESCONTADOS;
        }
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
