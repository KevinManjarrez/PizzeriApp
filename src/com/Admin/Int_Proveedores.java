package com.Admin;

import com.LogicasAdmin.Conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class Int_Proveedores extends javax.swing.JFrame {

    Conexion cc = new Conexion();
    Connection con = cc.conectar();
    
    int xMouse, yMouse;
    
    public Int_Proveedores() {
        initComponents();
        setLocationRelativeTo(null);
        mostrarProveedores();
    }
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblCamioncito = new javax.swing.JLabel();
        lblProveedores = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProveedores = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        txtIdProveedor = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblCodigoPostal = new javax.swing.JLabel();
        txtCodigoPostal = new javax.swing.JTextField();
        txtBuscar = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JFormattedTextField();
        lblBusqueda = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JPanel();
        btnRegresarTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1060, 630));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCamioncito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/truck.png"))); // NOI18N
        jPanel1.add(lblCamioncito, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        lblProveedores.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblProveedores.setForeground(new java.awt.Color(0, 0, 0));
        lblProveedores.setText("PROVEEDORES");
        jPanel1.add(lblProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, -1, -1));

        tblProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "idProveedores", "NombreProveedores", "DireccciónProveedores", "cpProveedores", "telProveedores"
            }
        ));
        tblProveedores.setEditingColumn(0);
        tblProveedores.setEditingRow(0);
        tblProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProveedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProveedores);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 752, 250));

        btnAgregar.setBackground(new java.awt.Color(255, 204, 204));
        btnAgregar.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(0, 0, 0));
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 520, -1, -1));

        btnEliminar.setBackground(new java.awt.Color(255, 204, 204));
        btnEliminar.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, -1, -1));

        btnModificar.setBackground(new java.awt.Color(255, 204, 204));
        btnModificar.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(0, 0, 0));
        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 520, -1, -1));

        lblId.setText("id");
        jPanel1.add(lblId, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        txtIdProveedor.setEnabled(false);
        jPanel1.add(txtIdProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 47, -1));

        lblNombre.setText("Nombre");
        jPanel1.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 152, -1));

        lblTelefono.setText("Telefono");
        jPanel1.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        lblDireccion.setText("Dirección");
        jPanel1.add(lblDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, -1, -1));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, 212, -1));

        lblCodigoPostal.setText("Código Postal");
        jPanel1.add(lblCodigoPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 230, -1, -1));

        txtCodigoPostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoPostalActionPerformed(evt);
            }
        });
        txtCodigoPostal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCodigoPostalKeyTyped(evt);
            }
        });
        jPanel1.add(txtCodigoPostal, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 80, -1));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });
        jPanel1.add(txtBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 212, -1));

        try {
            txtTelefono.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefono.setToolTipText("");
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 152, -1));

        lblBusqueda.setText("Busqueda");
        jPanel1.add(lblBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, -1, -1));

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
                .addGap(0, 778, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarRegistros();
        mostrarProveedores();
        limpiarEntradas();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       /* insertarDatos();
        mostrarProveedores();
        limpiarEntradas(); */
        
         if(txtNombre.getText().isEmpty() || txtTelefono.getText().isEmpty() || txtDireccion.getText().isEmpty() || txtCodigoPostal.getText().isEmpty()){
           JOptionPane.showMessageDialog(this, "No dejar campos vacíos", "ERROR!", JOptionPane.ERROR_MESSAGE);
          } else{
             insertarDatos();
             mostrarProveedores();
             limpiarEntradas();
         }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void tblProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProveedoresMouseClicked
        btnAgregar.setEnabled(false);
        btnModificar.setEnabled(true);
        int fila = tblProveedores.rowAtPoint(evt.getPoint());
        txtIdProveedor.setText(tblProveedores.getValueAt(fila,0).toString());
        txtNombre.setText(tblProveedores.getValueAt(fila,1).toString());
        txtDireccion.setText(tblProveedores.getValueAt(fila, 2).toString());
        txtCodigoPostal.setText(tblProveedores.getValueAt(fila, 3).toString());
        txtTelefono.setText(tblProveedores.getValueAt(fila, 4).toString());
    }//GEN-LAST:event_tblProveedoresMouseClicked

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        actualizarDatos();
        mostrarProveedores();
        limpiarEntradas();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        btnAgregar.setEnabled(true);
        btnModificar.setEnabled(false);
        tblProveedores.setSelectionMode(0);
        limpiarEntradas();
    }//GEN-LAST:event_formMouseClicked

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        filtrarDatos(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void txtCodigoPostalKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCodigoPostalKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >=48 && key <=57;
        if(!numeros){
            evt.consume();
        }
        
        if(txtCodigoPostal.getText().trim().length()==5){
            evt.consume();
        }
    }//GEN-LAST:event_txtCodigoPostalKeyTyped

    private void txtCodigoPostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoPostalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoPostalActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
           int key = evt.getKeyChar();

    boolean mayusculas = key >= 65 && key <= 90;
    boolean minusculas = key >= 97 && key <= 122;
    boolean espacio = key == 32;
            
     if (!(minusculas || mayusculas || espacio))
    {
        evt.consume();
    }
    }//GEN-LAST:event_txtNombreKeyTyped

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
            java.util.logging.Logger.getLogger(Int_Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Int_Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Int_Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Int_Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Int_Proveedores().setVisible(true);
            }
        });
    }
    
    private void limpiarEntradas(){
        txtIdProveedor.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        txtCodigoPostal.setText("");
        txtTelefono.setText("");
    }
    
    public void insertarDatos(){
        try{
            if(txtNombre.getText().isBlank()||txtDireccion.getText().isBlank()||txtCodigoPostal.getText().isBlank()
               ||txtTelefono.getText().isBlank()){
                JOptionPane.showMessageDialog(null, "No deja campos vacíos");
            }else{
            String SQL="insert into proveedores (NombreProveedores, DireccionProveedores, cpProveedores, telProveedores) values (?,?,?,?)"; 
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1, txtNombre.getText());
            pst.setString(2, txtDireccion.getText());
            pst.setString(3, txtCodigoPostal.getText());
            pst.setString(4, txtTelefono.getText());
            
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Registro Exitoso");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al guardar los registros");
        }         
    }
    
    public void actualizarDatos(){
        try{
            if(txtNombre.getText().isBlank()||txtDireccion.getText().isBlank()||txtCodigoPostal.getText().isBlank()
               ||txtTelefono.getText().isBlank()){
                JOptionPane.showMessageDialog(null, "No se admiten registros nulos");
            }else{
            String SQL="update proveedores set NombreProveedores =?, DireccionProveedores=?, cpProveedores=?,  telProveedores=? where idProveedores =?"; 
            int filaSeleccionada = tblProveedores.getSelectedRow();
            String dao=(String)tblProveedores.getValueAt(filaSeleccionada, 0);
            
            PreparedStatement pst = con.prepareStatement(SQL);
            pst.setString(1, txtNombre.getText());
            pst.setString(2, txtDireccion.getText());
            pst.setString(3, txtCodigoPostal.getText());
            pst.setString(4, txtTelefono.getText());
            
            pst.setString(5,dao);
            pst.execute();
            
            JOptionPane.showMessageDialog(null, "Modificación exitosa");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al modificar el registros");
        }         
    }
    
    public void eliminarRegistros(){
        int filaSeleccionada=tblProveedores.getSelectedRow();
        try{
            if(filaSeleccionada != -1){
                int r = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere eliminar este registro?", "Eliminar registro",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
                    if(r == JOptionPane.YES_OPTION){
                        String SQL ="delete from proveedores where idProveedores="+tblProveedores.getValueAt(filaSeleccionada, 0);
                        Statement st=con.createStatement();
                        int n = st.executeUpdate(SQL);
                            if(n>=0){
                               JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente");
                            }
                    }//if.
            }else{
                 JOptionPane.showMessageDialog(null, "Selecciona una fila para eliminar");
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al eliminar registro: "+e.getMessage());
        }
    }
   
    public void mostrarProveedores(){
        String[] proveedores ={"idProveedores", "NombreProveedores", "DireccionProveedores", "cpProveedores", "telProvedores"};
        String[] registros = new String[5];
        
        DefaultTableModel modelo = new DefaultTableModel(null, proveedores);
        
        String SQL="select * from proveedores";
        Statement st;
        try{
            st = con.createStatement();
            ResultSet rs= st.executeQuery(SQL);
            while (rs.next()){
               registros[0]=rs.getString("idProveedores");
               registros[1]=rs.getString("NombreProveedores");
               registros[2]=rs.getString("DireccionProveedores");
               registros[3]=rs.getString("cpProveedores");
               registros[4]=rs.getString("telProveedores");
               
               modelo.addRow(registros);
               
        }
        tblProveedores.setModel(modelo);    
            
        }catch( SQLException e){
            JOptionPane.showMessageDialog(null, "Error al mostrar los registros"+ e.getMessage());
        }
    }
        
    public void filtrarDatos (String valor){
            String[] titulos={"idProveedores", "NombreProveedores","DireccionProveedores", "cpProveedores", "telProveedores"};
            String[] registros = new String[7];
            
            DefaultTableModel modelo = new DefaultTableModel(null, titulos);
            String SQL = "select * from proveedores where NombreProveedores like '"+valor+"%'";
            Statement st;
        try{
            st = con.createStatement();
            ResultSet rs= st.executeQuery(SQL);
            while (rs.next()){
               registros[0]=rs.getString("idProveedores");
               registros[1]=rs.getString("NombreProveedores");
               registros[2]=rs.getString("DireccionProveedores");
               registros[3]=rs.getString("cpProveedores");
               registros[4]=rs.getString("telProveedores");
               
               modelo.addRow(registros);
               
        }
        tblProveedores.setModel(modelo);    
            
        }catch( SQLException e){
            JOptionPane.showMessageDialog(null, "Error al mostrar los registros"+ e.getMessage());
        }
    }
        
        
        
        
    


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JPanel btnRegresar;
    private javax.swing.JLabel btnRegresarTxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBusqueda;
    private javax.swing.JLabel lblCamioncito;
    private javax.swing.JLabel lblCodigoPostal;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblProveedores;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTable tblProveedores;
    private javax.swing.JTextField txtBuscar;
    public javax.swing.JTextField txtCodigoPostal;
    public javax.swing.JTextField txtDireccion;
    public javax.swing.JTextField txtIdProveedor;
    public javax.swing.JTextField txtNombre;
    private javax.swing.JFormattedTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}