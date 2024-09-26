package oo.polimorfismo;

public class Pessoa {
    private double peso;

    public Pessoa(double peso) {
        setPeso(peso);
    }

    public void comer(Comida comida) {
        this.peso += comida.getPeso();
    }

//    public void comer(Object o) {
//        if (o instanceof Arroz)
//            this.peso += ((Arroz) o).getPeso();
//        else if (o instanceof Feijao)
//            this.peso += ((Feijao) o).getPeso();
//        else
//            this.peso += ((Sorvete) o).getPeso();
//    }

//    public void comer(Arroz arroz) {
//        this.peso += arroz.getPeso();
//    }
//
//    public void comer(Feijao feijao) {
//        this.peso += feijao.getPeso();
//    }
//
//    public void comer(Sorvete sorvete) {
//        this.peso += sorvete.getPeso();
//    }

    public void setPeso(double peso) {
        if (peso >= 0)
            this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }
}
