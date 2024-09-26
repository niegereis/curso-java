package exercicios;
import java.util.List;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Stream;

public class ImprimindoObjetos {
    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Lu", "Gui", "Ana", "Juh");

        System.out.println("Usando fori");
        for (int i = 0; i < aprovados.size(); i++) {
            System.out.println(aprovados.get(i));
        }
        System.out.println();

        System.out.println("Usando foreach");
        for (String nome : aprovados){
            System.out.println(nome);
        }
        System.out.println();

        System.out.println("Usando iterator");
        Iterator<String> iterator = aprovados.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();

        System.out.println("Usando stream");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println);

    }
}
