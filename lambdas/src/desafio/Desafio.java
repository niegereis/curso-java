package desafio;

import predicado.Produto;

import java.text.DecimalFormat;
import java.util.function.Function;
import java.util.function.UnaryOperator;


public class Desafio {
    public static void main(String[] args) {
        Produto p = new Produto("iPad", 3235.89, 0.13);

        Function<Produto, Double> calculaPrecoFinal =
                produto -> produto.preco * (1 - produto.desconto);

        UnaryOperator<Double> calculaImpostoMunicipal =
                valorProduto -> valorProduto >= 2500 ? (valorProduto * 1.085) : valorProduto;

        UnaryOperator<Double> calculaValorFrete =
                valorProduto -> valorProduto >= 3000 ? valorProduto + 100.0 : valorProduto + 50.0;

        Function<Double, String> arredondarValorFinal =
                valorProduto -> new DecimalFormat("0.00").format(valorProduto);

        Function<String, String> formatar =
                valorProduto -> ("R$" + valorProduto).replace(".", ",");

        String resultado = calculaPrecoFinal
                .andThen(calculaImpostoMunicipal)
                .andThen(calculaValorFrete)
                .andThen(arredondarValorFinal)
                .andThen(formatar)
                .apply(p);

        System.out.println(resultado);
    }
}
