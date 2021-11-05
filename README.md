# API de Cidades do Brasil - DIO



<h2>Digital Innovation One - Desenvolvendo um Sistema de Listagem das Cidades com Spring Boot API Rest</h2>

<img src="http://img.shields.io/static/v1?label=STATUS&message=CONCLUIDO&color=GREEN&style=for-the-badge"/>
<h3>DESCRIÇÃO DO PROJETO</h3>
Pequeno sistema para o listagem de cidades do brasil através de API REST criada com o Spring Boot.

Durante a sessão, serão desenvolvidos e abordados os seguintes tópicos:

* Setup inicial de projeto com o Spring Boot Initialzr 
* Criação de modelo de dados para o mapeamento de entidades em bancos de dados
* Desenvolvimento de operações de gerenciamento de Pais, Estados e Cidades ( leitura com diversas opções de busca de cidades do brasil).
* Relação de cada uma das operações acima com o padrão arquitetural REST, e a explicação de cada um dos conceitos REST envolvidos durante o desenvolvimento do projeto.
* Desenvolvimento de testes unitários para validação das funcionalidades
* Cálculo de distância entre cidades passadas como parâmentro
* Diversas opções de buscas nas Entidades ( Country, State e City )
* Implantação do sistema na nuvem através do Heroku

Para executar o projeto no terminal, digite o seguinte comando:

```shell script
mvn spring-boot:run 
```

Após executar o comando acima, basta apenas abrir o seguinte endereço e visualizar a execução do projeto:

```
============  Country  =============
https://localhost:8080/api/v1/countries
https://localhost:8080/api/v1/countries/id
https://localhost:8080/api/v1/countries/filterLike/name
https://localhost:8080/api/v1/countries/filterCustomImpl/name
https://localhost:8080/api/v1/countries/filterCustom/name
```
```
============  State  =============
https://localhost:8080/api/v1/states
https://localhost:8080/api/v1/states/id
https://localhost:8080/api/v1/states/filter/name
https://localhost:8080/api/v1/states/filterCustom/name
```
```
============  Cities  =============
https://localhost:8080/api/v1/cities
https://localhost:8080/api/v1/cities/id
https://localhost:8080/api/v1/cities/filterLike/name
https://localhost:8080/api/v1/cities/filterCustomImpl/name
https://localhost:8080/api/v1/cities/filterCustom/name
```

Para testar a API via WEB, basta apenas abrir os seguintes endereços e visualizar a execução do projeto:

```
============  Country  =============
https://citiesapi-dg-one.herokuapp.com/api/v1/countries
https://citiesapi-dg-one.herokuapp.com/api/v1/countries/id
https://citiesapi-dg-one.herokuapp.com/api/v1/countries/filterLike/name
https://citiesapi-dg-one.herokuapp.com/api/v1/countries/filterCustomImpl/name
https://citiesapi-dg-one.herokuapp.com/api/v1/countries/filterCustom/name
```
```
============  State  =============
https://citiesapi-dg-one.herokuapp.com/api/v1/states
https://citiesapi-dg-one.herokuapp.com/api/v1/states/id
https://citiesapi-dg-one.herokuapp.com/api/v1/states/filter/name
https://citiesapi-dg-one.herokuapp.com/api/v1/states/filterCustom/name
```
```
============  Cities  =============
https://citiesapi-dg-one.herokuapp.com/api/v1/cities
https://citiesapi-dg-one.herokuapp.com/api/v1/cities/id
https://citiesapi-dg-one.herokuapp.com/api/v1/cities/filterLike/name
https://citiesapi-dg-one.herokuapp.com/api/v1/cities/filterCustomImpl/name
https://citiesapi-dg-one.herokuapp.com/api/v1/cities/filterCustom/name
```

```
============  Cáclculo de Distância  =============
https://citiesapi-dg-one.herokuapp.com/api/v1/distances/by-points

```
## DataBase Postgres

* [Script SQL](https://github.com/chinnonsantos/sql-paises-estados-cidades/tree/master/PostgreSQL)



São necessários os seguintes pré-requisitos para a execução do projeto desenvolvido durante a aula:

* Java 11 ou versões superiores.
* Maven 3.6.0 ou versões superiores.
* Intellj IDEA Community Edition ou sua IDE favorita.
* Controle de versão GIT instalado na sua máquina.
* Conta no GitHub para o armazenamento do seu projeto na nuvem.
* Conta no Heroku para o deploy do projeto na nuvem
* Muita vontade de aprender e compartilhar conhecimento :)

Abaixo, seguem links bem bacanas, sobre tópicos mencionados durante a aula:

* [SDKMan! para gerenciamento e instalação do Java e Maven](https://sdkman.io/)
* [Referência do Intellij IDEA Community, para download](https://www.jetbrains.com/idea/download)
* [Palheta de atalhos de comandos do Intellij](https://resources.jetbrains.com/storage/products/intellij-idea/docs/IntelliJIDEA_ReferenceCard.pdf)
* [Site oficial do Spring](https://spring.io/)
* [Site oficial do Spring Initialzr, para setup do projeto](https://start.spring.io/)
* [Site oficial do Heroku](https://www.heroku.com/)
* [Site oficial do GIT](https://git-scm.com/)
* [Site oficial do GitHub](http://github.com/)
* [Documentação oficial do Lombok](https://projectlombok.org/)
* [Documentação oficial do Map Struct](https://mapstruct.org/)
* [Referência para o padrão arquitetural REST](https://restfulapi.net/)
