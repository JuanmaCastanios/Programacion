
package HundirFlota;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Jose Blanco y Eduardo de la Fuente
 * @version 1.0
 * @since 11-03-2024
 */
public class Jugador {
    
    //Atributos
    private String nick; //Nombre del jugador
    private char[][] tab; //Matriz que representa el tablero del jugador

    //Constructor
    public Jugador(String nick) {
        this.nick = nick;
        this.tab = new char[10][10];
        llenarTablero();
    }
    
    /**
     * getNick muestra el nombre del jugador
     * @return Nombre jugador
     */
    public String getNick() {
        return nick;
    }
    
    /**
     * getTab muestra el tablero del jugador
     * @return Tablero jugador
     */
    public char[][] getTab() {
        return tab;
    }
    
    /**
     * setNick asigna un nombre al objeto jugador
     * @param nick Nombre del jugador
     */
    public void setNick(String nick) {
        this.nick = nick;
    }
    
    /**
     * setTab asigna un tablero al objeto jugador
     * @param tab Tablero del jugador
     */
    public void setTab(char[][] tab) {
        this.tab = tab;
    }
    
    /**
     * llenarTablero rellena el tablero con el caracter 'A'
     */
    public void llenarTablero() {

        for (int i = 0; i < tab.length; i++) {
            Arrays.fill(this.tab[i], 'A');
        }

    }
    
    /**
     * impacto recibe el disparo a una casilla
     * @param i Cadena de coordenadas donde se dispara
     */
    public void impacto(String i){
        if(i.length()==2){
            char letra=i.substring(0,1).charAt(0);
            int num=Integer.parseInt(i.substring(1));
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
                    JOptionPane.showMessageDialog(null, "Error. Coordenadas mal introducidas", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Error. Longitud de coordenada inexistente", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        
    }
    
    public String disparo(String d){
        return d;
    }
    
    /**
     * toString muestra el tablero acumulandolo en una cadena
     * @return 
     */
    @Override
    public String toString() {
        String tablero = "  A B C D E F G H I J\n";
        for (int i = 0; i < tab.length; i++) {
            tablero = tablero + i + " ";
            for (int j = 0; j < 10; j++) {
                tablero = tablero + tab[i][j] + " ";
            }
            tablero = tablero + "\n";
        }
        return tablero;
    }
}
