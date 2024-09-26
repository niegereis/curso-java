import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {
    public static void main(String[] args) throws SQLException {

        Scanner entrada = new Scanner(System.in);

        Connection connection = FabricaConexao.getConexao();
        String sql = "SELECT * FROM pessoas where nome like ?";

        System.out.println("Filtre os nomes pela sílaba ou letra: ");
        String filtro = entrada.nextLine();

        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1,"%" + filtro + "%");
        ResultSet resultado = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<>();

        while (resultado.next()){
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getNString("nome");
            pessoas.add(new Pessoa(codigo,nome));
        }

        for(Pessoa p: pessoas){
            System.out.println(p.getCodigo() + " ===> " + p.getNome() );
        }

        entrada.close();
        stmt.close();
        connection.close();
    }
}
