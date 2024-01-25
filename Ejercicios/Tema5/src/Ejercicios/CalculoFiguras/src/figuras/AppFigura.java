package figuras;

import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author bladiaju
 */
public class AppFigura extends javax.swing.JFrame {
    /**
     * Creates new form AppFigura
     */
    public AppFigura() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonCuadrado2 = new javax.swing.JButton();
        botonCuadrado = new javax.swing.JButton();
        botonRectangulo = new javax.swing.JButton();
        botonTriangulo = new javax.swing.JButton();
        botonCirculo = new javax.swing.JButton();

        botonCuadrado2.setText("Cuadrado");
        botonCuadrado2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCuadrado2MouseClicked(evt);
            }
        });
        botonCuadrado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCuadrado2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        botonCuadrado.setText("Cuadrado");
        botonCuadrado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCuadradoMouseClicked(evt);
            }
        });

        botonRectangulo.setText("Rectangulo");
        botonRectangulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRectanguloMouseClicked(evt);
            }
        });
        botonRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRectanguloActionPerformed(evt);
            }
        });

        botonTriangulo.setText("Triangulo");
        botonTriangulo.setToolTipText("");
        botonTriangulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonTrianguloMouseClicked(evt);
            }
        });
        botonTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonTrianguloActionPerformed(evt);
            }
        });

        botonCirculo.setText("Circulo");
        botonCirculo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCirculoMouseClicked(evt);
            }
        });
        botonCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCirculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonRectangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonCuadrado, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCirculo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonTriangulo, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonCuadradoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCuadradoMouseClicked
        Cuadrado figura = new Cuadrado(Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el lado: ", "CUADRADO", 3)));
        JOptionPane.showMessageDialog(null, figura, "CUADRADO", 1);
        if(JOptionPane.showConfirmDialog(null, "Deseas mover el punto?") == 0){
            
        }
        else{
            
        }
    }//GEN-LAST:event_botonCuadradoMouseClicked

    private void botonRectanguloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRectanguloMouseClicked
        this.setVisible(false);
        Rectangulo figura = new Rectangulo(Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el base: ", "RECTANGULO", 3)), Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el altura: ", "CUADRADO", 3)));
        JOptionPane.showMessageDialog(null, figura, "RECTANGULO", 1);
        this.setVisible(true);
    }//GEN-LAST:event_botonRectanguloMouseClicked

    private void botonRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRectanguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRectanguloActionPerformed

    private void botonCuadrado2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCuadrado2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCuadrado2MouseClicked

    private void botonCuadrado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCuadrado2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCuadrado2ActionPerformed

    private void botonTrianguloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonTrianguloMouseClicked
        Triangulo figura = new Triangulo(Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el base: ", "TRIANGULO", 3)), Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el altura: ", "CUADRADO", 3)));
        JOptionPane.showMessageDialog(null, figura, "TRIANGULO", 1);
    }//GEN-LAST:event_botonTrianguloMouseClicked

    private void botonTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonTrianguloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonTrianguloActionPerformed

    private void botonCirculoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCirculoMouseClicked
        Circulo figura = new Circulo(Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce el radio: ", "CIRCULO", 3)));
        JOptionPane.showMessageDialog(null, figura, "CIRCULO", 1);
    }//GEN-LAST:event_botonCirculoMouseClicked

    private void botonCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCirculoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCirculoActionPerformed

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
            java.util.logging.Logger.getLogger(AppFigura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AppFigura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AppFigura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AppFigura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AppFigura().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCirculo;
    private javax.swing.JButton botonCuadrado;
    private javax.swing.JButton botonCuadrado2;
    private javax.swing.JButton botonRectangulo;
    private javax.swing.JButton botonTriangulo;
    // End of variables declaration//GEN-END:variables
}
