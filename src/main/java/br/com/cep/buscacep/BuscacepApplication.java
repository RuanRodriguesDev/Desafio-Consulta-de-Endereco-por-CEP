package br.com.cep.buscacep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableFeignClients
public class BuscacepApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuscacepApplication.class, args);
	}

}
