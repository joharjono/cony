/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Koneksi;

/**
 *
 * @author ASUS
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Koneksi {

//    public static Connection con;
//    public static Statement stm;
//
////    public static void main(String args[]) {
////        try {
////            String url = "jdbc:mysql://localhost/coyne";
////            String user = "root";
////            String pass = "";
////            Class.forName("com.mysql.jdbc.Driver");
////            con = DriverManager.getConnection(url, user, pass);
////            stm = con.createStatement();
////            System.out.println("koneksi berhasil;");
////        } catch (Exception e) {
////            System.err.println("koneksi gagal" + e.getMessage());
////        }
////    }

    String host = "localhost";
    String username = "root";
    String password = "";
    //String port = "1521"; // oracle
    String port = "3306"; // mysql
    String dbName = "coyne";

    public Connection getConnection() {
        Connection conn = null;
        try {

            //Class.forName("oracle.jdbc.driver.OracleDriver"); //oracle
            //Class.forName("com.mysql.cj.jdbc.Driver"); // mysql 8.x
            Class.forName("com.mysql.jdbc.Driver"); // mysql 5.x

            String host = this.host;
            String username = this.username;
            String password = this.password;
            String port = this.port;
            String dbName = this.dbName;

            //String url = "jdbc:oracle:thin:@"+host+":"+port+":"+dbName;//oracle
            String url = "jdbc:mysql://" + host + ":" + port + "/" + dbName;//mysql 8.x maupn 5.x

            conn = DriverManager.getConnection(url, username, password);

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }

        return conn;
    }

}
