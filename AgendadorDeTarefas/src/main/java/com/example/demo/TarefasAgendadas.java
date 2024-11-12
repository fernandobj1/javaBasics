package com.example.demo;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TarefasAgendadas {
	private static final Logger log = LoggerFactory.getLogger(TarefasAgendadas.class);
	private static final SimpleDateFormat dataNova = new SimpleDateFormat("HH:mm:ss");
	
	//Aqui se usa o fixedRate(), que especifica o intervalo entre invocações de método
	//medido pela hora inicial de cada invocação. (Ele não para até ser cancelado) Outras opções são cron() e fixedDelay(). 
	//Para tarefas periódicas exatamente uma das 3 opções tem de ser especificada,
	//e opcionalmente, initialDelay(). Para uma tarefa única é suficiente initialDelay()
	
	@Scheduled(fixedRate = 5000)
	public void reportCurrentTime() {
		log.info("A hora é agora {}", dataNova.format(new Date()));
	}
}
