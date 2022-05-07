package com.LogicasAdmin;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author defer
 */
public class Logica_Productos {
    Conexion cc = new Conexion();
    Connection cn = cc.conectar();

    public DefaultTableModel mostrarProductos()
    {
        String []  nombresColumnas = {"id","Nombre Producto","Precio","Descripcion"};
        String [] registros = new String[4];
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        String sql = "SELECT * FROM pizzeriapp.productos";
        
        PreparedStatement pst = null;
        
        ResultSet rs = null;
        
        try
        {
            
            pst = cn.prepareStatement(sql);                        
            
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                registros[0] = rs.getString("idProductos");
                
                registros[1] = rs.getString("NombreProducto");
                
                registros[2] = rs.getString("Precio");
                
                registros[3] = rs.getString("Descripcion");
                
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
    
    
    public DefaultTableModel mostrarUsuarios()
    {
        String []  nombresColumnas = {"id","Nombre","Apellido Paterno","Apellido Materno", "Dirección", "Codigo Postal", "Contraseña", "Tipo de Usuario", "Nombre de Usuario"};
        String [] registros = new String[9];
        
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        
        String sql = "SELECT * FROM pizzeriapp.usuarios";
        
        PreparedStatement pst = null;
        
        ResultSet rs = null;
        
        try
        {
            cn = cc.conectar();
            
            pst = cn.prepareStatement(sql);                        
            
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                registros[0] = rs.getString("idUsuarios");
                
                registros[1] = rs.getString("Nombre");
                
                registros[2] = rs.getString("ApellidoPaterno");
                
                registros[3] = rs.getString("ApellidoMaterno");
                
                registros[4] = rs.getString("Direccion");
                
                registros[5] = rs.getString("codigoPostal");
                
                registros[6] = rs.getString("Contraseña");
                
                registros[7] = rs.getString("idTipoUsuario");
                
                registros[8] = rs.getString("UsuarioNombre");
                
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
    
    
    public DefaultTableModel mostrarCompras()
    {
        String []  nombresColumnas = {"id Compra","id de Insumo","Nombre Insumo","Costo", "id de Proveedor", "Fecha de Compra"};
        String [] registros = new String[6];
        
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        
        String sql = "SELECT * FROM pizzeriapp.compras";
        
        PreparedStatement pst = null;
        
        ResultSet rs = null;
        
        try
        {

            
            pst = cn.prepareStatement(sql);                        
            
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                registros[0] = rs.getString("idCompras");
                
                registros[1] = rs.getString("idInsumo");
                
                registros[2] = rs.getString("NombreInsumo");
                
                registros[3] = rs.getString("Costo");
                
                registros[4] = rs.getString("idProveedor");
                
                registros[5] = rs.getString("FechaCompra");
                
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
    
    public DefaultTableModel mostrarInsumos()
    {
        String []  nombresColumnas = {"id","Nombre","gramos","idCodigoCompra"};
        String [] registros = new String[4];
        
        DefaultTableModel modelo = new DefaultTableModel(null,nombresColumnas);
        
        String sql = "SELECT * FROM insumos";
        
        PreparedStatement pst = null;
        
        ResultSet rs = null;
        
        try
        {
            cn = cc.conectar();
            
            pst = cn.prepareStatement(sql);                        
            
            rs = pst.executeQuery();
            
            while(rs.next())
            {
                registros[0] = rs.getString("idInsumos");
                
                registros[1] = rs.getString("Nombre");
                
                registros[2] = rs.getString("gramos");
                
                registros[3] = rs.getString("idCodigoCompra");
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
