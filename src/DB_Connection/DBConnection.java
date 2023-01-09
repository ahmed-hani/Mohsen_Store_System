/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {
    
   public Connection getconnection() {
       
      Connection conn = null;
        try { 
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(  
                    "jdbc:mysql://localhost:3306/store_system","root","");
        } catch (Exception ex) {
            System.out.println(ex);/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_Connection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnection {
    //singlton design pattern
    //for decrease performance on connection
    //to call object just once
    public  static DBConnection instance ;

    public static DBConnection getInstance() {
        if(instance == null){
        instance=new DBConnection();
        }
        return instance;
    }
    
    private DBConnection(){
    
    }
   public Connection getconnection() {
       
      Connection conn = null;
        try { 
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(  
                    "jdbc:mysql://localhost:3306/store_system","root","");
        } catch (Exception ex) {
            System.out.println(ex);
        }

   return conn;
    }
}
        }

   return conn;
    }
}
