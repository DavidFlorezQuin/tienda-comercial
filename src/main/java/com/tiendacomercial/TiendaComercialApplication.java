package com.tiendacomercial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class TiendaComercialApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiendaComercialApplication.class, args);
	}

	@GetMapping
	public String hello() {
		return "Hello word";
	}

}

