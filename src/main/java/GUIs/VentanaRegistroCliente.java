package GUIs;

import javax.swing.*;

public class VentanaRegistroCliente extends Ventana{
    JPanel panel;
    JLabel label1;
    JLabel label2;
    JLabel label3;
    JLabel label4;
    JLabel label5;
    JLabel label6;
    JTextField textField1;
    JTextField textField2;
    JTextField textField3;
    JTextField textField4;
    JTextField textField5;
    JButton button1;
    JButton button2;

    public VentanaRegistroCliente(String nombre, int largoX, int largoY) {
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
        generarJLabelEncabezado(label1,"Registro de Cliente",150,20,250,20);
        generarJLabel(label2,"Nombre: ",20,60,150,20);
        generarJLabel(label3,"Rut: ",20,110,150,20);
        generarJLabel(label4,"Dirección: ",20,160,100,20);
        generarJLabel(label5,"Correo electrónico: ",20,210,150,20);
        generarJLabel(label6,"Número telefónico: ",20,260,150,20);
    }

    private void camposTextoVentana() {
        textField1 = generarJTextField(200,60,240,20);
        this.add(textField1);
        textField2 = generarJTextField(200,110,240,20);
        this.add(textField2);
        textField3 = generarJTextField(200,160,240,20);
        this.add(textField3);
        textField4 = generarJTextField(200,210,240,20);
        this.add(textField4);
        textField5 = generarJTextField(200,260,240,20);
        this.add(textField5);
    }

    private void botonesVentana() {
        button1 = generarBoton("Registrar Cliente",70,350,150,20);
        this.add(button1);
        button2 = generarBoton("Cancelar",260,350,150,20);
        this.add(button2);
    }
}
