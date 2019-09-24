package br.com.alura.casadocodigo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.alura.casadocodigo.daos.ProdutoDAO;
import br.com.alura.casadocodigo.models.Produto;

@Controller
@RequestMapping(value = "/produtos")
public class ProdutosController {
	
	@Autowired
	private ProdutoDAO produtoDao;
	
	@RequestMapping(value = "/form")
	public String form() {
		
		return "produtos/form";
	}
	
	@RequestMapping(value = "/produtos")
	public String gravar(Produto produto) {
		
		System.out.println(produto);
		produtoDao.save(produto);
		
		return "produtos/ok";
	}

}
