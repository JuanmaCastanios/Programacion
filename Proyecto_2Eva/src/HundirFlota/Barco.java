
package HundirFlota;

/**
 *
 * @author Juan Jose Blanco y Eduardo de la Fuente
 * @version 1.0
 * @since 11-03-2024
 */
public class Barco {
    
    
    //Atributos
    private String nombre; //Nombre del barco
    private int longitud; //Tamaño del barco
    private char figura; //Letra identificativa del barco
    private Coordenadas posicion; //Posicion que ocupa el barco
    
    //Constructor
    public Barco(String nombre, int longitud){
        this.nombre = nombre;
        this.longitud = longitud;
        //Se le asigna la letra inicial como figura
        asignarFigura();
        //Se crea un objeto posicion vacio teniendo en cuenta su tamaño
        posicion = new Coordenadas(new String [longitud]);
    }
    //Metodos

    /**
     * getNombre muestra el nombre del barco
     * @return Nombre barco
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * setNombre asigna un nombre al objeto barco
     * @param nombre Nombre que se le asigna
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * getLongitud muestra la longitud del barco
     * @return Longitud barco
     */
    public int getLongitud() {
        return longitud;
    }
    
    /**
     * setLongitud asigna una longitud al objeto barco
     * @param longitud Longitud que se le asigna
     */
    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }
    
    /**
     * getFigura muestra la figura del barco
     * @return Figura barco
     */
    public char getFigura() {
        return figura;
    }
    
    /**
     * setFigura asigna una figura al objeto barco
     * @param figura Figura que se le asigna
     */
    public void setFigura(char figura) {
        this.figura = figura;
    }
    
    /**
     * getPosicion muestra la posicion del barco
     * @return Posicion barco
     */
    public Coordenadas getPosicion() {
        return posicion;
    }
    
    /**
     * setPosicion asigna una posicion al objeto barco
     * @param posicion Posicion que se le asigna
     */
    public void setPosicion(Coordenadas posicion) {
        this.posicion = posicion;
    }
    /**
     * asignarFigura asigna la inicial del nombre del barco elegido
     * como figura para representar en el tablero.
     */
    public void asignarFigura(){
        char letra = nombre.toUpperCase().charAt(0);
        setFigura(letra);
    }
  
}
