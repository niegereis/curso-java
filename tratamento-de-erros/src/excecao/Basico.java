package excecao;

public class Basico {
    public static void main(String[] args) {
        Aluno a1 = null;
        try {
            imprimirNomeDoAluno(a1);
        } catch (Exception exception) {
            System.out.println("Ocorreu um erro no momento de imprimir o usuário!");
        }

        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e){
            e.printStackTrace();
        }
    }

    public static void imprimirNomeDoAluno(Aluno aluno){
        System.out.println(aluno.nome);
    }
}
