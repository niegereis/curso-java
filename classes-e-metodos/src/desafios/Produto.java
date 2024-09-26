package desafios;

public class Produto {
    String nome;
    double preco;
    static double desconto = 0.25;
    Produto(){

    }

    Produto(String n, double p){
        nome = n;
        preco = p;
    }

    double precoComDesconto(){
        return this.preco - (1 - this.desconto);
    }
}
