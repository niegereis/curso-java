package oo.heranca.teste;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Fusca;

public class CarroTeste {
    public static void main(String[] args) {
        Carro carro = new Carro(50);
        Civic civic = new Civic(140);
        Fusca fusca = new Fusca(100);

        civic.acelerar();
        fusca.acelerar();
        fusca.frear();
        fusca.frear();

        System.out.printf("Vel atual Fusca: " + fusca.velociadadeAtual);
        System.out.println();
        System.out.printf("Vel atual Civic: " + civic.velociadadeAtual);

    }
}
