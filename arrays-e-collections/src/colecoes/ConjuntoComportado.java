package colecoes;
import  java.util.TreeSet;
import java.util.SortedSet;
public class ConjuntoComportado {
    public static void main(String[] args) {
        SortedSet<String> listaAprovados = new TreeSet<>();


        listaAprovados.add("Marryany");
        listaAprovados.add("Reis");
        listaAprovados.add("Silva");
        System.out.println(listaAprovados);

        for (String candidato : listaAprovados){
            System.out.println(candidato);
        }
    }
}
