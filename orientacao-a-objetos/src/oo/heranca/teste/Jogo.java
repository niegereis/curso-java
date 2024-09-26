package oo.heranca.teste;

import oo.heranca.Heroi;
import oo.heranca.Jogador;

public class Jogo {
    public static void main(String[] args) {
        Heroi j1 = new Heroi(10, 12);
        j1.x = 10;
        j1.y = 10;

        Jogador j2 = new Jogador();
        j2.x = 10;
        j2.y = 11;

        System.out.println(j1.vida);
        System.out.println(j2.vida);

        j1.atacar(j2);

        System.out.println(j1.vida);
        System.out.println(j2.vida);

    }
}
