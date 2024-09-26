import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;

public class CriarTabelaPessoas  {
    public static void main(String[] args) throws SQLException{
        Connection conexao = FabricaConexao.getConexao();

        String sql = "CREATE TABLE IF NOT EXISTS pessoas (" +
                "codigo INT AUTO_INCREMENT PRIMARY KEY," +
                "nome VARCHAR(80) NOT NULL" +
                ")";

        Statement stmt = conexao.createStatement();
        stmt.execute(sql);

        System.out.println("Tabela criada com sucesso!");
        conexao.close();
    }
}
