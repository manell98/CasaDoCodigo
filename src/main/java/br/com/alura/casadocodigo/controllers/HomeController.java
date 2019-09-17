package br.com.alura.casadocodigo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(value = "/")
	public String index() {
		System.out.println("Entrando na home da Casa do Código");
		
		return "home";
	}
	
}
