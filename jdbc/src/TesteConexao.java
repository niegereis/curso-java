import java.lang.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {
        final String urlOfConnection = "jdbc:mysql://localhost:3306/wm?verifyServerCertificate=false&useSLL=true";
        final String user = "root";
        final String password = "my-secret-pw";

        Connection conection = DriverManager
                .getConnection(urlOfConnection,user,password);

        System.out.println("Conexão efetuada com sucesso!");
        conection.close();

    }
}
