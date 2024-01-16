package Ejercicios.Persona;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;

public class AppPersona {
    public static void main(String[] args) {
        Persona maria = new Persona("12345678A");
        System.out.println(maria);

        Persona [] lista = new Persona[5];
        lista[0] = new Persona("11111111A");
        lista[1] = new Persona("22222222B");
        lista[2] = new Persona("33333333C");
        lista[3] = new Persona("44444444D");
        lista[4] = new Persona("55555555E");
        
        lista[0].setFechaNacimiento(LocalDate.of(2000, Month.MARCH, 1));
        lista[1].setFechaNacimiento(LocalDate.of(1983, Month.MARCH, 1));
        lista[2].setFechaNacimiento(LocalDate.of(2009, Month.MARCH, 1));
        lista[3].setFechaNacimiento(LocalDate.of(1949, Month.MARCH, 1));
        lista[4].setFechaNacimiento(LocalDate.of(2020, Month.MARCH, 1));
        Arrays.sort(lista);
        System.out.println(Arrays.toString(lista));
    }
}
