package com.LogicasAdmin;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class Sql_Usuario {
      public boolean iniciarSesion(Usuario usuario){
        Conexion con = new Conexion();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        try{
            Connection conexion=(Connection) con.getConnection();
            
            ps = conexion.prepareStatement("select idusuario,usuarionombre,contraseña where usuarionombre=?");
            ps.setString(1, usuario.getUsuarioNombre());
            
            rs = ps.executeQuery();
           
            if(rs.next()){
                if(usuario.getContraseña().equals(rs.getString("contraseña"))){
                    
                
                                    
                    usuario.setIdUsuario(rs.getInt("u.id"));
                    usuario.setUsuarioNombre(rs.getString("u.nombre"));
                    
                    return true;
                }
                else{
                    return false;
                }
            }
           
            return false;
            
        }catch(Exception ex){
            return false;
        }
    } 
}
