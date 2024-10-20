package applications;

import entities.Conta;
import java.util.Scanner;

public class ProgramaConta {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Conta conta;
		System.out.println("Cadastro de conta:\nInsira o nome de usuário da conta:");
		String nome = sc.next();
		System.out.println("Insira o número da conta:");
		int numConta = sc.nextInt();
		System.out.println("Deseja fazer um depósito inicial na sua nova conta?(Y ou N)");
		char resposta = sc.next().charAt(0);

		if (resposta == 'y' || resposta == 'Y') {
			System.out.println("Digite o valor do depósito inicial:");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numConta, nome, depositoInicial);
		} else {
			conta = new Conta(numConta, nome);
		}

		System.out.println(conta);

		int opcao = 1;

		while (opcao == 1 || opcao == 2) {
			System.out.println("Digite 1 para Depositar\nDigite 2 para Sacar\nou\nDigite 0 para Sair");
			opcao = sc.nextInt();
			if (opcao == 1) {
				System.out.println("Insira uma quantia para depositar:");
				double valor = sc.nextDouble();
				conta.depositar(valor);
				System.out.println(conta);
			}
			if (opcao == 2) {
				System.out.println("Insira uma quantia para sacar:");
				double valor = sc.nextDouble();
				if (valor > conta.getSaldo()) {
					System.out.println("O saldo da sua conta não possui essa quantia para saque");
					System.out.println(conta);
				} else {
					conta.sacar(valor);
					System.out.println(conta);
				}
				if (opcao == 0) {
					System.out.println(conta);
					break;

				}
			}
		}
		sc.close();
	}
}