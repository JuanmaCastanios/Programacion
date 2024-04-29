
package Tema6.Ejemplos.Ejemplo1Empleados;

/**
 *
 * @author Juan José Blanco Díaz
 */
public class App {
    public static void main(String[] args) {
        Programador prog = new Programador();
        prog.setNombre("Pepe");
        prog.setApellidos("Hernandez Gutierrez");
        prog.setSalarioBase(1000);
        prog.setHoras(100);
        prog.setPrecioHora(25);
        System.out.println(prog);
        System.out.println("Salario Base: " + prog.calcularSalario());
        
        Empleado e1 = new Empleado();
        e1.setNombre("");
        
        Programador prog2 = new Programador("Maria", "Jimenez", 1000, 20, 30);
        System.out.println(prog2);
        System.out.println("Salario Mes: " + prog2.calcularSalario());
        System.out.println("Salario Mes: " + prog2.calcularSalario(500));
        System.out.println("Salario Mes: " + prog2.calcularSalario(500, 800));
    }
}
