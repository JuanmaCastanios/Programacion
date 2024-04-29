package Tema5.Ejercicios.PuntoCentro;

public class AppPunto {
    public static void main(String[] args) {
        PuntoV2 p1 = new PuntoV2(5, 3);
        PuntoV2 p2 = new PuntoV2(7, 3);
        //Comparar puntos
        System.out.println(p1.equals(p2));

        System.out.println(p1.compareTo(p2));
        System.out.println(p2.compareTo(p1));
    }
}