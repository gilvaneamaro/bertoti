# Aplicação web - Cadastro de celulares
## Objetivo
Criar um CRUD básico em uma aplicação WEB com Java e Spring boot

## Ferramentas utilizadas
- <b>Backend:</b> Java, Springboot e banco de dados em memória H2.
- <b>Frontend:</b> HTML, CSS e Javascript.

## Prévia da aplicação
A aplicação permite realizar o cadastro, atualização, listagem e remoção de aparelhos celulares.

![image](https://github.com/gilvaneamaro/bertoti/assets/121205315/ca1fbc93-cc1c-4f8f-be54-3fb5bd489fd6)
## Deploy realizado na plataforma Render

Teste as requisições:

Verifique quais aparelhos estão cadastrados com método ```GET``` ```https://phoneapplication.onrender.com/celular/find```

Cadastre seu aparelho utilizando o body;

Método ```POST``` ```https://phoneapplication.onrender.com/celular```
```
{
    "modelo":"Moto G34 5G",
    "marca":"MOTOROLA",
    "descricao":"256GB Azul"
}
```
