package filter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DesafioFilter01 {
    public static void main(String[] args) {
        Musico m1 = new Musico("Niege", "Violão", 20, 12);
        Musico m2 = new Musico("Niege", "Teclado", 20, 7);
        Musico m3 = new Musico("Niege", "Sanfona", 20, 7);
        Musico m4 = new Musico("Niege", "Flauta", 20, 10);
        Musico m5 = new Musico("Mari", "Violão", 24, 8);

        List<Musico> musicos = Arrays.asList(m1, m2, m3, m4, m5);

        Predicate<Musico> tocaViolao = m -> m.intrumentoQueToca.equalsIgnoreCase("VIOLÃO") && m.tempoExperiencia >= 10;

        musicos.stream()
                .filter(tocaViolao)
                .map(m -> m.nome)
                .forEach(System.out::println);

    }
}
