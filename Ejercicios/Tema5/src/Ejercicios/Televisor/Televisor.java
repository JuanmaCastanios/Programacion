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
    public void setEncendido(){
        if(encendido == true){
            encendido = false;
        }
        else{
            canalActual = 1;
            encendido = true;
        }
    }
    public void setSilenciado(){
        if(encendido == false){
            System.out.println("El televisor esta apagado");
        }
        else{
            if(silenciado == true){
                silenciado = false;
            }
            else{
                silenciado = true;
            }
        }
    }

    public void setCanalActual(int canalActual){
        if(encendido == false){
            System.out.println("El televisor esta apagado");
        }
        else{
            if(canalActual <= numeroCanales && canalActual >= 0){
                this.canalActual = canalActual;
            }
            else{
                System.out.println("ERROR.El canal no existe");
            }
        }
        
    }

    public void subirCanal(){
        if(encendido == false){
            System.out.println("El televisor esta apagado");
        }
        else{
            canalActual += 1;
            if (canalActual > numeroCanales){
                canalActual = 1;
            }
        }
    }

    public void bajarCanal(){
        if(encendido == false){
            System.out.println("El televisor esta apagado");
        }
        else{
            canalActual -= 1;
            if (canalActual < 1){
                canalActual = numeroCanales;
            }
        }
    }

    public void subirVolumen(){
        silenciado = false;
        if(encendido == false){
            System.out.println("El televisor esta apagado");
        }
        else{
            volumen += 1;
            if (volumen > VOLUMENMAX){
                volumen -= 1;
            }
        }
    }

    public void bajarVolumen(){
        silenciado = false;
        if(encendido == false){
            System.out.println("El televisor esta apagado");
        }
        else{
            volumen -= 1;
            if (volumen < 0){
                volumen += 1;
            }
            if (volumen == 0){
                silenciado = true;
            }
        }
    }

    @Override
    public String toString(){
        return "Numero de Serie: " + numeroSerie + " Pulgadas: " + tamañoPulgada + "\nEncendido: " + encendido + " Silenciado: " + silenciado + "\nCanal: " + canalActual + " Volumen: " + volumen;
    }
}
