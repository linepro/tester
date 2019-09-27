# Getting Started

Requires:
* Java 8 (221)
* Maven 3.6.0

Build:
* mvn clean install

Configure:
* Add your Marvel API keys to application.properties :
* com.linepro.marvel.apiKey=
* com.linepro.marvel.privateKey= 

Run:
* mvn spring-boot:run

Design choice explanation:
* JPA repository for character list so I can show I know JPA (mostly).
* Took swagger generated code into source tree because it didn't generate typed lists (and so broke RestTemplate deserialziation)
* No tests because I've spent enough time on it all ready.
* Built with maven because it's what I'm most comforatable with

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.0.M6/maven-plugin/)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Spring Web](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)

