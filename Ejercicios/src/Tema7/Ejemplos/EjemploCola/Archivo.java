
package Tema7.Ejemplos.EjemploCola;

/**
 *
 * @author bladiaju
 */
public class Archivo {
    private String nombreArchivo;
    private int tamanio; //En bytes

    public Archivo() {
    }

    public Archivo(String nombreArchivo, int tamanio) throws Exception{
        if(nombreArchivo == null || nombreArchivo.isBlank())
            throw new Exception("ERROR.Nombre archivo obligatorio");
        this.nombreArchivo = nombreArchivo;
        this.tamanio = tamanio;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return nombreArchivo;
    }
    
    
}
