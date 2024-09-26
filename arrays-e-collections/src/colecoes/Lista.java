package colecoes;
import java.util.ArrayList;
import java.lang.String;

public class Lista {
    public static void main(String[] args) {
        ArrayList<UsuarioLista> lista = new ArrayList<UsuarioLista>();
        UsuarioLista u1 = new UsuarioLista("Ana");

        lista.add(u1);
        lista.add(new UsuarioLista("Carlos"));
        lista.add(new UsuarioLista("Bia"));
        lista.add(new UsuarioLista("Manu"));

        for (UsuarioLista u : lista){
            System.out.println(u.nome);
        }
    }
}
