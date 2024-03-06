
package Tema7.Ejercicios.Agenda;

/**
 *
 * @author bladiaju
 */
public class Contacto {
    private int idContacto;
    private String nombre;
    private int telefono;
    
    public Contacto(String nombre){
        this.nombre = nombre;
    }
    
    public int getIdContacto() {
        return idContacto;
    }

    public void setIdContacto(int idContacto) {
        this.idContacto = idContacto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        if(telefono == 0){
            return "Contacto " + idContacto + ": " + nombre + " - ";
        } else {
            return "Contacto " + idContacto + ": " + nombre + " - " + telefono;
        }
    }
    
    
}
