package entities;

import exceptions.EstoqueInvalidoException;

public class Produto {

	private Integer codigo;
	private String nome;
	private String categoria;
	private Integer quantidade;
	private Double precoUnitario;
	
	public Produto(Integer codigo, String nome, String categoria, Integer quantidade, Double precoUnitario) {
		super();
		validarDados(quantidade, precoUnitario);
		this.codigo = codigo;
		this.nome = nome;
		this.categoria = categoria;
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
	}
	
	public void validarDados(Integer quantidade, Double precoUnitario) {
		if(quantidade < 0 ) {
			throw new EstoqueInvalidoException("Quantidade digitada invalida");
		}
		if(precoUnitario < 0 ) {
			throw new EstoqueInvalidoException("Preco unitario digitado invalido");
		}
	}
	
	public Double calcularTotalEstoque() {
		return this.quantidade * this.precoUnitario;
	}
	public boolean isEstoqueCritico() {
		if(quantidade < 5) {
			return true;
		}
		return false;
	}
	public String toCsvLine() {
		String resultado = (isEstoqueCritico()) ? "Critico":"OK";
		
		return codigo + ";" + nome + ";" + calcularTotalEstoque() + ";" + resultado;
	}
}
