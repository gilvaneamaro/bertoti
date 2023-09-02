package application;

import java.util.LinkedList;
import java.util.List;

import entities.Biblioteca;
import entities.Funcionario;
import entities.Livro;

public class Principal {

	public static void main(String[] args) {
		Livro l1 = new Livro("Harry Potter", "Arqueiro", "JK Rowling", "Aventura");
		Livro l2 = new Livro("Vendedor de Sonhos","Setembro Amarelo", "Augusto Cury","Autoajuda");
		
		
		List<Livro> listaLivros = new LinkedList<Livro>();
		
		listaLivros.add(l1);
		listaLivros.add(l2);
		listaLivros.add(l1);
		listaLivros.add(l1);
		listaLivros.add(l1);
		listaLivros.add(l1);
		
		Funcionario func1 = new Funcionario("Jorge Books","132.456.789-00","Bibliotecario");
		Funcionario func2 = new Funcionario("Pedrinho do TI","132.456.789-00","Analista de suporte");
		List<Funcionario> listaFuncionario = new LinkedList<Funcionario>();
		
		listaFuncionario.add(func1);
		listaFuncionario.add(func2);
		
		Biblioteca lib = new Biblioteca("Biblioteca central",listaLivros,listaFuncionario);
		
		//System.out.println(lib);
		
		System.out.println(lib.buscarLivros("Harry Potter"));
		

	}

}