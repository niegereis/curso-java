package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    String nome;
    List<Compra> compras = new ArrayList<>();

    Cliente(String nome){
        this.nome = nome;
    }
    void addCompra(Compra c){
        compras.add(c);
    }

    double obterValorTotal(){
        double total = 0;
        for (Compra compra: compras){
            for (Item item : compra.itens){
                total += item.qtd * item.produto.preco;
            }
        }
        return total;
    }

}
