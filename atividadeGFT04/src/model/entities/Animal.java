package model.entities;

public abstract class Animal implements AcoesAnimais {
	
	private String classe;
	private String alimentacao;
	private String habitat;
	
	// -------------------------------------------------------------------------------------
	
	public Animal(String classe, String alimentacao, String habitat) {
		this.classe = classe;
		this.alimentacao = alimentacao;
		this.habitat = habitat;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getAlimentacao() {
		return alimentacao;
	}

	public void setAlimentacao(String alimentacao) {
		this.alimentacao = alimentacao;
	}
	
	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	@Override
	public String toString() {
		return "Classe: " + classe + " || Alimentacao: " + alimentacao;
	}
	
	
}
