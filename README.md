# Api Restful usando Design Patterns
Este projeto foi um desafio proposto pela [Digital Innovation One](https://www.dio.me/bootcamp) em que o desafio era o desenvolvimento de uma API utilizando Spring Boot e Design Patterns.<br>
3 Designs em específico foram utilizados na construção do projeto, sendo eles: _Singleton_, _Strategy_ e _Facade_.<br>
<p>
Todos estes design consolidados e também presentes no livro GoF (Gangs of Four) Design Patterns.<br>
O cógigo possui toda sua documentação em OpenApi/Swagger podendo ser acessado em 127.0.0.1:8080/swagger-ui.html "após a execução do código".
</p>

## Resumo
Este código tem como principal função Buscar, Inserir e Deletar "Pokemons", para isto foi criada uma API REST que consome uma outra API Restfull chamada [POKEAPI](https://pokeapi.co/),
esta Api proporciona uma infinidade de pokemons com seus dados e características. E Com este código podemos buscá-los e inserir em nosso próprio banco de dados.

## Designs na Implementação

*Singleton: O Singleton é implementadp através das Annotations: @AutoWired, onde cada instância é mantida durante a execução da aplicação sem a necessidades de várias intâncias onerando a memória.
*Strategy: O Padrão Stategy é encontrado nas interfaces das classes do package Service, onde estas formam os "contratos" necessários à implementação das entidades e classes.
*Facede: Uma analogia ao Facede é encontrada em nossa API controller onde a complexidade de cada uma das requisiçõoes é encapsulada, ou seja, não é vista pela fronteira que consome os dados e realiza as Requests dos métodos da API.

## Tecnologias Utilizadas 
### Framework:
  -Spring Boot <br>
  -Spring Data JPA <br>
  -Spring Web

### Base da Dados:
  -H2 DataBase

### Binder Client Java(Http Client):
  -OpenFeign

### Documentação e Consumo API's:
  -OpenApi/Swagger <br>
  -Postman

