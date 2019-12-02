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
    
    private void connect(){
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
//    public void addBuku(Buku b){
//        connect();
//        try{
//            String query = "INSERT INTO buku VALUES ('"  + b.getKodebuku() + "',"
//                    + "'" + b.getJudulbuku()+"',"
//                    + "'" + b.getPenerbit()+"',"
//                    + "'" + b.getHarga()+ "'"
//                    + ")";
//            stmt.executeUpdate(query);
//                            
//        }catch(SQLException e){
//            e.printStackTrace();
//        }
//    }
}
