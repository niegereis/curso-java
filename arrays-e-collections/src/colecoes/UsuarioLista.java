package colecoes;
import java.lang.String;

public class UsuarioLista {
    String nome;

    UsuarioLista(String nome){
        this.nome = nome;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;

        UsuarioLista that = (UsuarioLista) object;

        return java.util.Objects.equals(nome, that.nome);
    }

    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (nome != null ? nome.hashCode() : 0);
        return result;
    }
}
