package lambda.application;

import java.util.ArrayList;
import java.util.List;

import lambda.entities.Product;

public class Program {

	public static void main(String[] args) {
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
	}

}
