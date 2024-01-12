# 1- O que é Engenharia de Software?

"We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, 
engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, 
both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes,
often based on imprecise estimates of time and growth."

- Minha visão sobre o texto

De acordo com o texto, existem três diferenças críticas entre programar e engenharia de software, resumidamente um engenheiro de software não está preocupado em apenas criar um sistema,
mas em como esse sistema pode escalar, ser mais eficiente, facilitar sua manutenção, ou seja tomando decisões complexas.


# 2- Exemplos de Trade-offs (Requisitos não funcionais)

- Um exemplo de trade off seria o desenvolvimento de programas em m𝗼𝗻𝗼𝗹𝗶𝘁o, ou seja, uma arquitetura de desenvolvimento de software que possui em um mesmo arquivo todos os componentes de uma aplicação como a interface do usuário, configuração do servidor e banco de dados.
Vantagem: simplicidade, facilidade para desenvolver, testar e fazer o deploy.
Desvantagem: dificuldade para escalar, lento na maioria dos casos e risco alto de falhas e inconsistências.

 - Em comparação com uma arquitetura em microserviços, que divide uma aplicação em serviços pequenos e pouco acoplados, sendo cada um deles responsável por uma capacidade de negócio específico.
Vantagens: escalabilidades, flexibilidade, facilidade para manutenção e atualizações, permite rápida liberação de releases.
Desvantagens: dificulade em administrar multiplos serviços, tempo de resposta da conexão, requer um serviço robusto de monitoramento.

-  Um outro exemplo de trade off é em banco de daods, bancos de dados relacionais são ideais para aplicações que exigem consistência e integridade de dados, enquanto os bancos de dados não relacionais são mais adequados para aplicações que exigem alta escalabilidade e flexibilidade no esquema de dados. 

# 3- 10 Usability Heuristics for User Interface Design


# 4- Fazer o diagrama de caso de uso de um sistema simples (Requisitos funcionais) 
## Primeira versão
![DiagramaBiblioteca drawio](https://github.com/gilvaneamaro/bertoti/assets/121205315/58288615-5538-4a1b-9695-a0d0afd2f0ba)

## Segunda versão
![Modelo UML](https://github.com/gilvaneamaro/bertoti/assets/121205315/676de055-5a78-4795-ab68-798469903c66)


# 5- Inicie seu diagrama de classes UML fazendo junto com o código Java

## Primeira versão
![Diagrama sem nome drawio (1)](https://github.com/gilvaneamaro/bertoti/assets/121205315/d68a2372-394c-4e27-a935-8c7338562f1b)

## Segunda versão

![classes drawio](https://github.com/gilvaneamaro/bertoti/assets/121205315/2fd038e7-061a-4025-ba93-b37a5454b06d)


# 6- Código Java implementando o diagrama de classe

<details>
  <summary>Códigos em JAVA</summary>

- Classe Biblioteca
```
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
			if(livro.getNome().startsWith(nomeDoLivro)) {
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

```
- Classe Funcionario
```
package entities;

public class Funcionario {	
	private String nome;
	private String cpf;
	private Integer id;
	
	public Funcionario(String nome, String cpf, Integer id) {
		this.nome = nome;
		this.cpf = cpf;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getId() {
		return id;
	}
}

```

- Classe Livros
  
```
package entities;

public class Livros {
	private String nome;
	private Integer id;
	
	public Livros(String nome, Integer id) {
		this.nome = nome;
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}


```

</details>

# 7 - Testes com JUnity

<details>
<summary>Código dos testes</summary>

```
package utils;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Test;

import entities.Biblioteca;
import entities.Funcionario;
import entities.Livro;

class Teste {

	@Test
	void testBusca() {
			
			List<Livro> listaLivros = new LinkedList<Livro>();
			
			listaLivros.add(new Livro("Harry Potter e a pedra filosofal", "Rocco", "JK Rowling", "Aventura", 1997));
			listaLivros.add(new Livro("Harry Potter e a camara secreta", "Rocco", "JK Rowling", "Aventura", 1998));
			listaLivros.add(new Livro("Harry Potter e o prisioneiro de azkabhan", "Rocco", "JK Rowling", "Aventura", 1999));
			listaLivros.add(new Livro("Harry Potter e o calice de fogo", "Rocco", "JK Rowling", "Aventura", 2000));
			listaLivros.add(new Livro("Harry Potter e a ordem da fenix", "Rocco", "JK Rowling", "Aventura", 2003));
			listaLivros.add(new Livro("Harry Potter e o enigma do principe", "Rocco", "JK Rowling", "Aventura", 2005));
			listaLivros.add(new Livro("Harry Potter e as relíquias da morte", "Rocco", "JK Rowling", "Aventura", 2007));

			List<Funcionario> listaFuncionario = new LinkedList<Funcionario>();
			
			listaFuncionario.add(new Funcionario("Jorge Books","132.456.789-00","Bibliotecario"));
			listaFuncionario.add(new Funcionario("Pedrinho do TI","132.456.789-00","Analista de suporte"));
			
			Biblioteca lib = new Biblioteca("Biblioteca central",listaLivros,listaFuncionario);
			
			assertEquals(lib.buscarLivros("Harry Potter").size(),7 );

	}
	@Test
	void testNome() {
		
			List<Livro> listaLivros = new LinkedList<Livro>();
			
			listaLivros.add(new Livro("Harry Potter e a pedra filosofal", "Rocco", "JK Rowling", "Aventura", 1997));
			listaLivros.add(new Livro("Harry Potter e a camara secreta", "Rocco", "JK Rowling", "Aventura", 1998));
			listaLivros.add(new Livro("Harry Potter e o prisioneiro de azkabhan", "Rocco", "JK Rowling", "Aventura", 1999));
			listaLivros.add(new Livro("Harry Potter e o calice de fogo", "Rocco", "JK Rowling", "Aventura", 2000));
			listaLivros.add(new Livro("Harry Potter e a ordem da fenix", "Rocco", "JK Rowling", "Aventura", 2003));
			listaLivros.add(new Livro("Harry Potter e o enigma do principe", "Rocco", "JK Rowling", "Aventura", 2005));
			listaLivros.add(new Livro("Harry Potter e as relíquias da morte", "Rocco", "JK Rowling", "Aventura", 2007));

			List<Funcionario> listaFuncionario = new LinkedList<Funcionario>();
			
			listaFuncionario.add(new Funcionario("Jorge Books","132.456.789-00","Bibliotecario"));
			listaFuncionario.add(new Funcionario("Pedrinho do TI","132.456.789-00","Analista de suporte"));
			
			Biblioteca lib = new Biblioteca("Biblioteca central",listaLivros,listaFuncionario);
			
			assertEquals(lib.getNome(), "Biblioteca central" );
	
		
	}

}

```
Livro eng de software - Ian Sommerville
