package principal;

import model.entities.Animal;
import model.factory.AnimalFactory;

public class Programa {

	public static void main(String[] args) {
		
		System.out.println("HUMANO:");
		Animal animal = AnimalFactory.contaFactory('H', "mamífero", "onívoro", "terrestre");
		System.out.println(animal);
		animal.alimentar();
		animal.locomover();
		
		System.out.println("LEÃO:");
		animal = AnimalFactory.contaFactory('L', "mamífero", "carnívoro", "terrestre");
		System.out.println(animal);
		animal.alimentar();
		animal.locomover();
		
		System.out.println("AVE:");
		animal = AnimalFactory.contaFactory('A', "mamífero", "carnívoro", "terrestre");
		System.out.println(animal);
		animal.alimentar();
		animal.locomover();
		
	}

}
