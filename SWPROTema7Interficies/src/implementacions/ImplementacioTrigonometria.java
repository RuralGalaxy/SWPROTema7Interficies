package implementacions;

import interficies.definicions.Trigonometria;

/**
 *
 * @author Rafel Sastre.
 */
public class ImplementacioTrigonometria implements Trigonometria {

    private static final String TITOL = "Implementa la trigonometria";

    public void mostrarTitol() {
        System.out.println(TITOL);
    }

    public double sinus(double numero) {
        return Math.sin(numero);
    }

    public double cosinus(double numero) {
        return Math.cos(numero);
    }
}
