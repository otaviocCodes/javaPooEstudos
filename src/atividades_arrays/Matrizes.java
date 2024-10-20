package atividades_arrays;

import java.util.Scanner;

public class Matrizes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual vai ser a proporção da matriz?");
		int n = sc.nextInt();
		int[][] matriz = new int[n][n];
		System.out.println("Insira os números da matriz:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("Diagonal Princípal:");
		for (int i = 0; i < matriz.length; i++) {
			System.out.print(matriz[i][i] + " ");
		}
		System.out.println();

		int cont = 0;
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] < 0) {
					cont++;
				}
			}
		}
		System.out.println("Quantidade de números negativos: " + cont);
		sc.close();
	}

}