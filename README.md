# Projeto de aprendizado de relacionamentos entre entidades e tabelas usando Java Spring Boot e Spring Data JPA

Projeto de aprendizado de relacionamentos entre entidades e tabelas usando Java Spring Boot e Spring Data JPA
Este repositório contém um projeto Java Spring Boot que tem como objetivo o aprendizado de relacionamentos entre entidades e tabelas em um ambiente de desenvolvimento Java. O projeto faz uso do framework Spring Data JPA para conectar-se com um banco de dados PostgresSQL.

## Visão geral do projeto
O projeto tem como objetivo modelar e implementar o relacionamento entre as entidades Aluno, Avaliação Física e Matrícula em um sistema de gerenciamento de academia. O sistema permite que os alunos possam se matricular em uma ou mais atividades e que possam realizar avaliações físicas para acompanhar seu desempenho.

## Tecnologias utilizadas
O projeto utiliza as seguintes tecnologias:

- Java Spring Boot
- Spring Data JPA
- Banco de dados PostgresSQL

## Como executar o projeto
Para executar o projeto, é necessário seguir os seguintes passos:

- Clonar o repositório em sua máquina local.
- Configurar as informações de conexão com o banco de dados no arquivo application.properties.
- Executar o comando mvn clean install na raiz do projeto para baixar as dependências do projeto e gerar o arquivo .jar.
- Executar o comando java -jar target/<nome_do_arquivo_jar> para iniciar a aplicação.
