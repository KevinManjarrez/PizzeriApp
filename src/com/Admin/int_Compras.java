package com.Admin;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author defer
 */
public class int_Compras extends javax.swing.JFrame {

    int xMouse, yMouse;
    public static final String URL = "jdbc:mysql://localhost:3306/pizzeriapp?autoReconnet=true&useSSL=false";
    public static final String usuario = "root";
    public static final String contraseña = "12345";
    PreparedStatement ps;
    ResultSet rs; 
    
    public int_Compras() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        cargar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JPanel();
        btnRegresarTxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCompras = new javax.swing.JTable();
        txtBuscar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        botonCargar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtProducto = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        botonEliminar = new javax.swing.JButton();
        botonInsertar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtIdProveedor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        btnRegresarTxt.setText("Regresar al Menú");
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
            .addGap(0, 172, Short.MAX_VALUE)
            .addGroup(btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnRegresarLayout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(btnRegresarTxt)
                    .addContainerGap(27, Short.MAX_VALUE)))
        );
        btnRegresarLayout.setVerticalGroup(
            btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
            .addGroup(btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(btnRegresarLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(btnRegresarTxt)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 898, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-producto-40.png"))); // NOI18N
        jLabel1.setText("COMPRAS");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, -1, -1));

        tblCompras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Producto", "Descripcion", "Precio", "Cantidad", "Proveedor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCompras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblComprasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCompras);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 740, 370));
        bg.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, 240, -1));

        jLabel4.setText("Buscar por Codigo del Producto");
        bg.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, -1, -1));

        botonCargar.setText("Cargar Tabla");
        botonCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarActionPerformed(evt);
            }
        });
        bg.add(botonCargar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 510, -1, 45));

        jLabel5.setText("Producto");
        bg.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 200, -1, -1));

        jLabel6.setText("Descripcion");
        bg.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 250, -1, -1));

        jLabel7.setText("Precio");
        bg.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 300, -1, -1));

        jLabel8.setText("Cantidad");
        bg.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 340, -1, -1));
        bg.add(txtProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 190, 240, -1));
        bg.add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 250, 240, -1));
        bg.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 300, 240, -1));
        bg.add(txtCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 340, 240, -1));

        jLabel10.setText("Codigo");
        bg.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 150, -1, -1));
        bg.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 150, 70, -1));

        botonEliminar.setText("Eliminar");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });
        bg.add(botonEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 470, 90, 50));

        botonInsertar.setText("Insertar");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });
        bg.add(botonInsertar, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 470, 110, 50));

        jButton1.setText("Limpiar Campos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        bg.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 410, -1, -1));

        jLabel9.setText("idProveedor");
        bg.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 380, -1, -1));
        bg.add(txtIdProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 380, 50, -1));

        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1130, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarTxtMouseClicked
        AdministradorMenu admM = new AdministradorMenu();
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

    private void botonCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarActionPerformed
      cargar();
    }//GEN-LAST:event_botonCargarActionPerformed

    private void tblComprasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblComprasMouseClicked
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            Connection conexion=null;
            conexion=getConnection();
            
            int fila = tblCompras.getSelectedRow();
            String codigo = tblCompras.getValueAt(fila, 0).toString();
            
            ps = conexion.prepareStatement("SELECT codigo,nombre,descripcion,precio,cantidad,nombreproveedores,idproveedor FROM"
                    + " compras inner join proveedores on  compras.idproveedor=proveedores.idProveedores "
                    + "where compras.codigo=?");
            ps.setString(1, codigo);
            rs = ps.executeQuery();
            
            while(rs.next()){
                txtCodigo.setText(rs.getString("codigo"));
                txtProducto.setText(rs.getString("nombre"));
                txtDescripcion.setText(rs.getString("descripcion"));
                txtPrecio.setText(String.valueOf(rs.getDouble("precio")));
                txtCantidad.setText(String.valueOf(rs.getInt("cantidad")));
                txtIdProveedor.setText(String.valueOf(rs.getInt("idproveedor")));
                
              
            }
            
        }catch(Exception ex){
            System.err.println("Error, "+ex);
        }
    }//GEN-LAST:event_tblComprasMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          txtCodigo.setText("");
                txtProducto.setText("");
                txtDescripcion.setText("");
                txtPrecio.setText("");
                txtCantidad.setText("");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed
        PreparedStatement ps = null;
            int cantidad=Integer.parseInt(txtCantidad.getText());
            double precio=Double.parseDouble(txtPrecio.getText());
            String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());

        try{
           
            Connection conexion =getConnection();
            
            ps = conexion.prepareStatement("insert into compras("
                    + "idproveedor,codigo,nombre,descripcion,precio,cantidad,fecha,total) values "
                    + "(?,?,?,?,?,?,?,?)");
            ps.setInt(1, Integer.parseInt(txtIdProveedor.getText()));
            ps.setString(2, txtCodigo.getText());
            ps.setString(3,txtProducto.getText());
            ps.setString(4, txtDescripcion.getText());
            ps.setDouble(5, Double.parseDouble(txtPrecio.getText()));
            ps.setInt(6, Integer.parseInt(txtCantidad.getText()));
            ps.setString(7,timeStamp);
            ps.setDouble(8,precio*cantidad);
                    
   
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro insertado correctamente");
            
        }catch(Exception ex){
            System.err.println("Error, "+ex);
        }
    }//GEN-LAST:event_botonInsertarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        PreparedStatement ps = null;
        
        try{
           
            Connection conexion = getConnection();
            
            ps = conexion.prepareStatement("delete from compras where codigo=?");
            ps.setString(1, txtCodigo.getText());
            
            ps.executeUpdate();
            
            JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
            
        }catch(Exception ex){
            System.err.println("Error, "+ex);
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

    void cargar(){
        DefaultTableModel modeloTabla=new DefaultTableModel();
        tblCompras.setModel(modeloTabla);
        String campo=txtBuscar.getText();
        String where="";
        
        if(!"".equals(campo)){
            where= "where compras.codigo='"+campo+"'";
        }
        
        Connection conexion=null;
        PreparedStatement ps=null;
        ResultSet rs=null; 
        
        try{
           
            conexion = getConnection();
            
            ps = conexion.prepareStatement("SELECT codigo,nombre,descripcion,precio,cantidad,nombreproveedores,idproveedor,fecha,total FROM"
                    + " compras inner join proveedores on  compras.idproveedor=proveedores.idProveedores "+where);
            rs=ps.executeQuery();
            
            modeloTabla.addColumn("codigo");
            modeloTabla.addColumn("Nombre");
            modeloTabla.addColumn("descipcion");
            modeloTabla.addColumn("precio");
            modeloTabla.addColumn("cantidad");
            modeloTabla.addColumn("Nombre Proveedore");
            modeloTabla.addColumn("idProveedor");
            modeloTabla.addColumn("fecha");
            modeloTabla.addColumn("total");
            
            
            while(rs.next()){
                Object fila[]=new Object[9];
                for (int i = 0; i < 9; i++) {
                   fila[i]=rs.getObject(i+1);
                }
                modeloTabla.addRow(fila);
            }
            
            
        }catch(Exception ex){
            System.err.println("Error, "+ex);
        }
    }
    

    
    public java.sql.Connection getConnection(){
        java.sql.Connection conexion=null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (java.sql.Connection) DriverManager.getConnection(URL,usuario,contraseña);
            System.err.println("Conectado a la base de datos");
            
        }catch(Exception ex){
            System.err.println("Error, "+ex);
        }
        
        return conexion;
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
            java.util.logging.Logger.getLogger(int_Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(int_Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(int_Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(int_Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new int_Compras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton botonCargar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JPanel btnRegresar;
    private javax.swing.JLabel btnRegresarTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblCompras;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtIdProveedor;
    private javax.swing.JTextField txtPrecio;
    private javax.swing.JTextField txtProducto;
    // End of variables declaration//GEN-END:variables
}
