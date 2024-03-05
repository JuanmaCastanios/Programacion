
package Tema7.Ejemplos;

import java.util.Objects;

/**
 *
 * @author bladiaju
 * Orden natural idPersona
 * Orden total(alternativo): edad
 */
public class Persona implements Comparable<Persona>{
    private String idPersona;
    private String nombrePersona;
    private int edadPersona;

    public Persona(){
        
    }

    public Persona(String idPersona, String nombrePersona, int edadPersona) {
        this.idPersona = idPersona;
        this.nombrePersona = nombrePersona;
        this.edadPersona = edadPersona;
    }
       
    public String getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(String idPersona) {
        this.idPersona = idPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public int getEdadPersona() {
        return edadPersona;
    }

    public void setEdadPersona(int edadPersona) {
        this.edadPersona = edadPersona;
    }

    @Override
    public String toString() {
        return idPersona;
    }

    @Override
    public int compareTo(Persona o) {
        return this.idPersona.compareTo(o.idPersona);
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Persona other = (Persona) obj;
        return Objects.equals(this.idPersona, other.idPersona);
    }
    
    
    
}
