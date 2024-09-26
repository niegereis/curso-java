package oo.composicao;

import java.util.ArrayList;

public class Compra {
    String cliente;
    ArrayList<Item> itens = new ArrayList<Item>();

    void addItem(String nome, int qtd, double preco){
        this.addItem(new Item(nome,qtd,preco));
    }
    void addItem(Item item){
        itens.add(item);
        item.compra = this;
    }

    double obterValorTotal(){
        double total = 0;
        for (Item item: itens){
            total += item.qtd * item.preco;
        }

        return total;
    }

}
