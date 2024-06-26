
package com.gf.practica3eva.Vistas;

import com.gf.practica3eva.Conexion.Conexion;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultListModel;

/**
 * Ventana principal de la aplicacion
 * @author Juan Jose Blanco Diaz y Alejandro Francos Fernandez
 * @since 04-06-2024
 * @version 1.0
 */
public class VistaPrincipal extends javax.swing.JFrame implements KeyListener{

    /**
     * Creates new form SeleccionUsuario
     */
    
    private ResultSetMetaData rsmd; //Metadatos de la consulta
    private SeleccionUsuario su; //Ventana de recogida de datos
    private TablaDesc td; //Ventana de la tabla
    private Conexion conexion = new Conexion(); //Objeto que realiza la conexion
    private DefaultListModel modeloDB = new DefaultListModel(); //Modelo por defecto de la lista de bases de datos
    private DefaultListModel modeloTablas = new DefaultListModel(); //Modelo por defecto de la lista de tablas
    
    /**
     * getConexion obtiene la conexion con la base de datos
     * @return Conexion con base de datos
     */
    public Conexion getConexion() {
        return conexion;
    }
    
    /**
     * setConexion establece la conexion de la base de datos
     * @param conexion Conexion base de datos
     */
    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }
    
    public VistaPrincipal() {
        initComponents();
        setFrame();
    }
    
    /**
     * setFrame establece parametros para el inicio de la ventana
     */
    private void setFrame(){
        this.setTitle("Gestor Base de Datos");
        this.setLocationRelativeTo(null);
        this.setSize(525,300);
        this.setResizable(false);
        btn_desc.setMnemonic('D');
        btn_desc.setToolTipText("Pulsa para mostrar la información de la tabla seleccionada");
        item_mysql.setMnemonic('M');
        item_oracle.setMnemonic('O');
        item_salir.setMnemonic('S');
        lista_tablas.setToolTipText("Selecciona una tabla");
        lista_basedatos.setToolTipText("Selecciona una base de datos");
        this.setIconImage(Toolkit.getDefaultToolkit().getImage("./src/main/java/com/gf/practica3eva/Resources/icono.png"));
        setKeyListener();
    }
    
    /**
     * setKeyListener establece en todos los elementos los eventos de teclado
     */
    private void setKeyListener(){
        this.lista_basedatos.addKeyListener(this);
        this.lista_tablas.addKeyListener(this);
        this.btn_desc.addKeyListener(this);
    }
    
    /**
     * mostrarBD muestra el listado de las bases de datos de la conexion
     */
    private void mostrarBD(){
        try(Connection conn = DriverManager.getConnection(conexion.getUrl(), conexion.getUser(), conexion.getPassword())){
            try (ResultSet catalogs = conn.getMetaData().getCatalogs()) {
               int cont = 0;
                while (catalogs.next()) {
                    modeloDB.add(cont, catalogs.getString(1));
                    cont++;
                }
                lista_basedatos.setModel(modeloDB);
            }
        } catch (SQLException ex) {
        }
    }
    
    /**
     * mostrarTablas muestra las tablas que forman parte de la base de datos seleccionada
     */
    private void mostrarTablas(){
        try(Connection conn = DriverManager.getConnection(conexion.getUrl(), conexion.getUser(), conexion.getPassword())){
            try (ResultSet tablas = conn.getMetaData().getTables(conexion.getBaseDatos(), null, "%", new String[] {"TABLE"})) {
               int cont = 0;
                while (tablas.next()) {
                    modeloTablas.add(cont, tablas.getString("TABLE_NAME"));
                    cont++;
                }
                lista_tablas.setModel(modeloTablas);
            }
        } catch (SQLException ex) {
        }
    }
    
    /**
     * generarTabla genera una ventana con la tabla DESC
     */
    private void generarTabla(){
        td = new TablaDesc(this, true);
        td.setAlwaysOnTop(true);
        td.setVisible(true);
    }
    
    /**
     * recogerDatos recoge los datos de la consulta DESC
     * @return Matriz con los datos de la consulta
     */
    protected Object[][] recogerDatos(){
        Object[][] datos = null;
        try(Connection conn = DriverManager.getConnection(conexion.getUrl(), conexion.getUser(), conexion.getPassword())){
            try (Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
                String sql = "DESC " + lista_tablas.getSelectedValue();
                
                try (ResultSet rs = st.executeQuery(sql)){
                    rsmd = rs.getMetaData();
                    
                    rs.last();
                    int numCols = rsmd.getColumnCount();
                    int numFils = rs.getRow();

                    datos = new Object[numFils][numCols];
                    setColumnas();
                    int j = 0;
                    rs.beforeFirst();
                    while (rs.next()) {
                        for (int i = 0; i < numCols; i++) {
                            datos[j][i] = rs.getObject(i + 1);
                        }
                        j++;
                    }
                }
            }
        } catch (SQLException ex) {
        }
        return datos;
    }
    
    /**
     * setColumnas recoge el nombre de las columnas de los metadatos de la consulta para establecerlo en la tabla
     * @return Array de los nombre de las columnas
     */
    protected String[] setColumnas() {
        String[] columnas = {};
        try {
            columnas=new String[rsmd.getColumnCount()];
            for(int i=1;i<=rsmd.getColumnCount();i++){
                columnas[i-1]=rsmd.getColumnLabel(i);
            }
        } catch (SQLException ex) {

        } catch (NullPointerException ex){
            
        }
        return columnas;
    }
    
    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
            generarTabla();
        }
       else if(e.getKeyCode() == KeyEvent.VK_ESCAPE){
            System.exit(0);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btn_desc = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista_basedatos = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lista_tablas = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menu_SG = new javax.swing.JMenu();
        item_mysql = new javax.swing.JMenuItem();
        item_oracle = new javax.swing.JMenuItem();
        menu_app = new javax.swing.JMenu();
        item_salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setLayout(new java.awt.BorderLayout());

        btn_desc.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        btn_desc.setText("Ejecutar DESC");
        btn_desc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_descActionPerformed(evt);
            }
        });
        jPanel2.add(btn_desc, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setLayout(new java.awt.BorderLayout());

        lista_basedatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        lista_basedatos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lista_basedatos.setToolTipText("");
        lista_basedatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lista_basedatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lista_basedatos);

        jPanel3.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Bases de Datos");
        jPanel3.add(jLabel1, java.awt.BorderLayout.PAGE_START);

        jPanel1.add(jPanel3, java.awt.BorderLayout.LINE_START);

        jPanel4.setLayout(new java.awt.BorderLayout());

        lista_tablas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        lista_tablas.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lista_tablas.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(lista_tablas);

        jPanel4.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tablas");
        jPanel4.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        menu_SG.setText("SSDB");

        item_mysql.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        item_mysql.setText("Conectar MySQL");
        item_mysql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_mysqlActionPerformed(evt);
            }
        });
        menu_SG.add(item_mysql);

        item_oracle.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        item_oracle.setText("Conectar Oracle");
        item_oracle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_oracleActionPerformed(evt);
            }
        });
        menu_SG.add(item_oracle);

        jMenuBar1.add(menu_SG);

        menu_app.setText("Aplicacion");

        item_salir.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        item_salir.setText("Salir");
        item_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_salirActionPerformed(evt);
            }
        });
        menu_app.add(item_salir);

        jMenuBar1.add(menu_app);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void item_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_item_salirActionPerformed

    private void item_mysqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_mysqlActionPerformed
        conexion.setUrl("");
        modeloDB = new DefaultListModel(); //Vacia la lista
        this.lista_basedatos.setModel(modeloDB);
        modeloTablas = new DefaultListModel(); //Vacia la lista
        this.lista_tablas.setModel(modeloTablas);
        su = new SeleccionUsuario(this, true); //Crea la ventana de recogida de datos
        su.selector_tipo.setSelectedItem("MySQL");
        su.texto_puerto.setText("3306");
        su.setAlwaysOnTop(true);
        su.setVisible(true);
        mostrarBD();
    }//GEN-LAST:event_item_mysqlActionPerformed

    private void btn_descActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_descActionPerformed
        generarTabla();
    }//GEN-LAST:event_btn_descActionPerformed

    private void item_oracleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_oracleActionPerformed
        modeloDB = new DefaultListModel(); //Vacia la lista
        this.lista_basedatos.setModel(modeloDB);
        modeloTablas = new DefaultListModel(); //Vacia la lista
        this.lista_tablas.setModel(modeloTablas);
        su = new SeleccionUsuario(this, true); //Crea la ventana de recogida de datos
        su.selector_tipo.setSelectedItem("Oracle"); 
        su.texto_puerto.setText("1521");
        su.setAlwaysOnTop(true);
        su.setVisible(true);
        mostrarTablas();
    }//GEN-LAST:event_item_oracleActionPerformed

    private void lista_basedatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lista_basedatosMouseClicked
        modeloTablas = new DefaultListModel(); //Vacia la lista
        conexion.setBaseDatos(lista_basedatos.getSelectedValue());
        conexion.setUrl(conexion.getTipo());
        mostrarTablas();
    }//GEN-LAST:event_lista_basedatosMouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_desc;
    private javax.swing.JMenuItem item_mysql;
    private javax.swing.JMenuItem item_oracle;
    private javax.swing.JMenuItem item_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lista_basedatos;
    private javax.swing.JList<String> lista_tablas;
    private javax.swing.JMenu menu_SG;
    private javax.swing.JMenu menu_app;
    // End of variables declaration//GEN-END:variables

    @Override
    public void keyTyped(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    

    @Override
    public void keyReleased(KeyEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
