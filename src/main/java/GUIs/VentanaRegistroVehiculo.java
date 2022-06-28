package GUIs;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Automotora;

public class VentanaRegistroVehiculo extends Ventana{
    JPanel panel;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JLabel label6;
    JLabel label7;
    JTextField textField1;
    JTextField textField2;
    JTextField textField3;
    JTextField textField4;
    Automotora automotora;

    public VentanaRegistroVehiculo(String nombre, int largoX, int largoY) {
        super(nombre, largoX, largoY);
        iniciarComponentes();
    }

    private void iniciarComponentes() {
        panelVentana();
        etiquetasVentana();
        camposTextoVentana();
        botonesVentana();
    }

    private void panelVentana() {
        panel = new JPanel();
        this.add(panel);
    }

    private void etiquetasVentana() {
        generarJLabelEncabezado(label1,"Registro de Vehiculo",150,20,250,20);
        generarJLabel(label2,"Modelo Vehículo: ",20,60,150,20);
        generarJLabel(label3,"Marca Vehículo: ",20,110,150,20);
        generarJLabel(label4,"Color Vehículo: ",250,110,150,20);
        generarJLabel(label5,"Año: ",20,160,100,20);
        generarJLabel(label6,"Precio: ",20,210,150,20);
        generarJLabel(label7,"Kilómetros recorridos: ",20,260,150,20);
    }

    private void camposTextoVentana() {
        textField1 = generarJTextField(200,60,240,20);
        this.add(textField1);
        textField2 = generarJTextField(200,160,240,20);
        this.add(textField2);
        textField3 = generarJTextField(200,210,240,20);
        this.add(textField3);
        textField4 = generarJTextField(200,260,240,20);
        this.add(textField4);
    }

    private void desplegable1(){

    }

    private void botonesVentana() {
        JButton button1 = generarBoton("Registrar Vehículo",70,350,150,20);
        this.add(button1);
        JButton button2 = generarBoton("Cancelar",260,350,150,20);
        this.add(button2);
        accionBotones(button1,button2);
    }

    private void accionBotones(JButton button1, JButton button2) {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //automotora.añadirVehiculos(textField1.getText(),textField2.getColumns(),textField3.getColumns(),textField4.getColumns());
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                VentanaMenuVentas ventanaMenuVentas = new VentanaMenuVentas("Menu de Ventas",500,500);
            }
        });
    }
}
