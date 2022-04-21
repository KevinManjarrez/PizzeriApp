package com.LogicasAdmin;



import java.sql.*;
import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    public static final String URL = "jdbc:mysql://localhost:3306/pizzeriapp?autoReconnet=true&useSSL=false";
    public static final String usuario = "root";
    public static final String contraseña = "12345";
    
    private static java.sql.Connection con;
    private static boolean conectado = false;
    
    public Connection getConnection(){
        Connection conexion=null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL,usuario,contraseña);
            
        }catch(Exception ex){
            System.err.println("Error, "+ex);
        }
        
        return conexion;
    }
    
    public static java.sql.Connection conectar()
    {
        
        try 
        {
            
            if (conectado == false)
            {               
                               
                Class.forName("com.mysql.jdbc.Driver");
            
                con = DriverManager.getConnection(URL, usuario, contraseña); 
             
            }

            return con; 
        } 
        catch (ClassNotFoundException | SQLException e) 
        {
            JOptionPane.showMessageDialog(null,"Error al crear la conexión "+e.getMessage());
            
            throw new RuntimeException("Error al crear la conexión");
        }
    }
    
}
