package br.com.magna.algoritmoCubo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DocumentoAlgoritmo {
	
	public static void descricao() throws InterruptedException {

		try (BufferedReader br = new BufferedReader(
				new FileReader("/dev/workspace/eclipse/AlgoritmoCubo/src/br/com/magna/algoritmoCubo/descricao"))) {
			String linha;
			while ((linha = br.readLine()) != null) {
				System.out.println(linha);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("\n");

		Scanner scan = new Scanner(System.in);
		boolean escolhaValida = false;

		do {
			try {
				int escolha = scan.nextInt();
				if (escolha == 1) {
					VisualizarCubo.imprimeCuboFechado();
				} else if (escolha == 2) {
					VisualizarCubo.imprimeCuboAberto();
				} else if (escolha == 3) {
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
}

