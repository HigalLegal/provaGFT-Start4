package model.entities;

import java.math.BigDecimal;

public class Hardware {
	
	private long id;
	private String descricao;
	private BigDecimal valor;
	private String fabricante;
	
	// -------------------------------------------------------------------------------------
	
	public Hardware(long id, String descricao, BigDecimal valor, String fabricante) {
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
		this.fabricante = fabricante;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}
	
	// -------------------------------------------------------------------------------------
	
	public void getDetalhesHardware() {
		System.out.println("Descrição: " + descricao + " || Fabricante: " + fabricante + " || Valor: " + valor);
	}
	
	// -------------------------------------------------------------------------------------
	
	@Override
	public String toString() {
		return descricao + " || " + id;
	}

}
