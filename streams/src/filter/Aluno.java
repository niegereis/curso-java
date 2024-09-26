package filter;

import java.util.Objects;

public class Aluno {
    final String nome;
    public final double nota;
    final boolean bomcomportamento;

    public Aluno(String nome, double nota) {
        this(nome, nota, true);
    }

    public Aluno(String nome, double nota, boolean bomcomportamento) {
        this.nome = nome;
        this.nota = nota;
        this.bomcomportamento = bomcomportamento;
    }

    public String toString() {
        return nome + " tem nota " + nota;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Aluno aluno = (Aluno) o;

        if (Double.compare(nota, aluno.nota) != 0) return false;
        if (bomcomportamento != aluno.bomcomportamento) return false;
        return Objects.equals(nome, aluno.nome);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = nome != null ? nome.hashCode() : 0;
        temp = Double.doubleToLongBits(nota);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (bomcomportamento ? 1 : 0);
        return result;
    }
}
