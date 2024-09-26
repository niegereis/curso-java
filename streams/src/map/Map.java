package map;

import java.util.function.Consumer;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.Arrays;
import java.util.stream.Stream;


public class Map {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");

        marcas.stream().map(m -> m.toUpperCase()).forEach(print);
        System.out.println();


        System.out.println(Utilitarios.maiuscula.andThen(Utilitarios.primeiraLetra).andThen(Utilitarios::grito).apply("BMW"));
        System.out.println();

        System.out.println("Usando composição");
        marcas.stream()
                .map(Utilitarios.maiuscula)
                .map(Utilitarios.primeiraLetra)
                .map(Utilitarios::grito)
                .forEach(print);
    }
}
