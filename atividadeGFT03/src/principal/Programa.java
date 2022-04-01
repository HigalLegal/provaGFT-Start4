package principal;

import java.text.ParseException;
import java.util.Scanner;

import model.entities.Pessoa;

public class Programa {
	
	public static void main(String[] args) throws ParseException {
		var scan = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String idade = scan.nextLine();
		
		System.out.print("Sexo: ");
		String sexo = scan.next();
		
		System.out.print("Data de nascimento (dd/MM/yyyy): ");
		String dataNascimento = scan.next();
		
		Pessoa pessoa = new Pessoa(idade, sexo, dataNascimento);
		
		System.out.println(pessoa);
		System.out.println("Anos restantes: " + pessoa.restanteDeVida());
		
		scan.close();
	}
	
}
