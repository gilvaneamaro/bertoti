# 1- O que é Engenharia de Software?

"We see three critical differences between programming and software engineering: time, scale, and the trade-offs at play. On a software engineering project, 
engineers need to be more concerned with the passage of time and the eventual need for change. In a software engineering organization, we need to be more concerned about scale and efficiency, 
both for the software we produce as well as for the organization that is producing it. Finally, as software engineers, we are asked to make more complex decisions with higher-stakes outcomes,
often based on imprecise estimates of time and growth."

- Minha visão sobre o texto

De acordo com o texto, existem três diferenças críticas entre programar e engenharia de software, resumidamente um engenheiro de software não está preocupado em apenas criar um sistema,
mas em como esse sistema pode escalar, ser mais eficiente, facilitar sua manutenção, ou seja tomando decisões complexas.


# 2- Exemplos de Trade-offs (Requisitos não funcionais)

Um exemplo de trade off seria o desenvolvimento de programas em m𝗼𝗻𝗼𝗹𝗶𝘁o, ou seja, uma arquitetura de desenvolvimento de software que possui em um mesmo arquivo todos os componentes de uma aplicação como a interface do usuário, configuração do servidor e banco de dados.
Vantagem: simplicidade, facilidade para desenvolver, testar e fazer o deploy.
Desvantagem: dificuldade para escalar, lento na maioria dos casos e risco alto de falhas e inconsistências.

Em comparação com uma arquitetura em microserviços, que divide uma aplicação em serviços pequenos e pouco acoplados, sendo cada um deles responsável por uma capacidade de negócio específico.
Vantagens: escalabilidades, flexibilidade, facilidade para manutenção e atualizações, permite rápida liberação de releases.
Desvantagens: dificulade em administrar multiplos serviços, tempo de resposta da conexão, requer um serviço robusto de monitoramento.

# 3- Aplicar requisito não funcional

usabilidade avaliando as 10 heuristicas (erros e acertos)


# 4- Fazer o diagrama de caso de uso (UML) de um sistema simples (Requisitos funcionais) 
![DiagramaBiblioteca drawio](https://github.com/gilvaneamaro/bertoti/assets/121205315/58288615-5538-4a1b-9695-a0d0afd2f0ba)


# 5- Inicie seu diagrama de classes UML fazendo junto com o código Java

![Diagrama sem nome drawio (1)](https://github.com/gilvaneamaro/bertoti/assets/121205315/d68a2372-394c-4e27-a935-8c7338562f1b)

# 6- Código Java implementando o diagrama de classe

<details>
  <summary>Códigos em JAVA</summary>

- Classe Biblioteca
```
package entities;

import java.util.LinkedList;
import java.util.List;

public class Biblioteca {
	private List<String> livros;
	private List<Funcionario> funcionarios;
		
	
	public Biblioteca() {
	}
	
	public Biblioteca(List<String> livros, List<Funcionario> funcionarios) {
		this.livros = livros;
		this.funcionarios = funcionarios;
	}


	public List<String> getLivros() {
		return livros;
	}


	public void setLivros(List<String> livros) {
		this.livros = livros;
	}


	public List<Funcionario> getUsuarios() {
		return funcionarios;
	}


	public void setUsuarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	
	public List<Livros> buscarLivros(List<Livros> livros){
		
		List<Livros> livrosEncontrados = new LinkedList<Livros>();
		for(Livros livro: livros) {
			if(livro.equals(livro)) {
				livrosEncontrados.add(livro);
			}
		}
				
		return livrosEncontrados;
	}
	
	
	public void addFuncionario(Funcionario funcionario) {
		funcionarios.add(funcionario);
		
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

Livro eng de software - Ian Sommerville
