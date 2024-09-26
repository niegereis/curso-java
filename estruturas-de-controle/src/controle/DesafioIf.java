package controle;

import java.util.Scanner;

public class DesafioIf {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o dia da semana: ");
        String dia = entrada.nextLine();

        if("segunda".equals(dia)){
            System.out.println("1");
        } else if ("terça".equals(dia)) {
            System.out.println("2");
        } else if ("quarta".equals(dia)) {
            System.out.println("3");
        } else if (dia.equals("quinta")) {
            System.out.println("4");
        } else if (dia.equals("sexta")) {
            System.out.println("5");
        } else if (dia.equals("sábado")) {
            System.out.println("6");
        } else  {
            System.out.println("7");
        }
    }
}
