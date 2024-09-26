package desafios;

public class DesafioData {
    int dia;
    int mes;
    int ano;

    DesafioData(){
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    DesafioData(int d, int m, int a){
        dia = d;
        mes = m;
        ano = a;
    }

    String obterDataFormatada(){
        return  this.dia + "/" + this.mes + "/" + this.ano;
    }
}
