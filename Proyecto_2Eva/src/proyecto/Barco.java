
package proyecto;

/**
 *
 * @author bladiaju
 */
public class Barco {
    //Atributos
    private String nombre;
    private int longitud;
    private char figura;
    private Coordenadas posicion;
    //Constructor
    public Barco(String nombre, int longitud){
        this.nombre = nombre;
        this.longitud = longitud;
        asignarFigura();
        posicion = new Coordenadas(new String [longitud]);
    }
    //Metodos

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public char getFigura() {
        return figura;
    }

    public void setFigura(char figura) {
        this.figura = figura;
    }
    
    public Coordenadas getPosicion() {
        return posicion;
    }

    public void setPosicion(Coordenadas posicion) {
        this.posicion = posicion;
    }
    
    public void asignarFigura(){
        char letra = nombre.toUpperCase().charAt(0);
        setFigura(letra);
    }
  
}
