package Tema6.Ejercicios.Empleados;


public class EmpleadoHoras extends Empleado{
    //Atributos
    private int horasTrabajadas;
    private double salarioHora;
    //Constructores
    public EmpleadoHoras(String nombre, String apellidos, String dni, int salarioHora, int horasTrabajadas){
        super(nombre, apellidos, dni);
        this.horasTrabajadas = horasTrabajadas;
        this.salarioHora = salarioHora;
    }
    //Metodos
    public double getHorasTrabajasdas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajasdas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(int salarioHora) {
        this.salarioHora = salarioHora;
    }

    @Override
    public double calculoSueldo(){
        return salarioHora * horasTrabajadas;
    }

    @Override
    public String toString(){
        return "Empleado por Horas\nNombre: " + this.nombre + "\nApellidos: " + this.apellidos + "\nDNI: " + this.dni + "\nSueldo: " + calculoSueldo() + "\nHoras Trabajadas " + this.horasTrabajadas + "\nSalario por Horas: " + this.salarioHora;
    }
}
