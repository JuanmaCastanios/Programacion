
package Tema6.Ejercicios.Biblioteca;

/**
 *
 * @author bladiaju
 */
public class LibroPapel {
    //Atributos
    protected int codigo;
    protected String titulo;
    protected String autor;
    protected String editorial;
    protected int anioPublicacion;
    //Constructor
    public LibroPapel(int codigo, String titulo, String autor, String editorial, int anioPublicacion){
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.anioPublicacion = anioPublicacion;
    }
    //Metodos

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
    
    @Override
    public String toString(){
        return "Codigo: " + this.codigo + "\nTitulo: " + this.titulo + "\nAutor: " + this.autor + "\nEditorial: " + this.editorial + "\nAnioPublicacion: " + this.anioPublicacion;
    }
}
