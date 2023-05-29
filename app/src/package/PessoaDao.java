import java.util.ArrayList;

public class PessoaDao extends Dao {
	public void incluirPessoa(Pessoa p) throws Exception {
		open();
		stmt = con.prepareStatement("insert into pessoa values (?, ?, ?)");
		stmt.setInt(1, p.getIdPessoa());
		stmt.setString(2, p.getNomePessoa());
		stmt.setString(3,  p.getEmail());
		stmt.execute();
		stmt.close();
	}
}
