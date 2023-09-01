package entities;

public class Livro {
	private String nome;
	private String editora;
	private String assunto;
	private String autor;
	
	public Livro(String nome, String editora, String autor, String assunto) {
		this.nome = nome;
		this.editora = editora;
		this.assunto = assunto;
		this.autor = autor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEditora() {
		return editora;
	}

	public void setId(String editora) {
		this.editora = editora;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

	@Override
	public String toString() {
		return "nome: " 
				+ nome 
				+ ",\neditora: " 
				+ editora 
				+ ",\nassunto: " 
				+ assunto 
				+ ",\nautor: " 
				+ autor;
	}
	
	
}

