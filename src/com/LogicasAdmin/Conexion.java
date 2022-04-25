package com.LogicasAdmin;

import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    private final String base = "pizzeriapp";
    private final String user = "root";
    private final String password = "12345";
    private final String url = "jdbc:mysql://localhost:3306/"+base;
    Connection conectar=null;
 
    public Connection conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = (Connection) DriverManager.getConnection(this.url,this.user,this.password);
            //JOptionPane.showMessageDialog(null,"Conexion exitosa");
        }catch(ClassNotFoundException | SQLException ex){
            System.err.println("Error, "+ex);
            JOptionPane.showMessageDialog(null,"Ocurrió un error en la conexión.");
        }
        return conectar;
    }
}   

