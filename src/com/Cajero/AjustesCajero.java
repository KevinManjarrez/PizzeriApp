/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.Cajero;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author defer
 */
public class AjustesCajero extends javax.swing.JPanel {

    String passN="", passO="", userN="", userO="";
    public AjustesCajero() {
        initComponents();
    }
    
    void limpiarCajas() {
        txtNewPass.setText(null);
        txtOldPass.setText(null);
        txtUserC.setText(null);
        txtPass.setText(null);
        txtOldUser.setText(null);
        txtNewUser.setText(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNewPass = new javax.swing.JTextField();
        btnUser = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        txtOldUser = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtUserC = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        txtOldPass = new javax.swing.JTextField();
        btnPass = new javax.swing.JButton();
        txtNewUser = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 38)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Ajustes de Usuario");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 880, 54));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Bienvenido a los ajustes, Repartidor. Si es tu primer inicio de sesión, recomendamos cambiar tu contraseña,");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 880, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Cambio de Contraseña");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 860, 10));

        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Usuario Actual");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 80, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Contraseña Actual");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));
        add(txtNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 130, -1));

        btnUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnUser.setText("Cambiar Usuario");
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });
        add(btnUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 328, -1, -1));

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 140, 30, 360));
        add(txtOldUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 130, -1));

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nueva Contraseña");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));
        add(txtUserC, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 130, -1));

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Contraseña");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("aquí podrás hacerlo.");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 880, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Cambio de Nombre de Usuario");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 150, -1, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Usuario");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 80, -1));
        add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 130, -1));
        add(txtOldPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 230, 130, -1));

        btnPass.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnPass.setText("Cambiar Contraseña");
        btnPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPassActionPerformed(evt);
            }
        });
        add(btnPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 328, -1, -1));
        add(txtNewUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, 130, -1));

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Usuario Nuevo");
        add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPassActionPerformed
        PreparedStatement ps = null;
        passN = txtNewPass.getText();
        passO = txtOldPass.getText();
        userO = txtUserC.getText();

        try{
            Connection conexion = getConnection();
            
            ps = conexion.prepareStatement("update usuarios set Contraseña=? where UsuarioNombre=? and Contraseña=?");
            ps.setString(1, passN);
            ps.setString(2, userO);
            ps.setString(3, passO);
            
            ps.executeUpdate();
            
               if(txtUserC.getText().isBlank() || txtOldPass.getText().isBlank() || txtNewPass.getText().isBlank()){
           JOptionPane.showMessageDialog(this, "No dejar campos vacíos", "ERROR!", JOptionPane.ERROR_MESSAGE);
            }
              else{
                  JOptionPane.showMessageDialog(null, "Contraseña actualizada correctamente");
              }
            
            limpiarCajas();
            

        }catch(Exception ex){
            System.err.println("Error, "+ex);
        }
    }//GEN-LAST:event_btnPassActionPerformed

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        PreparedStatement ps = null;
        passO = txtPass.getText();
        userO = txtOldUser.getText();
        userN = txtNewUser.getText();

        try{
            Connection conexion = getConnection();
            
            ps = conexion.prepareStatement("update usuarios set UsuarioNombre=? where UsuarioNombre=? and Contraseña=?");
            ps.setString(1, userN);
            ps.setString(2, userO);
            ps.setString(3, passO);
            
            ps.executeUpdate();
             if(txtOldUser.getText().isBlank() || txtPass.getText().isBlank() || txtNewUser.getText().isBlank()){
           JOptionPane.showMessageDialog(this, "No dejar campos vacíos", "ERROR!", JOptionPane.ERROR_MESSAGE);
            }
            
              else{
                  JOptionPane.showMessageDialog(null, "Nombre de Usuario actualizado correctamente");
              }
            limpiarCajas();
            

        }catch(Exception ex){
            System.err.println("Error, "+ex);
        }
    }//GEN-LAST:event_btnUserActionPerformed

    public static final String URL = "jdbc:mysql://localhost:3306/pizzeriapp?autoReconnet=true&useSSL=false";
    public static final String usuario = "root";
    public static final String contraseña = "12345";
    PreparedStatement ps;
    ResultSet rs; 
    
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPass;
    private javax.swing.JButton btnUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtNewPass;
    private javax.swing.JTextField txtNewUser;
    private javax.swing.JTextField txtOldPass;
    private javax.swing.JTextField txtOldUser;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtUserC;
    // End of variables declaration//GEN-END:variables
}
