package br.com.alura.casadocodigo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.alura.casadocodigo.daos.ProdutoDAO;
import br.com.alura.casadocodigo.enums.TipoPreco;
import br.com.alura.casadocodigo.models.Produto;

@Controller
@RequestMapping(value = "/produtos")
public class ProdutosController {
	
	@Autowired
	private ProdutoDAO produtoDao;
	
	@RequestMapping(value = "/form")
	public ModelAndView form() {				
		ModelAndView modelAndView = new ModelAndView("produtos/form");
		modelAndView.addObject("tipos", TipoPreco.values());
		
		return modelAndView;
	}
	
	@RequestMapping(value = "/produtos", method = RequestMethod.POST)
	public String gravar(Produto produto) {		
		produtoDao.save(produto);
		
		return "produtos/ok";
	}
	
	@RequestMapping(value = "/produtos", method = RequestMethod.GET)
	public ModelAndView listar() {			
		ModelAndView modelAndView = new ModelAndView("produtos/lista");
		modelAndView.addObject("produtos", produtoDao.findAll());
		
		return modelAndView;
	}

}
