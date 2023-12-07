import java.beans.Statement;
import java.sql.Connection;


public class ConnectionDAO {
    public static void cleanup(){
        Connection con = ConnectionFactory.getConnection();
        Statement stmt = null;
        {
            try {
                stmt.executeUpdate("drop table tbl_basica");
            }catch(Exception ex){
                //ignorar todos os erros
            }
            con.close();
        }
    }public void doexemplo()throws SQLException{
        Connection con = ConnectionFactory.getConnection();
        Stantement stmt = null;
        System.out.println("\nExectando os testes: ");
        //criar a tabela que armazena os dados
        stmt.executeUpdate("create table tbl_basica (a int2, b int2)");
    }
}
