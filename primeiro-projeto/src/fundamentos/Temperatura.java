package fundamentos;

public class Temperatura {
    public static void main(String[] args) {
        double tempF = 50.0;
        final double denominador = 9.0;
        final double numerador = 5.0;
        final double val = 32;
        double tempC = (tempF - val) * (numerador/denominador);
        System.out.println(tempC);
    }
}
