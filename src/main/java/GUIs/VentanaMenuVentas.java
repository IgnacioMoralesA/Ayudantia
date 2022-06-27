package GUIs;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaMenuVentas extends Ventana {
    private JPanel panel;
    private JLabel label;


    public VentanaMenuVentas(String nombre, int largoX, int largoY) {
        super(nombre, largoX, largoY);
        iniciarComponentes(largoX);
    }

    private void iniciarComponentes(int largoX){
        panelVentana();
        etiquetasVentana();
        botonesVentana(largoX);
    }

    private void panelVentana(){
        panel = new JPanel();
        this.add(panel);
    }

    private void etiquetasVentana() {
        generarJLabelEncabezado(label,"Sistema de Venta de Vehiculos",20,20,300,20);
    }

    private void botonesVentana(int largoX){
        JButton button1 = generarBoton("Registrar Clientes",largoX/3,80,150,40);
        JButton button2 = generarBoton("Registrar Vehiculo",largoX/3,150,150,40);
        JButton button3 = generarBoton("Buscar Vehiculo",largoX/3,220,150,40);
        JButton button4 = generarBoton("Vender Vehiculo",largoX/3,290,150,40);
        JButton button5 = generarBoton("Salir",largoX/3,360,150,40);
        
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
        this.add(button5);
        
        accionesdebotones(button1,button2,button3,button4,button5);
    }

    private void accionesdebotones(JButton button1,JButton button2,JButton button3,JButton button4,JButton button5) {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaRegistroCliente ventanaRegistroCliente = new VentanaRegistroCliente("Registro de Cliente",500,500);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaRegistroVehiculo ventanaRegistroVehiculo = new VentanaRegistroVehiculo("Registro de Vehículo",500,500);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaBusquedaVehiculo ventanaBusquedaVehiculo = new VentanaBusquedaVehiculo("B{usqueda de Veh{iculo",500,500);
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaVentas ventanaVentas = new VentanaVentas("Venta",500,500);
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
