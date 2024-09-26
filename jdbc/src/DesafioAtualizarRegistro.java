import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DesafioAtualizarRegistro {
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o id da pessoa: ");
        int id = entrada.nextInt();

        String selectSQL = "SELECT codigo, nome FROM pessoas where codigo = ?";
        String updateSQL = "UPDATE pessoas SET nome = ? WHERE  codigo = ?";
        Connection connection = FabricaConexao.getConexao();
        PreparedStatement stmt = connection.prepareStatement(selectSQL);
        stmt.setInt(1, id);
        ResultSet resultado = stmt.executeQuery();

        if(resultado.next()){
            Pessoa p = new Pessoa(resultado.getInt(1), resultado.getNString(2));

            System.out.println("O nome atual é: " + p.getNome());
            entrada.nextLine();

            System.out.println("Informe o novo nome: ");
            String novoNome = entrada.nextLine();

            stmt.close();
            stmt = connection.prepareStatement(updateSQL);
            stmt.setString(1,novoNome);
            stmt.setInt(2, id);
            stmt.execute();

            System.out.println("Pessoa alterada com sucesso!");
        } else {
            System.out.println("Pessoa não encontrada!");
        }

        connection.close();
        entrada.close();
        stmt.close();
    }
}
