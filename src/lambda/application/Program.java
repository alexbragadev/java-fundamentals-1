package lambda.application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import lambda.entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Product> list = new ArrayList<>();
		
		list.add(new Product("Smart Tv Lg '55'", 3.500));
		list.add(new Product("Iphone 14 128GB", 4.200));
		list.add(new Product("Notebook Acer Nitro 5", 3.800));
		
		// implementando a interface comparator implementado na classe MyComparator
		//list.sort(new MyComparator());
		// fazendo a mesma coisa acima mas com funções lambda
		list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
		
		for (Product p : list) {
			System.out.println(p);
		}
		
		// stream é uma sequecia de elementos advinda de alguma fonte
		// uso da função map aplica uma nova função a cada elemento da stream
		List<String> names = list.stream()
									.map(p -> p.getName().toLowerCase())
										.collect(Collectors.toList());

		names.forEach(System.out::println);
		
		// streams
		List<Integer> listN = Arrays.asList(3,4,5,10,7);
		
		Stream<Integer> st1 = listN.stream().map(x -> x * 10);
		System.out.println(Arrays.toString(st1.toArray()));
		
	}

}
