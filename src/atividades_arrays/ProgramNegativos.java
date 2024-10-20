package atividades_arrays;

import java.util.Scanner;

public class ProgramNegativos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números você irá digitar?");
		int n = sc.nextInt();

		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Digite um número:");
			num[i] = sc.nextInt();

		}
		System.out.println("Números negativos digitados:");

		for (int i = 0; i < n; i++) {
			if (num[i] < 0) {
				System.out.println(num[i]);
			}
		}
		sc.close();
	}
}
