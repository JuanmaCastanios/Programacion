package Ejemplos;

public class CrearException extends Exception { // Heredar la clase Exception
    // Constructor
    public CrearException(String mensaje){
        super(mensaje); // Llamada al constructor padre (Exception)
    }
}
