package Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.Produtos;
import Model.Venda;
import Model.Cliente;

public class ClientesDAO {
    private Connection connection;
    private List<Cliente> clientes;


    public ClientesDAO(){
        this.connection = ConnectionFactory.getConnection();
    }

    public void criaTabela() throws SQLException{
        String sql = "CREATE TABLE IF NOT EXISTS cadastro_cliente (CPF VARCHAR(255) PRIMARY KEY, NOME VARCHAR(255))";

        try(Statement stmt = this.connection.createStatement()){
            stmt.execute(sql);
            System.out.println("Tabela criada com sucesso.");
        } catch (SQLException e){
            throw  new RuntimeException("Erro ao criar a tabela " + e.getMessage(), e);
        } finally{
            ConnectionFactory.closeConnection(this.connection);
        }
    }

    //Listar todos os valores cadastrados
    public List <Cliente> listarTodos(){
        PreparedStatement stmt = null; // Declaração do Objeto PreaparedStatement para executar a Consulta

        ResultSet rs = null; // Declaração do objeto ResultSet para armazenar os resultados da consulta

        clientes = new ArrayList<>(); //Cria uma lista para armazenar as vendas recuperas do banco de dados
        
        try{
            stmt = connection.prepareStatement("SELECT * FROM estoque_mercado");
            //Prepara a consulta SQL para selecionar todos os registros da tabela
            rs = stmt.executeQuery();
            //Executa a consulta e armazena os resultados no ResultSet
            while (rs.next()){
                //Para cada registro no ResultSet, cria um objeto vendas com os valores do registro

                Cliente cliente = new Cliente(
                    rs.getString("CPF"),
                    rs.getString("nome"),
                 clientes.add(cliente)); //adiciona o objeto vendas a lista de vendas   
            }
        } catch(SQLException ex){
            System.out.println(ex);// Em aso de erro durante a consulta, imprime o erro
        }finally {
            ConnectionFactory.closeConnection(connection, stmt, rs);
            
            //fecha a conexão, o PreparedStatement e o ResultSet
        }
        return clientes ; // Retorna a lista de vendas recuperados do banco de dados
    }
}
