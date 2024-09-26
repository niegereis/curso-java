package desafios;

public class DesafioDataTeste {
    public static void main(String[] args) {
        DesafioData d1 = new DesafioData(8,3,2004);
        DesafioData d = new DesafioData();
//        System.out.println( d1.dia + "/" + d1.mes + "/" + d1.ano);
        System.out.println(d1.obterDataFormatada());
        System.out.println(d.obterDataFormatada());

    }
}
