
package Tema6.Ejemplos.Ejemplo1Empleados;

/**
 *
 * @author Juan José Blanco Díaz
 */
public class Programador extends Empleado{
    //Estado
    private double horas;
    private double precioHora;
    
    public Programador(){
        super(); //Llama al constructor por def. de la clase base(Empleado)
        System.out.println("Se crea un progamador por defecto");
    }
    
    public Programador(String nombre, String apellidos, double salarioBase,
                        double horas, double precioHora){
        super(nombre, apellidos, salarioBase);
        System.out.println("Se crea un progamador por parametros");
        this.horas = horas;
        this.precioHora = precioHora;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public double getPrecioHora() {
        return precioHora;
    }

    public void setPrecioHora(double precioHora) {
        this.precioHora = precioHora;
    }
    //redefinimos el metodo para calcular el salario
    @Override
    public double calcularSalario(){
        double salario = super.calcularSalario();
        return (salario + (this.horas * this.precioHora));
    }
    //Sobrecarga del metodo calcularSalario()
    public double calcularSalario(double prima, double retencion){
        double salario = calcularSalario(prima);
        double proyecto = this.horas * this.precioHora;
        return salario + proyecto - retencion;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + getNombre() + ", Apellidos: " + getApellidos() + ", Salario Base: " + getSalarioBase() + ", Horas trabajadas: " + getHoras()+ ", Salario por hora: " + getPrecioHora();
    }
}
