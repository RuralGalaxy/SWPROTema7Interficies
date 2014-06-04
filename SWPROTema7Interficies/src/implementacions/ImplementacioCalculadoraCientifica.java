package implementacions;

import interficies.definicions.CalculadoraCientifica;

/**
 *
 * @author Rafel Sastre.
 */
public abstract class ImplementacioCalculadoraCientifica implements CalculadoraCientifica {

    private static final String TITOL = "Implementa la calculadora científica";

    public void mostrarTitol() {
        System.out.println(TITOL);
    }

    public double potencia(double numero, double elevacio) {
        return Math.pow(numero, elevacio);
    }

    public double logaritme(double numero) {
        return Math.log(numero);
    }

}
