package br.com.angelotreptow.cofrinho.application;

import java.util.Scanner;

import br.com.angelotreptow.cofrinho.model.Cofrinho;
import br.com.angelotreptow.cofrinho.model.Moeda;
import br.com.angelotreptow.cofrinho.service.FabricaMoeda;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Cofrinho cofrinho = new Cofrinho();

		while (true) {
			try {

				System.out.println("+----------+");
				System.out.println("| Cofrinho |");
				System.out.println("+----------+");
				System.out.println("1 - Adicionar Moeda");
				System.out.println("2 - Remover Moeda");
				System.out.println("3 - Listar Moedas");
				System.out.println("4 - Calcular Total Convertido para Real");
				System.out.println("0 - Encerrar");

				int op = sc.nextInt();

				switch (op) {

				case 0:
					System.out.println("Sistema Finalizado com Sucesso!");
					sc.close();
					return;

				case 1:
					try {
					System.out.println("Escolha uma moeda:");
					System.out.println("1 - Real");
					System.out.println("2 - Dolar");
					System.out.println("3 - Euro");

					int moedaEscolhida = sc.nextInt();
					
					FabricaMoeda.validarMoeda(moedaEscolhida);

					System.out.println("Digite o valor:");
					double valorMoeda = sc.nextDouble();

					Moeda moeda = FabricaMoeda.criarMoeda(moedaEscolhida, valorMoeda);
					cofrinho.adicionar(moeda);

					System.out.println("Moeda adicionada!");
					
					 } catch (IllegalArgumentException e) {
					        System.out.println("Moeda inválida!");
					    }
					
					break;

				case 2:
					try {
					System.out.println("Escolha a moeda para remover:");
					System.out.println("1 - Real");
					System.out.println("2 - Dolar");
					System.out.println("3 - Euro");

					int moedaEscolhida = sc.nextInt();
					
					FabricaMoeda.validarMoeda(moedaEscolhida);

					System.out.println("Digite o valor:");
					double valorRemover = sc.nextDouble();

					Moeda moedaRemover = FabricaMoeda.criarMoeda(moedaEscolhida, valorRemover);

					cofrinho.remover(moedaRemover);

					System.out.println("Moeda removida!");
					
					 } catch (IllegalArgumentException e) {
						    System.out.println(e.getMessage());
					    }
					
					break;

				case 3:
					cofrinho.listagemMoedas();
					break;

				case 4:
					double total = cofrinho.totalConvertido();
					System.out.printf("Total em reais: R$ %.2f\n", total);
					break;

				default:
					System.out.println("Opção inválida!");
				}
			} catch (Exception e) {
				System.out.println("Entrada inválida! Digite apenas números.");
				sc.nextLine();
			}
		}
	}
}
