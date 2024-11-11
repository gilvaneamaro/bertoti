# Gilvane de Souza Amaro Junior

## Introdução

Meu nome é Gilvane, tenho 29 anos, sou um desenvolvedor dedicado com foco em soluções escaláveis com qualidade. Já cursei 8 semestre de ciência e tecnologia pela UNIFESP, entre 2014 a 2018, porém não cheguei a concluir. Atualmente estou no quarto semestre de tecnólogo em banco de dados pela Fatec São José dos Campos e trabalho como analista de suporte pela DeMaria Software, empresa especializada em sistemas de automação para cartórios.


## Contatos
* [GIT](https://www.github.com/gilvaneamaro)
* [LinkedIn](www.linkedin.com/in/gilvane-amaro)

## Meus Principais Conhecimentos

Possuo conhecimento em lógica de programação e desenvolvimento web, já utilizei Frameworks como Spring boot e VueJs3. Minha experiência com bancos de dados inclui MySQL para dados relacionais.


Possuo familiaridade com metodologias ágeis, especialmente Scrum, para gerenciamento de projetos. Tenho experiência na visualização de mapas utilizando MapTile, o que me permite lidar com projetos que envolvem tanto o back-end quanto o front-end de forma eficaz.

## Meus Projetos

### Em 2024-1

#### NextSchema - DomRock
O projeto foi realizado em parceria com a Dom Rock, uma empresa que possui uma arquitetura de processamento de dados em pipeline, utilizada para orquestrar dados e algoritmos de inteligência artificial, ou modelos matemáticos, de acordo com as necessidades de negócio de seus clientes. Essa plataforma é amplamente aplicada em diferentes indústrias para tratar grandes volumes de dados, gerando insights automatizados e facilitando a tomada de decisão.

#### Desafio
O desafio que a empresa apresentou foi a necessidade de uma solução para a configuração dos esquemas dos bancos de dados, pois até aquele momento a DomRock precisava disponibilizar um funcionário para criar o arquivo de configuração yml de forma manual.

#### Solução
Para resolver esse problema, a equipe desenvolveu o NextSchema, uma aplicação web com interface amigável e intuitiva que permitia a configuração das fontes de dados de forma automatizada. A solução envolveu o desenvolvimento de várias interfaces, incluindo uma para o cadastro de clientes, soluções e usuários, e outra para upload de arquivos CSV com a visualização da estrutura de dados. Também foi criado um dashboard para administradores com visões quantitativas sobre os dados configurados. Além disso, a solução incluiu funcionalidades de mapeamento de campos-chave e aplicação de regras de negócios, além de um sistema de autenticação e auditoria para rastreabilidade. Isso trouxe benefícios como maior agilidade nas implantações e redução da dependência de técnicos especialistas

Acesso ao repositório disponível <a href="https://github.com/TechHorizonBR/API_3SEM.git">aqui</a>.

#### Tecnologias Utilizadas
Foram utilizadas as ferramentas: Spring Boot para desenvolver o Back-end Web Server, MySQL para banco de dados relacional, BR-Modelos para modelagem de dados, Figma para prototipação de Wareframes, HTML, CSS e JS para Front-end, Jira para gerenciamento de projetos, Git para versionamento de projetos e Github para armazenamento e publicação de arquivos.

#### Contribuições Pessoais
- Durante o projeto trabalhei apenas como back-end e fui responsável pela implementação do Spring Security e gerenciamento dos usuários, atuando na criação de endpoints para adicionar, atualizar e remover usuários. 

    - Gerenciamento de usuário
          <details>
            Na criação precisei incluir uma lista de Role e outra de empresas que poderiam ser vinculados ao usuário, o que dificultou a lógica. Na deleção do usuário precisei remover todos os vínculos para que o banco de dados aceitasse a remoção. Tive dificuldades na implementação dos serviços, sendo necessário pensar bem quais injeções de dependências seriam possíveis, sem que houvesse looping.
          </details>
    - Níveis de acessos dos usuários
          <details>
              Desenvolvi um algoritmo capaz atribuir diferentes níveis de acessos aos usuários, foi preciso ajustar o código que já existia, pois inicialmente cada usuário teria apenas um acesso. Após a refatoração, a aplicação passou a realizar validações para acessar os métodos.

          </details>
    - Download do arquivo CSV
          <details>
             Criei um algoritmo que recuperava os metadados do banco de dados e enviava um binário com a configuração do banco de dados em arquivo YML. Utilizei a biblioteca snakeyaml para conseguir manipular o arquivo e enviar o arquivo.
          </details>
          
    - Implementação do spring security
        <details>
             De longe a task mais difícil que entreguei, realizei toda a configuração do Spring Security, implementando o token, validação e encriptação de senhas. Tive muitas dificuldades para conseguir manipular o token, atribuir propriedades como roles e tempo de expiração.
      
        </details>
 

#### Hard Skills
- Java (Spring Boot) - Desenvolvi aplicações backend, configurando endpoints e integrações de forma autônoma.
- MySQL - Utilizei o banco de dados nas consultas de registros realizados e conferência do código.
- IntelliJ IDEA - IDE utilizada para o desenvolvimento e testes da aplicação.
- Git/GitHub - Versionamento de código e trabalho em equipe, com eficiência no uso de branches, pull requests e resolução de conflitos.
- Postman - Testei e validei APIs durante o desenvolvimento, com conhecimento para criação de coleções de testes.
- Figma - Para prototipagem de interfaces e colaboração no design da solução, utilizando a ferramenta com eficiência.
- Jira - Organizei tarefas e acompanhei o desenvolvimento do projeto de acordo com a metodologia Scrum.


#### Soft Skills
- Comunicação - Habilidade mais importante no projeto, sem ela era fácil atrasar entregar e retrabalho.
- Trabalho em equipe - Fundamental para conseguirmos dividir todas as tarefas e agilizar o projeto.
- Resiliência - Foi preciso de resilência a cada bug encontrado, ou funcionalidade que deixava de ser necessária. Quando precisei refatorar todo o endpoint do usuário pois houve a implementação do security.
- Resolução de problemas - Foi necessário encontrar a melhor maneira possível para resolver problemas técnicos e interpessoais.