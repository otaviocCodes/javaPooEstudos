package applications;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Pedro");
		list.add("João");
		list.add("Ariel");
		
		System.out.println(list.size());

		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------------");
		
		//remove qualquer nome com inicial M
		list.removeIf(f -> f.charAt(0) == 'M');
		for (String x : list) {
			System.out.println(x);
		}
	
		System.out.println("-----------------------------");
		
		//indexOf para acessar posiçao na lista
		System.out.println("Posição do João: " + list.indexOf("João"));
		System.out.println("Posição do Mariano: " + list.indexOf("Mariano"));

		System.out.println("-----------------------------");
		
		//filtra para aparecer apenas nomes com a letra 'A' no inicio
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-----------------------------");
		
		//achou o primeiro nome que começa com 'A'
		String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
		System.out.println(name);
	}
}
