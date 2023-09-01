package entities;

public class Aluno {
	String nome;
	String email;
	Integer ra;
	
	public Aluno(String nome, String email, Integer ra) {
		this.nome = nome;
		this.email = email;
		this.ra = ra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getRa() {
		return ra;
	}

	public void setRa(Integer ra) {
		this.ra = ra;
	}

	@Override
	public String toString() {
		return "nome: " 
				+ nome 
				+ ",\nemail: " 
				+ email 
				+ ",\nra: " 
				+ ra;
		
	}
	

}
