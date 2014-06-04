package implementacions;

import interficies.definicions.Calculadora;

/**
 *
 * @author Rafel Sastre.
 */
public class ImplementacioCalculadora implements Calculadora {

    private static final String TITOL = "Implementació de la calculadora";

    public void mostrarTitol() {
        System.out.println(TITOL);
    }

    public int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public int resta(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public int multiplicacio(int numero1, int numero2) {
        return numero1 * numero2;
    }
}
