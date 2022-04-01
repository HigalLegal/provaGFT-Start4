package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Programa {

	public static void main(String[] args) {
		
		var scan = new Scanner(System.in);
		
		int pares = 0;
		int impares = 0;
		//int repetidos = 0;
		
		System.out.println("Digite quandos números terá: ");
		int tamanho = scan.nextInt();
		
		List<Integer> valores = new ArrayList<>();
		//List<Integer> valoresRepetidos= new ArrayList<>();
		
		for(int i = 0; i < tamanho; i++) {
			System.out.print("Valor " + (i+1) + ": ");
			valores.add(scan.nextInt());
		}
		
		//valores.sort((n1, n2) -> n2.compareTo(n1));
		
		//int primeiroElemento = valores.get(0);
		
		for(int valor : valores) {
			
			if(valor % 2 == 0) {
				pares++;
			}
			
			if(valor % 2 != 0) {
				impares++;
			}
			
			/*if(primeiroElemento == valor) {
				valoresRepetidos.add(valor);
				repetidos++;
			}*/
			
		}
		
		System.out.println("Pares: " + pares);
		System.out.println("Impares: " + impares);
		//System.out.println("Repetidos: " + repetidos);
		//System.out.println("VALORES QUE SE REPETEM: " + valoresRepetidos.toString());
		
		scan.close();
		
	}

}
