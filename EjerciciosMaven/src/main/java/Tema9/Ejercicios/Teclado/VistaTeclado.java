
package Tema9.Ejercicios.Teclado;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author bladiaju
 */
public class VistaTeclado extends javax.swing.JFrame {

    /**
     * Creates new form vistaTeclado
     */
    public VistaTeclado() {
        initComponents();
        setFrame();
    }

    public JButton getBoton_borrar() {
        return boton_borrar;
    }

    public void setBoton_borrar(JButton boton_borrar) {
        this.boton_borrar = boton_borrar;
    }

    public JTextArea getCampo_resultado() {
        return campo_resultado;
    }

    public void setCampo_resultado(JTextArea campo_resultado) {
        this.campo_resultado = campo_resultado;
    }

    public JTextField getCampo_texto() {
        return campo_texto;
    }

    public void setCampo_texto(JTextField campo_texto) {
        this.campo_texto = campo_texto;
    }
    
    private void setFrame(){
        this.setLocationRelativeTo(null);
        this.setTitle("Teclado");
        this.setSize(500, 250);
        this.setResizable(false);
        this.campo_resultado.setEditable(false);
        this.boton_borrar.setMnemonic('b');
        ControladorVentana controlador = new ControladorVentana(this);
        this.campo_texto.addKeyListener(controlador);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campo_texto = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        campo_resultado = new javax.swing.JTextArea();
        boton_borrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());
        jPanel1.add(campo_texto, java.awt.BorderLayout.PAGE_START);

        campo_resultado.setColumns(20);
        campo_resultado.setRows(5);
        jScrollPane1.setViewportView(campo_resultado);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        boton_borrar.setText("Borrar");
        boton_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_borrarActionPerformed(evt);
            }
        });
        jPanel1.add(boton_borrar, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_borrarActionPerformed
        this.campo_resultado.setText("");
        this.campo_texto.setText("");
    }//GEN-LAST:event_boton_borrarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaTeclado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaTeclado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaTeclado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaTeclado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaTeclado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_borrar;
    private javax.swing.JTextArea campo_resultado;
    private javax.swing.JTextField campo_texto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}