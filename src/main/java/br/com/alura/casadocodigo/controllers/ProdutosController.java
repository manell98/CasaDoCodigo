package br.com.alura.casadocodigo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.casadocodigo.models.Produto;

@Controller
@RequestMapping(value = "/produtos")
public class ProdutosController {
	
	@RequestMapping(value = "/form")
	public String form() {
		
		return "produtos/form";
	}
	
	@RequestMapping(value = "/produtos")
	public String grava(Produto produto) {
		
		System.out.println(produto);
		
		return "produtos/ok";
	}

}
