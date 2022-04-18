package com.Admin;


import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author diego
 */
public class Usuarios extends javax.swing.JFrame {
    
    DefaultTableModel tabla = new DefaultTableModel();
    
    int xMouse, yMouse;
    
    public Usuarios() {
        initComponents();
        
        setLocationRelativeTo(null);
        
        mostrarUsuarios();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblUsuarios = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JPanel();
        btnRegresarTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-personal-trainer-skin-type-2-40.png"))); // NOI18N
        jLabel1.setText("USUARIOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 11, -1, -1));

        tblUsuarios.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        tblUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre(s)", "Apellidos", "Usuario", "Contraseña"
            }
        ));
        jScrollPane1.setViewportView(tblUsuarios);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 96, 1050, 330));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/add-user-group-man-man.png"))); // NOI18N
        jButton1.setText("AGREGAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 430, 230, 90));

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-cerrar-ventana-30.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, 220, 90));

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
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

        btnRegresar.setBackground(new java.awt.Color(255, 153, 153));
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegresarMouseEntered(evt);
            }
        });

        btnRegresarTxt.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        btnRegresarTxt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8-back-40.png"))); // NOI18N
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
            .addComponent(btnRegresarTxt)
        );
        btnRegresarLayout.setVerticalGroup(
            btnRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnRegresarTxt)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 909, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1074, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String id = tabla.getValueAt(tblUsuarios.getSelectedRow(), 0).toString();
        //String nombre = tablin.getValueAt(jTable1.getSelectedRow(), 1).toString();
        int resp = JOptionPane.showConfirmDialog(this, "Estas seguro de eliminar ID : " + id + "?");
        
        if(resp == JOptionPane.OK_OPTION){
            eliminar(id);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        AgregarEmpleado agregar = new AgregarEmpleado();
        agregar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseEntered
        
    }//GEN-LAST:event_btnRegresarMouseEntered

    private void btnRegresarTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarTxtMouseEntered
        btnRegresar.setBackground(new Color(255,204,204));
    }//GEN-LAST:event_btnRegresarTxtMouseEntered

    private void btnRegresarTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarTxtMouseExited
        btnRegresar.setBackground(new Color(255,153,153));
    }//GEN-LAST:event_btnRegresarTxtMouseExited

    private void btnRegresarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarTxtMouseClicked
        AdministradorMenu admM = new AdministradorMenu();
        admM.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegresarTxtMouseClicked

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged
    
    private void mensaje(String s){
        JOptionPane.showMessageDialog(this,s);
    }
    
    private void eliminar(String id){
        try{
            
            Connection conexion = DriverManager.getConnection("jdbc:sqlserver://;database=BD_PizzeriApp;integratedSecurity=true;");
            
            Statement transaccion = conexion.createStatement();
            
            String SQL = "DELETE FROM `PizeriApp`.`Usuarios` WHERE IDPRODUCTOS = "+id;
            
            int resultado = transaccion.executeUpdate(SQL);
            
            if(resultado == 0){
                mensaje("ERROR NO SE PUDO ELIMINAR ID "+id);
            }else{
                mensaje("SE BORRO CON EXITO ID "+id);
            }
            conexion.close();
            
        }catch(Exception e){
            mensaje(e.getMessage());
        }
    }
    
    public void mostrarUsuarios()
    {
        Logica_Productos logica = new Logica_Productos();
        
        DefaultTableModel modelo = logica.mostrarUsuarios();
        
        tblUsuarios.setModel(modelo);
        
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
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JPanel btnRegresar;
    private javax.swing.JLabel btnRegresarTxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblUsuarios;
    // End of variables declaration//GEN-END:variables
}
