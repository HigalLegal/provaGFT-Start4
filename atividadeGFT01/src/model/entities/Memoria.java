package model.entities;

import java.math.BigDecimal;

public class Memoria extends Hardware {

	private int frequencia;
	private int capacidade;
	private String tipo;
	
	// -------------------------------------------------------------------------------------
	
	public Memoria(long id, String descricao, BigDecimal valor, String fabricante, int frequencia, int capacidade,
			String tipo) {
		super(id, descricao, valor, fabricante);
		this.frequencia = frequencia;
		this.capacidade = capacidade;
		this.tipo = tipo;
	}
	
	// -------------------------------------------------------------------------------------

	public int getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(int frequencia) {
		this.frequencia = frequencia;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	// -------------------------------------------------------------------------------------
	
	@Override
	public void getDetalhesHardware() {
		System.out.println("Descrição: " + this.getDescricao() + " || Fabricante: " + this.getFabricante()
				+ " || Valor: " + this.getValor());
		System.out.println("Frequencia: " + frequencia + " || Capacidade: " + capacidade + " || Tipo: " + tipo);
	}
	
}
