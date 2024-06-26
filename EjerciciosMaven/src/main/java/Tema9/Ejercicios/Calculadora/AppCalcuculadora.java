/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Tema9.Ejercicios.Calculadora;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;

/**
 *
 * @author bladiaju
 */
public class AppCalcuculadora extends javax.swing.JFrame {

    /**
     * Creates new form AppCalcuculadora
     */
    public AppCalcuculadora() {
        initComponents();
        setFrame();
        realizarOperacion();
        cerrarAplicacion();
    }

    private void setFrame(){
        this.setLocationRelativeTo(null);
        this.setTitle("Calculadora");
        this.setSize(387, 245);
        this.setResizable(false);
        this.texto_resultado.setEditable(false);
    }
    
    private void realizarOperacion(){
        ControladorCalculadora controlador = new ControladorCalculadora(this);
        this.boton_suma.addKeyListener(controlador);
        this.boton_resta.addKeyListener(controlador);
        this.boton_multiplicacion.addKeyListener(controlador);
        this.boton_division.addKeyListener(controlador);
    }
    
    private void cerrarAplicacion(){
        KeyListener listener = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
                    System.exit(0);
                }
        
            }

            @Override
            public void keyReleased(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
            }
        };
        
        this.addKeyListener(listener);
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
        jLabel1 = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(5, 32767));
        texto_num1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(5, 32767));
        texto_num2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        boton_suma = new javax.swing.JButton();
        boton_resta = new javax.swing.JButton();
        boton_multiplicacion = new javax.swing.JButton();
        boton_division = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(5, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(5, 32767));
        texto_resultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.X_AXIS));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Número 1:");
        jPanel1.add(jLabel1);
        jPanel1.add(filler1);

        texto_num1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        texto_num1.setText("0");
        jPanel1.add(texto_num1);

        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Número 2:");
        jPanel2.add(jLabel2);
        jPanel2.add(filler3);

        texto_num2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        texto_num2.setText("0");
        jPanel2.add(texto_num2);

        boton_suma.setText("+");
        jPanel3.add(boton_suma);

        boton_resta.setText("-");
        jPanel3.add(boton_resta);

        boton_multiplicacion.setText("X");
        jPanel3.add(boton_multiplicacion);

        boton_division.setText("/");
        jPanel3.add(boton_division);

        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Resultado: ");
        jPanel4.add(jLabel3);
        jPanel4.add(filler2);

        texto_resultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        texto_resultado.setText("0");
        jPanel4.add(texto_resultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

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
            java.util.logging.Logger.getLogger(AppCalcuculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppCalcuculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppCalcuculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppCalcuculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppCalcuculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_division;
    private javax.swing.JButton boton_multiplicacion;
    private javax.swing.JButton boton_resta;
    private javax.swing.JButton boton_suma;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField texto_num1;
    private javax.swing.JTextField texto_num2;
    private javax.swing.JTextField texto_resultado;
    // End of variables declaration//GEN-END:variables

    public javax.swing.JButton getBoton_division() {
        return boton_division;
    }

    public void setBoton_division(javax.swing.JButton boton_division) {
        this.boton_division = boton_division;
    }

    public javax.swing.JButton getBoton_multiplicacion() {
        return boton_multiplicacion;
    }

    public void setBoton_multiplicacion(javax.swing.JButton boton_multiplicacion) {
        this.boton_multiplicacion = boton_multiplicacion;
    }

    public javax.swing.JButton getBoton_resta() {
        return boton_resta;
    }

    public void setBoton_resta(javax.swing.JButton boton_resta) {
        this.boton_resta = boton_resta;
    }

    public javax.swing.JButton getBoton_suma() {
        return boton_suma;
    }

    public void setBoton_suma(javax.swing.JButton boton_suma) {
        this.boton_suma = boton_suma;
    }

    public javax.swing.JTextField getTexto_num1() {
        return texto_num1;
    }

    public void setTexto_num1(javax.swing.JTextField texto_num1) {
        this.texto_num1 = texto_num1;
    }

    public javax.swing.JTextField getTexto_num2() {
        return texto_num2;
    }

    public void setTexto_num2(javax.swing.JTextField texto_num2) {
        this.texto_num2 = texto_num2;
    }

    public javax.swing.JTextField getTexto_resultado() {
        return texto_resultado;
    }

    public void setTexto_resultado(javax.swing.JTextField texto_resultado) {
        this.texto_resultado = texto_resultado;
    }
    
}
