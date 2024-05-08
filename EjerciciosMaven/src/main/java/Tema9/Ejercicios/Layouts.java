
package Tema9.Ejercicios;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.Box;
import javax.swing.Box.Filler;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author bladiaju
 */
public class Layouts extends javax.swing.JFrame implements MouseListener{

    /**
     * Creates new form Layouts
     */
    private  int cont = 0;
    public Layouts() {
        initComponents();
        setFrame();
        setFlowLayout();
        setGridBagLayout();
        setBorderLayout();
        setBoxLayout();
        setGridLayout();
    }
    
    private void setFrame(){
        this.setTitle("Administradores de diseño");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
    private JButton crearBoton(){
        JButton boton = new JButton(String.valueOf(++cont));
        boton.addMouseListener(this);
        return boton;
    }
    
    private void setFlowLayout(){
        for (int i = 0; i < 10; i++) {
            this.panelFlow.add(crearBoton());  
        }
    }
    
    private void setGridBagLayout(){
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridheight = 4;
        constraints.weighty = 1.0;
        constraints.fill = GridBagConstraints.VERTICAL;
        this.panelGridBag.add(crearBoton(), constraints); //Boton 11
        constraints.gridx = 1;
        constraints.gridy = 0;
        constraints.gridheight = 1;
        this.panelGridBag.add(crearBoton(), constraints); //Boton 12
        constraints.gridx = 1;
        constraints.gridy = 1;
        constraints.gridheight = 1;
        this.panelGridBag.add(crearBoton(), constraints); //Boton 13
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridheight = 1;
        this.panelGridBag.add(crearBoton(), constraints); //Boton 14
        constraints.gridx = 1;
        constraints.gridy = 3;
        constraints.gridheight = 1;
        this.panelGridBag.add(crearBoton(), constraints); //Boton 15
    }
    
    private void setBorderLayout(){
        this.panelBorder.add(crearBoton(), BorderLayout.CENTER);
        this.panelBorder.add(crearBoton(), BorderLayout.NORTH);
        this.panelBorder.add(crearBoton(), BorderLayout.WEST);
        this.panelBorder.add(crearBoton(), BorderLayout.EAST);
        this.panelBorder.add(crearBoton(), BorderLayout.SOUTH);
    }
    
    private void setBoxLayout(){
        this.panelBox.setPreferredSize(new Dimension(100,0));
        for (int i = 0; i < 10; i++) {
            this.panelBox.add(crearBoton());   
        }
    }
    private void setGridLayout(){
        for (int i = 0; i < 20; i++) {
            this.panelGrid.add(crearBoton());   
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBox = new javax.swing.JPanel();
        panelGridBag = new javax.swing.JPanel();
        panelFlow = new javax.swing.JPanel();
        panelGrid = new javax.swing.JPanel();
        panelBorder = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelBox.setBorder(javax.swing.BorderFactory.createTitledBorder("Box"));
        panelBox.setLayout(new javax.swing.BoxLayout(panelBox, javax.swing.BoxLayout.PAGE_AXIS));
        getContentPane().add(panelBox, java.awt.BorderLayout.LINE_END);

        panelGridBag.setBorder(javax.swing.BorderFactory.createTitledBorder("GridBag"));
        panelGridBag.setLayout(new java.awt.GridBagLayout());
        getContentPane().add(panelGridBag, java.awt.BorderLayout.LINE_START);

        panelFlow.setBorder(javax.swing.BorderFactory.createTitledBorder("Flow"));
        panelFlow.setPreferredSize(new java.awt.Dimension(591, 100));
        panelFlow.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 40, 5));
        getContentPane().add(panelFlow, java.awt.BorderLayout.PAGE_START);

        panelGrid.setBorder(javax.swing.BorderFactory.createTitledBorder("Grid"));
        panelGrid.setLayout(new java.awt.GridLayout(0, 5));
        getContentPane().add(panelGrid, java.awt.BorderLayout.PAGE_END);

        panelBorder.setBackground(new java.awt.Color(255, 142, 142));
        panelBorder.setBorder(javax.swing.BorderFactory.createTitledBorder("Border"));
        panelBorder.setLayout(new java.awt.BorderLayout());
        getContentPane().add(panelBorder, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Layouts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Layouts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Layouts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Layouts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Layouts().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panelBorder;
    private javax.swing.JPanel panelBox;
    private javax.swing.JPanel panelFlow;
    private javax.swing.JPanel panelGrid;
    private javax.swing.JPanel panelGridBag;
    // End of variables declaration//GEN-END:variables

    @Override
    public void mouseClicked(MouseEvent e) {
        JOptionPane.showMessageDialog(this, "Has pulsado el boton " + ((JButton)e.getSource()).getText());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
       
    }
}
