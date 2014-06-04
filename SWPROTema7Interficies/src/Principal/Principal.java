package Principal;

import interficies.definicions.Calculadora;
import interficies.definicions.CalculadoraCientifica;
import interficies.definicions.Trigonometria;
import implementacions.ImplementacioCalculadora;
import implementacions.ImplementacioCalculadoraCientifica;
import implementacions.ImplementacioTrigonometria;
import dades.Preferencia;

/**
 *
 * @author Rafel Sastre.
 */
public class Principal {

    public static void main(String[] args) {

        Preferencia Prefe = new Preferencia("Garrova");
        System.out.println(Prefe.getXML());
        calculadora(new ImplementacioCalculadora());
        //calculadoraCientifica(new ImplementacioCalculadoraCientifica());
        trigonometria(new ImplementacioTrigonometria());
    }

    public static void calculadora(Calculadora calcul) {
    }

    public static void calculadoraCientifica(CalculadoraCientifica calccient) {
    }

    public static void trigonometria(Trigonometria trigono) {
    }

}
