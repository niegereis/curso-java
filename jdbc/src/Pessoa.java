public class Pessoa {
    private int codigo;
    private String nome;

    public Pessoa(int c, String n) {
        codigo = c;
        nome = n;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int c) {
        codigo = c;
    }

}
