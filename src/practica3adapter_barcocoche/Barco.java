package practica3adapter_barcocoche;

import javax.swing.JLabel;

/**
 *
 * @author Jonathan
 */
public class Barco {

    private Boolean grifo;
    JLabel labelBarco;

    public Barco(JLabel jLabelBarco) {
        System.out.println("Hola soy un Barco");
        grifo = false;
        this.labelBarco = jLabelBarco;
    }

    public void Conectar() {
        System.out.println("Conectando barco");
        grifo = true;
    }

    public void Activar() {
        if (grifo == true) {
            System.out.println("Barco activo");
            labelBarco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/encenderBarco.jpg")));
        } else {
            System.out.println("Error. Barco no activo");
        }
    }

    public void moverMasRapido() {
        if (grifo == true) {
            System.out.println("Se aumenta la velocidad");
            labelBarco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/acelerarBarco.jpg")));
        } else {
            System.out.println("El barco esta inactivo");
        }
    }

    public void Detener() {
        if (grifo == true) {
            System.out.println("Deteniendo el barco");
        } else {
            System.out.println("El barco esta inactivo");
        }
    }

    public void Desconectar() {
        if (grifo == true) {
            System.out.println("El barco esta desconectado");
            grifo = false;
            labelBarco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/paradoBarco.jpg")));
        } else {
            System.out.println("El barco esta inactivo");
        }
    }
}
