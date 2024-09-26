package oo.heranca.desafio;

public class Carro {
    public int delta = 1;
    public int velociadadeAtual;
    final int VELOCIDADE_MAXIMA;

    public Carro(int velMax) {
        VELOCIDADE_MAXIMA = velMax;
    }

    public void acelerar() {
        if (velociadadeAtual + 5 > VELOCIDADE_MAXIMA)
            velociadadeAtual = VELOCIDADE_MAXIMA;
        velociadadeAtual += 5 * delta;
    }

    public void frear() {
        if (velociadadeAtual >= 5) {
            velociadadeAtual -= 5;
        }
    }
}
