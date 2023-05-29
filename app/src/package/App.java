
public class App {
    public static void main(String[] args) throws Exception {
    		PessoaDao pd = new PessoaDao();
    		try {
    				Pessoa p1 = new Pessoa(1, "arthur", "arthur@gmail.com");
    				Pessoa p2 = new Pessoa(2, "gabriella", "gabriella@gmail.com");
    				pd.incluirPessoa(p1);
    				pd.incluirPessoa(p2);



    } catch (Exception e) {
		System.out.println("Error:  " + e.getMessage());
	}	
}
}
