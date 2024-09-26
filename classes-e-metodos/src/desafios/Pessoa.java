package desafios;

public class Pessoa {
    String nome;
    double peso;

    Pessoa(String n , double p){
        nome = n;
        peso = p;
    }

    void comer(Comida c){
        peso = c.peso + peso;
    }
}
