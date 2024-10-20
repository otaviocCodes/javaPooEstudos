package atividades_arrays;

import java.util.Scanner;

public class MatrizCoordenadas {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Insira o número de linhas da matriz:");
		int m = sc.nextInt();
		System.out.println("Insira o número de colunas da matriz:");
		int n = sc.nextInt();

		int[][] matriz = new int[m][n];

		System.out.println("Insira os números da matriz:");
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		System.out.println("Insira um número que deseja verificar:");
		int x = sc.nextInt();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == x) {
					System.out.println("\nPosition " + i + "," + j);
				}
				if (matriz[i][j] == x && j > 0) {
					System.out.println("Left: " + matriz[i][j - 1]);
				}
				if (matriz[i][j] == x && j < n - 1) {
					System.out.println("Right: " + matriz[i][j + 1]);
				}
				if (matriz[i][j] == x && i > 0) {
					System.out.println("Up: " + matriz[i - 1][j]);
				}
				if (matriz[i][j] == x && i < m - 1) {
					System.out.println("Down: " + matriz[i + 1][j]);
				}
		
			}
		}
		sc.close();
	}
}