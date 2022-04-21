/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Repartidor;

import com.LogicasAdmin.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author defer
 */
public class LogicaRepartidor {
    public DefaultTableModel mostrarOrdenes(){
        String []  nombresColumnas = {"id","Nombre de Cliente","Orden","Estado"};
        String [] registros = new String[4];
        
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        
        String sql = "SELECT idOrdenes, NombreCliente, Orden, estado FROM pizzeriapp.ordenes";
        
        Connection cn = null;
        
        PreparedStatement pst = null;
        
        ResultSet rs = null;
        
        try
        {
            cn = Conexion.conectar();
            
            pst = cn.prepareStatement(sql);                        
            
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                registros[0] = rs.getString("idOrdenes");
                
                registros[1] = rs.getString("NombreCliente");
                
                registros[2] = rs.getString("Orden");
                
                registros[3] = rs.getString("estado");
                
                modelo.addRow(registros);
                
            }
            
           
        }
        catch(SQLException e)
        {
            
            JOptionPane.showMessageDialog(null,"Error al conectar");
            
        }
        finally
        {
            try
            {
                if (rs != null) rs.close();
                
                if (pst != null) pst.close();
                
                if (cn != null) cn.close();
            }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
        }
         return modelo;
    }
}
