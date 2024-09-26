package oo.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(19, "Niege");

        System.out.println(p1.getNome() + " " + p1.getIdade());
    }
}
