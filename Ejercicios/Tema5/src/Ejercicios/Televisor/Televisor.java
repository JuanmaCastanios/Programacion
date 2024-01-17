package Televisor;

public class Televisor {

    //Atributos
    private String numeroSerie;
    private double tamañoPulgada;
    private int numeroCanales;
    private int canalActual;
    private int volumen;
    private boolean encendido;
    private boolean silenciado;
    private final int VOLUMENMAX = 30;
   

    //Contructor
    public Televisor(String numeroSerie, double tamañoPulgada, int numeroCanales){
        this.numeroSerie = numeroSerie;
        this.tamañoPulgada = tamañoPulgada;
        this.numeroCanales = numeroCanales;
        canalActual = 1;
        volumen = 15;
        encendido = false;
        silenciado = false;
    }

    //Métodos
    public void setEncendido(boolean encendido){
        this.encendido = encendido;
        if (this.encendido == true){
            canalActual = 1;
        } 
    }
    public void setSilenciado(boolean silenciado){
        this.silenciado = silenciado;
    }

    public void setCanalActual(int canalActual){
        if(canalActual <= numeroCanales && canalActual >= 0){
            this.canalActual = canalActual;
        }
        
    }

    public void subirCanal(){
        canalActual += 1;
        if (canalActual > numeroCanales){
            canalActual = 1;
        }
    }

    public void bajarCanal(){
        canalActual -= 1;
        if (canalActual < 1){
            canalActual = numeroCanales;
        }
    }

    public void subirVolumen(){
        volumen += 1;
        if (volumen > VOLUMENMAX){
            volumen -= 1;
        }
    }

    public void bajarVolumen(){
        volumen -= 1;
        if (volumen < 0){
            volumen += 1;
        }
        if (volumen == 0){
            silenciado = true;
        }
    }

    @Override
    public String toString(){
        return "Numero de Serie: " + numeroSerie + " Pulgadas: " + tamañoPulgada + "\nEncendido: " + encendido + " Silenciado: " + silenciado + "\nCanal: " + canalActual + " Volumen: " + volumen;
    }
}
