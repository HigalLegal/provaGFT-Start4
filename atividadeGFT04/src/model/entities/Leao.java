package model.entities;

public class Leao extends Animal {

	public Leao(String classe, String alimentacao, String habitat) {
		super(classe, alimentacao, habitat);
	}

	@Override
	public void locomover() {
		System.out.println("ANDANDO SOB 4 PATAS");
	}

	@Override
	public void alimentar() {
		System.out.println("Tipo: " + this.getAlimentacao());
		
	}
	
}

