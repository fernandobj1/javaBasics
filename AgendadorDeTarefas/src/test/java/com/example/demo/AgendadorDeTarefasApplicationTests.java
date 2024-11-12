package com.example.demo;

import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;

import org.awaitility.Durations;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.SpyBean;

@SpringBootTest
class AgendadorDeTarefasApplicationTests {

	@SpyBean
	TarefasAgendadas tasks;
	
	@Test
	public void reportCurrentTime() {
		
		await().atMost(Durations.TEN_SECONDS).untilAsserted(() ->{
			verify(tasks, atLeast(2)).reportCurrentTime();
		});
	}

}
