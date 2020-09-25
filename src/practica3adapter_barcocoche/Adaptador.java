package practica3adapter_barcocoche;

import javax.swing.JLabel;

/**
 *
 * @author Jonathan
 */
public class Adaptador extends Barco implements Mandos {

    public Adaptador(JLabel jLabelBarco) {
        super(jLabelBarco);
    }

    @Override
    public void encender() {
        Conectar();
        Activar();
    }

    @Override
    public void acelerar() {
        moverMasRapido();
    }

    @Override
    public void apagar() {
        Detener();
        Desconectar();
    }

}
