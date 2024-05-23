# Atividade - MeuPrimeiroCRUD
- Aplicação REST em Java com Springboot, utilizei banco de dados em memória H2 para persistir as informações.


# Requisições
## Create
- Com o método POST, passando um body com modelo, marca e descrição, o backend faz um registro do celular no banco de dados.

![alt text](image.png)

## Read
- Com o metodo GET, o backend lista todos os aparelhos cadastrados.

![alt text](image-1.png)

## Update
- Utilizando o método PUT, atualiza as informações no banco de dados utilizando os parâmetros passados pelo body.

![alt text](image-2.png)

## Delete
- Com o método DELETE, envia uma requisição com o ID do aparelho que deseja ser excluído do banco de dados.

![alt text](image-3.png)