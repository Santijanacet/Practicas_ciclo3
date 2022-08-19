package com.UdeA.ciclo3.modelos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude ={SecurityAutoConfiguration.class})
@RestController
public class Ciclo3Application {
	@GetMapping("/hello")
	public String hello(){

		return "estamos tratando de sobrevivir el ciclo 3";

	}


	@GetMapping("/empresa")
	public String empresa(){

		return "la estamos rompiendo o no la estamos rompiendo brrrr";
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
