/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import igu.VistaVentas;
import persistencia.VentasModelo;

/**
 *
 * @author yonathanancheogonzalez
 */
public class VentaControl {
    private VistaVentas vistaVentas;
    private VentasModelo ventasModelo;

    public VentaControl() {
    }

    public VentaControl(VistaVentas vistaVentas, VentasModelo ventasModelo) {
        this.vistaVentas = vistaVentas;
        this.ventasModelo = ventasModelo;
        
        this.vistaVentas.getBtnListar().addActionListener(e -> listarVentas());
        this.vistaVentas.getBtnSalir().addActionListener(e -> salir());
    }
    
    public void listarVentas(){
        vistaVentas.mostrarInformacion(ventasModelo.listarVentas());
    }
    
    public void salir(){
        System.exit(0);
    }
}
