# javaBasics

Repositório criado unicamente para retornar meus estudos em java.

1 - ProjetoHum - Constroi um Restful webservice. O link permite ver Hello World, mas é possível alterar a variavel name.
Usa uma controller pra retornar uma resposta 200 OK com um Json.
http://localhost:8080/greeting
http://localhost:8080/greeting?name=Pedro

2 - AgendadorDeTarefas - Usa a anotação @Scheduled para criar uma repetição automática no console
O teste com awaitility não funcionou.
	2.1 - Testar awaitility com outra IDE

3 - Restful Consumer - Usa um projeto criado previamente para consumir um Restful service
Projeto Quotes
https://github.com/spring-guides/quoters?tab=readme-ov-file

Ao ter disponíveis os endereços abaixo, faz a apresentação da citação no console.  

http://localhost:8080/api
http://localhost:8080/api/1
http://localhost:8080/api/random.

4 - Acessando JDBC - Cria uma base de dados em memória (H2) e faz uma query buscando um dos nomes. Isso comprova o funcionamento do BD.
  4.1 - Testar com outras bases de dados em https://docs.spring.io/spring-boot/docs/2.2.1.RELEASE/reference/htmlsingle/#boot-features-configure-datasource
