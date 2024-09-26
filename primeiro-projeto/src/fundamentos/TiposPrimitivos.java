package fundamentos;

public class TiposPrimitivos {
    public static void main(String[] args) {
        //Informações do funcionário

        //Tipo numéricos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_134_845_223L;

        //Tipos numéricos reais
        float salario = 11_445.44F;
        double vendasAcumuladas = 2+991_797_103.01;

        //Tipo booleano
        boolean estaDeFerias = false;

        //Tipo caracte
        char status = 'A';

        System.out.println(anosDeEmpresa * 365);
        System.out.println(numeroDeVoos/2);
        System.out.println(pontosAcumulados/vendasAcumuladas);
        System.out.println(id + ": ganha ->" + salario);
        System.out.println("Féria? " + estaDeFerias);
        System.out.println("Status: " + status);
    }
}
