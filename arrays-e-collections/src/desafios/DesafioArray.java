package desafios;
import java.util.Scanner;


public class DesafioArray {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantas notas você quer informar? ");
        int tam = entrada.nextInt();
        double[] listaDeNotas = new double[tam];

        for (int i = 0; i < tam; i++) {
            System.out.print("Digite a nota: ");
            listaDeNotas[i] = entrada.nextInt();
        }

        double total = 0;
        for (double nota : listaDeNotas){
            total += nota;
        }

        System.out.println("Média das notas: " + total/listaDeNotas.length);

        entrada.close();
    }
}
