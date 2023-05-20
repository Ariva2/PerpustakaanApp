package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Koneksi {
    
    private final String URL = "jdbc:mysql://localhost:3306/db_perpus";
    private final String USER = "root";
    private final String PASS = "";
    
    public Connection getConnection() {
        Connection con;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(URL,USER,PASS);
            System.out.println("Koneksi Berhasil.");
            return con;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println("Koneksi Gagal.");
            return null;
        }
          
    }
        
        public static void main(String[] args) {
            Koneksi koneksi = new Koneksi ();
            koneksi.getConnection();
        }        
    }
