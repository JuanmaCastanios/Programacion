
package Tema9.Ejercicios.Teclado;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author bladiaju
 */
public class ControladorVentana implements KeyListener{
    private VistaTeclado ventana;
    
    public ControladorVentana (VistaTeclado ventana){
        this.ventana = ventana;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.isControlDown() && e.getKeyCode() == KeyEvent.VK_INSERT){
            this.ventana.getCampo_texto().setEditable(true);
        } else if (e.isControlDown() && e.getKeyCode() == KeyEvent.VK_DELETE){
            this.ventana.getCampo_texto().setEditable(false);
        } else if (e.isAltDown() && e.getKeyCode() == KeyEvent.VK_DOWN){
            System.exit(0);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }
}
