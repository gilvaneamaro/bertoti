package entities;

import java.util.LinkedList;
import java.util.List;

public class Biblioteca {
	private String nome;
	private List<Livro> livros;
	private List<Funcionario> funcionarios;
		
	
	public Biblioteca() {
	}
	
	public Biblioteca(String nome, List<Livro> livros, List<Funcionario> funcionarios) {
		this.nome = nome;
		this.livros = livros;
		this.funcionarios = funcionarios;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Livro> getLivros() {
		return livros;
	}


	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}


	public List<Funcionario> getUsuarios() {
		return funcionarios;
	}


	public void setUsuarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	
	public List<Livro> buscarLivros(String nomeDoLivro){
		
		List<Livro> livrosEncontrados = new LinkedList<Livro>();
	
		
		for(Livro livro: livros) {
			if(livro.getNome().equals(nomeDoLivro)) {
				livrosEncontrados.add(livro);
			}
		}
				
		return livrosEncontrados;
	}
	
	
	public void addFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
		
	}

	@Override
	public String toString() {
		return "nome: " 
				+ nome 
				+ "\npossui os livros: " 
				+ livros 
				+ ",\nos funcionarios são: " 
				+ funcionarios;
	}
	

}