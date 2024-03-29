package br.com.alura.casadocodigo.models;

import java.math.BigDecimal;

import javax.persistence.Embeddable;

import br.com.alura.casadocodigo.enums.TipoPreco;

@Embeddable
public class Preco {

	private BigDecimal valor;
	private TipoPreco tipo;
	
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public TipoPreco getTipo() {
		return tipo;
	}
	public void setTipo(TipoPreco tipo) {
		this.tipo = tipo;
	}
	
}
