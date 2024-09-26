package colecoes;
import java.util.Deque;
import java.util.ArrayDeque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<String>();
        livros.add("O pequeno principe");
        livros.add("Dom quixote");
        livros.push("O Hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());
    }
}
