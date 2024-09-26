import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco  {
    public static void main(String[] args) throws SQLException {
        final String url = "jdbc:mysql://localhost?verifyServerCertificate=false&useSLL=true";
        final String user = "root";
        final String password = "my-secret-pw";

        Connection connection
                 = DriverManager.getConnection(url, user,password);

        Statement stmt = connection.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");

        System.out.println("Banco criado com sucesso!");

        connection.close();
    }
}
