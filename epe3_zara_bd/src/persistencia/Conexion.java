/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author yonathanancheogonzalez
 */
public class Conexion {
    private static final String URL = "jdbc:mysql://localhost:3306/epe3_zara_bd";
    private static final String USER = "Yona";
    private static final String PASS = "ipchile";
    
    public static Connection getConnection(){
        try {
            System.out.println("Conexion ok");
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
