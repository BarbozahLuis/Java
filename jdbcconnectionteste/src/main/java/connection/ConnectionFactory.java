package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    // atributos de connection
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres"; // se colocar o a palavra "final" o
                                                                                   // arquivo nao pode ser alterado
    private static final String USUARIO = "postgres";
    private static final String SENHA = "postgres";

    // métodos de conexão
    // getConnection
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao obter conexão com o banco de dados.", e);
        }
    }
    //close connection
    public static void closeConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
}
