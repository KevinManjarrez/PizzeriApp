package com.LogicasAdmin;

import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    Connection conectar=null;
 
    public Connection conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pizzeriapp","root","12345");
            //JOptionPane.showMessageDialog(null,"Conexion exitosa");
        }catch(ClassNotFoundException | SQLException ex){
            System.err.println("Error, "+ex);
            JOptionPane.showMessageDialog(null,"Ocurrió un error en la conexión.");
        }
        return conectar;
    }
}   

