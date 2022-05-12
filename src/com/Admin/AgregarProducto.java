/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.Admin;

import com.LogicasAdmin.Conexion;
import java.awt.Color;
import java.awt.event.ItemEvent;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author defer
 */
public class AgregarProducto extends javax.swing.JFrame {

    
    public static final String URL = "jdbc:mysql://localhost:3306/pizzeriapp?autoReconnet=true&useSSL=false";
    public static final String usuario = "root";
    public static final String contraseña = "12345";
    
    PreparedStatement ps;
    ResultSet rs; 
    Conexion conexion;
    
    DefaultTableModel modelo= new DefaultTableModel();
    
    int xMouse, yMouse;
    
    ArrayList<ArrayList<String>> Ingredientes = new ArrayList<ArrayList<String>>();
    ArrayList<String> ingrediente = new ArrayList<String>();
    String idProducto="";
    int idInsumo;
 
    
    public AgregarProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
        Insertar_producto();
        cargar();
        cargar_ComboBox();
    }
    
    public String checkSeleccionado(){
        if(check_Chica.isSelected()){
           return "chica";
        }if(check_mediana.isSelected()){
           return "mediana";
        }if(check_grande.isSelected()){
           return "grande";
        }if(check_mega.isSelected()){
           return "mega super";
        }return null;
    }
    
    public void Insertar_producto(){
        PreparedStatement ps = null;
        try{

            java.sql.Connection conexion =getConnection();

            ps = conexion.prepareStatement("insert into productos (NombreProducto, precio,tamaño) values (?,?,?)");
            ps.setString(1,txt_Nombre.getText());
            ps.setDouble(2, Double.parseDouble(txtPrecio.getText()));
            ps.setString(3, checkSeleccionado());


            ps.executeUpdate();
           
           
           ps=conexion.prepareStatement("SELECT idProductos FROM pizzeriapp.productos where NombreProducto='"+txt_Nombre.getText()+"'");
           rs=ps.executeQuery();
           
            while(rs.next()){
               idProducto = rs.getInt("idProductos") + "";
           }

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
           
               cmbInsumos.addItem(rs.getString("Nombre"));
           }
        }catch(Exception ex){
            System.out.println(ex);
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

        GrupoCheck = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        cmbInsumos = new javax.swing.JComboBox<>();
        combo_eliminarInsumo = new javax.swing.JComboBox<>();
        txtCantidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        check_mega = new javax.swing.JCheckBox();
        check_Chica = new javax.swing.JCheckBox();
        check_mediana = new javax.swing.JCheckBox();
        check_grande = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblIngredientes = new javax.swing.JTable();
        btnCrear = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JPanel();
        btnRegresarTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("cantidad");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 120, 20));

        jLabel2.setText("eliminar insumo");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 110, -1));

        btnAgregar.setText("agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, -1, 20));

        cmbInsumos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona Producto" }));
        cmbInsumos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbInsumosItemStateChanged(evt);
            }
        });
        jPanel1.add(cmbInsumos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 240, -1));

        combo_eliminarInsumo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona producto" }));
        jPanel1.add(combo_eliminarInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 370, 240, -1));

        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });
        jPanel1.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 310, 90, -1));

        jLabel4.setText("Busqueda de insumo");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 120, 20));

        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        txt_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NombreActionPerformed(evt);
            }
        });
        txt_Nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_NombreKeyTyped(evt);
            }
        });
        jPanel1.add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 260, -1));

        jLabel5.setText("Precio");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        txtPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioActionPerformed(evt);
            }
        });
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 260, -1));

        jLabel6.setText("Tamaño");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        GrupoCheck.add(check_mega);
        check_mega.setText("mega power");
        jPanel1.add(check_mega, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 170, -1, -1));

        GrupoCheck.add(check_Chica);
        check_Chica.setText("chica");
        jPanel1.add(check_Chica, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, -1, -1));

        GrupoCheck.add(check_mediana);
        check_mediana.setText("mediana");
        jPanel1.add(check_mediana, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, -1, -1));

        GrupoCheck.add(check_grande);
        check_grande.setText("grande");
        jPanel1.add(check_grande, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, -1, -1));

        tblIngredientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblIngredientes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 40, 330, 410));

        btnCrear.setText("Crear Producto");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        jPanel1.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 120, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegresarMouseEntered(evt);
            }
        });

        btnRegresarTxt.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnRegresarTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRegresarTxt.setText("Regresar");
        btnRegresarTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegresarTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegresarTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnRegresarLayout = new javax.swing.GroupLayout(btnRegresar);
        btnRegresar.setLayout(btnRegresarLayout);
        btnRegresarLayout.setHorizontalGroup(
            btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 92, Short.MAX_VALUE)
            .addGroup(btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnRegresarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE))
        );
        btnRegresarLayout.setVerticalGroup(
            btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
            .addGroup(btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(btnRegresarTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 908, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed

       if(txt_Nombre.getText().isBlank() || txtPrecio.getText().isBlank()){
           JOptionPane.showMessageDialog(this, "No dejar campos vacíos", "ERROR!", JOptionPane.ERROR_MESSAGE);
       }else{
           Insertar_producto();
           System.err.println(idProducto);
       }
   
      /* if((txt_Nombre != null) && (!txt_Nombre.equals(""))){
            JOptionPane.showMessageDialog(this, "Campo de Nombre vacía, ingrese Nombre", "ERROR!", JOptionPane.ERROR_MESSAGE);
        }
       
       else if((txtPrecio != null) && (!txtPrecio.equals(""))){
            JOptionPane.showMessageDialog(this, "Campo de precio vacía, ingrese precio", "ERROR!", JOptionPane.ERROR_MESSAGE);
        }*/
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnRegresarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarTxtMouseClicked
        Productos admM = new Productos();
        admM.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegresarTxtMouseClicked

    private void btnRegresarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarTxtMouseEntered
        btnRegresar.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_btnRegresarTxtMouseEntered

    private void btnRegresarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarTxtMouseExited
        btnRegresar.setBackground(Color.WHITE);
    }//GEN-LAST:event_btnRegresarTxtMouseExited

    private void btnRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseEntered

    }//GEN-LAST:event_btnRegresarMouseEntered

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        if(txtCantidad.getText().isBlank() || cmbInsumos.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(this, "Campo de cantidad vacía, ingrese cantidad", "ERROR!", JOptionPane.ERROR_MESSAGE);
        }else{
            ingrediente.add(idProducto);
            ingrediente.add(idInsumo+"");
            ingrediente.add(txtCantidad.getText());
            insertarIngredientes(ingrediente);
            cargar();
            ingrediente.clear();
        }
       
       
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cmbInsumosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbInsumosItemStateChanged
      if (evt.getStateChange()==ItemEvent.SELECTED) {
            
        String elemento = (String) cmbInsumos.getSelectedItem();
           
        java.sql.Connection conexion=null;                                   
        PreparedStatement ps=null;
        ResultSet rs=null; 
        
        try{
           
            conexion = getConnection();
            
            ps = conexion.prepareStatement("SELECT idInsumos from insumos where Nombre ='"+elemento+"'");
            rs=ps.executeQuery();          
            while(rs.next()){
                idInsumo=Integer.parseInt(rs.getString("idInsumos"));
            }
            
        }catch(Exception ex){
            System.err.println("Error, "+ex);
        }
        }
    }//GEN-LAST:event_cmbInsumosItemStateChanged

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
 
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txt_NombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_NombreKeyTyped
        int key = evt.getKeyChar();

    boolean mayusculas = key >= 65 && key <= 90;
    boolean minusculas = key >= 97 && key <= 122;
    boolean espacio = key == 32;
            
     if (!(minusculas || mayusculas || espacio))
    {
        evt.consume();
    }
    }//GEN-LAST:event_txt_NombreKeyTyped

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
    int key = evt.getKeyChar();

    boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros)
        {
            evt.consume();
        }

        if (txtPrecio.getText().trim().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void txt_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NombreActionPerformed
         
    }//GEN-LAST:event_txt_NombreActionPerformed

    private void txtPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioActionPerformed
         
    }//GEN-LAST:event_txtPrecioActionPerformed
    
    public void insertarIngredientes(ArrayList<String> ingredientes){
         PreparedStatement ps = null;
        try{

            java.sql.Connection conexion =getConnection();

            ps = conexion.prepareStatement("insert into productosinsumos (idProducto, idInsumo,cantidad) values (?,?,?)");
            ps.setInt(1,Integer.parseInt(ingredientes.get(0)));
            ps.setInt(2, Integer.parseInt(ingredientes.get(1)));
            ps.setInt(3, Integer.parseInt(ingredientes.get(2)));
//

            ps.executeUpdate();
           
         

        }catch(Exception ex){
            System.err.println("Error, "+ex);
        }
    }
    
    
    
    
    public void CargarTabla(ArrayList<String> ingrediente){
       DefaultTableModel modeloTabla=new DefaultTableModel();
        tblIngredientes.setModel(modeloTabla);
            modeloTabla.addColumn("ID del productos");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("cantidad");
            
            
           
     
    }
     
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
      
       void cargar(){
        DefaultTableModel modeloTabla=new DefaultTableModel();
        tblIngredientes.setModel(modeloTabla);
       
        
     
        java.sql.Connection conexion=null;
        PreparedStatement ps=null;
        ResultSet rs=null; 
        
        try{
           
            conexion = getConnection();
            
            ps = conexion.prepareStatement("SELECT idProducto,i.Nombre,cantidad FROM pizzeriapp.productosinsumos pi inner join insumos i on pi.idInsumo=i.idInsumos where pi.idProducto="+Integer.parseInt(idProducto));
            rs=ps.executeQuery();
            
            modeloTabla.addColumn("IdProducto");
            modeloTabla.addColumn("IdInsumo");
            modeloTabla.addColumn("Cantidad gr/ml");
           
            
            
            while(rs.next()){
                Object fila[]=new Object[3];
                for (int i = 0; i < 3; i++) {
                   fila[i]=rs.getObject(i+1);
                }
                modeloTabla.addRow(fila);
            }
            
            
        }catch(Exception ex){
            System.err.println("Error, "+ex);
        }
    }
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
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCrear;
    private javax.swing.JPanel btnRegresar;
    private javax.swing.JLabel btnRegresarTxt;
    private javax.swing.JCheckBox check_Chica;
    private javax.swing.JCheckBox check_grande;
    private javax.swing.JCheckBox check_mediana;
    private javax.swing.JCheckBox check_mega;
    private javax.swing.JComboBox<String> cmbInsumos;
    private javax.swing.JComboBox<String> combo_eliminarInsumo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblIngredientes;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txt_Nombre;
    // End of variables declaration//GEN-END:variables
}
