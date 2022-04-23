package com.Admin;

import com.LogicasAdmin.Conexion;
import java.awt.event.KeyEvent;
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
    
    public Int_Proveedores() {
        initComponents();
        setLocationRelativeTo(null);
        mostrarProveedores();
    }
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCamioncito = new javax.swing.JLabel();
        lblProveedores = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProveedores = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblId = new javax.swing.JLabel();
        txtIdProveedor = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblTelefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        lblDireccion = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        lblCodigoPostal = new javax.swing.JLabel();
        txtCodigoPostal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1060, 630));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        lblCamioncito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/truck.png"))); // NOI18N

        lblProveedores.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lblProveedores.setText("PROVEEDORES");

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

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setText("MODIFICAR");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblId.setText("id");

        txtIdProveedor.setEnabled(false);

        lblNombre.setText("Nombre");

        lblTelefono.setText("Telefono");

        lblDireccion.setText("Dirección");

        lblCodigoPostal.setText("Código Postal");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblId)
                    .addComponent(lblNombre)
                    .addComponent(lblTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                    .addComponent(txtTelefono))
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDireccion)
                    .addComponent(lblCodigoPostal))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                    .addComponent(txtCodigoPostal))
                .addGap(105, 105, 105))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lblCamioncito)
                                .addGap(70, 70, 70)
                                .addComponent(lblProveedores))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(btnAgregar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSalir)))
                        .addGap(0, 176, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblCamioncito))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblProveedores)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblId)
                            .addComponent(txtIdProveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDireccion)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCodigoPostal)
                    .addComponent(txtCodigoPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 144, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnEliminar)
                    .addComponent(btnBuscar)
                    .addComponent(btnSalir)
                    .addComponent(btnModificar))
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminarRegistros();
        mostrarProveedores();
        limpiarEntradas();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        AdministradorMenu admM = new AdministradorMenu();
        admM.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        insertarDatos();
        mostrarProveedores();
        limpiarEntradas();
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

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        actualizarDatos();
        mostrarProveedores();
        limpiarEntradas();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        btnAgregar.setEnabled(true);
        btnModificar.setEnabled(false);
        limpiarEntradas();
    }//GEN-LAST:event_formMouseClicked

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
                JOptionPane.showMessageDialog(null, "No se admiten registros nulos");
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
        int r = JOptionPane.showConfirmDialog(null, "¿Seguro que quiere eliminar este registro?", "Elimar registro",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
        int filaSeleccionada=tblProveedores.getSelectedRow();
        try{
            if(r == JOptionPane.YES_OPTION){
                if(filaSeleccionada == -1){
                    JOptionPane.showMessageDialog(null, "Selecciona una fila para eliminar");
                }
                String SQL ="delete from proveedores where idProveedores="+tblProveedores.getValueAt(filaSeleccionada, 0);
                Statement st= con.createStatement();
                int n = st.executeUpdate(SQL);

                if(n>=0){
                    JOptionPane.showMessageDialog(null, "Registro eliminado exitosamente");
                }
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error al eliminar registros");
        }
    }
   
    public void mostrarProveedores()
    {
        String[] proveedores ={"idProveedores", "NombreProveedores", "DireccionProveedores", "cpProveedores", "telProvedores"};
        String[] registros = new String[5];
        
        DefaultTableModel modelo = new DefaultTableModel(null, proveedores);
        
        String SQL="select * from proveedores";
        
        try{
            Statement st = con.createStatement();
            ResultSet rs= st.executeQuery(SQL);
            while (rs.next()){
               registros[0]=rs.getString("idProveedores");
               registros[1]=rs.getString("NombreProveedores");
               registros[2]=rs.getString("DireccionProveedores");
               registros[3]=rs.getString("cpProveedores");
               registros[4]=rs.getString("telProveedores");
               
               modelo.addRow(registros);
               tblProveedores.setModel(modelo);
            }
            
            
        }catch( SQLException e){
            JOptionPane.showMessageDialog(null, "Error al mostrar los registros"+ e.getMessage());
        }
    }


    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCamioncito;
    private javax.swing.JLabel lblCodigoPostal;
    private javax.swing.JLabel lblDireccion;
    private javax.swing.JLabel lblId;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblProveedores;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JTable tblProveedores;
    private javax.swing.JTextField txtCodigoPostal;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtIdProveedor;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables


}
