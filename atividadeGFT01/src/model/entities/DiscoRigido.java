package model.entities;

import java.math.BigDecimal;

public class DiscoRigido extends Hardware {
	
	private int capacidade;
	private int velocidade;
	private String tipo;
	
	// -------------------------------------------------------------------------------------
	
	public DiscoRigido(long id, String descricao, BigDecimal valor, String fabricante, int capacidade, int velocidade,
			String tipo) {
		super(id, descricao, valor, fabricante);
		this.capacidade = capacidade;
		this.velocidade = velocidade;
		this.tipo = tipo;
	}
	
	// -------------------------------------------------------------------------------------

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
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
		System.out.println("Velocidade: " + velocidade + " || Capacidade: " + capacidade + " || Tipo: " + tipo);
	}
	
	

}
