package principal;

import java.math.BigDecimal;
import java.util.Scanner;

import model.entities.CPU;
import model.entities.DiscoRigido;
import model.entities.Hardware;
import model.entities.Memoria;
import model.exceptions.NumeroNegativoException;

public class Programa {

	public static void main(String[] args) {

		var scan = new Scanner(System.in);

		try {
			Hardware equipamento;

			System.out.print("Digite o id para a CPU: ");
			long id = scan.nextLong();

			System.out.print("Descrição: ");
			scan.nextLine();
			String descricao = scan.nextLine();

			System.out.print("Valor: ");
			BigDecimal valor = new BigDecimal(scan.next());

			System.out.print("Fabricante: ");
			scan.nextLine();
			String fabricante = scan.nextLine();

			System.out.print("Clock: ");
			double clock = scan.nextDouble();

			System.out.print("Modelo: ");
			String modelo = scan.nextLine();

			equipamento = new CPU(id, descricao, valor, fabricante, clock, modelo);

			System.out.println(equipamento);
			equipamento.getDetalhesHardware();

			// -------------------------------------------------------------------------------------

			System.out.println();

			System.out.print("Digite o id para a memória: ");
			id = scan.nextLong();

			System.out.print("Descrição: ");
			scan.nextLine();
			descricao = scan.nextLine();

			System.out.print("Valor: ");
			valor = new BigDecimal(scan.next());

			System.out.print("Fabricante: ");
			scan.nextLine();
			fabricante = scan.nextLine();

			System.out.print("Frequencia: ");
			int frequencia = scan.nextInt();

			System.out.print("Capacidade: ");
			int capacidade = scan.nextInt();

			System.out.print("TIPO: ");
			String tipo = scan.next();

			equipamento = new Memoria(id, descricao, valor, fabricante, frequencia, capacidade, tipo);

			System.out.println(equipamento);
			equipamento.getDetalhesHardware();

			// -------------------------------------------------------------------------------------

			System.out.println();

			System.out.print("Digite o id para o dísco rígido: ");
			id = scan.nextLong();

			System.out.print("Descrição: ");
			scan.nextLine();
			descricao = scan.nextLine();

			System.out.print("Valor: ");
			valor = new BigDecimal(scan.next());

			System.out.print("Fabricante: ");
			scan.nextLine();
			fabricante = scan.nextLine();
			
			System.out.print("Capacidade: ");
			capacidade = scan.nextInt();
			
			System.out.print("Velocidade: ");
			int velocidade = scan.nextInt();
			
			System.out.print("TIPO: ");
			tipo = scan.next();
			
			equipamento = new DiscoRigido(id, descricao, valor, fabricante, capacidade, velocidade, tipo);
			
			System.out.println(equipamento);
			equipamento.getDetalhesHardware();
		} catch(NumeroNegativoException e) {
			throw new NumeroNegativoException("Parâmetro inválido.");
		} finally {
			scan.close();
		}

	}

}
