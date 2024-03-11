/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplo;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author fuehered
 */
public class Jugador {

    private String nick;
    private char[][] tab;

    public Jugador(String nick) {
        this.nick = nick;
        this.tab = new char[10][10];
        llenarTablero();
    }

    public String getNick() {
        return nick;
    }

    public char[][] getTab() {
        return tab;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public void setTab(char[][] tab) {
        this.tab = tab;
    }

    public void llenarTablero() {

        for (int i = 0; i < tab.length; i++) {
            Arrays.fill(this.tab[i], 'A');
        }

    }
    
    public void disparo(String d){
        if(d.length()==2){
            char letra=d.substring(0,1).charAt(0);
            int num=Integer.parseInt(d.substring(1));
            char cas;
            switch (letra){
                case 'A':
                    cas=tab[0][num];
                    break;
                case 'B':
                    cas=tab[1][num];
                    break;
                case 'C':
                    cas=tab[2][num];
                    break;
                case 'D':
                    cas=tab[3][num];
                    break;
                case 'E':
                    cas=tab[4][num];
                    break;
                case 'F':
                    cas=tab[5][num];
                    break;
                case 'G':
                    cas=tab[6][num];
                    break;
                case 'H':
                    cas=tab[7][num];
                    break;
                case 'I':
                    cas=tab[8][num];
                    break;
                case 'J':
                    cas=tab[9][num];
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error. Coordenadas mal introducidad", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }

    @Override
    public String toString() {
        String tablero = "";
        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < 10; j++) {
                tablero = tablero + tab[i][j] + " ";
            }
            tablero = tablero + "\n";
        }
        return tablero;
    }
}
