package controle;

import java.util.Scanner;

public class DesafioWhileAula {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite: ");
        String palavra = entrada.nextLine();

        while(!(palavra.equalsIgnoreCase("sair"))){
            System.out.println("Digite: ");
            palavra = entrada.nextLine();
        }
    }
}
