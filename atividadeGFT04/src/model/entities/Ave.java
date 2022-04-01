package model.entities;

public class Ave extends Animal {

	public Ave(String classe, String alimentacao, String habitat) {
		super(classe, alimentacao, habitat);
	}

	@Override
	public void locomover() {
		System.out.println("VOANDO");
	}

	@Override
	public void alimentar() {
		System.out.println("Tipo: " + this.getAlimentacao());
		
	}
	
}
