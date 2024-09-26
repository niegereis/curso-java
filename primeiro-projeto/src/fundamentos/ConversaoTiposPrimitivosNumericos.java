package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
    public static void main(String[] args) {
        double  a = 1; //implícita
        System.out.println(a);

        float b = (float)1.12345; //explícita
        System.out.println(b);

        int c = 4;
        byte d = (byte) c;
        System.out.println(d);
    }
}
