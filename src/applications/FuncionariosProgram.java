package applications;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class FuncionariosProgram {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Funcionario> list = new ArrayList<>();

		System.out.println("Quantos funcionários vão ser registrados?");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Funcionário #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			while (hasId(list, id)) {
				System.out.println("Essa id ja foi adicionada! Tente outra vez");
				id = sc.nextInt();
			}
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Salário: ");
			double salario = sc.nextDouble();

			Funcionario func = new Funcionario(name, id, salario);

			list.add(func);

		}
		System.out.println();
		System.out.println("Insira a id do funcionario que vai receber um aumento");
		int idSalario = sc.nextInt();

		// procura a id
		Funcionario func = list.stream().filter(x -> x.getId() == idSalario).findFirst().orElse(null);

		// Também pode ser assim:
		// Integer pos = posicao(list, idSalario);

		// se a id for nula, a mensagem é emitida
		if (func == null) {
			System.out.println("Esse id não existe!");
		} else {
			System.out.println("Insira uma porcentagem de aumento: ");
			double porcentagem = sc.nextInt();
			func.aumentarSalario(porcentagem);
		}
		System.out.println();
		System.out.println("Lista de funcionários:");
		for (Funcionario f : list) {
			System.out.println(f);
		}

		sc.close();

	}

	public static Integer posicao(List<Funcionario> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

	public static boolean hasId(List<Funcionario> list, int id) {
		Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return func != null;
	}

}
