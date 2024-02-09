
package Tema6.Ejercicios.Ofertas;

/**
 *
 * @author bladiaju
 */
public class Cliente1 extends Usuario implements Oferta1{
    //Constructor
    public Cliente1(String nombre, String apellidos, String dni){
        super(nombre, apellidos, dni);
    }
    //Metodos
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
        return PRECIOSEGUNDO * this.totalSegundos;
    }
    
    @Override
    public void reset(){
        this.totalSegundos = 0;
    }
}
