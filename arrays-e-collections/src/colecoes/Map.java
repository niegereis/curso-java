package colecoes;

import java.util.HashMap;
import java.lang.String;
import java.lang.Number;
import java.util.Map.Entry;

public class Map<I extends java.lang.Number, S> {
    public static void main(String[] args) {
        HashMap<Integer, String> usuarios = new HashMap<Integer, String>();
        usuarios.put(1, "Roberto");
        usuarios.put(21, "Gui");
        usuarios.put(7, "Carlos");
        usuarios.put(4, "Arnaldo");

        System.out.println(usuarios.size());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(21));
        System.out.println(usuarios.containsValue("Gui"));

        System.out.println(usuarios.get(4));

        for (int chave : usuarios.keySet()) {
            System.out.println(chave);
        }

        for (String valor : usuarios.values()) {
            System.out.println(valor);
        }

        for (Entry<Integer, String> registro : usuarios.entrySet()) {
            System.out.println(registro.getKey());
            System.out.println(registro.getValue());
        }
    }
}
