package model.factory;

import model.entities.Animal;
import model.entities.Ave;
import model.entities.Humano;
import model.entities.Leao;

public class AnimalFactory {
	
	public static Animal contaFactory(char especie, String classe, String alimentacao, String habitat) {
		
		if(especie == 'H' || especie == 'h') {
			return new Humano(classe, alimentacao, habitat);
		}
		
		else if(especie == 'L' || especie == 'l') {
			return new Leao(classe, alimentacao, habitat);
		}
		
		else if(especie == 'A' || especie == 'a') {
			return new Ave(classe, alimentacao, habitat);
		}
		
		return null;
	}
}
