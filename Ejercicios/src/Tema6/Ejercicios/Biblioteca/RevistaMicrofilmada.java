
package Tema6.Ejercicios.Biblioteca;

/**
 *
 * @author bladiaju
 */
public class RevistaMicrofilmada extends RevistaPapel{
    //Atributos
    private String codigoMicrofilm;
    //Cosntructor
    public RevistaMicrofilmada(int codigo, String titulo, String autor, String editorial, int anioPublicacion, int volumen, int numero, String mes, String codigoMicrofilm){
        super(codigo, titulo, autor, editorial, anioPublicacion, volumen, numero, mes);
        this.codigoMicrofilm = codigoMicrofilm;
    }
    //Metodos

    public String getCodigoMicrofilm() {
        return codigoMicrofilm;
    }

    public void setCodigoMicrofilm(String codigoMicrofilm) {
        this.codigoMicrofilm = codigoMicrofilm;
    }
    
    @Override
    public String toString(){
        return "Codigo: " + this.codigo + "\nCodigo Microfilm: " + this.codigoMicrofilm + "\nTitulo: " + this.titulo + "\nAutor: " + this.autor + "\nEditorial: " + this.editorial + "\nAnioPublicacion: " + this.anioPublicacion + "\nVolumen: " + this.volumen + "\nNumero: " + this.numero + "\nMes: " + this.mes;
    }
}
