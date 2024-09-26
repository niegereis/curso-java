package map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.lang.String;
import java.util.function.Function;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DesafioMap {
    public static void main(String[] args) {
        Consumer<String> print = System.out::print;

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
        Function<String, Integer> binarioParaInt = s -> Integer.parseInt(s, 2);

        nums.stream()
                .map(n -> Integer.toString(n, 2))
                .map(inverter)
                .map(binarioParaInt)
                .forEach(System.out::println);


    }
}
