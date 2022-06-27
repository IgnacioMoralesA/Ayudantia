package GUIs;

import javax.swing.*;

public class VentanaVentas extends Ventana {
    JPanel panel;
    JLabel label;

    protected VentanaVentas(String nombre, int largoX, int largoY) {
        super(nombre, largoX, largoY);
        iniciarcomp();
    }

    private void iniciarcomp(){
        panelVentana();
        etiquetaVentana();
    }

    private void panelVentana() {
        panel=new JPanel();
        this.add(panel);
    }

    private void etiquetaVentana() {
        generarJLabel(label,"PROXIMAMENTE",20,60,150,20);
    }
}
