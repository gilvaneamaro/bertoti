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

# 3- 10 Usability Heuristics for User Interface Design
## #1: Visibilidade do status do sistema
- Um exemplo de bom uso desta eurística é um formulário evidenciar qual etapa o usuário está e quantas faltam.
- Um mau uso seria o uso excessivo, podendo confundir o usuário.

## #2: Match between system and the real world
- Nesta eurística um exemplo legal é utilizar de uma figura de lixeira onde fica armazenado emails apagados de uma caixa de entrada.
- Um exemplo incorreto seria 

## #3: User control and freedom
- O usuário poder sair no meio de um formulário sem perder a informações preenchidas é um bom exemplo.
- Forçar o usuário a avançar todas as páginas, sem uma opção para sair antes, é um mau exemplo. 
## #4: Consistency and standards
- Importante um sistema seguir os padrões adotados, como por exemplo a cor verde para confirmar a inclusão de um item.
- Um mau uso seria utilizar cores vermelhas em textos que não estão relacionados a erros.
## #5: Error prevention
- Um ótimo exemplo da aplicação desta eurísticas são telas de confirmações "Deseja mesmo excluir tal item?".
- Um botão de "desistir" maior do que um botão de "confirmar" pode induzir usuários ao erro.
## #6: Recognition rather than recall
- Um exemplo de bom uso desta heurística é a barra de menu de um site de vendas poder ser vista em todas as páginas.
- "Esconder" alguma funcionalidade, por exemplo o filtro dos produtos, em algum menu pode atrapalhar a utilização do site.
## #7: Flexibility and efficiency of use
- Esta heurística diz a respeito de poder beneficiar e agilizar através do uso de atalhos, por exemplo um CTRL+X para recortar um texto, ou até mesmo um conjunto de teclas para importar todas as bibliotecas utilizadas em um código.
- A exigência de poder fazer uma ação por somente um passo específico é um exemplo de inflexibilidade de um sistema.
#8: Aesthetic and minimalist design
- Poder simplificar uma tela, removendo toda informação desnecessária é a utilização correta desta heurística.
- Decorar muito um sistema com imagens exageradas é um ponto negativo.
## #9: Help users recognize, diagnose, and recover from errors
- Importante em um sistema exibir mensagens de erros que sejam amigáveis ao usuário, se possível utilizando de elementos gráficos.
- Mensagens de erros não tratadas, impossibilitam que correções simples sejam aplicadas por parte do usuário.
## #10: Help and documentation
-
-
# 4- Fazer o diagrama de caso de uso (UML) de um sistema simples (Requisitos funcionais) 
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

# 7 - Testes com JUnity

<details>
<summary>Código dos testes</summary>

```
package application;

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
			
			listaLivros.add(new Livro("Harry Potter", "Arqueiro", "JK Rowling", "Aventura"));
			listaLivros.add(new Livro("Harry Potter", "Arqueiro", "JK Rowling", "Aventura"));
			listaLivros.add(new Livro("Harry Potter", "Arqueiro", "JK Rowling", "Aventura"));
			listaLivros.add(new Livro("Vendedor de Sonhos","Setembro Amarelo", "Augusto Cury","Autoajuda"));

			List<Funcionario> listaFuncionario = new LinkedList<Funcionario>();
			
			listaFuncionario.add(new Funcionario("Jorge Books","132.456.789-00","Bibliotecario"));
			listaFuncionario.add(new Funcionario("Pedrinho do TI","132.456.789-00","Analista de suporte"));
			
			Biblioteca lib = new Biblioteca("Biblioteca central",listaLivros,listaFuncionario);
			
			assertEquals(lib.buscarLivros("Harry Potter").size(), 3 );

	}
	@Test
	void testNome() {
		
			List<Livro> listaLivros = new LinkedList<Livro>();
			
			listaLivros.add(new Livro("Harry Potter", "Arqueiro", "JK Rowling", "Aventura"));
			listaLivros.add(new Livro("Harry Potter", "Arqueiro", "JK Rowling", "Aventura"));
			listaLivros.add(new Livro("Harry Potter", "Arqueiro", "JK Rowling", "Aventura"));
			listaLivros.add(new Livro("Vendedor de Sonhos","Setembro Amarelo", "Augusto Cury","Autoajuda"));

			List<Funcionario> listaFuncionario = new LinkedList<Funcionario>();
			
			listaFuncionario.add(new Funcionario("Jorge Books","132.456.789-00","Bibliotecario"));
			listaFuncionario.add(new Funcionario("Pedrinho do TI","132.456.789-00","Analista de suporte"));
			
			Biblioteca lib = new Biblioteca("Biblioteca central",listaLivros,listaFuncionario);
			
			assertEquals(lib.getNome(), "Biblioteca central" );
	
		
	}
}

```

<details>
	
</details>
Livro eng de software - Ian Sommerville
