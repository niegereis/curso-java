package fundamentos;
import java.util.Scanner;
public class DesafioFinal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Informe o primeiro número: ");
        double num1 = entrada.nextDouble();

        System.out.print("Informe o segundo número: ");
        double num2 = entrada.nextDouble();
        entrada.nextLine();

        System.out.print("Digite a operação que deseja realizar: ");
        String op = entrada.nextLine();

        double resultado = "+".equals(op) ? num1 + num2 : 0;
        resultado = "-".equals(op) ? num1 - num2 : resultado;
        resultado = "*".equals(op) ? num1 * num2 : resultado;
        resultado = "/".equals(op) ? num1/num2 : resultado;

        System.out.println("Resultado: " + resultado);
    }

}
