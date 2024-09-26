package filter;

public class Produto {
    final double preco;
    final double desconto;
    final boolean temFreteGratis;

    final String nome;

    public Produto(double preco, double desconto, boolean temFreteGratis, String nome) {
        this.preco = preco;
        this.desconto = desconto;
        this.temFreteGratis = temFreteGratis;
        this.nome = nome;
    }
}
