package quebracabeca;


import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;

import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Robson
 */
public class ConectarMysql {
    
    
    private  Connection connection;   
    public Connection  conectar(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/puzzle";
           
                connection = DriverManager.getConnection(url, "root","");
           
               
                
           
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ConectarMysql.class.getName()).log(Level.SEVERE, null, ex);
             
        }
        
        return connection;
        
}
    
     public void desconectar(){
        try {
            connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConectarMysql.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Não foi possível desconectar");
        }
}
}
