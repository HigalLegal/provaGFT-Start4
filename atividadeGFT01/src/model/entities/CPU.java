package model.entities;

import java.math.BigDecimal;

public class CPU extends Hardware {

	private double clock;
	private String modelo;

	// -------------------------------------------------------------------------------------

	public CPU(long id, String descricao, BigDecimal valor, String fabricante, double clock, String modelo) {
		super(id, descricao, valor, fabricante);
		this.clock = clock;
		this.modelo = modelo;
	}

	// -------------------------------------------------------------------------------------

	public double getClock() {
		return clock;
	}

	public void setClock(double clock) {
		this.clock = clock;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	// -------------------------------------------------------------------------------------7

	@Override
	public void getDetalhesHardware() {
		System.out.println("Descrição: " + this.getDescricao() + " || Fabricante: " + this.getFabricante()
				+ " || Valor: " + this.getValor());
		System.out.println("Clock: " + clock + " || Modelo: " + modelo);
	}

}
