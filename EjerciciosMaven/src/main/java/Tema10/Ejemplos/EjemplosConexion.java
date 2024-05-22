
package Tema10.Ejemplos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author fraferal
 */
public class EjemplosConexion extends javax.swing.JFrame {

    /**
     * Creates new form EjemplosConexion
     */
    
    public static String urlMySQL = "jdbc:mysql://localhost:3306/dam";
    public static String userMySQL = "root";
    public static String passwdMySQL = "";
    
    public static String urlOracle = "";
    
    
    public EjemplosConexion() {
        initComponents();
        setFrame();
    }
    
    private void setFrame(){
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.setTitle("Ejemplo CRUD JDBC");
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.texto_resultado.setEditable(false);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        texto_resultado = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuSGBD = new javax.swing.JMenu();
        jMenuItemMySQL = new javax.swing.JMenuItem();
        jMenuItemOracle = new javax.swing.JMenuItem();
        menu_crud = new javax.swing.JMenu();
        item_insercion = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem2 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem3 = new javax.swing.JCheckBoxMenuItem();
        jCheckBoxMenuItem4 = new javax.swing.JCheckBoxMenuItem();
        jMenuAplicacion = new javax.swing.JMenu();
        jMenuItemSalir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        texto_resultado.setColumns(20);
        texto_resultado.setRows(5);
        jScrollPane1.setViewportView(texto_resultado);

        jPanel1.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jMenuSGBD.setText("SGDB");

        jMenuItemMySQL.setText("MySQl");
        jMenuItemMySQL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMySQLActionPerformed(evt);
            }
        });
        jMenuSGBD.add(jMenuItemMySQL);

        jMenuItemOracle.setText("Oracle");
        jMenuSGBD.add(jMenuItemOracle);

        jMenuBar1.add(jMenuSGBD);

        menu_crud.setText("CRUD");

        item_insercion.setSelected(true);
        item_insercion.setText("Inserción");
        item_insercion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_insercionActionPerformed(evt);
            }
        });
        menu_crud.add(item_insercion);

        jCheckBoxMenuItem2.setSelected(true);
        jCheckBoxMenuItem2.setText("Recuperar Datos");
        jCheckBoxMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem2ActionPerformed(evt);
            }
        });
        menu_crud.add(jCheckBoxMenuItem2);

        jCheckBoxMenuItem3.setSelected(true);
        jCheckBoxMenuItem3.setText("Actualización");
        jCheckBoxMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem3ActionPerformed(evt);
            }
        });
        menu_crud.add(jCheckBoxMenuItem3);

        jCheckBoxMenuItem4.setSelected(true);
        jCheckBoxMenuItem4.setText("Borrado");
        jCheckBoxMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMenuItem4ActionPerformed(evt);
            }
        });
        menu_crud.add(jCheckBoxMenuItem4);

        jMenuBar1.add(menu_crud);

        jMenuAplicacion.setText("Aplicación");

        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuAplicacion.add(jMenuItemSalir);

        jMenuBar1.add(jMenuAplicacion);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemMySQLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMySQLActionPerformed
        try(Connection con = DriverManager.getConnection(urlMySQL, userMySQL, passwdMySQL)){
            JOptionPane.showMessageDialog(this, "Conexion realizada");
        }catch(SQLException ex){
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jMenuItemMySQLActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed
        int respuesta =  JOptionPane.showConfirmDialog(this, "Estas seguro?", "Salir de la aplicación", JOptionPane.YES_NO_CANCEL_OPTION);
        if(respuesta == JOptionPane.YES_OPTION) System.exit(0);
        
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jCheckBoxMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem2ActionPerformed
        this.texto_resultado.setText("");
        try(Connection con = DriverManager.getConnection(urlMySQL,userMySQL,passwdMySQL)){
            try(Statement st = con.createStatement()){
                String SQL = "SELECT * FROM alumnos";
                try (ResultSet rs = st.executeQuery(SQL)){
                    //Procesamos el conjunto de resultados
                    while (rs.next()){
                        this.texto_resultado.append(String.valueOf(rs.getInt("id_alumno")) + "\t");
                        this.texto_resultado.append(String.valueOf(rs.getString("nombre")) + "\t");
                        this.texto_resultado.append(String.valueOf(rs.getString("apellidos")) + "\t");
                        this.texto_resultado.append(String.valueOf(rs.getDouble("nota")) + "\t");
                        this.texto_resultado.append(String.valueOf(rs.getDate("fecha_nacimiento")) + "\t\n");
                    }
                } catch (SQLException ex3){
                    
                }
            } catch (SQLException ex2){
                
            }
        } catch (SQLException ex1){
            
        }
    }//GEN-LAST:event_jCheckBoxMenuItem2ActionPerformed

    private void item_insercionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_insercionActionPerformed
        try(Connection con = DriverManager.getConnection(urlMySQL,userMySQL,passwdMySQL)){
            try(Statement st = con.createStatement()){
                String SQL = "INSERT INTO alumnos (nombre, apellidos, nota) values ('prueba', 'apellidos', 9.9)";
                int numfilas= st.executeUpdate(SQL);
                if(numfilas > 0) JOptionPane.showMessageDialog(this, "Alumno almacenado");
                else JOptionPane.showMessageDialog(this, "Error.Alumno no almacenado");
            } catch (SQLException ex2){
                
            }
        } catch (SQLException ex1){
            
        }
    }//GEN-LAST:event_item_insercionActionPerformed

    private void jCheckBoxMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem3ActionPerformed
        try(Connection con = DriverManager.getConnection(urlMySQL,userMySQL,passwdMySQL)){
            try(Statement st = con.createStatement()){
                String SQL = "UPDATE alumnos SET nota = 8.8 WHERE nombre = 'prueba'";
                int numfilas= st.executeUpdate(SQL);
                if(numfilas > 0) JOptionPane.showMessageDialog(this, "Alumno actualizado");
                else JOptionPane.showMessageDialog(this, "Error.Alumno no actualizado");
            } catch (SQLException ex2){
                
            }
        } catch (SQLException ex1){
            
        }
    }//GEN-LAST:event_jCheckBoxMenuItem3ActionPerformed

    private void jCheckBoxMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem4ActionPerformed
        try(Connection con = DriverManager.getConnection(urlMySQL,userMySQL,passwdMySQL)){
            try(Statement st = con.createStatement()){
                String SQL = "DELETE FROM alumnos WHERE nombre = 'prueba'";
                int numfilas= st.executeUpdate(SQL);
                if(numfilas > 0) JOptionPane.showMessageDialog(this, "Alumno eliminado");
                else JOptionPane.showMessageDialog(this, "Error.Alumno no eliminado");
            } catch (SQLException ex2){
                
            }
        } catch (SQLException ex1){
            
        }
    }//GEN-LAST:event_jCheckBoxMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(EjemplosConexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjemplosConexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjemplosConexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjemplosConexion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjemplosConexion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem item_insercion;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem2;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem3;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem4;
    private javax.swing.JMenu jMenuAplicacion;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemMySQL;
    private javax.swing.JMenuItem jMenuItemOracle;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenu jMenuSGBD;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenu menu_crud;
    private javax.swing.JTextArea texto_resultado;
    // End of variables declaration//GEN-END:variables
}
