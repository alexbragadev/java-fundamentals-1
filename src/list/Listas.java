package list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();

		list.add("Nelson");
		list.add("Alex");
		list.add("Ana");
		list.add("Gilza");
		list.add("Alesson");
		list.add("Natanael");
		list.add("Angerleide");
		list.add("Natany");
		System.out.println(list.size());
		
		for (String pessoa : list) {
			System.out.println(pessoa);
		}
		
		list.add(1, "Roberto");
		
		System.out.println("--------------------------");
		
		for (String pessoa : list) {
			System.out.println(pessoa);
		}
		
		list.remove(1);
		System.out.println(list.size());
		
		list.remove("Alex");
		System.out.println(list.size());
		// predicados com operações lambda
		// deletando de acordo com a letra A
		System.out.println("--------------------------");
		list.removeIf(x -> x.charAt(0) == 'A');
		for (String pessoa : list) {
			System.out.println(pessoa);
		}
		System.out.println("--------------------------");
		// filtrando um lista com lambda e função stream().filter
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'N').collect(Collectors.toList());
		for (String pessoa : result) {
			System.out.println(pessoa);
		}
		// filtrando o primeiro elemento com N
		String name = list.stream().filter(x -> x.charAt(0) == 'N').findFirst().orElse(null);	
		System.out.println(name);
		
		System.out.println("Index of Natanael: " + list.indexOf("Natanael"));
		System.out.println("Index of Albert (usuário inexistente): " + list.indexOf("Albert"));
		
		
	}

}
