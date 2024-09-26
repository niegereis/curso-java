package fundamentos;
import java.lang.Math;
public class Dasafio {
    public static void main(String[] args) {
        double a = Math.pow((6 * (3 + 2)), 2)/(3*2);
        double b = Math.pow(((1-5) * (2 - 7)), 2)/(2);
        double numerador = Math.pow(10,3);
        double denominado = Math.pow((a-b),3);
        double resultado = denominado/numerador;
        System.out.println(resultado);
    }
}
