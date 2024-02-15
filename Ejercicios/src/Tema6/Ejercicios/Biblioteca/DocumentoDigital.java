
package Tema6.Ejercicios.Biblioteca;

/**
 *
 * @author bladiaju
 */
public class DocumentoDigital extends LibroPapel{
    //Atributos
    private String tipoLicencia;
    //Constructor
    public DocumentoDigital(int codigo, String titulo, String autor, String editorial, int anioPublicacion, String tipoLicencia){
        super(codigo, titulo, autor, editorial, anioPublicacion);
        this.tipoLicencia = tipoLicencia;
    }
    //Metodos

    public String getTipoLicencia() {
        return tipoLicencia;
    }

    public void setTipoLicencia(String tipoLicencia) {
        this.tipoLicencia = tipoLicencia;
    }
    
    @Override
    public String toString(){
        return "Codigo: " + this.codigo + "\nTitulo: " + this.titulo + "\nAutor: " + this.autor + "\nEditorial: " + this.editorial + "\nAnioPublicacion: " + this.anioPublicacion + "\nTipo Liecncia: " + this.tipoLicencia;
    }
}
