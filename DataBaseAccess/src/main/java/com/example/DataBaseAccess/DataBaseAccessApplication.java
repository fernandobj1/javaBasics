package com.example.DataBaseAccess;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class DataBaseAccessApplication implements CommandLineRunner{

	
	private static final Logger log = LoggerFactory.getLogger(DataBaseAccessApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(DataBaseAccessApplication.class, args);
	}
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public void run(String...strings) throws Exception{
		
		log.info("Criando Tabelas");
		
		jdbcTemplate.execute("DROP TABLE clientes IF EXISTS");
		jdbcTemplate.execute("CREATE TABLE clientes(" + "id SERIAL, nome VARCHAR(255), sobreNome VARCHAR(255))");
		
//		Quebra os arrays de nome completo em nome / sobrenome
		List<Object[]> quebraNomes = Arrays.asList("Mickey Mouse", "James Dean", "Lula Silva").stream()
				.map(nome -> nome.split(" "))
				.collect(Collectors.toList());
//		Usa Stream do java 8 pra printar cada tupla
		quebraNomes.forEach(nome -> log.info(String.format("Inserindo %s %s", nome[0], nome[1])));
		
//		Usa jdbctemplate batchupdate pra inserir os dados 
		
		jdbcTemplate.batchUpdate("INSERT INTO clientes(nome, sobreNome) VALUES (?,?)", quebraNomes);
		
		log.info("Fazendo uma query pra encontrar todos os Mickeys:");
		
		jdbcTemplate.query(
				"SELECT id, nome, sobreNome FROM clientes WHERE nome = ?",
				(rs, rowNum) -> new Cliente(rs.getLong("id"),
				rs.getString("nome"), rs.getString("sobreNome")), "Lula")
				.forEach(cliente -> log.info(cliente.toString()));
		
	}

}
