package oo.composicao.desafio;

public class ClienteTest {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Niege");

        Compra compra1 = new Compra();

        compra1.addItem(new Produto("Café", 8.0), 4);
        compra1.addItem(new Produto("Arroz", 10.0), 2);

        Compra compra2 = new Compra();

        compra2.addItem(new Produto("Bala", 2.0),10);
        compra2.addItem(new Produto("Alho", 1.0), 6);

        c1.addCompra(compra1);
        c1.addCompra(compra2);

        System.out.println(c1.obterValorTotal());

    }
}
