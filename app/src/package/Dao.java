import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


class Dao {

    Connection con;
    PreparedStatement stmt;
    ResultSet rs;
    CallableStatement call;

    public void open() throws Exception{
        String url = "jdbc:postgresql://localhost:5432/arthurjava";
        String user = "postgres";
        String password = "1234";
        try {
         Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão estabelecida");
        } catch (SQLException | ClassNotFoundException ex){
            System.out.println("Erro ao conectar ao banco de dados");
            throw ex;
        }
    }
}
        
    
