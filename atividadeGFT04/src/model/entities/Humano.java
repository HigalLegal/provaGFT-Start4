package model.entities;

public class Humano extends Animal {

	public Humano(String classe, String alimentacao, String habitat) {
		super(classe, alimentacao, habitat);
	}

	@Override
	public void locomover() {
		System.out.println("ANDANDO SOB OS 2 PÉS");
	}

	@Override
	public void alimentar() {
		System.out.println("Tipo: " + this.getAlimentacao());
		
	}
	
}

