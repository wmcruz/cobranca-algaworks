package com.algaworks.cobranca.model;

public enum StatusTitulo {
	
	PENDENTE("Pendente"),
	RECEBIDO("Recebido"),
	CANCELADO("Cancelado");
	
	private String descricao;
	
	StatusTitulo(String descricao){
		this.descricao = descricao;
	}
	
	public String getDescicao() {
		return descricao;
	}
}