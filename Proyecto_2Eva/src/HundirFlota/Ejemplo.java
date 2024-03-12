/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HundirFlota;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author fuehered
 */
public class Ejemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String[] cord=new String[5];
        Arrays.fill(cord, "A1");
        
        String[] cord2=new String[2];
        cord2[0]="A2";
        cord2[1]="A3";
        
        Coordenadas c1=new Coordenadas(cord);
        Coordenadas c2=new Coordenadas(cord2);
        
        System.out.println(c1);
        System.out.println(c1.equals(c2));
        System.out.println(c1.compareTo(c2));
        
        
        Jugador j1=new Jugador("Pepe");
        System.out.println(j1);
        
        System.out.println(j1.toString().replace(" ", ""));
        
        ArrayList<Barco> p1=new ArrayList<>();
        
        
    }
    
}
