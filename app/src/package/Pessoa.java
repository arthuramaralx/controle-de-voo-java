
public class Pessoa {
	
	public Pessoa(int idPessoa, String nomePessoa, String email) {
		super();
		this.idPessoa = idPessoa;
		this.nomePessoa = nomePessoa;
		this.email = email;
	}
	
	
	public Pessoa(String nomePessoa, String email) {
		super();
		this.idPessoa = idPessoa;
		this.nomePessoa = nomePessoa;
		this.email = email;
	}
	
		
	public int getIdPessoa() {
		return idPessoa;
	}
	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}
	public String getNomePessoa() {
		return nomePessoa;
	}
	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	private int idPessoa;
	private String nomePessoa;
	private String email;
}

