package br.com.magna.algoritmoCubo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculoDistancia {
	// PONTO A(x,y,z) = A(1,1,10)
	// PONTO A(x,y) = A(1,10)
	
	// PONTO B(x,y,z) = B(5,5,5)
	// PONTO B(x,y) = B(5,5)

	public static void distanciaCuboFechado() throws InterruptedException {
		
		System.out.println("""
				========================================================================================================
				 Primeiro vamos visualizar a equação de pitagoras que será utilizada:
                 
                 Sabendo que a diagonal de um quadrado é equivalente a (L/2)√2, temos:
                 
                 distanciaAB = hipotenusa
                 ComprimentoA = catetoA = 10 m
                 ComprimentoB = catetoB = 5√2 m
					
				 (distanciaAB)² = (comprimentoA)² + (comprimentoB)²
				 
				 (distanciaAB)²  =  10² + (5√2)²
				  
				  distanciaAB  =  √150

				""");
		
		double x = Math.sqrt(150);
		
		VisualizarCubo.imprimeExplicacaoDaEquacaoTridimensional();
		
		System.out.printf("O resultado é: %.2f%s%n", x, " m");
		
		System.out.println("========================================================================================================");
		Thread.sleep(3000);

		System.out.println("\nDeseja ver:\n\n1 - Ver a implementação do Exemplo 2 (Cubo Aberto)\n2 - Voltar para o menu");
		Scanner scan = new Scanner(System.in);
		boolean escolhaValida = false;

		do {
			try {
				int escolha = scan.nextInt();
				if (escolha == 1) {
					VisualizarCubo.imprimeCuboAberto();
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


	public static void distanciaCuboAberto() throws InterruptedException {
		
		double calculoCuboBidimensionalPitagorasAB = Math.sqrt((Math.pow((Cubo.getAz() + Cubo.getBz()), 2)) + (Math.pow(Cubo.getBz(), 2)));
		
		System.out.println("""
				========================================================================================================
				 Primeiro vamos visualizar a equação de pitagoras que será utilizada:
                 
                 distanciaAB = hipotenusa
                 ComprimentoA = catetoA = 15 m
                 ComprimentoB = catetoB = 5 m
					
				 (distanciaAB)² = (comprimentoA)² + (comprimentoB)²
				 
				 (distanciaAB)² = 15² + 5²
				 
				 distancia = √250

				""");
		
		VisualizarCubo.imprimeExplicacaoDaEquacaoBidimensional();
		
		System.out.printf("O resultado é: %.2f%s%n", calculoCuboBidimensionalPitagorasAB, " m");
		
		System.out.println("========================================================================================================");
 		
		
		Thread.sleep(3000);

		System.out.println("\nDeseja ver:\n\n1 - Ver a implementação do Exemplo 1 (Cubo Fechado)\n2 - Voltar para o menu");
		Scanner scan = new Scanner(System.in);
		boolean escolhaValida = false;

		do {
			try {
				int escolha = scan.nextInt();
				if (escolha == 1) {
					VisualizarCubo.imprimeCuboFechado();
					
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
}
