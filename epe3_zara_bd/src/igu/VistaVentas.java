/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package igu;

import java.awt.*;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import logica.Venta;

public class VistaVentas {
    private JFrame ventana;
    private JPanel contenidoPanel, contenidoNorte, botoneraSur;
    private JLabel[] campoJLabels;
    private JTextField[] txtFields;
    private JButton[] btnNorte;
    private JButton btnListar, btnSalir;
    private JTable tablaVentas;
    private DefaultTableModel tableModel;
    private JScrollPane scrollPane;
    
    public VistaVentas(){
        this.iniciarCmponentes("Ventas");
        String[] nombreLabel = {"id_ventas","id_cliente","id_producto","cantidad",
        "precio_unitario","fecha_venta","hora_venta","sucursal_id"};
        String[] nombreBtnNorte = {"Agregar","Actualizar","Buscar","Borrar"};
        this.contenidoPanel.add(this.zonaNorte(nombreBtnNorte, nombreLabel),BorderLayout.NORTH);
        String[] columnNames = { "id_ventas","id_cliente","id_producto","cantidad",
        "precio_unitario","fecha_venta","hora_venta","sucursal_id"};
        this.contenidoPanel.add(zonaCentral(columnNames),BorderLayout.CENTER);
        this.contenidoPanel.add(botoneraSur("Listar Ventas"), BorderLayout.SOUTH);
        this.ventana.add(contenidoPanel);
        this.setVisibleVentana(true);
    }
    
    public void iniciarCmponentes(String titulo){
        ventana = new JFrame(titulo);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(800,800);
        contenidoPanel = new JPanel(new BorderLayout());
        
        botoneraSur = new JPanel(new GridLayout(1,2));
    }
    
    public JPanel zonaNorte(String[] nombreBtnNorte, String[] nombreLabel){
        contenidoNorte = new JPanel(new GridLayout(nombreLabel.length + 2,2));
        campoJLabels = new JLabel[nombreLabel.length];
        txtFields = new JTextField[nombreLabel.length];
        
        campoJLabels = new JLabel[nombreLabel.length];
        for (int i = 0; i < campoJLabels.length; i++) {
            JLabel campo = new JLabel(nombreLabel[i]);
            JTextField txtcampo = new JTextField();
            txtFields[i] = txtcampo;
            contenidoNorte.add(campo);
            contenidoNorte.add(txtcampo);
        }
        
        btnNorte = new JButton[nombreBtnNorte.length];
        for (int i = 0; i < nombreBtnNorte.length; i++) {
            JButton btn = new JButton(nombreBtnNorte[i]);
            btnNorte[i] = btn;
            contenidoNorte.add(btn);
        }
        
        return contenidoNorte;
    }
    
    public JScrollPane zonaCentral(String[] columnNames){
        tableModel = new DefaultTableModel(columnNames, 0);
        tablaVentas = new JTable(tableModel);
        scrollPane = new JScrollPane(tablaVentas);
        return scrollPane;
    }
    
    public JPanel botoneraSur(String listar){
        botoneraSur = new JPanel(new GridLayout(1,2));
        btnListar = new JButton(listar);
        botoneraSur.add(btnListar);
        
        btnSalir = new JButton("Salir");
        botoneraSur.add(btnSalir);
        
        return botoneraSur;
    }
    public void mostrarInformacion(List<Venta> ventas){
        tableModel.setRowCount(0);
        for(Venta venta: ventas){
            Object[] rowData = {venta.getId_venta(),venta.getId_cliente(),venta.getId_producto(),
                venta.getCantidad(),venta.getPrecio_unitario(),venta.getFecha_venta(),
                venta.getHora_venta(),venta.getSucursal_id()
            };
            tableModel.addRow(rowData);
        }
    }
    
    public void setVisibleVentana(boolean opcion){
        ventana.setVisible(true);
    }

    public JTextField[] getTxtFields() {
        return txtFields;
    }

    public void setTxtFields(JTextField[] txtFields) {
        this.txtFields = txtFields;
    }

    public JButton[] getBtnNorte() {
        return btnNorte;
    }

    public void setBtnNorte(JButton[] btnNorte) {
        this.btnNorte = btnNorte;
    }

    public JButton getBtnListar() {
        return btnListar;
    }

    public void setBtnListar(JButton btnListar) {
        this.btnListar = btnListar;
    }

    public JButton getBtnSalir() {
        return btnSalir;
    }

    public void setBtnSalir(JButton btnSalir) {
        this.btnSalir = btnSalir;
    }
    
    
 
}
