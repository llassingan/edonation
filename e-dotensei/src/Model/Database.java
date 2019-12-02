/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.*;

/**
 *
 * @author Angga
 */
public class Database {
    private Connection con = null;
    private Statement stmt = null;
    private ResultSet rs = null;
    
    void connect(){
        try {
            String url = "jdbc:mysql://localhost/edotensei";
            String user = "root";
            String pass = "";
            con = DriverManager.getConnection(url,user,pass);
            stmt = con.createStatement();
        }catch(SQLException e){
               e.printStackTrace();
        }
    }
    public void addUser(User b){
        connect();
        try{
            
            String query = "INSERT INTO USER VALUES ('" + b.getUser_name() + "',"
                    + "'" + b.getUser_email()+"',"
                    + "'" + b.getUser_number()+"',"
                    + "'" + b.getUser_pass()+ "'"
                    + ");";
            //String query = "INSERT INTO USER VALUES (1,'andi','087','masma','pas');";
            stmt.executeUpdate(query);
                            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
    public void loginuser(String mail, String pass){
        connect();
        try{
            String query = "SELECT EMAIL FROM USER WHERE EMAIL LIKE '"+mail+"' AND PASS LIKE '"+ pass +";";
            //String query = "INSERT INTO USER VALUES (1,'andi','087','masma','pas');";
            stmt.executeUpdate(query);
                            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
}


