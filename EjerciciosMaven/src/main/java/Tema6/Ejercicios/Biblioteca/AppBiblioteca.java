
package Tema6.Ejercicios.Biblioteca;

/**
 *
 * @author bladiaju
 */
public class AppBiblioteca {
    public static void main(String[] args) {
        DocumentoDigital l1 = new DocumentoDigital(12563, "El Quijote", "Cervantes", "Austral", 1567, "Profesional");
        RevistaMicrofilmada r1 = new RevistaMicrofilmada(12312476, "asdasfa", "safdsfs", "Salvat", 2024, 56, 8, "Enero", "12V3F12J");
        Consulta c1 = new Consulta("12312354A",r1);
        System.out.println(c1);
    }
}
