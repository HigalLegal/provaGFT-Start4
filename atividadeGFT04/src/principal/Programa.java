package principal;

import model.entities.Animal;
import model.factory.AnimalFactory;

public class Programa {

	public static void main(String[] args) {
		
		System.out.println("HUMANO:");
		Animal animal = AnimalFactory.contaFactory('H', "mam�fero", "on�voro", "terrestre");
		System.out.println(animal);
		animal.alimentar();
		animal.locomover();
		
		System.out.println("LE�O:");
		animal = AnimalFactory.contaFactory('L', "mam�fero", "carn�voro", "terrestre");
		System.out.println(animal);
		animal.alimentar();
		animal.locomover();
		
		System.out.println("AVE:");
		animal = AnimalFactory.contaFactory('A', "mam�fero", "carn�voro", "terrestre");
		System.out.println(animal);
		animal.alimentar();
		animal.locomover();
		
	}

}
