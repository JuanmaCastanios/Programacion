
package Tema8.Ejemplos.FTexto;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author bladiaju
 */
public class LecturaEscrituraTexto1 extends javax.swing.JFrame {

    /**
     * Creates new form LecturaEscrituraTexto1
     */
    public LecturaEscrituraTexto1() {
        initComponents();
        
        this.setTitle("Lectura y escritura de un fichero de texto");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_abrir = new javax.swing.JButton();
        btn_grabar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_abrir.setText("Abril");
        btn_abrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_abrirActionPerformed(evt);
            }
        });

        btn_grabar.setText("Grabal");
        btn_grabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_grabarActionPerformed(evt);
            }
        });

        resultado.setColumns(20);
        resultado.setRows(5);
        jScrollPane2.setViewportView(resultado);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btn_abrir)
                        .addGap(40, 40, 40)
                        .addComponent(btn_grabar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_abrir)
                    .addComponent(btn_grabar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_abrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_abrirActionPerformed
        //Seleccionar fichero que se quiere abrir
        File f = seleccionarFile("r");
        if(f == null) return;

        FileReader fr = null;
        BufferedReader br = null;
        String linea;
        try {
            //Apertura
            fr = new FileReader(f);
            br = new BufferedReader(fr);
            //Abrimos el texto
            while ((linea = br.readLine()) != null) {
                this.resultado.append(linea);
                this.resultado.append("\n");
            }
            
        } catch (EOFException ex){
            JOptionPane.showMessageDialog(this, "Fin lectura", "Grabacion Fichero", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al escribir en el fichero", "Grabacion Fichero", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error", "Grabacion Fichero", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                br.close();
                fr.close();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btn_abrirActionPerformed

    private void btn_grabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_grabarActionPerformed
        //Seleccionar fichero donde grabar
        File f = seleccionarFile("w");
        if(f == null) return;
        //Grabamos los daots en el fichero
        FileWriter fw = null;
        BufferedWriter bw = null;
        
        try {
            //Apertura
            fw = new FileWriter(f, true);
            bw = new BufferedWriter(fw);
            //Grabamos texto
            
            
            bw.write(this.resultado.getText() + "\n");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al escribir en el fichero", "Grabacion Fichero", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error", "Grabacion Fichero", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btn_grabarActionPerformed

    public File seleccionarFile(String modo) {

        JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        jfc.setDialogTitle("Elije el directorio");
        File file = null; //referencia al archivo
        int resp = jfc.showDialog(this, (modo.equals("r")?"Abrir":"Cerrar"));
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
            java.util.logging.Logger.getLogger(LecturaEscrituraTexto1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LecturaEscrituraTexto1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LecturaEscrituraTexto1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LecturaEscrituraTexto1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LecturaEscrituraTexto1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_abrir;
    private javax.swing.JButton btn_grabar;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea resultado;
    // End of variables declaration//GEN-END:variables
}
