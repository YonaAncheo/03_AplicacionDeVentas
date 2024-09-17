/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.Date;

/**
 *
 * @author yonathanancheogonzalez
 */
public class Venta {
    private int id_venta;
    private int id_cliente;
    private int id_producto;
    private int cantidad;
    private int precio_unitario;
    private String fecha_venta;
    private String hora_venta;
    private int sucursal_id;

    public Venta() {
    }

    public Venta(int id_venta, int id_cliente, int id_producto, int cantidad, int precio_unitario, String fecha_venta, String hora_venta, int sucursal_id) {
        this.id_venta = id_venta;
        this.id_cliente = id_cliente;
        this.id_producto = id_producto;
        this.cantidad = cantidad;
        this.precio_unitario = precio_unitario;
        this.fecha_venta = fecha_venta;
        this.hora_venta = hora_venta;
        this.sucursal_id = sucursal_id;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(int precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public String getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(String fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public String getHora_venta() {
        return hora_venta;
    }

    public void setHora_venta(String hora_venta) {
        this.hora_venta = hora_venta;
    }

    public int getSucursal_id() {
        return sucursal_id;
    }

    public void setSucursal_id(int sucursal_id) {
        this.sucursal_id = sucursal_id;
    }

    
    
}
