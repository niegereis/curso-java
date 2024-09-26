import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {
    private Connection connection;

    private Connection getConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                return connection;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        connection = FabricaConexao.getConexao();
        return connection;
    }

    private void adicionarAtributos(PreparedStatement stmt, Object[] atributos) throws SQLException {
        int indice = 1;
        for (Object at : atributos) {
            if (at instanceof String) {
                stmt.setString(indice, (String) at);
            } else if (at instanceof Integer) {
                stmt.setInt(indice, (Integer) at);
            }
            indice++;
        }
    }

    public int incluir(String sql, Object... atributos) {
        try {
            PreparedStatement stmt = getConnection()
                    .prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);
            adicionarAtributos(stmt, atributos);
            if (stmt.executeUpdate() > 0) {
                ResultSet resultSet = stmt.getGeneratedKeys();

                if (resultSet.next()) return resultSet.getInt(1);
            }

            return -1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void close() {

        try {
            getConnection().close();
        } catch (SQLException e) {

        } finally {
            connection = null;
        }
    }
}
