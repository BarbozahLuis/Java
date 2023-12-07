package connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionDAO {
    // atributo
    private Connection connection;

    // construtor
    public ConnectionDAO() {
        this.connection = ConnectionFactory.getConnection(); // sempre q eu chamar o construtor irá estabelecer uma
                                                             // conexão

    }

    // metodos criar tabela
    public void criaTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS MINHA_TABELA (ID SERIAL PRIMARY KEY,NOME VARCHAR(255),EMAIL VARCHAR(255))"; // primary
                                                                                                                             // key,
                                                                                                                             // é
                                                                                                                             // um
                                                                                                                             // dado
                                                                                                                             // unico,
                                                                                                                             // nao
                                                                                                                             // tem
                                                                                                                             // como
                                                                                                                             // repitir
                                                                                                                             // se
                                                                                                                             // tentar
                                                                                                                             // ele
                                                                                                                             // dará
                                                                                                                             // erro
        try (Statement stmt = connection.createStatement()) { //
            stmt.execute(sql);
            System.out.println("Tabela criada com sucesso.");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar a tabela: " + e.getMessage(), e);
        } finally {// finally é utilizado para executar de qualquer forma uma ação, neste caso, irá
                   // fechar, dando erro ou nao
            ConnectionFactory.closeConnection(this.connection);
        }
    }

    // apagar tabela
    public void apagarTabela() {
        String sql = "DROP TABLE MINHA_TABELA";
        try (Statement stmt = connection.createStatement()) {
            stmt.executeUpdate(sql);
            System.out.println("Tabela apagada com sucesso.");
        } catch (Exception e) {
            throw new RuntimeException("Erro ao apagar tabela.", e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }

    public void inserir(String nome, String email) {
        String sql = "INSERT INTO MINHA_TABELA (NOME, EMAIL) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, email);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }
    // buscar pelo id

    // Método para buscar dados na tabela com base em um ID
    // específico
    public void buscarPorId(int id) {
        // Define a instrução SQL parametrizada para buscar dados por ID
        String sql = "SELECT * FROM MINHA_TABELA WHERE ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet resultSet = stmt.executeQuery(); // Executa a consulta e obtém resultados

            while (resultSet.next()) {
                int idBuscado = resultSet.getInt("ID");
                String nomeBuscado = resultSet.getString("NOME");
                String emailBuscado = resultSet.getString("EMAIL");
                System.out.println(
                        "O resultado da busca é id " + idBuscado + " nome " + nomeBuscado

                                + " email " + emailBuscado);

            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao buscar dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }

    // Método para atualizar dados na tabela com base em um ID
    // específico
    public void atualizarID(int id, String novoNome, String novoEmail) {
        // Define a instrução SQL parametrizada para atualizar dados por ID
        String sql = "UPDATE MINHA_TABELA SET nome = ?, email = ? WHERE ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, novoNome);
            stmt.setString(2, novoEmail);
            stmt.setInt(3, id);
            stmt.executeUpdate(); // Executa a instrução SQL

            System.out.println("Dados atualizados com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar dados no banco de dados.", e);
        } finally {
            ConnectionFactory.closeConnection(this.connection);
        }
    }
}
