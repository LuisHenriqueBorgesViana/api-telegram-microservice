package app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiTelegram {
	
	private static final Logger loggerFactory = LoggerFactory.getLogger(ApiTelegram.class);	

	/*
	 * Created by Luis Henrique Borges Viana
     * Website: https://www.luishenriqueborgesviana.com/
     * LinkedIn: https://www.linkedin.com/in/luis-henrique-borges-viana/ 
     * Based on the official Telegram documentation in https://core.telegram.org/api
	 */

	public static void main(String[] args) {
	
		SpringApplication.run(ApiTelegram.class, args);
		
		loggerFactory.info("Microservice started successfully [api-telegram-service].");						
	}
}
