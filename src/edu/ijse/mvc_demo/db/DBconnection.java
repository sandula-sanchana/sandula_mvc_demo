/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.ijse.mvc_demo.db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

/**
 *
 * @author sandula
 */
public class DBconnection{
    private static DBconnection db;
    
    private Connection connection;
    
   private DBobject() throws ClassNotFoundException,SQLException(){
         Class.forName("com.mysql.cj.jdbc.Driver");
         connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/Supermarket","sandula","92540010");
 
    }
    
    public static DBconnection getInstance(){
        if(db==null){
            db=new DBconnection();
            
        }
        return db;
    }
    
    public  Connection getConnection(){
         return this.connection;
     }
    
}
