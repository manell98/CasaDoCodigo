package br.com.alura.casadocodigo.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.alura.casadocodigo.models.Produto;

@Repository
public interface ProdutoDAO extends JpaRepository<Produto, Integer> {
	
}
