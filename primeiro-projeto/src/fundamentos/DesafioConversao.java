package fundamentos;
import java.util.Scanner;
import java.util.Locale;

public class DesafioConversao {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("en", "US"));
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o primeiro salário: ");
        String sal1 = entrada.next().replace("," , ".");
        System.out.print("Digite o segundo salário: ");
        String sal2 = entrada.next().replace("," , ".");
        System.out.print("Digite o terceiro salário: ");
        String sal3 = entrada.next().replace("," , ".");

        double s1 = Double.parseDouble(sal1);
        double s2 = Double.parseDouble(sal2);
        double s3 = Double.parseDouble(sal3);

        double media =(s1 + s2 +s3) / 3;
        System.out.println("A média salarial é: " + media);
    }
}
