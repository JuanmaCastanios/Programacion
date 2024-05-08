
package Tema8.Ejercicios.Ficheros;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author bladiaju
 */
public class Ejercicio2 extends javax.swing.JFrame {
        File f1 = null;
        File f2 = null;
    /**
     * Creates new form Ejercicio2
     */
    public Ejercicio2() {
        initComponents();
        setFrame();
    }
    
    public void setFrame(){
        this.setTitle("Ejercicio 2");
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
        btn_fichero1 = new javax.swing.JButton();
        btn_fichero2 = new javax.swing.JButton();
        label_fichero1 = new javax.swing.JLabel();
        label_fichero2 = new javax.swing.JLabel();
        btn_compartir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Gusi"));

        btn_fichero1.setText("Fichero 1");
        btn_fichero1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fichero1ActionPerformed(evt);
            }
        });

        btn_fichero2.setText("Fichero 2");
        btn_fichero2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fichero2ActionPerformed(evt);
            }
        });

        btn_compartir.setText("Compartir");
        btn_compartir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_compartirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_compartir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_fichero2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(label_fichero2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btn_fichero1)
                                .addGap(18, 18, 18)
                                .addComponent(label_fichero1, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 5, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_fichero1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_fichero1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_fichero2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(label_fichero2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btn_compartir, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_compartirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_compartirActionPerformed
        if(f1 != null && f2 != null){
            boolean resultado = compararFicheros();
            if(resultado == true){
                JOptionPane.showMessageDialog(this, "Los ficheros son iguales", "Comparacion Ficheros", JOptionPane.INFORMATION_MESSAGE);
            } else{
                JOptionPane.showMessageDialog(this, "Los ficheros no son iguales", "Comparacion Ficheros", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_compartirActionPerformed

    private void btn_fichero2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fichero2ActionPerformed
        f2 = seleccionarFile();
        if(f2 != null){
            this.label_fichero2.setText(f2.getAbsolutePath());
        }
    }//GEN-LAST:event_btn_fichero2ActionPerformed

    private void btn_fichero1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fichero1ActionPerformed
        f1 = seleccionarFile();
        if(f1 != null){
            this.label_fichero1.setText(f1.getAbsolutePath());
        }

    }//GEN-LAST:event_btn_fichero1ActionPerformed
    
    private boolean compararFicheros(){
        try (BufferedReader br1 = new BufferedReader( new FileReader(f1));
            BufferedReader br2 = new BufferedReader( new FileReader(f2))){
            
            String linea1;
            String linea2;
            while((linea1 = br1.readLine()) != null && (linea2 = br2.readLine()) != null){
                if(linea1.length() != linea2.length()) return false;
            }
            
        }catch (FileNotFoundException ex){
            JOptionPane.showMessageDialog(this, "Error al abrir el fichero", "Ejercicio2", JOptionPane.ERROR_MESSAGE);
        }catch (IOException ex){
            JOptionPane.showMessageDialog(this, "Error al grabar el fichero", "Ejercicio2", JOptionPane.ERROR_MESSAGE);
        }
        return true; //Son iguales
    }
    
    public File seleccionarFile() {

        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        jfc.setDialogTitle("Elije el directorio");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto", "txt");
        jfc.addChoosableFileFilter(filter);
        File file = null; //referencia al archivo
        int resp = jfc.showOpenDialog(this);
        if (resp == JFileChooser.APPROVE_OPTION) {
            file = jfc.getSelectedFile();
        }
        return file;
    }
    
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
            java.util.logging.Logger.getLogger(Ejercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_compartir;
    private javax.swing.JButton btn_fichero1;
    private javax.swing.JButton btn_fichero2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel label_fichero1;
    private javax.swing.JLabel label_fichero2;
    // End of variables declaration//GEN-END:variables
}