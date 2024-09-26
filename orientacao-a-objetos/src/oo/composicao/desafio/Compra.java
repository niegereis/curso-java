package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    List<Item> itens = new ArrayList<>();

    void addItem(Produto p, int qtd) {
        itens.add(new Item(qtd,p));
    }
}
