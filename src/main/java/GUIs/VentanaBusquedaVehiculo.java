package GUIs;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import model.Automotora;

public class VentanaBusquedaVehiculo extends Ventana {
    Automotora automotora;
    JPanel panel;
    JLabel label1;
    JLabel label2;
    JTextField textField1;
    JTextField textField2;
    JButton button1;
    JButton button2;

    public VentanaBusquedaVehiculo(String nombre, int largoX, int largoY) {
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
        generarJLabel(label1,"Modelo Vehículo",20,60,150,20);
        generarJLabel(label2,"Marca Vehículo", 20,110,150,20);
    }

    private void camposTextoVentana() {
        textField1 = generarJTextField(200,60,240,20);
        this.add(textField1);
        textField2 = generarJTextField(200,110,240,20);
        this.add(textField2);
    }

    private void botonesVentana() {
        button1 = generarBoton("Buscar Vehículo",70,350,150,20);
        this.add(button1);
        button2 = generarBoton("Regresar",260,350,150,20);
        this.add(button2);
        accionbotones(button1,button2);
    }

    private void accionbotones(JButton button1, JButton button2) {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                automotora.buscarAutoMarca(textField1.getText());
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