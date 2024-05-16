
package Tema9.Ejercicios.Calculadora;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;

/**
 *
 * @author bladiaju
 */
public class ControladorCalculadora implements KeyListener{
    
    private AppCalcuculadora ventana;
    
    public ControladorCalculadora (AppCalcuculadora ventana){
        this.ventana = ventana;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
            double num1 = Double.parseDouble(ventana.getTexto_num1().getText());
            double num2 = Double.parseDouble(ventana.getTexto_num2().getText());
        
            if(((JButton) e.getSource()) == ventana.getBoton_suma()){
                ventana.getTexto_resultado().setText(String.valueOf(num1 + num2));
            } else if (((JButton) e.getSource()) == ventana.getBoton_resta()){
                ventana.getTexto_resultado().setText(String.valueOf(num1 - num2));
            } else if(((JButton) e.getSource()) == ventana.getBoton_multiplicacion()){
                ventana.getTexto_resultado().setText(String.valueOf(num1 * num2));
            } else if(((JButton) e.getSource()) == ventana.getBoton_division()){
                ventana.getTexto_resultado().setText(String.valueOf(num1 / num2));
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
