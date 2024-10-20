package applications;

import entities.Pessoa;
import java.util.Scanner;

public class ProgramPessoas {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas serão informadas?");
		int n = sc.nextInt();

		Pessoa[] pessoas = new Pessoa[n];
		String[] nomesMenor16 = new String[n];
		int contMenor16 = 0;
		double somaAlturas = 0;

		for (int i = 0; i < n; i++) {
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.println("Nome:");
			String nome = sc.next();
			System.out.println("Idade:");
			int idade = sc.nextInt();
			System.out.println("Altura:");
			double altura = sc.nextDouble();

			pessoas[i] = new Pessoa(nome,idade,altura);
			
			somaAlturas += altura;
			
			if(idade < 16) {
				nomesMenor16[contMenor16] = nome;
				contMenor16 += 1;
			}
		}
		double mediaAltura = somaAlturas / n;
		
		double porcentagemMenor16 = (contMenor16 * 100) / n;
		System.out.println("Media de altura das pessoas: " + mediaAltura);
		System.out.println("Porcentagem de pessoas menores que 16 anos: " + porcentagemMenor16 + "%");
		
		for(int i = 0; i < contMenor16;i++) {
			System.out.println(nomesMenor16[i]);
			
			sc.close();
		}
	}
}
