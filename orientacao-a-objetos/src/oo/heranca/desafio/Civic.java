package oo.heranca.desafio;

public class Civic extends Carro implements Esportivo {

    public Civic(int velMax) {
        super(velMax);
    }

    public void acelerar() {
        velociadadeAtual += 15;
    }

    @Override
    public void ligarTurbo() {
        delta = 15;
    }

    @Override
    public void desligarTurbo() {
        delta = 10;
    }
}
