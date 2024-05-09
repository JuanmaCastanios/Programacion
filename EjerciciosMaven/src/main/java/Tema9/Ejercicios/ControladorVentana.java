
package Tema9.Ejercicios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author bladiaju
 * 
 * Clase que va a ser el Listener de la ventana EjemploFoco
 */
public class ControladorVentana implements ActionListener{
    
    private EjemploFoco ventana;
    public ControladorVentana(EjemploFoco ventana){
        this.ventana = ventana;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        //Programar los botones
        if(((JButton) e.getSource()) == ventana.getjButton1()){
            System.out.println("Pulsado boton 1");
        }
        if(((JButton) e.getSource()) == ventana.getjButton2()){
            System.out.println("Pulsado boton 2");
        }
        
    }
    
}
