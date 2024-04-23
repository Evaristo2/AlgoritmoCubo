package br.com.magna.algoritmoCubo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class VisualizarCubo {

	public static void opcaoDeCubo() throws InterruptedException {
		Scanner scan = new Scanner(System.in);
		System.out.println("""
				============================================================
				  
				  Bem vindo(a) ao algoritmo do cubo
				  
				  O que deseja?
				 	
				1 - Entender o algoritmo do cubo
				2 - Ver o algoritmo implementado em um cubo fechado
				3 - Ver o algoritmo implementado em um cubo aberto
				4 - Fechar apresentação do algoritmo
				
				 Aconselho entender quais os objetivos (opção 1)
				============================================================
				""");
		

		boolean escolhaValida = false;
		
		do {
			try {
				int escolha = scan.nextInt();
				if (escolha == 1) {
					DocumentoAlgoritmo.descricao();
				} else if (escolha == 2) {
					imprimeCuboFechado();
				} else if (escolha == 3) {
					imprimeCuboAberto();
				} else if( escolha ==4){
					System.exit(0);
				}else {
					System.out.println("Número inválido. Digite novamente:");
				}
					opcaoDeCubo();

			} catch (InputMismatchException e) {
				System.out.println("Apenas números! Digite novamente, por favor.");
				scan.nextLine();
			}
		} while (!escolhaValida);

	}
	
	
	
	
	
	public static void imprimeCuboFechado() throws InterruptedException {
		try (BufferedReader br = new BufferedReader(
				new FileReader("/dev/workspace/eclipse/AlgoritmoCubo/src/br/com/magna/algoritmoCubo/cuboFechado"))) {
			String linha;
			while ((linha = br.readLine()) != null) {
				System.out.println(linha);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\n");

		Thread.sleep(3000);

		System.out.println("\nDeseja ver:\n\n1 - Ver os calculos\n2 - Voltar para o menu");
		Scanner scan = new Scanner(System.in);
		
		boolean escolhaValida = false;

		do {
			try {
				int escolha = scan.nextInt();
				if (escolha == 1) {
					CalculoDistancia.distanciaCuboFechado();
				} else if (escolha == 2) {
					VisualizarCubo.opcaoDeCubo();
				} else {
					System.out.println("Número inválido. Digite novamente");
				}
			} catch (InputMismatchException e) {
				System.out.println("Apenas números! Digite novamente, por favor.");
				scan.nextLine();
			}
		} while (!escolhaValida);
	}
	
	public static void imprimeCuboAberto() throws InterruptedException {
		try (BufferedReader br = new BufferedReader(
				new FileReader("/dev/workspace/eclipse/AlgoritmoCubo/src/br/com/magna/algoritmoCubo/cuboAberto"))) {
			String linha;
			while ((linha = br.readLine()) != null) {
				System.out.println(linha);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\n");

		Thread.sleep(3000);

		System.out.println("\nDeseja ver:\n\n1 - Ver os cálculos\n2 - Voltar para o menu");
		Scanner scan = new Scanner(System.in);
		
		boolean escolhaValida = false;
		
		do {
			try {
				int escolha = scan.nextInt();
				if (escolha == 1) {
					CalculoDistancia.distanciaCuboAberto();
				} else if (escolha == 2) {
					VisualizarCubo.opcaoDeCubo();
				} else {
					System.out.println("Número Inválido. Digite novamente");
				}
			} catch (InputMismatchException e) {
				System.out.println("Apenas números! Digite novamente, por favor.");
				scan.nextLine();
			}
		} while (!escolhaValida);
	}





	public static void imprimeExplicacaoDaEquacaoTridimensional() {
		try (BufferedReader br = new BufferedReader(
				new FileReader("/dev/workspace/eclipse/AlgoritmoCubo/src/br/com/magna/algoritmoCubo/explicacaoPitagorasTridimensional"))) {
			String linha;
			while ((linha = br.readLine()) != null) {
				System.out.println(linha);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}





	public static void imprimeExplicacaoDaEquacaoBidimensional() {
		try (BufferedReader br = new BufferedReader(
				new FileReader("/dev/workspace/eclipse/AlgoritmoCubo/src/br/com/magna/algoritmoCubo/explicacaoPitagorasBidimensional"))) {
			String linha;
			while ((linha = br.readLine()) != null) {
				System.out.println(linha);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}		
	}		
}
