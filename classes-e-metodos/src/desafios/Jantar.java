package desafios;

public class Jantar {
    public static void main(String[] args) {
        Comida c1 = new Comida("Arroz", 0.100);
        Comida c2 = new Comida("Bife", 0.500);

        Pessoa p = new Pessoa("Niege", 70);

        System.out.println("Antes de comer " + p.peso);
        p.comer(c1);
        System.out.println("Depois de comer " + c1.nome + " " + p.peso);
        p.comer(c2);
        System.out.println("Depois de comer " + c2.nome + " " + p.peso);
        System.out.println("A Niege está feliz!");
    }
}
