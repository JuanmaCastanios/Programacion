/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HundirFlota;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author juanj
 */
public class sda {
    public static void pos(int i, Barco barco){
        String ini=JOptionPane.showInputDialog("Posicion Inicial del ");
        String fin=JOptionPane.showInputDialog("Posicion Final del " );
        
        if(ini.length()==2 && ini.length()==2){
            char xini=ini.toUpperCase().charAt(0);
            int yini=Integer.parseInt(ini.substring(1));
            char xfin=fin.toUpperCase().charAt(0);
            int yfin=Integer.parseInt(fin.substring(1));
            if(xini==xfin){
                String array[]= new String[barco.getLongitud()];
                for (int j = 0; j <= (yfin-yini); j++) {
                    array[j] = String.valueOf(xini) + String.valueOf((yini+j));
                }
                barco.setPosicion(new Coordenadas(array));
            }else if(yfin==yini){
                String array[]= new String[barco.getLongitud()];
                for (int j = 0; j <= (xfin-xini); j++) {
                    array[j] = String.valueOf((char)(xini + j)) + String.valueOf((yini));
                }
                barco.setPosicion(new Coordenadas(array));
            }
        }
        else{
            
        }
    }
    public static void main(String[] args) {
        Barco barco = new Barco("Portaviones", 5);
        pos(0, barco);
        System.out.println(barco.getPosicion());
    }
}
