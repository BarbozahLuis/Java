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



public class ProdutoDAO {
    //atributos
    private Connection connection;
    private List<Produtos> produtos;

    //construtor
    public ProdutoDAO(){
        this.connection = ConnectionFactory.getConnection();
    }

    //metodo CRUD
    public void criaTabela() throws SQLException{
        String sql = "CREATE TABLE IF NOT EXISTS estoque_mercado (CODIGO VARCHAR(255) PRIMARY KEY, NOME VARCHAR(255), QUANTIDADE VARCHAR(255), PRECO VARCHAR(255))";

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
    public List <Produtos> listarTodos(){
        PreparedStatement stmt = null; // Declaração do Objeto PreaparedStatement para executar a Consulta

        ResultSet rs = null; // Declaração do objeto ResultSet para armazenar os resultados da consulta

        produtos = new ArrayList<>(); //Cria uma lista para armazenar as vendas recuperas do banco de dados
        
        try{
            stmt = connection.prepareStatement("SELECT * FROM estoque_mercado");
            //Prepara a consulta SQL para selecionar todos os registros da tabela
            rs = stmt.executeQuery();
            //Executa a consulta e armazena os resultados no ResultSet
            while (rs.next()){
                //Para cada registro no ResultSet, cria um objeto vendas com os valores do registro

                Produtos produto = new Produtos(
                    rs.getString("codigo"),
                    rs.getString("nome"),
                    rs.getInt("quantidade"),
                    rs.getDouble("preco"));
                 produtos.add(produto); //adiciona o objeto vendas a lista de vendas   
            }
        } catch(SQLException ex){
            System.out.println(ex);// Em aso de erro durante a consulta, imprime o erro
        }finally {
            ConnectionFactory.closeConnection(connection, stmt, rs);
            
            //fecha a conexão, o PreparedStatement e o ResultSet
        }
        return produtos; // Retorna a lista de vendas recuperados do banco de dados
    }


    //listar apenas um produto na venda
    public List <Produtos> listarUm(){
        PreparedStatement stmt = null; // Declaração do Objeto PreaparedStatement para executar a Consulta

        ResultSet rs = null; // Declaração do objeto ResultSet para armazenar os resultados da consulta

        produtos = new ArrayList<>(); //Cria uma lista para armazenar as vendas recuperas do banco de dados
        
        try{
            stmt = connection.prepareStatement("SELECT * FROM estoque_mercado WHERE codigo = ?");
            //Prepara a consulta SQL para selecionar todos os registros da tabela
            rs = stmt.executeQuery();
            //Executa a consulta e armazena os resultados no ResultSet
            while (rs.next()){
                //Para cada registro no ResultSet, cria um objeto vendas com os valores do registro

                Venda venda = new Venda(
                    rs.getString("codigo"),
                    rs.getString("nome"),
                    rs.getInt("quantidade"),
                    rs.getDouble("preco"));
                 venda.add(venda); //adiciona o objeto vendas a lista de vendas   
            }
        } catch(SQLException ex){
            System.out.println(ex);// Em aso de erro durante a consulta, imprime o erro
        }finally {
            ConnectionFactory.closeConnection(connection, stmt, rs);
            
            //fecha a conexão, o PreparedStatement e o ResultSet
        }
        return produtos; // Retorna a lista de vendas recuperados do banco de dados
    }

    //cadastrar produto
    public void cadastrar (String codigo, String nome, int quantidade, double preco){
        PreparedStatement stmt = null;
        String sql = "INSET INTO estoque_mercado (codigo, nome, quantidade, preco) VALUES (?, ?, ?, ?)";
        try{
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, codigo);
            stmt.setString(2, nome);
            stmt.setInt(3, quantidade);
            stmt.setDouble(4, preco);
            stmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso");
        }
    }


    


}



//select from estoque_mercado where codigo = ?
