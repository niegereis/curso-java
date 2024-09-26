package oo.encapsulamento;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa(int idade, String nome) {
        setIdade(idade);
        setNome(nome);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0)
            this.idade = idade;
    }
}
