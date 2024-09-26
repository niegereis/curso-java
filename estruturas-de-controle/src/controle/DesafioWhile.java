package controle;

import java.util.Scanner;

public class DesafioWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double digitado;
        double total = 0;
        int contNotasValidas = 0;

        do {
            System.out.print("Digite sua nota: ");
            digitado = entrada.nextDouble();
            if(digitado >= 5 && digitado <= 10) {
                total += digitado;
                contNotasValidas++;
            }
        } while (digitado != -1);

        System.out.println("Média das notas: " + total/contNotasValidas);
        System.out.println("Quantidade de notas válidas digitadas: " + contNotasValidas);
    }
}
