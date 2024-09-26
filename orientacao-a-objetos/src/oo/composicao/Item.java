package oo.composicao;

public class Item {
    String nome;
    int qtd;
    double preco;
    Compra compra;

    Item(String n, int q, double p){
        nome = n;
        qtd = q;
        preco = p;
    }
}
