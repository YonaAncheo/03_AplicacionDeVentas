/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package epe3_zara_bd;

import igu.VistaVentas;
import logica.VentaControl;
import persistencia.VentasModelo;

/**
 *
 * @author yonathanancheogonzalez
 */
public class Epe3_zara_bd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // creamos la instancia de la vista
        VistaVentas vistaVentas = new VistaVentas();
        
        //creamos la instancia del modelo
        VentasModelo ventasModelo = new VentasModelo();
        
        // creamos la instacia del controlador, este requiere pasar por parametro
        // una instancia de la vista y del controlador.
        
        VentaControl ventaControl = new VentaControl(vistaVentas, ventasModelo);
    }
    
}
