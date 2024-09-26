package fundamentos;

public class DesafioLogico {
    public static void main(String[] args) {
        boolean trabalho1 = false;
        boolean trabalho2 = true;

        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTv32 = trabalho1 ^ trabalho2;
        boolean tomouSorvete = trabalho1 || trabalho2;
        boolean ehSaudavel = !tomouSorvete;

        System.out.println("Comprou Tv 50\"? " + comprouTv50);
        System.out.println("Comprou Tv 32\"? " + comprouTv32);
        System.out.println("Tomou sorvete? " + tomouSorvete);
        System.out.println("eh Saudável? " + ehSaudavel);

    }
}
