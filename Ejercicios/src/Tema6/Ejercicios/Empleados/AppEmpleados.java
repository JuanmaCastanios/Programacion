package Tema6.Ejercicios.Empleados;

import java.text.NumberFormat;
import java.util.Locale;

public class AppEmpleados {
    public static void main(String[] args) {
        EmpleadoHoras eh1 = new EmpleadoHoras("Juan", "Blanco", "56123512Z", 15, 160);
        EmpleadoTemporal et1 = new EmpleadoTemporal("Alejandro", "'Gusi'", "56123512Z", 1800);
        calcularSueldoEmpleados(eh1);
        calcularSueldoEmpleados(et1);
    }
    
    public static void calcularSueldoEmpleados(Empleado e){
        NumberFormat formato = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        
        System.out.println("Sueldo mensual de " + e.getNombre() + " " + e.getApellidos() + " : " + formato.format(e.calculoSueldo()));
    }
}
    
