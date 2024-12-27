<h1 align="center">
  Desafio Busca Cep
</h1>

API para gerenciar tarefas (CRUD) que faz parte [desse desafio](https://github.com/simplify-liferay/desafio-junior-backend-simplify) para pessoas desenvolvedoras backend júnior, que se candidatam para a Simplify.


## Tecnologias
 
- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring MVC](https://docs.spring.io/spring-framework/reference/web/webmvc.html)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [Mysql](https://dev.mysql.com/downloads/)
- [OpenFeign](https://spring.io/projects/spring-cloud-openfeign)

## Práticas adotadas

- SOLID, DRY, YAGNI, KISS
- API REST
- Consultas com Spring Data JPA
- Injeção de Dependências
- Tratamento de respostas de erro
- Geração automática do Swagger com a OpenAPI 3

## Como Executar

- Clonar repositório git
- Construir o projeto:
```
$ ./mvnw clean package
```
- Executar a aplicação:
```
$ java -jar target/todolist-0.0.1-SNAPSHOT.jar
```

A API poderá ser acessada em [localhost:8080](http://localhost:8080).
O Swagger poderá ser visualizado em [localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html)

## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta [httpie](https://httpie.io):

- Criar Busca Cep
- 
$ Metodo Post Consulta Cep e salva em Lista http://localhost:8080/api/endereco/cep/11460000

![Get-Busca por Cep - AluraFilmes 27_12_2024 13_23_58](https://github.com/user-attachments/assets/0fd6d1fa-76d1-4d35-bc9f-df32bed80d2a)

```

- Busca Por Cep
```
$  Metodo Get Busca Cep http://localhost:8080/api/endereco/cep/11454000
![Get-Busca por Cep - AluraFilmes 27_12_2024 13_23_38](https://github.com/user-attachments/assets/77b20136-7aab-474b-976c-0d0242b4fc1d)


```

- Lista de Ceps
```
$  Metodo Get Lista Cep http://localhost:8080/api/endereco/cep
![Get-Busca por Cep - AluraFilmes 27_12_2024 13_24_13](https://github.com/user-attachments/assets/ad7b1196-b3a3-41ef-bb32-b1c7f0b74cc9)

```

- Remover Cep
```
Metodo Delete http://localhost:8080/veiculos/1
![Get-Busca por Cep - AluraFilmes 27_12_2024 13_24_24](https://github.com/user-attachments/assets/c1313cd4-d375-4892-bec4-428a2896d1ba)

```
