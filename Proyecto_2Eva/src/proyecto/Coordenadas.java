/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.Arrays;

/**
 *
 * @author fuehered
 */
public class Coordenadas implements Comparable<Coordenadas> {

    private String[] cord;

    public Coordenadas(String[] cord) {
            this.cord = cord;      
    }

    public Coordenadas() {
    }

    public String[] getCord() {
        return cord;
    }

    public void setCord(String[] cord) {
        this.cord = cord;
    }

    @Override
    public String toString() {
        return Arrays.toString(cord);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Coordenadas other = (Coordenadas) obj;
        return Arrays.deepEquals(this.cord, other.cord);
    }

    @Override
    public int compareTo(Coordenadas o) {
        for (int i = 0; i < this.cord.length; i++) {
            for (int j = 0; j < o.cord.length; j++) {
                if (this.cord[i].equals(o.cord[j])) {
                    return 0;
                }
            }
        }
        return 1;
    }

}
