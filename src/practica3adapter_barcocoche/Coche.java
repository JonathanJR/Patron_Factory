package practica3adapter_barcocoche;

import javax.swing.JLabel;

/**
 *
 * @author Jonathan
 */
public class Coche implements Mandos {

    private Boolean on;
    JLabel jLabelCoche;

    public Coche(JLabel jLabelCoche) {
        System.out.println("Hola soy un Coche");
        this.jLabelCoche = jLabelCoche;
        on = false;
    }

    @Override
    public void encender() {
        if (on == false) {
            System.out.println("Encendiendo el coche");
            jLabelCoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/encenderCoche.jpg")));
            on = true;
        } else {
            System.out.println("El coche ya esta encendido");
        }
    }

    @Override
    public void acelerar() {
        if (on == true) {
            System.out.println("Acelerando el coche");
            jLabelCoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/acelerarCoche.jpg")));
        } else {
            System.out.println("El coche no esta encendido");
        }
    }

    @Override
    public void apagar() {
        if (on == true) {
            System.out.println("Apagando el coche");
            jLabelCoche.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/paradoCoche.png")));
            on = false;
        } else {
            System.out.println("Error. El coche no esta encendido");
        }
    }

}
