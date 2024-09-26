package excecao;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {

        try{
            geraErro1();
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        try {
            geraErro2();
        } catch (Throwable e){
            System.out.println(e.getMessage());
        }

        System.out.println("Fim :)");
    }

    public static void geraErro1() {
       throw new RuntimeException("Ocorreu um erro bem legal #01!");
    }

    public static void geraErro2() throws Exception{
        try {
            throw new Exception("Ocorreu um erro bem legal #02!");
        } catch (Exception e){
            System.out.println("que legal!");
        }
    }
}
