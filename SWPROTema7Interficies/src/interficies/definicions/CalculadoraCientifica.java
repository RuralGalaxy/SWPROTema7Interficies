package interficies.definicions;

/**
 *
 * @author Rafel Sastre.
 */
public interface CalculadoraCientifica extends Calculadora, Trigonometria {

    public double potencia(double numero, double elevacio);

    public double logaritme(double numero);

    public static final double E = 3.7586135;
}
