
package Tema8.Ejemplos.FicherosCSV;

import com.opencsv.bean.CsvBindByName;

/**
 *
 * @author bladiaju
 */
public class Empleado {
    //Atributos 
    @CsvBindByName (column = "EMPLOYEE_ID")
    private int id;
    @CsvBindByName (column = "FIRST_NAME")
    private String nombre;
    @CsvBindByName (column = "LAST_NAME")
    private String apellido;
    @CsvBindByName (column = "DEPARTMENT_NAME")
    private String departamento;
    
    //Constructores
    public Empleado(){
        
    }
    
    //Metodos

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return + id + " | " + nombre + " | " + apellido + " | " + departamento;
    }
    
    
    
    
}
