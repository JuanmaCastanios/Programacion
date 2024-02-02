
package Tema6.Ejercicios.Amarres;

/**
 *
 * @author bladiaju
 */
public class Barco {
    //Atributos
    private String matricula;
    private double eslora;
    private String amarre;
    private int añoFabricacion;
    
    //Constructores
    public Barco(String matricula, double eslora, int añoFabricacion){
        this.matricula = matricula;
        this.eslora =  eslora;
        this.añoFabricacion = añoFabricacion;
        amarre = "";
                
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getEslora() {
        return eslora;
    }

    public void setEslora(double eslora) {
        this.eslora = eslora;
    }

    public String getAmarre() {
        return amarre;
    }

    public void setAmarre(String amarre) {
        this.amarre = amarre;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }
    
    
}
