package atividades_arrays;

import java.util.Locale;
import java.util.Scanner;
import entities.Rent;

public class QuartosAlugados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rent[] vetor = new Rent[10];
		System.out.println("Quantos quartos serão alugados?");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Rent #" + i + ":");
			System.out.println("Nome:");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Email:");
			String email = sc.next();
		
			int numQuarto;
			boolean quartoDisponivel;
			do {
			System.out.println("Quarto(1 a 10):");
			numQuarto = sc.nextInt();
			quartoDisponivel = (numQuarto >= 0 && numQuarto <=10 && vetor[numQuarto] == null);
			if(!quartoDisponivel) {
				System.out.println("Este quarto não está mais disponível...");
				}
			}
			while(!quartoDisponivel);
			
			vetor[numQuarto] = new Rent(nome, email);
		}
		System.out.println("\nQuartos ocupados:");
		for(int i = 0; i < 10; i++) {
			if (vetor[i] != null) {
				System.out.println(i + ": " + vetor[i]);
			}
		}
		sc.close();
	}

}
