package atividades_arrays;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int qnt;

		System.out.println("Quntas pessoas serão digitadas?");
		qnt = sc.nextInt();

		String[] nomes = new String[qnt];
		double[] alturas = new double[qnt];
		int[] idades = new int[qnt];
		double soma = 0;
		for (int i = 0; i < qnt; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessa:");

			System.out.println("Nome: ");
			nomes[i] = sc.next();

			System.out.println("Idade: ");
			idades[i] = sc.nextInt();

			System.out.println("Altura: ");
			alturas[i] = sc.nextDouble();
			soma += alturas[i];

		}

		double alturaMedia = soma / qnt;
		System.out.println("Altura media das " + qnt + " pessoas: " + alturaMedia);

		int menoresDe16 = 0;
		int porcentagemMenores16 = 0;

		for (int i = 0; i < qnt; i++) {
			if (idades[i] < 16) {
				menoresDe16 += 1;
				porcentagemMenores16 = menoresDe16 / qnt * 100;
			}
		}
		System.out.println("Pessoas com menos de 16 anos: " + porcentagemMenores16 + "%");
		for (int i = 0; i < qnt; i++) {
			if (idades[i] < 16) {
				System.out.println(nomes[i]);
			}
		}	
		sc.close();
	}
}
