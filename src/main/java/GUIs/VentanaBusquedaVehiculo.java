package GUIs;

import javax.swing.*;

public class VentanaBusquedaVehiculo extends Ventana{
    JPanel panel;
    JLabel label1;
    JLabel label2;
    JTextField textField1;
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

    }

    private void botonesVentana() {
        button1 = generarBoton("Buscar Vehículo",70,350,150,20);
        this.add(button1);
        button2 = generarBoton("Regresar",260,350,150,20);
        this.add(button2);
        accionbotones(button1,button2);
    }

    private void accionbotones(JButton button1, JButton button2) {

    }


}
