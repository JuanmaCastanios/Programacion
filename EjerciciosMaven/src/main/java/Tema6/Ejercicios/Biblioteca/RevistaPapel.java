
package Tema6.Ejercicios.Biblioteca;



/**
 *
 * @author bladiaju
 */
public class RevistaPapel extends LibroPapel{
    //Atributos
    protected int volumen;
    protected int numero;
    protected String mes;
    //Cosntructor
    public RevistaPapel(int codigo, String titulo, String autor, String editorial, int anioPublicacion, int volumen, int numero, String mes){
        super(codigo, titulo, autor, editorial, anioPublicacion);
        this.volumen = volumen;
        this.numero = numero;
        this.mes = mes;
    }
    //Metodo

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }
    
    @Override
    public String toString(){
        return "Codigo: " + this.codigo + "\nTitulo: " + this.titulo + "\nAutor: " + this.autor + "\nEditorial: " + this.editorial + "\nAnioPublicacion: " + this.anioPublicacion + "\nVolumen: " + this.volumen + "\nNumero: " + this.numero + "\nMes: " + this.mes;
    }
}
