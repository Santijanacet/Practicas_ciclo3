package com.UdeA.ciclo3.modelos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class Ciclo3Application {
	@GetMapping("/hello")
	public String hello(){

		return "hola mundo";

	}


	@GetMapping("/test")
	public String test(){

		empresa emp = new empresa("calle de la gata","30234455","6878685", "rumba");
		return emp.getNombre();
	}
	public static void main(String[] args) {
		SpringApplication.run(Ciclo3Application.class, args);
	}

}
