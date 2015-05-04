package controle;

public class Acesso {
	private String nome;
	private String senha;
	
	public String getNome(){
		return nome;
	}
	public String getSenha(){
		return senha;
	}
	
	public Acesso(String nome, String senha){
		this.nome = nome;
		this.senha = senha;
	}
	
	void cadastro(String nome, String cpf, String senha){
		
	}
	
	void login(String nome, String senha){
		
	}
}
