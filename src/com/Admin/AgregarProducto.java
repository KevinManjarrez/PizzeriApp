/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.Admin;

import static com.Admin.int_Compras.URL;
import static com.Admin.int_Compras.contraseña;
import static com.Admin.int_Compras.usuario;
import com.LogicasAdmin.Conexion;
import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author USER12
 */
public class AgregarProducto extends javax.swing.JFrame {

    
    public static final String URL = "jdbc:mysql://localhost:3306/pizzeriapp?autoReconnet=true&useSSL=false";
    public static final String usuario = "root";
    public static final String contraseña = "12345";
    
    PreparedStatement ps;
    ResultSet rs; 
    Conexion conexion;
    
    public AgregarProducto() {
        initComponents();
        cargar_ComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GrupoCheck = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        combo_Insumos = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        combo_eliminarInsumo = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("cantidad");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 120, 20));

        jLabel2.setText("eliminar insumo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, 110, -1));

        jButton1.setText("agregar");
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, -1, 20));

        combo_Insumos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona Producto" }));
        jPanel1.add(combo_Insumos, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 240, -1));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 20, 240, -1));

        combo_eliminarInsumo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona producto" }));
        jPanel1.add(combo_eliminarInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 110, 240, -1));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 50, 90, -1));

        jLabel4.setText("Busqueda de insumo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, 120, 20));

        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));
        jPanel1.add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 260, -1));

        jLabel5.setText("Precio");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, -1, -1));
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 260, -1));

        jLabel6.setText("Tamaño");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, -1, -1));

        GrupoCheck.add(jCheckBox1);
        jCheckBox1.setText("mega power");
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, -1, -1));

        GrupoCheck.add(jCheckBox2);
        jCheckBox2.setText("chica");
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, -1, -1));

        GrupoCheck.add(jCheckBox3);
        jCheckBox3.setText("mediana");
        jPanel1.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 310, -1, -1));

        GrupoCheck.add(jCheckBox4);
        jCheckBox4.setText("grande");
        jPanel1.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 310, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, 270, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public void Insertar_producto(){
        PreparedStatement ps = null;
        try{
           
            java.sql.Connection conexion =getConnection();
            
            ps = conexion.prepareStatement("insert into productos (NombreProducto, precio,tamaño) values (?,?,?)");
            ps.setString(1,txt_Nombre.getText());
            ps.setDouble(2, Double.parseDouble(txtPrecio.getText()));
           
          
            
            ps.executeUpdate();
            
            
        }catch(Exception ex){
            System.err.println("Error, "+ex);
        }
    }
    
    void cargar_ComboBox(){
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
             java.sql.Connection conexion=null;
            conexion=getConnection();
            
           ps=conexion.prepareStatement("SELECT * FROM pizzeriapp.insumos;");
           rs=ps.executeQuery();
           
           while(rs.next()){
               combo_Insumos.addItem(rs.getString("Nombre"));
               combo_eliminarInsumo.addItem(rs.getString("Nombre"));
               
           }
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
     //as
     
      public java.sql.Connection getConnection(){
        java.sql.Connection conexion=null;
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = (java.sql.Connection) DriverManager.getConnection(URL,usuario,contraseña);
            System.err.println("Conectado a la base de datos");
            
        }catch(Exception ex){
            System.err.println("Error, "+ex);
        }
        
        return conexion;
    }//
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
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup GrupoCheck;
    private javax.swing.JComboBox<String> combo_Insumos;
    private javax.swing.JComboBox<String> combo_eliminarInsumo;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txt_Nombre;
    // End of variables declaration//GEN-END:variables
}