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
    private int impactos = 0; //Numero de impactos recibidos

    //Constructor
    public Jugador(String nick) {
        this.nick = nick;
        this.tab = new char[10][10];
        llenarTablero();
    }

    /**
     * getNick muestra el nombre del jugador
     *
     * @return Nombre jugador
     */
    public String getNick() {
        return nick;
    }

    /**
     * getTab muestra el tablero del jugador
     *
     * @return Tablero jugador
     */
    public char[][] getTab() {
        return tab;
    }

    /**
     * setNick asigna un nombre al objeto jugador
     *
     * @param nick Nombre del jugador
     */
    public void setNick(String nick) {
        this.nick = nick;
    }

    /**
     * setTab asigna un tablero al objeto jugador
     *
     * @param tab Tablero del jugador
     */
    public void setTab(char[][] tab) {
        this.tab = tab;
    }
    
    /**
     * getImpactos muestra el numero de impactos
     * @return Numero impactos
     */
    public int getImpactos() {
        return impactos;
    }
    
    /**
     * setImpactos asigna un numero de impactos al objeto jugador
     * @param impactos Numero impactos
     */
    public void setImpactos(int impactos) {
        this.impactos = impactos;
    }
    
    /**
     * llenarTablero rellena el tablero con el caracter 'A'.
     */
    public void llenarTablero() {
        for (int i = 0; i < tab.length; i++) {
            Arrays.fill(tab[i], 'A'); //'A' representa agua
        }

    }
    /**
     * cambiarCasilla cambia el caracter si ha acertado o fallado el disparo en la coordenada indicada.
     * @param coord Coordenada de disparo
     * @param resultado caracter a asignar
     */
    public void cambiarCasilla(String coord, char resultado) {
        char letra = coord.toUpperCase().charAt(0); //Obtenemos la letra de las coordenadas
        int num = Integer.parseInt(coord.substring(1)); //Obtenemos el numero de las coordenadas
        this.tab[num][letra - 65] = resultado; //Asigna el resultado dependiendo si ha acertado o fallado la posicion del disparo
    }

    /**
     * impacto realiza el disparo a una casilla
     *
     * @param i Cadena de coordenadas donde se dispara
     */
    public char impacto(String i) {
        char cas = 'e';
        //Si no es de longitud 2, lo tratamos como un error
        if (i.length() == 2) {
            char letra = i.substring(0, 1).charAt(0); //Obtenemos la letra de las coordenadas
            int num = Integer.parseInt(i.substring(1)); //Obtenemos el numero de las coordenadas
            //Dependiendo de que letra sea, se elige iuna casilla del tablero
            switch (letra) {
                case 'A':
                    cas = tab[num][0];
                    break;
                case 'B':
                    cas = tab[num][1];
                    break;
                case 'C':
                    cas = tab[num][2];
                    break;
                case 'D':
                    cas = tab[num][3];
                    break;
                case 'E':
                    cas = tab[num][4];
                    break;
                case 'F':
                    cas = tab[num][5];
                    break;
                case 'G':
                    cas = tab[num][6];
                    break;
                case 'H':
                    cas = tab[num][7];
                    break;
                case 'I':
                    cas = tab[num][8];
                    break;
                case 'J':
                    cas = tab[num][9];
                    break;
                default:
                    //Si esa letra no esta, se trata como un error
                    JOptionPane.showMessageDialog(null, "Error. Coordenadas mal introducidas", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Error. Longitud de coordenada inexistente", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return cas;
    }
    
    /**
     * disparo recoge la casilla donde dispara el jugador.
     * @param coord Coordenada donde se dispara
     * @return Coordenada donde se dispara
     */
    public String disparo(String coord) {
        return coord;
    }

    /**
     * toString muestra el tablero acumulandolo en una cadena
     *
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
