/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.ArrayList;
import logica.Venta;

/**
 *
 * @author yonathanancheogonzalez
 */
public class VentasModelo {
    public List<Venta> listarVentas(){
        List<Venta> listaVentas = new ArrayList<>();
        
        try (Connection conn = Conexion.getConnection()){
            String sql = "SELECT * FROM ventas";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            System.out.println(resultSet != null);
            while ( resultSet.next() ){
                
                System.out.println("ingreso a while");
                System.out.println(resultSet.toString());
                Venta venta = new Venta();
                venta.setId_venta(resultSet.getInt("id_venta"));
                venta.setId_cliente(resultSet.getInt("id_cliente"));
                venta.setId_producto(resultSet.getInt("id_producto"));
                venta.setCantidad(resultSet.getInt("cantidad"));
                venta.setPrecio_unitario(resultSet.getInt("precio_unitario"));
                venta.setFecha_venta(resultSet.getString("fecha_venta"));
                venta.setHora_venta(resultSet.getString("hora_venta"));
                venta.setSucursal_id(resultSet.getInt("sucursal_id"));
                listaVentas.add(venta);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaVentas;
    }
}
