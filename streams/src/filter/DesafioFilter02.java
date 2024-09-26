package filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter02 {
    public static void main(String[] args) {
        Produto p1 = new Produto(2000, 0.30, true, "Notebook Dell G15");
        Produto p2 = new Produto(3000, 0.32, false, "iPhone 13 128 GB");
        Produto p3 = new Produto(2200, 0.26, true, "Notebook Samsung");
        Produto p4 = new Produto(5000, 0.34, true, "Galaxy Z");
        Produto p5 = new Produto(3500, 0.31, false, "Macbook Air");
        Produto p6 = new Produto(1500, 0.34, true, "Xiaomi");


        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5, p6);
        Predicate<Produto> temFreteEdesconto = p -> p.desconto >= 0.30 && p.temFreteGratis;
        Function<Produto, String> saudacaoFreteEdesconto =
                p -> p.nome + " " + p.preco + " tem um super desconto!";
        produtos.stream()
                .filter(temFreteEdesconto)
                .map(saudacaoFreteEdesconto)
                .forEach(System.out::println);


    }
}
