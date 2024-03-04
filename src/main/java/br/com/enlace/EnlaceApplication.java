package br.com.enlace;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EnlaceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnlaceApplication.class, args);
	}

	@RequestMapping
	@ResponseBody
	public String home(){
		return "Enlace";
	}

}
